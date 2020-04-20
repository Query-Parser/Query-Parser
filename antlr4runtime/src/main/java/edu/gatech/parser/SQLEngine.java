package edu.gatech.parser;

import edu.gatech.db.DatabaseConfiguration;
import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SQLEngine {
    private DatabaseConfiguration db;

    public SQLEngine(DatabaseConfiguration db) {
        this.db = db;
    }

    public List<Map<String, Object>> execute(String query) {
        MySQLQueryLexer lexer = new MySQLQueryLexer(CharStreams.fromString(query));
        MySQLQueryParser parser = new MySQLQueryParser(new BufferedTokenStream(lexer));
        List<Map<String, Object>> output = new ArrayList<>();
        MySQLQueryBaseListener listener = new ASTInterpreter(output, db.getDatabase("test"));

        ParseTreeWalker.DEFAULT.walk(listener, parser.query());
        return output;
    }
}
