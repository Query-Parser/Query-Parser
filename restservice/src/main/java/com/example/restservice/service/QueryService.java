package com.example.restservice.service;

import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

import java.util.List;
import java.util.Map;

public interface QueryService {
    public abstract List<Map> find(Query query, String collectionName);
    public abstract List<Map> findAll(String collectionName);
    public abstract void createCollection(String collectionName);
    public abstract void dropCollection(String collectionName);
    public abstract <T> void insert(T object, String collectionName);
    public abstract void findAndModify(Query query, Update update, String collectionName);
    public abstract void findAndRemove(Query query, String collectionName);
    // TODO: join
}