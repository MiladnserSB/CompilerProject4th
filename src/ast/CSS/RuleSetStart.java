package ast.CSS;

import ast.ASTNode;
import java.util.List;

public class RuleSetStart implements ASTNode {
    private List<SelectorInCss> selectors;
    private List<String> tags; // For TAGSFORCSS elements

    public RuleSetStart(List<SelectorInCss> selectors, List<String> tags) {
        this.selectors = selectors;
        this.tags = tags;
    }

    public List<SelectorInCss> getSelectors() {
        return selectors;
    }

    public List<String> getTags() {
        return tags;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "RuleSetStart:");
        for (SelectorInCss selector : selectors) {
            selector.prettyPrint(indent + "  ");
        }
        for (String tag : tags) {
            System.out.println(indent + "  Tag: " + tag);
        }
    }

    @Override
    public String generate() {
        StringBuilder sb = new StringBuilder();

        // Add CSS selectors
        for (int i = 0; i < selectors.size(); i++) {
            if (i > 0) sb.append(" ");
            sb.append(selectors.get(i).generate());
        }

        // Add tags
        for (int i = 0; i < tags.size(); i++) {
            if (sb.length() > 0) sb.append(" ");
            sb.append(tags.get(i));
        }

        return sb.toString();
    }
}