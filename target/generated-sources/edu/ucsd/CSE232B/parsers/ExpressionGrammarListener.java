// Generated from ExpressionGrammar.g4 by ANTLR 4.7.2

package edu.ucsd.CSE232B.parsers;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExpressionGrammarParser}.
 */
public interface ExpressionGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExpressionGrammarParser#ap}.
	 * @param ctx the parse tree
	 */
	void enterAp(ExpressionGrammarParser.ApContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionGrammarParser#ap}.
	 * @param ctx the parse tree
	 */
	void exitAp(ExpressionGrammarParser.ApContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryRp3}
	 * labeled alternative in {@link ExpressionGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterUnaryRp3(ExpressionGrammarParser.UnaryRp3Context ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryRp3}
	 * labeled alternative in {@link ExpressionGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitUnaryRp3(ExpressionGrammarParser.UnaryRp3Context ctx);
	/**
	 * Enter a parse tree produced by the {@code BinaryRp1}
	 * labeled alternative in {@link ExpressionGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterBinaryRp1(ExpressionGrammarParser.BinaryRp1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code BinaryRp1}
	 * labeled alternative in {@link ExpressionGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitBinaryRp1(ExpressionGrammarParser.BinaryRp1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryRp4}
	 * labeled alternative in {@link ExpressionGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterUnaryRp4(ExpressionGrammarParser.UnaryRp4Context ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryRp4}
	 * labeled alternative in {@link ExpressionGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitUnaryRp4(ExpressionGrammarParser.UnaryRp4Context ctx);
	/**
	 * Enter a parse tree produced by the {@code ParaRp}
	 * labeled alternative in {@link ExpressionGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterParaRp(ExpressionGrammarParser.ParaRpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParaRp}
	 * labeled alternative in {@link ExpressionGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitParaRp(ExpressionGrammarParser.ParaRpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BinaryRp2}
	 * labeled alternative in {@link ExpressionGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterBinaryRp2(ExpressionGrammarParser.BinaryRp2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code BinaryRp2}
	 * labeled alternative in {@link ExpressionGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitBinaryRp2(ExpressionGrammarParser.BinaryRp2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryRp1}
	 * labeled alternative in {@link ExpressionGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterUnaryRp1(ExpressionGrammarParser.UnaryRp1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryRp1}
	 * labeled alternative in {@link ExpressionGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitUnaryRp1(ExpressionGrammarParser.UnaryRp1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryRp2}
	 * labeled alternative in {@link ExpressionGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterUnaryRp2(ExpressionGrammarParser.UnaryRp2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryRp2}
	 * labeled alternative in {@link ExpressionGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitUnaryRp2(ExpressionGrammarParser.UnaryRp2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code FilterRp}
	 * labeled alternative in {@link ExpressionGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterFilterRp(ExpressionGrammarParser.FilterRpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FilterRp}
	 * labeled alternative in {@link ExpressionGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitFilterRp(ExpressionGrammarParser.FilterRpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryRp5}
	 * labeled alternative in {@link ExpressionGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterUnaryRp5(ExpressionGrammarParser.UnaryRp5Context ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryRp5}
	 * labeled alternative in {@link ExpressionGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitUnaryRp5(ExpressionGrammarParser.UnaryRp5Context ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryRp6}
	 * labeled alternative in {@link ExpressionGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterUnaryRp6(ExpressionGrammarParser.UnaryRp6Context ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryRp6}
	 * labeled alternative in {@link ExpressionGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitUnaryRp6(ExpressionGrammarParser.UnaryRp6Context ctx);
	/**
	 * Enter a parse tree produced by the {@code BinaryFt1}
	 * labeled alternative in {@link ExpressionGrammarParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterBinaryFt1(ExpressionGrammarParser.BinaryFt1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code BinaryFt1}
	 * labeled alternative in {@link ExpressionGrammarParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitBinaryFt1(ExpressionGrammarParser.BinaryFt1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code BinaryFt2}
	 * labeled alternative in {@link ExpressionGrammarParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterBinaryFt2(ExpressionGrammarParser.BinaryFt2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code BinaryFt2}
	 * labeled alternative in {@link ExpressionGrammarParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitBinaryFt2(ExpressionGrammarParser.BinaryFt2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code ParaFt}
	 * labeled alternative in {@link ExpressionGrammarParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterParaFt(ExpressionGrammarParser.ParaFtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParaFt}
	 * labeled alternative in {@link ExpressionGrammarParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitParaFt(ExpressionGrammarParser.ParaFtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NegFt}
	 * labeled alternative in {@link ExpressionGrammarParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterNegFt(ExpressionGrammarParser.NegFtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NegFt}
	 * labeled alternative in {@link ExpressionGrammarParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitNegFt(ExpressionGrammarParser.NegFtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CompoundFt}
	 * labeled alternative in {@link ExpressionGrammarParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterCompoundFt(ExpressionGrammarParser.CompoundFtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CompoundFt}
	 * labeled alternative in {@link ExpressionGrammarParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitCompoundFt(ExpressionGrammarParser.CompoundFtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryFt}
	 * labeled alternative in {@link ExpressionGrammarParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterUnaryFt(ExpressionGrammarParser.UnaryFtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryFt}
	 * labeled alternative in {@link ExpressionGrammarParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitUnaryFt(ExpressionGrammarParser.UnaryFtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionGrammarParser#pathOp}.
	 * @param ctx the parse tree
	 */
	void enterPathOp(ExpressionGrammarParser.PathOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionGrammarParser#pathOp}.
	 * @param ctx the parse tree
	 */
	void exitPathOp(ExpressionGrammarParser.PathOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionGrammarParser#doc}.
	 * @param ctx the parse tree
	 */
	void enterDoc(ExpressionGrammarParser.DocContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionGrammarParser#doc}.
	 * @param ctx the parse tree
	 */
	void exitDoc(ExpressionGrammarParser.DocContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionGrammarParser#tagName}.
	 * @param ctx the parse tree
	 */
	void enterTagName(ExpressionGrammarParser.TagNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionGrammarParser#tagName}.
	 * @param ctx the parse tree
	 */
	void exitTagName(ExpressionGrammarParser.TagNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionGrammarParser#attName}.
	 * @param ctx the parse tree
	 */
	void enterAttName(ExpressionGrammarParser.AttNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionGrammarParser#attName}.
	 * @param ctx the parse tree
	 */
	void exitAttName(ExpressionGrammarParser.AttNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionGrammarParser#compOp}.
	 * @param ctx the parse tree
	 */
	void enterCompOp(ExpressionGrammarParser.CompOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionGrammarParser#compOp}.
	 * @param ctx the parse tree
	 */
	void exitCompOp(ExpressionGrammarParser.CompOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionGrammarParser#stringCondition}.
	 * @param ctx the parse tree
	 */
	void enterStringCondition(ExpressionGrammarParser.StringConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionGrammarParser#stringCondition}.
	 * @param ctx the parse tree
	 */
	void exitStringCondition(ExpressionGrammarParser.StringConditionContext ctx);
}