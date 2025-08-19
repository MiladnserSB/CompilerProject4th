package ast.TS;

import ast.ASTNode;

public class ConstructorDeclarationStatement extends ClassBodyStatement {
    private String accessModifier;
    private String paramName;
    private String paramType;

    public ConstructorDeclarationStatement(String accessModifier, String paramName, String paramType) {
        super(null); // No inner ASTNode
        this.accessModifier = accessModifier;
        this.paramName = paramName;
        this.paramType = paramType;
    }

    public String getAccessModifier() {
        return accessModifier;
    }

    public String getParamName() {
        return paramName;
    }

    public String getParamType() {
        return paramType;
    }

    @Override
    public void prettyPrint(String indent) {
        super.prettyPrint(indent);
        if (paramName != null && paramType != null) {
            System.out.println(indent + "  Parameter: " +
                    (accessModifier != null ? accessModifier + " " : "") +
                    paramName + ": " + paramType);
        } else {
            System.out.println(indent + "  No parameters");
        }
    }

    @Override
    public String toString() {
        return super.toString() + " constructor(" +
                (paramName != null ? (accessModifier != null ? accessModifier + " " : "") + paramName + ": " + paramType : "") +
                ")";
    }
}
