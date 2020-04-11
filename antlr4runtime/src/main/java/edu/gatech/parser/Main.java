package edu.gatech.parser;

import com.mongodb.*;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.*;
import org.bson.Document;
import org.json.JSONObject;

import java.math.BigDecimal;
import java.util.*;
import java.util.function.Predicate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import static edu.gatech.parser.MySQLQueryParser.*;

public class Main {
    private static MongoDatabase db = dbConfig();

    public static void main(String[] args) {
        String query = "select * from Categories where CategoryName = 'Meat/Poultry' or CategoryName = 'Beverages';"; // TODO: replace by args later
        MySQLQueryLexer lexer = new MySQLQueryLexer(CharStreams.fromString(query));
        MySQLQueryParser parser = new MySQLQueryParser(new BufferedTokenStream(lexer));
        MySQLQueryBaseListener listener = new MySQLQueryBaseListener() {
            boolean isAll = false;
            boolean isSelect = false;
            Map<String, List<String>> selectedColumns = new HashMap<>(); // table, column
            Map<String, MongoCollection<Document>> tableToCollection = new HashMap<>(); // hashmap of tableName and collection of the same name in mongo
            List<String> tableNames = new ArrayList<>(); // list of table names
            ObjectMapper mapper = new ObjectMapper();
            Stack<Object> stack = new Stack<>();
            Predicate<Map<String, Object>> queryFilter = null;

            @Override
            public void enterQuery(QueryContext ctx) {
                System.out.println("enter query");
            }

            @Override
            public void exitQuery(QueryContext ctx) {
                System.out.println("exit query");
                if (isAll) {
                    Map<String, List<Document>> documents = new HashMap<>();
                    for (Map.Entry<String, MongoCollection<Document>> entry: tableToCollection.entrySet()) {
                        for (Document document : entry.getValue().find()) {
                            if (queryFilter == null || queryFilter.test(document)) {
                                List<Document> docs = documents.getOrDefault(entry.getKey(), new ArrayList<>());
                                docs.add(document);
                                documents.put(entry.getKey(), docs);
                            }
                        }
                        // TODO: Map collection to json object
                    }
                    String jsonOutput = null;
                    try {
                        jsonOutput = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(documents);
                    } catch (JsonProcessingException e) {
                        e.printStackTrace();
                    }
                    System.out.println(jsonOutput);
                }
            }

//            @Override
//            public void enterUseClause(UseClauseContext ctx) {
//                System.out.println();
//            }
//
//            @Override
//            public void exitUseClause(UseClauseContext ctx) {
//                super.exitUseClause(ctx);
//            }

            @Override
            public void enterSimpleStatement(SimpleStatementContext ctx) {
                System.out.println("enter simple statement");
            }

            @Override
            public void exitSimpleStatement(SimpleStatementContext ctx) {
                System.out.println("exit simple statement");
            }

            @Override
            public void enterSelectStatement(SelectStatementContext ctx) {
                System.out.println("enter select statemment");
                isSelect = true;
            }

            @Override
            public void exitSelectStatement(SelectStatementContext ctx) {
                System.out.println("exit select");
            }

            @Override
            public void enterDistinctClause(DistinctClauseContext ctx) {
                System.out.println("enter distinct clause");
            }

            @Override
            public void exitDistinctClause(DistinctClauseContext ctx) {
                System.out.println("exit distinct clause");
            }

            @Override
            public void enterSelectItemList(SelectItemListContext ctx) {
                System.out.println("enter select item list");
                if (isSelect) {
                    isAll = ctx.MULT_OPERATOR() != null;
                }
            }

            @Override
            public void exitSelectItemList(SelectItemListContext ctx) {
                System.out.println("exit select item list");
            }

            @Override // list selected columns
            public void enterSelectItem(SelectItemContext ctx) {
                System.out.println("ENTER SELECT ITEM");
            }

            @Override
            public void exitSelectItem(SelectItemContext ctx) {
                System.out.println("EXIT SELECT ITEM");
            }

            @Override
            public void enterSumClause(SumClauseContext ctx) {
                System.out.println("enter sum clause");
            }

            @Override
            public void exitSumClause(SumClauseContext ctx) {
                System.out.println("EXIT SUM CLAUSE");
            }

            @Override
            public void enterCountClause(CountClauseContext ctx) {
                System.out.println("ENTER COUNT CLAUSE");
            }

            @Override
            public void exitCountClause(CountClauseContext ctx) {
                System.out.println("EXIT COUNT CLAUSE");
            }

            @Override
            public void enterAvgClause(AvgClauseContext ctx) {
                System.out.println("ENTER AVG CLAUSE");
            }

            @Override
            public void exitAvgClause(AvgClauseContext ctx) {
                System.out.println("exit avgclause");
            }

            @Override
            public void enterMinClause(MinClauseContext ctx) {
                System.out.println("ENTER MIN CLAUSE");
            }

            @Override
            public void exitMinClause(MinClauseContext ctx) {
                System.out.println("EXIT MIN CLAUSE");
            }

            @Override
            public void enterMaxClause(MaxClauseContext ctx) {
                System.out.println("ENTER MAX CLAUSE");
            }

            @Override
            public void exitMaxClause(MaxClauseContext ctx) {
                System.out.println("exit max clause");
            }

            @Override
            public void enterColumnName(ColumnNameContext ctx) {
                System.out.println("ENTER COLUMN NAME");
                String tableName = "default";
                String selected = ctx.getText();
                List<String> columns = new ArrayList<>();
                if (selected.contains(".")) {
                    int dot = selected.indexOf('.');
                    tableName = selected.substring(0, dot);
                    selected = selected.substring(dot+1);
                }
                columns = selectedColumns.getOrDefault(tableName, columns);
                columns.add(selected);
                selectedColumns.put(tableName, columns);
            }

            @Override
            public void exitColumnName(ColumnNameContext ctx) {
                System.out.println("EXIT COLUMN NAME");
            }

            @Override
            public void enterSelectAlias(SelectAliasContext ctx) {
                System.out.println("ENTER SELECT ALIAS");
            }

            @Override
            public void exitSelectAlias(SelectAliasContext ctx) {
                System.out.println("EXIT SELECT ALIAS");
            }

//            @Override
//            public void enterIntoClause(IntoClauseContext ctx) {
//                System.out.println("ENTER INTO CLAUSE");
//            }
//
//            @Override
//            public void exitIntoClause(IntoClauseContext ctx) {
//                System.out.println("EXIT INTO CLAUSE");
//            }

            @Override
            public void enterFromClause(FromClauseContext ctx) {
                System.out.println("ENTER FROM CLAUSE");
            }

            @Override
            public void exitFromClause(FromClauseContext ctx) {
                System.out.println("EXIT FROM CLAUSE");
            }

            @Override
            public void enterTableList(TableListContext ctx) {
                System.out.println("ENTER TABLE LIST");
            }

            @Override
            public void exitTableList(TableListContext ctx) {
                System.out.println("Exit table list");
            }

            @Override
            public void enterTableItem(TableItemContext ctx) {
                System.out.println("ENTER TABLE ITEM");
            }

            @Override
            public void exitTableItem(TableItemContext ctx) {
                System.out.println("EXIT TABLE ITEM");
            }

            @Override // get table Name
            public void enterTableName(TableNameContext ctx) {
                System.out.println("ENTER TABLE NAME");
                tableNames.add(ctx.getText()); // may change this into a stack
                //TODO: check when it has an alias
            }

            @Override // check if the table exist in mongo
            public void exitTableName(TableNameContext ctx) {
                System.out.println("EXIT TABLE NAME");
                String tableName = ctx.getText();
                MongoCollection collection = db.getCollection(tableName);
                tableToCollection.put(tableName, collection);
            }

            @Override
            public void enterWhereClause(WhereClauseContext ctx) {
                System.out.println("ENTER WHERE CLAUSE");
            }

            @Override
            public void exitWhereClause(WhereClauseContext ctx) {
                Predicate<Map<String, Object>> orFilter = null;
                if (ctx.OR_SYMBOL() != null) {
                    orFilter = (Predicate<Map<String, Object>>) stack.pop();
                }
                Predicate<Map<String, Object>> andFilter = (Predicate<Map<String, Object>>) stack.pop();

                queryFilter = orFilter != null ? orFilter.or(andFilter) : andFilter;

                System.out.println("exit where clause");
            }

            @Override
            public void enterLikeClause(LikeClauseContext ctx) {
                System.out.println("ENTER LIKE CLAUSE");
            }

            @Override
            public void exitLikeClause(LikeClauseContext ctx) {
                System.out.println("EXIT LIKE CLAUSE");
            }

            @Override
            public void enterInClause(InClauseContext ctx) {
                System.out.println("ENTER IN CLAUSE");
            }

            @Override
            public void exitInClause(InClauseContext ctx) {
                System.out.println("EXIT IN CLAUSE");
            }

            @Override
            public void enterValuesList(ValuesListContext ctx) {
                System.out.println("ENTER VALUE LIST");
            }

            @Override
            public void exitValuesList(ValuesListContext ctx) {
                System.out.println("EXIT VALUE LIST");
            }

            @Override
            public void enterValueName(ValueNameContext ctx) {
                System.out.println("ETER VALUENAME");
            }

            @Override
            public void exitValueName(ValueNameContext ctx) {
                System.out.println("EXIT VALUE NAME");
            }

            @Override
            public void enterCondition(ConditionContext ctx) {
                System.out.println("ENTER EXPRESSION");
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
                            predicate = (doc -> doc.get(column).equals(operand) && (finalAnd == null || finalAnd.test(doc)));
                            break;
                        case "<>":
                            predicate = (doc -> !doc.get(column).equals(operand) && (finalAnd == null || finalAnd.test(doc)));
                            break;
                        case "<":
                            predicate = (doc -> ((BigDecimal)doc.get(column)).compareTo((BigDecimal)operand) < 0);
                            break;
                        case "<=":
                            predicate = (doc -> ((BigDecimal)doc.get(column)).compareTo((BigDecimal)operand) <= 0);
                            break;
                        case ">":
                            predicate = (doc -> ((BigDecimal)doc.get(column)).compareTo((BigDecimal)operand) > 0);
                            break;
                        case ">=":
                            predicate = (doc -> ((BigDecimal)doc.get(column)).compareTo((BigDecimal)operand) >= 0);
                            break;
                        default:
                            throw new RuntimeException("Unexpected operator " + ctx.compOp());
                    }
                    stack.push(predicate);
                }
                System.out.println("EXIT EXPRESSION");
            }

