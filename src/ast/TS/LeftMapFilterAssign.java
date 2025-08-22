package ast.TS;

import ast.ASTNode;

public class LeftMapFilterAssign implements ASTNode {
    private String identifier;
    private String mapFilterIdentifier;

    public LeftMapFilterAssign(String identifier, String mapFilterIdentifier) {
        this.identifier = identifier;
        this.mapFilterIdentifier = mapFilterIdentifier;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "LeftAssign: " + identifier + " => " + mapFilterIdentifier);
    }

    @Override
    public String toString() {
        return identifier + " => " + mapFilterIdentifier;
    }
    @Override
    public String generate() {
        return identifier + " => " + mapFilterIdentifier;
    }

}
