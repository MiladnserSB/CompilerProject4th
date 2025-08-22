package ast.TS;

import ast.ASTNode;

public class SignalDeclarationStatement extends ClassBodyStatement {
    private String name;
    private String signalType;
    private String argument;

    public SignalDeclarationStatement(String name, String signalType, String argument) {
        super(null);
        this.name = name;
        this.signalType = signalType;
        this.argument = argument;
    }

    public String getName() {
        return name;
    }

    public String getSignalType() {
        return signalType;
    }

    public String getArgument() {
        return argument;
    }

    @Override
    public void prettyPrint(String indent) {
        super.prettyPrint(indent);
        System.out.println(indent + "  Name: " + name);
        System.out.println(indent + "  Type: " + signalType);
        System.out.println(indent + "  Argument: " + argument);
    }

    @Override
    public String toString() {
        return super.toString() + name + " = " + signalType + "(\"" + argument + "\");";
    }

    @Override
    public String generate() {
        // Convert Angular signals to regular variables in JavaScript
        if ("signal".equals(signalType)) {
            return "let " + name + " = " + argument + ";\n";
        }
        return "let " + name + " = " + signalType + "(\"" + argument + "\");\n";
    }
}