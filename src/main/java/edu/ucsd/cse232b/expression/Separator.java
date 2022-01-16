package edu.ucsd.cse232b.expression;

public enum Separator {

    LPR("("),
    RPR(")"),
    LSB("["),
    RSB("]"),
    COMMA(",");

    private final String op;

    Separator(final String str) {
        this.op = str;
    }

    @Override
    public String toString() {
        return op;
    }

    public static Separator fromString(final String operator) {
        for (Separator b : Separator.values()) {
            if (b.op.equalsIgnoreCase(operator)) {
                return b;
            }
        }
        return null;
    }
}
