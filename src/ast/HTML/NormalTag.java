package ast.HTML;

import ast.ASTNode;
import java.util.List;

public class NormalTag implements HtmlElement {
    private String tagName;
    private List<ASTNode> attributes;
    private List<ASTNode> content;

    public NormalTag(String tagName, List<ASTNode> attributes, List<ASTNode> content) {
        this.tagName = tagName;
        this.attributes = attributes;
        this.content = content;
    }

    public String getTagName() { return tagName; }
    public List<ASTNode> getAttributes() { return attributes; }
    public List<ASTNode> getContent() { return content; }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "Normal Tag:");
        System.out.println(indent + "  Tag Name: " + tagName);
        if (!attributes.isEmpty()) {
            System.out.println(indent + "  Attributes:");
            for (ASTNode attr : attributes) {
                attr.prettyPrint(indent + "    ");
            }
        }
        if (!content.isEmpty()) {
            System.out.println(indent + "  Content:");
            for (ASTNode node : content) {
                node.prettyPrint(indent + "    ");
            }
        }
    }

    @Override
    public String generate() {
        StringBuilder sb = new StringBuilder();
        sb.append("<").append(tagName);

        if (attributes != null) {
            for (ASTNode attr : attributes) {
                if (attr instanceof HtmlAttribute) {
                    sb.append(" ").append(((HtmlAttribute) attr).generate());
                }
            }
        }
        sb.append(">");

        if (content != null) {
            for (ASTNode node : content) {
                if (node instanceof HtmlContentStatement) {
                    sb.append(((HtmlContentStatement) node).generate());
                } else if (node instanceof HtmlElement) {
                    sb.append(((HtmlElement) node).generate());
                }
            }
        }

        sb.append("</").append(tagName).append(">");
        return sb.toString();
    }
}
