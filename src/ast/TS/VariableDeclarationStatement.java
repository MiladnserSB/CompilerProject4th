package ast.TS;

import ast.ASTNode;

public class VariableDeclarationStatement extends ClassBodyStatement {
    private String signature;
    private String type;
    private String value;

    public VariableDeclarationStatement(String signature, String type, String value) {
        super(null);
        this.signature = signature;
        this.type = type;
        this.value = value;
    }

    public String getSignature() {
        return signature;
    }

    public String getType() {
        return type;
    }

    public String getValue() {
        return value;
    }

    @Override
    public void prettyPrint(String indent) {
        super.prettyPrint(indent);
        System.out.println(indent + "  Signature: " + signature);
        System.out.println(indent + "  Type: " + type);
        System.out.println(indent + "  Value: " + value);
    }

    @Override
    public String toString() {
        return super.toString() + signature + ": " + type + " = " + value;
    }

    @Override
    public String generate() {

        return "let " + signature + " = " + value + ";\n";
    }
}