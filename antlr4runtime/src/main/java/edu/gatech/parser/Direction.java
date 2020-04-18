package edu.gatech.parser;

public enum Direction {
    ASC (1),
    DESC (-1);

    public final int value;

    Direction (int value) {
        this.value = value;
    }
}
