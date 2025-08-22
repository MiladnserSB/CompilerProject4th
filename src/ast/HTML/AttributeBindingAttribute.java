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
        if (tagAttribute != null) {
            String value = tagAttribute.generate();
            String attrName = name.substring(1, name.length() - 1); // remove brackets
            return attrName + "=\"" + value + "\"";
        }
        return "";
    }
}
