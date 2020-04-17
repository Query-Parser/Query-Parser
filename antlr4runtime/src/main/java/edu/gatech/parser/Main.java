package edu.gatech.parser;

import com.mongodb.*;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import edu.gatech.db.DatabaseConfiguration;
import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.*;
import org.bson.Document;

import java.math.BigDecimal;
import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import static edu.gatech.parser.MySQLQueryParser.*;

public class Main {
    private static MongoDatabase db = dbConfig();
    private static ObjectMapper mapper = new ObjectMapper();
    public static void main(String[] args) {
        String query = "select C._id as ci, E._id as ei from Customers C, Employees E limit 5;"; // TODO: replace by args later
        if (args != null && args.length == 1) {
            query = args[0];
        }
        DatabaseConfiguration dbConfig = new DatabaseConfiguration();
        SQLEngine sqlEngine = new SQLEngine(dbConfig);
        Map<String, List<Map<String, Object>>> output = sqlEngine.execute(query);
        try {
            System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(output));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }

    private static MongoDatabase dbConfig() {
        MongoDatabase db = null;
        MongoClientOptions.Builder option = MongoClientOptions.builder().serverSelectionTimeout(3600);
        MongoCredential credential = MongoCredential.createCredential("root", "admin", "example".toCharArray());
        MongoClient mongoClient = new MongoClient(new ServerAddress("timbess.net", 9200), credential, option.build());
        db = mongoClient.getDatabase("test");

        return db;
    }
}