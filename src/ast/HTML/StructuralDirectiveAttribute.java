package ast.HTML;

public class StructuralDirectiveAttribute implements HtmlAttribute {
    private final String name;
    private final TagAttribute tagAttribute;

    public StructuralDirectiveAttribute(String name, TagAttribute tagAttribute) {
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
        System.out.println(indent + "Structural Directive Attribute: " + name);
        if (tagAttribute != null) tagAttribute.prettyPrint(indent + "  ");
    }

    @Override
    public String generate() {
        if (name.equals("ngIf") && tagAttribute != null) {
            String condition = tagAttribute.generate();
            return "<!-- ngIf transformed -->\n"
                    + "<div id=\"ngif-placeholder\"></div>\n"
                    + "<script>\n"
                    + "const cond = " + condition + ";\n"
                    + "const target = document.getElementById('ngif-placeholder');\n"
                    + "target.innerHTML = cond ? '<div>...</div>' : '';\n"
                    + "</script>\n";
        }

        if (name.equals("ngFor") && tagAttribute != null) {
            String expr = tagAttribute.generate();
            String[] parts = expr.split("of");
            String loopVar = parts[0].replace("let", "").trim();
            String collection = parts[1].trim();

            return "<!-- ngFor transformed -->\n"
                    + "<div id=\"ngfor-placeholder\"></div>\n"
                    + "<script>\n"
                    + "const container = document.getElementById('ngfor-placeholder');\n"
                    + collection + ".forEach(" + loopVar + " => {\n"
                    + "  const el = document.createElement('div');\n"
                    + "  el.textContent = " + loopVar + ".name; // TODO: full template\n"
                    + "  container.appendChild(el);\n"
                    + "});\n"
                    + "</script>\n";
        }

        return "";
    }
}
