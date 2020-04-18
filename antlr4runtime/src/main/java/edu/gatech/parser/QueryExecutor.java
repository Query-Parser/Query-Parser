package edu.gatech.parser;

import java.util.List;
import java.util.Map;

public interface QueryExecutor {
    boolean mustStopExecution();
    void applySelect(Map<String, Object> document);
    List<Map<String, Object>> collectOutput();
    void done();
}
