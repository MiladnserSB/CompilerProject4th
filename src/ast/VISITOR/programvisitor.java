package ast.VISITOR;
import SymanticCheck.*;
import antlr.Lexergrammmar;
import antlr.Parsergrammar;
import antlr.ParsergrammarBaseVisitor;
import ast.ASTNode;
import ast.Ast;
import ast.CSS.*;
import ast.HTML.*;
import ast.SymbolTable.Row;
import ast.SymbolTable.SymbolTable;
import ast.TS.*;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import java.util.ArrayList;
import java.util.List;

public class programvisitor  extends ParsergrammarBaseVisitor <ASTNode> {
    public SymbolTable st = new SymbolTable();
    public AlreadyDefinedVariableErrorSymbolTable alreadyDefinedVariableErrorSymbolTable = new AlreadyDefinedVariableErrorSymbolTable();
    public MissedTemplateErrorSymbolTable missedTemplateErrorSymbolTable = new MissedTemplateErrorSymbolTable();
    public UndefinedMethodCallErrorSymbolTable undefinedMethodCallErrorSymbolTable = new UndefinedMethodCallErrorSymbolTable();
    public UndefinedImportsErrorSymbolTable undefinedImportsErrorSymbolTable = new UndefinedImportsErrorSymbolTable();
    public NotFoundReturnValueMethodErrorSymbolTable notFoundReturnValueMethodErrorSymbolTable = new NotFoundReturnValueMethodErrorSymbolTable();
    public ClassDeclarationOrDecoratorExpectedErrorSymbolTable classDeclarationOrDecoratorExpectedErrorSymbolTable = new ClassDeclarationOrDecoratorExpectedErrorSymbolTable();
    public IncorrectlyOnInitImplementErrorSymbolTable incorrectlyOnInitImplementErrorSymbolTable = new IncorrectlyOnInitImplementErrorSymbolTable();
    public MissedConstructorAccessModifierErrorSymbolTable missedConstructorAccessModifierErrorSymbolTable= new MissedConstructorAccessModifierErrorSymbolTable();

    @Override
    public ASTNode visitAst(Parsergrammar.AstContext ctx) {
        System.out.println("Visiting AST node...");
        TsDocument tsDecument = (TsDocument) visit(ctx.tsDocument());
        HTMLDocument htmlDocument = (HTMLDocument) visit(ctx.htmlDocument());
        CssDocument cssDocument = (CssDocument) visit(ctx.cssDocument());
//        Row row = new Row();
//        row.setName("AST");
//        row.setValue("AST with TS, CSS, and HTML documents");
//        this.st.addRow("AST", row);
        return new Ast(tsDecument, htmlDocument, cssDocument);
    }


    @Override
    public ASTNode visitTsDocument(Parsergrammar.TsDocumentContext ctx) {
        List<ImportStatement> imports = new ArrayList<>();
        for (Parsergrammar.ImportStatementContext importCtx : ctx.importStatement()) {
            imports.add((ImportStatement) visit(importCtx));
        }
        ASTNode decorator = null;
        boolean isComponent = false;
        if (ctx.componentDecorator() != null) {
            isComponent = true;
            decorator = visit(ctx.componentDecorator());
        } else if (ctx.injectableDecorator() != null) {
            decorator = visit(ctx.injectableDecorator());
        }
        if(decorator==null)
        {
            int line = ctx.importStatement(ctx.importStatement().size()-1).SEMICOLON().getSymbol().getLine()+1;

            DecoratorExpectedError decoratorExpectedError = new DecoratorExpectedError(classDeclarationOrDecoratorExpectedErrorSymbolTable,line);
            if(isComponent)
            { if(!decoratorExpectedError.classDeclarationOrDecoratorExpectedErrorSymbolTable.check("ComponentDecorator")){
            decoratorExpectedError.throwException();
                }}
            else{
                if(!decoratorExpectedError.classDeclarationOrDecoratorExpectedErrorSymbolTable.check("InjectableDecorator")){
                    decoratorExpectedError.throwException();
                }
            }
        }
        ClassDeclaration classDecl = (ClassDeclaration) visit(ctx.classDeclaration());
        int line = -1;
        if(ctx.componentDecorator()!=null)
        {if(ctx.componentDecorator().RBRACE()!=null)
            line = ctx.componentDecorator().RBRACE().getSymbol().getLine();}
       else if(ctx.injectableDecorator()!=null)
        { line = ctx.injectableDecorator().RBRACE().getSymbol().getLine();}
                ClassDeclarationExpectedError classDeclarationExpectedError = new ClassDeclarationExpectedError(classDeclarationOrDecoratorExpectedErrorSymbolTable,line);
                    if(!classDeclarationExpectedError.classDeclarationOrDecoratorExpectedErrorSymbolTable.check(classDecl.getClassName())){
                        classDeclarationExpectedError.throwException();
                    }

        TsDocument tsDoc = new TsDocument(imports, decorator, classDecl);
//        Row row = new Row();
//        row.setName(classDecl.getClassName());
//        row.setValue(tsDoc.toString());
//        this.st.addRow("TSDocument", row);
        return tsDoc;
    }

    @Override
    public ASTNode visitClassDeclaration(Parsergrammar.ClassDeclarationContext ctx) {
        this.classDeclarationOrDecoratorExpectedErrorSymbolTable.enterScope("class");
        String className="";
        if(ctx.IDENTIFIER()!=null)
        { className = ctx.IDENTIFIER().getText();}
        ImplementsClause implementsClause = null;
        if (ctx.implementsClause() != null) {
            implementsClause = (ImplementsClause) visit(ctx.implementsClause());
        }
        List<ASTNode> classBodyNodes = new ArrayList<>();
        if (ctx.classBody() != null) {
            ClassBody classBody = (ClassBody) visit(ctx.classBody());
            classBodyNodes.addAll(classBody.getMembers());
        }
        ClassDeclaration classDecl = new ClassDeclaration(className, implementsClause, classBodyNodes);
        if(ctx.implementsClause()!=null)
        {
            if(classDecl.getImplementsClause().getInterfaces().contains("OnInit")) {

                int line = ctx.implementsClause().CROISNN(0).getSymbol().getLine();
                IncorrectlyOnInitImplementError incorrectlyOnInitImplementError = new IncorrectlyOnInitImplementError(incorrectlyOnInitImplementErrorSymbolTable,line);
                if(!incorrectlyOnInitImplementError.incorrectlyOnInitImplementErrorSymbolTable.check("ngOnInit"))
                {
                    incorrectlyOnInitImplementError.throwException();
                }
            }
        }
        Row row = new Row();
        row.setName(className);
        row.setValue("Class with " + classBodyNodes.size() + " members");
        row.setScope("class");

        if(ctx.IDENTIFIER()!=null)
        { this.classDeclarationOrDecoratorExpectedErrorSymbolTable.addRow(className, row);

        }
        this.classDeclarationOrDecoratorExpectedErrorSymbolTable.exitScope();

        return classDecl;
    }

    @Override
    public ASTNode visitClassBody(Parsergrammar.ClassBodyContext ctx) {
        ClassBody body = new ClassBody();
        boolean hasSignalDeclaration = false;
        int signalLine = -1;

        for (Parsergrammar.ClassBodyStatementContext stmtCtx : ctx.classBodyStatement()) {
            ClassBodyStatement statement = (ClassBodyStatement) visit(stmtCtx); // must return a concrete subclass
            if (statement == null) continue;

            body.addMember(statement);

            if (statement instanceof SignalDeclarationStatement) {
                hasSignalDeclaration = true;
                signalLine = stmtCtx.getStart().getLine();
            }
        }

        if (hasSignalDeclaration && !undefinedImportsErrorSymbolTable.check("signal")) {
            NotImportedSignalError notImportedSignalError =
                    new NotImportedSignalError(undefinedImportsErrorSymbolTable, signalLine);
            notImportedSignalError.throwException();
        }

        return body;
    }



    @Override
    public ASTNode visitClassBodyStatement(Parsergrammar.ClassBodyStatementContext ctx) {
//        System.out.println("jjjjjjjjjj");
//        ASTNode node = visit(ctx.getChild(0));
//        if ("class".equals(this.st.getCurrentScope())) {
//            return new ClassBodyStatement(node);
//        } else {
//            return node;
//        }
        return null;
    }

    @Override
    public ASTNode visitSelector(Parsergrammar.SelectorContext ctx) {
        String value = ctx.STRING_LITERAL().getText().replace("'", "");
        Selector selector = new Selector(value);
        /*Row row = new Row();
        row.setName("Selector");
        row.setValue("Selector: " + value);
        this.missedTemplateErrorSymbolTable.addRow("Selector", row);*/
        return selector;
    }

    @Override
    public ASTNode visitImports(Parsergrammar.ImportsContext ctx) {
        List<String> importsList = new ArrayList<>();
        if (ctx.IDENTIFIER() != null) {
            for (var id : ctx.IDENTIFIER()) {
                int line = id.getSymbol().getLine();
                UndefinedImportsError undefinedImportsError = new UndefinedImportsError(id.getText(), undefinedImportsErrorSymbolTable, line);
                if (!undefinedImportsError.undefinedImportsErrorSymbolTable.check(id.getText())) {
                    undefinedImportsError.throwException();
                }
                importsList.add(id.getText());
            }
        }
        if (ctx.CROISNN() != null) {
            for (var croisnn : ctx.CROISNN()) {
                int line = croisnn.getSymbol().getLine();
                UndefinedImportsError undefinedImportsError = new UndefinedImportsError(croisnn.getText(), undefinedImportsErrorSymbolTable, line);
                if (!undefinedImportsError.undefinedImportsErrorSymbolTable.check(croisnn.getText())) {
                    undefinedImportsError.throwException();
                }
                importsList.add(croisnn.getText());
            }
        }

        Imports imports = new Imports(importsList);
       /* Row row = new Row();
        row.setName("Imports");
        row.setValue("Imports: " + String.join(", ", importsList));
        this.missedTemplateErrorSymbolTable.addRow("Imports", row);*/
        return imports;
    }


