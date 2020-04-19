package edu.gatech.parser;

import java.util.List;
import java.util.Map;

public interface TransformationQueryNode extends SourceQueryNode {
    void acceptDocument(Map<String, Object> document);
    void done();

    default TransformationQueryNode compose(TransformationQueryNode other) {
        return new TransformationQueryNode() {
            @Override
            public boolean mustStopExecution() {
                return TransformationQueryNode.this.mustStopExecution() || other.mustStopExecution();
            }

            @Override
            public void acceptDocument(Map<String, Object> document) {
                TransformationQueryNode.this.acceptDocument(document);
                List<Map<String, Object>> output = TransformationQueryNode.this.collectOutput();
                output.forEach(other::acceptDocument);
            }

            @Override
            public List<Map<String, Object>> collectOutput() {
                return other.collectOutput();
            }

            @Override
            public void done() {
                TransformationQueryNode.this.done();
                List<Map<String, Object>> output = TransformationQueryNode.this.collectOutput();
                output.forEach(other::acceptDocument);
                other.done();
            }
        };
    }
}
