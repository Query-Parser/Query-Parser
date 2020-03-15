package com.example.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mongodb.client.MongoDatabase;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoIterable;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;

import org.bson.Document;
import java.util.Map;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ArrayList;

@RestController
public class SchemaController {

    @GetMapping("/schema")
    public Map<String, HashSet<String>> getSchema() {
        // Connecting to database and getting database instance
        MongoClientURI uri = new MongoClientURI("mongodb://root:example@timbess.net:9200/?authSource=admin&readPreference=primary&appname=MongoDB%20Compass&ssl=false");
        MongoClient mongo = new MongoClient(uri);
        MongoDatabase db = mongo.getDatabase("test");

        // Getting collections in database
        MongoIterable<String> collectionNames = db.listCollectionNames();

        // Iterate through all collections in database and generate necessary tables for schema
        Map<String, HashSet<String>> tables = new HashMap<String, HashSet<String>>();
        for (String name: collectionNames) {
            MongoCollection<Document> collection = db.getCollection(name);
            FindIterable<Document> documents = collection.find();

            tables.put(name, new HashSet<String>());
            getTables(documents, tables, name);
        }

        return tables;
    }

    private void getTables(FindIterable<Document> documents,  Map<String, HashSet<String>> tables, String collectionName) {
        for (Document doc: documents) {
            for (String key: doc.keySet()) {
                getColumns(key, doc, tables, collectionName, null);
            }
        }
    }

    private void getColumns(String key, Document doc, Map<String, HashSet<String>> tables, String currentTable, String parentName) {
        if (doc == null) {
            return;
        }
        if (doc.get(key) instanceof ArrayList) {
            // Create a new table
            HashSet<String> cols = new HashSet<String>();
            cols.add("_id");
            cols.add(currentTable + "ID");
            cols.add("Index");
            tables.put(currentTable + "_" + key, cols);

            // Iterate through elements of array
            ArrayList<Object> array = (ArrayList<Object>) doc.get(key);
            handleArrayFields(0, array, tables, currentTable + "_" + key, parentName);
        } else if (doc.get(key) instanceof Document) {
            Document newDoc = (Document) doc.get(key);
            handleObjectFields(key, newDoc, tables, currentTable, parentName);
        } else if (parentName != null) {
            tables.get(currentTable).add(parentName + "." + key);
        } else {
            tables.get(currentTable).add(key);
        }
    }

    private void handleObjectFields(String key, Document doc, Map<String, HashSet<String>> tables, String currentTable, String parentName) {
        String newParentName = key;
        if (parentName != null) {
            newParentName = parentName + "." + key;
        }
        // Iterate through all properties of object
        for (String property: doc.keySet()) {
            getColumns(property, doc, tables, currentTable, newParentName);
        }
    }

    private void handleArrayFields(int index, ArrayList<Object> array, Map<String, HashSet<String>> tables, String currentTable, String parentName) {
        if (index >= array.size()) {
            return;
        }

        if (array.get(index) instanceof ArrayList) {
            // Element of array is another array
            // Creates new table
            HashSet<String> cols = new HashSet<String>();
            cols.add("_id");
            cols.add(currentTable + "ID");
            cols.add("Index");
            tables.put(currentTable + "_" + index, cols);

            // Iterate through elements of array
            ArrayList<Object> newArray = (ArrayList<Object>) array.get(index);
            handleArrayFields(0, newArray, tables, currentTable + "_" + index, parentName);
        } else if (array.get(index) instanceof Document) {
            // Element of array is an object
            Document newDoc = (Document) array.get(index);
            handleObjectFields(currentTable, newDoc, tables, currentTable, parentName);
        } else {
            // Element of array is not an object or array
            tables.get(currentTable).add(currentTable + "Value");
        }
        // Iterate through every element of array
        handleArrayFields(index + 1, array, tables, currentTable, parentName);
    }

}