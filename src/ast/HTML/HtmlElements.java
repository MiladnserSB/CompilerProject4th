package ast.HTML;

import ast.ASTNode;
import java.util.List;
import java.util.Collections;

public class HtmlElements implements ASTNode {
    private final List<ASTNode> leadingComments;
    private final ASTNode htmlElement;
    private final List<ASTNode> trailingComments;

    public HtmlElements(List<ASTNode> leadingComments, ASTNode htmlElement, List<ASTNode> trailingComments) {
        this.leadingComments = leadingComments != null ?
                Collections.unmodifiableList(leadingComments) :
                Collections.emptyList();
        this.htmlElement = htmlElement;
        this.trailingComments = trailingComments != null ?
                Collections.unmodifiableList(trailingComments) :
                Collections.emptyList();
    }

    public List<ASTNode> getLeadingComments() { return leadingComments; }
    public ASTNode getHtmlElement() { return htmlElement; }
    public List<ASTNode> getTrailingComments() { return trailingComments; }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "HTML Elements Block:");

        if (!leadingComments.isEmpty()) {
            System.out.println(indent + "  Leading Comments (" + leadingComments.size() + "):");
            for (int i = 0; i < leadingComments.size(); i++) {
                System.out.print(indent + "    " + (i+1) + ". ");
                leadingComments.get(i).prettyPrint("");
            }
        }

        if (htmlElement != null) {
            System.out.println(indent + "  Main Element:");
            htmlElement.prettyPrint(indent + "    ");
        } else {
            System.out.println(indent + "  [No Main Element]");
        }

        if (!trailingComments.isEmpty()) {
            System.out.println(indent + "  Trailing Comments (" + trailingComments.size() + "):");
            for (int i = 0; i < trailingComments.size(); i++) {
                System.out.print(indent + "    " + (i+1) + ". ");
                trailingComments.get(i).prettyPrint("");
            }
        }
    }

    @Override
    public String generate() {
        StringBuilder sb = new StringBuilder();

        // Generate leading comments
        if (!leadingComments.isEmpty()) {
            for (ASTNode comment : leadingComments) {
                sb.append(comment.generate());
            }
        }

        // Generate main element
        if (htmlElement != null) {
            sb.append(htmlElement.generate());
            sb.append("\n");
        }

        // Generate trailing comments
        if (!trailingComments.isEmpty()) {
            for (ASTNode comment : trailingComments) {
                sb.append(comment.generate());
            }
        }

        return sb.toString();
    }
}