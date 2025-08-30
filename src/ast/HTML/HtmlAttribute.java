package ast.HTML;

import ast.ASTNode;

public interface HtmlAttribute extends ASTNode {
    String getName();
    TagAttribute getTagAttribute();

    @Override
    String generate();

    default String generate(String angularAttribute) {
        return generate();
    }
}