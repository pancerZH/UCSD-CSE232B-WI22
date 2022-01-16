package edu.ucsd.cse232b.expression;

public enum Comparator {

    EQS("="),
    EQ("eq"),
    ISS("=="),
    IS("is");

    private final String op;

    Comparator(final String str) {
        this.op = str;
    }

    @Override
    public String toString() {
        return op;
    }

    public static Comparator fromString(final String operator) {
        for (Comparator b : Comparator.values()) {
            if (b.op.equalsIgnoreCase(operator)) {
                return b;
            }
        }
        return null;
    }
}
