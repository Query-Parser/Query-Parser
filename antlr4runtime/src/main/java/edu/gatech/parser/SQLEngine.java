package edu.gatech.parser;

import java.util.Map;
import java.util.List;

public interface SQLEngine {
    public List<Map<String, Object>> execute(String query);
}
