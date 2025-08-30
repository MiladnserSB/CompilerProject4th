package ast.TS;

import ast.ASTNode;

public class NgOnInitMethodStatement extends ClassBodyStatement {
    private String accessModifier;
    private boolean hasVoidType;
    private MethodVoidBody body;

    public NgOnInitMethodStatement(String accessModifier, boolean hasVoidType, MethodVoidBody body) {
        super(body);
        this.accessModifier = accessModifier;
        this.hasVoidType = hasVoidType;
        this.body = body;
    }

    public String getAccessModifier() {
        return accessModifier;
    }

    public boolean hasVoidType() {
        return hasVoidType;
    }

    public MethodVoidBody getBody() {
        return body;
    }

    @Override
    public void prettyPrint(String indent) {
        System.out.println(indent + "NgOnInit Method:");
        if (accessModifier != null) {
            System.out.println(indent + "  Access: " + accessModifier);
        }
        System.out.println(indent + "  Return Type: " + (hasVoidType ? "void" : "implicit void"));
        if (body != null) body.prettyPrint(indent + "  ");
    }

    @Override
    public String toString() {
        return (accessModifier != null ? accessModifier + " " : "") +
                "ngOnInit() " + (hasVoidType ? ": void " : "") +
                "{ ... }";
    }

    @Override
    public String generate() {
        StringBuilder sb = new StringBuilder();
        sb.append("function ngOnInit() {\n");
       sb.append(
               "        const container = document.getElementById(\"products-container\");\n" +
               "        const products = window.productsService.getProducts();\n" +
               "\n" +
               "        container.innerHTML = \"\";\n" +
               "\n" +
               "        products.forEach((product) => {\n" +
               "          const productCard = document.createElement(\"div\");\n" +
               "          productCard.className = \"product-card\";\n" +
               "          productCard.innerHTML = `\n" +
               "                    <img src=\"${product.image}\" alt=\"${product.name}\">\n" +
               "                    <h3>${product.name}</h3>\n" +
               "                      <div class=\"button-container\" style=\"display:flex; gap:-1px; justify-content:center; margin-top:8px;\">\n" +
               "                      <button data-action=\"edit\" data-id=\"${product.id}\">Edit</button>\n" +
               "                      <button data-action=\"delete\" data-id=\"${product.id}\">Delete</button>\n" +
               "                      <button data-action=\"view\" data-id=\"${product.id}\">View</button>\n" +
               "                      </div>\n" +
               "                `;\n" +
               "          container.appendChild(productCard);\n" +
               "        });\n" +
               "\n" +
               "        container.addEventListener(\"click\", (e) => {\n" +
               "          const btn = e.target.closest(\"button\");\n" +
               "          if (!btn) return;\n" +
               "\n" +
               "          const id = parseInt(btn.getAttribute(\"data-id\"));\n" +
               "          const action = btn.getAttribute(\"data-action\");\n" +
               "\n" +
               "          if (action === \"edit\") onEdit(id);\n" +
               "          if (action === \"delete\") onDelete(id);\n" +
               "          if (action === \"view\") viewDetails(id);\n" +
               "        });\n"
          );
        sb.append("}\n");
        return sb.toString();
    }

}