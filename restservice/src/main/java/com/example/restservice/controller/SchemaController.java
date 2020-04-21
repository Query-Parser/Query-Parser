package com.example.restservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;

import com.mongodb.MongoClient;
import com.mongodb.MongoQueryException;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoIterable;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;

import org.bson.Document;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;

import com.example.restservice.service.SchemaService;

@CrossOrigin(origins = "*")
@RestController
public class SchemaController {

    @Autowired
    private SchemaService schemaService;

    @Autowired
    private MongoClient mongoClient;

    @GetMapping("/dbNames")
    public Set<String> getDbNames() {
        return schemaService.getDbNames(mongoClient);
    }

    @PostMapping("/schema")
    public Map<String, HashSet<String>> getSchema(@RequestBody String dbName) {
        MongoDbFactory mongo = new SimpleMongoDbFactory(mongoClient, dbName);
        MongoTemplate mongoTemplate = new MongoTemplate(mongo);
        Map<String, HashSet<String>> tables = new HashMap<String, HashSet<String>>();
        Set<String> collectionNames = mongoTemplate.getCollectionNames();
        for (String name: collectionNames) {
            MongoCollection<Document> collection = mongoTemplate.getCollection(name);
            FindIterable<Document> documents = collection.find();
            documents.limit(1000);
            tables.put(name, new HashSet<String>());
            schemaService.getTables(documents, tables, name);
        }
        return tables;
    }
}