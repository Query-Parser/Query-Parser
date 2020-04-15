package edu.gatech.parser;

import edu.gatech.db.DatabaseConfiguration;
import org.bson.Document;

import java.util.Map;
import java.util.List;

public class SQLEngine {
    private DatabaseConfiguration db;

    public SQLEngine(DatabaseConfiguration db) {
        this.db = db;
    }

    public Map<String, List<Document>> execute(String query) {
        return null;
    }
}
