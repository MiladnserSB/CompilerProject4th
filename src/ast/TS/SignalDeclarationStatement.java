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
        // Convert a signal into a reactive-like property with getter/setter
        String jsName = name.replace("signal", "").trim();
        if (jsName.isEmpty()) jsName = name; // fallback if no "signal" in name

        StringBuilder sb = new StringBuilder();
        sb.append("this._").append(jsName).append(" = ").append(argument).append(";\n");
        sb.append("Object.defineProperty(this, '").append(jsName).append("', {\n");
        sb.append("  get() { return this._").append(jsName).append("; },\n");
        sb.append("  set(newValue) {\n");
        sb.append("    this._").append(jsName).append(" = newValue;\n");
        sb.append("    if (typeof this.render === 'function') this.render();\n");
        sb.append("  }\n");
        sb.append("});\n");
        return sb.toString();
    }

}