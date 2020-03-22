package com.example.restservice.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import java.lang.String;

@CrossOrigin(origins = "*")
@RestController
public class QueryController {

    @ResponseBody
    @RequestMapping(value = "/query", method = RequestMethod.POST)
    public String query(@RequestBody String resultQuery) {
        return resultQuery;
    }
}