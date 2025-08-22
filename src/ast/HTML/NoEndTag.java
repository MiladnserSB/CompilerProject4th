package ast.HTML;

import ast.ASTNode;
import java.util.List;

public class NoEndTag implements HtmlElement {
    private String tagName;
    private List<ASTNode> attributes;
    private boolean required;

    public NoEndTag(String tagName, List<ASTNode> attributes, boolean required) {
        this.tagName = tagName;
        this.attributes = attributes;
        this.required = required;
    }

    public String getTagName() { return tagName; }
    public List<ASTNode> getAttributes() { return attributes; }
    public boolean isRequired() { return required; }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "No-End Tag:");
        System.out.println(indent + "  Tag Name: " + tagName);
        if (attributes != null && !attributes.isEmpty()) {
            System.out.println(indent + "  Attributes:");
            for (ASTNode attr : attributes) {
                attr.prettyPrint(indent + "    ");
            }
        }
        System.out.println(indent + "  Required: " + required);
    }

    @Override
    public String generate() {
        StringBuilder sb = new StringBuilder();
        sb.append("<").append(tagName);

        if (attributes != null) {
            for (ASTNode attr : attributes) {
                if (attr != null) {
                    String attrStr = attr.generate();
                    if (!attrStr.isBlank()) {
                        sb.append(" ").append(attrStr);
                    }
                }
            }
        }

        // In pure HTML5, void elements don’t require self-closing slash
        sb.append(">");
        return sb.toString();
    }
}
