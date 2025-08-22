package ast.HTML;

public class HtmlComment extends HtmlContentStatement {
    private final String commentText;
    private final boolean isConditional;

    public HtmlComment(String commentText, boolean isConditional) {
        super(null);
        this.commentText = commentText;
        this.isConditional = isConditional;
    }

    public String getCommentText() {
        return commentText;
    }

    public boolean isConditional() {
        return isConditional;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + (isConditional ? "Conditional Comment:" : "HTML Comment:"));
        System.out.println(indent + "  " + commentText);
    }

    @Override
    public String generate() {
        if (isConditional) {
            // Keep conditional comment syntax (e.g., <!--[if IE]> ... <![endif]-->)
            return "<![" + commentText + "]>";
        } else {
            return "<!-- " + commentText + " -->";
        }
    }
}
