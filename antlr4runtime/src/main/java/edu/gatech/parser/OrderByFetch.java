package edu.gatech.parser;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Sorts;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.javatuples.Pair;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RequiredArgsConstructor
public class OrderByFetch implements SourceQueryNode {
    @NonNull final private String tableName;
    @NonNull final private MongoDatabase db;
    @NonNull final private List<Pair<String, Integer>> orderList;
    private MongoCollection<Document> collection = null;
    private Iterator<Document> docs = null;
    private static final int BATCH_SIZE = 100;

    private Iterator<Document> applyOrderBy(MongoCollection<Document> collection) {
        List<Bson> columnSorts = orderList.stream()
                .map((x) -> x.getValue1() > 0 ? Sorts.ascending(x.getValue0()) : Sorts.descending(x.getValue0()))
                .collect(Collectors.toList());

        MongoCursor<Document> cursor;
        if (!columnSorts.isEmpty()) {
            cursor = collection.find().sort(Sorts.orderBy(columnSorts)).cursor();
        } else {
            cursor = collection.find().cursor();
        }
        return cursor;
    }

    @Override
    public boolean mustStopExecution() {
        return false;
    }

    @Override
    public List<Map<String, Map<String, Object>>> collectOutput() {
        if (collection == null) {
            collection = db.getCollection(tableName);
        }
        if (docs == null) {
            docs = applyOrderBy(collection);
        }
        if (!docs.hasNext()) {
            return null;
        }

        int n = BATCH_SIZE;
        List<Map<String, Map<String, Object>>> batch = new ArrayList<>();
        while (docs.hasNext() && n > 0) {
            batch.add(Map.of(tableName, docs.next()));
            n--;
        }
        return batch;
    }
}