    @Override
    public ASTNode visitTemplateurl(Parsergrammar.TemplateurlContext ctx) {
        if(ctx.STRING_LITERAL()!=null) {
            String url = ctx.STRING_LITERAL().getText().replace("'", "");
            TemplateUrl templateUrl = new TemplateUrl(url);
            Row row = new Row();
            row.setName("TemplateUrl");
            row.setValue(url);
            this.missedTemplateErrorSymbolTable.addRow("TemplateUrl", row);
            return templateUrl;
        }
        return null;
    }

    @Override
    public ASTNode visitStyleurl(Parsergrammar.StyleurlContext ctx) {
        String url = ctx.STRING_LITERAL().getText().replace("'", "");
        StyleUrl styleUrl = new StyleUrl(url);
//        Row row = new Row();
//        row.setName("StyleUrl");
//        row.setValue("Style URL: " + url);
//        this.missedTemplateErrorSymbolTable.addRow("StyleUrl", row);
        return styleUrl;
    }

    @Override
    public ASTNode visitSignature(Parsergrammar.SignatureContext ctx) {
        String accessModifier = ctx.ACCESS() != null ? ctx.ACCESS().getText() : null;
        String staticModifier = ctx.STATIC() != null ? ctx.STATIC().getText() : null;
        String name = ctx.IDENTIFIER().getText();
        Signature signature = new Signature(accessModifier, staticModifier, name);
//        Row row = new Row();
//        row.setName(name);
//        row.setValue("Signature: " + signature.toString());
//        this.st.addRow(name, row);
        return signature;
    }

    @Override
    public ASTNode visitParameters(Parsergrammar.ParametersContext ctx) {
        Parameters parameters = new Parameters();
        int count = ctx.IDENTIFIER().size();
        for (int i = 0; i < count; i++) {
            String name = ctx.IDENTIFIER(i).getText();
            String type = ctx.TYPE(i).getText();
            parameters.addParameter(name, type);
        }
//        Row row = new Row();
//        row.setName("Parameters");
//        row.setValue("Parameters: " + parameters.toString());
//        this.st.addRow("Parameters", row);
        return parameters;
    }

//    @Override
//    public ASTNode visitMethodvoidbody(Parsergrammar.MethodvoidbodyContext ctx) {
//        List<ASTNode> statements = new ArrayList<>();
//        for (var stmtCtx : ctx.methodAssignment()) {
//            statements.add(visit(stmtCtx));
//        }
//        for (var crudCtx : ctx.crudBodyRule()) {
//            statements.add(visit(crudCtx));
//        }
//        for (var ifCtx : ctx.ifStatement()) {
//            statements.add(visit(ifCtx));
//        }
//        return new MethodVoidBody(statements);
//    }

//    @Override
//    public ASTNode visitMethodAssignment(Parsergrammar.MethodAssignmentContext ctx) {
//        // Check each labeled alternative dynamically
//        if (ctx.getChildCount() > 0) {
//            for (int i = 0; i < ctx.getChildCount(); i++) {
//                var child = ctx.getChild(i);
//                if (child instanceof Parsergrammar.ThisDotIdentifierAssignRuleContext
//                        || child instanceof Parsergrammar.ThisDotIdentifierAssignValuesRuleContext
//                        || child instanceof Parsergrammar.IdentifierAssignmentRuleContext
//                        || child instanceof Parsergrammar.ThisDotIdentifierAssignWithBracesRuleContext
//                        || child instanceof Parsergrammar.StaticAssignmentRuleContext) {
//                    return visit(child);
//                }
//            }
//        }
//        return null; // or throw an exception if nothing matched
//    }



//
//    @Override
//    public ASTNode visitThisDotIdentifierAssign(Parsergrammar.ThisDotIdentifierAssignContext ctx) {
//        // matches constructor: (leftIdentifier, rightIdentifier1, rightIdentifier2)
//        return new ThisDotIdentifierAssign(
//                ctx.IDENTIFIER(0).getText(),
//                ctx.IDENTIFIER(1).getText(),
//                ctx.IDENTIFIER(2).getText()
//        );
//    }
//
//    @Override
//    public ASTNode visitThisDotIdentifierAssignValues(Parsergrammar.ThisDotIdentifierAssignValuesContext ctx) {
//        // matches constructor: (leftIdentifier, value)
//        String left = ctx.IDENTIFIER(0).getText();
//        String value;
//        if (ctx.IDENTIFIER().size() > 1) {
//            value = ctx.IDENTIFIER(1).getText();
//        } else {
//            value = ctx.values().getText();
//        }
//        return new ThisDotIdentifierAssignValues(left, value);
//    }
//
//    @Override
//    public ASTNode visitIdentifierAssignment(Parsergrammar.IdentifierAssignmentContext ctx) {
//        // IdentifierAssignment(String left, String right, MethodCall methodCall)
//        String left = ctx.IDENTIFIER(0).getText();
//        String right = ctx.IDENTIFIER().size() > 1 ? ctx.IDENTIFIER(1).getText() : null;
//
//        MethodCall methodCall = null;
//        if (ctx.methodcall() != null) {
//            String methodName;
//            if(ctx.methodcall().IDENTIFIER(0) != null)
//                methodName = ctx.methodcall().IDENTIFIER(0).getText();
//            else
//                methodName= "";
//            String argument = ctx.methodcall().IDENTIFIER().size() > 1
//                    ? ctx.methodcall().IDENTIFIER(1).getText()
//                    : null;
//
////            int line = ctx.methodcall().IDENTIFIER(0).getSymbol().getLine();
//
//            // error check for undefined method
//            if (!undefinedMethodCallErrorSymbolTable.check(methodName)) {
////                UndefinedMethodCallError error =
////                        new UndefinedMethodCallError(methodName, line, undefinedMethodCallErrorSymbolTable);
////                error.throwException();
//            }
//
//            methodCall = new MethodCall(methodName, argument);
//        }
//
//        return new IdentifierAssignment(left, right, methodCall);
//    }
//
//    @Override
//    public ASTNode visitThisDotIdentifierAssignWithBraces(Parsergrammar.ThisDotIdentifierAssignWithBracesContext ctx) {
//        // matches constructor: (leftIdentifier, spreadIdentifier)
//        return new ThisDotIdentifierAssignWithBraces(
//                ctx.IDENTIFIER(0).getText(),
//                ctx.IDENTIFIER(1).getText()
//        );
//    }
//
//    @Override
//    public ASTNode visitStaticAssignment(Parsergrammar.StaticAssignmentContext ctx) {
//        // StaticAssignment(String identifier, String spreadThisIdentifier, String dateIdentifier, MethodCall methodCall)
//        String identifier = ctx.IDENTIFIER(0).getText();
//        String spreadThis = ctx.IDENTIFIER(1).getText();
//        String dateField = ctx.IDENTIFIER(2).getText();
//        String methodName;
//        if(ctx.methodcall().IDENTIFIER(0)!=null)
//        {   methodName = ctx.methodcall().IDENTIFIER(0).getText();}
//        else{
//             methodName="";
//        }
//        String argument = ctx.methodcall().IDENTIFIER().size() > 1
//                ? ctx.methodcall().IDENTIFIER(1).getText()
//                : null;
//
//        MethodCall methodCall = new MethodCall(methodName, argument);
//
//        return new StaticAssignment(identifier, spreadThis, dateField, methodCall);
//    }
//
    @Override
    public ASTNode visitCrudBodyRule(Parsergrammar.CrudBodyRuleContext ctx) {
        // String form like: "this.<id>.next" or "this.<id>.value"
        String crudExpression = ctx.crudBody().getText();

        // Determine the method name from crudBody: NEXT or VALUE
        Parsergrammar.CrudBodyContext cb = ctx.crudBody();
        String methodName = null;
        if (cb.NEXT() != null) {
            methodName = cb.NEXT().getText();   // typically "next"
        } else if (cb.VALUE() != null) {
            methodName = cb.VALUE().getText();  // typically "value"
        }

        // Extract the argument inside nextCall's parentheses
        Parsergrammar.NextCallContext nc = ctx.nextCall();
        String argument;
        if (nc.addCall() != null) {
            // e.g. "[...this.x.next, item]"
            argument = nc.addCall().getText();
        } else {
            // e.g. "this.x.value.map(...)" or "this.x.value.filter(...)"
            argument = nc.edit_delete_call().getText();
        }

        MethodCall next = new MethodCall(methodName, argument);
        return new CrudBodyRule(crudExpression, next);
    }


    @Override
    public ASTNode visitIfStatement(Parsergrammar.IfStatementContext ctx) {
        String left = ctx.IDENTIFIER(0).getText();   // condition lhs: this.<left>?.
        String right = ctx.IDENTIFIER(1).getText();  // condition rhs after ?.
        String compareTo = ctx.IDENTIFIER(2).getText(); // identifier compared with ===

        // Build the body list from the single ifBody
        List<IfBody> bodyList = new ArrayList<>();
        Parsergrammar.IfBodyContext bodyCtx = ctx.ifBody();
        int n = bodyCtx.IDENTIFIER().size(); // one per assignment in the body
        for (int i = 0; i < n; i++) {
            String assignLeft = bodyCtx.IDENTIFIER(i).getText();
            String value = bodyCtx.values(i).getText();
            bodyList.add(new IfBody(assignLeft, value));
        }

        return new IfStatement(left, right, compareTo, bodyList);
    }



    @Override
    public ASTNode visitIfBody(Parsergrammar.IfBodyContext ctx) {
        // Return the first assignment; the full list is constructed in visitIfStatement.
        String left = ctx.IDENTIFIER(0).getText();
        String value = ctx.values(0).getText();
        return new IfBody(left, value);
    }




//    @Override
//    public ASTNode visitMethodCall(Parsergrammar.MethodcallContext ctx) {
//        System.out.println("*********************************************************");
//       // method name can be IDENTIFIER, NAVIGATE, or NOW
//       String methodName = ctx.IDENTIFIER() != null
//               ? ctx.IDENTIFIER(0).getText()
//               : (ctx.NAVIGATE() != null ? ctx.NAVIGATE().getText() : ctx.NOW().getText());
//        System.out.println("//////////////////////////////////////////////////////////////////////"+methodName);
//       String argument = null;
//       if (ctx.IDENTIFIER().size() > 1) {
//           // case: IDENTIFIER(...) or this.IDENTIFIER
//           if (ctx.THIS() != null) {
//               argument = "this." + ctx.IDENTIFIER(1).getText();
//           } else {
//               argument = ctx.IDENTIFIER(1).getText();
//           }
//       } else if (ctx.STRING_LITERAL() != null) {
//           // case: ["string"]
//           argument = "[\"" + ctx.STRING_LITERAL().getText().replaceAll("\"", "") + "\"]";
//       }
//
//       MethodCall methodCall = new MethodCall(methodName, argument);
//
//       // Symbol table tracking (optional logging)
//       Row row = new Row();
//       row.setName("MethodCall");
//       row.setValue("Method: " + methodName + (argument != null ? ", Arg: " + argument : ""));
//       this.undefinedMethodCallErrorSymbolTable.addRow("MethodCall", row);
//
//       return methodCall;
//   }


