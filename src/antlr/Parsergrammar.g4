parser grammar Parsergrammar;

options { tokenVocab = Lexergrammmar; }

ast:
tsDocument htmlDocument cssDocument;

tsDocument:
(importStatement+ (componentDecorator | injectableDecorator) classDeclaration);

classDeclaration:
EXPORT CLASS IDENTIFIER implementsClause? LBRACE classBody RBRACE ;

implementsClause:
IMPLEMENTS (IDENTIFIER | CROISNN) (COMMA (IDENTIFIER | CROISNN))*;

classBody:
classBodyStatement*;

////////modified
classBodyStatement
  : variableAssign              #VariableAssignmentStatement
  | methodvoid                  #VoidMethodDeclarationStatement
  | variableDeclaration         #VariableDeclarationStatement
  | arrayExpression1            #ArrayExprOneStatement
  | arrayExpression2            #ArrayExprTwoStatement
  | arrayExpression3            #ArrayExprThreeStatement
  | methodDeclaration           #TypedMethodDeclarationStatement
  | constructorDeclaration      #ConstructorDeclarationStatement
  | signalDeclaration           #SignalDeclarationStatement
  | ngOnInitMETHOD              #NgOnInitMethodStatement
  | asObservable                #AsObservableStatement
  | observable                  #ObservableStatement
  | objectExpression            #ObjectExpressionStatement
  ;


importStatement:
IMPORT LBRACE importBody (COMMA importBody)*RBRACE FROM(STRING_LITERAL) SEMICOLON;



importBody:
IDENTIFIER
|CROISNN
|COMPONENT
|INJECTABLE
|BEHAVIOR_SUBJECT
|OBSERVABLE
|ROUTER
;


componentDecorator:
AT COMPONENT LPAREN LBRACE componentProperties? RBRACE RPAREN ;


componentProperties:
(selector COMMA)? (imports COMMA)? templateurl styleurl?;

selector:
SELECTOR COLON STRING_LITERAL ;

imports:
IMPORTS COLON LBRACKET (IDENTIFIER |CROISNN)?(COMMA (IDENTIFIER | CROISNN))*? RBRACKET;

styleurl:
STYLEURL COLON STRING_LITERAL;

templateurl:
TEMPLATEURL COLON STRING_LITERAL COMMA;



injectableDecorator:
AT INJECTABLE LPAREN LBRACE providedin? RBRACE RPAREN;

providedin:
PROVIDEDIN COLON STRING_LITERAL (COMMA)?;

signature:
ACCESS? STATIC? IDENTIFIER;

values:
NULL | NUMBER | STRING_LITERAL | BOOLEAN;

parameters:
IDENTIFIER COLON TYPE (COMMA IDENTIFIER COLON TYPE)*;


methodDeclaration:
signature LPAREN parameters? RPAREN LBRACE methodBody RBRACE;


////////////done j
methodBody:
RETURN ((THIS DOT)?IDENTIFIER (DOT VALUE)?|values) SEMICOLON ;

////////modified
objectExpression:
(IDENTIFIER ASSIGN)?LBRACE ((PATH | COMPONENT | REDIRECTTO | PATHMATCH | IDENTIFIER) COLON values COMMA?)* RBRACE SEMICOLON?;

arrayExpression1:
signature ASSIGN LBRACKET arraybody1* RBRACKET SEMICOLON? ;

/////modified
arraybody1:
objectExpression COMMA? | NUMBER COMMA? | STRING_LITERAL COMMA?;

arrayExpression2:
signature COLON TYPE LBRACKET RBRACKET ASSIGN LBRACKET arraybody2* RBRACKET SEMICOLON;

arraybody2:
objectExpression COMMA NUMBER COMMA STRING_LITERAL;

////modifiedddddd new rule
arrayExpression3:
signature ASSIGN NEW BEHAVIOR_SUBJECT observableArray LPAREN LBRACKET arraybody1* RBRACKET RPAREN SEMICOLON? ;


