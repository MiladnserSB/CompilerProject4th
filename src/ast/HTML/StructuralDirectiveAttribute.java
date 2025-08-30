package ast.HTML;

public class StructuralDirectiveAttribute implements HtmlAttribute {
    protected final String name;
    protected final TagAttribute tagAttribute;

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
        return generate("");
    }

    // Generate method for structural directive conversion
    public String generate(String angularDirective) {
//        if (name.startsWith("*")) {
//            String directiveName = name.substring(1);
//
//            if ("ngFor".equals(directiveName)) {
//                // Convert *ngFor to JavaScript loop
//                String loopVariable = angularDirective.substring(angularDirective.indexOf("let ") + 4,
//                        angularDirective.indexOf(" of "));
//                String collection = angularDirective.substring(angularDirective.indexOf(" of ") + 4);
//
//                return "data-ngfor=\"" + collection + "\" data-ngfor-var=\"" + loopVariable + "\"";
//            } else if ("ngIf".equals(directiveName)) {
//                // Convert *ngIf to conditional display
//                String condition = tagAttribute != null ? tagAttribute.getValue() : "";
//                return "data-ngif=\"" + condition + "\"";
//            }
//        }
////
        return "";
////    }
//    }
    }
}