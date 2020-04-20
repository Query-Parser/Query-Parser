package edu.gatech.parser;

import java.util.List;
import java.util.Map;

public interface SourceQueryNode {
    boolean mustStopExecution();
    List<Map<String, Map<String, Object>>> collectOutput();

    default SourceQueryNode compose(TransformationQueryNode other) {
        return new SourceQueryNode() {
            @Override
            public boolean mustStopExecution() {
                return SourceQueryNode.this.mustStopExecution() || other.mustStopExecution();
            }

            @Override
            public List<Map<String, Map<String, Object>>> collectOutput() {
                List<Map<String, Map<String, Object>>> output = SourceQueryNode.this.collectOutput();
                if (!output.isEmpty()) {
                    output.forEach(other::acceptDocument);
                } else {
                    other.done();
                }
                return other.collectOutput();
            }
        };
    }
}
