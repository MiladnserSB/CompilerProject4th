package ast.TS;

import ast.ASTNode;
import java.util.List;

public class MethodVoidBody implements ASTNode {
    private List<ASTNode> statements; // methodAssignment | crudBodyRule | ifStatement

    public MethodVoidBody(List<ASTNode> statements) {
        this.statements = statements;
    }

    public List<ASTNode> getStatements() {
        return statements;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "MethodVoidBody:");
        if (statements == null || statements.isEmpty()) {
            System.out.println(indent + "  <empty>");
            return;
        }
        for (ASTNode stmt : statements) {
            stmt.prettyPrint(indent + "  ");
        }
    }

    @Override
    public String toString() {
        return "MethodVoidBody{" +
                "statements=" + statements +
                '}';
    }
}
