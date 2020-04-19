package edu.gatech.parser;

import lombok.NonNull;
import lombok.Value;

import javax.swing.*;
import java.util.Map;

@Value
public class ColumnRef {
    public String table;
    @NonNull public String columnName;

    public ColumnRef resolveAlias(Map<String, String> aliasToTableName) {
        return new ColumnRef(
                aliasToTableName.getOrDefault(table, table),
                columnName
        );
    }

    public static ColumnRef of(MySQLQueryParser.ColumnItemContext columnName) {
        return new ColumnRef(
                columnName.prefix() != null ? columnName.prefix().WORD().getSymbol().getText() : null,
                columnName.columnName().WORD().getSymbol().getText()
        );
    }
}
