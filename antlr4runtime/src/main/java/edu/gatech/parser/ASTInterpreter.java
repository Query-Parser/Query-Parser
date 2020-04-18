package edu.gatech.parser;

import com.codepoetics.protonpack.StreamUtils;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.antlr.v4.runtime.ParserRuleContext;
import org.bson.Document;
import org.javatuples.Pair;

import java.math.BigDecimal;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ASTInterpreter extends MySQLQueryBaseListener {
    private final MongoDatabase db;
    private Map<String, List<Map<String, Object>>> output;
    private int level;
    private boolean isAll = false; // might be wrong when there's nested query
    private boolean isSelect = false;
    private boolean isDistinct = false;
    private int limit = Integer.MAX_VALUE;
    private Map<List<String>, List<String>> columnToAlias = new HashMap<>();
    private Map<Func, Set<ColumnRef>> functionToColumn = new HashMap<>();
    private Map<String, MongoCollection<Document>> tableToCollection = new HashMap<>(); // hashmap of tableName and collection of the same name in mongo
    private Map<String, String> tableToAlias = new HashMap<>();
    private Map<String, String> aliasToTable = new HashMap<>();
    private Stack<Object> stack = new Stack<>();
    private Predicate<Map<String, Object>> queryFilter = null;
    private GroupingFunction groupByFunc = null;
    private List<String> orderList = null;
    private Direction direction = null;
    private List<String> groupByColumns = null;

    public ASTInterpreter(Map<String, List<Map<String, Object>>> output, MongoDatabase db) {
        this.db = db;
        this.output = output;
    }

    @Override
    public void exitQuery(MySQLQueryParser.QueryContext ctx) {
        for (Map.Entry<String, MongoCollection<Document>> entry : tableToCollection.entrySet()) {
            Set<String> selectedColumnTables = columnToAlias.keySet().stream()
                    .filter((x) -> x.get(1) == null || x.get(1).equals(entry.getKey()))
                    .map((x) -> x.get(0))
                    .collect(Collectors.toSet());
            List<Map<String, Object>> docs = output.getOrDefault(entry.getKey(), new ArrayList<>());
            output.put(entry.getKey(), docs);
            QueryExecutor queryExecutor;
            if (groupByFunc != null) {
                queryExecutor = new AggregationQuery(entry.getKey(), selectedColumnTables, docs, groupByFunc, new Aggregators(functionToColumn));
            } else {
                queryExecutor = new SimpleSelect(entry.getKey(), selectedColumnTables, docs);
            }
            for (Document document : entry.getValue().find()) {
                if (queryFilter == null || queryFilter.test(document)) {
                    queryExecutor.applySelect(document);
                    if (queryExecutor.breakTable()) break;
                }
            }
            queryExecutor.done();
        }
    }

    private void applyColumnAlias(Document document, String tableName) {
        Map<String, String> updatedKeys = new HashMap<>();
        for (String property : document.keySet()) {
            List<String> columnTable = new ArrayList<>();
            columnTable.add(property);
            columnTable.add(null);
            List<String> tuple = null;
            if (columnToAlias.containsKey(List.of(property, tableName))) {
                tuple = List.of(property, tableName);
            } else if (columnToAlias.containsKey(columnTable)) {
                tuple = columnTable;
            }
            if (tuple != null) {
                String alias = columnToAlias.get(tuple).get(0);
                String func = columnToAlias.get(tuple).get(1);
                if (func == null && alias != null) {
                    updatedKeys.put(property, alias);
                }
            }
        }
        updatedKeys.keySet().forEach(key -> {
            document.put(updatedKeys.get(key), document.get(key));
            document.remove(key);
        });
    }

    @Override
    public void enterSelectStatement(MySQLQueryParser.SelectStatementContext ctx) {
        isSelect = true;
    }

    @Override
    public void enterSelectItemList(MySQLQueryParser.SelectItemListContext ctx) {
        if (isSelect) {
            isAll = ctx.MULT_OPERATOR() != null;
        }
    }

    @Override
    public void enterSelectItem(MySQLQueryParser.SelectItemContext ctx) {
        // table.column alias
        MySQLQueryParser.ColumnItemContext context = null;
        Func func = null;
        if (ctx.columnItem() != null) {
            context = ctx.columnItem();
        } else if (ctx.countClause() != null) {
            context = ctx.countClause().columnItem();
            func = Func.COUNT;
        } else if (ctx.sumClause() != null) {
            context = ctx.sumClause().columnItem();
            func = Func.SUM;
        } else if (ctx.avgClause() != null) {
            context = ctx.avgClause().columnItem();
            func = Func.AVERAGE;
        } else if (ctx.minClause() != null) {
            context = ctx.minClause().columnItem();
            func = Func.MIN;
        } else if (ctx.maxClause() != null) {
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
                selectedColumn = selectedColumn.substring(dot + 1);
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
                Set<ColumnRef> mapFuncToCol = functionToColumn.getOrDefault(func, new HashSet<>());
                mapFuncToCol.add(new ColumnRef(tableName, selectedColumn));
                functionToColumn.put(func, mapFuncToCol);
            }
        }
    }

    @Override
    public void enterCountClause(MySQLQueryParser.CountClauseContext ctx) {

    }

    @Override
    public void enterDistinctClause(MySQLQueryParser.DistinctClauseContext ctx) {
        if (ctx != null && ctx.DISTINCT_SYMBOL() != null) {
            isDistinct = true;
        }
    }

    @Override
    public void enterTableItem(MySQLQueryParser.TableItemContext ctx) {
        if (ctx.selectAlias() != null) {
            tableToAlias.put(ctx.tableName().getText(), ctx.selectAlias().alias().getText());
            aliasToTable.put(ctx.selectAlias().alias().getText(), ctx.tableName().getText());
        } else if (ctx.alias() != null) {
            tableToAlias.put(ctx.tableName().getText(), ctx.alias().getText());
            aliasToTable.put(ctx.alias().getText(), ctx.tableName().getText());
        }
    }

    @Override
    public void exitTableName(MySQLQueryParser.TableNameContext ctx) {
        String tableName = ctx.getText();
        MongoCollection<Document> collection = db.getCollection(tableName);
        if (tableToAlias.containsKey(tableName)) {
            tableName = tableToAlias.get(tableName);
        }
        tableToCollection.put(tableName, collection);
    }

    @Override
    public void exitWhereClause(MySQLQueryParser.WhereClauseContext ctx) {
        Predicate<Map<String, Object>> filters = (Predicate<Map<String, Object>>) stack.pop();
        queryFilter = filters;
    }

    private Object toJavaObject(MySQLQueryParser.ValueNameContext ctx) {
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
    public void exitCondition(MySQLQueryParser.ConditionContext ctx) {
        Predicate<Map<String, Object>> combined = (Predicate<Map<String, Object>>) stack.pop();
        if (ctx.OR_SYMBOL() != null) {
            combined = combined.or((Predicate<Map<String, Object>>) stack.pop());
        }

        stack.push(combined);
    }

    @Override
    public void exitConditionInner(MySQLQueryParser.ConditionInnerContext ctx) {
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
                    predicate = (doc -> doc.get(column) != null && ((BigDecimal) doc.get(column)).compareTo((BigDecimal) operand) < 0);
                    break;
                case "<=":
                    predicate = (doc -> doc.get(column) != null && ((BigDecimal) doc.get(column)).compareTo((BigDecimal) operand) <= 0);
                    break;
                case ">":
                    predicate = (doc -> doc.get(column) != null && ((BigDecimal) doc.get(column)).compareTo((BigDecimal) operand) > 0);
                    break;
                case ">=":
                    predicate = (doc -> doc.get(column) != null && ((BigDecimal) doc.get(column)).compareTo((BigDecimal) operand) >= 0);
                    break;
                default:
                    throw new RuntimeException("Unexpected operator " + ctx.compOp());
            }
            stack.push(predicate);
        }
    }

    @Override
    public void exitGroupByClause(MySQLQueryParser.GroupByClauseContext ctx) {
        List<String> columns = ctx.columnItem().stream().map((x) -> x.columnName().WORD().getSymbol().getText()).collect(Collectors.toList());

        groupByColumns = columns;
        groupByFunc = (doc) -> {
            if (columns.stream().anyMatch((col) -> !doc.containsKey(col))) {
                return null;
            } else {
                List<Object> group = columns.stream().map(doc::get).collect(Collectors.toList());
                return new Pair<>(group, doc);
            }
        };
    }

    @Override
    public void exitLimitClause(MySQLQueryParser.LimitClauseContext ctx) {
        if (ctx.LIMIT_SYMBOL() != null) {
            limit = Integer.parseInt(ctx.NUMBER().getText());
        }
    }

    @Override
    public void enterOrderList(MySQLQueryParser.OrderListContext ctx) {
        orderList = new ArrayList<>();
    }

    @Override
    public void exitOrderList(MySQLQueryParser.OrderListContext ctx) {
        ctx.columnItem().forEach(columnItem -> orderList.add(columnItem.columnName().WORD().getSymbol().getText()));
    }

    @Override
    public void enterDirection(MySQLQueryParser.DirectionContext ctx) {
        direction = ctx.DESC_SYMBOL() != null ? Direction.DESC : Direction.ASC;
    }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        System.out.println("|  ".repeat(level++) + "Entering " + ctx.getClass().getSimpleName());
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        System.out.println("|  ".repeat(--level) + "Exiting " + ctx.getClass().getSimpleName());
    }

    private class SimpleSelect implements QueryExecutor {
        private boolean limitReached;
        private String tableName;
        private Set<String> distinctDocuments;
        private int count;
        private Set<String> selectedColumnTables;
        private List<Map<String, Object>> output;

        public SimpleSelect(String tableName, Set<String> selectedColumnTables, List<Map<String, Object>> output) {
            this.tableName = tableName;
            this.distinctDocuments = new HashSet<>();
            this.count = 0;
            this.selectedColumnTables = selectedColumnTables;
            this.output = output;
            this.limitReached = false;
        }

        @Override
        public boolean breakTable() {
            return limitReached;
        }

        @Override
        public void done() {
        }

        @Override
        public void applySelect(Document document) {
            if (count >= limit) {
                limitReached = true;
                return;
            }
            if (!isAll) {
                document = new Document(document.entrySet().stream()
                        .filter((x) -> selectedColumnTables.contains(x.getKey()))
                        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue)));
            }
            applyColumnAlias(document, tableName);
            if (isDistinct) {
                // apply distinct filter
                if (!distinctDocuments.contains(document.toJson())) {
                    distinctDocuments.add(document.toJson());
                    // update result
                    if (!document.keySet().isEmpty()) {
                        emit(document);
                    }
                }
            } else {
                if (!document.keySet().isEmpty()) {
                    emit(document);
                }
            }
        }

        private void emit(Document document) {
            output.add(document);
            count++;
        }
    }

    private class AggregationQuery implements QueryExecutor {
        private final String tableName;
        private final Set<String> selectedColumnTables;
        private final List<Map<String, Object>> output;
        private final GroupingFunction groupingFunc;
        private final AggregationFunction aggregationFunction;
        private final Map<List<Object>, Map<String, Object>> groups;
        private boolean limitReached;
        private int count;

        public AggregationQuery(
                String tableName,
                Set<String> selectedColumnTables,
                List<Map<String, Object>> output,
                GroupingFunction groupingFunc,
                AggregationFunction aggregationFunction
        ) {
            this.tableName = tableName;
            this.selectedColumnTables = selectedColumnTables;
            this.output = output;
            this.groupingFunc = groupingFunc;
            this.aggregationFunction = aggregationFunction;
            this.groups = new HashMap<>();
            this.limitReached = false;
            this.count = 0;
        }

        @Override
        public boolean breakTable() {
            return limitReached;
        }

        @Override
        public void applySelect(Document document) {
            if (count >= limit) {
                limitReached = true;
                return;
            }
            Pair<List<Object>, Map<String, Object>> res = groupingFunc.apply(document);
            if (res != null) {
                Map<String, Object> currentAgg = groups.get(res.getValue0());
                Map<String, Object> newAgg = aggregationFunction.apply(res, currentAgg);
                groups.put(res.getValue0(), newAgg);
            }
        }

        @Override
        public void done() {
            groups.forEach((groupedValues, aggregated) -> {
                StreamUtils.zip(groupByColumns.stream(), groupedValues.stream(), Pair::new)
                        .forEach(x -> aggregated.put(x.getValue0(), x.getValue1()));
                output.add(aggregated);
            });
        }
    }
}
