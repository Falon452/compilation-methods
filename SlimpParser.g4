parser grammar SlimpParser;


program
    : declaration* EOF
    ;

declaration
    :
    (
        globalVariable // todo
        | function
    )
    ;

function
    : 'fun' IDENTIFIER '(' functionParams? '):' functionReturnType block
    ;

functionParams
    :   pattern (',' pattern)* ','?
    ;

functionReturnType
    : type
    ;

block
    : TODO
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
    : '(' (type ',')+ type? ')'
    ;

arrayType
    : '[' type ';' expression ']'  // todo expression
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
    : IDENTIFIER ':' type
    | '_'
    ;

parenthesizedPattern
    : '(' pattern ')'
    ;

tuplePattern
    : '(' (pattern ',')+ pattern? ')'
    ;

arrayPattern
    : '[' pattern ';' expression ']'  // todo expression
    ;

mapPattern
    : '{' pattern '->' pattern '}'
    ;
