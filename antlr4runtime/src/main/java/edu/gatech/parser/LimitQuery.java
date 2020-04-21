package edu.gatech.parser;

import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RequiredArgsConstructor
class LimitQuery implements TransformationQueryNode {
    private final int limit;
    private int count = 0;
    private List<Map<String, Map<String, Object>>> buffer = new ArrayList<>();

    @Override
    public boolean mustStopExecution() {
        return count >= limit;
    }

    @Override
    public void acceptDocument(Map<String, Map<String, Object>> document) {
        count++;
        if (count <= limit) {
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
