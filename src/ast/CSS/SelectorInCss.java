package ast.CSS;

import ast.ASTNode;
import java.util.ArrayList;
import java.util.List;

public class SelectorInCss implements ASTNode {
    private String prefix; // DOT or HASH
    private String identifier;
    private String subIdentifier; // Optional second identifier after DOT
    private boolean isTag; // Whether it's a TAGSFORCSS

    // Constructor for (DOT | HASH) IDENTIFIER (DOT IDENTIFIER)?
    public SelectorInCss(String prefix, String identifier, String subIdentifier) {
        this.prefix = prefix;
        this.identifier = identifier;
        this.subIdentifier = subIdentifier;
        this.isTag = false;
    }

    // Constructor for TAGSFORCSS
    public SelectorInCss(String tag) {
        this.identifier = tag;
        this.isTag = true;
        this.prefix = null;
        this.subIdentifier = null;
    }

    public String getPrefix() {
        return prefix;
    }

    public String getIdentifier() {
        return identifier;
    }

    public String getSubIdentifier() {
        return subIdentifier;
    }

    public boolean isTag() {
        return isTag;
    }

    @Override
    public void prettyPrint(String indent) {
        if (isTag) {
            System.out.println(indent + "TagSelector: " + identifier);
        } else {
            System.out.println(indent + "CssSelector: " + prefix + identifier +
                    (subIdentifier != null ? "." + subIdentifier : ""));
        }
    }

    @Override
    public String generate() {
        if (isTag) {
            return identifier;
        } else {
            String result = prefix + identifier;
            if (subIdentifier != null) {
                result += "." + subIdentifier;
            }
            return result;
        }
    }
}