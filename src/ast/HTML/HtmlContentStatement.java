package ast.HTML;

import ast.ASTNode;

public abstract class HtmlContentStatement implements ASTNode {
    private final ASTNode statement;

    public HtmlContentStatement(ASTNode statement) {
        this.statement = statement;
    }

    public ASTNode getStatement() {
        return statement;
    }

    @Override
    public void prettyPrint(String indent) {
        if (statement != null) {
            statement.prettyPrint(indent + "  ");
        }
    }

    @Override
    public String toString() {
        return "HtmlContentStatement: " + (statement != null ? statement.toString() : "null");
    }

    /**
     * Generate vanilla HTML + JS for this statement.
     */
    public String generate() {
        if (statement == null) return "";

        // Plain text or whitespace
        if (statement.getClass().getSimpleName().equals("ASTNodeToken")) {
            // replace ASTNodeToken with whatever class your raw tokens use
            String type = statement.getClass().getSimpleName();
            String text = statement.toString();
            return text;
        }

        // Interpolation {{ value }}
        if (statement.getClass().getSimpleName().equals("Interpolation")) {
            String expr = statement.toString().replace("{{", "").replace("}}", "").trim();
            return "\" + " + expr + " + \"";
        }

        // Nested HTML element
        if (statement instanceof HtmlElement) {
            return ((HtmlElement) statement).generate();
        }

        // Structural directive
        if (statement instanceof StructuralDirectiveAttribute) {
            return ((StructuralDirectiveAttribute) statement).generate();
        }

        // Normal attribute
        if (statement instanceof HtmlAttribute) {
            HtmlAttribute attr = (HtmlAttribute) statement;
            return " " + attr.getName() + "=\"" + attr.getTagAttribute().generate() + "\"";
        }

        // Fallback
        return "";
    }
}
