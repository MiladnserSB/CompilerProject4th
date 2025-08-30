// Generated from C:/Users/Lenovo/IdeaProjects/CompilerProject4th/src/antlr/Parsergrammar.g4 by ANTLR 4.13.2
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Parsergrammar}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ParsergrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#ast}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAst(Parsergrammar.AstContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#tsDocument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTsDocument(Parsergrammar.TsDocumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(Parsergrammar.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#implementsClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImplementsClause(Parsergrammar.ImplementsClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(Parsergrammar.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableAssignmentStatement}
	 * labeled alternative in {@link Parsergrammar#classBodyStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableAssignmentStatement(Parsergrammar.VariableAssignmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VoidMethodDeclarationStatement}
	 * labeled alternative in {@link Parsergrammar#classBodyStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoidMethodDeclarationStatement(Parsergrammar.VoidMethodDeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableDeclarationStatement}
	 * labeled alternative in {@link Parsergrammar#classBodyStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarationStatement(Parsergrammar.VariableDeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayExprOneStatement}
	 * labeled alternative in {@link Parsergrammar#classBodyStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayExprOneStatement(Parsergrammar.ArrayExprOneStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayExprTwoStatement}
	 * labeled alternative in {@link Parsergrammar#classBodyStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayExprTwoStatement(Parsergrammar.ArrayExprTwoStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayExprThreeStatement}
	 * labeled alternative in {@link Parsergrammar#classBodyStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayExprThreeStatement(Parsergrammar.ArrayExprThreeStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypedMethodDeclarationStatement}
	 * labeled alternative in {@link Parsergrammar#classBodyStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedMethodDeclarationStatement(Parsergrammar.TypedMethodDeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConstructorDeclarationStatement}
	 * labeled alternative in {@link Parsergrammar#classBodyStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclarationStatement(Parsergrammar.ConstructorDeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SignalDeclarationStatement}
	 * labeled alternative in {@link Parsergrammar#classBodyStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignalDeclarationStatement(Parsergrammar.SignalDeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NgOnInitMethodStatement}
	 * labeled alternative in {@link Parsergrammar#classBodyStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNgOnInitMethodStatement(Parsergrammar.NgOnInitMethodStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AsObservableStatement}
	 * labeled alternative in {@link Parsergrammar#classBodyStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsObservableStatement(Parsergrammar.AsObservableStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ObservableStatement}
	 * labeled alternative in {@link Parsergrammar#classBodyStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObservableStatement(Parsergrammar.ObservableStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ObjectExpressionStatement}
	 * labeled alternative in {@link Parsergrammar#classBodyStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectExpressionStatement(Parsergrammar.ObjectExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#importStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportStatement(Parsergrammar.ImportStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#importBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportBody(Parsergrammar.ImportBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#componentDecorator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentDecorator(Parsergrammar.ComponentDecoratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#componentProperties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentProperties(Parsergrammar.ComponentPropertiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelector(Parsergrammar.SelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#imports}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImports(Parsergrammar.ImportsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#styleurl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyleurl(Parsergrammar.StyleurlContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#templateurl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateurl(Parsergrammar.TemplateurlContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#injectableDecorator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInjectableDecorator(Parsergrammar.InjectableDecoratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#providedin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProvidedin(Parsergrammar.ProvidedinContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#signature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignature(Parsergrammar.SignatureContext ctx);
	/**
	 * Visit a parse tree produced by the {@code values}
	 * labeled alternative in {@link Parsergrammar#classBodyStatementclassBodyStatementclassBodyStatementclassBodyStatementclassBodyStatementclassBodyStatementclassBodyStatementclassBodyStatementclassBodyStatementclassBodyStatementclassBodyStatementclassBodyStatementclassBodyStatementhtmlElementhtmlElementhtmlElementhtmlElementhtmlElementhtmlContentStatementhtmlContentStatementhtmlContentStatementhtmlContentStatementhtmlContentStatementhtmlContentStatementhtmlContentStatementhtmlAttributehtmlAttributehtmlAttributehtmlAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValues(Parsergrammar.ValuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(Parsergrammar.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(Parsergrammar.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodBody(Parsergrammar.MethodBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#objectExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectExpression(Parsergrammar.ObjectExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#arrayExpression1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayExpression1(Parsergrammar.ArrayExpression1Context ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#arraybody1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArraybody1(Parsergrammar.Arraybody1Context ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#arrayExpression2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayExpression2(Parsergrammar.ArrayExpression2Context ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#arraybody2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArraybody2(Parsergrammar.Arraybody2Context ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#arrayExpression3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayExpression3(Parsergrammar.ArrayExpression3Context ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#constructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclaration(Parsergrammar.ConstructorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#constructorParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorParam(Parsergrammar.ConstructorParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(Parsergrammar.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#variableAssign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableAssign(Parsergrammar.VariableAssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#methodvoid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodvoid(Parsergrammar.MethodvoidContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#methodvoidbody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodvoidbody(Parsergrammar.MethodvoidbodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#methodAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodAssignment(Parsergrammar.MethodAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#assignmentStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStatement(Parsergrammar.AssignmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#methodCallStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCallStatement(Parsergrammar.MethodCallStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#objectSpreadAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectSpreadAssignment(Parsergrammar.ObjectSpreadAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#staticAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticAssignment(Parsergrammar.StaticAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#leftHandSide}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeftHandSide(Parsergrammar.LeftHandSideContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(Parsergrammar.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#crudBodyRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCrudBodyRule(Parsergrammar.CrudBodyRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#arrayLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLiteral(Parsergrammar.ArrayLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#objectLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectLiteral(Parsergrammar.ObjectLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#objectSpreadProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectSpreadProperty(Parsergrammar.ObjectSpreadPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#objectProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectProperty(Parsergrammar.ObjectPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#arraySpreadExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArraySpreadExpression(Parsergrammar.ArraySpreadExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#methodCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCall(Parsergrammar.MethodCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(Parsergrammar.ArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(Parsergrammar.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(Parsergrammar.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#ifBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfBody(Parsergrammar.IfBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#ngOnInitMETHOD}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNgOnInitMETHOD(Parsergrammar.NgOnInitMETHODContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#signalDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignalDeclaration(Parsergrammar.SignalDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#crudBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCrudBody(Parsergrammar.CrudBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#nextCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNextCall(Parsergrammar.NextCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#addCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddCall(Parsergrammar.AddCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#edit_delete_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEdit_delete_call(Parsergrammar.Edit_delete_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#map}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMap(Parsergrammar.MapContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilter(Parsergrammar.FilterContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#leftMapFilterAssign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeftMapFilterAssign(Parsergrammar.LeftMapFilterAssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#rightMapFilterAssign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRightMapFilterAssign(Parsergrammar.RightMapFilterAssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#mapFilterIDENTIFIER}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapFilterIDENTIFIER(Parsergrammar.MapFilterIDENTIFIERContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#asObservable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsObservable(Parsergrammar.AsObservableContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#observable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObservable(Parsergrammar.ObservableContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#observableArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObservableArray(Parsergrammar.ObservableArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#cssDocument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssDocument(Parsergrammar.CssDocumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#selectorincss}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectorincss(Parsergrammar.SelectorincssContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#ruleSetStart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleSetStart(Parsergrammar.RuleSetStartContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#ruleSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleSet(Parsergrammar.RuleSetContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#declarationList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationList(Parsergrammar.DeclarationListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(Parsergrammar.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(Parsergrammar.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#htmlDocument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlDocument(Parsergrammar.HtmlDocumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#scriptletOrSeaWs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScriptletOrSeaWs(Parsergrammar.ScriptletOrSeaWsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#htmlElements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlElements(Parsergrammar.HtmlElementsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TsTagElement}
	 * labeled alternative in {@link Parsergrammar#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTsTagElement(Parsergrammar.TsTagElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NoEndTagElement}
	 * labeled alternative in {@link Parsergrammar#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoEndTagElement(Parsergrammar.NoEndTagElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NormalTagElement}
	 * labeled alternative in {@link Parsergrammar#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalTagElement(Parsergrammar.NormalTagElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ScriptletElement}
	 * labeled alternative in {@link Parsergrammar#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScriptletElement(Parsergrammar.ScriptletElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InterpolationElement}
	 * labeled alternative in {@link Parsergrammar#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterpolationElement(Parsergrammar.InterpolationElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#tsTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTsTag(Parsergrammar.TsTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#noEndTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoEndTag(Parsergrammar.NoEndTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#normalTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalTag(Parsergrammar.NormalTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#htmlContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlContent(Parsergrammar.HtmlContentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlCharDataStatement}
	 * labeled alternative in {@link Parsergrammar#htmlContentStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlCharDataStatement(Parsergrammar.HtmlCharDataStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlElementStatement}
	 * labeled alternative in {@link Parsergrammar#htmlContentStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlElementStatement(Parsergrammar.HtmlElementStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlCDataStatement}
	 * labeled alternative in {@link Parsergrammar#htmlContentStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlCDataStatement(Parsergrammar.HtmlCDataStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlCommentStatement}
	 * labeled alternative in {@link Parsergrammar#htmlContentStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlCommentStatement(Parsergrammar.HtmlCommentStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlScriptletStatement}
	 * labeled alternative in {@link Parsergrammar#htmlContentStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlScriptletStatement(Parsergrammar.HtmlScriptletStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlIdentifierStatement}
	 * labeled alternative in {@link Parsergrammar#htmlContentStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlIdentifierStatement(Parsergrammar.HtmlIdentifierStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlColonStatement}
	 * labeled alternative in {@link Parsergrammar#htmlContentStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlColonStatement(Parsergrammar.HtmlColonStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#htmlChardata}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlChardata(Parsergrammar.HtmlChardataContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#tagAtt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagAtt(Parsergrammar.TagAttContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StructuralDirectiveAttribute}
	 * labeled alternative in {@link Parsergrammar#htmlAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructuralDirectiveAttribute(Parsergrammar.StructuralDirectiveAttributeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AttributeBinding}
	 * labeled alternative in {@link Parsergrammar#htmlAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeBinding(Parsergrammar.AttributeBindingContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EventBinding}
	 * labeled alternative in {@link Parsergrammar#htmlAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEventBinding(Parsergrammar.EventBindingContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TagNameAttribute}
	 * labeled alternative in {@link Parsergrammar#htmlAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagNameAttribute(Parsergrammar.TagNameAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#htmlMisc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlMisc(Parsergrammar.HtmlMiscContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parsergrammar#htmlComment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlComment(Parsergrammar.HtmlCommentContext ctx);
}