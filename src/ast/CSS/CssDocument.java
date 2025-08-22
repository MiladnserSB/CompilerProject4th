package ast.CSS;

import ast.ASTNode;
import java.util.List;

public class CssDocument implements ASTNode {
    private List<RuleSet> ruleSets;

    public CssDocument(List<RuleSet> ruleSets) {
        this.ruleSets = ruleSets;
    }

    public void setRuleSets(List<RuleSet> ruleSets) {
        this.ruleSets = ruleSets;
    }

    public List<RuleSet> getRuleSets() {
        return ruleSets;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "CSS Document:");
        for (RuleSet ruleSet : ruleSets) {
            ruleSet.prettyPrint(indent + "  ");
        }
    }

    @Override
    public String generate() {
        StringBuilder sb = new StringBuilder();
        for (RuleSet ruleSet : ruleSets) {
            sb.append(ruleSet.generate()).append("\n");
        }
        return sb.toString().trim();
    }
}
