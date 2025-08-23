package ast.TS;

import ast.ASTNode;
import java.util.List;

public class MethodVoidBody implements ASTNode {
    private List<ASTNode> statements;

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

    @Override
    public String generate() {
        StringBuilder sb = new StringBuilder();
        if (statements == null || statements.isEmpty()) {
            return ""; // empty body
        }

        for (ASTNode stmt : statements) {
            if (stmt != null) {
                String generated = stmt.generate();

                // Ensure each statement ends with semicolon/newline if not already
                if (!generated.trim().endsWith(";") && !generated.trim().endsWith("}")) {
                    generated = generated.trim() + ";";
                }

                sb.append("    ").append(generated).append("\n");
            }
        }

        return sb.toString();
    }

}