    @Override
    public ASTNode visitMethodvoid(Parsergrammar.MethodvoidContext ctx) {
//        // Enter a new scope for the method body
//        this.undefinedMethodCallErrorSymbolTable.enterScope("Local");
//
//        // Visit and extract method components
//        Signature signature = (Signature) visit(ctx.signature());
//        Parameters parameters = ctx.parameters() != null ? (Parameters) visit(ctx.parameters()) : null;
//        MethodVoidBody body = (MethodVoidBody) visit(ctx.methodvoidbody());
//
//        // Line number for potential error reporting
//        int line = ctx.signature().IDENTIFIER().getSymbol().getLine();
//
//        // Create the AST node
//        VoidMethodDeclarationStatement method = new VoidMethodDeclarationStatement(signature, parameters, body);
//
//        // Add entry to symbol table for error tracking
//        Row row = new Row();
//        row.setName(signature.getName());
//        row.setValue(ctx.methodvoidbody().getText());
//
//        this.undefinedMethodCallErrorSymbolTable.addRow(signature.getName(), row);
//
//        // Exit scope
//        this.undefinedMethodCallErrorSymbolTable.exitScope();
//
//        return method;
// Visit method signature
        Signature signature = (Signature) visit(ctx.signature());

        // Visit parameters (may be null)
        Parameters parameters = ctx.parameters() != null ?
                (Parameters) visit(ctx.parameters()) : null;

        // Visit body
        MethodVoidBody body = (MethodVoidBody) visit(ctx.methodvoidbody());

        // Build final AST node
        return new VoidMethodDeclarationStatement(signature, parameters, body);
    }

    @Override
    public ASTNode visitNgOnInitMETHOD(Parsergrammar.NgOnInitMETHODContext ctx) {
        this.incorrectlyOnInitImplementErrorSymbolTable.enterScope("local");

        String accessModifier = ctx.ACCESS() != null ? ctx.ACCESS().getText() : null;
        boolean hasVoidType = ctx.VOIDTYPE() != null;

        MethodVoidBody body = (MethodVoidBody) visit(ctx.methodvoidbody());

        NgOnInitMethodStatement method =
                new NgOnInitMethodStatement(accessModifier, hasVoidType, body);

        // Symbol table tracking
        Row row = new Row();
        row.setName("ngOnInit");
        row.setValue(method.toString());
        this.incorrectlyOnInitImplementErrorSymbolTable.addRow("ngOnInit", row);

        this.incorrectlyOnInitImplementErrorSymbolTable.exitScope();
        return method;
    }


    @Override
    public ASTNode visitValues(Parsergrammar.ValuesContext ctx) {
        String value;

        if (ctx.NULL() != null) {
            value = "null";
        } else if (ctx.NUMBER() != null) {
            value = ctx.NUMBER().getText();
        } else if (ctx.STRING_LITERAL() != null) {
            value = ctx.STRING_LITERAL().getText().replace("'", "");
        } else if (ctx.BOOLEAN() != null) {
            value = ctx.BOOLEAN().getText();
        } else {
            value = "undefined";
        }

        Values valNode = new Values(value);

//        Row row = new Row();
//        row.setName("LiteralValue");
//        row.setValue("Value: " + value);
//        this.st.addRow("LiteralValue", row);

        return valNode;
    }

    @Override
    public ASTNode visitImportBody(Parsergrammar.ImportBodyContext ctx) {
        String name;
        if (ctx.IDENTIFIER() != null) {
            name = ctx.IDENTIFIER().getText();
        } else if (ctx.CROISNN() != null) {
            name = ctx.CROISNN().getText();
        } else if (ctx.COMPONENT() != null) {
            name = ctx.COMPONENT().getText();
        } else if (ctx.INJECTABLE() != null) {
            name = ctx.INJECTABLE().getText();
        } else {
            name = "UnknownImportItem";
        }

        ImportBody importBody = new ImportBody(name);

//        Row row = new Row();
//        row.setName(name);
//        row.setValue("Imported: " + name);
//        this.undefinedImportsErrorSymbolTable.addRow(name, row);

        return importBody;
    }


    @Override
    public ASTNode visitImportStatement(Parsergrammar.ImportStatementContext ctx) {
        List<ImportBody> items = new ArrayList<>();

        for (Parsergrammar.ImportBodyContext bodyCtx : ctx.importBody()) {
            ImportBody item = (ImportBody) visit(bodyCtx);
            items.add(item);
        }

        String source;
        if(ctx.STRING_LITERAL() != null){
            source = ctx.STRING_LITERAL().getText();
        }else{
            source="";
        }
        if(ctx.STRING_LITERAL() != null)
        {source = source.substring(1, source.length() - 1);}

        ImportStatement stmt = new ImportStatement(items, source);
        for(var i: items) {
            Row row = new Row();
            row.setName(i.getName());
            row.setValue("from "+ source);
            this.undefinedImportsErrorSymbolTable.addRow(i.getName(), row);
        }
        return stmt;
    }

    @Override
    public ASTNode visitComponentProperties(Parsergrammar.ComponentPropertiesContext ctx) {
        Selector selector = null;
        Imports imports = null;
        TemplateUrl templateUrl = null;
        StyleUrl styleUrl = null;

        if (ctx.selector() != null) {
            selector = (Selector) visit(ctx.selector());
        }
        if (ctx.imports() != null) {
            imports = (Imports) visit(ctx.imports());
        }
        if (ctx.styleurl() != null) {
            styleUrl = (StyleUrl) visit(ctx.styleurl());
        }
        if (ctx.templateurl() != null) {
            templateUrl = (TemplateUrl) visit(ctx.templateurl());
        }


        ComponentProperties props = new ComponentProperties(selector, imports, templateUrl, styleUrl);

        Row row = new Row();
        row.setName("ComponentProperties");
        String value = "";
        if (selector != null) value += "Selector: " + selector.getValue() + ", ";
        if (templateUrl != null) value += "TemplateUrl: " + templateUrl.getUrl()+ ", ";
        if (styleUrl != null) value += "StyleUrl: " + styleUrl.getUrl()+ ", ";
        if (imports != null) value += "Imports: " + imports.getIdentifiers();
        row.setValue(value);
        this.missedTemplateErrorSymbolTable.addRow("ComponentProperties", row);

        return props;
    }

    @Override
    public ASTNode visitComponentDecorator(Parsergrammar.ComponentDecoratorContext ctx) {

        ComponentProperties componentProperties = null;

        if (ctx.componentProperties() != null) {
            componentProperties = (ComponentProperties) visit(ctx.componentProperties());


//            if (!missedTemplateErrorSymbolTable.check("TemplateUrl")) {
//                int line = ctx.componentProperties().styleurl().STYLEURL().getSymbol().getLine();
//                MissedTemplateError error = new MissedTemplateError(missedTemplateErrorSymbolTable, line);
//                error.throwException();
//            }
        }
        ComponentDecorator decorator = new ComponentDecorator(componentProperties);

        Row row = new Row();
        row.setName("ComponentDecorator");
        row.setValue("Component with properties");
        missedTemplateErrorSymbolTable.addRow("ComponentDecorator", row);
        classDeclarationOrDecoratorExpectedErrorSymbolTable.addRow("ComponentDecorator", row);
        return decorator;
    }

    @Override
    public ASTNode visitMethodDeclaration(Parsergrammar.MethodDeclarationContext ctx) {
        Signature signature = (Signature) visit(ctx.signature());
        Parameters parameters = ctx.parameters() != null ? (Parameters) visit(ctx.parameters()) : null;
        MethodBody methodBody = (MethodBody) visit(ctx.methodBody());
        String methodName = signature.getName();

        int line = ctx.RBRACE().getSymbol().getLine();
        NotFoundReturnValueMethodError notFoundReturnValueMethodError = new NotFoundReturnValueMethodError(signature.getName(),notFoundReturnValueMethodErrorSymbolTable,line);
        if(!notFoundReturnValueMethodError.notFoundReturnValueMethodErrorSymbolTable.check("ReturnStatement")){
            notFoundReturnValueMethodError.throwException();
        }
        Row row = new Row();
        row.setName(methodName);
        row.setValue(ctx.methodBody().getText());

        undefinedMethodCallErrorSymbolTable.addRow(signature.getName(),row);

        return new TypedMethodDeclarationStatement(signature, parameters, methodBody);
    }

    @Override
    public ASTNode visitMethodBody(Parsergrammar.MethodBodyContext ctx) {
        boolean isThisRef = ctx.THIS() != null;
        String returnTarget = null;
        ASTNode valueNode = null;
        boolean hasDotValue = false;

        if (ctx.IDENTIFIER() != null) {
            returnTarget = ctx.IDENTIFIER().getText();
            hasDotValue = ctx.VALUE() != null;
        } else if (ctx.values() != null) {
            valueNode = (ASTNode) visit(ctx.values());
        }

        MethodBody methodBody = new MethodBody(isThisRef, returnTarget, valueNode, hasDotValue);

        Row row = new Row();
        row.setName("ReturnStatement");

        String returned = returnTarget != null
                ? (isThisRef ? "this." : "") + returnTarget + (hasDotValue ? ".value" : "")
                : (valueNode != null ? valueNode.toString() : "null");

        row.setValue("Returns: " + returned);

        if (returnTarget != null && "return".equals(ctx.RETURN().getText())) {
            this.notFoundReturnValueMethodErrorSymbolTable.addRow("ReturnStatement", row);
            return methodBody;
        }

        return null;
    }


    @Override
    public ASTNode visitProvidedIn(Parsergrammar.ProvidedinContext ctx) {
        String providedIn = ctx.STRING_LITERAL().getText();
//        Row row = new Row();
//        row.setName("InjectableProperties");
//        row.setValue("providedIn: " + providedIn);
//        this.st.addRow("InjectableProperties", row);
        return new ProvidedIn(providedIn);

    }

