package edu.gatech.parser;

import org.javatuples.Pair;

import java.util.List;
import java.util.Map;
import java.util.function.Function;

interface HashJoinFunction extends Function<Map<String, Object>, Pair<List<Object>, Map<String, Object>>> {
}
