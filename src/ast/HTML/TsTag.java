package ast.HTML;

import ast.ASTNode;
import java.util.List;

public class TsTag implements HtmlElement {
    private String tagName;
    private List<ASTNode> attributes;

    public TsTag(String tagName, List<ASTNode> attributes) {
        this.tagName = tagName;
        this.attributes = attributes;
    }

    public String getTagName() { return tagName; }
    public List<ASTNode> getAttributes() { return attributes; }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "TS Tag:");
        System.out.println(indent + "  Tag Name: " + tagName);
        if (attributes != null && !attributes.isEmpty()) {
            System.out.println(indent + "  Attributes:");
            for (ASTNode attr : attributes) {
                attr.prettyPrint(indent + "    ");
            }
        }
    }

    @Override
    public String generate() {
//        System.out.println("-----------------------------------------------------------------------");
//        StringBuilder sb = new StringBuilder();
//        sb.append("<").append(tagName);
//
//        // Add attributes
//        if (attributes != null && !attributes.isEmpty()) {
//            for (ASTNode attr : attributes) {
//                String generatedAttr = attr.generate();
//                if (!generatedAttr.isEmpty()) {
//                    sb.append(" ").append(generatedAttr);
//                }
//            }
//        }
//
//        sb.append("></").append(tagName).append(">");
//        return sb.toString();
        return "";
    }
}