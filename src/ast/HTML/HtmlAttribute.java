package ast.HTML;

import ast.ASTNode;

public interface HtmlAttribute extends ASTNode {
    String getName();
    TagAttribute getTagAttribute();

    // default generate function for normal attributes
    default String generate() {
        TagAttribute tagAttr = getTagAttribute();
        if (tagAttr == null) return getName();
        String value = tagAttr.generate();

        // property binding [value]
        if (getName().startsWith("[") && getName().endsWith("]")) {
            String plainName = getName().substring(1, getName().length() - 1);
            return plainName + "=\"" + value + "\"";
        }

        // event binding (click)
        if (getName().startsWith("(") && getName().endsWith(")")) {
            String eventName = getName().substring(1, getName().length() - 1);
            return "on" + eventName + "=\"" + value + "\"";
        }

        // normal attribute
        return getName() + "=\"" + value + "\"";
    }
}