    @Override
    public ASTNode visitInjectableDecorator(Parsergrammar.InjectableDecoratorContext ctx) {
        ProvidedIn providedIn = null;

        if (ctx.providedin() != null) {
            providedIn = (ProvidedIn) visitProvidedIn(ctx.providedin());
        }

        InjectableDecorator decorator = new InjectableDecorator(providedIn);

        Row row = new Row();
        row.setName("InjectableDecorator");
        row.setValue("Injectable with providedIn: " + (providedIn != null ? providedIn.getProvidedIn() : "none"));
        this.classDeclarationOrDecoratorExpectedErrorSymbolTable.addRow("InjectableDecorator", row);

        return decorator;
    }

    @Override
    public ASTNode visitArrayExpression3(Parsergrammar.ArrayExpression3Context ctx) {
        Signature signature = (Signature) visit(ctx.signature());

        String observableType = ctx.observableArray().getText();

        List<ArrayBody1> elements = new ArrayList<>();
        for (Parsergrammar.Arraybody1Context elemCtx : ctx.arraybody1()) {
            ArrayBody1 element = (ArrayBody1) visit(elemCtx);
            elements.add(element);
        }

        ArrayExprThreeStatement arrayExpr=new ArrayExprThreeStatement(signature, observableType, elements);

        return arrayExpr;
    }
    @Override
    public ASTNode visitArrayExpression1(Parsergrammar.ArrayExpression1Context ctx) {
        Signature signature = (Signature) visit(ctx.signature());
        List<ASTNode> elements = new ArrayList<>();

        for (Parsergrammar.Arraybody1Context elemCtx : ctx.arraybody1()) {
            ASTNode element = visit(elemCtx);
            if (element != null) {
                elements.add(element);
            }
        }
        ArrayExprOneStatement arrayExpr = new ArrayExprOneStatement(signature, elements);

//        Row row = new Row();
//        row.setName(signature.getName());
//        row.setValue("Array with " + elements.size() + " elements");
//        this.st.addRow(signature.getName(), row);

        return arrayExpr;
    }


    @Override
    public ASTNode visitObjectExpression(Parsergrammar.ObjectExpressionContext ctx) {
        String assignIdentifier = null;
        if (ctx.IDENTIFIER(0) != null && ctx.ASSIGN() != null) {
            assignIdentifier = ctx.IDENTIFIER(0).getText();
        }

        List<String> keys = new ArrayList<>();
        List<ASTNode> values = new ArrayList<>();

        int startIndex = (assignIdentifier != null) ? 1 : 0;

        for (int i = 0; i < ctx.values().size(); i++) {
            keys.add(ctx.IDENTIFIER(startIndex + i).getText());
            values.add(visit(ctx.values(i)));
        }

        return new ObjectExpression(assignIdentifier, keys, values);
    }


    @Override
    public ASTNode visitArraybody1(Parsergrammar.Arraybody1Context ctx) {
        if (ctx.objectExpression() != null) {
            ASTNode objectExpr = visit(ctx.objectExpression());
            return new ArrayBody1(objectExpr, null, null);
        } else if (ctx.NUMBER() != null) {
            String numberText = ctx.NUMBER().getText();
            return new ArrayBody1(null, numberText, null);
        } else if (ctx.STRING_LITERAL() != null) {
            String strLiteral = ctx.STRING_LITERAL().getText();
            return new ArrayBody1(null, null, strLiteral);
        } else {
            throw new RuntimeException("Invalid arraybody1 content");
        }
    }

    @Override
    public ASTNode visitArraybody2(Parsergrammar.Arraybody2Context ctx) {
        ASTNode objExpr = visit(ctx.objectExpression());
        ASTNode num = new Values(ctx.NUMBER().getText());
        ASTNode str = new Values(ctx.STRING_LITERAL().getText());

        ArrayBody2 result = new ArrayBody2(objExpr, num, str);

//        Row row = new Row();
//        row.setName("ArrayBody2");
//        row.setValue("Composite: " + result.toString());
//        this.st.addRow("ArrayBody2", row);

        return result;
    }


    @Override
    public ASTNode visitArrayExpression2(Parsergrammar.ArrayExpression2Context ctx) {
        Signature signature = (Signature) visit(ctx.signature());
        String type = ctx.TYPE().getText();

        List<ASTNode> elements = new ArrayList<>();
        for (Parsergrammar.Arraybody2Context ab2Ctx : ctx.arraybody2()) {
            ASTNode element = visit(ab2Ctx);
            if (element != null) {
                elements.add(element);
            }
        }
        ArrayExprTwoStatement arrayExpr = new ArrayExprTwoStatement(signature, type, elements);

//        Row row = new Row();
//        row.setName(signature.getName());
//        row.setValue("Typed array (" + type + ") with " + elements.size() + " composite elements");
//        this.st.addRow(signature.getName(), row);

        return arrayExpr;
    }

    @Override
    public ConstructorParameter visitConstructorParam(Parsergrammar.ConstructorParamContext ctx) {
        String access = ctx.ACCESS() != null ? ctx.ACCESS().getText() : null;
        String name = ctx.IDENTIFIER(0).getText();
        String type;
        if (ctx.IDENTIFIER().size() > 1) {
            type = ctx.IDENTIFIER(1).getText();
        } else {
            type = ctx.ROUTER().getText();
        }

        return new ConstructorParameter(access, name, type);
    }
    @Override
    public ASTNode visitConstructorDeclaration(Parsergrammar.ConstructorDeclarationContext ctx) {
        List<ConstructorParameter> params = new ArrayList<>();

        if (ctx.constructorParam() != null && !ctx.constructorParam().isEmpty()) {
            for (Parsergrammar.ConstructorParamContext paramCtx : ctx.constructorParam()) {
                // Check for missing access modifier on each parameter
                if (paramCtx.ACCESS() == null && !paramCtx.IDENTIFIER().isEmpty()) {
                    int line = paramCtx.getStart().getLine();
                    MissedConstructorAccessModifierError missedAccessError =
                            new MissedConstructorAccessModifierError(missedConstructorAccessModifierErrorSymbolTable, line);
                    missedAccessError.throwException();
                }

                ConstructorParameter param = visitConstructorParam(paramCtx);
                params.add(param);
            }
        }

        return new ConstructorDeclarationStatement(params);
    }


    @Override
    public ASTNode visitVariableDeclaration(Parsergrammar.VariableDeclarationContext ctx) {
        String signature = ctx.signature().IDENTIFIER().getText();
        String type = ctx.TYPE().getText();
        String value = ctx.values().getText();
        int line =  ctx.signature().IDENTIFIER().getSymbol().getLine();
        VariableDeclarationStatement variableDeclaration = new VariableDeclarationStatement(signature, type, value);
        Row row = new Row();
        row.setName(signature);
        row.setType(type);
        row.setValue( value);
        row.setScope(this.alreadyDefinedVariableErrorSymbolTable.getCurrentScope());
        AlreadyDefinedVariableError error = new AlreadyDefinedVariableError(signature,alreadyDefinedVariableErrorSymbolTable,line);
        if(error.alreadyDefinedVariableErrorSymbolTable.check(signature)){
            error.throwException();
        }
        else{
            error.alreadyDefinedVariableErrorSymbolTable.addRow(signature, row);
        }
        return variableDeclaration;
    }

    @Override
    public ASTNode visitVariableDeclarationStatement(Parsergrammar.VariableDeclarationStatementContext ctx) {
        return visit(ctx.variableDeclaration());
    }

    @Override
    public ASTNode visitArrayExprOneStatement(Parsergrammar.ArrayExprOneStatementContext ctx) {
        return visit(ctx.arrayExpression1());
    }

    @Override
    public ASTNode visitArrayExprTwoStatement(Parsergrammar.ArrayExprTwoStatementContext ctx) {
        return visit(ctx.arrayExpression2());
    }

    @Override
    public ASTNode visitArrayExprThreeStatement(Parsergrammar.ArrayExprThreeStatementContext ctx) {
        return visit(ctx.arrayExpression3());
    }

    @Override
    public ASTNode visitTypedMethodDeclarationStatement(Parsergrammar.TypedMethodDeclarationStatementContext ctx) {
        return visit(ctx.methodDeclaration());
    }

    @Override
    public ASTNode visitConstructorDeclarationStatement(Parsergrammar.ConstructorDeclarationStatementContext ctx) {
         return visit(ctx.constructorDeclaration());
    }

    @Override
    public ASTNode visitSignalDeclarationStatement(Parsergrammar.SignalDeclarationStatementContext ctx) {
        return visit(ctx.signalDeclaration());
    }

    @Override
    public ASTNode visitNgOnInitMethodStatement(Parsergrammar.NgOnInitMethodStatementContext ctx) {
        return visit(ctx.ngOnInitMETHOD());
    }

    @Override
    public ASTNode visitProvidedin(Parsergrammar.ProvidedinContext ctx) {
        return super.visitProvidedin(ctx);
    }



    @Override
    public ASTNode visitVoidMethodDeclarationStatement(Parsergrammar.VoidMethodDeclarationStatementContext ctx) {
        return super.visitVoidMethodDeclarationStatement(ctx);
    }
//    @Override
//    public ASTNode visitMethodcall(Parsergrammar.MethodcallContext ctx) {
//        return super.visitMethodcall(ctx);
//    }

    @Override
    public ASTNode visitVariableAssignmentStatement(Parsergrammar.VariableAssignmentStatementContext ctx) {
        return visit(ctx.variableAssign());
    }

    @Override
    public ASTNode visitVariableAssign(Parsergrammar.VariableAssignContext ctx) {
        String identifier = ctx.IDENTIFIER().getText();
        String value = ctx.values().getText();
        VariableAssignmentStatement assignment = new VariableAssignmentStatement(identifier, value);
//        Row row = new Row();
//        row.setName(identifier);
//        row.setValue("Assigned value: " + value);
//        row.setScope("local");
//        this.st.addRow(identifier, row);

        return assignment;
    }

