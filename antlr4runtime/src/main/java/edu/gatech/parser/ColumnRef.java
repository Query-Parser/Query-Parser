package edu.gatech.parser;

import lombok.Value;

@Value
public class ColumnRef {
    public String table;
    public String columnName;
}
