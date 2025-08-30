package ast.HTML;

public class AttributeBindingAttribute implements HtmlAttribute {
    private final String name;
    private final TagAttribute tagAttribute;

    public AttributeBindingAttribute(String name, TagAttribute tagAttribute) {
        this.name = name;
        this.tagAttribute = tagAttribute;
    }

    @Override
    public String getName() { return name; }

    @Override
    public TagAttribute getTagAttribute() { return tagAttribute; }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "Attribute Binding Attribute: " + name);
        if (tagAttribute != null) tagAttribute.prettyPrint(indent + "  ");
    }

    @Override
    public String generate() {
        if (name.startsWith("[") && name.endsWith("]")) {
            String attributeName = name.substring(1, name.length() - 1);

            // For property bindings like [value], convert to standard HTML attributes
            if ("value".equals(attributeName)) {
                // Remove Angular binding syntax and just keep the attribute
                return "";
            }

            if (tagAttribute != null) {
                String value = tagAttribute.getValue();
                // Remove Angular-specific syntax
                value = value.replace("{{", "").replace("}}", "")
                        .replace("$any", "").replace("$event", "event");
                return attributeName + "=\"" + value + "\"";
            }
        }
        return "";
    }
}