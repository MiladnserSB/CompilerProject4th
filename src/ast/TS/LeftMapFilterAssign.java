package ast.TS;

import ast.ASTNode;

public class LeftMapFilterAssign implements ASTNode {
    private final String parameter;
    private final MapFilterIdentifier expression;

    public LeftMapFilterAssign(String parameter, MapFilterIdentifier expression) {
        this.parameter = parameter;
        this.expression = expression;
    }

    public String getParameter() {
        return parameter;
    }

    public MapFilterIdentifier getExpression() {
        return expression;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "LeftMapFilterAssign:");
        System.out.println(indent + "  Parameter: " + parameter);
        if (expression != null) {
            expression.prettyPrint(indent + "  ");
        }
    }

    @Override
    public String toString() {
        return parameter + " => " + (expression != null ? expression.toString() : "");
    }
    @Override
    public String generate() {
        return identifier + " => " + mapFilterIdentifier;
    }

}
