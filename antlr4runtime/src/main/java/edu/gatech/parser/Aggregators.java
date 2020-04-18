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
    private Map<Func, Set<ColumnRef>> functionToColumn;

    @Override
    public Map<String, Object> apply(Pair<List<Object>, Map<String, Object>> document, Map<String, Object> accumulator) {
        if (accumulator == null) {
            accumulator = new HashMap<>();
        }
        for (Map.Entry<Func, Set<ColumnRef>> entry : functionToColumn.entrySet()) {
            for (ColumnRef columnRef : entry.getValue()) {
                Pair<Func, ColumnRef> funcColumn = new Pair<>(entry.getKey(), columnRef);
                Func function = funcColumn.getValue0();
                ColumnRef column = funcColumn.getValue1();
                Object documentValue = document.getValue1().get(column.columnName);
                if (!(documentValue instanceof Number)) return accumulator;
                BigDecimal documentValueBd = new BigDecimal(documentValue.toString());
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
        return accumulator;
    }
}
