package ast.TS;

import ast.ASTNode;

public class MapFilterIdentifier implements ASTNode {
    private final String left;
    private final String operator; // "." or ":"
    private final String right;

    public MapFilterIdentifier(String left, String operator, String right) {
        this.left = left;
        this.operator = operator;
        this.right = right;
    }

    public String getLeft() {
        return left;
    }

    public String getOperator() {
        return operator;
    }

    public String getRight() {
        return right;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "MapFilterIdentifier:");
        System.out.println(indent + "  Left: " + left);
        System.out.println(indent + "  Operator: " + operator);
        System.out.println(indent + "  Right: " + right);
    }

    @Override
    public String toString() {
        return left + " " + operator + " " + right;
    }

    @Override
    public String generate() {
        if (".".equals(operator)) {
            // JS object/field access
            return left + "." + right;
        } else if (":".equals(operator)) {
            // Object literal entry
            return left + ": " + right;
        }
        return left + " " + operator + " " + right;
    }

}