//////////done j
constructorDeclaration:
    CONSTRUCTOR LPAREN (constructorParam (COMMA constructorParam)*)? RPAREN LBRACE RBRACE;

constructorParam:
    ACCESS? IDENTIFIER COLON (IDENTIFIER | ROUTER);

variableDeclaration:
signature COLON TYPE ASSIGN values SEMICOLON;

variableAssign:
IDENTIFIER ASSIGN values SEMICOLON ;
////modified (COLON VOIDTYPE)?
methodvoid:
signature LPAREN parameters? RPAREN (COLON VOIDTYPE)? LBRACE methodvoidbody RBRACE ;

////////////// all modified
methodvoidbody:
    (methodAssignment | crudBodyRule | ifStatement)*
    ;

methodAssignment:
      thisDotIdentifierAssign       # ThisDotIdentifierAssignRule
    | thisDotIdentifierAssignValues # ThisDotIdentifierAssignValuesRule
    | identifierAssignment          # IdentifierAssignmentRule
    | thisDotIdentifierAssignWithBraces # ThisDotIdentifierAssignWithBracesRule
    | staticAssignment              # StaticAssignmentRule
    ;

thisDotIdentifierAssign:    //DONE
    THIS DOT IDENTIFIER DOLLAR_SIGN ASSIGN THIS DOT IDENTIFIER DOT IDENTIFIER DOLLAR_SIGN SEMICOLON
    ;

thisDotIdentifierAssignValues:      //DONE
    THIS DOT IDENTIFIER ASSIGN (IDENTIFIER | values) SEMICOLON
    ;

identifierAssignment:   //DONE
    (THIS DOT)? IDENTIFIER (ASSIGN THIS DOT IDENTIFIER (DOT methodcall) | DOT methodcall) SEMICOLON
    ;

crudBodyRule:   //DONE
    crudBody nextCall SEMICOLON
    ;

thisDotIdentifierAssignWithBraces:  //DONE
    THIS DOT IDENTIFIER ASSIGN LBRACE THREE_DOTS IDENTIFIER RBRACE SEMICOLON
    ;

staticAssignment:   //DONE
    STATIC IDENTIFIER ASSIGN LBRACE THREE_DOTS THIS DOT IDENTIFIER COMMA IDENTIFIER COLON DATE DOT methodcall RBRACE SEMICOLON
    ;

ifStatement:        //DONE
    IF LPAREN THIS DOT IDENTIFIER QUESTION_MARK DOT IDENTIFIER THREE_ASSIGN IDENTIFIER RPAREN LBRACE ifBody RBRACE
    ;

ifBody:     //DONE
    (THIS DOT IDENTIFIER ASSIGN values SEMICOLON)+
    ;


//(THIS DOT IDENTIFIER DOLLAR_SIGN? ASSIGN
 //(LBRACE THREE_DOTS IDENTIFIER RBRACE)|
//(THIS DOT IDENTIFIER ((DOT IDENTIFIER DOLLAR_SIGN)|(DOT methodcall)|(crudBody nextCall))|values) SEMICOLON);


methodcall:         //DONE
(IDENTIFIER | NAVIGATE | NOW) LPAREN ((THIS DOT)?IDENTIFIER|(LBRACKET STRING_LITERAL RBRACKET))? RPAREN ;


ngOnInitMETHOD:     //DONE
ACCESS? NGONINIT LPAREN  RPAREN (COLON VOIDTYPE)? LBRACE methodvoidbody RBRACE ;


/////////
signalDeclaration:
IDENTIFIER ASSIGN CROISNN LPAREN STRING_LITERAL RPAREN SEMICOLON ;
///////




crudBody: //DONE
THIS DOT IDENTIFIER DOT (NEXT|VALUE);

nextCall: //DONE
 LPAREN (addCall | edit_delete_call) RPAREN;

addCall: //DONE
LBRACKET THREE_DOTS  crudBody COMMA IDENTIFIER RBRACKET;

edit_delete_call: //DONE
 crudBody DOT (map | filter) ;

map: //DONE
MAP LPAREN leftMapFilterAssign THREE_ASSIGN rightMapFilterAssign RPAREN;

