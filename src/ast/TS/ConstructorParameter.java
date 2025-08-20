package ast.TS;

import ast.ASTNode;

public class ConstructorParameter implements ASTNode {
    private String access;  // can be null
    private String name;
    private String type;

    public ConstructorParameter(String access, String name, String type) {
        this.access = access;
        this.name = name;
        this.type = type;
    }

    public String getAccess() {
        return access;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.print(indent + "Parameter: ");
        if (access != null) {
            System.out.print(access + " ");
        }
        System.out.println(name + ": " + type);
    }

    @Override
    public String toString() {
        return (access != null ? access + " " : "") + name + ": " + type;
    }
}