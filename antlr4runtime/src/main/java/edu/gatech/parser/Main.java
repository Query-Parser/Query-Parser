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
import java.util.function.Predicate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import static edu.gatech.parser.MySQLQueryParser.*;

public class Main {
    private static MongoDatabase db = dbConfig();

    public static void main(String[] args) {
        String query = "select CustomerName, LastName from Customers, Employees limit 5;"; // TODO: replace by args later
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
            Map<String, List<String>> columnToAlias = new HashMap<>();
            Map<String, MongoCollection<Document>> tableToCollection = new HashMap<>(); // hashmap of tableName and collection of the same name in mongo
            Map<String, String> tableAlias = new HashMap<>();
            ObjectMapper mapper = new ObjectMapper();
            Stack<Object> stack = new Stack<>();
            Predicate<Map<String, Object>> queryFilter = null;

            @Override
            public void exitQuery(QueryContext ctx) {
                System.out.println(tableAlias);
                Map<String, List<Document>> result = new HashMap<>();
                for (Map.Entry<String, MongoCollection<Document>> entry: tableToCollection.entrySet()) {
                    List<String> distinctDocuments = new ArrayList<>();
                    int count = 0;
                    for (Document document : entry.getValue().find()) {
                        if (count >= limit) {
                            break;
                        }
                        count++;
                        // update the current key to alias before applying query filter
                        List<String> aliases = new ArrayList<>();
                        applyColumnAlias(entry, document, aliases);
                        if (queryFilter == null || queryFilter.test(document)) {
                            List<Document> docs = result.getOrDefault(entry.getKey(), new ArrayList<>());

                            if (isAll) {
                                docs.add(document);
                                result.put(entry.getKey(), docs);
                            } else {
                                List<String> removedKeys = new ArrayList<>();
                                for (String property : document.keySet()) {
                                    if (!columnToAlias.containsKey(property) && !aliases.contains(property)) {
                                        removedKeys.add(property);
                                    }
                                    if (columnToAlias.containsKey(property)) {
                                        if (!columnToAlias.get(property).isEmpty()) {
                                            String tableName = columnToAlias.get(property).get(0);
                                            if (tableName != null && !tableName.equals(entry.getKey())) {
                                                removedKeys.add(property);
                                            }
                                        }
                                    }
                                }
                                removedKeys.forEach(document::remove);
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
                }

                applyTableAlias(result);
                String jsonOutput = null;
                try {
                    jsonOutput = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(result);
                } catch (JsonProcessingException e) {
                    e.printStackTrace();
                }
                System.out.println(jsonOutput);
            }

            private void applyTableAlias(Map<String, List<Document>> result) {
                List<String> updatedTableNames = new ArrayList<>();
                for (String tableName: result.keySet()) {
                    if (!tableAlias.isEmpty() && tableAlias.containsKey(tableName)) {
                        updatedTableNames.add(tableName);
                    }
                }
                for (String tableName : updatedTableNames) {
                    result.put(tableAlias.get(tableName), result.get(tableName));
                    result.remove(tableName);
                }
            }

            private void applyColumnAlias(Map.Entry<String, MongoCollection<Document>> entry, Document document, List<String> aliases) {
                List<String> updatedKeys = new ArrayList<>();
                for (String property: document.keySet()) {
                    if (columnToAlias.get(property) != null) {
                        String tableName = columnToAlias.get(property).get(0);
                        String columnAlias = columnToAlias.get(property).get(1);
                        if (columnAlias != null && !document.containsKey(columnAlias)) {
                            if (tableName != null) {
                                if (tableName.equals(entry.getKey())) {
                                    updatedKeys.add(property);
                                    aliases.add(columnAlias);
                                }
                            } else {
                                updatedKeys.add(property);
                                aliases.add(columnAlias);
                            }
                        }
                    }
                }
                updatedKeys.forEach(key -> document.put(columnToAlias.get(key).get(1), document.get(key)));
                updatedKeys.forEach(document::remove);
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
                String selectedItem = ctx.columnItem().columnName().WORD().getText();
                List<String> tableAndAlias = new ArrayList<>();
                String alias = null;
                if (selectedItem.contains(".")) {
                    int dot = selectedItem.indexOf('.');
                    tableAndAlias.add(selectedItem.substring(0, dot));
                    selectedItem = selectedItem.substring(dot+1);
                } else {
                    tableAndAlias.add(null);
                }

                if (ctx.columnItem().selectAlias() != null) {
                    alias = ctx.columnItem().selectAlias().alias().getText();
                    tableAndAlias.add(alias);
                } else {
                    tableAndAlias.add(null);
                }
                columnToAlias.put(selectedItem, tableAndAlias);
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
                    tableAlias.put(ctx.tableName().getText(), ctx.selectAlias().alias().getText());
                }
            }

            @Override // check if the table exist in mongo
            public void exitTableName(TableNameContext ctx) {
                String tableName = ctx.getText();
                MongoCollection<Document> collection = db.getCollection(tableName);
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