filter: //DONE
FILTER LPAREN leftMapFilterAssign NOT_THREE_ASSIGN rightMapFilterAssign RPAREN;

leftMapFilterAssign: //DONE
IDENTIFIER ASSIGN_TAG mapFilterIDENTIFIER;

rightMapFilterAssign: //DONE
(mapFilterIDENTIFIER QUESTION_MARK mapFilterIDENTIFIER) | IDENTIFIER;

mapFilterIDENTIFIER: //DONE /////// class and visitor
(IDENTIFIER DOT IDENTIFIER) | (IDENTIFIER COLON IDENTIFIER);

asObservable:       //DONE
IDENTIFIER DOLLAR_SIGN ASSIGN THIS DOT IDENTIFIER DOT methodcall SEMICOLON  ;

observable:         //DONE
IDENTIFIER DOLLAR_SIGN INTERJECTION COLON OBSERVABLE observableArray SEMICOLON;


observableArray:    //DONE
TAG_OPEN ANY LBRA RBRA TAG_CLOSE;

///////////////////////////////////////////////// قواعد الـ CSS /////////////////////////////////////////////


cssDocument:
ruleSet*;
//mod

selectorincss
    : (DOT | HASH) IDENTIFIER
    | TAGSFORCSS
    ;
ruleSetStart:
first=selectorincss(WS* TAGSFORCSS)*;
//mod
ruleSet:
ruleSetStart LBRACE declarationList RBRACE;

declarationList:
declaration (SEMICOLON declaration)* SEMICOLON?;

declaration:
PROPERTY_NAME COLON value (value*)?;

value:
     NUMBER UNIT?
    | COLOR
    | STRING
    | VALUE_KEYWORD
    | IDENTIFIER;

/////////////////////////////////////////////////////قواعد ال html/////////////////////////////////////////////////////////////



htmlDocument:
scriptletOrSeaWs* XML? scriptletOrSeaWs* DTD? scriptletOrSeaWs* htmlElements*;

scriptletOrSeaWs:
SCRIPTLET |WS;

htmlElements:
htmlComment* htmlElement htmlComment*;

//modi
htmlElement
    : tsTag            #TsTagElement
    | noEndTag         #NoEndTagElement
    | normalTag        #NormalTagElement
    | SCRIPTLET        #ScriptletElement
    | INTERPOLATION    #InterpolationElement
    ;

//mod
tsTag:
TAG_OPEN TAG_NAME htmlAttribute* TAG_SLASH_CLOSE ;
//mod
noEndTag:
TAG_OPEN TAGS_VOID htmlAttribute* REQUIRED? (TAG_SLASH_CLOSE| TAG_CLOSE) ;
//mod
normalTag:
TAG_OPEN TAGS htmlAttribute* TAG_CLOSE htmlContent? TAG_OPEN_SLASH TAGS TAG_CLOSE ;
//modi
htmlContent
    : htmlContentStatement*
    ;

htmlContentStatement:
      htmlChardata      #HtmlCharDataStatement
    | htmlElement       #HtmlElementStatement
    | CDATA             #HtmlCDataStatement
    | htmlComment       #HtmlCommentStatement
    | SCRIPTLET         #HtmlScriptletStatement
    | IDENTIFIER        #HtmlIdentifierStatement
    | COLON             #HtmlColonStatement
    ;

htmlChardata:
     HTML_TEXT
    | WS;

//mod
tagAtt:
TAG_EQUALS (METHOD_CALL_VALUE| ATTVALUE_VALUE);
//mod
htmlAttribute
    : STRUCTURAL_DIRECTIVE tagAtt?  # StructuralDirectiveAttribute
    | ATTRIBUTE_BINDING tagAtt?     # AttributeBinding
    | EVENT_BINDING tagAtt?         # EventBinding
    | TAG_NAME tagAtt?              # TagNameAttribute
    ;

htmlMisc:
     htmlComment
    | WS;

htmlComment:
     HTML_COMMENT
    | HTML_CONDITIONAL_COMMENT;



