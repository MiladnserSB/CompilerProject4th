package ast.HTML;

import ast.ASTNode;

public interface HtmlAttribute extends ASTNode {
    String getName();
    TagAttribute getTagAttribute();

    @Override
    default String generate() {
        // By default, return empty string, actual subclasses override it
        return "";
    }
}
