grammar ExpressionGrammar ;

@header {
package edu.ucsd.CSE232B.parsers;
}

/*Rules*/
ap: doc SL rp EOF
| doc DSL rp EOF;
rp: tagName | STAR | SELF | PENT | text | attName
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
SELF: '.';
PENT: '..';
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

