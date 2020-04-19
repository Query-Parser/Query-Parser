package edu.gatech.parser;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.javatuples.Pair;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class LongToBigDecimal implements TransformationQueryNode {
    private List<Map<String, Object>> buffer = new ArrayList<>();

    @Override
    public boolean mustStopExecution() {
        return false;
    }

    @Override
    public void acceptDocument(Map<String, Object> document) {
        buffer.add(longToBigDecimal(document));
    }

    @Override
    public void done() { }

    @Override
    public List<Map<String, Object>> collectOutput() {
        List<Map<String, Object>> tmp = buffer;
        buffer = new ArrayList<>();
        return tmp;
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
                .collect(Collectors.toMap(Pair::getValue0, Pair::getValue1));
    }

}
