grammar ExpressionGrammar ;

@header {
package edu.ucsd.CSE232B.parsers;
}

///*Rules*/
//prog :	(exp)+  EOF;
//exp:	exp OP exp      #Expr_Binary
//    |	number          #Expr_Number
//    |   variable        #Expr_Variable
//    |	LPR exp RPR     #Expr_Parentheses
//    ;
//number:
// NUM
//;
//variable:
//ID
//;
//
///*Tokens*/
//LPR: '(';
//RPR: ')';
//OP : ('*'|'/' | '+');
//ID : [a-zA-Z][a-zA-Z_0-9]*;
//NUM :  '0' | '-'?[1-9][0-9]* ;
//WS: [ \t\n\r]+ -> skip;

/*Rules*/
ap: doc SL rp EOF
| doc DSL rp EOF;
rp: tagName | STAR | SL | DSL | text | attName
| LPR rp RPR | rp SL rp | rp DSL rp | rp LSB filter RSB | rp COMMA rp;
filter: rp | rp comp rp | rp EQS StringConstant
| LPR filter RPR | filter CONJ filter | NEG filter;

doc:
StringConstant;

tagName:
StringConstant;

text:
StringConstant;

attName:
StringConstant;

comp:
EQS | EQ | ISS | IS;

/*Tokens*/
SL: '/';
DSL: '//';
STAR: '*';
LPR: '(';
RPR: ')';
LSB: '[';
RSB: ']';
COMMA: ',';
EQS: '=';
EQ: 'eq';
ISS: '==';
IS: 'is';
NEG: 'not';
CONJ: ('and' | 'or');
StringConstant: [a-zA-Z_0-9.]+; // TODO: Loose restriction.
WS: [ \t\n\r]+ -> skip;

