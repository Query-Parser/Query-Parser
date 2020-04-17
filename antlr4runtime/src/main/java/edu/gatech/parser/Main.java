package edu.gatech.parser;

import com.mongodb.*;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.*;
import org.bson.Document;

import java.math.BigDecimal;
import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import static edu.gatech.parser.MySQLQueryParser.*;

public class Main {
    private static MongoDatabase db = dbConfig();
    public static void main(String[] args) {
        String query = "select C._id as ci, E._id as ei from Customers C, Employees E limit 5;"; // TODO: replace by args later
        if (args != null && args.length != 0) {
            query = args[0];
        }
        MySQLQueryLexer lexer = new MySQLQueryLexer(CharStreams.fromString(query));
        MySQLQueryParser parser = new MySQLQueryParser(new BufferedTokenStream(lexer));
        MySQLQueryBaseListener listener = new MySQLQueryBaseListener() {
            private int level;
            boolean isAll = false; // might be wrong when there's nested query
            boolean isSelect = false;
            boolean isDistinct = false;
            int limit = Integer.MAX_VALUE;
            Map<List<String>, List<String>> columnToAlias = new HashMap<>();
            Map<Func, List<List<String>>> functionToColumn = new HashMap<>();
            Map<String, MongoCollection<Document>> tableToCollection = new HashMap<>(); // hashmap of tableName and collection of the same name in mongo
            Map<String, String> tableToAlias = new HashMap<>();
            Map<String, String> aliasToTable = new HashMap<>();
            ObjectMapper mapper = new ObjectMapper();
            Stack<Object> stack = new Stack<>();
            Predicate<Map<String, Object>> queryFilter = null;
            Function<Map<String, Object>, Map<List<Object>, List<Map<String, Object>>>> groupByFunc = null;

            @Override
            public void exitQuery(QueryContext ctx) {
                Map<String, List<Document>> result = new HashMap<>();
                for (Map.Entry<String, MongoCollection<Document>> entry: tableToCollection.entrySet()) {
                    Set<String> distinctDocuments = new HashSet<>();
                    int count = 0;
                    for (Document document : entry.getValue().find()) {
                        if (count >= limit) {
                            break;
                        }
                        count++;
                        if (queryFilter == null || queryFilter.test(document)) {
                            List<Document> docs = result.getOrDefault(entry.getKey(), new ArrayList<>());
                            if (isAll) {
                                docs.add(document);
                                result.put(entry.getKey(), docs);
                            } else {
                                List<String> removeKeys = new ArrayList<>();
                                for (String property: document.keySet()) {
                                    Set<List<String>> selectedColumnTables = columnToAlias.keySet();
                                    for (List<String> columnTable : selectedColumnTables) {
                                        if (!property.equals(columnTable.get(0))) {
                                            if (columnTable.get(1) != null && !entry.getKey().equals(columnTable.get(1))) {
                                                removeKeys.add(property);
                                            } else if(columnTable.get(1) == null) {
                                                removeKeys.add(property);
                                            }
                                        }
                                    }
                                }
                                removeKeys.forEach(document::remove);
                            }
                            applyColumnAlias(document, entry.getKey());
                            if (isDistinct) {
                                // apply distinct filter
                                if (!distinctDocuments.contains(document.toJson())) {
                                    distinctDocuments.add(document.toJson());
                                    // update result
                                    if (!document.keySet().isEmpty()) {
                                        docs.add(document);
                                        result.put(entry.getKey(), docs);
                                    }
                                }
                            } else {
                                if (!document.keySet().isEmpty()) {
                                    docs.add(document);
                                    result.put(entry.getKey(), docs);
                                }
                            }
                        }
                    }
                }
                String jsonOutput = null;
                try {
                    jsonOutput = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(result);
                } catch (JsonProcessingException e) {
                    e.printStackTrace();
                }
                System.out.println(jsonOutput);
            }

            private void applyColumnAlias(Document document, String tableName) {
                Map<String, String> updatedKeys = new HashMap<>();
                for (String property: document.keySet()) {
                    List<String> columnTable = new ArrayList<>();
                    columnTable.add(property);
                    columnTable.add(null);
                    if (columnToAlias.containsKey(List.of(property, tableName))) {
                        columnTable = List.of(property, tableName);
                    }
                    String alias = columnToAlias.get(columnTable).get(0);
                    String func = columnToAlias.get(columnTable).get(1);
                    if (func == null && alias != null) {
                        updatedKeys.put(property, alias);
                    }
                }
                updatedKeys.keySet().forEach(key -> {
                    document.put(updatedKeys.get(key), document.get(key));
                    document.remove(key);
                });
            }

            @Override
            public void enterSelectStatement(SelectStatementContext ctx) {
                isSelect = true;
            }

            @Override
            public void enterSelectItemList(SelectItemListContext ctx) {
                if (isSelect) {
                    isAll = ctx.MULT_OPERATOR() != null;
                }
            }

            @Override
            public void enterSelectItem(SelectItemContext ctx) {
                // table.column alias
                ColumnItemContext context = null;
                Func func = null;
                if (ctx.columnItem() != null) {
                    context = ctx.columnItem();
                } else if(ctx.countClause() != null) {
                    context = ctx.countClause().columnItem();
                    func = Func.COUNT;
                } else if(ctx.sumClause() != null) {
                    context = ctx.sumClause().columnItem();
                    func = Func.SUM;
                } else if(ctx.avgClause() != null) {
                    context = ctx.avgClause().columnItem();
                    func = Func.AVERAGE;
                } else if(ctx.minClause() != null) {
                    context = ctx.minClause().columnItem();
                    func = Func.MIN;
                } else if(ctx.maxClause() != null) {
                    context = ctx.maxClause().columnItem();
                    func = Func.MAX;
                } else {
                    System.out.println("CANNOT FIND SELECTED COLUMN");
                }


                if (context != null) {
                    String selectedColumn = context.columnName().WORD().getText();
                    String tableName = null;
                    String alias = null;
                    String function = func != null ? func.name() : null;
                    List<String> columnTable = new ArrayList<>();

                    List<String> mapTableAliasFunc = new ArrayList<>();

                    if (selectedColumn.contains(".")) {
                        int dot = selectedColumn.indexOf('.');
                        tableName = selectedColumn.substring(0, dot);
                        selectedColumn = selectedColumn.substring(dot+1);
                    }

                    if (context.selectAlias() != null) {
                        alias = context.selectAlias().alias().getText();
                    } else if (context.alias() != null) {
                        alias = context.alias().getText();
                    }

                    columnTable.add(selectedColumn);
                    columnTable.add(tableName);
                    mapTableAliasFunc.add(alias);
                    mapTableAliasFunc.add(function);

                    columnToAlias.put(columnTable, mapTableAliasFunc);

                    if (func != null) {
                        List<List<String>> mapFuncToCol = functionToColumn.getOrDefault(func, new ArrayList<>());
                        mapFuncToCol.add(columnTable);
                        functionToColumn.put(func, mapFuncToCol);
                    }
                }
            }

            @Override
            public void enterCountClause(CountClauseContext ctx) {

            }

            @Override
            public void enterDistinctClause(DistinctClauseContext ctx) {
                if (ctx != null && ctx.DISTINCT_SYMBOL() != null) {
                    isDistinct = true;
                }
            }

            @Override
            public void enterTableItem(TableItemContext ctx) {
                if (ctx.selectAlias() != null) {
                    tableToAlias.put(ctx.tableName().getText(), ctx.selectAlias().alias().getText());
                    aliasToTable.put(ctx.selectAlias().alias().getText(), ctx.tableName().getText());
                } else if (ctx.alias() != null) {
                    tableToAlias.put(ctx.tableName().getText(), ctx.alias().getText());
                    aliasToTable.put(ctx.alias().getText(), ctx.tableName().getText());
                }
            }

            @Override
            public void exitTableName(TableNameContext ctx) {
                String tableName = ctx.getText();
                MongoCollection<Document> collection = db.getCollection(tableName);
                if (tableToAlias.containsKey(tableName)) {
                    tableName = tableToAlias.get(tableName);
                }
                tableToCollection.put(tableName, collection);
            }

            @Override
            public void exitWhereClause(WhereClauseContext ctx) {
                Predicate<Map<String, Object>> filters = (Predicate<Map<String, Object>>) stack.pop();
                queryFilter = filters;
            }

            private Object toJavaObject(ValueNameContext ctx) {
                if (ctx.NUMBER() != null) {
                    BigDecimal number = new BigDecimal(ctx.NUMBER().getSymbol().getText());
                    if (ctx.ARITHMETIC() != null) {
                        if (ctx.ARITHMETIC().getSymbol().getText().charAt(0) == '-') {
                            number = number.negate();
                        }
                    }
                    return number;
                } else if (ctx.SQ_TEXT() != null) {
                    String text = ctx.SQ_TEXT().getSymbol().getText();
                    return text.substring(1, text.length() - 1);
                } else if (ctx.DQ_TEXT() != null) {
                    String text = ctx.DQ_TEXT().getSymbol().getText();
                    return text.substring(1, text.length() - 1);
                } else {
                    throw new RuntimeException("Invalid valueName " + ctx.getText());
                }
            }

            private boolean isTruthy(Object obj) {
                return !obj.equals("") && !obj.equals(0);
            }

            @Override
            public void exitCondition(ConditionContext ctx) {
                Predicate<Map<String, Object>> combined = (Predicate<Map<String, Object>>) stack.pop();
                if (ctx.OR_SYMBOL() != null) {
                    combined = combined.or((Predicate<Map<String, Object>>) stack.pop());
                }

                stack.push(combined);
            }

            @Override
            public void exitConditionInner(ConditionInnerContext ctx) {
                if (ctx.columnItem().isEmpty()) return;
                final String column = ctx.columnItem().get(0).columnName().WORD().getSymbol().getText();
                Predicate<Map<String, Object>> andPredicate = null;
                if (ctx.AND_SYMBOL() != null) {
                    andPredicate = (Predicate<Map<String, Object>>) stack.pop();
                }
                final Predicate<Map<String, Object>> finalAnd = andPredicate;
                if (ctx.compOp() == null) {
                    stack.push((Predicate<Map<String, Object>>) (Map<String, Object> doc) -> isTruthy(doc.get(column)) && (finalAnd == null || finalAnd.test(doc)));
                } else {
                    final Object operand = toJavaObject(ctx.valueName());
                    Predicate<Map<String, Object>> predicate;
                    switch (ctx.compOp().getText()) {
                        case "=":
                            predicate = (doc -> doc.get(column) != null && doc.get(column).equals(operand) && (finalAnd == null || finalAnd.test(doc)));
                            break;
                        case "<>":
                        case "!=":
                            predicate = (doc -> doc.get(column) != null && !doc.get(column).equals(operand) && (finalAnd == null || finalAnd.test(doc)));
                            break;
                        case "<":
                            predicate = (doc -> doc.get(column) != null && ((BigDecimal)doc.get(column)).compareTo((BigDecimal)operand) < 0);
                            break;
                        case "<=":
                            predicate = (doc -> doc.get(column) != null && ((BigDecimal)doc.get(column)).compareTo((BigDecimal)operand) <= 0);
                            break;
                        case ">":
                            predicate = (doc -> doc.get(column) != null && ((BigDecimal)doc.get(column)).compareTo((BigDecimal)operand) > 0);
                            break;
                        case ">=":
                            predicate = (doc -> doc.get(column) != null && ((BigDecimal)doc.get(column)).compareTo((BigDecimal)operand) >= 0);
                            break;
                        default:
                            throw new RuntimeException("Unexpected operator " + ctx.compOp());
                    }
                    stack.push(predicate);
                }
            }

            @Override
            public void exitGroupByClause(GroupByClauseContext ctx) {
                List<String> columns = ctx.columnItem().stream().map((x) -> x.columnName().WORD().getSymbol().getText()).collect(Collectors.toList());

                groupByFunc = (doc) -> {
                    if (columns.stream().anyMatch((col) -> !doc.containsKey(col))) {
                        return new HashMap<>();
                    } else {
                        List<Object> group = columns.stream().map(doc::get).collect(Collectors.toList());
                        Map<List<Object>, List<Map<String, Object>>> groupedDoc = new HashMap<>();
                        groupedDoc.put(group, Collections.singletonList(doc));
                        return groupedDoc;
                    }
                };
            }

            @Override
            public void enterLimitClause(LimitClauseContext ctx) {
                if (ctx.LIMIT_SYMBOL() != null) {
                    limit = Integer.parseInt(ctx.NUMBER().getText());
                }
            }

            @Override
            public void enterEveryRule(ParserRuleContext ctx) {
                System.out.println("|  ".repeat(level++) + "Entering " + ctx.getClass().getSimpleName());
            }

            @Override
            public void exitEveryRule(ParserRuleContext ctx) {
                System.out.println("|  ".repeat(--level) + "Exiting " + ctx.getClass().getSimpleName());
            }
        };
        ParseTreeWalker.DEFAULT.walk(listener, parser.query());
    }

    private static MongoDatabase dbConfig() {
        MongoDatabase db = null;
        MongoClientOptions.Builder option = MongoClientOptions.builder().serverSelectionTimeout(3600);
        MongoCredential credential = MongoCredential.createCredential("root", "admin", "example".toCharArray());
        MongoClient mongoClient = new MongoClient(new ServerAddress("timbess.net", 9200), credential, option.build());
        db = mongoClient.getDatabase("test");

        return db;
    }
}