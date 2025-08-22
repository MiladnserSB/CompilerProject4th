package ast.HTML;

public class TagNameAttribute implements HtmlAttribute {
    private final String name;
    private final TagAttribute tagAttribute;

    public TagNameAttribute(String name, TagAttribute tagAttribute) {
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
        System.out.println(indent + "Tag Name Attribute:");
        System.out.println(indent + "  Name: " + name);
        if (tagAttribute != null) tagAttribute.prettyPrint(indent + "  ");
    }

    @Override
    public String generate() {
        if (tagAttribute == null || tagAttribute.getValue() == null) {
            return name; // Boolean attribute like "disabled"
        }
        return name + "=" + tagAttribute.generate() + "";
    }
}
