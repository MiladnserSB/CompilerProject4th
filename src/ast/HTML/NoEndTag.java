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
}