    @Override
    public ASTNode visitSignalDeclaration(Parsergrammar.SignalDeclarationContext ctx) {
        String name = ctx.IDENTIFIER().getText();
        String signalType = ctx.CROISNN().getText();
        String argument = ctx.STRING_LITERAL().getText();
        argument = argument.substring(1, argument.length() - 1);

        SignalDeclarationStatement declaration = new SignalDeclarationStatement(name, signalType, argument);

        /*Row row = new Row();
        row.setName(name);
        row.setValue("Signal: " + declaration.toString());
        row.setScope(this.st.getCurrentScope());
        this.st.addRow(name, row);*/

        return declaration;
    }

    @Override
    public ASTNode visitImplementsClause(Parsergrammar.ImplementsClauseContext ctx) {
        ImplementsClause clause = new ImplementsClause();

        for (TerminalNode id : ctx.IDENTIFIER()) {
            clause.addInterface(id.getText());
        }
        for (TerminalNode croisnn : ctx.CROISNN()) {
            clause.addInterface(croisnn.getText());
        }
//        if (!clause.getInterfaces().isEmpty()) {
            Row row = new Row();
            row.setName("implements");
            row.setValue(String.join(", ", clause.getInterfaces()));
//            row.setScope(this.st.getCurrentScope());
//            this.st.addRow("implements", row);
//        }
        this.incorrectlyOnInitImplementErrorSymbolTable.addRow("implements",row);
        return clause;
    }



    @Override
    public ASTNode visitAsObservable(Parsergrammar.AsObservableContext ctx) {
        // Get the variable names
        String variableName = ctx.IDENTIFIER(0).getText();  // variable before $
        String sourceIdentifier = ctx.IDENTIFIER(1).getText(); // variable after 'this'

        // Visit optional methodCall
        MethodCall methodCall = null;
        if (ctx.methodCall() != null) {
            ASTNode node = visit(ctx.methodCall());
            if (node instanceof MethodCall) {
                methodCall = (MethodCall) node;
            }
        }

        return new AsObservable(variableName, sourceIdentifier, methodCall);
    }

    @Override
    public ASTNode visitObservable(Parsergrammar.ObservableContext ctx) {
        String variableName = ctx.IDENTIFIER().getText();

        // Keep ObservableArray as an AST node reference
        ObservableArray observableArray = null;
        if (ctx.observableArray() != null) {
            ASTNode node = visit(ctx.observableArray());
            if (node instanceof ObservableArray) {
                observableArray = (ObservableArray) node;
            }
        }

        return new Observable(variableName, observableArray);
    }

    @Override
    public ASTNode visitObservableArray(Parsergrammar.ObservableArrayContext ctx) {
        // Return ObservableArray node, preserve type info
        String type = "<" + ctx.ANY().getText() + "[]>";
        return new ObservableArray(type);
    }

    @Override
    public ASTNode visitCrudBody(Parsergrammar.CrudBodyContext ctx) {
        String identifier = ctx.IDENTIFIER().getText();
        String action = ctx.NEXT() != null ? "next" : "value";
        return new CrudBody(identifier, action);
    }

    @Override
    public ASTNode visitNextCall(Parsergrammar.NextCallContext ctx) {
        if (ctx.addCall() != null) {
            return new NextCall(visit(ctx.addCall()));
        } else {
            return new NextCall(visit(ctx.edit_delete_call()));
        }
    }

    @Override
    public ASTNode visitAddCall(Parsergrammar.AddCallContext ctx) {
        CrudBody crudBody = (CrudBody) visit(ctx.crudBody());
        String identifier = ctx.IDENTIFIER().getText();
        return new AddCall(crudBody, identifier);
    }

    @Override
    public ASTNode visitEdit_delete_call(Parsergrammar.Edit_delete_callContext ctx) {
        CrudBody crudBody = (CrudBody) visit(ctx.crudBody());
        ASTNode operation = ctx.map() != null ? visit(ctx.map()) : visit(ctx.filter());
        return new EditDeleteCall(crudBody, operation);
    }

    @Override
    public ASTNode visitMap(Parsergrammar.MapContext ctx) {
        LeftMapFilterAssign left = (LeftMapFilterAssign) visit(ctx.leftMapFilterAssign());
        RightMapFilterAssign right = (RightMapFilterAssign) visit(ctx.rightMapFilterAssign());
        return new MapCall(left, right);
    }

    @Override
    public ASTNode visitFilter(Parsergrammar.FilterContext ctx) {
        LeftMapFilterAssign left = (LeftMapFilterAssign) visit(ctx.leftMapFilterAssign());
        RightMapFilterAssign right = (RightMapFilterAssign) visit(ctx.rightMapFilterAssign());
        return new FilterCall(left, right);
    }

    @Override
    public ASTNode visitMapFilterIDENTIFIER(Parsergrammar.MapFilterIDENTIFIERContext ctx) {
        String left = "";
        String right = "";
        String operator = "";

        if (ctx.DOT() != null) {
            // form: IDENTIFIER DOT IDENTIFIER
            left = ctx.IDENTIFIER(0).getText();
            operator = ".";
            right = ctx.IDENTIFIER(1).getText();
        } else if (ctx.COLON() != null) {
            // form: IDENTIFIER COLON IDENTIFIER
            left = ctx.IDENTIFIER(0).getText();
            operator = ":";
            right = ctx.IDENTIFIER(1).getText();
        }

        return new MapFilterIdentifier(left, operator, right);
    }


    @Override
    public ASTNode visitLeftMapFilterAssign(Parsergrammar.LeftMapFilterAssignContext ctx) {
        String parameter = ctx.IDENTIFIER().getText();
        MapFilterIdentifier expression = (MapFilterIdentifier) visit(ctx.mapFilterIDENTIFIER());

        return new LeftMapFilterAssign(parameter, expression);
    }


    @Override
    public ASTNode visitRightMapFilterAssign(Parsergrammar.RightMapFilterAssignContext ctx) {
        if (ctx.IDENTIFIER() != null) {
            // IDENTIFIER form
            String id = ctx.IDENTIFIER().getText();
            return new RightMapFilterAssign(id);
        } else {
            // mapFilterIDENTIFIER ? mapFilterIDENTIFIER form
            MapFilterIdentifier left = (MapFilterIdentifier) visit(ctx.mapFilterIDENTIFIER(0));
            MapFilterIdentifier right = (MapFilterIdentifier) visit(ctx.mapFilterIDENTIFIER(1));
            return new RightMapFilterAssign(left, right);
        }
    }






    @Override
    public ASTNode visitMethodvoidbody(Parsergrammar.MethodvoidbodyContext ctx) {
        // methodvoidbody: (methodAssignment | crudBodyRule | ifStatement)*
        List<ASTNode> stmts = new ArrayList<>();

        for (var ma : ctx.methodAssignment()) {
            ASTNode node = visit(ma);
            if (node != null) stmts.add(node);
        }
        for (var crud : ctx.crudBodyRule()) {
            ASTNode node = visit(crud);
            if (node != null) stmts.add(node);
        }
        for (var iff : ctx.ifStatement()) {
            ASTNode node = visit(iff);
            if (node != null) stmts.add(node);
        }

        return new MethodVoidBody(stmts);
    }

    @Override
    public ASTNode visitMethodAssignment(Parsergrammar.MethodAssignmentContext ctx) {
        // methodAssignment: assignmentStatement SEMICOLON | methodCallStatement SEMICOLON | objectSpreadAssignment SEMICOLON
        if (ctx.assignmentStatement() != null) return visit(ctx.assignmentStatement());
        if (ctx.methodCallStatement() != null) return visit(ctx.methodCallStatement());
        if (ctx.objectSpreadAssignment() != null) return visit(ctx.objectSpreadAssignment());
        return null;
    }

    @Override
    public ASTNode visitAssignmentStatement(Parsergrammar.AssignmentStatementContext ctx) {
        ASTNode left = visit(ctx.leftHandSide());

        // Handle multiple expressions by concatenating them
        StringBuilder rightBuilder = new StringBuilder();
        if (ctx.expression() != null && !ctx.expression().isEmpty()) {
            for (int i = 0; i < ctx.expression().size(); i++) {
                ASTNode exprNode = visit(ctx.expression(i));
                rightBuilder.append(exprNode.generate());
                if (i < ctx.expression().size() - 1) {
                    rightBuilder.append(" ");
                }
            }
        }

        boolean dollar = ctx.DOLLAR_SIGN() != null;

        // Create a simple ASTNode for the concatenated expressions
        return new AssignmentStatement(left, new SimpleExpressionNode(rightBuilder.toString()), dollar);
    }
    @Override
    public ASTNode visitMethodCallStatement(Parsergrammar.MethodCallStatementContext ctx) {
        // leftHandSide DOT methodCall
        ASTNode left = visit(ctx.leftHandSide());
        // methodCall returns a MethodCallExpression, but grammar has leftHandSide DOT methodCall
        MethodCallExpression callExpr;
        Parsergrammar.MethodCallContext mc = ctx.methodCall();
        // methodCall allows IDENTIFIER | NAVIGATE | NOW | MAP | FILTER | NEXT | VALUE as name
        List<ASTNode> args = new ArrayList<>();
        if (mc.argumentList() != null) {
            for (var exprCtx : mc.argumentList().expression()) {
                args.add(visit(exprCtx));
            }
        }
        String name = mc.getText().substring(0, mc.getText().indexOf('(')); // fallback
        // Better: if mc.IDENTIFIER() != null then
        if (mc.IDENTIFIER() != null ) {
            name = mc.IDENTIFIER().getText();
        } else if (mc.NAVIGATE() != null) {
            name = mc.NAVIGATE().getText();
        } else if (mc.NOW() != null) {
            name = mc.NOW().getText();
        } else if (mc.MAP() != null) {
            name = mc.MAP().getText();
        } else if (mc.FILTER() != null) {
            name = mc.FILTER().getText();
        } else if (mc.NEXT() != null) {
            name = mc.NEXT().getText();
        } else if (mc.VALUE() != null) {
            name = mc.VALUE().getText();
        }
        callExpr = new MethodCallExpression(left, name, args);
        return new MethodCallStatementNode(callExpr);
    }

    @Override
    public ASTNode visitObjectSpreadAssignment(Parsergrammar.ObjectSpreadAssignmentContext ctx) {
        // leftHandSide ASSIGN LBRACE THREE_DOTS IDENTIFIER RBRACE
        ASTNode left = visit(ctx.leftHandSide());
        String id = ctx.IDENTIFIER().getText();
        return new ObjectSpreadAssignmentNode(left, id);
    }

