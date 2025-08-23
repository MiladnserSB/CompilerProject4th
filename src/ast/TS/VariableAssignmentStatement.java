package ast.TS;

import ast.ASTNode;

public class VariableAssignmentStatement extends ClassBodyStatement {
    private String identifier;
    private String value;

    public VariableAssignmentStatement(String identifier, String value) {
        super(null);
        this.identifier = identifier;
        this.value = value;
    }

    public String getIdentifier() {
        return identifier;
    }

    public String getValue() {
        return value;
    }

    @Override
    public void prettyPrint(String indent) {
        super.prettyPrint(indent);
        System.out.println(indent + "  Identifier: " + identifier);
        System.out.println(indent + "  Value: " + value);
    }

    @Override
    public String toString() {
        return super.toString() + identifier + " = " + value;
    }

    @Override
    public String generate() {
        return identifier + " = " + value + ";\n";
    }
}