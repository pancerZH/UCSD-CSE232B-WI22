grammar ExpressionGrammar ;

@header {
package edu.ucsd.CSE232B.parsers;
}

/*Rules*/
ap: doc pathOp rp;
rp: tagName #UnaryRp1 | attName #UnaryRp2| TEXT #UnaryRp3| STAR #UnaryRp4| SELF #UnaryRp5| PENT #UnaryRp6
    | rp pathOp rp #BinaryRp1| rp COMMA rp #BinaryRp2
    | LPR rp RPR  #ParaRp
    | rp LSB filter RSB #FilterRp;
filter: rp #UnaryFt
    | rp compOp rp #BinaryFt1 | rp EQS StringConstant #BinaryFt2
    | LPR filter RPR #ParaFt
    | filter CONJ filter #CompoundFt
    | NEG filter #NegFt;

pathOp:
SL | DSL;

doc:
DOC LPR DQ StringConstant DQ RPR; // TODO: https://canvas.ucsd.edu/courses/32790/discussion_topics/406595

tagName:
StringConstant;

attName:
AT StringConstant;

compOp:
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
TEXT: 'text()';
AT: '@';
DOC: 'doc';
DQ: '"';
StringConstant: [a-zA-Z_0-9.]+; // TODO: Loose restriction.
WS: [ \t\n\r]+ -> skip;

