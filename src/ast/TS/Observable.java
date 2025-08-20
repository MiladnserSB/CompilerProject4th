package ast.TS;

import ast.ASTNode;

public class Observable extends ClassBodyStatement {
    private final String variableName;
    private final String observableArray;

    public Observable(String variableName, String observableArray) {
        super(null);
        this.variableName = variableName;
        this.observableArray = observableArray;
    }

    public String getVariableName() {
        return variableName;
    }

    public String getObservableArray() {
        return observableArray;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "Observable:");
        System.out.println(indent + "  Variable: " + variableName + "$!");
        System.out.println(indent + "  Observable Type: " + observableArray);
    }

    @Override
    public String toString() {
        return variableName + "$!: Observable" + observableArray;
    }
}
