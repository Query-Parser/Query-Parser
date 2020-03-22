package com.example.restservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.mongodb.client.MongoDatabase;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoIterable;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;

import org.bson.Document;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;

import com.example.restservice.service.SchemaService;

@RestController
public class SchemaController {

    @Autowired
    SchemaService schemaService;

    @Autowired
    MongoTemplate mongoTemplate;

    @GetMapping("/schema")
    public Map<String, HashSet<String>> getSchema() {
        Set<String> collectionNames = mongoTemplate.getCollectionNames();

        // Iterate through all collections in database and generate necessary tables for schema
        Map<String, HashSet<String>> tables = new HashMap<String, HashSet<String>>();
        for (String name: collectionNames) {
            MongoCollection<Document> collection = mongoTemplate.getCollection(name);
            FindIterable<Document> documents = collection.find();

            tables.put(name, new HashSet<String>());
            schemaService.getTables(documents, tables, name);
        }

        return tables;
    }
}