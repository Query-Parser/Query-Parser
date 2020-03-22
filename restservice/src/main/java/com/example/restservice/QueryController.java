package com.example.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;


@CrossOrigin(origins = "*")
@RestController
public class QueryController {

    private static final String query = "Null";

    @GetMapping("/query")
    public String query() {
        return query;
    }
}