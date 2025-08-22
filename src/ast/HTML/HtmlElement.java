package ast.HTML;

import ast.ASTNode;

public interface HtmlElement extends ASTNode {
    /**
     * Generate the HTML (and JS if needed) representation of this element.
     * @return a String containing the generated HTML/JS code
     */
    String generate();
}
