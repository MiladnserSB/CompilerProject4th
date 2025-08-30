package ast.TS;

import ast.ASTNode;

public class SimpleExpressionNode implements ASTNode {
    private final String expression;

    public SimpleExpressionNode(String expression) {
        this.expression = expression;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "Expression: " + expression);
    }

    @Override
    public String generate() {
        return expression;
    }
}