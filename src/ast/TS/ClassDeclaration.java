package ast.TS;

import ast.ASTNode;
import java.util.List;

public class ClassDeclaration implements ASTNode {
    private String className;
    private ImplementsClause implementsClause; // nullable
    private List<ASTNode> classBody;

    public ClassDeclaration(String className, ImplementsClause implementsClause, List<ASTNode> classBody) {
        this.className = className;
        this.implementsClause = implementsClause;
        this.classBody = classBody;
    }

    public String getClassName() {
        return className;
    }

    public ImplementsClause getImplementsClause() {
        return implementsClause;
    }

    public List<ASTNode> getClassBody() {
        return classBody;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "Class: " + className);
        if (implementsClause != null) {
            implementsClause.prettyPrint(indent + "  ");
        }
        if (classBody != null && !classBody.isEmpty()) {
            System.out.println(indent + "  Class Body:");
            for (ASTNode node : classBody) {
                node.prettyPrint(indent + "    ");
            }
        } else {
            System.out.println(indent + "  <Empty class body>");
        }
    }


    @Override
    public String toString() {
        return "Class " + className + (implementsClause != null ? " " + implementsClause.toString() : "");
    }

    @Override
    public String generate() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ").append(className).append(" {\n");

        if (classBody != null) {
            for (ASTNode node : classBody) {
                String code = node.generate();
                if (code != null && !code.isEmpty()) {
                    sb.append("  ").append(code).append("\n");
                }
            }
        }

        sb.append("}\n");
        return sb.toString();
    }


}