            @Override
            public void enterGroupByClause(GroupByClauseContext ctx) {
                System.out.println("enterGroupByClause");
            }

            @Override
            public void exitGroupByClause(GroupByClauseContext ctx) {
                System.out.println("exitGroupByClause");
            }

            @Override
            public void enterOrderList(OrderListContext ctx) {
                System.out.println("enterOrderList");
            }

            @Override
            public void exitOrderList(OrderListContext ctx) {
                System.out.println("exitOrderList");
            }

            @Override
            public void enterOrderExpression(OrderExpressionContext ctx) {
                System.out.println("enterOrderExpression");
            }

            @Override
            public void exitOrderExpression(OrderExpressionContext ctx) {
                System.out.println("exitOrderExpression");
            }

            @Override
            public void enterDirection(DirectionContext ctx) {
                System.out.println("enterDirection");
            }

            @Override
            public void exitDirection(DirectionContext ctx) {
                System.out.println("exitDirection");
            }

            @Override
            public void enterHavingClause(HavingClauseContext ctx) {
                System.out.println("enterHavingClause");
            }

            @Override
            public void exitHavingClause(HavingClauseContext ctx) {
                System.out.println("exitHavingClause");
            }

            @Override
            public void enterCompOp(CompOpContext ctx) {
                System.out.println("enterCompOp");
            }