    @Override
    public ASTNode visitStaticAssignment(Parsergrammar.StaticAssignmentContext ctx) {
        // STATIC IDENTIFIER ASSIGN objectLiteral SEMICOLON
        String id = ctx.IDENTIFIER().getText();
        ASTNode obj = visit(ctx.objectLiteral());
        String type = ctx.STATIC().getText();
        return new StaticAssignmentNode(id, obj, type);
    }


    @Override
    public ASTNode visitLeftHandSide(Parsergrammar.LeftHandSideContext ctx) {
        // THIS DOT IDENTIFIER (DOLLAR_SIGN)? | IDENTIFIER (DOLLAR_SIGN)? | STATIC? IDENTIFIER
        boolean isStatic=false;
        if(ctx.STATIC()!=null){isStatic=true;}


        if (ctx.THIS() != null) {
            String id = ctx.IDENTIFIER().getText();
            return new ThisPropertyNode(id + (ctx.DOLLAR_SIGN()!=null ? "$" : ""));
        } else {
            // identifier may have dollar suffix token in your grammar as IDENTIFIER DOLLAR_SIGN token sequence
            if (ctx.IDENTIFIER() != null ) {

                String id = ctx.IDENTIFIER().getText();

                if (ctx.DOLLAR_SIGN() != null) id = id + "$";
               if(isStatic)
                return new IdentifierNode(id,ctx.STATIC().getText());
               else{
                   return new IdentifierNode(id);
               }
            } else {
                // fallback
                if(isStatic)
                return new IdentifierNode(ctx.getText(),ctx.STATIC().getText());
                else{
                  return  new IdentifierNode(ctx.getText());
                }
            }
        }
    }

    @Override
    public ASTNode visitExpression(Parsergrammar.ExpressionContext ctx) {
        // expression rule has many alternatives. We check which is present.
        if (ctx.literal() != null) {
            return visit(ctx.literal());
        }
        if (ctx.IDENTIFIER() != null && ctx.getChildCount() == 1) {
            return new IdentifierNode(ctx.IDENTIFIER().getText());
        }
        if (ctx.THIS() != null && ctx.DOT() != null && ctx.IDENTIFIER() != null) {
            String id = ctx.IDENTIFIER().getText();
            return new ThisPropertyNode(id + (ctx.DOLLAR_SIGN()!=null ? "$" : ""));
        }
        if (ctx.methodCall() != null && ctx.getChildCount() == 1) {
            // direct method call like fn()
            return visit(ctx.methodCall());
        }
        if (ctx.objectLiteral() != null) {
            return visit(ctx.objectLiteral());
        }
        if (ctx.arrayLiteral() != null) {
            return visit(ctx.arrayLiteral());
        }
        if (ctx.arraySpreadExpression() != null) {
            return visit(ctx.arraySpreadExpression());
        }
        if (ctx.NEW() != null && ctx.BEHAVIOR_SUBJECT() != null) {
            ASTNode arg = visit(ctx.expression());
            return new NewBehaviorSubjectNode(arg);
        }
        // expression DOT IDENTIFIER or expression DOT methodCall
        if (ctx.expression() != null && ctx.DOT() != null && ctx.IDENTIFIER() != null) {
            ASTNode target = visit(ctx.expression());
            String member = ctx.IDENTIFIER().getText();
            return new MemberAccessExpression(target, member);
        }
        if (ctx.expression() != null && ctx.DOT() != null && ctx.methodCall() != null) {
            ASTNode target = visit(ctx.expression());
            MethodCallExpression mc = (MethodCallExpression) visit(ctx.methodCall());
            // create MethodCallExpression with caller being target and name from mc
            return new MethodCallExpression(target, mc.getMethodName(), mc.getArguments());
        }
        // fallback
        return new IdentifierNode(ctx.getText());
    }


//    @Override
//    public ASTNode visitCrudBodyRule(Parsergrammar.CrudBodyRuleContext ctx) {
//        // crudBody nextCall SEMICOLON
//        ASTNode crud = visit(ctx.crudBody());
//        ASTNode next = visit(ctx.nextCall());
//        // Represent as CrudBodyNode with nextCall appended in generate by caller
//        // For simplicity, wrap both in a list object literal node
//        return new ObjectLiteralNode(Arrays.asList(new CrudBodyNode(crud), (ASTNode) next));
//    }


    @Override
    public ASTNode visitArrayLiteral(Parsergrammar.ArrayLiteralContext ctx) {
        List<ASTNode> items = new ArrayList<>();
        if (ctx.expression() != null) {
            for (var e : ctx.expression()) items.add(visit(e));
        }
        return new ArrayLiteralNode(items);
    }


    @Override
    public ASTNode visitObjectLiteral(Parsergrammar.ObjectLiteralContext ctx) {
        List<ASTNode> props = new ArrayList<>();

        for (var sp : ctx.objectSpreadProperty()) {
            props.add(visit(sp));
        }
        for (var op : ctx.objectProperty()) {
            props.add(visit(op));
        }

        return new ObjectLiteralNode(props);
    }



    @Override
    public ASTNode visitObjectSpreadProperty(Parsergrammar.ObjectSpreadPropertyContext ctx) {
        // THREE_DOTS expression
        ASTNode expr = visit(ctx.expression());
        return new ObjectSpreadPropertyNode(expr);
    }


    @Override
    public ASTNode visitObjectProperty(Parsergrammar.ObjectPropertyContext ctx) {
        // (IDENTIFIER | PATH | COMPONENT | REDIRECTTO | PATHMATCH) COLON expression
        String key = ctx.getChild(0).getText();
        ASTNode value = visit(ctx.expression());
        return new ObjectPropertyNode(key, value);
    }

    @Override
    public ASTNode visitArraySpreadExpression(Parsergrammar.ArraySpreadExpressionContext ctx) {
        // LBRACKET THREE_DOTS expression (COMMA expression)? RBRACKET
        ASTNode expr = visit(ctx.expression(0));
        return new ArraySpreadExpressionNode(expr);
    }


    @Override
    public ASTNode visitMethodCall(Parsergrammar.MethodCallContext ctx) {
        // (IDENTIFIER | NAVIGATE | NOW | MAP | FILTER | NEXT | VALUE) LPAREN (argumentList)? RPAREN ;
        String name = null;
        if (ctx.IDENTIFIER() != null ) {
            name = ctx.IDENTIFIER().getText();
        } else if (ctx.NAVIGATE() != null) name = ctx.NAVIGATE().getText();
        else if (ctx.NOW() != null) name = ctx.NOW().getText();
        else if (ctx.MAP() != null) name = ctx.MAP().getText();
        else if (ctx.FILTER() != null) name = ctx.FILTER().getText();
        else if (ctx.NEXT() != null) name = ctx.NEXT().getText();
        else if (ctx.VALUE() != null) name = ctx.VALUE().getText();
        List<ASTNode> args = new ArrayList<>();
        if (ctx.argumentList() != null) {
            ASTNode argList = visit(ctx.argumentList());
            if (argList instanceof ArrayLiteralNode) {
                // but our visitArgumentList returns ArrayLiteralNode style - adjust below
            }
        }
        if (ctx.argumentList() != null && ctx.argumentList().expression() != null) {
            for (var exprCtx : ctx.argumentList().expression()) args.add(visit(exprCtx));
        }
        // caller = null, means direct function or static call; the grammar used methodCall alone (caller handled by expression chaining)
        return new MethodCallExpression(null, name, args);
    }


    @Override
    public ASTNode visitArgumentList(Parsergrammar.ArgumentListContext ctx) {
        List<ASTNode> args = new ArrayList<>();
        for (var e : ctx.expression()) args.add(visit(e));
        // Return array-like node to be used by caller
        return new ArrayLiteralNode(args);
    }


    @Override
    public ASTNode visitLiteral(Parsergrammar.LiteralContext ctx) {
        if (ctx.NUMBER() != null) return new LiteralNode(ctx.NUMBER().getText());
        if (ctx.STRING_LITERAL() != null) return new LiteralNode(ctx.STRING_LITERAL().getText());
        if (ctx.BOOLEAN() != null) return new LiteralNode(ctx.BOOLEAN().getText());
        if (ctx.NULL() != null) return new LiteralNode("null");
        if (ctx.DATE() != null && ctx.NOW() != null) {
            return new LiteralNode("Date.now()");
        }
        return new LiteralNode(ctx.getText());
    }





    ////////////////////// CSS VISITORS/////////////////////////////

    @Override
    public ASTNode visitCssDocument(Parsergrammar.CssDocumentContext ctx) {
        List<RuleSet> ruleSets = new ArrayList<>();
        for (Parsergrammar.RuleSetContext rctx : ctx.ruleSet()) {
            ruleSets.add((RuleSet) visit(rctx));
        }
        /*
        Row row = new Row();
        row.setName("CssDocument");
        row.setValue(ruleSets.toString());
       this.st.addRow("CssDocument", row);*/
        return new CssDocument(ruleSets);
    }

    @Override
    public ASTNode visitDeclaration(Parsergrammar.DeclarationContext ctx) {
        String propertyName = ctx.PROPERTY_NAME().getText();
        List<Value> values = new ArrayList<>();
        values.add((Value) visit(ctx.value(0)));
        if (ctx.value().size() > 1) {
            for (int i = 1; i < ctx.value().size(); i++) {
                values.add((Value) visit(ctx.value(i)));
            }
        }
        /*
        Row row = new Row();
        row.setName(propertyName);
        row.setValue(propertyName + ": " + values.toString());
       // this.st.addRow(propertyName, row);*/
        return new Declaration(propertyName, values);
    }

