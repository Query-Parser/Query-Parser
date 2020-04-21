package edu.gatech.parser;

import org.javatuples.Pair;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class LongToBigDecimal implements TransformationQueryNode {
    private List<Map<String, Map<String, Object>>> buffer = new ArrayList<>();

    @Override
    public boolean mustStopExecution() {
        return false;
    }

    @Override
    public void acceptDocument(Map<String, Map<String, Object>> document) {
        buffer.add(longToBigDecimalTables(document));
    }

    @Override
    public void done() { }

    @Override
    public List<Map<String, Map<String, Object>>> collectOutput() {
        List<Map<String, Map<String, Object>>> tmp = buffer;
        buffer = new ArrayList<>();
        return tmp;
    }

    private Map<String, Map<String, Object>> longToBigDecimalTables(Map<String, Map<String, Object>> document) {
        return document.entrySet().stream()
                .map((x) -> Map.entry(x.getKey(), longToBigDecimal(x.getValue())))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }

    private Map<String, Object> longToBigDecimal(Map<String, Object> document) {
        return document.entrySet().stream()
                .map((x) -> {
                    String key = x.getKey();
                    Object value = x.getValue();
                    if (value instanceof Number) {
                        return new Pair<>(key, new BigDecimal(value.toString()));
                    } else if (value instanceof Map) {
                        return new Pair<>(key, longToBigDecimal((Map<String, Object>) value));
                    } else {
                        return new Pair<>(key, value);
                    }
                })
                .collect(HashMap::new, (map, pair) -> map.put(pair.getValue0(), pair.getValue1()), HashMap::putAll);
    }

}
