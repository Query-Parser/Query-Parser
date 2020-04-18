package com.example.restservice.controller;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import edu.gatech.db.DatabaseConfiguration;
import edu.gatech.parser.SQLEngine;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@CrossOrigin(origins = "*")
@RestController
public class QueryController {

    private String template = "Null";

    @ResponseBody
    @PostMapping(value = "/query")
    public String setQuery(@RequestBody String resultQuery) {
        setTemplate(resultQuery);
        return getTemplate();
    }

   @ResponseBody
   @GetMapping(value = "/query")
   public Map<String, List<Map<String, Object>>> getQuery() {
       System.out.println("getting resulting data");
       DatabaseConfiguration dbConfig = new DatabaseConfiguration();
       SQLEngine sqlEngine = new SQLEngine(dbConfig);
       return sqlEngine.execute(getTemplate());
   }

    public void setTemplate(String template) {
        this.template = template;
    }

    public String getTemplate() {
        return template;
    }
}