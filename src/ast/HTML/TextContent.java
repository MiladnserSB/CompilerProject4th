package ast.HTML;

public class TextContent extends HtmlContentStatement {
    private final String text;

    public TextContent(String text) {
        super(null);
        this.text = text;
    }

    public String getText() {
        return text;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "Text: " + text);
    }

    @Override
    public String generate() {
        return text != null ? text : "";
    }
}
