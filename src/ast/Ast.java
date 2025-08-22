package ast;

import ast.CSS.CssDocument;
import ast.HTML.HTMLDocument;
import ast.TS.TsDocument;

import java.io.FileWriter;
import java.io.IOException;

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




    @Override
    public String generate() {
        String cssCode = cssDocument != null ? cssDocument.generate() : "";
        String jsCode = tsDecument != null ? tsDecument.generate() : "";
        String htmlCode = htmlDocument != null ? htmlDocument.generate() : "";

        StringBuilder sb = new StringBuilder();

        sb.append("<!DOCTYPE html>\n")
                .append("<html lang=\"ar\">\n")
                .append("<head>\n")
                .append("    <meta charset=\"UTF-8\">\n")
                .append("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n")
                .append("    <title>قالب HTML مع Style و Script</title>\n")
                .append("    <style>\n")
                .append(cssCode).append("\n")
                .append("    </style>\n")
                .append("</head>\n")
                .append("<body>\n")
                .append("    <h1>مرحبا بك في موقعي!</h1>\n")
                .append("    <button class=\"button\" id=\"myButton\">اضغط هنا</button>\n\n")
                .append(htmlCode).append("\n")
                .append("    <script>\n")
                .append(jsCode).append("\n")
                .append("    </script>\n")
                .append("</body>\n")
                .append("</html>\n");

        String generatedCode = sb.toString();

        // Write directly to file inside generate()
        String filePath = "project.html"; // default file path
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write(generatedCode);
            System.out.println("✅ Project successfully written to " + filePath);
        } catch (IOException e) {
            System.err.println("❌ Error writing to file: " + e.getMessage());
            e.printStackTrace();
        }

        return generatedCode;
    }

}