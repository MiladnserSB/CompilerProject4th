package ast.TS;

import ast.ASTNode;

public class CrudBody implements ASTNode {
    private String identifier; // e.g., 'productsSubject'
    private String action;     // e.g., 'next' or 'value'

    public CrudBody(String identifier, String action) {
        this.identifier = identifier;
        this.action = action;
    }

    public String getIdentifier() {
        return identifier;
    }

    public String getAction() {
        return action;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "CrudBody: this." + identifier + "." + action);
    }

    @Override
    public String toString() {
        return "this." + identifier + "." + action;
    }

    @Override
    public String generate() {
        return "this." + identifier + "." + action;
    }

}