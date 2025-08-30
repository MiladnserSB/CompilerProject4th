package ast.TS;

import ast.ASTNode;

public class IfBody implements ASTNode {
    private String leftIdentifier;
    private String value;

    public IfBody(String leftIdentifier, String value) {
        this.leftIdentifier = leftIdentifier;
        this.value = value;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "IfBody:");
        System.out.println(indent + "  this." + leftIdentifier + " = " + value);
    }

    @Override
    public String toString() {
        return "this." + leftIdentifier + " = " + value;
    }

    @Override
    public String generate() {
        return   leftIdentifier + " = " + value + ";";
    }
}