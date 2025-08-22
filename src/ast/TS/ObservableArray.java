package ast.TS;

import ast.ASTNode;

public class ObservableArray implements ASTNode {
    private final String type;

    public ObservableArray(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "ObservableArray: " + type);
    }

    @Override
    public String toString() {
        return type;
    }

    @Override
    public String generate() {
        // Convert Observable<T> to regular array in JavaScript
        return "[]";
    }
}