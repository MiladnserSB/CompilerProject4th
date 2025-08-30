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
        if (tagAttribute != null) {
            String value = tagAttribute.getValue();

            // Handle special cases for Angular attributes
            if ("routerLink".equals(name)) {
                return "href=\"" + value.substring(2, value.length() - 1)+".html\"";
            } else if (name.startsWith("[")) {
                // Skip property bindings as they'll be handled by JavaScript
                return "";
            } else {
                // Regular HTML attribute
                // Remove any Angular-specific syntax
                value = value.replace("{{", "").replace("}}", "")
                        .replace("$any", "").replace("$event", "event");
                return name + "=" + value ;
            }
        }

        return name;
    }

    private String convertRouterLink(String routerLink) {
        // Convert Angular routerLink to standard href
        if (routerLink.startsWith("['/") && routerLink.endsWith("']")) {
            String path = routerLink.substring(3, routerLink.length() - 2);
            return path + ".html";
        } else if (routerLink.startsWith("/")) {
            return routerLink.substring(1) + ".html";
        }
        return routerLink + ".html";
    }
}