package ast.CSS;

import ast.ASTNode;
import java.util.List;

public class RuleSet implements ASTNode {
    private RuleSetStart ruleSetStart;
    private List<Declaration> declarations;

    public RuleSet(RuleSetStart ruleSetStart, List<Declaration> declarations) {
        this.ruleSetStart = ruleSetStart;
        this.declarations = declarations;
    }

    public RuleSetStart getRuleSetStart() {
        return ruleSetStart;
    }

    public List<Declaration> getDeclarations() {
        return declarations;
    }

    public void setRuleSetStart(RuleSetStart ruleSetStart) {
        this.ruleSetStart = ruleSetStart;
    }

    public void setDeclarations(List<Declaration> declarations) {
        this.declarations = declarations;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "RuleSet:");
        ruleSetStart.prettyPrint(indent + "  ");
        System.out.println(indent + "  Declarations:");
        for (Declaration decl : declarations) {
            decl.prettyPrint(indent + "    ");
        }
    }

    @Override
    public String generate() {
        String selectors = ruleSetStart.generate();
        if (selectors.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(selectors).append(" {\n");
        for (Declaration decl : declarations) {
            sb.append("  ").append(decl.generate()).append("\n");
        }
        sb.append("}\n");
        return sb.toString();
    }
}