    @Override
    public ASTNode visitDeclarationList(Parsergrammar.DeclarationListContext ctx) {
        List<Declaration> declarations = new ArrayList<>();
        for (Parsergrammar.DeclarationContext dctx : ctx.declaration()) {
            declarations.add((Declaration) visit(dctx));
        }
        /*
        Row row = new Row();
        row.setName("DeclarationList");
        row.setValue(declarations.toString());
        this.st.addRow("DeclarationList", row);*/
        return new DeclarationList(declarations);
    }
    @Override
    public ASTNode visitRuleSet(Parsergrammar.RuleSetContext ctx) {
        RuleSetStart selector = (RuleSetStart) visit(ctx.ruleSetStart());
        List<Declaration> declarations = new ArrayList<>();
        if (ctx.declarationList() != null) {
            for (Parsergrammar.DeclarationContext declCtx : ctx.declarationList().declaration()) {
                declarations.add((Declaration) visit(declCtx));
            }
        }
/*
        Row row = new Row();
        row.setName(selector.toString());
        row.setValue(selector.toString() + " with " + declarations.size() + " declarations");
       this.st.addRow(row.getName(), row);*/
        return new RuleSet(selector, declarations);
    }

    @Override
    public ASTNode visitRuleSetStart(Parsergrammar.RuleSetStartContext ctx) {
        List<String> selectors = new ArrayList<>();
        selectors.add(ctx.first.getText());
        for (int i = 1; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);
            if (child instanceof TerminalNode terminal) {
                if (terminal.getSymbol().getType() == Lexergrammmar.TAGSFORCSS) {
                    selectors.add(terminal.getText());
                }
            }
        }
        /*
        Row row = new Row();
        row.setName("List");
        row.setType("List");
        row.setValue(selectors.toString());
        this.st.addRow("List", row);*/
        return new RuleSetStart(selectors);
    }
    @Override
    public ASTNode visitValue(Parsergrammar.ValueContext ctx) {
        Value value = null;
        Value.ValueType type = null;
        String val = "";
        String unit = null;
        if (ctx.NUMBER() != null) {
            val = ctx.NUMBER().getText();
            unit = ctx.UNIT() != null ? ctx.UNIT().getText() : null;
            type = Value.ValueType.NUMBER;
        }
        else if (ctx.COLOR() != null) {
            val = ctx.COLOR().getText();
            type = Value.ValueType.COLOR;
        }
        else if (ctx.STRING() != null) {
            val = ctx.STRING().getText();
            val = val.substring(1, val.length() - 1);
            type = Value.ValueType.STRING;
        }
        else if (ctx.VALUE_KEYWORD() != null) {
            val = ctx.VALUE_KEYWORD().getText();
            type = Value.ValueType.KEYWORD;
        }
        else if (ctx.IDENTIFIER() != null) {
            val = ctx.IDENTIFIER().getText();
            type = Value.ValueType.IDENTIFIER;
        }

        value = new Value(val, unit, type);
        /*
        Row row = new Row();
        row.setName(val);
        row.setType("Value");
        row.setValue(val + (unit != null ? unit : ""));
        this.st.addRow(val, row);

         */
        return value;
    }




















    ////////////////////// HTML VISITORS /////////////////////////////

    @Override
    public ASTNode visitScriptletOrSeaWs(Parsergrammar.ScriptletOrSeaWsContext ctx) {
        String content;
        boolean isScriptlet;

        if (ctx.SCRIPTLET() != null) {
            content = ctx.SCRIPTLET().getText();
            isScriptlet = true;
        } else {
            content = ctx.WS().getText();
            isScriptlet = false;
        }
        /*Row row = new Row();
        row.setName("ScriptletOrSeaWs");
        row.setValue(content);
        this.st.addRow("ScriptletOrSeaWs", row);*/
        return new ScriptletOrSeaWs(content, isScriptlet);
    }

    @Override
    public ASTNode visitHtmlComment(Parsergrammar.HtmlCommentContext ctx) {
        String commentText;
        boolean isConditional;

        if (ctx.HTML_COMMENT() != null) {
            commentText = ctx.HTML_COMMENT().getText();
            isConditional = false;
        } else {
            commentText = ctx.HTML_CONDITIONAL_COMMENT().getText();
            isConditional = true;
        }

      /*  Row row = new Row();
        row.setName("HtmlComment");
        row.setValue("Comment Type: " + (isConditional ? "Conditional" : "Standard") + ", Text: " + commentText);
        this.st.addRow("HtmlComment", row);*/
        return new HtmlComment(commentText, isConditional);
    }

    @Override
    public ASTNode visitHtmlMisc(Parsergrammar.HtmlMiscContext ctx) {
        ASTNode content = null;

        if (ctx.htmlComment() != null) {
            content = visit(ctx.htmlComment());
        } else if (ctx.WS() != null) {
            String whitespace = ctx.WS().getText();
         /*   Row row = new Row();
            row.setName("Whitespace");
            row.setType("HtmlWhitespace");
            row.setValue("Whitespace characters: " + whitespace.replace("\n", "\\n"));
            row.setScope("html");
            this.st.addRow("Whitespace", row);*/
            content = new ASTNode() {
                @Override
                public void prettyPrint(String indent) {
                    System.out.println(indent + "Whitespace:");
                    System.out.println(indent + "  " + whitespace.replace("\n", "\\n"));
                }

                @Override
                public String generate() {
                    return "";
                }
            };
        }
        /*Row row = new Row();
        row.setName("HtmlMisc");
        row.setValue("Contains: " + (content != null ? content.getClass().getSimpleName() : "null"));
        this.st.addRow("HtmlMisc", row);*/
        return new HtmlMisc(content);
    }


    @Override
    public ASTNode visitHtmlElements(Parsergrammar.HtmlElementsContext ctx) {
        List<ASTNode> leadingComments = new ArrayList<>();
        if (ctx.htmlComment() != null) {
            for (Parsergrammar.HtmlCommentContext commentCtx : ctx.htmlComment()) {
                if (commentCtx != null) {
                    ASTNode comment = visitHtmlComment(commentCtx);
                    if (comment != null) {
                        leadingComments.add(comment);
                    }
                }
            }
        }
        ASTNode htmlElement = null;
        if (ctx.htmlElement() != null) {
            htmlElement = visitHtmlElement(ctx.htmlElement());
        }

        List<ASTNode> trailingComments = new ArrayList<>();

        /*Row row = new Row();
        row.setName("HtmlElements");
        row.setValue("Element with " + leadingComments.size() + " leading and " + trailingComments.size() + " trailing comments");
        this.st.addRow("HtmlElements", row);*/
        return new HtmlElements(leadingComments, htmlElement, trailingComments);
    }

    @Override
    public ASTNode visitHtmlElement(Parsergrammar.HtmlElementContext ctx) {
        ParseTree child = ctx.getChild(0);
        if (child instanceof ParserRuleContext ruleCtx) {
            return visit(ruleCtx);
        } else if (child instanceof TerminalNode token) {
            String raw = token.getText();
            if (token.getSymbol().getType() == Parsergrammar.SCRIPTLET) {
               /* Row row = new Row();
                row.setName("Scriptlet_" + System.identityHashCode(raw));
                row.setValue("Scriptlet: " + raw);
                this.st.addRow(row.getName(), row);*/
                return new ScriptletOrSeaWs(raw, true);
            } else if (token.getSymbol().getType() == Parsergrammar.INTERPOLATION) {
                /*Row row = new Row();
                row.setName("Interpolation_" + System.identityHashCode(raw));
                row.setValue("Interpolation: " + raw);
                this.st.addRow(row.getName(), row);*/
                return new InterpolationElement(raw);
            }
        }
        System.err.println("Unrecognized HTML element: " + ctx.getText());
        return null;
    }


    @Override
    public ASTNode visitTsTagElement(Parsergrammar.TsTagElementContext ctx) {
        return visit(ctx.tsTag());
    }

    @Override
    public ASTNode visitNoEndTagElement(Parsergrammar.NoEndTagElementContext ctx) {
        return visit(ctx.noEndTag());
    }

    @Override
    public ASTNode visitNormalTagElement(Parsergrammar.NormalTagElementContext ctx) {
        return visit(ctx.normalTag());
    }

    @Override
    public ASTNode visitScriptletElement(Parsergrammar.ScriptletElementContext ctx) {
        return visit(ctx.SCRIPTLET());
    }

    @Override
    public ASTNode visitInterpolationElement(Parsergrammar.InterpolationElementContext ctx) {
        return visit(ctx.INTERPOLATION());
    }

    @Override
    public ASTNode visitTsTag(Parsergrammar.TsTagContext ctx) {
        String tagName = ctx.TAG_NAME().getText();
        List<ASTNode> attributes = new ArrayList<>();
        if (ctx.htmlAttribute() != null) {
            for (var attrCtx : ctx.htmlAttribute()) {
                ASTNode attr = visit(attrCtx);
                if (attr != null) {
                    attributes.add(attr);
                }
            }
        }

       /* Row row = new Row();
        row.setName(tagName);
        row.setValue("TypeScript tag: " + tagName);
        this.st.addRow(tagName, row);*/
        return new TsTag(tagName, attributes);
    }

    @Override
    public ASTNode visitNoEndTag(Parsergrammar.NoEndTagContext ctx) {
        String tagName = ctx.TAGS_VOID().getText();

        List<ASTNode> attributes = new ArrayList<>();
        if (ctx.htmlAttribute() != null) {
            for (var attrCtx : ctx.htmlAttribute()) {
                ASTNode attr = visit(attrCtx);
                if (attr != null) {
                    attributes.add(attr);
                }
            }
        }
        boolean required = ctx.REQUIRED() != null;
    /*Row row = new Row();
    row.setName(tagName);
    row.setValue("Void HTML tag: " + tagName);
    this.st.addRow(tagName, row);*/

        return new NoEndTag(tagName, attributes, required);
    }


    @Override
    public ASTNode visitNormalTag(Parsergrammar.NormalTagContext ctx) {
        String tagName = ctx.TAGS(0).getText();
        List<ASTNode> attributes = new ArrayList<>();
        List<ASTNode> content = new ArrayList<>();
        if (ctx.htmlAttribute() != null) {
            for (var attrCtx : ctx.htmlAttribute()) {
                ASTNode attr = visit(attrCtx);
                if (attr != null) {
                    attributes.add(attr);
                }
            }
        }
        if (ctx.htmlContent() != null) {
            ASTNode contentNode = visitHtmlContent(ctx.htmlContent());
            if (contentNode != null) {
                if (contentNode instanceof HtmlContent) {
                    content.addAll(((HtmlContent) contentNode).getContentElements());
                } else {
                    content.add(contentNode);
                }
            }
        }
        if (ctx.TAGS().size() > 1) {
            String closing = ctx.TAGS(1).getText();
            if (!tagName.equals(closing)) {
                System.err.println("Warning: Tag mismatch - <" + tagName + "> vs </" + closing + ">");
            }
        }
      /* Row row = new Row();
        row.setName(tagName);
        row.setValue("HTML Tag: " + tagName +
                (attributes.isEmpty() ? "" : " with " + attributes.size() + " attributes") +
                (content.isEmpty() ? "" : " containing " + content.size() + " elements"));
        this.st.addRow(tagName, row);*/
        return new NormalTag(tagName, attributes, content);
    }

    @Override
    public ASTNode visitHtmlContent(Parsergrammar.HtmlContentContext ctx) {
        List<HtmlContentStatement> contentStatements = new ArrayList<>();
        StringBuilder rawContent = new StringBuilder();
        for (Parsergrammar.HtmlContentStatementContext stmtCtx : ctx.htmlContentStatement()) {
            ASTNode node = visitHtmlContentStatement(stmtCtx);
            if (node instanceof HtmlContentStatement statement) {
                contentStatements.add(statement);
                ASTNode inner = statement.getStatement();
                if (inner instanceof InterpolationElement interp) {
                    rawContent.append("${").append(interp.getContent()).append("} ");
                } else if (inner instanceof CDataContent || inner instanceof ScriptletOrSeaWs
                        || inner instanceof TextContent || inner instanceof HtmlComment ||
                        inner instanceof HtmlElement) {
                    rawContent.append(inner.toString()).append(" ");
                }
            }
        }
       /* Row row = new Row();
        row.setName("HTMLContent");
        row.setValue("Contains " + contentStatements.size() + " statements");
        this.st.addRow("HTMLContent_" + this.st.getCurrentScope(), row);*/
        return new HtmlContent(contentStatements, rawContent.toString().trim());
    }

    @Override
    public ASTNode visitHtmlContentStatement(Parsergrammar.HtmlContentStatementContext ctx) {
        ASTNode inner = null;

        if (ctx instanceof Parsergrammar.HtmlCharDataStatementContext charCtx) {
            String text = charCtx.getText();
            if (text.contains("{{") && text.contains("}}")) {
                String expr = text.substring(text.indexOf("{{") + 2, text.indexOf("}}")).trim();
                inner = new InterpolationElement(expr);
            } else {
                inner = new TextContent(text.trim());
            }

        } else if (ctx instanceof Parsergrammar.HtmlElementStatementContext elementCtx) {
            inner = visitHtmlElement(elementCtx.htmlElement());

        } else if (ctx instanceof Parsergrammar.HtmlCommentStatementContext commentCtx) {
            inner = visitHtmlComment(commentCtx.htmlComment());

        } else if (ctx instanceof Parsergrammar.HtmlCDataStatementContext cdataCtx) {
            inner = new CDataContent(cdataCtx.CDATA().getText());

        } else if (ctx instanceof Parsergrammar.HtmlScriptletStatementContext scriptletCtx) {
            inner = new ScriptletOrSeaWs(scriptletCtx.SCRIPTLET().getText(), true);

        } else if (ctx instanceof Parsergrammar.HtmlIdentifierStatementContext identCtx) {
            inner = new TextContent(identCtx.IDENTIFIER().getText());
        }

        return new HtmlContentStatementImpl(inner);

    }

    @Override
    public ASTNode visitHtmlCharDataStatement(Parsergrammar.HtmlCharDataStatementContext ctx) {
        return visit(ctx.htmlChardata());
    }

    @Override
    public ASTNode visitHtmlElementStatement(Parsergrammar.HtmlElementStatementContext ctx) {
        return visit(ctx.htmlElement());
    }

    @Override
    public ASTNode visitHtmlCDataStatement(Parsergrammar.HtmlCDataStatementContext ctx) {
        return visit(ctx.CDATA());
    }

    @Override
    public ASTNode visitHtmlCommentStatement(Parsergrammar.HtmlCommentStatementContext ctx) {
        return visit(ctx.htmlComment());
    }

    @Override
    public ASTNode visitHtmlScriptletStatement(Parsergrammar.HtmlScriptletStatementContext ctx) {
        return visit(ctx.SCRIPTLET());
    }

    @Override
    public ASTNode visitHtmlIdentifierStatement(Parsergrammar.HtmlIdentifierStatementContext ctx) {
        return visit(ctx.IDENTIFIER());
    }

    @Override
    public ASTNode visitHtmlColonStatement(Parsergrammar.HtmlColonStatementContext ctx) {
        return visit(ctx.COLON());
    }

    @Override
    public ASTNode visitHtmlChardata(Parsergrammar.HtmlChardataContext ctx) {
        String content;
        boolean isWhitespace;
        if (ctx.HTML_TEXT() != null) {
            content = ctx.HTML_TEXT().getText();
            isWhitespace = false;
        } else if (ctx.WS() != null) {
            content = ctx.WS().getText();
            isWhitespace = true;
        } else {
            content = "";
            isWhitespace = false;
        }
        /*Row row = new Row();
        row.setName("HtmlCharData");
        row.setValue(isWhitespace ? "Whitespace" : content);
        this.st.addRow("HtmlCharData", row);*/
        return new HtmlCharData(content, isWhitespace);
    }
    @Override
    public ASTNode visitHtmlDocument(Parsergrammar.HtmlDocumentContext ctx) {
        List<ASTNode> scriptletOrSeaWs = new ArrayList<>();
        if (ctx.scriptletOrSeaWs() != null) {
            for (var sctx : ctx.scriptletOrSeaWs()) {
                ASTNode node = visit(sctx);
                if (node != null) {
                    scriptletOrSeaWs.add(node);
                }
            }
        }
        String xml = ctx.XML() != null ? ctx.XML().getText() : null;
        String dtd = ctx.DTD() != null ? ctx.DTD().getText() : null;
        List<ASTNode> htmlElements = new ArrayList<>();
        if (ctx.htmlElements() != null) {
            for (var ectx : ctx.htmlElements()) {
                ASTNode node = visit(ectx);
                if (node != null) {
                    htmlElements.add(node);
                }
            }
        }
       /* Row row = new Row();
        row.setName("HTMLDocument");
        row.setValue("Document with " + htmlElements.size() + " elements" +
                (xml != null ? " (has XML)" : "") +
                (dtd != null ? " (has DTD)" : ""));
        this.st.addRow("HTMLDocument", row);*/
        return new HTMLDocument(scriptletOrSeaWs, xml, dtd, htmlElements);
    }

    @Override
    public HtmlAttribute visitStructuralDirectiveAttribute(Parsergrammar.StructuralDirectiveAttributeContext ctx) {
        String name = ctx.STRUCTURAL_DIRECTIVE().getText();
        TagAttribute tagAttribute = ctx.tagAtt() != null ? (TagAttribute) visit(ctx.tagAtt()) : null;
       /* Row row = new Row();
        row.setName("HtmlAttribute");
        row.setValue("Name: " + name + ", Value: " + (tagAttribute != null ? tagAttribute.getValue() : "none"));
        this.st.addRow("HtmlAttribute", row);*/
        return new StructuralDirectiveAttribute(name, tagAttribute);
    }



    @Override
    public HtmlAttribute visitAttributeBinding(Parsergrammar.AttributeBindingContext ctx) {
        String name = ctx.ATTRIBUTE_BINDING().getText();
        TagAttribute tagAttribute = ctx.tagAtt() != null ? (TagAttribute) visit(ctx.tagAtt()) : null;
       /* Row row = new Row();
        row.setName("HtmlAttribute");
        row.setValue("Name: " + name + ", Value: " + (tagAttribute != null ? tagAttribute.getValue() : "none"));
        this.st.addRow("HtmlAttribute", row);*/
        return new AttributeBindingAttribute(name, tagAttribute);
    }
    @Override
    public HtmlAttribute visitEventBinding(Parsergrammar.EventBindingContext ctx) {
        String name = ctx.EVENT_BINDING().getText();
        TagAttribute tagAttribute = ctx.tagAtt() != null ? (TagAttribute) visit(ctx.tagAtt()) : null;
        /*Row row = new Row();
        row.setName("HtmlAttribute");
        row.setType("EventBinding");
        row.setValue("Name: " + name + ", Value: " + (tagAttribute != null ? tagAttribute.getValue() : "none"));
        this.st.addRow("HtmlAttribute", row);*/
        return new EventBindingAttribute(name, tagAttribute);
    }

    @Override
    public HtmlAttribute visitTagNameAttribute(Parsergrammar.TagNameAttributeContext ctx) {
        String name = ctx.TAG_NAME().getText();
        TagAttribute tagAttribute = ctx.tagAtt() != null ? (TagAttribute) visit(ctx.tagAtt()) : null;
       /* Row row = new Row();
        row.setName("HtmlAttribute");
        row.setValue("Name: " + name + ", Value: " + (tagAttribute != null ? tagAttribute.getValue() : "none"));
        this.st.addRow("HtmlAttribute", row);*/
        return new TagNameAttribute(name, tagAttribute);
    }

    @Override
    public ASTNode visitTagAtt(Parsergrammar.TagAttContext ctx) {
        String value = "";
        boolean isMethodCall = false;
        int line = ctx.start.getLine();
        if (ctx.METHOD_CALL_VALUE() != null) {
            value = ctx.METHOD_CALL_VALUE().getText(); // e.g., "\"methodName(arg)\""
            String methodCallContent = value.substring(1, value.length() - 1).trim(); // methodName(arg)
            String methodName = methodCallContent.contains("(")
                    ? methodCallContent.substring(0, methodCallContent.indexOf('(')).trim()
                    : methodCallContent;
            if (!undefinedMethodCallErrorSymbolTable.check(methodName)) {
                UndefinedMethodCallError error = new UndefinedMethodCallError(methodName, line, undefinedMethodCallErrorSymbolTable);
//                error.throwException();
            }
            isMethodCall = true;
        } else if (ctx.ATTVALUE_VALUE() != null) {
            value = ctx.ATTVALUE_VALUE().getText().trim();
        }
       /* Row row = new Row();
        row.setName("TagAttribute");
        row.setValue(value);
        if(isMethodCall)
            this.undefinedMethodCallErrorSymbolTable.addRow("TagAttribute", row);
        else {this.st.addRow("TagAttribute",row);}*/
        return new TagAttribute(value, isMethodCall);
    }
}