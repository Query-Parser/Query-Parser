package com.example.restservice.controller;

import com.example.restservice.service.SchemaService;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mongodb.MongoClient;

import edu.gatech.db.DatabaseConfiguration;
import edu.gatech.parser.SQLEngine;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;


@CrossOrigin(origins = "*")
@RestController
public class QueryController {

    @Autowired
    private SchemaService schemaService;

    @Autowired
    private MongoClient mongoClient;

    private String currentDbName;

   @ResponseBody
   @PostMapping(value = "/query")
   public Map<String, List<Map<String, Object>>> getQuery(@RequestBody String query) {
//       System.out.println("getting resulting data");
       if (currentDbName == null) {
            Set<String> dbNames = schemaService.getDbNames(mongoClient);
            System.out.println(dbNames);
            currentDbName = dbNames.iterator().next();
       }

       if (query.startsWith("use")) {
           int index = query.indexOf(" ");
           currentDbName = query.substring(index + 1, query.length() - 1);
       }

       System.out.println(currentDbName);
       DatabaseConfiguration dbConfig = new DatabaseConfiguration();
       SQLEngine sqlEngine = new SQLEngine(dbConfig);
       return sqlEngine.execute(query, currentDbName);
   }

   @GetMapping(value = "/currentDb")
    public String getCurrentDbName() {
       if (currentDbName == null) {
           Set<String> dbNames = schemaService.getDbNames(mongoClient);
           System.out.println(dbNames);
           currentDbName = dbNames.iterator().next();
       }
       return currentDbName;
   }

}