package ast.TS;

import ast.ASTNode;
import java.util.List;

public class ConstructorDeclarationStatement implements ASTNode {
    private List<ConstructorParameter> parameters;

    public ConstructorDeclarationStatement(List<ConstructorParameter> parameters) {
        this.parameters = parameters;
    }

    public List<ConstructorParameter> getParameters() {
        return parameters;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "ConstructorDeclaration:");
        if (parameters != null && !parameters.isEmpty()) {
            for (ConstructorParameter param : parameters) {
                param.prettyPrint(indent + "  ");
            }
        } else {
            System.out.println(indent + "  <No parameters>");
        }
    }

    @Override
    public String toString() {
        return "Constructor(" + (parameters != null ? parameters.toString() : "") + ")";
    }
}