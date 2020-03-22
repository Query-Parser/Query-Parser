package com.example.restservice.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

import java.util.List;
import java.util.Map;

@Service
public class QueryServiceImpl implements QueryService {

    @Autowired
    MongoTemplate mongoTemplate;

    public List<Map> find(Query query, String collectionName) {
        return mongoTemplate.find(query, Map.class, collectionName);
    }

    public List<Map> findAll(String collectionName) {
        return mongoTemplate.findAll(Map.class, collectionName);
    }

    public void createCollection(String collectionName) {
        mongoTemplate.createCollection(collectionName);
    }

    public void dropCollection(String collectionName) {
        mongoTemplate.dropCollection(collectionName);
    }

    public <T> void insert(T object, String collectionName) {
        mongoTemplate.insert(object, collectionName);
    }

    public void findAndModify(Query query, Update update, String collectionName) {
        mongoTemplate.findAndModify(query, update, Map.class, collectionName);
    }

    public void findAndRemove(Query query, String collectionName) {
        mongoTemplate.findAndRemove(query, Map.class, collectionName);
    }
}

