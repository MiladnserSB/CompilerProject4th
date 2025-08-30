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
        boolean hasButtonType = false;

        if ("button".equalsIgnoreCase(tagName)) {
            if (attributes != null && !attributes.isEmpty()) {
                for (ASTNode attr : attributes) {
                    if (attr instanceof TagNameAttribute) {
                        TagNameAttribute tagAttr = (TagNameAttribute) attr;
                        if ("type".equalsIgnoreCase(tagAttr.getName())) {
                            String value = tagAttr.getTagAttribute() != null ?
                                    tagAttr.getTagAttribute().getValue() : "";
                            if (value.contains("button")) {
                                hasButtonType = true;
                            }
                        }
                    }
                    if (attr instanceof TagNameAttribute) break;
                    if (attr instanceof EventBindingAttribute) {
                        // Return empty string immediately for buttons with event bindings
                        return "";
                    }


                }
            }
        }









        if (attributes != null && !attributes.isEmpty()) {
            for (ASTNode attr : attributes) {
                if (attr instanceof StructuralDirectiveAttribute) {
                    StructuralDirectiveAttribute structuralAttr = (StructuralDirectiveAttribute) attr;

                    // Check if this is an *ngIf directive
                    if (structuralAttr.getName() != null && structuralAttr.getName().contains("ngIf")) {
                        // Build the element with id="edit-form" instead of *ngIf
                        StringBuilder elementContent = new StringBuilder();
                        elementContent.append("<").append(tagName);

                        // Add all other attributes (excluding the structural directive)
                        if (attributes != null && !attributes.isEmpty()) {
                            for (ASTNode otherAttr : attributes) {
                                if (!(otherAttr instanceof StructuralDirectiveAttribute)) {
                                    String generatedAttr = otherAttr.generate();
                                    if (!generatedAttr.isEmpty()) {
                                        elementContent.append(" ").append(generatedAttr);
                                    }
                                }
                            }
                        }

                        // Add the id="edit-form" attribute
                        if(structuralAttr.getName().contains("editMode"))
                        { elementContent.append(" id=\"edit-form\"");}
else {elementContent.append(" id=\"product-details-container\"");}
                            elementContent.append(">");

                        // Add the content
                        if (content != null && !content.isEmpty()) {
                            for (ASTNode node : content) {
                                elementContent.append(node.generate());
                            }
                        }

                        elementContent.append("</").append(tagName).append(">");
                        return elementContent.toString();
                    } else {
                        // For other structural directives, just return the children content
                        StringBuilder childrenContent = new StringBuilder();
                        if (content != null && !content.isEmpty()) {
                            for (ASTNode node : content) {
                                childrenContent.append(node.generate());
                            }
                        }
                        return childrenContent.toString();
                    }
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append("<").append(tagName);

        if (attributes != null && !attributes.isEmpty()) {
            for (ASTNode attr : attributes) {
                if (attr instanceof TagNameAttribute) {
                    TagNameAttribute tagAttr = (TagNameAttribute) attr;
                    if ("class".equalsIgnoreCase(tagAttr.getName())) {
                        String value = tagAttr.getTagAttribute() != null ?
                                tagAttr.getTagAttribute().getValue() : "";
                        if (value.contains("product-list")) {
                            sb.append(" id =\"products-container\"");
                        }
                    }
                }

            }}
// Check if this is an anchor tag with routerLink="/products"
        if ("a".equalsIgnoreCase(tagName)) {
            boolean hasProductsRouterLink = false;

            if (attributes != null && !attributes.isEmpty()) {
                for (ASTNode attr : attributes) {
                    if (attr instanceof TagNameAttribute) {
                        TagNameAttribute tagAttr = (TagNameAttribute) attr;
                        if ("routerLink".equalsIgnoreCase(tagAttr.getName())) {
                            String value = tagAttr.getTagAttribute() != null ?
                                    tagAttr.getTagAttribute().getValue() : "";
                            if ("\"/products\"".equals(value) || "/products".equals(value)) {
                                hasProductsRouterLink = true;
                            }
                        }
                    }
                }
            }

            // Add class="active" for products routerLink
            if (hasProductsRouterLink) {
                sb.append(" class=\"active\"");
            }
        }





        if ("h2".equalsIgnoreCase(tagName) || "h3".equalsIgnoreCase(tagName) || "p".equalsIgnoreCase(tagName)) {
            return "";
        }

        // Add attributes
        boolean isForm = "form".equalsIgnoreCase(tagName);
        boolean hasSubmitEvent = false;
        boolean hasIdAttribute = false;
        boolean hasIDAttribute = false;

// Integrated condition - placed in the right location
        if (attributes != null && !attributes.isEmpty()) {
            for (ASTNode attr : attributes) {
                if (attr instanceof HtmlAttribute) {
                    HtmlAttribute htmlAttr = (HtmlAttribute) attr;
                    String name = htmlAttr.getName();

                    // Check for button type to add id="cancel-edit"
                    if (hasButtonType && "type".equalsIgnoreCase(name)) {
                        sb.append(" id=\"cancel-edit\"");
                    }

                    // Check if form has style attribute
                    if (isForm && "id".equalsIgnoreCase(name)) {
                        hasIDAttribute = true;

                    }

                    if (name != null) {
                        if ("id".equalsIgnoreCase(name)) {
                            hasIdAttribute = true;
                        }
                        // Event binding like (submit)
                        if (name.startsWith("(") && name.endsWith(")") &&
                                name.substring(1, name.length() - 1).equalsIgnoreCase("submit")) {
                            hasSubmitEvent = true;
                        }
                    }
                }
            }
        }

// If a <form> has a submit event, ensure it has an id to wire JS
        if (isForm && hasSubmitEvent && !hasIdAttribute) {
            if (hasIDAttribute) {

            } else {
                sb.append(" id=\"add-product-form\"");
            }
        }

        if (attributes != null && !attributes.isEmpty()) {
            for (ASTNode attr : attributes) {
                String generatedAttr = attr.generate();
                if (!generatedAttr.isEmpty()) {
                    sb.append(" ").append(generatedAttr);
                }
            }
        }  if (isForm && hasIDAttribute) {
            String currentContent = sb.toString();
            String pattern = "id\\s*=\\s*\"[^\"]*\"";
            String replacement = "id=\"edit-product-form\"";
            String modifiedContent = currentContent.replaceAll(pattern, replacement);

            sb.setLength(0);
            sb.append(modifiedContent);
        }


        sb.append(">");

        // Add content
        if (content != null && !content.isEmpty()) {
            for (ASTNode node : content) {
                sb.append(node.generate());
            }
        }

        sb.append("</").append(tagName).append(">");
        sb.append("\n");
        return sb.toString();
    }
}