package edu.gatech.parser;

import org.bson.Document;

public interface QueryExecutor {
    boolean limitReached();

    void applySelect(Document document);
}
