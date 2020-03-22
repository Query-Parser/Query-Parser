package com.example.restservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.mongodb.client.MongoDatabase;
import com.mongodb.MongoClient;
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

    @GetMapping("/schema")
    public Map<String, Map<String, HashSet<String>>> getSchema() {
        MongoCursor<String> dbsCursor = mongoClient.listDatabaseNames().iterator();
        Map<String, Map<String, HashSet<String>>> dbs = new HashMap<String, Map<String, HashSet<String>>>();

        while(dbsCursor.hasNext()) {
            String dbName = dbsCursor.next();
            MongoDbFactory mongo = new SimpleMongoDbFactory(mongoClient, dbName);
            MongoTemplate mongoTemplate = new MongoTemplate(mongo);

            if (dbName.equals("config")) {
                // do not have permission to list collections in config db...
                continue;
            }

            Map<String, HashSet<String>> tables = new HashMap<String, HashSet<String>>();
            dbs.put(dbName, tables);
            Set<String> collectionNames = mongoTemplate.getCollectionNames();

            for (String name: collectionNames) {
                MongoCollection<Document> collection = mongoTemplate.getCollection(name);
                FindIterable<Document> documents = collection.find();

                tables.put(name, new HashSet<String>());
                schemaService.getTables(documents, tables, name);
            }
        }

        return dbs;
    }
}