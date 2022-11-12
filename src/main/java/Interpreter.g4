
grammar Interpreter;

//@header {
//package com.antlr.playground.Interpreter;
//}


start :
     expression
  ;

expression
   :
   |   INT
   |   expression (PLUS | MINUS) expression
   |  '(' expression ')'
   ;

PLUS   :  '+';
MINUS  :  '-';
INT    :  '0'..'9'+;