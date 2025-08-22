package ast.HTML;

public class AttributeBindingAttribute implements HtmlAttribute {
    private final String name;
    private final TagAttribute tagAttribute;

    public AttributeBindingAttribute(String name, TagAttribute tagAttribute) {
        this.name = name;
        this.tagAttribute = tagAttribute;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public TagAttribute getTagAttribute() {
        return tagAttribute;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "Attribute Binding Attribute:");
        System.out.println(indent + "  Name: " + name);
        if (tagAttribute != null) tagAttribute.prettyPrint(indent + "  ");
    }

    @Override
    public String generate() {
        // Angular: [src]="imageUrl" → HTML: src=""
        StringBuilder sb = new StringBuilder();
        sb.append(name).append("=");
        sb.append("\"\"");
        return sb.toString();
    }
}
