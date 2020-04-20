package edu.gatech.parser;

import com.codepoetics.protonpack.StreamUtils;
import com.mongodb.client.MongoDatabase;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.antlr.v4.runtime.ParserRuleContext;
import org.bson.Document;
import org.javatuples.Pair;

import java.math.BigDecimal;
import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ASTInterpreter extends MySQLQueryBaseListener {
    private final MongoDatabase db;
    private List<Map<String, Object>> output;
    private int level;
    private boolean isAll = false; // might be wrong when there's nested query
    private boolean isSelect = false;
    private boolean isDistinct = false;
    private int limit = -1;
    private Map<ColumnRef, List<String>> columnToAlias = new HashMap<>();
    private Map<Func, Set<ColumnRef>> functionToColumn = new HashMap<>();
    private List<String> tableToCollection = new ArrayList<>(); // hashmap of tableName and collection of the same name in mongo
    private Map<String, String> tableToAlias = new HashMap<>();
    private Map<String, String> aliasToTable = new HashMap<>();
    private Stack<Object> stack = new Stack<>();
    private Predicate<Map<String, Map<String, Object>>> queryFilter = null;
    private GroupingFunction groupByFunc = null;
    private List<ColumnRef> groupByColumns = null;
    private Map<String, List<Pair<String, Integer>>> orderList = new HashMap<>();
    private List<Pair<ColumnRef, ColumnRef>> joinConditions = null;
    private String joinedTable;
    private List<String> fromTables = null;


    public ASTInterpreter(List<Map<String, Object>> output, MongoDatabase db) {
        this.db = db;
        this.output = output;
    }

    @Override
    public void exitQuery(MySQLQueryParser.QueryContext ctx) {
        for (String tableNameOrAlias : fromTables) {
            final String tableName = aliasToTable.getOrDefault(tableNameOrAlias, tableNameOrAlias);
            Set<ColumnRef> selectedColumnTables = new HashSet<>(columnToAlias.keySet());

            SourceQueryNode querySource = new OrderByFetch(tableName, db, orderList.getOrDefault(tableName, Collections.emptyList()));
            if (joinConditions != null) {
                List<Pair<ColumnRef, ColumnRef>> cleanedJoinConditions = cleanJoinConditions(tableName);
                //TODO support multiple joins
                List<Pair<String, Integer>> orderingPairs = orderList.getOrDefault(joinedTable, Collections.emptyList());
                OrderByFetch right = new OrderByFetch(joinedTable, db, orderingPairs);
                querySource = new JoinNode(querySource, tableName, right, joinedTable, cleanedJoinConditions);
            }

            TransformationQueryNode queryExecutor;
            if (groupByFunc != null) {
                queryExecutor = new AggregationQuery(groupByFunc, new Aggregators(functionToColumn));
            } else {
                queryExecutor = new SimpleSelect(selectedColumnTables);
            }
            if (queryFilter != null) {
                queryExecutor = new WhereQuery(queryFilter).compose(queryExecutor);
            }
            if (limit != -1) {
                queryExecutor = queryExecutor.compose(new LimitQuery(limit));
            }
            querySource = querySource.compose(new LongToBigDecimal()).compose(queryExecutor);
            List<Map<String, Map<String, Object>>> documents;
            while (!(documents = querySource.collectOutput()).isEmpty()) {
                collectOutputWithAliases(output, documents);
                if (querySource.mustStopExecution()) break;
            }
        }
    }

    private List<Pair<ColumnRef, ColumnRef>> cleanJoinConditions(String tableName) {
        return joinConditions.stream().map(colPair -> new Pair<>(
                colPair.getValue0().resolveAlias(aliasToTable),
                colPair.getValue1().resolveAlias(aliasToTable)
        )).map(colPair -> {
            if (colPair.getValue0().table.equals(tableName)) {
                return colPair;
            } else {
                return new Pair<>(
                        colPair.getValue1(),
                        colPair.getValue0()
                );
            }
        }).collect(Collectors.toList());
    }

    private void collectOutputWithAliases(List<Map<String, Object>> outputList, List<Map<String, Map<String, Object>>> docs) {
        outputList.addAll(docs.stream()
                .map(tableWithDocs -> tableWithDocs.entrySet().stream()
                        .map(x -> Map.entry(x.getKey(), (Object) applyColumnAlias(x.getValue(), x.getKey())))
                        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue)))
                .collect(Collectors.toList()));
    }

    private Map<String, Object> applyColumnAlias(Map<String, Object> document, String tableName) {
        Map<String, String> updatedKeys = new HashMap<>();
        for (String property : document.keySet()) {
            ColumnRef columnRef = null;
            if (columnToAlias.containsKey(new ColumnRef(tableName, property))) {
                columnRef = new ColumnRef(tableName, property);
            } else if (columnToAlias.containsKey(new ColumnRef(null, property))) {
                columnRef = new ColumnRef(null, property);
            }
            if (columnRef != null) {
                String alias = columnToAlias.get(columnRef).get(0);
                String func = columnToAlias.get(columnRef).get(1);
                if (func == null && alias != null) {
                    updatedKeys.put(property, alias);
                }
            }
        }
        updatedKeys.keySet().forEach(key -> {
            document.put(updatedKeys.get(key), document.get(key));
            document.remove(key);
        });
        return document;
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

            List<String> mapTableAliasFunc = new ArrayList<>();

            if (context.prefix() != null) {
                tableName = context.prefix().WORD().getText();
            }

            if (context.alias() != null) {
                alias = context.alias().getText();
            }

            mapTableAliasFunc.add(alias);
            mapTableAliasFunc.add(function);

            columnToAlias.put(new ColumnRef(tableName, selectedColumn), mapTableAliasFunc);

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
        if (ctx.alias() != null) {
            tableToAlias.put(ctx.tableName().getText(), ctx.alias().getText());
            aliasToTable.put(ctx.alias().getText(), ctx.tableName().getText());
        }
    }

    @Override
    public void enterFromClause(MySQLQueryParser.FromClauseContext ctx) {
        fromTables = ctx.tableList().tableItem().stream().map(x -> x.tableName().WORD().getSymbol().getText()).collect(Collectors.toList());
    }

    @Override
    public void exitTableName(MySQLQueryParser.TableNameContext ctx) {
        String tableName = ctx.getText();
        if (tableToAlias.containsKey(tableName)) {
            tableName = tableToAlias.get(tableName);
        }
    }

    @Override
    public void exitWhereClause(MySQLQueryParser.WhereClauseContext ctx) {
        Predicate<Map<String, Map<String, Object>>> filters = (Predicate<Map<String, Map<String, Object>>>) stack.pop();
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
        return !obj.equals("") && !obj.equals(BigDecimal.ZERO) && !obj.equals(0);
    }

    @Override
    public void exitCondition(MySQLQueryParser.ConditionContext ctx) {
        Predicate<Map<String, Map<String, Object>>> combined = (Predicate<Map<String, Map<String, Object>>>) stack.pop();
        if (ctx.OR_SYMBOL() != null) {
            combined = combined.or((Predicate<Map<String, Map<String, Object>>>) stack.pop());
        }

        stack.push(combined);
    }

    @Override
    public void exitConditionInner(MySQLQueryParser.ConditionInnerContext ctx) {
        if (ctx.columnItem().isEmpty()) return;
        final ColumnRef col = ColumnRef.of(ctx.columnItem().get(0), aliasToTable);
        Predicate<Map<String, Map<String, Object>>> andPredicate = null;
        if (ctx.AND_SYMBOL() != null) {
            andPredicate = (Predicate<Map<String, Map<String, Object>>>) stack.pop();
        }
        final Predicate<Map<String, Map<String, Object>>> finalAnd = andPredicate;
        Function<Predicate<Object>, Predicate<Map<String, Map<String, Object>>>> commonPredicates = (func -> doc -> doc.get(col.table) != null &&
                doc.get(col.table).get(col.columnName) != null &&
                func.test(doc.get(col.table).get(col.columnName)) &&
                (finalAnd == null || finalAnd.test(doc)));
        if (ctx.compOp() == null) {
            stack.push(commonPredicates.apply(this::isTruthy));
        } else {
            final Object operand = toJavaObject(ctx.valueName());
            Predicate<Map<String, Map<String, Object>>> predicate;
            switch (ctx.compOp().getText()) {
                case "=":
                    predicate = commonPredicates.apply(operand::equals);
                    break;
                case "<>":
                case "!=":
                    predicate = commonPredicates.apply(value -> !operand.equals(value));
                    break;
                case "<":
                    predicate = (value -> value instanceof BigDecimal && ((BigDecimal) value).compareTo((BigDecimal) operand) < 0);
                    break;
                case "<=":
                    predicate = (value -> value instanceof BigDecimal && ((BigDecimal) value).compareTo((BigDecimal) operand) <= 0);
                    break;
                case ">":
                    predicate = (value -> value instanceof BigDecimal && ((BigDecimal) value).compareTo((BigDecimal) operand) > 0);
                    break;
                case ">=":
                    predicate = (value -> value instanceof BigDecimal && ((BigDecimal) value).compareTo((BigDecimal) operand) >= 0);
                    break;
                default:
                    throw new RuntimeException("Unexpected operator " + ctx.compOp());
            }
            stack.push(predicate);
        }
    }

    @Override
    public void exitGroupByClause(MySQLQueryParser.GroupByClauseContext ctx) {
        List<ColumnRef> columns = ctx.columnItem().stream().map(ColumnRef::of).collect(Collectors.toList());

        groupByColumns = columns;
        groupByFunc = (doc) -> {
            if (columns.stream().allMatch((col) -> doc.containsKey(col.table) && doc.get(col.table).containsKey(col.columnName) )) {
                return null;
            } else {
                List<Object> group = columns.stream().map(x -> doc.get(x.table).get(x.columnName)).collect(Collectors.toList());
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
    public void enterOrderExpression(MySQLQueryParser.OrderExpressionContext ctx) {
        String columnName = ctx.columnItem().columnName().getText();
        String tableName = null;
        if (columnName != null && columnName.contains(".")) {
            int dot = columnName.indexOf(".");
            tableName = columnName.substring(0, dot);
            columnName = columnName.substring(dot + 1);
        }
        int direction = (ctx.direction() != null && ctx.direction().DESC_SYMBOL() != null)
                ? Direction.DESC.value : Direction.ASC.value;
        List<Pair<String, Integer>> columns = orderList.getOrDefault(tableName, new ArrayList<>());
        orderList.put(tableName, columns);
        Pair<String, Integer> columnAndDirection = new Pair<>(columnName, direction);
        columns.add(columnAndDirection);
    }

    @Override
    public void exitJoinClause(MySQLQueryParser.JoinClauseContext ctx) {
        String tableName = ctx.tableItem().tableName().WORD().getSymbol().getText();
        if (ctx.tableItem().alias() != null) {
            aliasToTable.put(ctx.tableItem().alias().WORD().getSymbol().getText(), tableName);
        }
        joinedTable = tableName;
        joinConditions = (List<Pair<ColumnRef, ColumnRef>>) stack.pop();
    }

    @Override
    public void exitOnList(MySQLQueryParser.OnListContext ctx) {
        ColumnRef first = ColumnRef.of(ctx.columnItem().get(0), aliasToTable);
        ColumnRef second = ColumnRef.of(ctx.columnItem().get(1), aliasToTable);
        MySQLQueryParser.CompOpContext comparison = ctx.compOp();
        if (comparison.EQUAL_OPERATOR() == null) {
            throw new RuntimeException("Joins only support equality conditions, not " + comparison.getText());
        }
        Pair<ColumnRef, ColumnRef> eqPair = new Pair<>(first, second);
        List<Pair<ColumnRef, ColumnRef>> columns;
        if (ctx.AND_SYMBOL() != null) {
            columns = (List<Pair<ColumnRef, ColumnRef>>) stack.pop();
            columns.add(eqPair);
        } else {
            columns = Arrays.asList(eqPair);
        }
        stack.push(columns);
    }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        System.out.println("|  ".repeat(level++) + "Entering " + ctx.getClass().getSimpleName());
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        System.out.println("|  ".repeat(--level) + "Exiting " + ctx.getClass().getSimpleName());
    }

    @RequiredArgsConstructor
    private class SimpleSelect implements TransformationQueryNode {
        @NonNull
        final private Set<ColumnRef> selectedColumnTables;
        final private Set<Map<String, Map<String, Object>>> distinctDocuments = new HashSet<>();
        private List<Map<String, Map<String, Object>>> output = new ArrayList<>();

        @Override
        public boolean mustStopExecution() {
            return false;
        }

        @Override
        public List<Map<String, Map<String, Object>>> collectOutput() {
            List<Map<String, Map<String, Object>>> tmp = output;
            output = new ArrayList<>();
            return tmp;
        }

        @Override
        public void done() {
        }

        @Override
        public void acceptDocument(Map<String, Map<String, Object>> document) {
            if (!isAll) {
                document = document.entrySet().stream()
                        .map((tableWithDoc) -> {
                            String table = tableWithDoc.getKey();
                            return Map.entry(table, tableWithDoc.getValue().entrySet().stream()
                                    .filter(x -> selectedColumnTables.contains(new ColumnRef(table, x.getKey())))
                                    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue)));
                        })
                        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
            }
            if (isDistinct) {
                // apply distinct filter
                if (!distinctDocuments.contains(document)) {
                    distinctDocuments.add(document);
                    // update result
                    if (!document.keySet().isEmpty()) {
                        output.add(document);
                    }
                }
            } else {
                if (!document.keySet().isEmpty()) {
                    output.add(document);
                }
            }
        }
    }

    private class AggregationQuery implements TransformationQueryNode {
        private List<Map<String, Map<String, Object>>> output;
        private final GroupingFunction groupingFunc;
        private final AggregationFunction aggregationFunction;
        private final Map<List<Object>, Map<String, Map<String, Object>>> groups;
        private boolean limitReached;

        public AggregationQuery(
                GroupingFunction groupingFunc,
                AggregationFunction aggregationFunction
        ) {
            this.output = new ArrayList<>();
            this.groupingFunc = groupingFunc;
            this.aggregationFunction = aggregationFunction;
            this.groups = new HashMap<>();
            this.limitReached = false;
        }

        @Override
        public boolean mustStopExecution() {
            return limitReached;
        }

        @Override
        public void acceptDocument(Map<String, Map<String, Object>> document) {
            Pair<List<Object>, Map<String, Map<String, Object>>> res = groupingFunc.apply(document);
            if (res != null) {
                Map<String, Map<String, Object>> currentAgg = groups.get(res.getValue0());
                Map<String, Map<String, Object>> newAgg = aggregationFunction.apply(res, currentAgg);
                groups.put(res.getValue0(), newAgg);
            }
        }

        @Override
        public List<Map<String, Map<String, Object>>> collectOutput() {
            List<Map<String, Map<String, Object>>> tmp = output;
            output = new ArrayList<>();
            return tmp;
        }

        @Override
        public void done() {
            groups.forEach((groupedValues, aggregated) -> {
                StreamUtils.zip(groupByColumns.stream(), groupedValues.stream(), Pair::new)
                        .forEach(x -> {
                            String table = x.getValue0().table;
                            String column = x.getValue0().columnName;
                            if (aggregated.size() == 1 || table != null) {
                                if (aggregated.containsKey(table)) {
                                    aggregated.get(table).put(column, x.getValue1());
                                }
                            } else {
                                throw new RuntimeException("If multiple tables are available, group by must be disambiguated.");
                            }
                        });
                output.add(aggregated);
            });
        }
    }
}
