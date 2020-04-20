package edu.gatech.parser;

import lombok.AllArgsConstructor;
import lombok.NonNull;
import org.javatuples.Pair;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

@AllArgsConstructor
public class Aggregators implements AggregationFunction {
    @NonNull
    final private Map<Func, Set<ColumnRef>> functionToColumn;

    @Override
    public Map<String, Map<String, Object>> apply(Pair<List<Object>, Map<String, Map<String, Object>>> tableWithDoc, Map<String, Map<String, Object>> acc) {
        if (acc == null) {
            acc = new HashMap<>();
        }
        Map<String, Object> accumulator;
        for (Map.Entry<Func, Set<ColumnRef>> entry : functionToColumn.entrySet()) {
            for (ColumnRef columnRef : entry.getValue()) {
                Pair<Func, ColumnRef> funcColumn = new Pair<>(entry.getKey(), columnRef);
                Func function = funcColumn.getValue0();
                ColumnRef column = funcColumn.getValue1();

                Map<String, Object> document = tableWithDoc.getValue1().get(column.table);
                Object documentValue = document.get(column.columnName);

                accumulator = acc.getOrDefault(column.table, new HashMap<>());
                acc.put(column.table, accumulator);

                if (!(documentValue instanceof Number)) return acc;
                BigDecimal documentValueBd;
                if (documentValue instanceof BigDecimal) {
                    documentValueBd = (BigDecimal) documentValue;
                } else {
                    documentValueBd = new BigDecimal(documentValue.toString());
                }
                switch (function) {
                    case MAX: {
                        String columnWithFunc = "MAX(" + column.columnName + ")";
                        if (!accumulator.containsKey(columnWithFunc)) {
                            accumulator.put(columnWithFunc, BigDecimal.ZERO);
                        }

                        BigDecimal currentAcc;
                        currentAcc = (BigDecimal) accumulator.get(columnWithFunc);

                        if (documentValueBd.compareTo(currentAcc) > 0) {
                            accumulator.put(columnWithFunc, documentValueBd);
                        }
                        break;
                    }
                    case MIN: {
                        String columnWithFunc = "MIN(" + column.columnName + ")";
                        if (!accumulator.containsKey(columnWithFunc)) {
                            accumulator.put(columnWithFunc, BigDecimal.ZERO);
                        }

                        BigDecimal currentAcc = (BigDecimal) accumulator.get(columnWithFunc);

                        if (documentValueBd.compareTo(currentAcc) < 0) {
                            accumulator.put(columnWithFunc, documentValueBd);
                        }
                        break;
                    }
                    case SUM: {
                        String columnWithFunc = "SUM(" + column.columnName + ")";
                        if (!accumulator.containsKey(columnWithFunc)) {
                            accumulator.put(columnWithFunc, BigDecimal.ZERO);
                        }

                        BigDecimal currentAcc = (BigDecimal) accumulator.get(columnWithFunc);

                        accumulator.put(columnWithFunc, documentValueBd.add(currentAcc));
                        break;
                    }
                    case COUNT: {
                        String columnWithFunc = "COUNT(" + column.columnName + ")";
                        if (!accumulator.containsKey(columnWithFunc)) {
                            accumulator.put(columnWithFunc, BigDecimal.ZERO);
                        }

                        BigDecimal currentAcc = (BigDecimal) accumulator.get(columnWithFunc);

                        accumulator.put(columnWithFunc, currentAcc.add(BigDecimal.ONE));
                        break;
                    }
                    case AVERAGE:
                        String columnWithFunc = "AVERAGE(" + column.columnName + ")";
                        if (!accumulator.containsKey(columnWithFunc)) {
                            accumulator.put(columnWithFunc, new Pair<>(BigDecimal.ZERO, BigDecimal.ZERO));
                        }

                        Pair<BigDecimal, BigDecimal> currentAcc = (Pair<BigDecimal, BigDecimal>) accumulator.get(columnWithFunc);
                        accumulator.put(
                                columnWithFunc,
                                new Pair<>(
                                        currentAcc.getValue0().add(documentValueBd),
                                        currentAcc.getValue1().add(BigDecimal.ONE)
                                )
                        );

                        break;
                    default:
                        throw new RuntimeException("Unexpected function type " + function);
                }
            }
        }
        return acc;
    }
}
