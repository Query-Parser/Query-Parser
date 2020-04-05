package edu.gatech.parser;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientOptions;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;
import com.mongodb.client.MongoDatabase;
import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

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
            public void enterQuery(MySQLQueryParser.QueryContext ctx) {
                System.out.println("Enter Query");
            }

            @Override
            public void exitQuery(MySQLQueryParser.QueryContext ctx) {
                System.out.println("Exit Query");
            }

            @Override
            public void enterSelectStatement(MySQLQueryParser.SelectStatementContext ctx) {
                System.out.println("selecting from: ");
                ctx.fromClause().tableList().tableItem().forEach((item) -> {
                    item.tableName().WORD().forEach(word -> System.out.println(word.getSymbol().getText()));
                });
            }

            @Override
            public void exitSelectStatement(MySQLQueryParser.SelectStatementContext cxt) {
                System.out.println("done selecting");
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