            @Override
            public void exitCompOp(CompOpContext ctx) {
                System.out.println("exitCompOp");
            }

            @Override
            public void enterOrderClause(OrderClauseContext ctx) {
                System.out.println("enterOrderClause");
            }

            @Override
            public void exitOrderClause(OrderClauseContext ctx) {
                System.out.println("exitOrderClause");
            }

            @Override
            public void enterDeleteStatement(DeleteStatementContext ctx) {
                System.out.println("enterDeleteStatement");
            }

            @Override
            public void exitDeleteStatement(DeleteStatementContext ctx) {
                System.out.println("exitDeleteStatement");
            }

            @Override
            public void enterLimitClause(LimitClauseContext ctx) {
                System.out.println("enterLimitClause");
            }

            @Override
            public void exitLimitClause(LimitClauseContext ctx) {
                System.out.println("exitLimitClause");
            }

//            @Override
//            public void enterCreateStatement(CreateStatementContext ctx) {
//                System.out.println("enterCreateStatement");
//            }
//
//            @Override
//            public void exitCreateStatement(CreateStatementContext ctx) {
//                super.exitCreateStatement(ctx);
//            }

//            @Override
//            public void enterNewTable(NewTableContext ctx) {
//                super.enterNewTable(ctx);
//            }
//
//            @Override
//            public void exitNewTable(NewTableContext ctx) {
//                super.exitNewTable(ctx);
//            }

//            @Override
//            public void enterExistingTable(ExistingTableContext ctx) {
//                super.enterExistingTable(ctx);
//            }
//
//            @Override
//            public void exitExistingTable(ExistingTableContext ctx) {
//                super.exitExistingTable(ctx);
//            }

//            @Override
//            public void enterInsertStatement(InsertStatementContext ctx) {
//                super.enterInsertStatement(ctx);
//            }
//
//            @Override
//            public void exitInsertStatement(InsertStatementContext ctx) {
//                super.exitInsertStatement(ctx);
//            }

