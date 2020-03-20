package com.example.restservice.service;

import org.springframework.stereotype.Service;

import com.mongodb.client.MongoDatabase;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;

@Service
public class MongoDBServiceImpl implements MongoDBService {

    public MongoDatabase getDB() {
        return getMongoClient().getDatabase("test");
    }

    public MongoClient getMongoClient() {
        return new MongoClient(getMongoClientURI());
    }

    public MongoClientURI getMongoClientURI() {
       return new MongoClientURI("mongodb://root:example@timbess.net:9200/?authSource=admin&readPreference=primary&appname=MongoDB%20Compass&ssl=false");
    }
}

