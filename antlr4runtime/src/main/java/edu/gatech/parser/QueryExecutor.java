package edu.gatech.parser;

import java.util.List;
import java.util.Map;

public interface QueryExecutor {
    boolean mustStopExecution();
    void acceptDocument(Map<String, Object> document);
    void done();
    List<Map<String, Object>> collectOutput();

    default QueryExecutor compose(QueryExecutor other) {
        return new QueryExecutor() {
            @Override
            public boolean mustStopExecution() {
                return QueryExecutor.this.mustStopExecution() || other.mustStopExecution();
            }

            @Override
            public void acceptDocument(Map<String, Object> document) {
                QueryExecutor.this.acceptDocument(document);
                List<Map<String, Object>> output = QueryExecutor.this.collectOutput();
                output.forEach(other::acceptDocument);
            }

            @Override
            public List<Map<String, Object>> collectOutput() {
                return other.collectOutput();
            }

            @Override
            public void done() {
                QueryExecutor.this.done();
                List<Map<String, Object>> output = QueryExecutor.this.collectOutput();
                output.forEach(other::acceptDocument);
                other.done();
            }
        };
    }
}
