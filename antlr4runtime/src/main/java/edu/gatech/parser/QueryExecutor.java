package edu.gatech.parser;

import org.bson.Document;

public interface QueryExecutor {
    boolean breakTable();
    void applySelect(Document document);
    void done();
}
