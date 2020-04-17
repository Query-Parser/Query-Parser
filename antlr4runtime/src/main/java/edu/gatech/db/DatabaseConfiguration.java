package edu.gatech.db;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientOptions;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;
import com.mongodb.client.MongoDatabase;

public class DatabaseConfiguration {
    public final String hostname = "timbess.net";
    public final int portNumber = 9200;
    public final String username = "root";
    public final String password = "example";
    public final String database = "admin";
    public MongoClient mongoClient;

    public DatabaseConfiguration() {
        connect();
    }

    private void connect() {
        MongoClientOptions.Builder option = MongoClientOptions.builder().serverSelectionTimeout(3600);
        MongoCredential credential = MongoCredential.createCredential(username, database, password.toCharArray());
        this.mongoClient = new MongoClient(new ServerAddress(hostname, portNumber), credential, option.build());
    };

    public MongoDatabase getDatabase(String databaseName) {
        return mongoClient.getDatabase(databaseName);
    }
}
