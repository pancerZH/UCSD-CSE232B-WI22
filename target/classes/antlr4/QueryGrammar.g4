grammar QueryGrammar ;
import ExpressionGrammar;


/*Rules*/
    xq: VAR #VarXq | STRING #StringXq | ap #ApXq
    | LPR xq RPR #ParaXq | xq COMMA xq #BinaryXq | xq pathOp rp #RpXq
    | startTag LBB xq RBB endTag #TagXq
    | forClause letClause whereClause returnClause #ForXq
    | letClause xq #LetXq;

forClause: FOR VAR IN xq (COMMA VAR IN xq)* ;  // could have multiple (at least 1) sub expressions
letClause: LET VAR ASSIGN xq (COMMA VAR ASSIGN xq)* ;  // could have multiple (at least 1) sub expressions
whereClause: WHERE cond;
returnClause: RETURN xq;

cond: xq EQ xq #EqCond1 | xq EQS xq #EqCond2
    | xq IS xq #IsCond1 | xq ISS xq #IsCond2
    | EMPTY LPR xq RPR #EmptyCond
    | SOME VAR IN xq (COMMA VAR IN xq)* SATISF cond #SatCond
    | LPR cond RPR #ParaCond
    | cond CONJ cond #CompoundCond
    | NEG cond #NegCond;

startTag: LAB tagName RAB;
endTag: LAB SL tagName RAB;

/*Token*/
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