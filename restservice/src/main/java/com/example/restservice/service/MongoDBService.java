package com.example.restservice.service;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoDatabase;

public interface MongoDBService {
    public abstract MongoDatabase getDB();
    public abstract MongoClient getMongoClient();
    public abstract MongoClientURI getMongoClientURI();
}