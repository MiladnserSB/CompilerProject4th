package ast.TS;

import ast.ASTNode;

public class RightMapFilterAssign implements ASTNode {
    private String expression;

    public RightMapFilterAssign(String expression) {
        this.expression = expression;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "RightAssign: " + expression);
    }

    @Override
    public String toString() {
        return expression;
    }
}
