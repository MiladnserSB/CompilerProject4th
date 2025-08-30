package ast.TS;

import ast.ASTNode;

public class Observable extends ClassBodyStatement {
    private final String variableName;
    private final ObservableArray observableArray; // store as AST node

    public Observable(String variableName, ObservableArray observableArray) {
        super(null);
        this.variableName = variableName;
        this.observableArray = observableArray;
    }

    public String getVariableName() {
        return variableName;
    }

    public ObservableArray getObservableArray() {
        return observableArray;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "Observable:");
        System.out.println(indent + "  Variable: " + variableName + "$!");
        if (observableArray != null) {
            System.out.print(indent + "  Type/Init: ");
            observableArray.prettyPrint("");
        } else {
            System.out.println(indent + "  Type/Init: <empty>");
        }
    }

    @Override
    public String toString() {
        return variableName + "$!: Observable" + (observableArray != null ? observableArray.toString() : "");
    }

    @Override
    public String generate() {
        return "";
//        String jsVarName = variableName.endsWith("$") ? variableName : variableName + "$";
//        return "this." + jsVarName + " = " + (observableArray != null ? observableArray.generate() : "[]") + ";\n";
    }
}
