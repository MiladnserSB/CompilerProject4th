package ast.HTML;

public class HtmlCharData extends HtmlContentStatement {
    private final String content;
    private final boolean isWhitespace;

    public HtmlCharData(String content, boolean isWhitespace) {
        super(null); // You can set `this` if you want this node as statement
        this.content = content;
        this.isWhitespace = isWhitespace;
    }

    public String getContent() {
        return content;
    }

    public boolean isWhitespace() {
        return isWhitespace;
    }

    @Override
    public void prettyPrint(String indent) {
        if (isWhitespace) {
            System.out.println(indent + "HTML Character Data (Whitespace)");
        } else {
            System.out.println(indent + "HTML Character Data: " + content);
        }
    }
}
