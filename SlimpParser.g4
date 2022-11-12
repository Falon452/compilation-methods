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
    : 'fun' IDENTIFIER '(' functionParams? ')' (':' functionReturnType)? block
    ;

functionParams
    :   '&'? typedPatternIdentifier (',' '&'? typedPatternIdentifier)* ','?
    ;

functionReturnType
    : type
    ;

block
    : '{' statement* '}'
    ;

// statements

statement
    : ';'
    | declarationStatement
    | assignmentStatement
    | expressionStatement
    | blockStatement
    | ('return' expression | 'break' | 'continue') ';'
    ;

declarationStatement
    : typedPatternIdentifier ';'
    ;

assignmentStatement
    : pattern '=' expression ';'
    ;

expressionStatement
    : expression ';'
    ;

expression
    : literalExpression
    | IDENTIFIER '(' callParams ')'
    | expression '[' expression ']'
    | expression 'as' type
    | ('-' | '!') expression
    | expression ('&&' | '||') expression
    | expression comparisonOperator expression
    | expression arithmeticOperator expression
    | expression '..' expression
    | '(' expression ')'
    | '(' tupleElements ')'
    | '[' arrayElements ']'
    | '{' mapElements '}'
    ;

callParams
    : (expression ',')* expression?
    ;

arrayElements
   : (expression ',')* expression?
   ;

tupleElements
   : (expression ',')* expression?
   ;

mapElements
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

// literals

literalExpression
    : INTEGER_LITERAL
    | FLOAT_LITERAL
    | CHAR_LITERAL
    | STRING_LITERAL
    | KW_FALSE
    | KW_TRUE
    ;

// types

type
    : typeIdentifier
    | parenthesizedType
    | tupleType
    | arrayType
    | mapType
    ;

typeIdentifier
    : IDENTIFIER
    ;

parenthesizedType
    : '(' type ')'
    ;

tupleType
    : '(' (type ',')* type? ')'
    ;

arrayType
    : '[' type ';' expression ']'
    ;

mapType
    : '{' type '->' type '}'
    ;

// patterns

pattern
    : untypedPatternIdentifier
    | typedPatternIdentifier
    | wildCardPattern
    | parenthesizedPattern
    | tuplePattern
    | arrayPattern
    | mapPattern
    ;

patternLiteral
    : literalExpression
    ;

typedPatternIdentifier
    : IDENTIFIER ':' type
    ;

untypedPatternIdentifier
    : IDENTIFIER
    ;

wildCardPattern
    : '_'
    ;

parenthesizedPattern
    : '(' pattern ')'
    ;

tuplePattern
    : '(' (pattern ',')* pattern? ')'
    ;

arrayPattern
    : '[' (pattern ',')* pattern? ']'
    ;

mapPattern
    : '{' (pattern '->' pattern ',')* (pattern '->' pattern)? '}'
    ;
