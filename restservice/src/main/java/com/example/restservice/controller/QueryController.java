package com.example.restservice.controller;

//import edu.gatech.parser.Main;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
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
    public String getQuery() {
        return template;
    }

//    @ResponseBody
//    @GetMapping(value = "/query")
//    public String getQuery(@RequestBody String query) {
//        // TODO: change to pass in query to main method instead of test dummy variable
//        System.out.println("query");
//        String[] test = new String[1];
//        Main.main(test);
//        // TODO: return data from main method
//        return query;
//    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public String getTemplate() {
        return template;
    }
}