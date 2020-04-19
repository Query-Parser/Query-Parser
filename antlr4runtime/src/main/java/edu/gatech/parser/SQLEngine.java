package edu.gatech.parser;

import edu.gatech.db.DatabaseConfiguration;
import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SQLEngine {
    private DatabaseConfiguration db;

    public SQLEngine(DatabaseConfiguration db) {
        this.db = db;
    }

    public Map<String, List<Map<String, Object>>> execute(String query, String currentDbName) {
        MySQLQueryLexer lexer = new MySQLQueryLexer(CharStreams.fromString(query));
        MySQLQueryParser parser = new MySQLQueryParser(new BufferedTokenStream(lexer));
        Map<String, List<Map<String, Object>>> output = new HashMap<>();
        MySQLQueryBaseListener listener = new ASTInterpreter(output, db.getDatabase(currentDbName));

        ParseTreeWalker.DEFAULT.walk(listener, parser.query());
        return output;
    }
}
