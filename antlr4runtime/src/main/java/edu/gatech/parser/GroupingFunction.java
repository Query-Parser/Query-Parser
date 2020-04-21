package edu.gatech.parser;

import org.javatuples.Pair;

import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

interface GroupingFunction extends Function<Map<String, Map<String, Object>>, Pair<List<Object>, Map<String, Map<String, Object>>>> {
}
