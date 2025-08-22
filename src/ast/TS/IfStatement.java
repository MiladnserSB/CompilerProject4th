package ast.TS;

import ast.ASTNode;
import java.util.List;

public class IfStatement implements ASTNode {
    private String conditionLeft;
    private String conditionRight;
    private String assignIdentifier;
    private List<IfBody> body;

    public IfStatement(String conditionLeft, String conditionRight, String assignIdentifier, List<IfBody> body) {
        this.conditionLeft = conditionLeft;
        this.conditionRight = conditionRight;
        this.assignIdentifier = assignIdentifier;
        this.body = body;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "IfStatement:");
        System.out.println(indent + "  Condition: this." + conditionLeft + "?." + conditionRight + " === " + assignIdentifier);
        for (IfBody stmt : body) {
            stmt.prettyPrint(indent + "  ");
        }
    }

    @Override
    public String toString() {
        return "if (this." + conditionLeft + "?." + conditionRight + " === " + assignIdentifier + ") { " + body + " }";
    }
    @Override
    public String generate() {
        StringBuilder sb = new StringBuilder();
        sb.append("if (this.")
                .append(conditionLeft)
                .append("?.")
                .append(conditionRight)
                .append(" === ")
                .append(assignIdentifier)
                .append(") {\n");

        for (IfBody stmt : body) {
            sb.append("  ").append(stmt.generate()).append("\n");
        }
        sb.append("}");
        return sb.toString();
    }

}
