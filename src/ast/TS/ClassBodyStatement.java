package ast.TS;

import ast.ASTNode;

public abstract class ClassBodyStatement implements ASTNode {
    protected ASTNode statement;  // تغيير private إلى protected للسماح للفئات الفرعية بالوصول

    public ClassBodyStatement(ASTNode statement) {
        this.statement = statement;
    }

    // يمكن الاحتفاظ بالتنفيذات الافتراضية
    public ASTNode getStatement() {
        return statement;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + getClass().getSimpleName() + ":");
        if (statement != null) {
            statement.prettyPrint(indent + "  ");
        }
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": " + (statement != null ? statement.toString() : "null");
    }
}