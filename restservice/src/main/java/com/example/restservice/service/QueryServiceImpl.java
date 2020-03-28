package com.example.restservice.service;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;


@Service
public class QueryServiceImpl implements QueryService {

    public List<Map> innerJoin(List<Map> leftData, List<Map> rightData, String joinProperty) {
        List<Map> returnData = new ArrayList<Map>();
        for (Map leftObj: leftData) {
            Map returnObj = new HashMap(leftObj);
            for (Map rightObj: rightData)  {
                if (leftObj.get(joinProperty).equals(rightObj.get(joinProperty))) {
                    returnObj.put("join", rightObj);
                    returnData.add(returnObj);
                    break;
                }
            }
        }

        return returnData;
    }

    public List<Map> leftJoin(List<Map> leftData, List<Map> rightData, String joinProperty) {
        List<Map> returnData = new ArrayList<Map>();
        for (Map leftObj: leftData) {
            Map returnObj = new HashMap(leftObj);
            ArrayList<Map> results = new ArrayList<Map>();
            for (Map rightObj: rightData)  {
                if (leftObj.get(joinProperty).equals(rightObj.get(joinProperty))) {
                    results.add(rightObj);
                }
            }
            if (results.size() == 0) {
                returnObj.put("leftJoin", null);
            } else {
                returnObj.put("leftJoin", results);
            }
            returnData.add(returnObj);
        }

        return returnData;
    }

    public List<Map> rightJoin(List<Map> leftData, List<Map> rightData, String joinProperty) {
        List<Map> returnData = new ArrayList<Map>();
        for (Map rightObj: rightData) {
            Map returnObj = new HashMap(rightObj);
            ArrayList<Map> results = new ArrayList<Map>();
            for (Map leftObj: leftData)  {
                if (rightObj.get(joinProperty).equals(leftObj.get(joinProperty))) {
                    results.add(leftObj);
                }
            }
            if (results.size() == 0) {
                returnObj.put("rightJoin", null);
            } else {
                returnObj.put("rightJoin", results);
            }
            returnData.add(returnObj);
        }

        return returnData;
    }
}

