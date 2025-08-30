package ast.HTML;

import ast.ASTNode;

public class HtmlContentStatementImpl extends HtmlContentStatement {

    public HtmlContentStatementImpl(ASTNode statement) {
        super(statement);
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "HtmlContentStatementImpl:");
        if (getStatement() != null) {
            getStatement().prettyPrint(indent + "  ");
        }
    }

    @Override
    public String generate() {
        if (getStatement() != null) {
            return getStatement().generate();
        }
        return "";
    }
}