// Generated from C:/Users/USER/IdeaProjects/untitled1/src/antlr/Parsergrammar.g4 by ANTLR 4.13.2
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Parsergrammar}.
 */
public interface ParsergrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Parsergrammar#ast}.
	 * @param ctx the parse tree
	 */
	void enterAst(Parsergrammar.AstContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parsergrammar#ast}.
	 * @param ctx the parse tree
	 */
	void exitAst(Parsergrammar.AstContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parsergrammar#tsDocument}.
	 * @param ctx the parse tree
	 */
	void enterTsDocument(Parsergrammar.TsDocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parsergrammar#tsDocument}.
	 * @param ctx the parse tree
	 */
	void exitTsDocument(Parsergrammar.TsDocumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parsergrammar#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(Parsergrammar.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parsergrammar#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(Parsergrammar.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parsergrammar#implementsClause}.
	 * @param ctx the parse tree
	 */
	void enterImplementsClause(Parsergrammar.ImplementsClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parsergrammar#implementsClause}.
	 * @param ctx the parse tree
	 */
	void exitImplementsClause(Parsergrammar.ImplementsClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parsergrammar#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(Parsergrammar.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parsergrammar#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(Parsergrammar.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableAssignmentStatement}
	 * labeled alternative in {@link Parsergrammar#classBodyStatement}.
	 * @param ctx the parse tree
	 */
	void enterVariableAssignmentStatement(Parsergrammar.VariableAssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableAssignmentStatement}
	 * labeled alternative in {@link Parsergrammar#classBodyStatement}.
	 * @param ctx the parse tree
	 */
	void exitVariableAssignmentStatement(Parsergrammar.VariableAssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VoidMethodDeclarationStatement}
	 * labeled alternative in {@link Parsergrammar#classBodyStatement}.
	 * @param ctx the parse tree
	 */
	void enterVoidMethodDeclarationStatement(Parsergrammar.VoidMethodDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VoidMethodDeclarationStatement}
	 * labeled alternative in {@link Parsergrammar#classBodyStatement}.
	 * @param ctx the parse tree
	 */
	void exitVoidMethodDeclarationStatement(Parsergrammar.VoidMethodDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableDeclarationStatement}
	 * labeled alternative in {@link Parsergrammar#classBodyStatement}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationStatement(Parsergrammar.VariableDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableDeclarationStatement}
	 * labeled alternative in {@link Parsergrammar#classBodyStatement}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationStatement(Parsergrammar.VariableDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayExprOneStatement}
	 * labeled alternative in {@link Parsergrammar#classBodyStatement}.
	 * @param ctx the parse tree
	 */
	void enterArrayExprOneStatement(Parsergrammar.ArrayExprOneStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayExprOneStatement}
	 * labeled alternative in {@link Parsergrammar#classBodyStatement}.
	 * @param ctx the parse tree
	 */
	void exitArrayExprOneStatement(Parsergrammar.ArrayExprOneStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayExprTwoStatement}
	 * labeled alternative in {@link Parsergrammar#classBodyStatement}.
	 * @param ctx the parse tree
	 */
	void enterArrayExprTwoStatement(Parsergrammar.ArrayExprTwoStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayExprTwoStatement}
	 * labeled alternative in {@link Parsergrammar#classBodyStatement}.
	 * @param ctx the parse tree
	 */
	void exitArrayExprTwoStatement(Parsergrammar.ArrayExprTwoStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayExprThreeStatement}
	 * labeled alternative in {@link Parsergrammar#classBodyStatement}.
	 * @param ctx the parse tree
	 */
	void enterArrayExprThreeStatement(Parsergrammar.ArrayExprThreeStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayExprThreeStatement}
	 * labeled alternative in {@link Parsergrammar#classBodyStatement}.
	 * @param ctx the parse tree
	 */
	void exitArrayExprThreeStatement(Parsergrammar.ArrayExprThreeStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypedMethodDeclarationStatement}
	 * labeled alternative in {@link Parsergrammar#classBodyStatement}.
	 * @param ctx the parse tree
	 */
	void enterTypedMethodDeclarationStatement(Parsergrammar.TypedMethodDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypedMethodDeclarationStatement}
	 * labeled alternative in {@link Parsergrammar#classBodyStatement}.
	 * @param ctx the parse tree
	 */
	void exitTypedMethodDeclarationStatement(Parsergrammar.TypedMethodDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConstructorDeclarationStatement}
	 * labeled alternative in {@link Parsergrammar#classBodyStatement}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclarationStatement(Parsergrammar.ConstructorDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConstructorDeclarationStatement}
	 * labeled alternative in {@link Parsergrammar#classBodyStatement}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclarationStatement(Parsergrammar.ConstructorDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SignalDeclarationStatement}
	 * labeled alternative in {@link Parsergrammar#classBodyStatement}.
	 * @param ctx the parse tree
	 */
	void enterSignalDeclarationStatement(Parsergrammar.SignalDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SignalDeclarationStatement}
	 * labeled alternative in {@link Parsergrammar#classBodyStatement}.
	 * @param ctx the parse tree
	 */
	void exitSignalDeclarationStatement(Parsergrammar.SignalDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NgOnInitMethodStatement}
	 * labeled alternative in {@link Parsergrammar#classBodyStatement}.
	 * @param ctx the parse tree
	 */
	void enterNgOnInitMethodStatement(Parsergrammar.NgOnInitMethodStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NgOnInitMethodStatement}
	 * labeled alternative in {@link Parsergrammar#classBodyStatement}.
	 * @param ctx the parse tree
	 */
	void exitNgOnInitMethodStatement(Parsergrammar.NgOnInitMethodStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AsObservableStatement}
	 * labeled alternative in {@link Parsergrammar#classBodyStatement}.
	 * @param ctx the parse tree
	 */
	void enterAsObservableStatement(Parsergrammar.AsObservableStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AsObservableStatement}
	 * labeled alternative in {@link Parsergrammar#classBodyStatement}.
	 * @param ctx the parse tree
	 */
	void exitAsObservableStatement(Parsergrammar.AsObservableStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ObservableStatement}
	 * labeled alternative in {@link Parsergrammar#classBodyStatement}.
	 * @param ctx the parse tree
	 */
	void enterObservableStatement(Parsergrammar.ObservableStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ObservableStatement}
	 * labeled alternative in {@link Parsergrammar#classBodyStatement}.
	 * @param ctx the parse tree
	 */
	void exitObservableStatement(Parsergrammar.ObservableStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ObjectExpressionStatement}
	 * labeled alternative in {@link Parsergrammar#classBodyStatement}.
	 * @param ctx the parse tree
	 */
	void enterObjectExpressionStatement(Parsergrammar.ObjectExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ObjectExpressionStatement}
	 * labeled alternative in {@link Parsergrammar#classBodyStatement}.
	 * @param ctx the parse tree
	 */
	void exitObjectExpressionStatement(Parsergrammar.ObjectExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parsergrammar#importStatement}.
	 * @param ctx the parse tree
	 */
	void enterImportStatement(Parsergrammar.ImportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parsergrammar#importStatement}.
	 * @param ctx the parse tree
	 */
	void exitImportStatement(Parsergrammar.ImportStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parsergrammar#importBody}.
	 * @param ctx the parse tree
	 */
	void enterImportBody(Parsergrammar.ImportBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parsergrammar#importBody}.
	 * @param ctx the parse tree
	 */
	void exitImportBody(Parsergrammar.ImportBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parsergrammar#componentDecorator}.
	 * @param ctx the parse tree
	 */
	void enterComponentDecorator(Parsergrammar.ComponentDecoratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parsergrammar#componentDecorator}.
	 * @param ctx the parse tree
	 */
	void exitComponentDecorator(Parsergrammar.ComponentDecoratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parsergrammar#componentProperties}.
	 * @param ctx the parse tree
	 */
	void enterComponentProperties(Parsergrammar.ComponentPropertiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parsergrammar#componentProperties}.
	 * @param ctx the parse tree
	 */
	void exitComponentProperties(Parsergrammar.ComponentPropertiesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parsergrammar#selector}.
	 * @param ctx the parse tree
	 */
	void enterSelector(Parsergrammar.SelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parsergrammar#selector}.
	 * @param ctx the parse tree
	 */
	void exitSelector(Parsergrammar.SelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parsergrammar#imports}.
	 * @param ctx the parse tree
	 */
	void enterImports(Parsergrammar.ImportsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parsergrammar#imports}.
	 * @param ctx the parse tree
	 */
	void exitImports(Parsergrammar.ImportsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parsergrammar#styleurl}.
	 * @param ctx the parse tree
	 */
	void enterStyleurl(Parsergrammar.StyleurlContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parsergrammar#styleurl}.
	 * @param ctx the parse tree
	 */
	void exitStyleurl(Parsergrammar.StyleurlContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parsergrammar#templateurl}.
	 * @param ctx the parse tree
	 */
	void enterTemplateurl(Parsergrammar.TemplateurlContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parsergrammar#templateurl}.
	 * @param ctx the parse tree
	 */
	void exitTemplateurl(Parsergrammar.TemplateurlContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parsergrammar#injectableDecorator}.
	 * @param ctx the parse tree
	 */
	void enterInjectableDecorator(Parsergrammar.InjectableDecoratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parsergrammar#injectableDecorator}.
	 * @param ctx the parse tree
	 */
	void exitInjectableDecorator(Parsergrammar.InjectableDecoratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parsergrammar#providedin}.
	 * @param ctx the parse tree
	 */
	void enterProvidedin(Parsergrammar.ProvidedinContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parsergrammar#providedin}.
	 * @param ctx the parse tree
	 */
	void exitProvidedin(Parsergrammar.ProvidedinContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parsergrammar#signature}.
	 * @param ctx the parse tree
	 */
	void enterSignature(Parsergrammar.SignatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parsergrammar#signature}.
	 * @param ctx the parse tree
	 */
	void exitSignature(Parsergrammar.SignatureContext ctx);
	/**
	 * Enter a parse tree produced by the {@code values}
	 * labeled alternative in {@link Parsergrammar#classBodyStatementclassBodyStatementclassBodyStatementclassBodyStatementclassBodyStatementclassBodyStatementclassBodyStatementclassBodyStatementclassBodyStatementclassBodyStatementclassBodyStatementclassBodyStatementclassBodyStatementmethodAssignmentmethodAssignmentmethodAssignmentmethodAssignmentmethodAssignmenthtmlElementhtmlElementhtmlElementhtmlElementhtmlElementhtmlContentStatementhtmlContentStatementhtmlContentStatementhtmlContentStatementhtmlContentStatementhtmlContentStatementhtmlContentStatementhtmlAttributehtmlAttributehtmlAttributehtmlAttribute}.
	 * @param ctx the parse tree
	 */
	void enterValues(Parsergrammar.ValuesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code values}
	 * labeled alternative in {@link Parsergrammar#classBodyStatementclassBodyStatementclassBodyStatementclassBodyStatementclassBodyStatementclassBodyStatementclassBodyStatementclassBodyStatementclassBodyStatementclassBodyStatementclassBodyStatementclassBodyStatementclassBodyStatementmethodAssignmentmethodAssignmentmethodAssignmentmethodAssignmentmethodAssignmenthtmlElementhtmlElementhtmlElementhtmlElementhtmlElementhtmlContentStatementhtmlContentStatementhtmlContentStatementhtmlContentStatementhtmlContentStatementhtmlContentStatementhtmlContentStatementhtmlAttributehtmlAttributehtmlAttributehtmlAttribute}.
	 * @param ctx the parse tree
	 */
	void exitValues(Parsergrammar.ValuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parsergrammar#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(Parsergrammar.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parsergrammar#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(Parsergrammar.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parsergrammar#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(Parsergrammar.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parsergrammar#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(Parsergrammar.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parsergrammar#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(Parsergrammar.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parsergrammar#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(Parsergrammar.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parsergrammar#objectExpression}.
	 * @param ctx the parse tree
	 */
	void enterObjectExpression(Parsergrammar.ObjectExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parsergrammar#objectExpression}.
	 * @param ctx the parse tree
	 */
	void exitObjectExpression(Parsergrammar.ObjectExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parsergrammar#arrayExpression1}.
	 * @param ctx the parse tree
	 */
	void enterArrayExpression1(Parsergrammar.ArrayExpression1Context ctx);
	/**
	 * Exit a parse tree produced by {@link Parsergrammar#arrayExpression1}.
	 * @param ctx the parse tree
	 */
	void exitArrayExpression1(Parsergrammar.ArrayExpression1Context ctx);
	/**
	 * Enter a parse tree produced by {@link Parsergrammar#arraybody1}.
	 * @param ctx the parse tree
	 */
	void enterArraybody1(Parsergrammar.Arraybody1Context ctx);
	/**
	 * Exit a parse tree produced by {@link Parsergrammar#arraybody1}.
	 * @param ctx the parse tree
	 */
	void exitArraybody1(Parsergrammar.Arraybody1Context ctx);
	/**
	 * Enter a parse tree produced by {@link Parsergrammar#arrayExpression2}.
	 * @param ctx the parse tree
	 */
	void enterArrayExpression2(Parsergrammar.ArrayExpression2Context ctx);
	/**
	 * Exit a parse tree produced by {@link Parsergrammar#arrayExpression2}.
	 * @param ctx the parse tree
	 */
	void exitArrayExpression2(Parsergrammar.ArrayExpression2Context ctx);
	/**
	 * Enter a parse tree produced by {@link Parsergrammar#arraybody2}.
	 * @param ctx the parse tree
	 */
	void enterArraybody2(Parsergrammar.Arraybody2Context ctx);
	/**
	 * Exit a parse tree produced by {@link Parsergrammar#arraybody2}.
	 * @param ctx the parse tree
	 */
	void exitArraybody2(Parsergrammar.Arraybody2Context ctx);
	/**
	 * Enter a parse tree produced by {@link Parsergrammar#arrayExpression3}.
	 * @param ctx the parse tree
	 */
	void enterArrayExpression3(Parsergrammar.ArrayExpression3Context ctx);
	/**
	 * Exit a parse tree produced by {@link Parsergrammar#arrayExpression3}.
	 * @param ctx the parse tree
	 */
	void exitArrayExpression3(Parsergrammar.ArrayExpression3Context ctx);
	/**
	 * Enter a parse tree produced by {@link Parsergrammar#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaration(Parsergrammar.ConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parsergrammar#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaration(Parsergrammar.ConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parsergrammar#constructorParam}.
	 * @param ctx the parse tree
	 */
	void enterConstructorParam(Parsergrammar.ConstructorParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parsergrammar#constructorParam}.
	 * @param ctx the parse tree
	 */
	void exitConstructorParam(Parsergrammar.ConstructorParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parsergrammar#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(Parsergrammar.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parsergrammar#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(Parsergrammar.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parsergrammar#variableAssign}.
	 * @param ctx the parse tree
	 */
	void enterVariableAssign(Parsergrammar.VariableAssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parsergrammar#variableAssign}.
	 * @param ctx the parse tree
	 */
	void exitVariableAssign(Parsergrammar.VariableAssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parsergrammar#methodvoid}.
	 * @param ctx the parse tree
	 */
	void enterMethodvoid(Parsergrammar.MethodvoidContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parsergrammar#methodvoid}.
	 * @param ctx the parse tree
	 */
	void exitMethodvoid(Parsergrammar.MethodvoidContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parsergrammar#methodvoidbody}.
	 * @param ctx the parse tree
	 */
	void enterMethodvoidbody(Parsergrammar.MethodvoidbodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parsergrammar#methodvoidbody}.
	 * @param ctx the parse tree
	 */
	void exitMethodvoidbody(Parsergrammar.MethodvoidbodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ThisDotIdentifierAssignRule}
	 * labeled alternative in {@link Parsergrammar#methodAssignment}.
	 * @param ctx the parse tree
	 */
	void enterThisDotIdentifierAssignRule(Parsergrammar.ThisDotIdentifierAssignRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ThisDotIdentifierAssignRule}
	 * labeled alternative in {@link Parsergrammar#methodAssignment}.
	 * @param ctx the parse tree
	 */
	void exitThisDotIdentifierAssignRule(Parsergrammar.ThisDotIdentifierAssignRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ThisDotIdentifierAssignValuesRule}
	 * labeled alternative in {@link Parsergrammar#methodAssignment}.
	 * @param ctx the parse tree
	 */
	void enterThisDotIdentifierAssignValuesRule(Parsergrammar.ThisDotIdentifierAssignValuesRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ThisDotIdentifierAssignValuesRule}
	 * labeled alternative in {@link Parsergrammar#methodAssignment}.
	 * @param ctx the parse tree
	 */
	void exitThisDotIdentifierAssignValuesRule(Parsergrammar.ThisDotIdentifierAssignValuesRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdentifierAssignmentRule}
	 * labeled alternative in {@link Parsergrammar#methodAssignment}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierAssignmentRule(Parsergrammar.IdentifierAssignmentRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdentifierAssignmentRule}
	 * labeled alternative in {@link Parsergrammar#methodAssignment}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierAssignmentRule(Parsergrammar.IdentifierAssignmentRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ThisDotIdentifierAssignWithBracesRule}
	 * labeled alternative in {@link Parsergrammar#methodAssignment}.
	 * @param ctx the parse tree
	 */
	void enterThisDotIdentifierAssignWithBracesRule(Parsergrammar.ThisDotIdentifierAssignWithBracesRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ThisDotIdentifierAssignWithBracesRule}
	 * labeled alternative in {@link Parsergrammar#methodAssignment}.
	 * @param ctx the parse tree
	 */
	void exitThisDotIdentifierAssignWithBracesRule(Parsergrammar.ThisDotIdentifierAssignWithBracesRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StaticAssignmentRule}
	 * labeled alternative in {@link Parsergrammar#methodAssignment}.
	 * @param ctx the parse tree
	 */
	void enterStaticAssignmentRule(Parsergrammar.StaticAssignmentRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StaticAssignmentRule}
	 * labeled alternative in {@link Parsergrammar#methodAssignment}.
	 * @param ctx the parse tree
	 */
	void exitStaticAssignmentRule(Parsergrammar.StaticAssignmentRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parsergrammar#thisDotIdentifierAssign}.
	 * @param ctx the parse tree
	 */
	void enterThisDotIdentifierAssign(Parsergrammar.ThisDotIdentifierAssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parsergrammar#thisDotIdentifierAssign}.
	 * @param ctx the parse tree
	 */
	void exitThisDotIdentifierAssign(Parsergrammar.ThisDotIdentifierAssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parsergrammar#thisDotIdentifierAssignValues}.
	 * @param ctx the parse tree
	 */
	void enterThisDotIdentifierAssignValues(Parsergrammar.ThisDotIdentifierAssignValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parsergrammar#thisDotIdentifierAssignValues}.
	 * @param ctx the parse tree
	 */
	void exitThisDotIdentifierAssignValues(Parsergrammar.ThisDotIdentifierAssignValuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parsergrammar#identifierAssignment}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierAssignment(Parsergrammar.IdentifierAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parsergrammar#identifierAssignment}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierAssignment(Parsergrammar.IdentifierAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parsergrammar#crudBodyRule}.
	 * @param ctx the parse tree
	 */
	void enterCrudBodyRule(Parsergrammar.CrudBodyRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parsergrammar#crudBodyRule}.
	 * @param ctx the parse tree
	 */
	void exitCrudBodyRule(Parsergrammar.CrudBodyRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parsergrammar#thisDotIdentifierAssignWithBraces}.
	 * @param ctx the parse tree
	 */
	void enterThisDotIdentifierAssignWithBraces(Parsergrammar.ThisDotIdentifierAssignWithBracesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parsergrammar#thisDotIdentifierAssignWithBraces}.
	 * @param ctx the parse tree
	 */
	void exitThisDotIdentifierAssignWithBraces(Parsergrammar.ThisDotIdentifierAssignWithBracesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parsergrammar#staticAssignment}.
	 * @param ctx the parse tree
	 */
	void enterStaticAssignment(Parsergrammar.StaticAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parsergrammar#staticAssignment}.
	 * @param ctx the parse tree
	 */
	void exitStaticAssignment(Parsergrammar.StaticAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parsergrammar#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(Parsergrammar.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parsergrammar#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(Parsergrammar.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parsergrammar#ifBody}.
	 * @param ctx the parse tree
	 */
	void enterIfBody(Parsergrammar.IfBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parsergrammar#ifBody}.
	 * @param ctx the parse tree
	 */
	void exitIfBody(Parsergrammar.IfBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parsergrammar#methodcall}.
	 * @param ctx the parse tree
	 */
	void enterMethodcall(Parsergrammar.MethodcallContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parsergrammar#methodcall}.
	 * @param ctx the parse tree
	 */
	void exitMethodcall(Parsergrammar.MethodcallContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parsergrammar#ngOnInitMETHOD}.
	 * @param ctx the parse tree
	 */
	void enterNgOnInitMETHOD(Parsergrammar.NgOnInitMETHODContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parsergrammar#ngOnInitMETHOD}.
	 * @param ctx the parse tree
	 */
	void exitNgOnInitMETHOD(Parsergrammar.NgOnInitMETHODContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parsergrammar#signalDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSignalDeclaration(Parsergrammar.SignalDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parsergrammar#signalDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSignalDeclaration(Parsergrammar.SignalDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parsergrammar#crudBody}.
	 * @param ctx the parse tree
	 */
	void enterCrudBody(Parsergrammar.CrudBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parsergrammar#crudBody}.
	 * @param ctx the parse tree
	 */
	void exitCrudBody(Parsergrammar.CrudBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parsergrammar#nextCall}.
	 * @param ctx the parse tree
	 */
	void enterNextCall(Parsergrammar.NextCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parsergrammar#nextCall}.
	 * @param ctx the parse tree
	 */
	void exitNextCall(Parsergrammar.NextCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parsergrammar#addCall}.
	 * @param ctx the parse tree
	 */
	void enterAddCall(Parsergrammar.AddCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parsergrammar#addCall}.
	 * @param ctx the parse tree
	 */
	void exitAddCall(Parsergrammar.AddCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parsergrammar#edit_delete_call}.
	 * @param ctx the parse tree
	 */
	void enterEdit_delete_call(Parsergrammar.Edit_delete_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parsergrammar#edit_delete_call}.
	 * @param ctx the parse tree
	 */
	void exitEdit_delete_call(Parsergrammar.Edit_delete_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parsergrammar#map}.
	 * @param ctx the parse tree
	 */
	void enterMap(Parsergrammar.MapContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parsergrammar#map}.
	 * @param ctx the parse tree
	 */
	void exitMap(Parsergrammar.MapContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parsergrammar#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilter(Parsergrammar.FilterContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parsergrammar#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilter(Parsergrammar.FilterContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parsergrammar#leftMapFilterAssign}.
	 * @param ctx the parse tree
	 */
	void enterLeftMapFilterAssign(Parsergrammar.LeftMapFilterAssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parsergrammar#leftMapFilterAssign}.
	 * @param ctx the parse tree
	 */
	void exitLeftMapFilterAssign(Parsergrammar.LeftMapFilterAssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parsergrammar#rightMapFilterAssign}.
	 * @param ctx the parse tree
	 */
	void enterRightMapFilterAssign(Parsergrammar.RightMapFilterAssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parsergrammar#rightMapFilterAssign}.
	 * @param ctx the parse tree
	 */
	void exitRightMapFilterAssign(Parsergrammar.RightMapFilterAssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parsergrammar#mapFilterIDENTIFIER}.
	 * @param ctx the parse tree
	 */
	void enterMapFilterIDENTIFIER(Parsergrammar.MapFilterIDENTIFIERContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parsergrammar#mapFilterIDENTIFIER}.
	 * @param ctx the parse tree
	 */
	void exitMapFilterIDENTIFIER(Parsergrammar.MapFilterIDENTIFIERContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parsergrammar#asObservable}.
	 * @param ctx the parse tree
	 */
	void enterAsObservable(Parsergrammar.AsObservableContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parsergrammar#asObservable}.
	 * @param ctx the parse tree
	 */
	void exitAsObservable(Parsergrammar.AsObservableContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parsergrammar#observable}.
	 * @param ctx the parse tree
	 */
	void enterObservable(Parsergrammar.ObservableContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parsergrammar#observable}.
	 * @param ctx the parse tree
	 */
	void exitObservable(Parsergrammar.ObservableContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parsergrammar#observableArray}.
	 * @param ctx the parse tree
	 */
	void enterObservableArray(Parsergrammar.ObservableArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parsergrammar#observableArray}.
	 * @param ctx the parse tree
	 */
	void exitObservableArray(Parsergrammar.ObservableArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parsergrammar#cssDocument}.
	 * @param ctx the parse tree
	 */
	void enterCssDocument(Parsergrammar.CssDocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parsergrammar#cssDocument}.
	 * @param ctx the parse tree
	 */
	void exitCssDocument(Parsergrammar.CssDocumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parsergrammar#selectorincss}.
	 * @param ctx the parse tree
	 */
	void enterSelectorincss(Parsergrammar.SelectorincssContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parsergrammar#selectorincss}.
	 * @param ctx the parse tree
	 */
	void exitSelectorincss(Parsergrammar.SelectorincssContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parsergrammar#ruleSetStart}.
	 * @param ctx the parse tree
	 */
	void enterRuleSetStart(Parsergrammar.RuleSetStartContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parsergrammar#ruleSetStart}.
	 * @param ctx the parse tree
	 */
	void exitRuleSetStart(Parsergrammar.RuleSetStartContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parsergrammar#ruleSet}.
	 * @param ctx the parse tree
	 */
	void enterRuleSet(Parsergrammar.RuleSetContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parsergrammar#ruleSet}.
	 * @param ctx the parse tree
	 */
	void exitRuleSet(Parsergrammar.RuleSetContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parsergrammar#declarationList}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationList(Parsergrammar.DeclarationListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parsergrammar#declarationList}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationList(Parsergrammar.DeclarationListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parsergrammar#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(Parsergrammar.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parsergrammar#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(Parsergrammar.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parsergrammar#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(Parsergrammar.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parsergrammar#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(Parsergrammar.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parsergrammar#htmlDocument}.
	 * @param ctx the parse tree
	 */
	void enterHtmlDocument(Parsergrammar.HtmlDocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parsergrammar#htmlDocument}.
	 * @param ctx the parse tree
	 */
	void exitHtmlDocument(Parsergrammar.HtmlDocumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parsergrammar#scriptletOrSeaWs}.
	 * @param ctx the parse tree
	 */
	void enterScriptletOrSeaWs(Parsergrammar.ScriptletOrSeaWsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parsergrammar#scriptletOrSeaWs}.
	 * @param ctx the parse tree
	 */
	void exitScriptletOrSeaWs(Parsergrammar.ScriptletOrSeaWsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parsergrammar#htmlElements}.
	 * @param ctx the parse tree
	 */
	void enterHtmlElements(Parsergrammar.HtmlElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parsergrammar#htmlElements}.
	 * @param ctx the parse tree
	 */
	void exitHtmlElements(Parsergrammar.HtmlElementsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TsTagElement}
	 * labeled alternative in {@link Parsergrammar#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterTsTagElement(Parsergrammar.TsTagElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TsTagElement}
	 * labeled alternative in {@link Parsergrammar#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitTsTagElement(Parsergrammar.TsTagElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NoEndTagElement}
	 * labeled alternative in {@link Parsergrammar#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterNoEndTagElement(Parsergrammar.NoEndTagElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NoEndTagElement}
	 * labeled alternative in {@link Parsergrammar#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitNoEndTagElement(Parsergrammar.NoEndTagElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NormalTagElement}
	 * labeled alternative in {@link Parsergrammar#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterNormalTagElement(Parsergrammar.NormalTagElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NormalTagElement}
	 * labeled alternative in {@link Parsergrammar#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitNormalTagElement(Parsergrammar.NormalTagElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ScriptletElement}
	 * labeled alternative in {@link Parsergrammar#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterScriptletElement(Parsergrammar.ScriptletElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ScriptletElement}
	 * labeled alternative in {@link Parsergrammar#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitScriptletElement(Parsergrammar.ScriptletElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InterpolationElement}
	 * labeled alternative in {@link Parsergrammar#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterInterpolationElement(Parsergrammar.InterpolationElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InterpolationElement}
	 * labeled alternative in {@link Parsergrammar#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitInterpolationElement(Parsergrammar.InterpolationElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parsergrammar#tsTag}.
	 * @param ctx the parse tree
	 */
	void enterTsTag(Parsergrammar.TsTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parsergrammar#tsTag}.
	 * @param ctx the parse tree
	 */
	void exitTsTag(Parsergrammar.TsTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parsergrammar#noEndTag}.
	 * @param ctx the parse tree
	 */
	void enterNoEndTag(Parsergrammar.NoEndTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parsergrammar#noEndTag}.
	 * @param ctx the parse tree
	 */
	void exitNoEndTag(Parsergrammar.NoEndTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parsergrammar#normalTag}.
	 * @param ctx the parse tree
	 */
	void enterNormalTag(Parsergrammar.NormalTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parsergrammar#normalTag}.
	 * @param ctx the parse tree
	 */
	void exitNormalTag(Parsergrammar.NormalTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parsergrammar#htmlContent}.
	 * @param ctx the parse tree
	 */
	void enterHtmlContent(Parsergrammar.HtmlContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parsergrammar#htmlContent}.
	 * @param ctx the parse tree
	 */
	void exitHtmlContent(Parsergrammar.HtmlContentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlCharDataStatement}
	 * labeled alternative in {@link Parsergrammar#htmlContentStatement}.
	 * @param ctx the parse tree
	 */
	void enterHtmlCharDataStatement(Parsergrammar.HtmlCharDataStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlCharDataStatement}
	 * labeled alternative in {@link Parsergrammar#htmlContentStatement}.
	 * @param ctx the parse tree
	 */
	void exitHtmlCharDataStatement(Parsergrammar.HtmlCharDataStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlElementStatement}
	 * labeled alternative in {@link Parsergrammar#htmlContentStatement}.
	 * @param ctx the parse tree
	 */
	void enterHtmlElementStatement(Parsergrammar.HtmlElementStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlElementStatement}
	 * labeled alternative in {@link Parsergrammar#htmlContentStatement}.
	 * @param ctx the parse tree
	 */
	void exitHtmlElementStatement(Parsergrammar.HtmlElementStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlCDataStatement}
	 * labeled alternative in {@link Parsergrammar#htmlContentStatement}.
	 * @param ctx the parse tree
	 */
	void enterHtmlCDataStatement(Parsergrammar.HtmlCDataStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlCDataStatement}
	 * labeled alternative in {@link Parsergrammar#htmlContentStatement}.
	 * @param ctx the parse tree
	 */
	void exitHtmlCDataStatement(Parsergrammar.HtmlCDataStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlCommentStatement}
	 * labeled alternative in {@link Parsergrammar#htmlContentStatement}.
	 * @param ctx the parse tree
	 */
	void enterHtmlCommentStatement(Parsergrammar.HtmlCommentStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlCommentStatement}
	 * labeled alternative in {@link Parsergrammar#htmlContentStatement}.
	 * @param ctx the parse tree
	 */
	void exitHtmlCommentStatement(Parsergrammar.HtmlCommentStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlScriptletStatement}
	 * labeled alternative in {@link Parsergrammar#htmlContentStatement}.
	 * @param ctx the parse tree
	 */
	void enterHtmlScriptletStatement(Parsergrammar.HtmlScriptletStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlScriptletStatement}
	 * labeled alternative in {@link Parsergrammar#htmlContentStatement}.
	 * @param ctx the parse tree
	 */
	void exitHtmlScriptletStatement(Parsergrammar.HtmlScriptletStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlIdentifierStatement}
	 * labeled alternative in {@link Parsergrammar#htmlContentStatement}.
	 * @param ctx the parse tree
	 */
	void enterHtmlIdentifierStatement(Parsergrammar.HtmlIdentifierStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlIdentifierStatement}
	 * labeled alternative in {@link Parsergrammar#htmlContentStatement}.
	 * @param ctx the parse tree
	 */
	void exitHtmlIdentifierStatement(Parsergrammar.HtmlIdentifierStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlColonStatement}
	 * labeled alternative in {@link Parsergrammar#htmlContentStatement}.
	 * @param ctx the parse tree
	 */
	void enterHtmlColonStatement(Parsergrammar.HtmlColonStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlColonStatement}
	 * labeled alternative in {@link Parsergrammar#htmlContentStatement}.
	 * @param ctx the parse tree
	 */
	void exitHtmlColonStatement(Parsergrammar.HtmlColonStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parsergrammar#htmlChardata}.
	 * @param ctx the parse tree
	 */
	void enterHtmlChardata(Parsergrammar.HtmlChardataContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parsergrammar#htmlChardata}.
	 * @param ctx the parse tree
	 */
	void exitHtmlChardata(Parsergrammar.HtmlChardataContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parsergrammar#tagAtt}.
	 * @param ctx the parse tree
	 */
	void enterTagAtt(Parsergrammar.TagAttContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parsergrammar#tagAtt}.
	 * @param ctx the parse tree
	 */
	void exitTagAtt(Parsergrammar.TagAttContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StructuralDirectiveAttribute}
	 * labeled alternative in {@link Parsergrammar#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void enterStructuralDirectiveAttribute(Parsergrammar.StructuralDirectiveAttributeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StructuralDirectiveAttribute}
	 * labeled alternative in {@link Parsergrammar#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void exitStructuralDirectiveAttribute(Parsergrammar.StructuralDirectiveAttributeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AttributeBinding}
	 * labeled alternative in {@link Parsergrammar#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void enterAttributeBinding(Parsergrammar.AttributeBindingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AttributeBinding}
	 * labeled alternative in {@link Parsergrammar#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void exitAttributeBinding(Parsergrammar.AttributeBindingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EventBinding}
	 * labeled alternative in {@link Parsergrammar#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void enterEventBinding(Parsergrammar.EventBindingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EventBinding}
	 * labeled alternative in {@link Parsergrammar#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void exitEventBinding(Parsergrammar.EventBindingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TagNameAttribute}
	 * labeled alternative in {@link Parsergrammar#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void enterTagNameAttribute(Parsergrammar.TagNameAttributeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TagNameAttribute}
	 * labeled alternative in {@link Parsergrammar#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void exitTagNameAttribute(Parsergrammar.TagNameAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parsergrammar#htmlMisc}.
	 * @param ctx the parse tree
	 */
	void enterHtmlMisc(Parsergrammar.HtmlMiscContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parsergrammar#htmlMisc}.
	 * @param ctx the parse tree
	 */
	void exitHtmlMisc(Parsergrammar.HtmlMiscContext ctx);
	/**
	 * Enter a parse tree produced by {@link Parsergrammar#htmlComment}.
	 * @param ctx the parse tree
	 */
	void enterHtmlComment(Parsergrammar.HtmlCommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Parsergrammar#htmlComment}.
	 * @param ctx the parse tree
	 */
	void exitHtmlComment(Parsergrammar.HtmlCommentContext ctx);
}