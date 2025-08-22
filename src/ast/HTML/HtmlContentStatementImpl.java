package ast.HTML;

import ast.ASTNode;

public class HtmlContentStatementImpl extends HtmlContentStatement {
    public HtmlContentStatementImpl(ASTNode statement) {
        super(statement);
    }

    @Override
    public String generate() {
        return getStatement() != null ? getStatement().generate() : "";
    }
}
