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
        System.out.println(indent + "Tag Name Attribute: " + name);
        if (tagAttribute != null) tagAttribute.prettyPrint(indent + "  ");
    }

    @Override
    public String generate() {
        // Vanilla JS / HTML: attribute remains as-is
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        if (tagAttribute != null) {
            String val = tagAttribute.generate();
            if (val != null && !val.isEmpty()) {
                sb.append("=\"").append(val).append("\"");
            } else {
                sb.append("=\"\"");
            }
        }
        return sb.toString();
    }
}
