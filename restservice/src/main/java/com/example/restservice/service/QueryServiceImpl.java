package com.example.restservice.service;

import org.springframework.stereotype.Service;

import com.mongodb.MongoClientURI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

import java.util.List;
import java.util.Map;

import com.example.restservice.service.MongoDBService;

@Service
public class QueryServiceImpl implements QueryService {

    @Autowired
    MongoTemplate mongoTemplate;

    @Autowired
    MongoDBService mongoDBService;

    private void setup() {
        String dbName = "test";
        MongoDbFactory mongo = new SimpleMongoDbFactory(mongoDBService.getMongoClient(), dbName);
        mongoTemplate = new MongoTemplate(mongo);
    }

    public List<Map> find(Query query) {
        setup();
//        Query query = new Query();
//        query.addCriteria(Criteria.where("CustomerID").is("10"));
        return mongoTemplate.find(query, Map.class, "Customers");
    }

    public List<Map> findAll(String collectionName) {
        setup();
        return mongoTemplate.findAll(Map.class, "testingSchema");
    }

}

