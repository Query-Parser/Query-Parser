package edu.gatech.parser;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.javatuples.Pair;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RequiredArgsConstructor
class JoinNode implements SourceQueryNode {
    @NonNull final private SourceQueryNode left;
    @NonNull final private SourceQueryNode right;
    private List<Map<String, Map<String, Object>>> output = new ArrayList<>();
    /**
     * Pairs MUST be (LeftTableColumn, RightTableColumn). Never in the reverse order
     */
    @NonNull final private List<Pair<ColumnRef, ColumnRef>> joinColumns;
    final private Map<Set<Pair<ColumnRef, Object>>, List<Map<String, Map<String, Object>>>> hashJoinMap = new HashMap<>();

    @Override
    public boolean mustStopExecution() {
        return false;
    }

    @Override
    public List<Map<String, Map<String, Object>>> collectOutput() {
        List<Map<String, Map<String, Object>>> docs;
        while ((docs = left.collectOutput()) != null) {
            docs.forEach((doc) -> {
                Set<Pair<ColumnRef, Object>> joinValues = joinColumns.stream()
                        .filter(x -> {
                            ColumnRef col = x.getValue0();
                            return doc.containsKey(col.getTable()) && doc.get(col.getTable()).containsKey(col.getColumnName());
                        })
                        .map(x -> {
                            ColumnRef left = x.getValue0();
                            ColumnRef right = x.getValue1();
                            return new Pair<>(right, doc.get(left.getTable()).get(left.getColumnName()));
                        }).collect(Collectors.toSet());
                if (joinColumns.size() == joinValues.size()) {
                    List<Map<String, Map<String, Object>>> leftDocs = hashJoinMap.getOrDefault(joinValues, new ArrayList<>());
                    hashJoinMap.put(joinValues, leftDocs);
                    leftDocs.add(doc);
                }
            });
        }

        while ((docs = right.collectOutput()) != null) {
            docs.forEach((doc) -> {
                Set<Pair<ColumnRef, Object>> joinValues = joinColumns.stream()
                        .filter(x -> {
                            ColumnRef col = x.getValue1();
                            return doc.containsKey(col.getTable()) && doc.get(col.getTable()).containsKey(col.getColumnName());
                        })
                        .map(x -> {
                            ColumnRef right = x.getValue1();
                            return new Pair<>(right, doc.get(right.getTable()).get(right.getColumnName()));
                        }).collect(Collectors.toSet());
                if (joinValues.size() == joinColumns.size()) {
                    List<Map<String, Map<String, Object>>> leftDocs = hashJoinMap.getOrDefault(joinValues, Collections.emptyList());
                    List<Map<String, Map<String, Object>>> joined = leftDocs.stream().map(x -> Stream.of(x, doc)
                            .flatMap(map -> map.entrySet().stream())
                            .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue))).collect(Collectors.toList());
                    output.addAll(joined);
                }
            });
        }

        List<Map<String, Map<String, Object>>> tmp = output;
        output = new ArrayList<>();
        return tmp.isEmpty() ? null : tmp;
    }
}
