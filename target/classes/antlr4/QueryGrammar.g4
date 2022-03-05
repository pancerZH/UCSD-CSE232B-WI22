grammar QueryGrammar ;
import ExpressionGrammar;


/*Rules*/
    xq: VAR #VarXq | STRING #StringXq | ap #ApXq
    | LPR xq RPR #ParaXq | xq COMMA xq #BinaryXq | xq pathOp rp #RpXq
    | startTag LBB xq RBB endTag #TagXq
    | forClause (letClause)? (whereClause)? returnClause #ForXq
    | letClause xq #LetXq;

constanList: LSB ID (COMMA ID)* RSB;
joinClause: JOIN LPR xq COMMA xq COMMA constanList COMMA constanList RPR
    | JOIN LPR joinClause COMMA xq COMMA constanList COMMA constanList RPR
    | JOIN LPR xq COMMA joinClause COMMA constanList COMMA constanList RPR;

forClause: FOR VAR IN xq (COMMA VAR IN xq)*
    | FOR VAR IN joinClause ;  // could have multiple (at least 1) sub expressions
letClause: LET VAR ASSIGN xq (COMMA VAR ASSIGN xq)*;
whereClause: WHERE cond;
returnClause: RETURN xq;

cond: xq EQ xq #EqCond1 | xq EQS xq #EqCond2
    | xq IS xq #IsCond1 | xq ISS xq #IsCond2
    | EMPTY LPR xq RPR #EmptyCond
    | satisfy cond #SatCond
    | LPR cond RPR #ParaCond
    | cond CONJ cond #CompoundCond
    | NEG cond #NegCond;
satisfy: SOME VAR IN xq (COMMA VAR IN xq)* SATISF;
startTag: LAB tagName RAB;
endTag: LAB SL tagName RAB;

/*Token*/
JOIN: [jJ][oO][iI][nN];
VAR: '$' ID;
LAB: '<';
RAB: '>';
LBB: '{';
RBB: '}';
FOR: 'for';
IN: 'in';
LET: 'let';
ASSIGN: ':=';
WHERE: 'where';
RETURN: 'return';
EMPTY: 'empty';
SOME: 'some';
SATISF: 'satisfies';