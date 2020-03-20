package com.example.restservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

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

import com.example.restservice.service.SchemaService;

@RestController
public class SchemaController {

    @Autowired
    SchemaService schemaService;

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
            schemaService.getTables(documents, tables, name);
        }

        return tables;
    }
}