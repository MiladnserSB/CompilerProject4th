package ast.TS;

import ast.ASTNode;

public class TemplateUrl implements ASTNode {
    private String url;

    public TemplateUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "TemplateUrl: " + url);
    }

    @Override
    public String toString() {
        return "TemplateUrl='" + url + "'";
    }
    @Override
    public String generate() {
        // في Angular TS -> templateUrl: 'x.html'
        // في JS نعتبرها مجرد إشارة للملف
        return "// template: '" + url + "'\n";
    }

}

