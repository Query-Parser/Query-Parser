package edu.gatech.parser;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.javatuples.Pair;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RequiredArgsConstructor
class JoinNode implements SourceQueryNode {
    @NonNull final private SourceQueryNode left;
    @NonNull final private String leftTable;
    @NonNull final private SourceQueryNode right;
    @NonNull final private String rightTable;
    private List<Map<String, Object>> output = new ArrayList<>();
    /**
     * Pairs MUST be (LeftTableColumn, RightTableColumn). Never in the reverse order
     */
    @NonNull final private List<Pair<ColumnRef, ColumnRef>> joinColumns;
    final private Map<Set<Pair<String, Object>>, List<Map<String, Object>>> hashJoinMap = new HashMap<>();

    @Override
    public boolean mustStopExecution() {
        return false;
    }

    @Override
    public List<Map<String, Object>> collectOutput() {
        List<Map<String, Object>> docs;
        while (!(docs = left.collectOutput()).isEmpty()) {
            docs.forEach((doc) -> {
                Set<Pair<String, Object>> joinValues = joinColumns.stream()
                        .filter(x -> doc.containsKey(x.getValue0().columnName))
                        .map(x -> new Pair<>(x.getValue1().columnName, doc.get(x.getValue0().columnName))).collect(Collectors.toSet());
                if (joinColumns.size() == joinValues.size()) {
                    List<Map<String, Object>> leftDocs = hashJoinMap.getOrDefault(joinValues, new ArrayList<>());
                    hashJoinMap.put(joinValues, leftDocs);
                    leftDocs.add(doc);
                }
            });
        }

        while (!(docs = right.collectOutput()).isEmpty()) {
            docs.forEach((doc) -> {
                Set<Pair<String, Object>> joinValues = joinColumns.stream()
                        .filter(x -> doc.containsKey(x.getValue1().columnName))
                        .map(x -> new Pair<>(x.getValue1().columnName, doc.get(x.getValue1().columnName))).collect(Collectors.toSet());
                if (joinValues.size() == joinColumns.size()) {
                    List<Map<String, Object>> leftDocs = hashJoinMap.getOrDefault(joinValues, Collections.emptyList());
                    List<Map<String, Object>> joined = leftDocs.stream().map(x -> Map.of(leftTable, (Object) x, rightTable, (Object) doc)).collect(Collectors.toList());
                    output.addAll(joined);
                }
            });
        }

        List<Map<String, Object>> tmp = output;
        output = new ArrayList<>();
        return tmp;
    }
}
