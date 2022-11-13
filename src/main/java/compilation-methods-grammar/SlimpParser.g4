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
    : IDENTIFIER COLON type '=' expression SEMI
    ;

expression
   : MINUS? component (operatorAdd component)*
   | MINUS? component (operatorAdd component)* operatorEquation MINUS? component (operatorAdd component)*
   ;

operatorEquation
    : SLASHEQ
    | SLASHSLASHEQ
    | EQ
    | EQEQ
    | NE
    | GT
    | LT
    | GE
    | LE
    ;

operatorAdd
    : PLUS
    | MINUS
    ;

component
    : factor (operatorMul factor)*;

operatorMul
    : STAR
    | SLASH
    ;

factor
    : INTEGER_LITERAL
    | expressionInParanthesis
    ;

expressionInParanthesis
    : '(' expression ')'
    ;

function
    : 'fun' IDENTIFIER '(' functionParams? ')' ':' functionReturnType blockExpression
    ;

functionParams
    :   pattern (',' pattern)* ','?
    ;

functionReturnType
    : type
    ;

blockExpression
    : '{' statement* '}'
    ;

// statements

statement
    : ';'
    | declarationStatement
    | expressionStatement
    ;

declarationStatement
    : pattern '=' expression ';'
    ;

expressionStatement
    : expression ';'
    | expressionWithBlock ';'?
    ;

expressionWithBlock
    : ifExpression
    ;

ifExpression
    : 'if' expression blockExpression
    (
        'else' (blockExpression | ifExpression)
    )?
    ;

// literals

literal
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
    : INT
    | CHAR
    | BOOL
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
    : patternIdentifier
    | parenthesizedPattern
    | tuplePattern
    | arrayPattern
    | mapPattern
    ;

patternLiteral
    : literal // todo
    ;

patternIdentifier
    : IDENTIFIER ':' type  // sometimes patterns do not need to be typed
    | '_'
    ;

parenthesizedPattern
    : '(' pattern ')'
    ;

tuplePattern
    : '(' (pattern ',')* pattern? ')'
    ;

arrayPattern
    : '[' ']'  // todo this need to be taken care of
    ;

mapPattern
    : '{' (pattern '->' pattern ',')* (pattern '->' pattern)? '}'
    ;