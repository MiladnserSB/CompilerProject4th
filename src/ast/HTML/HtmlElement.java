package ast.HTML;

import ast.ASTNode;

public interface HtmlElement extends ASTNode {
    @Override
    String generate();
}
