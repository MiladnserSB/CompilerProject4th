package ast;

import ast.CSS.CssDocument;
import ast.HTML.HTMLDocument;
import ast.TS.TsDocument;

public class Ast implements ASTNode {
    private TsDocument tsDecument;
    private CssDocument cssDocument;
    private HTMLDocument htmlDocument;

    public Ast(TsDocument tsDecument, HTMLDocument htmlDocument, CssDocument cssDocument ) {
        this.tsDecument = tsDecument;
        this.cssDocument = cssDocument;
        this.htmlDocument = htmlDocument;
    }

    public TsDocument getTsDecument() {
        return tsDecument;
    }

    public HTMLDocument getHtmlDocument() {
        return htmlDocument;
    }

    public CssDocument getCssDocument() {
        return cssDocument;
    }

    public void setTsDecument(TsDocument tsDecument) {
        this.tsDecument = tsDecument;
    }

    public void setHtmlDocument(HTMLDocument htmlDocument) {
        this.htmlDocument = htmlDocument;
    }

    public void setCssDocument(CssDocument cssDocument) {
        this.cssDocument = cssDocument;
    }

    public TsDocument getTSDocument() {
        return tsDecument;
    }

    public CssDocument getCSSDocument() {
        return cssDocument;
    }

    public HTMLDocument getHTMLDocument() {
        return htmlDocument;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println();
        System.out.println();
        System.out.println(indent + "AST:");
        if (tsDecument != null) {
            tsDecument.prettyPrint(indent + "    ");
        }
        System.out.println();
        System.out.println();
        if (htmlDocument != null && !htmlDocument.getHtmlElements().isEmpty()) {
            htmlDocument.prettyPrint(indent + "    ");
        }else{
            System.out.println("///////////////Empty HTML");
        }
        System.out.println();
        System.out.println();
        if (cssDocument != null && !cssDocument.getRuleSets().isEmpty()) {
            cssDocument.prettyPrint(indent + "    ");
        }
        else{
            System.out.println("///////////////Empty CSS");
        }
    }
}