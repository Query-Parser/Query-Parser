package com.example.restservice.service;

import java.util.List;
import java.util.Map;

public interface QueryService {
    public abstract List<Map> innerJoin(List<Map> leftData, List<Map> rightData, String joinProperty);
    public abstract List<Map> leftJoin(List<Map> leftData, List<Map> rightData, String joinProperty);
    public abstract List<Map> rightJoin(List<Map> leftData, List<Map> rightData, String joinProperty);
}