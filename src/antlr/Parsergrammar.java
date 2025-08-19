// Generated from C:/Users/USER/IdeaProjects/untitled1/src/antlr/Parsergrammar.g4 by ANTLR 4.13.2
package antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class Parsergrammar extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IMPORTS=1, FROM=2, EXPORT=3, IMPORT=4, CLASS=5, CONSTRUCTOR=6, RETURN=7, 
		AT=8, IMPLEMENTS=9, NGONINIT=10, SELECTOR=11, TEMPLATEURL=12, STYLEURL=13, 
		STYLEURLS=14, PROVIDEDIN=15, VOIDTYPE=16, NULL=17, BOOLEAN=18, TYPE=19, 
		STATIC=20, ACCESS=21, CROISNN=22, ROUTER=23, BEHAVIOR_SUBJECT=24, OBSERVABLE=25, 
		NAVIGATE=26, COMPONENT=27, INJECTABLE=28, REQUIRED=29, VALUE=30, NEXT=31, 
		MAP=32, FILTER=33, NEW=34, DATE=35, NOW=36, IF=37, LBRACE=38, RBRACE=39, 
		LPAREN=40, RPAREN=41, LBRACKET=42, RBRACKET=43, COLON=44, COMMA=45, SEMICOLON=46, 
		NOT_THREE_ASSIGN=47, THREE_ASSIGN=48, ASSIGN=49, DOT=50, THIS=51, HASH=52, 
		THREE_DOTS=53, ASSIGN_TAG=54, QUESTION_MARK=55, DOLLAR_SIGN=56, INTERJECTION=57, 
		UNIT=58, COLOR=59, PROPERTY_NAME=60, VALUE_KEYWORD=61, TAGSFORCSS=62, 
		IDENTIFIER=63, NUMBER=64, STRING_LITERAL=65, STRING=66, PLUS=67, MINUS=68, 
		STAR=69, DIVIDE=70, EQUALS=71, NOT_EQUAL=72, WS=73, LINE_COMMENT=74, BLOCK_COMMENT=75, 
		INTERPOLATION=76, HTML_COMMENT=77, HTML_CONDITIONAL_COMMENT=78, XML=79, 
		CDATA=80, DTD=81, SCRIPTLET=82, TAG_OPEN_SLASH=83, TAG_OPEN=84, ANY=85, 
		LBRA=86, RBRA=87, TAGS=88, TAGS_VOID=89, SLASH=90, HTML_TEXT=91, TAG_CLOSE=92, 
		TAG_SLASH_CLOSE=93, TAG_EQUALS=94, TAG_NAME=95, STRUCTURAL_DIRECTIVE=96, 
		ATTRIBUTE_BINDING=97, EVENT_BINDING=98, TAG_WHITESPACE=99, TAG_NameChar=100, 
		TAG_NameStartChar=101, METHOD_CALL_VALUE=102, ATTVALUE_VALUE=103, ATTRIBUTE=104, 
		ATTCHARS=105, ATTCHAR=106, HEXCHARS=107, DECCHARS=108, DOUBLE_QUOTE_STRING=109, 
		SINGLE_QUOTE_STRING=110;
	public static final int
		RULE_ast = 0, RULE_tsDocument = 1, RULE_classDeclaration = 2, RULE_implementsClause = 3, 
		RULE_classBody = 4, RULE_classBodyStatement = 5, RULE_importStatement = 6, 
		RULE_importBody = 7, RULE_componentDecorator = 8, RULE_componentProperties = 9, 
		RULE_selector = 10, RULE_imports = 11, RULE_styleurl = 12, RULE_templateurl = 13, 
		RULE_injectableDecorator = 14, RULE_providedin = 15, RULE_signature = 16, 
		RULE_values = 17, RULE_parameters = 18, RULE_methodDeclaration = 19, RULE_methodBody = 20, 
		RULE_objectExpression = 21, RULE_arrayExpression1 = 22, RULE_arraybody1 = 23, 
		RULE_arrayExpression2 = 24, RULE_arraybody2 = 25, RULE_arrayExpression3 = 26, 
		RULE_constructorDeclaration = 27, RULE_variableDeclaration = 28, RULE_variableAssign = 29, 
		RULE_methodvoid = 30, RULE_methodvoidbody = 31, RULE_methodcall = 32, 
		RULE_ngOnInitMETHOD = 33, RULE_signalDeclaration = 34, RULE_crudBody = 35, 
		RULE_nextCall = 36, RULE_addCall = 37, RULE_edit_delete_call = 38, RULE_map = 39, 
		RULE_filter = 40, RULE_leftMapFilterAssign = 41, RULE_rightMapFilterAssign = 42, 
		RULE_mapFilterIDENTIFIER = 43, RULE_asObservable = 44, RULE_observable = 45, 
		RULE_observableArray = 46, RULE_cssDocument = 47, RULE_selectorincss = 48, 
		RULE_ruleSetStart = 49, RULE_ruleSet = 50, RULE_declarationList = 51, 
		RULE_declaration = 52, RULE_value = 53, RULE_htmlDocument = 54, RULE_scriptletOrSeaWs = 55, 
		RULE_htmlElements = 56, RULE_htmlElement = 57, RULE_tsTag = 58, RULE_noEndTag = 59, 
		RULE_normalTag = 60, RULE_htmlContent = 61, RULE_htmlContentStatement = 62, 
		RULE_htmlChardata = 63, RULE_tagAtt = 64, RULE_htmlAttribute = 65, RULE_htmlMisc = 66, 
		RULE_htmlComment = 67;
	private static String[] makeRuleNames() {
		return new String[] {
			"ast", "tsDocument", "classDeclaration", "implementsClause", "classBody", 
			"classBodyStatement", "importStatement", "importBody", "componentDecorator", 
			"componentProperties", "selector", "imports", "styleurl", "templateurl", 
			"injectableDecorator", "providedin", "signature", "values", "parameters", 
			"methodDeclaration", "methodBody", "objectExpression", "arrayExpression1", 
			"arraybody1", "arrayExpression2", "arraybody2", "arrayExpression3", "constructorDeclaration", 
			"variableDeclaration", "variableAssign", "methodvoid", "methodvoidbody", 
			"methodcall", "ngOnInitMETHOD", "signalDeclaration", "crudBody", "nextCall", 
			"addCall", "edit_delete_call", "map", "filter", "leftMapFilterAssign", 
			"rightMapFilterAssign", "mapFilterIDENTIFIER", "asObservable", "observable", 
			"observableArray", "cssDocument", "selectorincss", "ruleSetStart", "ruleSet", 
			"declarationList", "declaration", "value", "htmlDocument", "scriptletOrSeaWs", 
			"htmlElements", "htmlElement", "tsTag", "noEndTag", "normalTag", "htmlContent", 
			"htmlContentStatement", "htmlChardata", "tagAtt", "htmlAttribute", "htmlMisc", 
			"htmlComment"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'imports'", "'from'", "'export'", "'import'", "'class'", "'constructor'", 
			"'return'", "'@'", "'implements'", "'ngOnInit'", "'selector'", "'templateUrl'", 
			"'styleUrl'", "'styleUrls'", "'providedIn'", "'void'", "'null'", null, 
			null, null, null, null, "'Router'", "'BehaviorSubject'", "'Observable'", 
			"'navigate'", "'Component'", "'Injectable'", "'required'", "'value'", 
			"'next'", "'map'", "'filter'", "'new'", "'Date'", "'now'", "'if'", "'{'", 
			"'}'", "'('", "')'", null, null, "':'", "','", "';'", "'!=='", "'==='", 
			"'='", "'.'", "'this'", "'#'", "'...'", "'=>'", "'?'", "'$'", "'!'", 
			null, null, null, null, null, null, null, null, null, "'+'", "'-'", "'*'", 
			null, "'=='", "'!='", null, null, null, null, null, null, null, null, 
			null, null, "'</'", "'<'", "'any'", null, null, null, null, null, null, 
			"'>'", "'/>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IMPORTS", "FROM", "EXPORT", "IMPORT", "CLASS", "CONSTRUCTOR", 
			"RETURN", "AT", "IMPLEMENTS", "NGONINIT", "SELECTOR", "TEMPLATEURL", 
			"STYLEURL", "STYLEURLS", "PROVIDEDIN", "VOIDTYPE", "NULL", "BOOLEAN", 
			"TYPE", "STATIC", "ACCESS", "CROISNN", "ROUTER", "BEHAVIOR_SUBJECT", 
			"OBSERVABLE", "NAVIGATE", "COMPONENT", "INJECTABLE", "REQUIRED", "VALUE", 
			"NEXT", "MAP", "FILTER", "NEW", "DATE", "NOW", "IF", "LBRACE", "RBRACE", 
			"LPAREN", "RPAREN", "LBRACKET", "RBRACKET", "COLON", "COMMA", "SEMICOLON", 
			"NOT_THREE_ASSIGN", "THREE_ASSIGN", "ASSIGN", "DOT", "THIS", "HASH", 
			"THREE_DOTS", "ASSIGN_TAG", "QUESTION_MARK", "DOLLAR_SIGN", "INTERJECTION", 
			"UNIT", "COLOR", "PROPERTY_NAME", "VALUE_KEYWORD", "TAGSFORCSS", "IDENTIFIER", 
			"NUMBER", "STRING_LITERAL", "STRING", "PLUS", "MINUS", "STAR", "DIVIDE", 
			"EQUALS", "NOT_EQUAL", "WS", "LINE_COMMENT", "BLOCK_COMMENT", "INTERPOLATION", 
			"HTML_COMMENT", "HTML_CONDITIONAL_COMMENT", "XML", "CDATA", "DTD", "SCRIPTLET", 
			"TAG_OPEN_SLASH", "TAG_OPEN", "ANY", "LBRA", "RBRA", "TAGS", "TAGS_VOID", 
			"SLASH", "HTML_TEXT", "TAG_CLOSE", "TAG_SLASH_CLOSE", "TAG_EQUALS", "TAG_NAME", 
			"STRUCTURAL_DIRECTIVE", "ATTRIBUTE_BINDING", "EVENT_BINDING", "TAG_WHITESPACE", 
			"TAG_NameChar", "TAG_NameStartChar", "METHOD_CALL_VALUE", "ATTVALUE_VALUE", 
			"ATTRIBUTE", "ATTCHARS", "ATTCHAR", "HEXCHARS", "DECCHARS", "DOUBLE_QUOTE_STRING", 
			"SINGLE_QUOTE_STRING"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Parsergrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Parsergrammar(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AstContext extends ParserRuleContext {
		public TsDocumentContext tsDocument() {
			return getRuleContext(TsDocumentContext.class,0);
		}
		public HtmlDocumentContext htmlDocument() {
			return getRuleContext(HtmlDocumentContext.class,0);
		}
		public CssDocumentContext cssDocument() {
			return getRuleContext(CssDocumentContext.class,0);
		}
		public AstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ast; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterAst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitAst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitAst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AstContext ast() throws RecognitionException {
		AstContext _localctx = new AstContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_ast);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			tsDocument();
			setState(137);
			htmlDocument();
			setState(138);
			cssDocument();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TsDocumentContext extends ParserRuleContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public ComponentDecoratorContext componentDecorator() {
			return getRuleContext(ComponentDecoratorContext.class,0);
		}
		public InjectableDecoratorContext injectableDecorator() {
			return getRuleContext(InjectableDecoratorContext.class,0);
		}
		public List<ImportStatementContext> importStatement() {
			return getRuleContexts(ImportStatementContext.class);
		}
		public ImportStatementContext importStatement(int i) {
			return getRuleContext(ImportStatementContext.class,i);
		}
		public TsDocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tsDocument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterTsDocument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitTsDocument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitTsDocument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TsDocumentContext tsDocument() throws RecognitionException {
		TsDocumentContext _localctx = new TsDocumentContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_tsDocument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(141); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(140);
				importStatement();
				}
				}
				setState(143); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IMPORT );
			setState(147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(145);
				componentDecorator();
				}
				break;
			case 2:
				{
				setState(146);
				injectableDecorator();
				}
				break;
			}
			setState(149);
			classDeclaration();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassDeclarationContext extends ParserRuleContext {
		public TerminalNode EXPORT() { return getToken(Parsergrammar.EXPORT, 0); }
		public TerminalNode CLASS() { return getToken(Parsergrammar.CLASS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(Parsergrammar.IDENTIFIER, 0); }
		public TerminalNode LBRACE() { return getToken(Parsergrammar.LBRACE, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(Parsergrammar.RBRACE, 0); }
		public ImplementsClauseContext implementsClause() {
			return getRuleContext(ImplementsClauseContext.class,0);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(EXPORT);
			setState(152);
			match(CLASS);
			setState(153);
			match(IDENTIFIER);
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(154);
				implementsClause();
				}
			}

			setState(157);
			match(LBRACE);
			setState(158);
			classBody();
			setState(159);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImplementsClauseContext extends ParserRuleContext {
		public TerminalNode IMPLEMENTS() { return getToken(Parsergrammar.IMPLEMENTS, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(Parsergrammar.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(Parsergrammar.IDENTIFIER, i);
		}
		public List<TerminalNode> CROISNN() { return getTokens(Parsergrammar.CROISNN); }
		public TerminalNode CROISNN(int i) {
			return getToken(Parsergrammar.CROISNN, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Parsergrammar.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Parsergrammar.COMMA, i);
		}
		public ImplementsClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implementsClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterImplementsClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitImplementsClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitImplementsClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImplementsClauseContext implementsClause() throws RecognitionException {
		ImplementsClauseContext _localctx = new ImplementsClauseContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_implementsClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(IMPLEMENTS);
			setState(162);
			_la = _input.LA(1);
			if ( !(_la==CROISNN || _la==IDENTIFIER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(163);
				match(COMMA);
				setState(164);
				_la = _input.LA(1);
				if ( !(_la==CROISNN || _la==IDENTIFIER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassBodyContext extends ParserRuleContext {
		public List<ClassBodyStatementContext> classBodyStatement() {
			return getRuleContexts(ClassBodyStatementContext.class);
		}
		public ClassBodyStatementContext classBodyStatement(int i) {
			return getRuleContext(ClassBodyStatementContext.class,i);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitClassBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitClassBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -9223371761973722048L) != 0)) {
				{
				{
				setState(170);
				classBodyStatement();
				}
				}
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassBodyStatementContext extends ParserRuleContext {
		public ClassBodyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBodyStatement; }
	 
		public ClassBodyStatementContext() { }
		public void copyFrom(ClassBodyStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypedMethodDeclarationStatementContext extends ClassBodyStatementContext {
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public TypedMethodDeclarationStatementContext(ClassBodyStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterTypedMethodDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitTypedMethodDeclarationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitTypedMethodDeclarationStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableAssignmentStatementContext extends ClassBodyStatementContext {
		public VariableAssignContext variableAssign() {
			return getRuleContext(VariableAssignContext.class,0);
		}
		public VariableAssignmentStatementContext(ClassBodyStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterVariableAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitVariableAssignmentStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitVariableAssignmentStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayExprOneStatementContext extends ClassBodyStatementContext {
		public ArrayExpression1Context arrayExpression1() {
			return getRuleContext(ArrayExpression1Context.class,0);
		}
		public ArrayExprOneStatementContext(ClassBodyStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterArrayExprOneStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitArrayExprOneStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitArrayExprOneStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SignalDeclarationStatementContext extends ClassBodyStatementContext {
		public SignalDeclarationContext signalDeclaration() {
			return getRuleContext(SignalDeclarationContext.class,0);
		}
		public SignalDeclarationStatementContext(ClassBodyStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterSignalDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitSignalDeclarationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitSignalDeclarationStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayExprTwoStatementContext extends ClassBodyStatementContext {
		public ArrayExpression2Context arrayExpression2() {
			return getRuleContext(ArrayExpression2Context.class,0);
		}
		public ArrayExprTwoStatementContext(ClassBodyStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterArrayExprTwoStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitArrayExprTwoStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitArrayExprTwoStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VoidMethodDeclarationStatementContext extends ClassBodyStatementContext {
		public MethodvoidContext methodvoid() {
			return getRuleContext(MethodvoidContext.class,0);
		}
		public VoidMethodDeclarationStatementContext(ClassBodyStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterVoidMethodDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitVoidMethodDeclarationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitVoidMethodDeclarationStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayExprThreeStatementContext extends ClassBodyStatementContext {
		public ArrayExpression3Context arrayExpression3() {
			return getRuleContext(ArrayExpression3Context.class,0);
		}
		public ArrayExprThreeStatementContext(ClassBodyStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterArrayExprThreeStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitArrayExprThreeStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitArrayExprThreeStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ObservableStatementContext extends ClassBodyStatementContext {
		public ObservableContext observable() {
			return getRuleContext(ObservableContext.class,0);
		}
		public ObservableStatementContext(ClassBodyStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterObservableStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitObservableStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitObservableStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ObjectExpressionStatementContext extends ClassBodyStatementContext {
		public ObjectExpressionContext objectExpression() {
			return getRuleContext(ObjectExpressionContext.class,0);
		}
		public ObjectExpressionStatementContext(ClassBodyStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterObjectExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitObjectExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitObjectExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NgOnInitMethodStatementContext extends ClassBodyStatementContext {
		public NgOnInitMETHODContext ngOnInitMETHOD() {
			return getRuleContext(NgOnInitMETHODContext.class,0);
		}
		public NgOnInitMethodStatementContext(ClassBodyStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterNgOnInitMethodStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitNgOnInitMethodStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitNgOnInitMethodStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclarationStatementContext extends ClassBodyStatementContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public VariableDeclarationStatementContext(ClassBodyStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterVariableDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitVariableDeclarationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitVariableDeclarationStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AsObservableStatementContext extends ClassBodyStatementContext {
		public AsObservableContext asObservable() {
			return getRuleContext(AsObservableContext.class,0);
		}
		public AsObservableStatementContext(ClassBodyStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterAsObservableStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitAsObservableStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitAsObservableStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConstructorDeclarationStatementContext extends ClassBodyStatementContext {
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public ConstructorDeclarationStatementContext(ClassBodyStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterConstructorDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitConstructorDeclarationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitConstructorDeclarationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyStatementContext classBodyStatement() throws RecognitionException {
		ClassBodyStatementContext _localctx = new ClassBodyStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_classBodyStatement);
		try {
			setState(189);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new VariableAssignmentStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(176);
				variableAssign();
				}
				break;
			case 2:
				_localctx = new VoidMethodDeclarationStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(177);
				methodvoid();
				}
				break;
			case 3:
				_localctx = new VariableDeclarationStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(178);
				variableDeclaration();
				}
				break;
			case 4:
				_localctx = new ArrayExprOneStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(179);
				arrayExpression1();
				}
				break;
			case 5:
				_localctx = new ArrayExprTwoStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(180);
				arrayExpression2();
				}
				break;
			case 6:
				_localctx = new ArrayExprThreeStatementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(181);
				arrayExpression3();
				}
				break;
			case 7:
				_localctx = new TypedMethodDeclarationStatementContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(182);
				methodDeclaration();
				}
				break;
			case 8:
				_localctx = new ConstructorDeclarationStatementContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(183);
				constructorDeclaration();
				}
				break;
			case 9:
				_localctx = new SignalDeclarationStatementContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(184);
				signalDeclaration();
				}
				break;
			case 10:
				_localctx = new NgOnInitMethodStatementContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(185);
				ngOnInitMETHOD();
				}
				break;
			case 11:
				_localctx = new AsObservableStatementContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(186);
				asObservable();
				}
				break;
			case 12:
				_localctx = new ObservableStatementContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(187);
				observable();
				}
				break;
			case 13:
				_localctx = new ObjectExpressionStatementContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(188);
				objectExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportStatementContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(Parsergrammar.IMPORT, 0); }
		public TerminalNode LBRACE() { return getToken(Parsergrammar.LBRACE, 0); }
		public List<ImportBodyContext> importBody() {
			return getRuleContexts(ImportBodyContext.class);
		}
		public ImportBodyContext importBody(int i) {
			return getRuleContext(ImportBodyContext.class,i);
		}
		public TerminalNode RBRACE() { return getToken(Parsergrammar.RBRACE, 0); }
		public TerminalNode FROM() { return getToken(Parsergrammar.FROM, 0); }
		public TerminalNode SEMICOLON() { return getToken(Parsergrammar.SEMICOLON, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(Parsergrammar.STRING_LITERAL, 0); }
		public List<TerminalNode> COMMA() { return getTokens(Parsergrammar.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Parsergrammar.COMMA, i);
		}
		public ImportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterImportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitImportStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitImportStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportStatementContext importStatement() throws RecognitionException {
		ImportStatementContext _localctx = new ImportStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_importStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(IMPORT);
			setState(192);
			match(LBRACE);
			setState(193);
			importBody();
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(194);
				match(COMMA);
				setState(195);
				importBody();
				}
				}
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(201);
			match(RBRACE);
			setState(202);
			match(FROM);
			{
			setState(203);
			match(STRING_LITERAL);
			}
			setState(204);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportBodyContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(Parsergrammar.IDENTIFIER, 0); }
		public TerminalNode CROISNN() { return getToken(Parsergrammar.CROISNN, 0); }
		public TerminalNode COMPONENT() { return getToken(Parsergrammar.COMPONENT, 0); }
		public TerminalNode INJECTABLE() { return getToken(Parsergrammar.INJECTABLE, 0); }
		public TerminalNode BEHAVIOR_SUBJECT() { return getToken(Parsergrammar.BEHAVIOR_SUBJECT, 0); }
		public TerminalNode OBSERVABLE() { return getToken(Parsergrammar.OBSERVABLE, 0); }
		public TerminalNode ROUTER() { return getToken(Parsergrammar.ROUTER, 0); }
		public ImportBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterImportBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitImportBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitImportBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportBodyContext importBody() throws RecognitionException {
		ImportBodyContext _localctx = new ImportBodyContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_importBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & -9223372036389208064L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComponentDecoratorContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(Parsergrammar.AT, 0); }
		public TerminalNode COMPONENT() { return getToken(Parsergrammar.COMPONENT, 0); }
		public TerminalNode LPAREN() { return getToken(Parsergrammar.LPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(Parsergrammar.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(Parsergrammar.RBRACE, 0); }
		public TerminalNode RPAREN() { return getToken(Parsergrammar.RPAREN, 0); }
		public ComponentPropertiesContext componentProperties() {
			return getRuleContext(ComponentPropertiesContext.class,0);
		}
		public ComponentDecoratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentDecorator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterComponentDecorator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitComponentDecorator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitComponentDecorator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentDecoratorContext componentDecorator() throws RecognitionException {
		ComponentDecoratorContext _localctx = new ComponentDecoratorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_componentDecorator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(AT);
			setState(209);
			match(COMPONENT);
			setState(210);
			match(LPAREN);
			setState(211);
			match(LBRACE);
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 6146L) != 0)) {
				{
				setState(212);
				componentProperties();
				}
			}

			setState(215);
			match(RBRACE);
			setState(216);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComponentPropertiesContext extends ParserRuleContext {
		public TemplateurlContext templateurl() {
			return getRuleContext(TemplateurlContext.class,0);
		}
		public SelectorContext selector() {
			return getRuleContext(SelectorContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(Parsergrammar.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Parsergrammar.COMMA, i);
		}
		public ImportsContext imports() {
			return getRuleContext(ImportsContext.class,0);
		}
		public StyleurlContext styleurl() {
			return getRuleContext(StyleurlContext.class,0);
		}
		public ComponentPropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentProperties; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterComponentProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitComponentProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitComponentProperties(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentPropertiesContext componentProperties() throws RecognitionException {
		ComponentPropertiesContext _localctx = new ComponentPropertiesContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_componentProperties);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SELECTOR) {
				{
				setState(218);
				selector();
				setState(219);
				match(COMMA);
				}
			}

			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPORTS) {
				{
				setState(223);
				imports();
				setState(224);
				match(COMMA);
				}
			}

			setState(228);
			templateurl();
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STYLEURL) {
				{
				setState(229);
				styleurl();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelectorContext extends ParserRuleContext {
		public TerminalNode SELECTOR() { return getToken(Parsergrammar.SELECTOR, 0); }
		public TerminalNode COLON() { return getToken(Parsergrammar.COLON, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(Parsergrammar.STRING_LITERAL, 0); }
		public SelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorContext selector() throws RecognitionException {
		SelectorContext _localctx = new SelectorContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_selector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(SELECTOR);
			setState(233);
			match(COLON);
			setState(234);
			match(STRING_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportsContext extends ParserRuleContext {
		public TerminalNode IMPORTS() { return getToken(Parsergrammar.IMPORTS, 0); }
		public TerminalNode COLON() { return getToken(Parsergrammar.COLON, 0); }
		public TerminalNode LBRACKET() { return getToken(Parsergrammar.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(Parsergrammar.RBRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(Parsergrammar.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Parsergrammar.COMMA, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(Parsergrammar.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(Parsergrammar.IDENTIFIER, i);
		}
		public List<TerminalNode> CROISNN() { return getTokens(Parsergrammar.CROISNN); }
		public TerminalNode CROISNN(int i) {
			return getToken(Parsergrammar.CROISNN, i);
		}
		public ImportsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imports; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterImports(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitImports(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitImports(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportsContext imports() throws RecognitionException {
		ImportsContext _localctx = new ImportsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_imports);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(IMPORTS);
			setState(237);
			match(COLON);
			setState(238);
			match(LBRACKET);
			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CROISNN || _la==IDENTIFIER) {
				{
				setState(239);
				_la = _input.LA(1);
				if ( !(_la==CROISNN || _la==IDENTIFIER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(246);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(242);
					match(COMMA);
					setState(243);
					_la = _input.LA(1);
					if ( !(_la==CROISNN || _la==IDENTIFIER) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					} 
				}
				setState(248);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(249);
			match(RBRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StyleurlContext extends ParserRuleContext {
		public TerminalNode STYLEURL() { return getToken(Parsergrammar.STYLEURL, 0); }
		public TerminalNode COLON() { return getToken(Parsergrammar.COLON, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(Parsergrammar.STRING_LITERAL, 0); }
		public StyleurlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_styleurl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterStyleurl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitStyleurl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitStyleurl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StyleurlContext styleurl() throws RecognitionException {
		StyleurlContext _localctx = new StyleurlContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_styleurl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(STYLEURL);
			setState(252);
			match(COLON);
			setState(253);
			match(STRING_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TemplateurlContext extends ParserRuleContext {
		public TerminalNode TEMPLATEURL() { return getToken(Parsergrammar.TEMPLATEURL, 0); }
		public TerminalNode COLON() { return getToken(Parsergrammar.COLON, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(Parsergrammar.STRING_LITERAL, 0); }
		public TerminalNode COMMA() { return getToken(Parsergrammar.COMMA, 0); }
		public TemplateurlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateurl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterTemplateurl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitTemplateurl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitTemplateurl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateurlContext templateurl() throws RecognitionException {
		TemplateurlContext _localctx = new TemplateurlContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_templateurl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(TEMPLATEURL);
			setState(256);
			match(COLON);
			setState(257);
			match(STRING_LITERAL);
			setState(258);
			match(COMMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InjectableDecoratorContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(Parsergrammar.AT, 0); }
		public TerminalNode INJECTABLE() { return getToken(Parsergrammar.INJECTABLE, 0); }
		public TerminalNode LPAREN() { return getToken(Parsergrammar.LPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(Parsergrammar.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(Parsergrammar.RBRACE, 0); }
		public TerminalNode RPAREN() { return getToken(Parsergrammar.RPAREN, 0); }
		public ProvidedinContext providedin() {
			return getRuleContext(ProvidedinContext.class,0);
		}
		public InjectableDecoratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_injectableDecorator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterInjectableDecorator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitInjectableDecorator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitInjectableDecorator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InjectableDecoratorContext injectableDecorator() throws RecognitionException {
		InjectableDecoratorContext _localctx = new InjectableDecoratorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_injectableDecorator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			match(AT);
			setState(261);
			match(INJECTABLE);
			setState(262);
			match(LPAREN);
			setState(263);
			match(LBRACE);
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PROVIDEDIN) {
				{
				setState(264);
				providedin();
				}
			}

			setState(267);
			match(RBRACE);
			setState(268);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProvidedinContext extends ParserRuleContext {
		public TerminalNode PROVIDEDIN() { return getToken(Parsergrammar.PROVIDEDIN, 0); }
		public TerminalNode COLON() { return getToken(Parsergrammar.COLON, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(Parsergrammar.STRING_LITERAL, 0); }
		public TerminalNode COMMA() { return getToken(Parsergrammar.COMMA, 0); }
		public ProvidedinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_providedin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterProvidedin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitProvidedin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitProvidedin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProvidedinContext providedin() throws RecognitionException {
		ProvidedinContext _localctx = new ProvidedinContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_providedin);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			match(PROVIDEDIN);
			setState(271);
			match(COLON);
			setState(272);
			match(STRING_LITERAL);
			setState(274);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(273);
				match(COMMA);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SignatureContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(Parsergrammar.IDENTIFIER, 0); }
		public TerminalNode ACCESS() { return getToken(Parsergrammar.ACCESS, 0); }
		public TerminalNode STATIC() { return getToken(Parsergrammar.STATIC, 0); }
		public SignatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterSignature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitSignature(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitSignature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SignatureContext signature() throws RecognitionException {
		SignatureContext _localctx = new SignatureContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_signature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ACCESS) {
				{
				setState(276);
				match(ACCESS);
				}
			}

			setState(280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(279);
				match(STATIC);
				}
			}

			setState(282);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValuesContext extends ParserRuleContext {
		public TerminalNode NULL() { return getToken(Parsergrammar.NULL, 0); }
		public TerminalNode NUMBER() { return getToken(Parsergrammar.NUMBER, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(Parsergrammar.STRING_LITERAL, 0); }
		public TerminalNode BOOLEAN() { return getToken(Parsergrammar.BOOLEAN, 0); }
		public ValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_values; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitValues(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitValues(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValuesContext values() throws RecognitionException {
		ValuesContext _localctx = new ValuesContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_values);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			_la = _input.LA(1);
			if ( !(((((_la - 17)) & ~0x3f) == 0 && ((1L << (_la - 17)) & 422212465065987L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParametersContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(Parsergrammar.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(Parsergrammar.IDENTIFIER, i);
		}
		public List<TerminalNode> COLON() { return getTokens(Parsergrammar.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(Parsergrammar.COLON, i);
		}
		public List<TerminalNode> TYPE() { return getTokens(Parsergrammar.TYPE); }
		public TerminalNode TYPE(int i) {
			return getToken(Parsergrammar.TYPE, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Parsergrammar.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Parsergrammar.COMMA, i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			match(IDENTIFIER);
			setState(287);
			match(COLON);
			setState(288);
			match(TYPE);
			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(289);
				match(COMMA);
				setState(290);
				match(IDENTIFIER);
				setState(291);
				match(COLON);
				setState(292);
				match(TYPE);
				}
				}
				setState(297);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MethodDeclarationContext extends ParserRuleContext {
		public SignatureContext signature() {
			return getRuleContext(SignatureContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(Parsergrammar.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Parsergrammar.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(Parsergrammar.LBRACE, 0); }
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(Parsergrammar.RBRACE, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			signature();
			setState(299);
			match(LPAREN);
			setState(301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(300);
				parameters();
				}
			}

			setState(303);
			match(RPAREN);
			setState(304);
			match(LBRACE);
			setState(305);
			methodBody();
			setState(306);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MethodBodyContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(Parsergrammar.RETURN, 0); }
		public TerminalNode SEMICOLON() { return getToken(Parsergrammar.SEMICOLON, 0); }
		public TerminalNode IDENTIFIER() { return getToken(Parsergrammar.IDENTIFIER, 0); }
		public ValuesContext values() {
			return getRuleContext(ValuesContext.class,0);
		}
		public TerminalNode THIS() { return getToken(Parsergrammar.THIS, 0); }
		public List<TerminalNode> DOT() { return getTokens(Parsergrammar.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(Parsergrammar.DOT, i);
		}
		public TerminalNode VALUE() { return getToken(Parsergrammar.VALUE, 0); }
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitMethodBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitMethodBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_methodBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			match(RETURN);
			setState(311);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THIS) {
				{
				setState(309);
				match(THIS);
				setState(310);
				match(DOT);
				}
			}

			setState(315);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(313);
				match(IDENTIFIER);
				}
				break;
			case NULL:
			case BOOLEAN:
			case NUMBER:
			case STRING_LITERAL:
				{
				setState(314);
				values();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(319);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(317);
				match(DOT);
				setState(318);
				match(VALUE);
				}
			}

			setState(321);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ObjectExpressionContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(Parsergrammar.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(Parsergrammar.RBRACE, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(Parsergrammar.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(Parsergrammar.IDENTIFIER, i);
		}
		public TerminalNode ASSIGN() { return getToken(Parsergrammar.ASSIGN, 0); }
		public List<TerminalNode> COLON() { return getTokens(Parsergrammar.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(Parsergrammar.COLON, i);
		}
		public List<ValuesContext> values() {
			return getRuleContexts(ValuesContext.class);
		}
		public ValuesContext values(int i) {
			return getRuleContext(ValuesContext.class,i);
		}
		public TerminalNode SEMICOLON() { return getToken(Parsergrammar.SEMICOLON, 0); }
		public List<TerminalNode> COMMA() { return getTokens(Parsergrammar.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Parsergrammar.COMMA, i);
		}
		public ObjectExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterObjectExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitObjectExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitObjectExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectExpressionContext objectExpression() throws RecognitionException {
		ObjectExpressionContext _localctx = new ObjectExpressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_objectExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(323);
				match(IDENTIFIER);
				setState(324);
				match(ASSIGN);
				}
			}

			setState(327);
			match(LBRACE);
			setState(336);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(328);
				match(IDENTIFIER);
				setState(329);
				match(COLON);
				setState(330);
				values();
				setState(332);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(331);
					match(COMMA);
					}
				}

				}
				}
				setState(338);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(339);
			match(RBRACE);
			setState(341);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(340);
				match(SEMICOLON);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayExpression1Context extends ParserRuleContext {
		public SignatureContext signature() {
			return getRuleContext(SignatureContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(Parsergrammar.ASSIGN, 0); }
		public TerminalNode LBRACKET() { return getToken(Parsergrammar.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(Parsergrammar.RBRACKET, 0); }
		public List<Arraybody1Context> arraybody1() {
			return getRuleContexts(Arraybody1Context.class);
		}
		public Arraybody1Context arraybody1(int i) {
			return getRuleContext(Arraybody1Context.class,i);
		}
		public TerminalNode SEMICOLON() { return getToken(Parsergrammar.SEMICOLON, 0); }
		public ArrayExpression1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayExpression1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterArrayExpression1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitArrayExpression1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitArrayExpression1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayExpression1Context arrayExpression1() throws RecognitionException {
		ArrayExpression1Context _localctx = new ArrayExpression1Context(_ctx, getState());
		enterRule(_localctx, 44, RULE_arrayExpression1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			signature();
			setState(344);
			match(ASSIGN);
			setState(345);
			match(LBRACKET);
			setState(349);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 38)) & ~0x3f) == 0 && ((1L << (_la - 38)) & 234881025L) != 0)) {
				{
				{
				setState(346);
				arraybody1();
				}
				}
				setState(351);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(352);
			match(RBRACKET);
			setState(354);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(353);
				match(SEMICOLON);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Arraybody1Context extends ParserRuleContext {
		public ObjectExpressionContext objectExpression() {
			return getRuleContext(ObjectExpressionContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(Parsergrammar.COMMA, 0); }
		public TerminalNode NUMBER() { return getToken(Parsergrammar.NUMBER, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(Parsergrammar.STRING_LITERAL, 0); }
		public Arraybody1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arraybody1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterArraybody1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitArraybody1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitArraybody1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arraybody1Context arraybody1() throws RecognitionException {
		Arraybody1Context _localctx = new Arraybody1Context(_ctx, getState());
		enterRule(_localctx, 46, RULE_arraybody1);
		int _la;
		try {
			setState(368);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(356);
				objectExpression();
				setState(358);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(357);
					match(COMMA);
					}
				}

				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(360);
				match(NUMBER);
				setState(362);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(361);
					match(COMMA);
					}
				}

				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(364);
				match(STRING_LITERAL);
				setState(366);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(365);
					match(COMMA);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayExpression2Context extends ParserRuleContext {
		public SignatureContext signature() {
			return getRuleContext(SignatureContext.class,0);
		}
		public TerminalNode COLON() { return getToken(Parsergrammar.COLON, 0); }
		public TerminalNode TYPE() { return getToken(Parsergrammar.TYPE, 0); }
		public List<TerminalNode> LBRACKET() { return getTokens(Parsergrammar.LBRACKET); }
		public TerminalNode LBRACKET(int i) {
			return getToken(Parsergrammar.LBRACKET, i);
		}
		public List<TerminalNode> RBRACKET() { return getTokens(Parsergrammar.RBRACKET); }
		public TerminalNode RBRACKET(int i) {
			return getToken(Parsergrammar.RBRACKET, i);
		}
		public TerminalNode ASSIGN() { return getToken(Parsergrammar.ASSIGN, 0); }
		public TerminalNode SEMICOLON() { return getToken(Parsergrammar.SEMICOLON, 0); }
		public List<Arraybody2Context> arraybody2() {
			return getRuleContexts(Arraybody2Context.class);
		}
		public Arraybody2Context arraybody2(int i) {
			return getRuleContext(Arraybody2Context.class,i);
		}
		public ArrayExpression2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayExpression2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterArrayExpression2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitArrayExpression2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitArrayExpression2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayExpression2Context arrayExpression2() throws RecognitionException {
		ArrayExpression2Context _localctx = new ArrayExpression2Context(_ctx, getState());
		enterRule(_localctx, 48, RULE_arrayExpression2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			signature();
			setState(371);
			match(COLON);
			setState(372);
			match(TYPE);
			setState(373);
			match(LBRACKET);
			setState(374);
			match(RBRACKET);
			setState(375);
			match(ASSIGN);
			setState(376);
			match(LBRACKET);
			setState(380);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACE || _la==IDENTIFIER) {
				{
				{
				setState(377);
				arraybody2();
				}
				}
				setState(382);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(383);
			match(RBRACKET);
			setState(384);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Arraybody2Context extends ParserRuleContext {
		public ObjectExpressionContext objectExpression() {
			return getRuleContext(ObjectExpressionContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(Parsergrammar.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Parsergrammar.COMMA, i);
		}
		public TerminalNode NUMBER() { return getToken(Parsergrammar.NUMBER, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(Parsergrammar.STRING_LITERAL, 0); }
		public Arraybody2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arraybody2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterArraybody2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitArraybody2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitArraybody2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arraybody2Context arraybody2() throws RecognitionException {
		Arraybody2Context _localctx = new Arraybody2Context(_ctx, getState());
		enterRule(_localctx, 50, RULE_arraybody2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			objectExpression();
			setState(387);
			match(COMMA);
			setState(388);
			match(NUMBER);
			setState(389);
			match(COMMA);
			setState(390);
			match(STRING_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayExpression3Context extends ParserRuleContext {
		public SignatureContext signature() {
			return getRuleContext(SignatureContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(Parsergrammar.ASSIGN, 0); }
		public TerminalNode NEW() { return getToken(Parsergrammar.NEW, 0); }
		public TerminalNode BEHAVIOR_SUBJECT() { return getToken(Parsergrammar.BEHAVIOR_SUBJECT, 0); }
		public ObservableArrayContext observableArray() {
			return getRuleContext(ObservableArrayContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(Parsergrammar.LPAREN, 0); }
		public TerminalNode LBRACKET() { return getToken(Parsergrammar.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(Parsergrammar.RBRACKET, 0); }
		public TerminalNode RPAREN() { return getToken(Parsergrammar.RPAREN, 0); }
		public List<Arraybody1Context> arraybody1() {
			return getRuleContexts(Arraybody1Context.class);
		}
		public Arraybody1Context arraybody1(int i) {
			return getRuleContext(Arraybody1Context.class,i);
		}
		public TerminalNode SEMICOLON() { return getToken(Parsergrammar.SEMICOLON, 0); }
		public ArrayExpression3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayExpression3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterArrayExpression3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitArrayExpression3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitArrayExpression3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayExpression3Context arrayExpression3() throws RecognitionException {
		ArrayExpression3Context _localctx = new ArrayExpression3Context(_ctx, getState());
		enterRule(_localctx, 52, RULE_arrayExpression3);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			signature();
			setState(393);
			match(ASSIGN);
			setState(394);
			match(NEW);
			setState(395);
			match(BEHAVIOR_SUBJECT);
			setState(396);
			observableArray();
			setState(397);
			match(LPAREN);
			setState(398);
			match(LBRACKET);
			setState(402);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 38)) & ~0x3f) == 0 && ((1L << (_la - 38)) & 234881025L) != 0)) {
				{
				{
				setState(399);
				arraybody1();
				}
				}
				setState(404);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(405);
			match(RBRACKET);
			setState(406);
			match(RPAREN);
			setState(408);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(407);
				match(SEMICOLON);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstructorDeclarationContext extends ParserRuleContext {
		public TerminalNode CONSTRUCTOR() { return getToken(Parsergrammar.CONSTRUCTOR, 0); }
		public TerminalNode LPAREN() { return getToken(Parsergrammar.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Parsergrammar.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(Parsergrammar.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(Parsergrammar.RBRACE, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(Parsergrammar.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(Parsergrammar.IDENTIFIER, i);
		}
		public List<TerminalNode> COLON() { return getTokens(Parsergrammar.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(Parsergrammar.COLON, i);
		}
		public List<TerminalNode> ACCESS() { return getTokens(Parsergrammar.ACCESS); }
		public TerminalNode ACCESS(int i) {
			return getToken(Parsergrammar.ACCESS, i);
		}
		public TerminalNode COMMA() { return getToken(Parsergrammar.COMMA, 0); }
		public TerminalNode ROUTER() { return getToken(Parsergrammar.ROUTER, 0); }
		public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitConstructorDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitConstructorDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			match(CONSTRUCTOR);
			setState(411);
			match(LPAREN);
			setState(425);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ACCESS || _la==IDENTIFIER) {
				{
				setState(413);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ACCESS) {
					{
					setState(412);
					match(ACCESS);
					}
				}

				setState(415);
				match(IDENTIFIER);
				setState(416);
				match(COLON);
				setState(417);
				match(IDENTIFIER);
				setState(423);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(418);
					match(COMMA);
					setState(419);
					match(ACCESS);
					setState(420);
					match(IDENTIFIER);
					setState(421);
					match(COLON);
					setState(422);
					match(ROUTER);
					}
				}

				}
			}

			setState(427);
			match(RPAREN);
			setState(428);
			match(LBRACE);
			setState(429);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclarationContext extends ParserRuleContext {
		public SignatureContext signature() {
			return getRuleContext(SignatureContext.class,0);
		}
		public TerminalNode COLON() { return getToken(Parsergrammar.COLON, 0); }
		public TerminalNode TYPE() { return getToken(Parsergrammar.TYPE, 0); }
		public TerminalNode ASSIGN() { return getToken(Parsergrammar.ASSIGN, 0); }
		public ValuesContext values() {
			return getRuleContext(ValuesContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(Parsergrammar.SEMICOLON, 0); }
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
			signature();
			setState(432);
			match(COLON);
			setState(433);
			match(TYPE);
			setState(434);
			match(ASSIGN);
			setState(435);
			values();
			setState(436);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableAssignContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(Parsergrammar.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(Parsergrammar.ASSIGN, 0); }
		public ValuesContext values() {
			return getRuleContext(ValuesContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(Parsergrammar.SEMICOLON, 0); }
		public VariableAssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableAssign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterVariableAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitVariableAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitVariableAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableAssignContext variableAssign() throws RecognitionException {
		VariableAssignContext _localctx = new VariableAssignContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_variableAssign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(438);
			match(IDENTIFIER);
			setState(439);
			match(ASSIGN);
			setState(440);
			values();
			setState(441);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MethodvoidContext extends ParserRuleContext {
		public SignatureContext signature() {
			return getRuleContext(SignatureContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(Parsergrammar.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Parsergrammar.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(Parsergrammar.LBRACE, 0); }
		public MethodvoidbodyContext methodvoidbody() {
			return getRuleContext(MethodvoidbodyContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(Parsergrammar.RBRACE, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TerminalNode COLON() { return getToken(Parsergrammar.COLON, 0); }
		public TerminalNode VOIDTYPE() { return getToken(Parsergrammar.VOIDTYPE, 0); }
		public MethodvoidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodvoid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterMethodvoid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitMethodvoid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitMethodvoid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodvoidContext methodvoid() throws RecognitionException {
		MethodvoidContext _localctx = new MethodvoidContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_methodvoid);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(443);
			signature();
			setState(444);
			match(LPAREN);
			setState(446);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(445);
				parameters();
				}
			}

			setState(448);
			match(RPAREN);
			setState(451);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(449);
				match(COLON);
				setState(450);
				match(VOIDTYPE);
				}
			}

			setState(453);
			match(LBRACE);
			setState(454);
			methodvoidbody();
			setState(455);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MethodvoidbodyContext extends ParserRuleContext {
		public List<TerminalNode> THIS() { return getTokens(Parsergrammar.THIS); }
		public TerminalNode THIS(int i) {
			return getToken(Parsergrammar.THIS, i);
		}
		public List<TerminalNode> DOT() { return getTokens(Parsergrammar.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(Parsergrammar.DOT, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(Parsergrammar.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(Parsergrammar.IDENTIFIER, i);
		}
		public List<TerminalNode> DOLLAR_SIGN() { return getTokens(Parsergrammar.DOLLAR_SIGN); }
		public TerminalNode DOLLAR_SIGN(int i) {
			return getToken(Parsergrammar.DOLLAR_SIGN, i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(Parsergrammar.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(Parsergrammar.ASSIGN, i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(Parsergrammar.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(Parsergrammar.SEMICOLON, i);
		}
		public List<CrudBodyContext> crudBody() {
			return getRuleContexts(CrudBodyContext.class);
		}
		public CrudBodyContext crudBody(int i) {
			return getRuleContext(CrudBodyContext.class,i);
		}
		public List<NextCallContext> nextCall() {
			return getRuleContexts(NextCallContext.class);
		}
		public NextCallContext nextCall(int i) {
			return getRuleContext(NextCallContext.class,i);
		}
		public List<TerminalNode> LBRACE() { return getTokens(Parsergrammar.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(Parsergrammar.LBRACE, i);
		}
		public List<TerminalNode> THREE_DOTS() { return getTokens(Parsergrammar.THREE_DOTS); }
		public TerminalNode THREE_DOTS(int i) {
			return getToken(Parsergrammar.THREE_DOTS, i);
		}
		public List<TerminalNode> RBRACE() { return getTokens(Parsergrammar.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(Parsergrammar.RBRACE, i);
		}
		public List<TerminalNode> STATIC() { return getTokens(Parsergrammar.STATIC); }
		public TerminalNode STATIC(int i) {
			return getToken(Parsergrammar.STATIC, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Parsergrammar.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Parsergrammar.COMMA, i);
		}
		public List<TerminalNode> COLON() { return getTokens(Parsergrammar.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(Parsergrammar.COLON, i);
		}
		public List<TerminalNode> DATE() { return getTokens(Parsergrammar.DATE); }
		public TerminalNode DATE(int i) {
			return getToken(Parsergrammar.DATE, i);
		}
		public List<MethodcallContext> methodcall() {
			return getRuleContexts(MethodcallContext.class);
		}
		public MethodcallContext methodcall(int i) {
			return getRuleContext(MethodcallContext.class,i);
		}
		public List<TerminalNode> IF() { return getTokens(Parsergrammar.IF); }
		public TerminalNode IF(int i) {
			return getToken(Parsergrammar.IF, i);
		}
		public List<TerminalNode> LPAREN() { return getTokens(Parsergrammar.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(Parsergrammar.LPAREN, i);
		}
		public List<TerminalNode> QUESTION_MARK() { return getTokens(Parsergrammar.QUESTION_MARK); }
		public TerminalNode QUESTION_MARK(int i) {
			return getToken(Parsergrammar.QUESTION_MARK, i);
		}
		public List<TerminalNode> THREE_ASSIGN() { return getTokens(Parsergrammar.THREE_ASSIGN); }
		public TerminalNode THREE_ASSIGN(int i) {
			return getToken(Parsergrammar.THREE_ASSIGN, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(Parsergrammar.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(Parsergrammar.RPAREN, i);
		}
		public List<ValuesContext> values() {
			return getRuleContexts(ValuesContext.class);
		}
		public ValuesContext values(int i) {
			return getRuleContext(ValuesContext.class,i);
		}
		public MethodvoidbodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodvoidbody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterMethodvoidbody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitMethodvoidbody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitMethodvoidbody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodvoidbodyContext methodvoidbody() throws RecognitionException {
		MethodvoidbodyContext _localctx = new MethodvoidbodyContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_methodvoidbody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(552);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -9221120099601088512L) != 0)) {
				{
				setState(550);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
				case 1:
					{
					{
					setState(457);
					match(THIS);
					setState(458);
					match(DOT);
					setState(459);
					match(IDENTIFIER);
					setState(460);
					match(DOLLAR_SIGN);
					setState(461);
					match(ASSIGN);
					setState(462);
					match(THIS);
					setState(463);
					match(DOT);
					setState(464);
					match(IDENTIFIER);
					setState(465);
					match(DOT);
					setState(466);
					match(IDENTIFIER);
					setState(467);
					match(DOLLAR_SIGN);
					setState(468);
					match(SEMICOLON);
					}
					}
					break;
				case 2:
					{
					{
					setState(469);
					match(THIS);
					setState(470);
					match(DOT);
					setState(471);
					match(IDENTIFIER);
					setState(472);
					match(ASSIGN);
					setState(475);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case IDENTIFIER:
						{
						setState(473);
						match(IDENTIFIER);
						}
						break;
					case NULL:
					case BOOLEAN:
					case NUMBER:
					case STRING_LITERAL:
						{
						setState(474);
						values();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(477);
					match(SEMICOLON);
					}
					}
					break;
				case 3:
					{
					{
					setState(480);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==THIS) {
						{
						setState(478);
						match(THIS);
						setState(479);
						match(DOT);
						}
					}

					setState(482);
					match(IDENTIFIER);
					setState(491);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case ASSIGN:
						{
						{
						setState(483);
						match(ASSIGN);
						setState(484);
						match(THIS);
						setState(485);
						match(DOT);
						setState(486);
						match(IDENTIFIER);
						{
						setState(487);
						match(DOT);
						setState(488);
						methodcall();
						}
						}
						}
						break;
					case DOT:
						{
						{
						setState(489);
						match(DOT);
						setState(490);
						methodcall();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(493);
					match(SEMICOLON);
					}
					}
					break;
				case 4:
					{
					{
					setState(495);
					crudBody();
					setState(496);
					nextCall();
					setState(497);
					match(SEMICOLON);
					}
					}
					break;
				case 5:
					{
					{
					setState(499);
					match(THIS);
					setState(500);
					match(DOT);
					setState(501);
					match(IDENTIFIER);
					setState(502);
					match(ASSIGN);
					setState(503);
					match(LBRACE);
					setState(504);
					match(THREE_DOTS);
					setState(505);
					match(IDENTIFIER);
					setState(506);
					match(RBRACE);
					setState(507);
					match(SEMICOLON);
					}
					}
					break;
				case 6:
					{
					{
					setState(508);
					match(STATIC);
					setState(509);
					match(IDENTIFIER);
					setState(510);
					match(ASSIGN);
					setState(511);
					match(LBRACE);
					setState(512);
					match(THREE_DOTS);
					setState(513);
					match(THIS);
					setState(514);
					match(DOT);
					setState(515);
					match(IDENTIFIER);
					setState(516);
					match(COMMA);
					setState(517);
					match(IDENTIFIER);
					setState(518);
					match(COLON);
					setState(519);
					match(DATE);
					setState(520);
					match(DOT);
					setState(521);
					methodcall();
					setState(522);
					match(RBRACE);
					setState(523);
					match(SEMICOLON);
					}
					}
					break;
				case 7:
					{
					{
					setState(525);
					match(IF);
					setState(526);
					match(LPAREN);
					setState(527);
					match(THIS);
					setState(528);
					match(DOT);
					setState(529);
					match(IDENTIFIER);
					setState(530);
					match(QUESTION_MARK);
					setState(531);
					match(DOT);
					setState(532);
					match(IDENTIFIER);
					setState(533);
					match(THREE_ASSIGN);
					setState(534);
					match(IDENTIFIER);
					setState(535);
					match(RPAREN);
					setState(536);
					match(LBRACE);
					setState(544); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(537);
						match(THIS);
						setState(538);
						match(DOT);
						setState(539);
						match(IDENTIFIER);
						setState(540);
						match(ASSIGN);
						setState(541);
						values();
						setState(542);
						match(SEMICOLON);
						}
						}
						setState(546); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==THIS );
					setState(548);
					match(RBRACE);
					}
					}
					break;
				}
				}
				setState(554);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MethodcallContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(Parsergrammar.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Parsergrammar.RPAREN, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(Parsergrammar.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(Parsergrammar.IDENTIFIER, i);
		}
		public TerminalNode NAVIGATE() { return getToken(Parsergrammar.NAVIGATE, 0); }
		public TerminalNode NOW() { return getToken(Parsergrammar.NOW, 0); }
		public TerminalNode LBRACKET() { return getToken(Parsergrammar.LBRACKET, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(Parsergrammar.STRING_LITERAL, 0); }
		public TerminalNode RBRACKET() { return getToken(Parsergrammar.RBRACKET, 0); }
		public TerminalNode THIS() { return getToken(Parsergrammar.THIS, 0); }
		public TerminalNode DOT() { return getToken(Parsergrammar.DOT, 0); }
		public MethodcallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodcall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterMethodcall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitMethodcall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitMethodcall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodcallContext methodcall() throws RecognitionException {
		MethodcallContext _localctx = new MethodcallContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_methodcall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(555);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & -9223371968068190208L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(556);
			match(LPAREN);
			setState(565);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case THIS:
			case IDENTIFIER:
				{
				setState(559);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==THIS) {
					{
					setState(557);
					match(THIS);
					setState(558);
					match(DOT);
					}
				}

				setState(561);
				match(IDENTIFIER);
				}
				break;
			case LBRACKET:
				{
				{
				setState(562);
				match(LBRACKET);
				setState(563);
				match(STRING_LITERAL);
				setState(564);
				match(RBRACKET);
				}
				}
				break;
			case RPAREN:
				break;
			default:
				break;
			}
			setState(567);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NgOnInitMETHODContext extends ParserRuleContext {
		public TerminalNode NGONINIT() { return getToken(Parsergrammar.NGONINIT, 0); }
		public TerminalNode LPAREN() { return getToken(Parsergrammar.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Parsergrammar.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(Parsergrammar.LBRACE, 0); }
		public MethodvoidbodyContext methodvoidbody() {
			return getRuleContext(MethodvoidbodyContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(Parsergrammar.RBRACE, 0); }
		public TerminalNode ACCESS() { return getToken(Parsergrammar.ACCESS, 0); }
		public TerminalNode COLON() { return getToken(Parsergrammar.COLON, 0); }
		public TerminalNode VOIDTYPE() { return getToken(Parsergrammar.VOIDTYPE, 0); }
		public NgOnInitMETHODContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ngOnInitMETHOD; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterNgOnInitMETHOD(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitNgOnInitMETHOD(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitNgOnInitMETHOD(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NgOnInitMETHODContext ngOnInitMETHOD() throws RecognitionException {
		NgOnInitMETHODContext _localctx = new NgOnInitMETHODContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_ngOnInitMETHOD);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(570);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ACCESS) {
				{
				setState(569);
				match(ACCESS);
				}
			}

			setState(572);
			match(NGONINIT);
			setState(573);
			match(LPAREN);
			setState(574);
			match(RPAREN);
			setState(577);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(575);
				match(COLON);
				setState(576);
				match(VOIDTYPE);
				}
			}

			setState(579);
			match(LBRACE);
			setState(580);
			methodvoidbody();
			setState(581);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SignalDeclarationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(Parsergrammar.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(Parsergrammar.ASSIGN, 0); }
		public TerminalNode CROISNN() { return getToken(Parsergrammar.CROISNN, 0); }
		public TerminalNode LPAREN() { return getToken(Parsergrammar.LPAREN, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(Parsergrammar.STRING_LITERAL, 0); }
		public TerminalNode RPAREN() { return getToken(Parsergrammar.RPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(Parsergrammar.SEMICOLON, 0); }
		public SignalDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signalDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterSignalDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitSignalDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitSignalDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SignalDeclarationContext signalDeclaration() throws RecognitionException {
		SignalDeclarationContext _localctx = new SignalDeclarationContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_signalDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(583);
			match(IDENTIFIER);
			setState(584);
			match(ASSIGN);
			setState(585);
			match(CROISNN);
			setState(586);
			match(LPAREN);
			setState(587);
			match(STRING_LITERAL);
			setState(588);
			match(RPAREN);
			setState(589);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CrudBodyContext extends ParserRuleContext {
		public TerminalNode THIS() { return getToken(Parsergrammar.THIS, 0); }
		public List<TerminalNode> DOT() { return getTokens(Parsergrammar.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(Parsergrammar.DOT, i);
		}
		public TerminalNode IDENTIFIER() { return getToken(Parsergrammar.IDENTIFIER, 0); }
		public TerminalNode NEXT() { return getToken(Parsergrammar.NEXT, 0); }
		public TerminalNode VALUE() { return getToken(Parsergrammar.VALUE, 0); }
		public CrudBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_crudBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterCrudBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitCrudBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitCrudBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CrudBodyContext crudBody() throws RecognitionException {
		CrudBodyContext _localctx = new CrudBodyContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_crudBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(591);
			match(THIS);
			setState(592);
			match(DOT);
			setState(593);
			match(IDENTIFIER);
			setState(594);
			match(DOT);
			setState(595);
			_la = _input.LA(1);
			if ( !(_la==VALUE || _la==NEXT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NextCallContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(Parsergrammar.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Parsergrammar.RPAREN, 0); }
		public AddCallContext addCall() {
			return getRuleContext(AddCallContext.class,0);
		}
		public Edit_delete_callContext edit_delete_call() {
			return getRuleContext(Edit_delete_callContext.class,0);
		}
		public NextCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nextCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterNextCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitNextCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitNextCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NextCallContext nextCall() throws RecognitionException {
		NextCallContext _localctx = new NextCallContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_nextCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(597);
			match(LPAREN);
			setState(600);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACKET:
				{
				setState(598);
				addCall();
				}
				break;
			case THIS:
				{
				setState(599);
				edit_delete_call();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(602);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AddCallContext extends ParserRuleContext {
		public TerminalNode LBRACKET() { return getToken(Parsergrammar.LBRACKET, 0); }
		public TerminalNode THREE_DOTS() { return getToken(Parsergrammar.THREE_DOTS, 0); }
		public CrudBodyContext crudBody() {
			return getRuleContext(CrudBodyContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(Parsergrammar.COMMA, 0); }
		public TerminalNode IDENTIFIER() { return getToken(Parsergrammar.IDENTIFIER, 0); }
		public TerminalNode RBRACKET() { return getToken(Parsergrammar.RBRACKET, 0); }
		public AddCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterAddCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitAddCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitAddCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddCallContext addCall() throws RecognitionException {
		AddCallContext _localctx = new AddCallContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_addCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(604);
			match(LBRACKET);
			setState(605);
			match(THREE_DOTS);
			setState(606);
			crudBody();
			setState(607);
			match(COMMA);
			setState(608);
			match(IDENTIFIER);
			setState(609);
			match(RBRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Edit_delete_callContext extends ParserRuleContext {
		public CrudBodyContext crudBody() {
			return getRuleContext(CrudBodyContext.class,0);
		}
		public TerminalNode DOT() { return getToken(Parsergrammar.DOT, 0); }
		public MapContext map() {
			return getRuleContext(MapContext.class,0);
		}
		public FilterContext filter() {
			return getRuleContext(FilterContext.class,0);
		}
		public Edit_delete_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_edit_delete_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterEdit_delete_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitEdit_delete_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitEdit_delete_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Edit_delete_callContext edit_delete_call() throws RecognitionException {
		Edit_delete_callContext _localctx = new Edit_delete_callContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_edit_delete_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(611);
			crudBody();
			setState(612);
			match(DOT);
			setState(615);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAP:
				{
				setState(613);
				map();
				}
				break;
			case FILTER:
				{
				setState(614);
				filter();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MapContext extends ParserRuleContext {
		public TerminalNode MAP() { return getToken(Parsergrammar.MAP, 0); }
		public TerminalNode LPAREN() { return getToken(Parsergrammar.LPAREN, 0); }
		public LeftMapFilterAssignContext leftMapFilterAssign() {
			return getRuleContext(LeftMapFilterAssignContext.class,0);
		}
		public TerminalNode THREE_ASSIGN() { return getToken(Parsergrammar.THREE_ASSIGN, 0); }
		public RightMapFilterAssignContext rightMapFilterAssign() {
			return getRuleContext(RightMapFilterAssignContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Parsergrammar.RPAREN, 0); }
		public MapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_map; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterMap(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitMap(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitMap(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapContext map() throws RecognitionException {
		MapContext _localctx = new MapContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_map);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(617);
			match(MAP);
			setState(618);
			match(LPAREN);
			setState(619);
			leftMapFilterAssign();
			setState(620);
			match(THREE_ASSIGN);
			setState(621);
			rightMapFilterAssign();
			setState(622);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FilterContext extends ParserRuleContext {
		public TerminalNode FILTER() { return getToken(Parsergrammar.FILTER, 0); }
		public TerminalNode LPAREN() { return getToken(Parsergrammar.LPAREN, 0); }
		public LeftMapFilterAssignContext leftMapFilterAssign() {
			return getRuleContext(LeftMapFilterAssignContext.class,0);
		}
		public TerminalNode NOT_THREE_ASSIGN() { return getToken(Parsergrammar.NOT_THREE_ASSIGN, 0); }
		public RightMapFilterAssignContext rightMapFilterAssign() {
			return getRuleContext(RightMapFilterAssignContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Parsergrammar.RPAREN, 0); }
		public FilterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterFilter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitFilter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitFilter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilterContext filter() throws RecognitionException {
		FilterContext _localctx = new FilterContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_filter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(624);
			match(FILTER);
			setState(625);
			match(LPAREN);
			setState(626);
			leftMapFilterAssign();
			setState(627);
			match(NOT_THREE_ASSIGN);
			setState(628);
			rightMapFilterAssign();
			setState(629);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LeftMapFilterAssignContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(Parsergrammar.IDENTIFIER, 0); }
		public TerminalNode ASSIGN_TAG() { return getToken(Parsergrammar.ASSIGN_TAG, 0); }
		public MapFilterIDENTIFIERContext mapFilterIDENTIFIER() {
			return getRuleContext(MapFilterIDENTIFIERContext.class,0);
		}
		public LeftMapFilterAssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leftMapFilterAssign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterLeftMapFilterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitLeftMapFilterAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitLeftMapFilterAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LeftMapFilterAssignContext leftMapFilterAssign() throws RecognitionException {
		LeftMapFilterAssignContext _localctx = new LeftMapFilterAssignContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_leftMapFilterAssign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(631);
			match(IDENTIFIER);
			setState(632);
			match(ASSIGN_TAG);
			setState(633);
			mapFilterIDENTIFIER();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RightMapFilterAssignContext extends ParserRuleContext {
		public List<MapFilterIDENTIFIERContext> mapFilterIDENTIFIER() {
			return getRuleContexts(MapFilterIDENTIFIERContext.class);
		}
		public MapFilterIDENTIFIERContext mapFilterIDENTIFIER(int i) {
			return getRuleContext(MapFilterIDENTIFIERContext.class,i);
		}
		public TerminalNode QUESTION_MARK() { return getToken(Parsergrammar.QUESTION_MARK, 0); }
		public TerminalNode IDENTIFIER() { return getToken(Parsergrammar.IDENTIFIER, 0); }
		public RightMapFilterAssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rightMapFilterAssign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterRightMapFilterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitRightMapFilterAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitRightMapFilterAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RightMapFilterAssignContext rightMapFilterAssign() throws RecognitionException {
		RightMapFilterAssignContext _localctx = new RightMapFilterAssignContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_rightMapFilterAssign);
		try {
			setState(640);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(635);
				mapFilterIDENTIFIER();
				setState(636);
				match(QUESTION_MARK);
				setState(637);
				mapFilterIDENTIFIER();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(639);
				match(IDENTIFIER);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MapFilterIDENTIFIERContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(Parsergrammar.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(Parsergrammar.IDENTIFIER, i);
		}
		public TerminalNode DOT() { return getToken(Parsergrammar.DOT, 0); }
		public TerminalNode COLON() { return getToken(Parsergrammar.COLON, 0); }
		public MapFilterIDENTIFIERContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapFilterIDENTIFIER; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterMapFilterIDENTIFIER(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitMapFilterIDENTIFIER(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitMapFilterIDENTIFIER(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapFilterIDENTIFIERContext mapFilterIDENTIFIER() throws RecognitionException {
		MapFilterIDENTIFIERContext _localctx = new MapFilterIDENTIFIERContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_mapFilterIDENTIFIER);
		try {
			setState(648);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(642);
				match(IDENTIFIER);
				setState(643);
				match(DOT);
				setState(644);
				match(IDENTIFIER);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(645);
				match(IDENTIFIER);
				setState(646);
				match(COLON);
				setState(647);
				match(IDENTIFIER);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AsObservableContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(Parsergrammar.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(Parsergrammar.IDENTIFIER, i);
		}
		public TerminalNode DOLLAR_SIGN() { return getToken(Parsergrammar.DOLLAR_SIGN, 0); }
		public TerminalNode ASSIGN() { return getToken(Parsergrammar.ASSIGN, 0); }
		public TerminalNode THIS() { return getToken(Parsergrammar.THIS, 0); }
		public List<TerminalNode> DOT() { return getTokens(Parsergrammar.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(Parsergrammar.DOT, i);
		}
		public MethodcallContext methodcall() {
			return getRuleContext(MethodcallContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(Parsergrammar.SEMICOLON, 0); }
		public AsObservableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asObservable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterAsObservable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitAsObservable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitAsObservable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsObservableContext asObservable() throws RecognitionException {
		AsObservableContext _localctx = new AsObservableContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_asObservable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(650);
			match(IDENTIFIER);
			setState(651);
			match(DOLLAR_SIGN);
			setState(652);
			match(ASSIGN);
			setState(653);
			match(THIS);
			setState(654);
			match(DOT);
			setState(655);
			match(IDENTIFIER);
			setState(656);
			match(DOT);
			setState(657);
			methodcall();
			setState(658);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ObservableContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(Parsergrammar.IDENTIFIER, 0); }
		public TerminalNode DOLLAR_SIGN() { return getToken(Parsergrammar.DOLLAR_SIGN, 0); }
		public TerminalNode INTERJECTION() { return getToken(Parsergrammar.INTERJECTION, 0); }
		public TerminalNode COLON() { return getToken(Parsergrammar.COLON, 0); }
		public TerminalNode OBSERVABLE() { return getToken(Parsergrammar.OBSERVABLE, 0); }
		public ObservableArrayContext observableArray() {
			return getRuleContext(ObservableArrayContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(Parsergrammar.SEMICOLON, 0); }
		public ObservableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_observable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterObservable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitObservable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitObservable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObservableContext observable() throws RecognitionException {
		ObservableContext _localctx = new ObservableContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_observable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(660);
			match(IDENTIFIER);
			setState(661);
			match(DOLLAR_SIGN);
			setState(662);
			match(INTERJECTION);
			setState(663);
			match(COLON);
			setState(664);
			match(OBSERVABLE);
			setState(665);
			observableArray();
			setState(666);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ObservableArrayContext extends ParserRuleContext {
		public TerminalNode TAG_OPEN() { return getToken(Parsergrammar.TAG_OPEN, 0); }
		public TerminalNode ANY() { return getToken(Parsergrammar.ANY, 0); }
		public TerminalNode LBRA() { return getToken(Parsergrammar.LBRA, 0); }
		public TerminalNode RBRA() { return getToken(Parsergrammar.RBRA, 0); }
		public TerminalNode TAG_CLOSE() { return getToken(Parsergrammar.TAG_CLOSE, 0); }
		public ObservableArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_observableArray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterObservableArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitObservableArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitObservableArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObservableArrayContext observableArray() throws RecognitionException {
		ObservableArrayContext _localctx = new ObservableArrayContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_observableArray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(668);
			match(TAG_OPEN);
			setState(669);
			match(ANY);
			setState(670);
			match(LBRA);
			setState(671);
			match(RBRA);
			setState(672);
			match(TAG_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssDocumentContext extends ParserRuleContext {
		public List<RuleSetContext> ruleSet() {
			return getRuleContexts(RuleSetContext.class);
		}
		public RuleSetContext ruleSet(int i) {
			return getRuleContext(RuleSetContext.class,i);
		}
		public CssDocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssDocument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterCssDocument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitCssDocument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitCssDocument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssDocumentContext cssDocument() throws RecognitionException {
		CssDocumentContext _localctx = new CssDocumentContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_cssDocument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(677);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4617315517961601024L) != 0)) {
				{
				{
				setState(674);
				ruleSet();
				}
				}
				setState(679);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelectorincssContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(Parsergrammar.IDENTIFIER, 0); }
		public TerminalNode DOT() { return getToken(Parsergrammar.DOT, 0); }
		public TerminalNode HASH() { return getToken(Parsergrammar.HASH, 0); }
		public TerminalNode TAGSFORCSS() { return getToken(Parsergrammar.TAGSFORCSS, 0); }
		public SelectorincssContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectorincss; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterSelectorincss(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitSelectorincss(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitSelectorincss(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorincssContext selectorincss() throws RecognitionException {
		SelectorincssContext _localctx = new SelectorincssContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_selectorincss);
		int _la;
		try {
			setState(683);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOT:
			case HASH:
				enterOuterAlt(_localctx, 1);
				{
				setState(680);
				_la = _input.LA(1);
				if ( !(_la==DOT || _la==HASH) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(681);
				match(IDENTIFIER);
				}
				break;
			case TAGSFORCSS:
				enterOuterAlt(_localctx, 2);
				{
				setState(682);
				match(TAGSFORCSS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleSetStartContext extends ParserRuleContext {
		public SelectorincssContext first;
		public SelectorincssContext selectorincss() {
			return getRuleContext(SelectorincssContext.class,0);
		}
		public List<TerminalNode> TAGSFORCSS() { return getTokens(Parsergrammar.TAGSFORCSS); }
		public TerminalNode TAGSFORCSS(int i) {
			return getToken(Parsergrammar.TAGSFORCSS, i);
		}
		public List<TerminalNode> WS() { return getTokens(Parsergrammar.WS); }
		public TerminalNode WS(int i) {
			return getToken(Parsergrammar.WS, i);
		}
		public RuleSetStartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleSetStart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterRuleSetStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitRuleSetStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitRuleSetStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RuleSetStartContext ruleSetStart() throws RecognitionException {
		RuleSetStartContext _localctx = new RuleSetStartContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_ruleSetStart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(685);
			((RuleSetStartContext)_localctx).first = selectorincss();
			setState(695);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TAGSFORCSS || _la==WS) {
				{
				{
				setState(689);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WS) {
					{
					{
					setState(686);
					match(WS);
					}
					}
					setState(691);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(692);
				match(TAGSFORCSS);
				}
				}
				setState(697);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleSetContext extends ParserRuleContext {
		public RuleSetStartContext ruleSetStart() {
			return getRuleContext(RuleSetStartContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(Parsergrammar.LBRACE, 0); }
		public DeclarationListContext declarationList() {
			return getRuleContext(DeclarationListContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(Parsergrammar.RBRACE, 0); }
		public RuleSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleSet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterRuleSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitRuleSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitRuleSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RuleSetContext ruleSet() throws RecognitionException {
		RuleSetContext _localctx = new RuleSetContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_ruleSet);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(698);
			ruleSetStart();
			setState(699);
			match(LBRACE);
			setState(700);
			declarationList();
			setState(701);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationListContext extends ParserRuleContext {
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(Parsergrammar.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(Parsergrammar.SEMICOLON, i);
		}
		public DeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterDeclarationList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitDeclarationList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitDeclarationList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationListContext declarationList() throws RecognitionException {
		DeclarationListContext _localctx = new DeclarationListContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_declarationList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(703);
			declaration();
			setState(708);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(704);
					match(SEMICOLON);
					setState(705);
					declaration();
					}
					} 
				}
				setState(710);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			}
			setState(712);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(711);
				match(SEMICOLON);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationContext extends ParserRuleContext {
		public TerminalNode PROPERTY_NAME() { return getToken(Parsergrammar.PROPERTY_NAME, 0); }
		public TerminalNode COLON() { return getToken(Parsergrammar.COLON, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(714);
			match(PROPERTY_NAME);
			setState(715);
			match(COLON);
			setState(716);
			value();
			setState(723);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				{
				setState(720);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & 181L) != 0)) {
					{
					{
					setState(717);
					value();
					}
					}
					setState(722);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValueContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(Parsergrammar.NUMBER, 0); }
		public TerminalNode UNIT() { return getToken(Parsergrammar.UNIT, 0); }
		public TerminalNode COLOR() { return getToken(Parsergrammar.COLOR, 0); }
		public TerminalNode STRING() { return getToken(Parsergrammar.STRING, 0); }
		public TerminalNode VALUE_KEYWORD() { return getToken(Parsergrammar.VALUE_KEYWORD, 0); }
		public TerminalNode IDENTIFIER() { return getToken(Parsergrammar.IDENTIFIER, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_value);
		int _la;
		try {
			setState(733);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(725);
				match(NUMBER);
				setState(727);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==UNIT) {
					{
					setState(726);
					match(UNIT);
					}
				}

				}
				break;
			case COLOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(729);
				match(COLOR);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(730);
				match(STRING);
				}
				break;
			case VALUE_KEYWORD:
				enterOuterAlt(_localctx, 4);
				{
				setState(731);
				match(VALUE_KEYWORD);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 5);
				{
				setState(732);
				match(IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlDocumentContext extends ParserRuleContext {
		public List<ScriptletOrSeaWsContext> scriptletOrSeaWs() {
			return getRuleContexts(ScriptletOrSeaWsContext.class);
		}
		public ScriptletOrSeaWsContext scriptletOrSeaWs(int i) {
			return getRuleContext(ScriptletOrSeaWsContext.class,i);
		}
		public TerminalNode XML() { return getToken(Parsergrammar.XML, 0); }
		public TerminalNode DTD() { return getToken(Parsergrammar.DTD, 0); }
		public List<HtmlElementsContext> htmlElements() {
			return getRuleContexts(HtmlElementsContext.class);
		}
		public HtmlElementsContext htmlElements(int i) {
			return getRuleContext(HtmlElementsContext.class,i);
		}
		public HtmlDocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlDocument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterHtmlDocument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitHtmlDocument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitHtmlDocument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlDocumentContext htmlDocument() throws RecognitionException {
		HtmlDocumentContext _localctx = new HtmlDocumentContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_htmlDocument);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(738);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(735);
					scriptletOrSeaWs();
					}
					} 
				}
				setState(740);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			}
			setState(742);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==XML) {
				{
				setState(741);
				match(XML);
				}
			}

			setState(747);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(744);
					scriptletOrSeaWs();
					}
					} 
				}
				setState(749);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			}
			setState(751);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DTD) {
				{
				setState(750);
				match(DTD);
				}
			}

			setState(756);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(753);
					scriptletOrSeaWs();
					}
					} 
				}
				setState(758);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			}
			setState(762);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & 327L) != 0)) {
				{
				{
				setState(759);
				htmlElements();
				}
				}
				setState(764);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ScriptletOrSeaWsContext extends ParserRuleContext {
		public TerminalNode SCRIPTLET() { return getToken(Parsergrammar.SCRIPTLET, 0); }
		public TerminalNode WS() { return getToken(Parsergrammar.WS, 0); }
		public ScriptletOrSeaWsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scriptletOrSeaWs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterScriptletOrSeaWs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitScriptletOrSeaWs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitScriptletOrSeaWs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScriptletOrSeaWsContext scriptletOrSeaWs() throws RecognitionException {
		ScriptletOrSeaWsContext _localctx = new ScriptletOrSeaWsContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_scriptletOrSeaWs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(765);
			_la = _input.LA(1);
			if ( !(_la==WS || _la==SCRIPTLET) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlElementsContext extends ParserRuleContext {
		public HtmlElementContext htmlElement() {
			return getRuleContext(HtmlElementContext.class,0);
		}
		public List<HtmlCommentContext> htmlComment() {
			return getRuleContexts(HtmlCommentContext.class);
		}
		public HtmlCommentContext htmlComment(int i) {
			return getRuleContext(HtmlCommentContext.class,i);
		}
		public HtmlElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlElements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterHtmlElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitHtmlElements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitHtmlElements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlElementsContext htmlElements() throws RecognitionException {
		HtmlElementsContext _localctx = new HtmlElementsContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_htmlElements);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(770);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==HTML_COMMENT || _la==HTML_CONDITIONAL_COMMENT) {
				{
				{
				setState(767);
				htmlComment();
				}
				}
				setState(772);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(773);
			htmlElement();
			setState(777);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(774);
					htmlComment();
					}
					} 
				}
				setState(779);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlElementContext extends ParserRuleContext {
		public HtmlElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlElement; }
	 
		public HtmlElementContext() { }
		public void copyFrom(HtmlElementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NoEndTagElementContext extends HtmlElementContext {
		public NoEndTagContext noEndTag() {
			return getRuleContext(NoEndTagContext.class,0);
		}
		public NoEndTagElementContext(HtmlElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterNoEndTagElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitNoEndTagElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitNoEndTagElement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NormalTagElementContext extends HtmlElementContext {
		public NormalTagContext normalTag() {
			return getRuleContext(NormalTagContext.class,0);
		}
		public NormalTagElementContext(HtmlElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterNormalTagElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitNormalTagElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitNormalTagElement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InterpolationElementContext extends HtmlElementContext {
		public TerminalNode INTERPOLATION() { return getToken(Parsergrammar.INTERPOLATION, 0); }
		public InterpolationElementContext(HtmlElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterInterpolationElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitInterpolationElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitInterpolationElement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TsTagElementContext extends HtmlElementContext {
		public TsTagContext tsTag() {
			return getRuleContext(TsTagContext.class,0);
		}
		public TsTagElementContext(HtmlElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterTsTagElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitTsTagElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitTsTagElement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ScriptletElementContext extends HtmlElementContext {
		public TerminalNode SCRIPTLET() { return getToken(Parsergrammar.SCRIPTLET, 0); }
		public ScriptletElementContext(HtmlElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterScriptletElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitScriptletElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitScriptletElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlElementContext htmlElement() throws RecognitionException {
		HtmlElementContext _localctx = new HtmlElementContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_htmlElement);
		try {
			setState(785);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				_localctx = new TsTagElementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(780);
				tsTag();
				}
				break;
			case 2:
				_localctx = new NoEndTagElementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(781);
				noEndTag();
				}
				break;
			case 3:
				_localctx = new NormalTagElementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(782);
				normalTag();
				}
				break;
			case 4:
				_localctx = new ScriptletElementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(783);
				match(SCRIPTLET);
				}
				break;
			case 5:
				_localctx = new InterpolationElementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(784);
				match(INTERPOLATION);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TsTagContext extends ParserRuleContext {
		public TerminalNode TAG_OPEN() { return getToken(Parsergrammar.TAG_OPEN, 0); }
		public TerminalNode TAG_NAME() { return getToken(Parsergrammar.TAG_NAME, 0); }
		public TerminalNode TAG_SLASH_CLOSE() { return getToken(Parsergrammar.TAG_SLASH_CLOSE, 0); }
		public List<HtmlAttributeContext> htmlAttribute() {
			return getRuleContexts(HtmlAttributeContext.class);
		}
		public HtmlAttributeContext htmlAttribute(int i) {
			return getRuleContext(HtmlAttributeContext.class,i);
		}
		public TsTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tsTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterTsTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitTsTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitTsTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TsTagContext tsTag() throws RecognitionException {
		TsTagContext _localctx = new TsTagContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_tsTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(787);
			match(TAG_OPEN);
			setState(788);
			match(TAG_NAME);
			setState(792);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & 15L) != 0)) {
				{
				{
				setState(789);
				htmlAttribute();
				}
				}
				setState(794);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(795);
			match(TAG_SLASH_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NoEndTagContext extends ParserRuleContext {
		public TerminalNode TAG_OPEN() { return getToken(Parsergrammar.TAG_OPEN, 0); }
		public TerminalNode TAGS_VOID() { return getToken(Parsergrammar.TAGS_VOID, 0); }
		public TerminalNode TAG_SLASH_CLOSE() { return getToken(Parsergrammar.TAG_SLASH_CLOSE, 0); }
		public TerminalNode TAG_CLOSE() { return getToken(Parsergrammar.TAG_CLOSE, 0); }
		public List<HtmlAttributeContext> htmlAttribute() {
			return getRuleContexts(HtmlAttributeContext.class);
		}
		public HtmlAttributeContext htmlAttribute(int i) {
			return getRuleContext(HtmlAttributeContext.class,i);
		}
		public TerminalNode REQUIRED() { return getToken(Parsergrammar.REQUIRED, 0); }
		public NoEndTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noEndTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterNoEndTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitNoEndTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitNoEndTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NoEndTagContext noEndTag() throws RecognitionException {
		NoEndTagContext _localctx = new NoEndTagContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_noEndTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(797);
			match(TAG_OPEN);
			setState(798);
			match(TAGS_VOID);
			setState(802);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & 15L) != 0)) {
				{
				{
				setState(799);
				htmlAttribute();
				}
				}
				setState(804);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(806);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==REQUIRED) {
				{
				setState(805);
				match(REQUIRED);
				}
			}

			setState(808);
			_la = _input.LA(1);
			if ( !(_la==TAG_CLOSE || _la==TAG_SLASH_CLOSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NormalTagContext extends ParserRuleContext {
		public TerminalNode TAG_OPEN() { return getToken(Parsergrammar.TAG_OPEN, 0); }
		public List<TerminalNode> TAGS() { return getTokens(Parsergrammar.TAGS); }
		public TerminalNode TAGS(int i) {
			return getToken(Parsergrammar.TAGS, i);
		}
		public List<TerminalNode> TAG_CLOSE() { return getTokens(Parsergrammar.TAG_CLOSE); }
		public TerminalNode TAG_CLOSE(int i) {
			return getToken(Parsergrammar.TAG_CLOSE, i);
		}
		public TerminalNode TAG_OPEN_SLASH() { return getToken(Parsergrammar.TAG_OPEN_SLASH, 0); }
		public List<HtmlAttributeContext> htmlAttribute() {
			return getRuleContexts(HtmlAttributeContext.class);
		}
		public HtmlAttributeContext htmlAttribute(int i) {
			return getRuleContext(HtmlAttributeContext.class,i);
		}
		public HtmlContentContext htmlContent() {
			return getRuleContext(HtmlContentContext.class,0);
		}
		public NormalTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterNormalTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitNormalTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitNormalTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NormalTagContext normalTag() throws RecognitionException {
		NormalTagContext _localctx = new NormalTagContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_normalTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(810);
			match(TAG_OPEN);
			setState(811);
			match(TAGS);
			setState(815);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & 15L) != 0)) {
				{
				{
				setState(812);
				htmlAttribute();
				}
				}
				setState(817);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(818);
			match(TAG_CLOSE);
			setState(820);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				{
				setState(819);
				htmlContent();
				}
				break;
			}
			setState(822);
			match(TAG_OPEN_SLASH);
			setState(823);
			match(TAGS);
			setState(824);
			match(TAG_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlContentContext extends ParserRuleContext {
		public List<HtmlContentStatementContext> htmlContentStatement() {
			return getRuleContexts(HtmlContentStatementContext.class);
		}
		public HtmlContentStatementContext htmlContentStatement(int i) {
			return getRuleContext(HtmlContentStatementContext.class,i);
		}
		public HtmlContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterHtmlContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitHtmlContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitHtmlContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlContentContext htmlContent() throws RecognitionException {
		HtmlContentContext _localctx = new HtmlContentContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_htmlContent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(829);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & 142211199533057L) != 0)) {
				{
				{
				setState(826);
				htmlContentStatement();
				}
				}
				setState(831);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlContentStatementContext extends ParserRuleContext {
		public HtmlContentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlContentStatement; }
	 
		public HtmlContentStatementContext() { }
		public void copyFrom(HtmlContentStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlColonStatementContext extends HtmlContentStatementContext {
		public TerminalNode COLON() { return getToken(Parsergrammar.COLON, 0); }
		public HtmlColonStatementContext(HtmlContentStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterHtmlColonStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitHtmlColonStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitHtmlColonStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlScriptletStatementContext extends HtmlContentStatementContext {
		public TerminalNode SCRIPTLET() { return getToken(Parsergrammar.SCRIPTLET, 0); }
		public HtmlScriptletStatementContext(HtmlContentStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterHtmlScriptletStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitHtmlScriptletStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitHtmlScriptletStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlCommentStatementContext extends HtmlContentStatementContext {
		public HtmlCommentContext htmlComment() {
			return getRuleContext(HtmlCommentContext.class,0);
		}
		public HtmlCommentStatementContext(HtmlContentStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterHtmlCommentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitHtmlCommentStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitHtmlCommentStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlElementStatementContext extends HtmlContentStatementContext {
		public HtmlElementContext htmlElement() {
			return getRuleContext(HtmlElementContext.class,0);
		}
		public HtmlElementStatementContext(HtmlContentStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterHtmlElementStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitHtmlElementStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitHtmlElementStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlCDataStatementContext extends HtmlContentStatementContext {
		public TerminalNode CDATA() { return getToken(Parsergrammar.CDATA, 0); }
		public HtmlCDataStatementContext(HtmlContentStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterHtmlCDataStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitHtmlCDataStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitHtmlCDataStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlCharDataStatementContext extends HtmlContentStatementContext {
		public HtmlChardataContext htmlChardata() {
			return getRuleContext(HtmlChardataContext.class,0);
		}
		public HtmlCharDataStatementContext(HtmlContentStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterHtmlCharDataStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitHtmlCharDataStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitHtmlCharDataStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlIdentifierStatementContext extends HtmlContentStatementContext {
		public TerminalNode IDENTIFIER() { return getToken(Parsergrammar.IDENTIFIER, 0); }
		public HtmlIdentifierStatementContext(HtmlContentStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterHtmlIdentifierStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitHtmlIdentifierStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitHtmlIdentifierStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlContentStatementContext htmlContentStatement() throws RecognitionException {
		HtmlContentStatementContext _localctx = new HtmlContentStatementContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_htmlContentStatement);
		try {
			setState(839);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				_localctx = new HtmlCharDataStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(832);
				htmlChardata();
				}
				break;
			case 2:
				_localctx = new HtmlElementStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(833);
				htmlElement();
				}
				break;
			case 3:
				_localctx = new HtmlCDataStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(834);
				match(CDATA);
				}
				break;
			case 4:
				_localctx = new HtmlCommentStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(835);
				htmlComment();
				}
				break;
			case 5:
				_localctx = new HtmlScriptletStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(836);
				match(SCRIPTLET);
				}
				break;
			case 6:
				_localctx = new HtmlIdentifierStatementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(837);
				match(IDENTIFIER);
				}
				break;
			case 7:
				_localctx = new HtmlColonStatementContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(838);
				match(COLON);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlChardataContext extends ParserRuleContext {
		public TerminalNode HTML_TEXT() { return getToken(Parsergrammar.HTML_TEXT, 0); }
		public TerminalNode WS() { return getToken(Parsergrammar.WS, 0); }
		public HtmlChardataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlChardata; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterHtmlChardata(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitHtmlChardata(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitHtmlChardata(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlChardataContext htmlChardata() throws RecognitionException {
		HtmlChardataContext _localctx = new HtmlChardataContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_htmlChardata);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(841);
			_la = _input.LA(1);
			if ( !(_la==WS || _la==HTML_TEXT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TagAttContext extends ParserRuleContext {
		public TerminalNode TAG_EQUALS() { return getToken(Parsergrammar.TAG_EQUALS, 0); }
		public TerminalNode METHOD_CALL_VALUE() { return getToken(Parsergrammar.METHOD_CALL_VALUE, 0); }
		public TerminalNode ATTVALUE_VALUE() { return getToken(Parsergrammar.ATTVALUE_VALUE, 0); }
		public TagAttContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tagAtt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterTagAtt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitTagAtt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitTagAtt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TagAttContext tagAtt() throws RecognitionException {
		TagAttContext _localctx = new TagAttContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_tagAtt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(843);
			match(TAG_EQUALS);
			setState(844);
			_la = _input.LA(1);
			if ( !(_la==METHOD_CALL_VALUE || _la==ATTVALUE_VALUE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlAttributeContext extends ParserRuleContext {
		public HtmlAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlAttribute; }
	 
		public HtmlAttributeContext() { }
		public void copyFrom(HtmlAttributeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EventBindingContext extends HtmlAttributeContext {
		public TerminalNode EVENT_BINDING() { return getToken(Parsergrammar.EVENT_BINDING, 0); }
		public TagAttContext tagAtt() {
			return getRuleContext(TagAttContext.class,0);
		}
		public EventBindingContext(HtmlAttributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterEventBinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitEventBinding(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitEventBinding(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StructuralDirectiveAttributeContext extends HtmlAttributeContext {
		public TerminalNode STRUCTURAL_DIRECTIVE() { return getToken(Parsergrammar.STRUCTURAL_DIRECTIVE, 0); }
		public TagAttContext tagAtt() {
			return getRuleContext(TagAttContext.class,0);
		}
		public StructuralDirectiveAttributeContext(HtmlAttributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterStructuralDirectiveAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitStructuralDirectiveAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitStructuralDirectiveAttribute(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AttributeBindingContext extends HtmlAttributeContext {
		public TerminalNode ATTRIBUTE_BINDING() { return getToken(Parsergrammar.ATTRIBUTE_BINDING, 0); }
		public TagAttContext tagAtt() {
			return getRuleContext(TagAttContext.class,0);
		}
		public AttributeBindingContext(HtmlAttributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterAttributeBinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitAttributeBinding(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitAttributeBinding(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TagNameAttributeContext extends HtmlAttributeContext {
		public TerminalNode TAG_NAME() { return getToken(Parsergrammar.TAG_NAME, 0); }
		public TagAttContext tagAtt() {
			return getRuleContext(TagAttContext.class,0);
		}
		public TagNameAttributeContext(HtmlAttributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterTagNameAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitTagNameAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitTagNameAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlAttributeContext htmlAttribute() throws RecognitionException {
		HtmlAttributeContext _localctx = new HtmlAttributeContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_htmlAttribute);
		int _la;
		try {
			setState(862);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRUCTURAL_DIRECTIVE:
				_localctx = new StructuralDirectiveAttributeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(846);
				match(STRUCTURAL_DIRECTIVE);
				setState(848);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TAG_EQUALS) {
					{
					setState(847);
					tagAtt();
					}
				}

				}
				break;
			case ATTRIBUTE_BINDING:
				_localctx = new AttributeBindingContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(850);
				match(ATTRIBUTE_BINDING);
				setState(852);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TAG_EQUALS) {
					{
					setState(851);
					tagAtt();
					}
				}

				}
				break;
			case EVENT_BINDING:
				_localctx = new EventBindingContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(854);
				match(EVENT_BINDING);
				setState(856);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TAG_EQUALS) {
					{
					setState(855);
					tagAtt();
					}
				}

				}
				break;
			case TAG_NAME:
				_localctx = new TagNameAttributeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(858);
				match(TAG_NAME);
				setState(860);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TAG_EQUALS) {
					{
					setState(859);
					tagAtt();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlMiscContext extends ParserRuleContext {
		public HtmlCommentContext htmlComment() {
			return getRuleContext(HtmlCommentContext.class,0);
		}
		public TerminalNode WS() { return getToken(Parsergrammar.WS, 0); }
		public HtmlMiscContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlMisc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterHtmlMisc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitHtmlMisc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitHtmlMisc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlMiscContext htmlMisc() throws RecognitionException {
		HtmlMiscContext _localctx = new HtmlMiscContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_htmlMisc);
		try {
			setState(866);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HTML_COMMENT:
			case HTML_CONDITIONAL_COMMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(864);
				htmlComment();
				}
				break;
			case WS:
				enterOuterAlt(_localctx, 2);
				{
				setState(865);
				match(WS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlCommentContext extends ParserRuleContext {
		public TerminalNode HTML_COMMENT() { return getToken(Parsergrammar.HTML_COMMENT, 0); }
		public TerminalNode HTML_CONDITIONAL_COMMENT() { return getToken(Parsergrammar.HTML_CONDITIONAL_COMMENT, 0); }
		public HtmlCommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlComment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).enterHtmlComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParsergrammarListener ) ((ParsergrammarListener)listener).exitHtmlComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParsergrammarVisitor ) return ((ParsergrammarVisitor<? extends T>)visitor).visitHtmlComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlCommentContext htmlComment() throws RecognitionException {
		HtmlCommentContext _localctx = new HtmlCommentContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_htmlComment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(868);
			_la = _input.LA(1);
			if ( !(_la==HTML_COMMENT || _la==HTML_CONDITIONAL_COMMENT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001n\u0367\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007;\u0002"+
		"<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007@\u0002"+
		"A\u0007A\u0002B\u0007B\u0002C\u0007C\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0004\u0001\u008e\b\u0001\u000b\u0001\f\u0001"+
		"\u008f\u0001\u0001\u0001\u0001\u0003\u0001\u0094\b\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u009c"+
		"\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0005\u0003\u00a6\b\u0003\n\u0003\f\u0003"+
		"\u00a9\t\u0003\u0001\u0004\u0005\u0004\u00ac\b\u0004\n\u0004\f\u0004\u00af"+
		"\t\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0003\u0005\u00be\b\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u00c5\b\u0006\n\u0006\f\u0006"+
		"\u00c8\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003"+
		"\b\u00d6\b\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0003\t\u00de"+
		"\b\t\u0001\t\u0001\t\u0001\t\u0003\t\u00e3\b\t\u0001\t\u0001\t\u0003\t"+
		"\u00e7\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0003\u000b\u00f1\b\u000b\u0001\u000b\u0001\u000b\u0005"+
		"\u000b\u00f5\b\u000b\n\u000b\f\u000b\u00f8\t\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e"+
		"\u010a\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0003\u000f\u0113\b\u000f\u0001\u0010\u0003\u0010"+
		"\u0116\b\u0010\u0001\u0010\u0003\u0010\u0119\b\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u0126\b\u0012\n"+
		"\u0012\f\u0012\u0129\t\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0003"+
		"\u0013\u012e\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u0138\b\u0014\u0001"+
		"\u0014\u0001\u0014\u0003\u0014\u013c\b\u0014\u0001\u0014\u0001\u0014\u0003"+
		"\u0014\u0140\b\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0003"+
		"\u0015\u0146\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0003\u0015\u014d\b\u0015\u0005\u0015\u014f\b\u0015\n\u0015\f\u0015"+
		"\u0152\t\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u0156\b\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u015c\b\u0016\n"+
		"\u0016\f\u0016\u015f\t\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u0163"+
		"\b\u0016\u0001\u0017\u0001\u0017\u0003\u0017\u0167\b\u0017\u0001\u0017"+
		"\u0001\u0017\u0003\u0017\u016b\b\u0017\u0001\u0017\u0001\u0017\u0003\u0017"+
		"\u016f\b\u0017\u0003\u0017\u0171\b\u0017\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0005"+
		"\u0018\u017b\b\u0018\n\u0018\f\u0018\u017e\t\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u0191\b\u001a\n\u001a"+
		"\f\u001a\u0194\t\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a"+
		"\u0199\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u019e\b"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u01a8\b\u001b\u0003\u001b\u01aa"+
		"\b\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0003\u001e\u01bf\b\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0003\u001e\u01c4\b\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0003\u001f\u01dc\b\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003"+
		"\u001f\u01e1\b\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u01ec"+
		"\b\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0004\u001f\u0221\b\u001f\u000b"+
		"\u001f\f\u001f\u0222\u0001\u001f\u0001\u001f\u0005\u001f\u0227\b\u001f"+
		"\n\u001f\f\u001f\u022a\t\u001f\u0001 \u0001 \u0001 \u0001 \u0003 \u0230"+
		"\b \u0001 \u0001 \u0001 \u0001 \u0003 \u0236\b \u0001 \u0001 \u0001!\u0003"+
		"!\u023b\b!\u0001!\u0001!\u0001!\u0001!\u0001!\u0003!\u0242\b!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001$\u0001$\u0001"+
		"$\u0003$\u0259\b$\u0001$\u0001$\u0001%\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0001&\u0001&\u0001&\u0001&\u0003&\u0268\b&\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001(\u0001(\u0001(\u0001(\u0001("+
		"\u0001(\u0001(\u0001)\u0001)\u0001)\u0001)\u0001*\u0001*\u0001*\u0001"+
		"*\u0001*\u0003*\u0281\b*\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0003"+
		"+\u0289\b+\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001"+
		",\u0001,\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001"+
		".\u0001.\u0001.\u0001.\u0001.\u0001.\u0001/\u0005/\u02a4\b/\n/\f/\u02a7"+
		"\t/\u00010\u00010\u00010\u00030\u02ac\b0\u00011\u00011\u00051\u02b0\b"+
		"1\n1\f1\u02b3\t1\u00011\u00051\u02b6\b1\n1\f1\u02b9\t1\u00012\u00012\u0001"+
		"2\u00012\u00012\u00013\u00013\u00013\u00053\u02c3\b3\n3\f3\u02c6\t3\u0001"+
		"3\u00033\u02c9\b3\u00014\u00014\u00014\u00014\u00054\u02cf\b4\n4\f4\u02d2"+
		"\t4\u00034\u02d4\b4\u00015\u00015\u00035\u02d8\b5\u00015\u00015\u0001"+
		"5\u00015\u00035\u02de\b5\u00016\u00056\u02e1\b6\n6\f6\u02e4\t6\u00016"+
		"\u00036\u02e7\b6\u00016\u00056\u02ea\b6\n6\f6\u02ed\t6\u00016\u00036\u02f0"+
		"\b6\u00016\u00056\u02f3\b6\n6\f6\u02f6\t6\u00016\u00056\u02f9\b6\n6\f"+
		"6\u02fc\t6\u00017\u00017\u00018\u00058\u0301\b8\n8\f8\u0304\t8\u00018"+
		"\u00018\u00058\u0308\b8\n8\f8\u030b\t8\u00019\u00019\u00019\u00019\u0001"+
		"9\u00039\u0312\b9\u0001:\u0001:\u0001:\u0005:\u0317\b:\n:\f:\u031a\t:"+
		"\u0001:\u0001:\u0001;\u0001;\u0001;\u0005;\u0321\b;\n;\f;\u0324\t;\u0001"+
		";\u0003;\u0327\b;\u0001;\u0001;\u0001<\u0001<\u0001<\u0005<\u032e\b<\n"+
		"<\f<\u0331\t<\u0001<\u0001<\u0003<\u0335\b<\u0001<\u0001<\u0001<\u0001"+
		"<\u0001=\u0005=\u033c\b=\n=\f=\u033f\t=\u0001>\u0001>\u0001>\u0001>\u0001"+
		">\u0001>\u0001>\u0003>\u0348\b>\u0001?\u0001?\u0001@\u0001@\u0001@\u0001"+
		"A\u0001A\u0003A\u0351\bA\u0001A\u0001A\u0003A\u0355\bA\u0001A\u0001A\u0003"+
		"A\u0359\bA\u0001A\u0001A\u0003A\u035d\bA\u0003A\u035f\bA\u0001B\u0001"+
		"B\u0003B\u0363\bB\u0001C\u0001C\u0001C\u0001\u00f6\u0000D\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086"+
		"\u0000\u000b\u0002\u0000\u0016\u0016??\u0003\u0000\u0016\u0019\u001b\u001c"+
		"??\u0002\u0000\u0011\u0012@A\u0003\u0000\u001a\u001a$$??\u0001\u0000\u001e"+
		"\u001f\u0002\u00002244\u0002\u0000IIRR\u0001\u0000\\]\u0002\u0000II[["+
		"\u0001\u0000fg\u0001\u0000MN\u0397\u0000\u0088\u0001\u0000\u0000\u0000"+
		"\u0002\u008d\u0001\u0000\u0000\u0000\u0004\u0097\u0001\u0000\u0000\u0000"+
		"\u0006\u00a1\u0001\u0000\u0000\u0000\b\u00ad\u0001\u0000\u0000\u0000\n"+
		"\u00bd\u0001\u0000\u0000\u0000\f\u00bf\u0001\u0000\u0000\u0000\u000e\u00ce"+
		"\u0001\u0000\u0000\u0000\u0010\u00d0\u0001\u0000\u0000\u0000\u0012\u00dd"+
		"\u0001\u0000\u0000\u0000\u0014\u00e8\u0001\u0000\u0000\u0000\u0016\u00ec"+
		"\u0001\u0000\u0000\u0000\u0018\u00fb\u0001\u0000\u0000\u0000\u001a\u00ff"+
		"\u0001\u0000\u0000\u0000\u001c\u0104\u0001\u0000\u0000\u0000\u001e\u010e"+
		"\u0001\u0000\u0000\u0000 \u0115\u0001\u0000\u0000\u0000\"\u011c\u0001"+
		"\u0000\u0000\u0000$\u011e\u0001\u0000\u0000\u0000&\u012a\u0001\u0000\u0000"+
		"\u0000(\u0134\u0001\u0000\u0000\u0000*\u0145\u0001\u0000\u0000\u0000,"+
		"\u0157\u0001\u0000\u0000\u0000.\u0170\u0001\u0000\u0000\u00000\u0172\u0001"+
		"\u0000\u0000\u00002\u0182\u0001\u0000\u0000\u00004\u0188\u0001\u0000\u0000"+
		"\u00006\u019a\u0001\u0000\u0000\u00008\u01af\u0001\u0000\u0000\u0000:"+
		"\u01b6\u0001\u0000\u0000\u0000<\u01bb\u0001\u0000\u0000\u0000>\u0228\u0001"+
		"\u0000\u0000\u0000@\u022b\u0001\u0000\u0000\u0000B\u023a\u0001\u0000\u0000"+
		"\u0000D\u0247\u0001\u0000\u0000\u0000F\u024f\u0001\u0000\u0000\u0000H"+
		"\u0255\u0001\u0000\u0000\u0000J\u025c\u0001\u0000\u0000\u0000L\u0263\u0001"+
		"\u0000\u0000\u0000N\u0269\u0001\u0000\u0000\u0000P\u0270\u0001\u0000\u0000"+
		"\u0000R\u0277\u0001\u0000\u0000\u0000T\u0280\u0001\u0000\u0000\u0000V"+
		"\u0288\u0001\u0000\u0000\u0000X\u028a\u0001\u0000\u0000\u0000Z\u0294\u0001"+
		"\u0000\u0000\u0000\\\u029c\u0001\u0000\u0000\u0000^\u02a5\u0001\u0000"+
		"\u0000\u0000`\u02ab\u0001\u0000\u0000\u0000b\u02ad\u0001\u0000\u0000\u0000"+
		"d\u02ba\u0001\u0000\u0000\u0000f\u02bf\u0001\u0000\u0000\u0000h\u02ca"+
		"\u0001\u0000\u0000\u0000j\u02dd\u0001\u0000\u0000\u0000l\u02e2\u0001\u0000"+
		"\u0000\u0000n\u02fd\u0001\u0000\u0000\u0000p\u0302\u0001\u0000\u0000\u0000"+
		"r\u0311\u0001\u0000\u0000\u0000t\u0313\u0001\u0000\u0000\u0000v\u031d"+
		"\u0001\u0000\u0000\u0000x\u032a\u0001\u0000\u0000\u0000z\u033d\u0001\u0000"+
		"\u0000\u0000|\u0347\u0001\u0000\u0000\u0000~\u0349\u0001\u0000\u0000\u0000"+
		"\u0080\u034b\u0001\u0000\u0000\u0000\u0082\u035e\u0001\u0000\u0000\u0000"+
		"\u0084\u0362\u0001\u0000\u0000\u0000\u0086\u0364\u0001\u0000\u0000\u0000"+
		"\u0088\u0089\u0003\u0002\u0001\u0000\u0089\u008a\u0003l6\u0000\u008a\u008b"+
		"\u0003^/\u0000\u008b\u0001\u0001\u0000\u0000\u0000\u008c\u008e\u0003\f"+
		"\u0006\u0000\u008d\u008c\u0001\u0000\u0000\u0000\u008e\u008f\u0001\u0000"+
		"\u0000\u0000\u008f\u008d\u0001\u0000\u0000\u0000\u008f\u0090\u0001\u0000"+
		"\u0000\u0000\u0090\u0093\u0001\u0000\u0000\u0000\u0091\u0094\u0003\u0010"+
		"\b\u0000\u0092\u0094\u0003\u001c\u000e\u0000\u0093\u0091\u0001\u0000\u0000"+
		"\u0000\u0093\u0092\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000\u0000"+
		"\u0000\u0095\u0096\u0003\u0004\u0002\u0000\u0096\u0003\u0001\u0000\u0000"+
		"\u0000\u0097\u0098\u0005\u0003\u0000\u0000\u0098\u0099\u0005\u0005\u0000"+
		"\u0000\u0099\u009b\u0005?\u0000\u0000\u009a\u009c\u0003\u0006\u0003\u0000"+
		"\u009b\u009a\u0001\u0000\u0000\u0000\u009b\u009c\u0001\u0000\u0000\u0000"+
		"\u009c\u009d\u0001\u0000\u0000\u0000\u009d\u009e\u0005&\u0000\u0000\u009e"+
		"\u009f\u0003\b\u0004\u0000\u009f\u00a0\u0005\'\u0000\u0000\u00a0\u0005"+
		"\u0001\u0000\u0000\u0000\u00a1\u00a2\u0005\t\u0000\u0000\u00a2\u00a7\u0007"+
		"\u0000\u0000\u0000\u00a3\u00a4\u0005-\u0000\u0000\u00a4\u00a6\u0007\u0000"+
		"\u0000\u0000\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a6\u00a9\u0001\u0000"+
		"\u0000\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a7\u00a8\u0001\u0000"+
		"\u0000\u0000\u00a8\u0007\u0001\u0000\u0000\u0000\u00a9\u00a7\u0001\u0000"+
		"\u0000\u0000\u00aa\u00ac\u0003\n\u0005\u0000\u00ab\u00aa\u0001\u0000\u0000"+
		"\u0000\u00ac\u00af\u0001\u0000\u0000\u0000\u00ad\u00ab\u0001\u0000\u0000"+
		"\u0000\u00ad\u00ae\u0001\u0000\u0000\u0000\u00ae\t\u0001\u0000\u0000\u0000"+
		"\u00af\u00ad\u0001\u0000\u0000\u0000\u00b0\u00be\u0003:\u001d\u0000\u00b1"+
		"\u00be\u0003<\u001e\u0000\u00b2\u00be\u00038\u001c\u0000\u00b3\u00be\u0003"+
		",\u0016\u0000\u00b4\u00be\u00030\u0018\u0000\u00b5\u00be\u00034\u001a"+
		"\u0000\u00b6\u00be\u0003&\u0013\u0000\u00b7\u00be\u00036\u001b\u0000\u00b8"+
		"\u00be\u0003D\"\u0000\u00b9\u00be\u0003B!\u0000\u00ba\u00be\u0003X,\u0000"+
		"\u00bb\u00be\u0003Z-\u0000\u00bc\u00be\u0003*\u0015\u0000\u00bd\u00b0"+
		"\u0001\u0000\u0000\u0000\u00bd\u00b1\u0001\u0000\u0000\u0000\u00bd\u00b2"+
		"\u0001\u0000\u0000\u0000\u00bd\u00b3\u0001\u0000\u0000\u0000\u00bd\u00b4"+
		"\u0001\u0000\u0000\u0000\u00bd\u00b5\u0001\u0000\u0000\u0000\u00bd\u00b6"+
		"\u0001\u0000\u0000\u0000\u00bd\u00b7\u0001\u0000\u0000\u0000\u00bd\u00b8"+
		"\u0001\u0000\u0000\u0000\u00bd\u00b9\u0001\u0000\u0000\u0000\u00bd\u00ba"+
		"\u0001\u0000\u0000\u0000\u00bd\u00bb\u0001\u0000\u0000\u0000\u00bd\u00bc"+
		"\u0001\u0000\u0000\u0000\u00be\u000b\u0001\u0000\u0000\u0000\u00bf\u00c0"+
		"\u0005\u0004\u0000\u0000\u00c0\u00c1\u0005&\u0000\u0000\u00c1\u00c6\u0003"+
		"\u000e\u0007\u0000\u00c2\u00c3\u0005-\u0000\u0000\u00c3\u00c5\u0003\u000e"+
		"\u0007\u0000\u00c4\u00c2\u0001\u0000\u0000\u0000\u00c5\u00c8\u0001\u0000"+
		"\u0000\u0000\u00c6\u00c4\u0001\u0000\u0000\u0000\u00c6\u00c7\u0001\u0000"+
		"\u0000\u0000\u00c7\u00c9\u0001\u0000\u0000\u0000\u00c8\u00c6\u0001\u0000"+
		"\u0000\u0000\u00c9\u00ca\u0005\'\u0000\u0000\u00ca\u00cb\u0005\u0002\u0000"+
		"\u0000\u00cb\u00cc\u0005A\u0000\u0000\u00cc\u00cd\u0005.\u0000\u0000\u00cd"+
		"\r\u0001\u0000\u0000\u0000\u00ce\u00cf\u0007\u0001\u0000\u0000\u00cf\u000f"+
		"\u0001\u0000\u0000\u0000\u00d0\u00d1\u0005\b\u0000\u0000\u00d1\u00d2\u0005"+
		"\u001b\u0000\u0000\u00d2\u00d3\u0005(\u0000\u0000\u00d3\u00d5\u0005&\u0000"+
		"\u0000\u00d4\u00d6\u0003\u0012\t\u0000\u00d5\u00d4\u0001\u0000\u0000\u0000"+
		"\u00d5\u00d6\u0001\u0000\u0000\u0000\u00d6\u00d7\u0001\u0000\u0000\u0000"+
		"\u00d7\u00d8\u0005\'\u0000\u0000\u00d8\u00d9\u0005)\u0000\u0000\u00d9"+
		"\u0011\u0001\u0000\u0000\u0000\u00da\u00db\u0003\u0014\n\u0000\u00db\u00dc"+
		"\u0005-\u0000\u0000\u00dc\u00de\u0001\u0000\u0000\u0000\u00dd\u00da\u0001"+
		"\u0000\u0000\u0000\u00dd\u00de\u0001\u0000\u0000\u0000\u00de\u00e2\u0001"+
		"\u0000\u0000\u0000\u00df\u00e0\u0003\u0016\u000b\u0000\u00e0\u00e1\u0005"+
		"-\u0000\u0000\u00e1\u00e3\u0001\u0000\u0000\u0000\u00e2\u00df\u0001\u0000"+
		"\u0000\u0000\u00e2\u00e3\u0001\u0000\u0000\u0000\u00e3\u00e4\u0001\u0000"+
		"\u0000\u0000\u00e4\u00e6\u0003\u001a\r\u0000\u00e5\u00e7\u0003\u0018\f"+
		"\u0000\u00e6\u00e5\u0001\u0000\u0000\u0000\u00e6\u00e7\u0001\u0000\u0000"+
		"\u0000\u00e7\u0013\u0001\u0000\u0000\u0000\u00e8\u00e9\u0005\u000b\u0000"+
		"\u0000\u00e9\u00ea\u0005,\u0000\u0000\u00ea\u00eb\u0005A\u0000\u0000\u00eb"+
		"\u0015\u0001\u0000\u0000\u0000\u00ec\u00ed\u0005\u0001\u0000\u0000\u00ed"+
		"\u00ee\u0005,\u0000\u0000\u00ee\u00f0\u0005*\u0000\u0000\u00ef\u00f1\u0007"+
		"\u0000\u0000\u0000\u00f0\u00ef\u0001\u0000\u0000\u0000\u00f0\u00f1\u0001"+
		"\u0000\u0000\u0000\u00f1\u00f6\u0001\u0000\u0000\u0000\u00f2\u00f3\u0005"+
		"-\u0000\u0000\u00f3\u00f5\u0007\u0000\u0000\u0000\u00f4\u00f2\u0001\u0000"+
		"\u0000\u0000\u00f5\u00f8\u0001\u0000\u0000\u0000\u00f6\u00f7\u0001\u0000"+
		"\u0000\u0000\u00f6\u00f4\u0001\u0000\u0000\u0000\u00f7\u00f9\u0001\u0000"+
		"\u0000\u0000\u00f8\u00f6\u0001\u0000\u0000\u0000\u00f9\u00fa\u0005+\u0000"+
		"\u0000\u00fa\u0017\u0001\u0000\u0000\u0000\u00fb\u00fc\u0005\r\u0000\u0000"+
		"\u00fc\u00fd\u0005,\u0000\u0000\u00fd\u00fe\u0005A\u0000\u0000\u00fe\u0019"+
		"\u0001\u0000\u0000\u0000\u00ff\u0100\u0005\f\u0000\u0000\u0100\u0101\u0005"+
		",\u0000\u0000\u0101\u0102\u0005A\u0000\u0000\u0102\u0103\u0005-\u0000"+
		"\u0000\u0103\u001b\u0001\u0000\u0000\u0000\u0104\u0105\u0005\b\u0000\u0000"+
		"\u0105\u0106\u0005\u001c\u0000\u0000\u0106\u0107\u0005(\u0000\u0000\u0107"+
		"\u0109\u0005&\u0000\u0000\u0108\u010a\u0003\u001e\u000f\u0000\u0109\u0108"+
		"\u0001\u0000\u0000\u0000\u0109\u010a\u0001\u0000\u0000\u0000\u010a\u010b"+
		"\u0001\u0000\u0000\u0000\u010b\u010c\u0005\'\u0000\u0000\u010c\u010d\u0005"+
		")\u0000\u0000\u010d\u001d\u0001\u0000\u0000\u0000\u010e\u010f\u0005\u000f"+
		"\u0000\u0000\u010f\u0110\u0005,\u0000\u0000\u0110\u0112\u0005A\u0000\u0000"+
		"\u0111\u0113\u0005-\u0000\u0000\u0112\u0111\u0001\u0000\u0000\u0000\u0112"+
		"\u0113\u0001\u0000\u0000\u0000\u0113\u001f\u0001\u0000\u0000\u0000\u0114"+
		"\u0116\u0005\u0015\u0000\u0000\u0115\u0114\u0001\u0000\u0000\u0000\u0115"+
		"\u0116\u0001\u0000\u0000\u0000\u0116\u0118\u0001\u0000\u0000\u0000\u0117"+
		"\u0119\u0005\u0014\u0000\u0000\u0118\u0117\u0001\u0000\u0000\u0000\u0118"+
		"\u0119\u0001\u0000\u0000\u0000\u0119\u011a\u0001\u0000\u0000\u0000\u011a"+
		"\u011b\u0005?\u0000\u0000\u011b!\u0001\u0000\u0000\u0000\u011c\u011d\u0007"+
		"\u0002\u0000\u0000\u011d#\u0001\u0000\u0000\u0000\u011e\u011f\u0005?\u0000"+
		"\u0000\u011f\u0120\u0005,\u0000\u0000\u0120\u0127\u0005\u0013\u0000\u0000"+
		"\u0121\u0122\u0005-\u0000\u0000\u0122\u0123\u0005?\u0000\u0000\u0123\u0124"+
		"\u0005,\u0000\u0000\u0124\u0126\u0005\u0013\u0000\u0000\u0125\u0121\u0001"+
		"\u0000\u0000\u0000\u0126\u0129\u0001\u0000\u0000\u0000\u0127\u0125\u0001"+
		"\u0000\u0000\u0000\u0127\u0128\u0001\u0000\u0000\u0000\u0128%\u0001\u0000"+
		"\u0000\u0000\u0129\u0127\u0001\u0000\u0000\u0000\u012a\u012b\u0003 \u0010"+
		"\u0000\u012b\u012d\u0005(\u0000\u0000\u012c\u012e\u0003$\u0012\u0000\u012d"+
		"\u012c\u0001\u0000\u0000\u0000\u012d\u012e\u0001\u0000\u0000\u0000\u012e"+
		"\u012f\u0001\u0000\u0000\u0000\u012f\u0130\u0005)\u0000\u0000\u0130\u0131"+
		"\u0005&\u0000\u0000\u0131\u0132\u0003(\u0014\u0000\u0132\u0133\u0005\'"+
		"\u0000\u0000\u0133\'\u0001\u0000\u0000\u0000\u0134\u0137\u0005\u0007\u0000"+
		"\u0000\u0135\u0136\u00053\u0000\u0000\u0136\u0138\u00052\u0000\u0000\u0137"+
		"\u0135\u0001\u0000\u0000\u0000\u0137\u0138\u0001\u0000\u0000\u0000\u0138"+
		"\u013b\u0001\u0000\u0000\u0000\u0139\u013c\u0005?\u0000\u0000\u013a\u013c"+
		"\u0003\"\u0011\u0000\u013b\u0139\u0001\u0000\u0000\u0000\u013b\u013a\u0001"+
		"\u0000\u0000\u0000\u013c\u013f\u0001\u0000\u0000\u0000\u013d\u013e\u0005"+
		"2\u0000\u0000\u013e\u0140\u0005\u001e\u0000\u0000\u013f\u013d\u0001\u0000"+
		"\u0000\u0000\u013f\u0140\u0001\u0000\u0000\u0000\u0140\u0141\u0001\u0000"+
		"\u0000\u0000\u0141\u0142\u0005.\u0000\u0000\u0142)\u0001\u0000\u0000\u0000"+
		"\u0143\u0144\u0005?\u0000\u0000\u0144\u0146\u00051\u0000\u0000\u0145\u0143"+
		"\u0001\u0000\u0000\u0000\u0145\u0146\u0001\u0000\u0000\u0000\u0146\u0147"+
		"\u0001\u0000\u0000\u0000\u0147\u0150\u0005&\u0000\u0000\u0148\u0149\u0005"+
		"?\u0000\u0000\u0149\u014a\u0005,\u0000\u0000\u014a\u014c\u0003\"\u0011"+
		"\u0000\u014b\u014d\u0005-\u0000\u0000\u014c\u014b\u0001\u0000\u0000\u0000"+
		"\u014c\u014d\u0001\u0000\u0000\u0000\u014d\u014f\u0001\u0000\u0000\u0000"+
		"\u014e\u0148\u0001\u0000\u0000\u0000\u014f\u0152\u0001\u0000\u0000\u0000"+
		"\u0150\u014e\u0001\u0000\u0000\u0000\u0150\u0151\u0001\u0000\u0000\u0000"+
		"\u0151\u0153\u0001\u0000\u0000\u0000\u0152\u0150\u0001\u0000\u0000\u0000"+
		"\u0153\u0155\u0005\'\u0000\u0000\u0154\u0156\u0005.\u0000\u0000\u0155"+
		"\u0154\u0001\u0000\u0000\u0000\u0155\u0156\u0001\u0000\u0000\u0000\u0156"+
		"+\u0001\u0000\u0000\u0000\u0157\u0158\u0003 \u0010\u0000\u0158\u0159\u0005"+
		"1\u0000\u0000\u0159\u015d\u0005*\u0000\u0000\u015a\u015c\u0003.\u0017"+
		"\u0000\u015b\u015a\u0001\u0000\u0000\u0000\u015c\u015f\u0001\u0000\u0000"+
		"\u0000\u015d\u015b\u0001\u0000\u0000\u0000\u015d\u015e\u0001\u0000\u0000"+
		"\u0000\u015e\u0160\u0001\u0000\u0000\u0000\u015f\u015d\u0001\u0000\u0000"+
		"\u0000\u0160\u0162\u0005+\u0000\u0000\u0161\u0163\u0005.\u0000\u0000\u0162"+
		"\u0161\u0001\u0000\u0000\u0000\u0162\u0163\u0001\u0000\u0000\u0000\u0163"+
		"-\u0001\u0000\u0000\u0000\u0164\u0166\u0003*\u0015\u0000\u0165\u0167\u0005"+
		"-\u0000\u0000\u0166\u0165\u0001\u0000\u0000\u0000\u0166\u0167\u0001\u0000"+
		"\u0000\u0000\u0167\u0171\u0001\u0000\u0000\u0000\u0168\u016a\u0005@\u0000"+
		"\u0000\u0169\u016b\u0005-\u0000\u0000\u016a\u0169\u0001\u0000\u0000\u0000"+
		"\u016a\u016b\u0001\u0000\u0000\u0000\u016b\u0171\u0001\u0000\u0000\u0000"+
		"\u016c\u016e\u0005A\u0000\u0000\u016d\u016f\u0005-\u0000\u0000\u016e\u016d"+
		"\u0001\u0000\u0000\u0000\u016e\u016f\u0001\u0000\u0000\u0000\u016f\u0171"+
		"\u0001\u0000\u0000\u0000\u0170\u0164\u0001\u0000\u0000\u0000\u0170\u0168"+
		"\u0001\u0000\u0000\u0000\u0170\u016c\u0001\u0000\u0000\u0000\u0171/\u0001"+
		"\u0000\u0000\u0000\u0172\u0173\u0003 \u0010\u0000\u0173\u0174\u0005,\u0000"+
		"\u0000\u0174\u0175\u0005\u0013\u0000\u0000\u0175\u0176\u0005*\u0000\u0000"+
		"\u0176\u0177\u0005+\u0000\u0000\u0177\u0178\u00051\u0000\u0000\u0178\u017c"+
		"\u0005*\u0000\u0000\u0179\u017b\u00032\u0019\u0000\u017a\u0179\u0001\u0000"+
		"\u0000\u0000\u017b\u017e\u0001\u0000\u0000\u0000\u017c\u017a\u0001\u0000"+
		"\u0000\u0000\u017c\u017d\u0001\u0000\u0000\u0000\u017d\u017f\u0001\u0000"+
		"\u0000\u0000\u017e\u017c\u0001\u0000\u0000\u0000\u017f\u0180\u0005+\u0000"+
		"\u0000\u0180\u0181\u0005.\u0000\u0000\u01811\u0001\u0000\u0000\u0000\u0182"+
		"\u0183\u0003*\u0015\u0000\u0183\u0184\u0005-\u0000\u0000\u0184\u0185\u0005"+
		"@\u0000\u0000\u0185\u0186\u0005-\u0000\u0000\u0186\u0187\u0005A\u0000"+
		"\u0000\u01873\u0001\u0000\u0000\u0000\u0188\u0189\u0003 \u0010\u0000\u0189"+
		"\u018a\u00051\u0000\u0000\u018a\u018b\u0005\"\u0000\u0000\u018b\u018c"+
		"\u0005\u0018\u0000\u0000\u018c\u018d\u0003\\.\u0000\u018d\u018e\u0005"+
		"(\u0000\u0000\u018e\u0192\u0005*\u0000\u0000\u018f\u0191\u0003.\u0017"+
		"\u0000\u0190\u018f\u0001\u0000\u0000\u0000\u0191\u0194\u0001\u0000\u0000"+
		"\u0000\u0192\u0190\u0001\u0000\u0000\u0000\u0192\u0193\u0001\u0000\u0000"+
		"\u0000\u0193\u0195\u0001\u0000\u0000\u0000\u0194\u0192\u0001\u0000\u0000"+
		"\u0000\u0195\u0196\u0005+\u0000\u0000\u0196\u0198\u0005)\u0000\u0000\u0197"+
		"\u0199\u0005.\u0000\u0000\u0198\u0197\u0001\u0000\u0000\u0000\u0198\u0199"+
		"\u0001\u0000\u0000\u0000\u01995\u0001\u0000\u0000\u0000\u019a\u019b\u0005"+
		"\u0006\u0000\u0000\u019b\u01a9\u0005(\u0000\u0000\u019c\u019e\u0005\u0015"+
		"\u0000\u0000\u019d\u019c\u0001\u0000\u0000\u0000\u019d\u019e\u0001\u0000"+
		"\u0000\u0000\u019e\u019f\u0001\u0000\u0000\u0000\u019f\u01a0\u0005?\u0000"+
		"\u0000\u01a0\u01a1\u0005,\u0000\u0000\u01a1\u01a7\u0005?\u0000\u0000\u01a2"+
		"\u01a3\u0005-\u0000\u0000\u01a3\u01a4\u0005\u0015\u0000\u0000\u01a4\u01a5"+
		"\u0005?\u0000\u0000\u01a5\u01a6\u0005,\u0000\u0000\u01a6\u01a8\u0005\u0017"+
		"\u0000\u0000\u01a7\u01a2\u0001\u0000\u0000\u0000\u01a7\u01a8\u0001\u0000"+
		"\u0000\u0000\u01a8\u01aa\u0001\u0000\u0000\u0000\u01a9\u019d\u0001\u0000"+
		"\u0000\u0000\u01a9\u01aa\u0001\u0000\u0000\u0000\u01aa\u01ab\u0001\u0000"+
		"\u0000\u0000\u01ab\u01ac\u0005)\u0000\u0000\u01ac\u01ad\u0005&\u0000\u0000"+
		"\u01ad\u01ae\u0005\'\u0000\u0000\u01ae7\u0001\u0000\u0000\u0000\u01af"+
		"\u01b0\u0003 \u0010\u0000\u01b0\u01b1\u0005,\u0000\u0000\u01b1\u01b2\u0005"+
		"\u0013\u0000\u0000\u01b2\u01b3\u00051\u0000\u0000\u01b3\u01b4\u0003\""+
		"\u0011\u0000\u01b4\u01b5\u0005.\u0000\u0000\u01b59\u0001\u0000\u0000\u0000"+
		"\u01b6\u01b7\u0005?\u0000\u0000\u01b7\u01b8\u00051\u0000\u0000\u01b8\u01b9"+
		"\u0003\"\u0011\u0000\u01b9\u01ba\u0005.\u0000\u0000\u01ba;\u0001\u0000"+
		"\u0000\u0000\u01bb\u01bc\u0003 \u0010\u0000\u01bc\u01be\u0005(\u0000\u0000"+
		"\u01bd\u01bf\u0003$\u0012\u0000\u01be\u01bd\u0001\u0000\u0000\u0000\u01be"+
		"\u01bf\u0001\u0000\u0000\u0000\u01bf\u01c0\u0001\u0000\u0000\u0000\u01c0"+
		"\u01c3\u0005)\u0000\u0000\u01c1\u01c2\u0005,\u0000\u0000\u01c2\u01c4\u0005"+
		"\u0010\u0000\u0000\u01c3\u01c1\u0001\u0000\u0000\u0000\u01c3\u01c4\u0001"+
		"\u0000\u0000\u0000\u01c4\u01c5\u0001\u0000\u0000\u0000\u01c5\u01c6\u0005"+
		"&\u0000\u0000\u01c6\u01c7\u0003>\u001f\u0000\u01c7\u01c8\u0005\'\u0000"+
		"\u0000\u01c8=\u0001\u0000\u0000\u0000\u01c9\u01ca\u00053\u0000\u0000\u01ca"+
		"\u01cb\u00052\u0000\u0000\u01cb\u01cc\u0005?\u0000\u0000\u01cc\u01cd\u0005"+
		"8\u0000\u0000\u01cd\u01ce\u00051\u0000\u0000\u01ce\u01cf\u00053\u0000"+
		"\u0000\u01cf\u01d0\u00052\u0000\u0000\u01d0\u01d1\u0005?\u0000\u0000\u01d1"+
		"\u01d2\u00052\u0000\u0000\u01d2\u01d3\u0005?\u0000\u0000\u01d3\u01d4\u0005"+
		"8\u0000\u0000\u01d4\u0227\u0005.\u0000\u0000\u01d5\u01d6\u00053\u0000"+
		"\u0000\u01d6\u01d7\u00052\u0000\u0000\u01d7\u01d8\u0005?\u0000\u0000\u01d8"+
		"\u01db\u00051\u0000\u0000\u01d9\u01dc\u0005?\u0000\u0000\u01da\u01dc\u0003"+
		"\"\u0011\u0000\u01db\u01d9\u0001\u0000\u0000\u0000\u01db\u01da\u0001\u0000"+
		"\u0000\u0000\u01dc\u01dd\u0001\u0000\u0000\u0000\u01dd\u0227\u0005.\u0000"+
		"\u0000\u01de\u01df\u00053\u0000\u0000\u01df\u01e1\u00052\u0000\u0000\u01e0"+
		"\u01de\u0001\u0000\u0000\u0000\u01e0\u01e1\u0001\u0000\u0000\u0000\u01e1"+
		"\u01e2\u0001\u0000\u0000\u0000\u01e2\u01eb\u0005?\u0000\u0000\u01e3\u01e4"+
		"\u00051\u0000\u0000\u01e4\u01e5\u00053\u0000\u0000\u01e5\u01e6\u00052"+
		"\u0000\u0000\u01e6\u01e7\u0005?\u0000\u0000\u01e7\u01e8\u00052\u0000\u0000"+
		"\u01e8\u01ec\u0003@ \u0000\u01e9\u01ea\u00052\u0000\u0000\u01ea\u01ec"+
		"\u0003@ \u0000\u01eb\u01e3\u0001\u0000\u0000\u0000\u01eb\u01e9\u0001\u0000"+
		"\u0000\u0000\u01ec\u01ed\u0001\u0000\u0000\u0000\u01ed\u01ee\u0005.\u0000"+
		"\u0000\u01ee\u0227\u0001\u0000\u0000\u0000\u01ef\u01f0\u0003F#\u0000\u01f0"+
		"\u01f1\u0003H$\u0000\u01f1\u01f2\u0005.\u0000\u0000\u01f2\u0227\u0001"+
		"\u0000\u0000\u0000\u01f3\u01f4\u00053\u0000\u0000\u01f4\u01f5\u00052\u0000"+
		"\u0000\u01f5\u01f6\u0005?\u0000\u0000\u01f6\u01f7\u00051\u0000\u0000\u01f7"+
		"\u01f8\u0005&\u0000\u0000\u01f8\u01f9\u00055\u0000\u0000\u01f9\u01fa\u0005"+
		"?\u0000\u0000\u01fa\u01fb\u0005\'\u0000\u0000\u01fb\u0227\u0005.\u0000"+
		"\u0000\u01fc\u01fd\u0005\u0014\u0000\u0000\u01fd\u01fe\u0005?\u0000\u0000"+
		"\u01fe\u01ff\u00051\u0000\u0000\u01ff\u0200\u0005&\u0000\u0000\u0200\u0201"+
		"\u00055\u0000\u0000\u0201\u0202\u00053\u0000\u0000\u0202\u0203\u00052"+
		"\u0000\u0000\u0203\u0204\u0005?\u0000\u0000\u0204\u0205\u0005-\u0000\u0000"+
		"\u0205\u0206\u0005?\u0000\u0000\u0206\u0207\u0005,\u0000\u0000\u0207\u0208"+
		"\u0005#\u0000\u0000\u0208\u0209\u00052\u0000\u0000\u0209\u020a\u0003@"+
		" \u0000\u020a\u020b\u0005\'\u0000\u0000\u020b\u020c\u0005.\u0000\u0000"+
		"\u020c\u0227\u0001\u0000\u0000\u0000\u020d\u020e\u0005%\u0000\u0000\u020e"+
		"\u020f\u0005(\u0000\u0000\u020f\u0210\u00053\u0000\u0000\u0210\u0211\u0005"+
		"2\u0000\u0000\u0211\u0212\u0005?\u0000\u0000\u0212\u0213\u00057\u0000"+
		"\u0000\u0213\u0214\u00052\u0000\u0000\u0214\u0215\u0005?\u0000\u0000\u0215"+
		"\u0216\u00050\u0000\u0000\u0216\u0217\u0005?\u0000\u0000\u0217\u0218\u0005"+
		")\u0000\u0000\u0218\u0220\u0005&\u0000\u0000\u0219\u021a\u00053\u0000"+
		"\u0000\u021a\u021b\u00052\u0000\u0000\u021b\u021c\u0005?\u0000\u0000\u021c"+
		"\u021d\u00051\u0000\u0000\u021d\u021e\u0003\"\u0011\u0000\u021e\u021f"+
		"\u0005.\u0000\u0000\u021f\u0221\u0001\u0000\u0000\u0000\u0220\u0219\u0001"+
		"\u0000\u0000\u0000\u0221\u0222\u0001\u0000\u0000\u0000\u0222\u0220\u0001"+
		"\u0000\u0000\u0000\u0222\u0223\u0001\u0000\u0000\u0000\u0223\u0224\u0001"+
		"\u0000\u0000\u0000\u0224\u0225\u0005\'\u0000\u0000\u0225\u0227\u0001\u0000"+
		"\u0000\u0000\u0226\u01c9\u0001\u0000\u0000\u0000\u0226\u01d5\u0001\u0000"+
		"\u0000\u0000\u0226\u01e0\u0001\u0000\u0000\u0000\u0226\u01ef\u0001\u0000"+
		"\u0000\u0000\u0226\u01f3\u0001\u0000\u0000\u0000\u0226\u01fc\u0001\u0000"+
		"\u0000\u0000\u0226\u020d\u0001\u0000\u0000\u0000\u0227\u022a\u0001\u0000"+
		"\u0000\u0000\u0228\u0226\u0001\u0000\u0000\u0000\u0228\u0229\u0001\u0000"+
		"\u0000\u0000\u0229?\u0001\u0000\u0000\u0000\u022a\u0228\u0001\u0000\u0000"+
		"\u0000\u022b\u022c\u0007\u0003\u0000\u0000\u022c\u0235\u0005(\u0000\u0000"+
		"\u022d\u022e\u00053\u0000\u0000\u022e\u0230\u00052\u0000\u0000\u022f\u022d"+
		"\u0001\u0000\u0000\u0000\u022f\u0230\u0001\u0000\u0000\u0000\u0230\u0231"+
		"\u0001\u0000\u0000\u0000\u0231\u0236\u0005?\u0000\u0000\u0232\u0233\u0005"+
		"*\u0000\u0000\u0233\u0234\u0005A\u0000\u0000\u0234\u0236\u0005+\u0000"+
		"\u0000\u0235\u022f\u0001\u0000\u0000\u0000\u0235\u0232\u0001\u0000\u0000"+
		"\u0000\u0235\u0236\u0001\u0000\u0000\u0000\u0236\u0237\u0001\u0000\u0000"+
		"\u0000\u0237\u0238\u0005)\u0000\u0000\u0238A\u0001\u0000\u0000\u0000\u0239"+
		"\u023b\u0005\u0015\u0000\u0000\u023a\u0239\u0001\u0000\u0000\u0000\u023a"+
		"\u023b\u0001\u0000\u0000\u0000\u023b\u023c\u0001\u0000\u0000\u0000\u023c"+
		"\u023d\u0005\n\u0000\u0000\u023d\u023e\u0005(\u0000\u0000\u023e\u0241"+
		"\u0005)\u0000\u0000\u023f\u0240\u0005,\u0000\u0000\u0240\u0242\u0005\u0010"+
		"\u0000\u0000\u0241\u023f\u0001\u0000\u0000\u0000\u0241\u0242\u0001\u0000"+
		"\u0000\u0000\u0242\u0243\u0001\u0000\u0000\u0000\u0243\u0244\u0005&\u0000"+
		"\u0000\u0244\u0245\u0003>\u001f\u0000\u0245\u0246\u0005\'\u0000\u0000"+
		"\u0246C\u0001\u0000\u0000\u0000\u0247\u0248\u0005?\u0000\u0000\u0248\u0249"+
		"\u00051\u0000\u0000\u0249\u024a\u0005\u0016\u0000\u0000\u024a\u024b\u0005"+
		"(\u0000\u0000\u024b\u024c\u0005A\u0000\u0000\u024c\u024d\u0005)\u0000"+
		"\u0000\u024d\u024e\u0005.\u0000\u0000\u024eE\u0001\u0000\u0000\u0000\u024f"+
		"\u0250\u00053\u0000\u0000\u0250\u0251\u00052\u0000\u0000\u0251\u0252\u0005"+
		"?\u0000\u0000\u0252\u0253\u00052\u0000\u0000\u0253\u0254\u0007\u0004\u0000"+
		"\u0000\u0254G\u0001\u0000\u0000\u0000\u0255\u0258\u0005(\u0000\u0000\u0256"+
		"\u0259\u0003J%\u0000\u0257\u0259\u0003L&\u0000\u0258\u0256\u0001\u0000"+
		"\u0000\u0000\u0258\u0257\u0001\u0000\u0000\u0000\u0259\u025a\u0001\u0000"+
		"\u0000\u0000\u025a\u025b\u0005)\u0000\u0000\u025bI\u0001\u0000\u0000\u0000"+
		"\u025c\u025d\u0005*\u0000\u0000\u025d\u025e\u00055\u0000\u0000\u025e\u025f"+
		"\u0003F#\u0000\u025f\u0260\u0005-\u0000\u0000\u0260\u0261\u0005?\u0000"+
		"\u0000\u0261\u0262\u0005+\u0000\u0000\u0262K\u0001\u0000\u0000\u0000\u0263"+
		"\u0264\u0003F#\u0000\u0264\u0267\u00052\u0000\u0000\u0265\u0268\u0003"+
		"N\'\u0000\u0266\u0268\u0003P(\u0000\u0267\u0265\u0001\u0000\u0000\u0000"+
		"\u0267\u0266\u0001\u0000\u0000\u0000\u0268M\u0001\u0000\u0000\u0000\u0269"+
		"\u026a\u0005 \u0000\u0000\u026a\u026b\u0005(\u0000\u0000\u026b\u026c\u0003"+
		"R)\u0000\u026c\u026d\u00050\u0000\u0000\u026d\u026e\u0003T*\u0000\u026e"+
		"\u026f\u0005)\u0000\u0000\u026fO\u0001\u0000\u0000\u0000\u0270\u0271\u0005"+
		"!\u0000\u0000\u0271\u0272\u0005(\u0000\u0000\u0272\u0273\u0003R)\u0000"+
		"\u0273\u0274\u0005/\u0000\u0000\u0274\u0275\u0003T*\u0000\u0275\u0276"+
		"\u0005)\u0000\u0000\u0276Q\u0001\u0000\u0000\u0000\u0277\u0278\u0005?"+
		"\u0000\u0000\u0278\u0279\u00056\u0000\u0000\u0279\u027a\u0003V+\u0000"+
		"\u027aS\u0001\u0000\u0000\u0000\u027b\u027c\u0003V+\u0000\u027c\u027d"+
		"\u00057\u0000\u0000\u027d\u027e\u0003V+\u0000\u027e\u0281\u0001\u0000"+
		"\u0000\u0000\u027f\u0281\u0005?\u0000\u0000\u0280\u027b\u0001\u0000\u0000"+
		"\u0000\u0280\u027f\u0001\u0000\u0000\u0000\u0281U\u0001\u0000\u0000\u0000"+
		"\u0282\u0283\u0005?\u0000\u0000\u0283\u0284\u00052\u0000\u0000\u0284\u0289"+
		"\u0005?\u0000\u0000\u0285\u0286\u0005?\u0000\u0000\u0286\u0287\u0005,"+
		"\u0000\u0000\u0287\u0289\u0005?\u0000\u0000\u0288\u0282\u0001\u0000\u0000"+
		"\u0000\u0288\u0285\u0001\u0000\u0000\u0000\u0289W\u0001\u0000\u0000\u0000"+
		"\u028a\u028b\u0005?\u0000\u0000\u028b\u028c\u00058\u0000\u0000\u028c\u028d"+
		"\u00051\u0000\u0000\u028d\u028e\u00053\u0000\u0000\u028e\u028f\u00052"+
		"\u0000\u0000\u028f\u0290\u0005?\u0000\u0000\u0290\u0291\u00052\u0000\u0000"+
		"\u0291\u0292\u0003@ \u0000\u0292\u0293\u0005.\u0000\u0000\u0293Y\u0001"+
		"\u0000\u0000\u0000\u0294\u0295\u0005?\u0000\u0000\u0295\u0296\u00058\u0000"+
		"\u0000\u0296\u0297\u00059\u0000\u0000\u0297\u0298\u0005,\u0000\u0000\u0298"+
		"\u0299\u0005\u0019\u0000\u0000\u0299\u029a\u0003\\.\u0000\u029a\u029b"+
		"\u0005.\u0000\u0000\u029b[\u0001\u0000\u0000\u0000\u029c\u029d\u0005T"+
		"\u0000\u0000\u029d\u029e\u0005U\u0000\u0000\u029e\u029f\u0005V\u0000\u0000"+
		"\u029f\u02a0\u0005W\u0000\u0000\u02a0\u02a1\u0005\\\u0000\u0000\u02a1"+
		"]\u0001\u0000\u0000\u0000\u02a2\u02a4\u0003d2\u0000\u02a3\u02a2\u0001"+
		"\u0000\u0000\u0000\u02a4\u02a7\u0001\u0000\u0000\u0000\u02a5\u02a3\u0001"+
		"\u0000\u0000\u0000\u02a5\u02a6\u0001\u0000\u0000\u0000\u02a6_\u0001\u0000"+
		"\u0000\u0000\u02a7\u02a5\u0001\u0000\u0000\u0000\u02a8\u02a9\u0007\u0005"+
		"\u0000\u0000\u02a9\u02ac\u0005?\u0000\u0000\u02aa\u02ac\u0005>\u0000\u0000"+
		"\u02ab\u02a8\u0001\u0000\u0000\u0000\u02ab\u02aa\u0001\u0000\u0000\u0000"+
		"\u02aca\u0001\u0000\u0000\u0000\u02ad\u02b7\u0003`0\u0000\u02ae\u02b0"+
		"\u0005I\u0000\u0000\u02af\u02ae\u0001\u0000\u0000\u0000\u02b0\u02b3\u0001"+
		"\u0000\u0000\u0000\u02b1\u02af\u0001\u0000\u0000\u0000\u02b1\u02b2\u0001"+
		"\u0000\u0000\u0000\u02b2\u02b4\u0001\u0000\u0000\u0000\u02b3\u02b1\u0001"+
		"\u0000\u0000\u0000\u02b4\u02b6\u0005>\u0000\u0000\u02b5\u02b1\u0001\u0000"+
		"\u0000\u0000\u02b6\u02b9\u0001\u0000\u0000\u0000\u02b7\u02b5\u0001\u0000"+
		"\u0000\u0000\u02b7\u02b8\u0001\u0000\u0000\u0000\u02b8c\u0001\u0000\u0000"+
		"\u0000\u02b9\u02b7\u0001\u0000\u0000\u0000\u02ba\u02bb\u0003b1\u0000\u02bb"+
		"\u02bc\u0005&\u0000\u0000\u02bc\u02bd\u0003f3\u0000\u02bd\u02be\u0005"+
		"\'\u0000\u0000\u02bee\u0001\u0000\u0000\u0000\u02bf\u02c4\u0003h4\u0000"+
		"\u02c0\u02c1\u0005.\u0000\u0000\u02c1\u02c3\u0003h4\u0000\u02c2\u02c0"+
		"\u0001\u0000\u0000\u0000\u02c3\u02c6\u0001\u0000\u0000\u0000\u02c4\u02c2"+
		"\u0001\u0000\u0000\u0000\u02c4\u02c5\u0001\u0000\u0000\u0000\u02c5\u02c8"+
		"\u0001\u0000\u0000\u0000\u02c6\u02c4\u0001\u0000\u0000\u0000\u02c7\u02c9"+
		"\u0005.\u0000\u0000\u02c8\u02c7\u0001\u0000\u0000\u0000\u02c8\u02c9\u0001"+
		"\u0000\u0000\u0000\u02c9g\u0001\u0000\u0000\u0000\u02ca\u02cb\u0005<\u0000"+
		"\u0000\u02cb\u02cc\u0005,\u0000\u0000\u02cc\u02d3\u0003j5\u0000\u02cd"+
		"\u02cf\u0003j5\u0000\u02ce\u02cd\u0001\u0000\u0000\u0000\u02cf\u02d2\u0001"+
		"\u0000\u0000\u0000\u02d0\u02ce\u0001\u0000\u0000\u0000\u02d0\u02d1\u0001"+
		"\u0000\u0000\u0000\u02d1\u02d4\u0001\u0000\u0000\u0000\u02d2\u02d0\u0001"+
		"\u0000\u0000\u0000\u02d3\u02d0\u0001\u0000\u0000\u0000\u02d3\u02d4\u0001"+
		"\u0000\u0000\u0000\u02d4i\u0001\u0000\u0000\u0000\u02d5\u02d7\u0005@\u0000"+
		"\u0000\u02d6\u02d8\u0005:\u0000\u0000\u02d7\u02d6\u0001\u0000\u0000\u0000"+
		"\u02d7\u02d8\u0001\u0000\u0000\u0000\u02d8\u02de\u0001\u0000\u0000\u0000"+
		"\u02d9\u02de\u0005;\u0000\u0000\u02da\u02de\u0005B\u0000\u0000\u02db\u02de"+
		"\u0005=\u0000\u0000\u02dc\u02de\u0005?\u0000\u0000\u02dd\u02d5\u0001\u0000"+
		"\u0000\u0000\u02dd\u02d9\u0001\u0000\u0000\u0000\u02dd\u02da\u0001\u0000"+
		"\u0000\u0000\u02dd\u02db\u0001\u0000\u0000\u0000\u02dd\u02dc\u0001\u0000"+
		"\u0000\u0000\u02dek\u0001\u0000\u0000\u0000\u02df\u02e1\u0003n7\u0000"+
		"\u02e0\u02df\u0001\u0000\u0000\u0000\u02e1\u02e4\u0001\u0000\u0000\u0000"+
		"\u02e2\u02e0\u0001\u0000\u0000\u0000\u02e2\u02e3\u0001\u0000\u0000\u0000"+
		"\u02e3\u02e6\u0001\u0000\u0000\u0000\u02e4\u02e2\u0001\u0000\u0000\u0000"+
		"\u02e5\u02e7\u0005O\u0000\u0000\u02e6\u02e5\u0001\u0000\u0000\u0000\u02e6"+
		"\u02e7\u0001\u0000\u0000\u0000\u02e7\u02eb\u0001\u0000\u0000\u0000\u02e8"+
		"\u02ea\u0003n7\u0000\u02e9\u02e8\u0001\u0000\u0000\u0000\u02ea\u02ed\u0001"+
		"\u0000\u0000\u0000\u02eb\u02e9\u0001\u0000\u0000\u0000\u02eb\u02ec\u0001"+
		"\u0000\u0000\u0000\u02ec\u02ef\u0001\u0000\u0000\u0000\u02ed\u02eb\u0001"+
		"\u0000\u0000\u0000\u02ee\u02f0\u0005Q\u0000\u0000\u02ef\u02ee\u0001\u0000"+
		"\u0000\u0000\u02ef\u02f0\u0001\u0000\u0000\u0000\u02f0\u02f4\u0001\u0000"+
		"\u0000\u0000\u02f1\u02f3\u0003n7\u0000\u02f2\u02f1\u0001\u0000\u0000\u0000"+
		"\u02f3\u02f6\u0001\u0000\u0000\u0000\u02f4\u02f2\u0001\u0000\u0000\u0000"+
		"\u02f4\u02f5\u0001\u0000\u0000\u0000\u02f5\u02fa\u0001\u0000\u0000\u0000"+
		"\u02f6\u02f4\u0001\u0000\u0000\u0000\u02f7\u02f9\u0003p8\u0000\u02f8\u02f7"+
		"\u0001\u0000\u0000\u0000\u02f9\u02fc\u0001\u0000\u0000\u0000\u02fa\u02f8"+
		"\u0001\u0000\u0000\u0000\u02fa\u02fb\u0001\u0000\u0000\u0000\u02fbm\u0001"+
		"\u0000\u0000\u0000\u02fc\u02fa\u0001\u0000\u0000\u0000\u02fd\u02fe\u0007"+
		"\u0006\u0000\u0000\u02feo\u0001\u0000\u0000\u0000\u02ff\u0301\u0003\u0086"+
		"C\u0000\u0300\u02ff\u0001\u0000\u0000\u0000\u0301\u0304\u0001\u0000\u0000"+
		"\u0000\u0302\u0300\u0001\u0000\u0000\u0000\u0302\u0303\u0001\u0000\u0000"+
		"\u0000\u0303\u0305\u0001\u0000\u0000\u0000\u0304\u0302\u0001\u0000\u0000"+
		"\u0000\u0305\u0309\u0003r9\u0000\u0306\u0308\u0003\u0086C\u0000\u0307"+
		"\u0306\u0001\u0000\u0000\u0000\u0308\u030b\u0001\u0000\u0000\u0000\u0309"+
		"\u0307\u0001\u0000\u0000\u0000\u0309\u030a\u0001\u0000\u0000\u0000\u030a"+
		"q\u0001\u0000\u0000\u0000\u030b\u0309\u0001\u0000\u0000\u0000\u030c\u0312"+
		"\u0003t:\u0000\u030d\u0312\u0003v;\u0000\u030e\u0312\u0003x<\u0000\u030f"+
		"\u0312\u0005R\u0000\u0000\u0310\u0312\u0005L\u0000\u0000\u0311\u030c\u0001"+
		"\u0000\u0000\u0000\u0311\u030d\u0001\u0000\u0000\u0000\u0311\u030e\u0001"+
		"\u0000\u0000\u0000\u0311\u030f\u0001\u0000\u0000\u0000\u0311\u0310\u0001"+
		"\u0000\u0000\u0000\u0312s\u0001\u0000\u0000\u0000\u0313\u0314\u0005T\u0000"+
		"\u0000\u0314\u0318\u0005_\u0000\u0000\u0315\u0317\u0003\u0082A\u0000\u0316"+
		"\u0315\u0001\u0000\u0000\u0000\u0317\u031a\u0001\u0000\u0000\u0000\u0318"+
		"\u0316\u0001\u0000\u0000\u0000\u0318\u0319\u0001\u0000\u0000\u0000\u0319"+
		"\u031b\u0001\u0000\u0000\u0000\u031a\u0318\u0001\u0000\u0000\u0000\u031b"+
		"\u031c\u0005]\u0000\u0000\u031cu\u0001\u0000\u0000\u0000\u031d\u031e\u0005"+
		"T\u0000\u0000\u031e\u0322\u0005Y\u0000\u0000\u031f\u0321\u0003\u0082A"+
		"\u0000\u0320\u031f\u0001\u0000\u0000\u0000\u0321\u0324\u0001\u0000\u0000"+
		"\u0000\u0322\u0320\u0001\u0000\u0000\u0000\u0322\u0323\u0001\u0000\u0000"+
		"\u0000\u0323\u0326\u0001\u0000\u0000\u0000\u0324\u0322\u0001\u0000\u0000"+
		"\u0000\u0325\u0327\u0005\u001d\u0000\u0000\u0326\u0325\u0001\u0000\u0000"+
		"\u0000\u0326\u0327\u0001\u0000\u0000\u0000\u0327\u0328\u0001\u0000\u0000"+
		"\u0000\u0328\u0329\u0007\u0007\u0000\u0000\u0329w\u0001\u0000\u0000\u0000"+
		"\u032a\u032b\u0005T\u0000\u0000\u032b\u032f\u0005X\u0000\u0000\u032c\u032e"+
		"\u0003\u0082A\u0000\u032d\u032c\u0001\u0000\u0000\u0000\u032e\u0331\u0001"+
		"\u0000\u0000\u0000\u032f\u032d\u0001\u0000\u0000\u0000\u032f\u0330\u0001"+
		"\u0000\u0000\u0000\u0330\u0332\u0001\u0000\u0000\u0000\u0331\u032f\u0001"+
		"\u0000\u0000\u0000\u0332\u0334\u0005\\\u0000\u0000\u0333\u0335\u0003z"+
		"=\u0000\u0334\u0333\u0001\u0000\u0000\u0000\u0334\u0335\u0001\u0000\u0000"+
		"\u0000\u0335\u0336\u0001\u0000\u0000\u0000\u0336\u0337\u0005S\u0000\u0000"+
		"\u0337\u0338\u0005X\u0000\u0000\u0338\u0339\u0005\\\u0000\u0000\u0339"+
		"y\u0001\u0000\u0000\u0000\u033a\u033c\u0003|>\u0000\u033b\u033a\u0001"+
		"\u0000\u0000\u0000\u033c\u033f\u0001\u0000\u0000\u0000\u033d\u033b\u0001"+
		"\u0000\u0000\u0000\u033d\u033e\u0001\u0000\u0000\u0000\u033e{\u0001\u0000"+
		"\u0000\u0000\u033f\u033d\u0001\u0000\u0000\u0000\u0340\u0348\u0003~?\u0000"+
		"\u0341\u0348\u0003r9\u0000\u0342\u0348\u0005P\u0000\u0000\u0343\u0348"+
		"\u0003\u0086C\u0000\u0344\u0348\u0005R\u0000\u0000\u0345\u0348\u0005?"+
		"\u0000\u0000\u0346\u0348\u0005,\u0000\u0000\u0347\u0340\u0001\u0000\u0000"+
		"\u0000\u0347\u0341\u0001\u0000\u0000\u0000\u0347\u0342\u0001\u0000\u0000"+
		"\u0000\u0347\u0343\u0001\u0000\u0000\u0000\u0347\u0344\u0001\u0000\u0000"+
		"\u0000\u0347\u0345\u0001\u0000\u0000\u0000\u0347\u0346\u0001\u0000\u0000"+
		"\u0000\u0348}\u0001\u0000\u0000\u0000\u0349\u034a\u0007\b\u0000\u0000"+
		"\u034a\u007f\u0001\u0000\u0000\u0000\u034b\u034c\u0005^\u0000\u0000\u034c"+
		"\u034d\u0007\t\u0000\u0000\u034d\u0081\u0001\u0000\u0000\u0000\u034e\u0350"+
		"\u0005`\u0000\u0000\u034f\u0351\u0003\u0080@\u0000\u0350\u034f\u0001\u0000"+
		"\u0000\u0000\u0350\u0351\u0001\u0000\u0000\u0000\u0351\u035f\u0001\u0000"+
		"\u0000\u0000\u0352\u0354\u0005a\u0000\u0000\u0353\u0355\u0003\u0080@\u0000"+
		"\u0354\u0353\u0001\u0000\u0000\u0000\u0354\u0355\u0001\u0000\u0000\u0000"+
		"\u0355\u035f\u0001\u0000\u0000\u0000\u0356\u0358\u0005b\u0000\u0000\u0357"+
		"\u0359\u0003\u0080@\u0000\u0358\u0357\u0001\u0000\u0000\u0000\u0358\u0359"+
		"\u0001\u0000\u0000\u0000\u0359\u035f\u0001\u0000\u0000\u0000\u035a\u035c"+
		"\u0005_\u0000\u0000\u035b\u035d\u0003\u0080@\u0000\u035c\u035b\u0001\u0000"+
		"\u0000\u0000\u035c\u035d\u0001\u0000\u0000\u0000\u035d\u035f\u0001\u0000"+
		"\u0000\u0000\u035e\u034e\u0001\u0000\u0000\u0000\u035e\u0352\u0001\u0000"+
		"\u0000\u0000\u035e\u0356\u0001\u0000\u0000\u0000\u035e\u035a\u0001\u0000"+
		"\u0000\u0000\u035f\u0083\u0001\u0000\u0000\u0000\u0360\u0363\u0003\u0086"+
		"C\u0000\u0361\u0363\u0005I\u0000\u0000\u0362\u0360\u0001\u0000\u0000\u0000"+
		"\u0362\u0361\u0001\u0000\u0000\u0000\u0363\u0085\u0001\u0000\u0000\u0000"+
		"\u0364\u0365\u0007\n\u0000\u0000\u0365\u0087\u0001\u0000\u0000\u0000V"+
		"\u008f\u0093\u009b\u00a7\u00ad\u00bd\u00c6\u00d5\u00dd\u00e2\u00e6\u00f0"+
		"\u00f6\u0109\u0112\u0115\u0118\u0127\u012d\u0137\u013b\u013f\u0145\u014c"+
		"\u0150\u0155\u015d\u0162\u0166\u016a\u016e\u0170\u017c\u0192\u0198\u019d"+
		"\u01a7\u01a9\u01be\u01c3\u01db\u01e0\u01eb\u0222\u0226\u0228\u022f\u0235"+
		"\u023a\u0241\u0258\u0267\u0280\u0288\u02a5\u02ab\u02b1\u02b7\u02c4\u02c8"+
		"\u02d0\u02d3\u02d7\u02dd\u02e2\u02e6\u02eb\u02ef\u02f4\u02fa\u0302\u0309"+
		"\u0311\u0318\u0322\u0326\u032f\u0334\u033d\u0347\u0350\u0354\u0358\u035c"+
		"\u035e\u0362";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}