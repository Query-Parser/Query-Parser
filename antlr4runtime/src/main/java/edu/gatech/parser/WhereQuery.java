package edu.gatech.parser;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

@RequiredArgsConstructor
class WhereQuery implements TransformationQueryNode {
    @NonNull private final Predicate<Map<String, Map<String, Object>>> filter;
    private List<Map<String, Map<String, Object>>> buffer = new ArrayList<>();

    @Override
    public boolean mustStopExecution() {
        return false;
    }

    @Override
    public void acceptDocument(Map<String, Map<String, Object>> document) {
        if (filter.test(document)) {
            buffer.add(document);
        }
    }

    @Override
    public void done() { }

    @Override
    public List<Map<String, Map<String, Object>>> collectOutput() {
        List<Map<String, Map<String, Object>>> tmp = buffer;
        buffer = new ArrayList<>();
        return tmp;
    }
}
