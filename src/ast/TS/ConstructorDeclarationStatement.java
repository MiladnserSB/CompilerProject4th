package ast.TS;

import ast.ASTNode;
import java.util.List;

public class ConstructorDeclarationStatement extends ClassBodyStatement {
    private List<ConstructorParameter> parameters;

    public ConstructorDeclarationStatement(List<ConstructorParameter> parameters) {
        super(null);
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
    @Override
    public String generate() {
        StringBuilder sb = new StringBuilder("constructor(");
        if (parameters != null && !parameters.isEmpty()) {
            for (int i = 0; i < parameters.size(); i++) {
                sb.append(parameters.get(i).getName()); // drop :type and access
                if (i < parameters.size() - 1) {
                    sb.append(", ");
                }
            }
        }
        sb.append(") {\n    // TODO: init\n  }");
        return sb.toString();
    }

}