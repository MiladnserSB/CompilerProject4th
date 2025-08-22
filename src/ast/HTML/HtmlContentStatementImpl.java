package ast.HTML;

import ast.ASTNode;

public class HtmlContentStatementImpl extends HtmlContentStatement {

    public HtmlContentStatementImpl(ASTNode statement) {
        super(statement);
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "HtmlContentStatementImpl:");
        if (getStatement() != null) {
            getStatement().prettyPrint(indent + "  ");
        }
    }

    @Override
    public String generate() {
        ASTNode stmt = getStatement();
        if (stmt == null) return "";

        // Plain text or whitespace
        if (stmt.getClass().getSimpleName().equals("ASTNodeToken")) {
            return stmt.toString();
        }

        // Interpolation {{ value }}
        if (stmt.getClass().getSimpleName().equals("Interpolation")) {
            String expr = stmt.toString().replace("{{", "").replace("}}", "").trim();
            return "\" + " + expr + " + \"";
        }

        // Nested HTML element
        if (stmt instanceof HtmlElement) {
            return ((HtmlElement) stmt).generate();
        }

        // Structural directive (*ngIf, *ngFor)
        if (stmt instanceof StructuralDirectiveAttribute) {
            return ((StructuralDirectiveAttribute) stmt).generate();
        }

        // Normal attribute
        if (stmt instanceof HtmlAttribute) {
            HtmlAttribute attr = (HtmlAttribute) stmt;
            return " " + attr.getName() + "=\"" + attr.getTagAttribute().generate() + "\"";
        }

        // Fallback
        return "";
    }
}
