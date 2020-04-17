package edu.gatech.parser;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import edu.gatech.db.DatabaseConfiguration;

import java.util.List;
import java.util.Map;

public class Main {
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
}