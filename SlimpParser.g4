parser grammar SlimpParser;

options
{
   tokenVocab = SlimpLexer;
}

program
    : declaration* EOF
    ;

declaration
    : globalVariable
    | function
    ;

globalVariable
    : declarationStatement
    | assignmentStatement
    ;

function
    : 'fun' identifier '(' functionParams? ')' (':' functionReturnType)? block
    ;

functionParams
    :   functionParam (',' functionParam)* ','?
    ;

functionParam
    : '&'? typedIdentifier
    ;

functionReturnType
    : type
    ;

block
    : '{' statement* '}'
    ;

statement
    : ';'
    | declarationStatement
    | assignmentStatement
    | expressionStatement
    | blockStatement
    | ('return' expression | 'break' | 'continue') ';'
    ;

declarationStatement
    : typedIdentifier ';'
    ;

assignmentStatement
    : pattern '=' expression ';'
    ;

expressionStatement
    : expression ';'
    ;


blockStatement
    : ifStatement
    | forLoop
    | whileLoop
    ;

ifStatement
    : 'if' expression block
    (
        'else' (block | ifStatement)
    )?
    ;

forLoop
    : 'for' pattern '<-' expression block
    ;

whileLoop
    : 'while' expression block
    ;

expression
    : literal                                   #LiteralExpression
    | identifier '(' expressionElements ')'     #FunctionCallExpression
    | expression '[' expression ']'             #IndexingExpression
    | expression 'as' type                      #TypeCastExpression
    | '!' expression                            #LogicalExpression
    | expression ('&&' | '||') expression       #LogicalExpression
    | expression comparisonOperator expression  #LogicalExpression
    | '-' expression                            #ArithmeticExpression
    | expression arithmeticOperator expression  #ArithmeticExpression
    | expression '..' expression                #RangeExpression
    | '(' expression ')'                        #ParenthesizedExpression
    | '(' expressionElements ')'                #TupleExpression
    | '[' expressionElements ']'                #ArrayExpression
    | '{' mapExpressionElements '}'             #MapExpression
    ;

expressionElements
    : (expression ',')* expression?
    ;

mapExpressionElements
    : (expression '->' expression ',')* (expression '->' expression)?
    ;

comparisonOperator
    : '=='
    | '!='
    | '>'
    | '<'
    | '>='
    | '<='
    ;

arithmeticOperator
    : '+'
    | '-'
    | '*'
    | '/'
    | '//'
    | '%'
    ;

literal
    : INTEGER_LITERAL
    | FLOAT_LITERAL
    | CHAR_LITERAL
    | STRING_LITERAL
    | KW_FALSE
    | KW_TRUE
    ;

identifier
    : IDENTIFIER
    ;

typedIdentifier
    : identifier ':' type
    ;

type
    : IDENTIFIER                    #TypeIdentifier
    | '(' type ')'                  #ParenthesizedType
    | '(' tupleTypeElements ')'     #TupleType
    | '[' type ';' expression ']'   #ArrayType
    | '{' type '->' type '}'        #MapType
    ;

tupleTypeElements
    : (type ',')* type?
    ;

pattern
    : literal                       #PatternLiteral
    | IDENTIFIER                    #UntypedPatternIdentifier
    | IDENTIFIER ':' type           #TypedPatternIdentifier
    | '_'                           #WildCardPattern
    | '(' pattern ')'               #ParenthesizedPattern
    | '(' patternElements ')'       #TuplePattern
    | '[' patternElements ']'       #ArrayPattern
    | '{' mapPatternElements '}'    #MapPattern
    ;

patternElements
    : (pattern ',')* pattern?
    ;

mapPatternElements
    : (pattern '->' pattern ',')* (pattern '->' pattern)?
    ;
