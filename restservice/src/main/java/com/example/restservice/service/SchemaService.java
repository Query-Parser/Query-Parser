package com.example.restservice.service;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.MongoClient;
import org.bson.Document;
import java.util.Set;
import java.util.Map;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ArrayList;

public interface SchemaService {
    public Set<String> getDbNames(MongoClient mongoClient);
    public abstract void getTables(FindIterable<Document> documents, Map<String, HashSet<String>> tables,
                                   String collectionName);
    public void getColumns(String key, Document doc, Map<String, HashSet<String>> tables, String currentTable,
                           String parentName);
    public void handleObjectFields(String key, Document doc, Map<String, HashSet<String>> tables, String currentTable,
                                   String parentName);
    public void handleArrayFields(int index, ArrayList<Object> array, Map<String, HashSet<String>> tables,
                                  String currentTable, String parentName);
}