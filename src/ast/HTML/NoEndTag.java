package ast.HTML;

import ast.ASTNode;
import java.util.List;
import java.util.Objects;

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
        if(Objects.equals(this.tagName, "img"))
            return "";
        StringBuilder sb = new StringBuilder();

        sb.append("<").append(tagName);
        if ("input".equalsIgnoreCase(tagName)) {
            String inputNameValue = null;
            System.out.println("I am here EEEEEEEEeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
            if (attributes != null && !attributes.isEmpty()) {
                for (ASTNode attr : attributes) {
                    if (attr instanceof TagNameAttribute) {
                        TagNameAttribute tagAttr = (TagNameAttribute) attr;
                        if ("name".equalsIgnoreCase(tagAttr.getName())) {
                            String value = tagAttr.getTagAttribute() != null ?
                                    tagAttr.getTagAttribute().getValue() : "";
                            // Remove quotes from the value
                            inputNameValue = value.replace("\"", "").replace("'", "");
                        }
                    }
                }
            }

            // Add id attribute based on the name value
            if (inputNameValue != null) {
                String idValue;

                if (inputNameValue.startsWith("add-")) {
                    // For add- prefix: name="add-name" → id="name"
                    idValue = inputNameValue.substring(4); // remove "add-" prefix
                } else {
                    // For other names: name="name" → id="edit-name"

                    idValue = "edit-" + inputNameValue;
                }

                sb.append(" id=\"").append(idValue).append("\"");
            }
        }
        // Add attributes
        if (attributes != null && !attributes.isEmpty()) {
            for (ASTNode attr : attributes) {
                String generatedAttr = attr.generate();
                if (!generatedAttr.isEmpty()) {
                    sb.append(" ").append(generatedAttr);
                }
            }
        }

        // Add required attribute if needed
        if (required) {
            sb.append(" required");
        }

        sb.append(">");
        sb.append("\n");
        return sb.toString();
    }
}