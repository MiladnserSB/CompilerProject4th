package ast.HTML;

import ast.ASTNode;

public abstract class HtmlContentStatement implements ASTNode {
    private final ASTNode statement;

    public HtmlContentStatement(ASTNode statement) {
        this.statement = statement;
    }

    public ASTNode getStatement() {
        return statement;
    }

    @Override
    public void prettyPrint(String indent) {
        if (statement != null) {
            statement.prettyPrint(indent + "  ");
        }
    }

    @Override
    public String toString() {
        return "HtmlContentStatement: " + (statement != null ? statement.toString() : "null");
    }

    @Override
    public String generate() {
        if (statement != null) {
            return statement.generate();
        }
        return "";
    }
}