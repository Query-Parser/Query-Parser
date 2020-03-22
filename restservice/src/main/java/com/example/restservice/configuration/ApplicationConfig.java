package com.example.restservice.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;

@Configuration
public class ApplicationConfig {

    @Bean
    public MongoClient mongoClient() throws Exception {
        MongoClientURI uri = new MongoClientURI("mongodb://root:example@timbess.net:9200/?authSource=admin&readPreference=primary&appname=MongoDB%20Compass&ssl=false");
        return new MongoClient(uri);
    }

    @Bean
    public MongoTemplate mongoTemplate() throws Exception {
        String dbName = "test";
        MongoDbFactory mongo = new SimpleMongoDbFactory(mongoClient(), dbName);
        return new MongoTemplate(mongo);
    }

}