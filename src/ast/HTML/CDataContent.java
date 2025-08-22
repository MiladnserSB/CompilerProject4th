package ast.HTML;

public class CDataContent extends HtmlContentStatement {
    private final String content;

    public CDataContent(String content) {
        super(null);
        this.content = content;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "CDATA: " + content);
    }

    @Override
    public String generate() {
        return "<![CDATA[" + content + "]]>";
    }
}