            @Override
            public void enterColumnItem(ColumnItemContext ctx) {
                System.out.println("enterColumnItem");
            }

            @Override
            public void exitColumnItem(ColumnItemContext ctx) {
                System.out.println("exitColumnItem");
            }

            @Override
            public void enterColumnList(ColumnListContext ctx) {
                System.out.println("enterColumnList");
            }

            @Override
            public void exitColumnList(ColumnListContext ctx) {
                System.out.println("exitColumnList");
            }

            @Override
            public void enterValueItem(ValueItemContext ctx) {
                System.out.println("enterValueItem");
            }

            @Override
            public void exitValueItem(ValueItemContext ctx) {
                System.out.println("exitValueItem");
            }

            @Override
            public void enterUpdateStatement(UpdateStatementContext ctx) {
                System.out.println("enterUpdateStatement");
            }

            @Override
            public void exitUpdateStatement(UpdateStatementContext ctx) {
                System.out.println("exitUpdateStatement");
            }

            @Override
            public void enterTableRefList(TableRefListContext ctx) {
                System.out.println("enterTableRefList");
            }

            @Override
            public void exitTableRefList(TableRefListContext ctx) {
                System.out.println("exitTableRefList");
            }

            @Override
            public void enterAssignmentList(AssignmentListContext ctx) {
                super.enterAssignmentList(ctx);
            }

            @Override
            public void exitAssignmentList(AssignmentListContext ctx) {
                System.out.println("enterAssignmentList");
            }

            @Override
            public void enterJoinClause(JoinClauseContext ctx) {
                System.out.println("enterJoinClause");
            }

            @Override
            public void exitJoinClause(JoinClauseContext ctx) {
                System.out.println("exitJoinClause");
            }

            @Override
            public void enterUnionClause(UnionClauseContext ctx) {
                System.out.println("enterUnionClause");
            }

            @Override
            public void exitUnionClause(UnionClauseContext ctx) {
                System.out.println("exitUnionClause");
            }

            @Override
            public void enterEveryRule(ParserRuleContext ctx) {
                System.out.println("++++ enterEveryRule");
            }

            @Override
            public void exitEveryRule(ParserRuleContext ctx) {
                System.out.println("____ exitEveryRule");
            }

            @Override
            public void visitTerminal(TerminalNode node) {
                System.out.println("visitTerminal");
                Token symbol = node.getSymbol();
                System.out.println("    Token text " + symbol.getText());
                System.out.println("    token type " + symbol.getType());
            }

            @Override
            public void visitErrorNode(ErrorNode node) {
                System.out.println("visitErrorNode");
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