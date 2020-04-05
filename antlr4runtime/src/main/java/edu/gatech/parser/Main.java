package edu.gatech.parser;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientOptions;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.bson.conversions.Bson;

import java.util.ArrayList;
import java.util.List;

import static edu.gatech.parser.MySQLQueryParser.*;

public class Main {
    private static MongoDatabase db;

    public static void main(String[] args) {
        System.out.println("hello world");
        db = dbConfig();
        String query = "select * from foo, bar, baz"; // TODO: replace by args later
        MySQLQueryLexer lexer = new MySQLQueryLexer(CharStreams.fromString(query));
        MySQLQueryParser parser = new MySQLQueryParser(new BufferedTokenStream(lexer));
        MySQLQueryBaseListener listener = new MySQLQueryBaseListener() {


            @Override
            public void enterQuery(QueryContext ctx) {
                System.out.println("Enter Query");
            }

            @Override
            public void exitQuery(QueryContext ctx) {
                System.out.println("Exit Query");
            }

            @Override
            public void enterSelectStatement(SelectStatementContext ctx) {
                System.out.println("selecting from: ");

                ctx.fromClause().tableList().tableItem().forEach((item) -> {
                    item.tableName().WORD().forEach(word -> System.out.println(word.getSymbol().getText()));
                });
            }

            @Override
            public void exitSelectStatement(SelectStatementContext cxt) {
                System.out.println("done selecting");
            }

            @Override
            public void enterFromClause(FromClauseContext ctx) {
//                List<MongoCollection> collections = new ArrayList<>();
                System.out.println("Enter From Clause");
//
//                for (TableItemContext item : ctx.tableList().tableItem()) {
//                    for (TerminalNode tableName : item.tableName().WORD()) {
//                        collections.add(db.getCollection(tableName.getSymbol().getText()));
//                    }
//                }
            }

            @Override
            public void exitFromClause(FromClauseContext ctx) {
                super.exitFromClause(ctx);
            }


        };
        ParseTreeWalker.DEFAULT.walk(listener, parser.query());
    }

    private static MongoDatabase dbConfig() {
        MongoDatabase db = null;
        MongoClientOptions.Builder option = MongoClientOptions.builder().serverSelectionTimeout(3600);
        MongoCredential credential = MongoCredential.createCredential("root", "admin", "example".toCharArray());
        MongoClient mongoClient = new MongoClient(new ServerAddress("timbess.net", 9200), credential, option.build());
        db = mongoClient.getDatabase("test");

        return db;
    }
}