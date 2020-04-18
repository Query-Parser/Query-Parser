package edu.gatech.parser;

import org.javatuples.Pair;

import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;

interface AggregationFunction extends BiFunction<Pair<List<Object>, Map<String, Object>>, Map<String, Object>, Map<String, Object>> {
}
