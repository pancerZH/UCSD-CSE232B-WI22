// Generated from QueryGrammar.g4 by ANTLR 4.7.2

package edu.ucsd.cse232b.parsers;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link QueryGrammarParser}.
 */
public interface QueryGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code RpXq}
	 * labeled alternative in {@link QueryGrammarParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterRpXq(QueryGrammarParser.RpXqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RpXq}
	 * labeled alternative in {@link QueryGrammarParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitRpXq(QueryGrammarParser.RpXqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringXq}
	 * labeled alternative in {@link QueryGrammarParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterStringXq(QueryGrammarParser.StringXqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringXq}
	 * labeled alternative in {@link QueryGrammarParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitStringXq(QueryGrammarParser.StringXqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParaXq}
	 * labeled alternative in {@link QueryGrammarParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterParaXq(QueryGrammarParser.ParaXqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParaXq}
	 * labeled alternative in {@link QueryGrammarParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitParaXq(QueryGrammarParser.ParaXqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ApXq}
	 * labeled alternative in {@link QueryGrammarParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterApXq(QueryGrammarParser.ApXqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ApXq}
	 * labeled alternative in {@link QueryGrammarParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitApXq(QueryGrammarParser.ApXqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BinaryXq}
	 * labeled alternative in {@link QueryGrammarParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterBinaryXq(QueryGrammarParser.BinaryXqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BinaryXq}
	 * labeled alternative in {@link QueryGrammarParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitBinaryXq(QueryGrammarParser.BinaryXqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VarXq}
	 * labeled alternative in {@link QueryGrammarParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterVarXq(QueryGrammarParser.VarXqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VarXq}
	 * labeled alternative in {@link QueryGrammarParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitVarXq(QueryGrammarParser.VarXqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LetXq}
	 * labeled alternative in {@link QueryGrammarParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterLetXq(QueryGrammarParser.LetXqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LetXq}
	 * labeled alternative in {@link QueryGrammarParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitLetXq(QueryGrammarParser.LetXqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForXq}
	 * labeled alternative in {@link QueryGrammarParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterForXq(QueryGrammarParser.ForXqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForXq}
	 * labeled alternative in {@link QueryGrammarParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitForXq(QueryGrammarParser.ForXqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TagXq}
	 * labeled alternative in {@link QueryGrammarParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterTagXq(QueryGrammarParser.TagXqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TagXq}
	 * labeled alternative in {@link QueryGrammarParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitTagXq(QueryGrammarParser.TagXqContext ctx);
	/**
	 * Enter a parse tree produced by {@link QueryGrammarParser#forClause}.
	 * @param ctx the parse tree
	 */
	void enterForClause(QueryGrammarParser.ForClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryGrammarParser#forClause}.
	 * @param ctx the parse tree
	 */
	void exitForClause(QueryGrammarParser.ForClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link QueryGrammarParser#letClause}.
	 * @param ctx the parse tree
	 */
	void enterLetClause(QueryGrammarParser.LetClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryGrammarParser#letClause}.
	 * @param ctx the parse tree
	 */
	void exitLetClause(QueryGrammarParser.LetClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link QueryGrammarParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void enterWhereClause(QueryGrammarParser.WhereClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryGrammarParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void exitWhereClause(QueryGrammarParser.WhereClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link QueryGrammarParser#returnClause}.
	 * @param ctx the parse tree
	 */
	void enterReturnClause(QueryGrammarParser.ReturnClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryGrammarParser#returnClause}.
	 * @param ctx the parse tree
	 */
	void exitReturnClause(QueryGrammarParser.ReturnClauseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EqCond2}
	 * labeled alternative in {@link QueryGrammarParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterEqCond2(QueryGrammarParser.EqCond2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code EqCond2}
	 * labeled alternative in {@link QueryGrammarParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitEqCond2(QueryGrammarParser.EqCond2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code CompoundCond}
	 * labeled alternative in {@link QueryGrammarParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCompoundCond(QueryGrammarParser.CompoundCondContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CompoundCond}
	 * labeled alternative in {@link QueryGrammarParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCompoundCond(QueryGrammarParser.CompoundCondContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EqCond1}
	 * labeled alternative in {@link QueryGrammarParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterEqCond1(QueryGrammarParser.EqCond1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code EqCond1}
	 * labeled alternative in {@link QueryGrammarParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitEqCond1(QueryGrammarParser.EqCond1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code SatCond}
	 * labeled alternative in {@link QueryGrammarParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterSatCond(QueryGrammarParser.SatCondContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SatCond}
	 * labeled alternative in {@link QueryGrammarParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitSatCond(QueryGrammarParser.SatCondContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EmptyCond}
	 * labeled alternative in {@link QueryGrammarParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterEmptyCond(QueryGrammarParser.EmptyCondContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EmptyCond}
	 * labeled alternative in {@link QueryGrammarParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitEmptyCond(QueryGrammarParser.EmptyCondContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NegCond}
	 * labeled alternative in {@link QueryGrammarParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterNegCond(QueryGrammarParser.NegCondContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NegCond}
	 * labeled alternative in {@link QueryGrammarParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitNegCond(QueryGrammarParser.NegCondContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParaCond}
	 * labeled alternative in {@link QueryGrammarParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterParaCond(QueryGrammarParser.ParaCondContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParaCond}
	 * labeled alternative in {@link QueryGrammarParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitParaCond(QueryGrammarParser.ParaCondContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IsCond1}
	 * labeled alternative in {@link QueryGrammarParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterIsCond1(QueryGrammarParser.IsCond1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code IsCond1}
	 * labeled alternative in {@link QueryGrammarParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitIsCond1(QueryGrammarParser.IsCond1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code IsCond2}
	 * labeled alternative in {@link QueryGrammarParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterIsCond2(QueryGrammarParser.IsCond2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code IsCond2}
	 * labeled alternative in {@link QueryGrammarParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitIsCond2(QueryGrammarParser.IsCond2Context ctx);
	/**
	 * Enter a parse tree produced by {@link QueryGrammarParser#startTag}.
	 * @param ctx the parse tree
	 */
	void enterStartTag(QueryGrammarParser.StartTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryGrammarParser#startTag}.
	 * @param ctx the parse tree
	 */
	void exitStartTag(QueryGrammarParser.StartTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link QueryGrammarParser#endTag}.
	 * @param ctx the parse tree
	 */
	void enterEndTag(QueryGrammarParser.EndTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryGrammarParser#endTag}.
	 * @param ctx the parse tree
	 */
	void exitEndTag(QueryGrammarParser.EndTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link QueryGrammarParser#ap}.
	 * @param ctx the parse tree
	 */
	void enterAp(QueryGrammarParser.ApContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryGrammarParser#ap}.
	 * @param ctx the parse tree
	 */
	void exitAp(QueryGrammarParser.ApContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryRp3}
	 * labeled alternative in {@link QueryGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterUnaryRp3(QueryGrammarParser.UnaryRp3Context ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryRp3}
	 * labeled alternative in {@link QueryGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitUnaryRp3(QueryGrammarParser.UnaryRp3Context ctx);
	/**
	 * Enter a parse tree produced by the {@code BinaryRp1}
	 * labeled alternative in {@link QueryGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterBinaryRp1(QueryGrammarParser.BinaryRp1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code BinaryRp1}
	 * labeled alternative in {@link QueryGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitBinaryRp1(QueryGrammarParser.BinaryRp1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryRp4}
	 * labeled alternative in {@link QueryGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterUnaryRp4(QueryGrammarParser.UnaryRp4Context ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryRp4}
	 * labeled alternative in {@link QueryGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitUnaryRp4(QueryGrammarParser.UnaryRp4Context ctx);
	/**
	 * Enter a parse tree produced by the {@code ParaRp}
	 * labeled alternative in {@link QueryGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterParaRp(QueryGrammarParser.ParaRpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParaRp}
	 * labeled alternative in {@link QueryGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitParaRp(QueryGrammarParser.ParaRpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BinaryRp2}
	 * labeled alternative in {@link QueryGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterBinaryRp2(QueryGrammarParser.BinaryRp2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code BinaryRp2}
	 * labeled alternative in {@link QueryGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitBinaryRp2(QueryGrammarParser.BinaryRp2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryRp1}
	 * labeled alternative in {@link QueryGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterUnaryRp1(QueryGrammarParser.UnaryRp1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryRp1}
	 * labeled alternative in {@link QueryGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitUnaryRp1(QueryGrammarParser.UnaryRp1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryRp2}
	 * labeled alternative in {@link QueryGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterUnaryRp2(QueryGrammarParser.UnaryRp2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryRp2}
	 * labeled alternative in {@link QueryGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitUnaryRp2(QueryGrammarParser.UnaryRp2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code FilterRp}
	 * labeled alternative in {@link QueryGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterFilterRp(QueryGrammarParser.FilterRpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FilterRp}
	 * labeled alternative in {@link QueryGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitFilterRp(QueryGrammarParser.FilterRpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryRp5}
	 * labeled alternative in {@link QueryGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterUnaryRp5(QueryGrammarParser.UnaryRp5Context ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryRp5}
	 * labeled alternative in {@link QueryGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitUnaryRp5(QueryGrammarParser.UnaryRp5Context ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryRp6}
	 * labeled alternative in {@link QueryGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterUnaryRp6(QueryGrammarParser.UnaryRp6Context ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryRp6}
	 * labeled alternative in {@link QueryGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitUnaryRp6(QueryGrammarParser.UnaryRp6Context ctx);
	/**
	 * Enter a parse tree produced by the {@code BinaryFt1}
	 * labeled alternative in {@link QueryGrammarParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterBinaryFt1(QueryGrammarParser.BinaryFt1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code BinaryFt1}
	 * labeled alternative in {@link QueryGrammarParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitBinaryFt1(QueryGrammarParser.BinaryFt1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code BinaryFt2}
	 * labeled alternative in {@link QueryGrammarParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterBinaryFt2(QueryGrammarParser.BinaryFt2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code BinaryFt2}
	 * labeled alternative in {@link QueryGrammarParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitBinaryFt2(QueryGrammarParser.BinaryFt2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code ParaFt}
	 * labeled alternative in {@link QueryGrammarParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterParaFt(QueryGrammarParser.ParaFtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParaFt}
	 * labeled alternative in {@link QueryGrammarParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitParaFt(QueryGrammarParser.ParaFtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NegFt}
	 * labeled alternative in {@link QueryGrammarParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterNegFt(QueryGrammarParser.NegFtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NegFt}
	 * labeled alternative in {@link QueryGrammarParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitNegFt(QueryGrammarParser.NegFtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CompoundFt}
	 * labeled alternative in {@link QueryGrammarParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterCompoundFt(QueryGrammarParser.CompoundFtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CompoundFt}
	 * labeled alternative in {@link QueryGrammarParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitCompoundFt(QueryGrammarParser.CompoundFtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryFt}
	 * labeled alternative in {@link QueryGrammarParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterUnaryFt(QueryGrammarParser.UnaryFtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryFt}
	 * labeled alternative in {@link QueryGrammarParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitUnaryFt(QueryGrammarParser.UnaryFtContext ctx);
	/**
	 * Enter a parse tree produced by {@link QueryGrammarParser#pathOp}.
	 * @param ctx the parse tree
	 */
	void enterPathOp(QueryGrammarParser.PathOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryGrammarParser#pathOp}.
	 * @param ctx the parse tree
	 */
	void exitPathOp(QueryGrammarParser.PathOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link QueryGrammarParser#docName}.
	 * @param ctx the parse tree
	 */
	void enterDocName(QueryGrammarParser.DocNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryGrammarParser#docName}.
	 * @param ctx the parse tree
	 */
	void exitDocName(QueryGrammarParser.DocNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link QueryGrammarParser#fileName}.
	 * @param ctx the parse tree
	 */
	void enterFileName(QueryGrammarParser.FileNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryGrammarParser#fileName}.
	 * @param ctx the parse tree
	 */
	void exitFileName(QueryGrammarParser.FileNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link QueryGrammarParser#tagName}.
	 * @param ctx the parse tree
	 */
	void enterTagName(QueryGrammarParser.TagNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryGrammarParser#tagName}.
	 * @param ctx the parse tree
	 */
	void exitTagName(QueryGrammarParser.TagNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link QueryGrammarParser#attName}.
	 * @param ctx the parse tree
	 */
	void enterAttName(QueryGrammarParser.AttNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryGrammarParser#attName}.
	 * @param ctx the parse tree
	 */
	void exitAttName(QueryGrammarParser.AttNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link QueryGrammarParser#compOp}.
	 * @param ctx the parse tree
	 */
	void enterCompOp(QueryGrammarParser.CompOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryGrammarParser#compOp}.
	 * @param ctx the parse tree
	 */
	void exitCompOp(QueryGrammarParser.CompOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link QueryGrammarParser#stringCondition}.
	 * @param ctx the parse tree
	 */
	void enterStringCondition(QueryGrammarParser.StringConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryGrammarParser#stringCondition}.
	 * @param ctx the parse tree
	 */
	void exitStringCondition(QueryGrammarParser.StringConditionContext ctx);
}