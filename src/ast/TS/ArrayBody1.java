package ast.TS;

import ast.ASTNode;

public class ArrayBody1 implements ASTNode {

    private ASTNode objectExpression;
    private String number;
    private String stringLiteral;

    public ArrayBody1(ASTNode objectExpression, String number, String stringLiteral) {
        this.objectExpression = objectExpression;
        this.number = number;
        this.stringLiteral = stringLiteral;
    }

    public ASTNode getObjectExpression() {
        return objectExpression;
    }

    public String getNumber() {
        return number;
    }

    public String getStringLiteral() {
        return stringLiteral;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.print(indent + "Array Element: ");
        if (objectExpression != null) {
            System.out.println("Object Expression:");
            objectExpression.prettyPrint(indent + "  ");
        } else if (number != null) {
            System.out.println("Number: " + number);
        } else if (stringLiteral != null) {
            System.out.println("String: " + stringLiteral);
        } else {
            System.out.println("<Empty>");
        }
    }

    @Override
    public String toString() {
        if (objectExpression != null) return "ObjectExpr: " + objectExpression.toString();
        if (number != null) return "Number: " + number;
        if (stringLiteral != null) return "String: " + stringLiteral;
        return "<Empty>";
    }
}