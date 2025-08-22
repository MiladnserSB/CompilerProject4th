package ast.TS;

import ast.ASTNode;

public class ArrayBody2 implements ASTNode {
    private ASTNode objectExpr;
    private ASTNode number;
    private ASTNode stringLiteral;

    public ArrayBody2(ASTNode objectExpr, ASTNode number, ASTNode stringLiteral) {
        this.objectExpr = objectExpr;
        this.number = number;
        this.stringLiteral = stringLiteral;
    }

    public ASTNode getObjectExpr() {
        return objectExpr;
    }

    public ASTNode getNumber() {
        return number;
    }

    public ASTNode getStringLiteral() {
        return stringLiteral;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "ArrayBody2:");
        System.out.println(indent + "  Object Expression:");
        objectExpr.prettyPrint(indent + "    ");
        System.out.println(indent + "  Number:");
        number.prettyPrint(indent + "    ");
        System.out.println(indent + "  String Literal:");
        stringLiteral.prettyPrint(indent + "    ");
    }

    @Override
    public String toString() {
        return objectExpr + ", " + number + ", " + stringLiteral;
    }

    @Override
    public String generate() {
        StringBuilder sb = new StringBuilder("{ ");

        if (objectExpr != null) {
            sb.append("obj: ").append(objectExpr.generate());
        }
        if (number != null) {
            if (sb.length() > 2) sb.append(", ");
            sb.append("num: ").append(number.generate());
        }
        if (stringLiteral != null) {
            if (sb.length() > 2) sb.append(", ");
            sb.append("str: \"").append(stringLiteral.generate()).append("\"");
        }

        sb.append(" }");
        return sb.toString();
    }

}
