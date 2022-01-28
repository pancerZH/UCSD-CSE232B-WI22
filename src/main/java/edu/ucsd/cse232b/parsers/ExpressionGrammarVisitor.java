// Generated from ExpressionGrammar.g4 by ANTLR 4.7.2

package edu.ucsd.cse232b.parsers;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExpressionGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExpressionGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ExpressionGrammarParser#ap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAp(ExpressionGrammarParser.ApContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryRp3}
	 * labeled alternative in {@link ExpressionGrammarParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryRp3(ExpressionGrammarParser.UnaryRp3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code BinaryRp1}
	 * labeled alternative in {@link ExpressionGrammarParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryRp1(ExpressionGrammarParser.BinaryRp1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryRp4}
	 * labeled alternative in {@link ExpressionGrammarParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryRp4(ExpressionGrammarParser.UnaryRp4Context ctx);
	/**
	 * Visit a parse tree produced by the {@code ParaRp}
	 * labeled alternative in {@link ExpressionGrammarParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParaRp(ExpressionGrammarParser.ParaRpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BinaryRp2}
	 * labeled alternative in {@link ExpressionGrammarParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryRp2(ExpressionGrammarParser.BinaryRp2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryRp1}
	 * labeled alternative in {@link ExpressionGrammarParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryRp1(ExpressionGrammarParser.UnaryRp1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryRp2}
	 * labeled alternative in {@link ExpressionGrammarParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryRp2(ExpressionGrammarParser.UnaryRp2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code FilterRp}
	 * labeled alternative in {@link ExpressionGrammarParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterRp(ExpressionGrammarParser.FilterRpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryRp5}
	 * labeled alternative in {@link ExpressionGrammarParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryRp5(ExpressionGrammarParser.UnaryRp5Context ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryRp6}
	 * labeled alternative in {@link ExpressionGrammarParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryRp6(ExpressionGrammarParser.UnaryRp6Context ctx);
	/**
	 * Visit a parse tree produced by the {@code BinaryFt1}
	 * labeled alternative in {@link ExpressionGrammarParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryFt1(ExpressionGrammarParser.BinaryFt1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code BinaryFt2}
	 * labeled alternative in {@link ExpressionGrammarParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryFt2(ExpressionGrammarParser.BinaryFt2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code ParaFt}
	 * labeled alternative in {@link ExpressionGrammarParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParaFt(ExpressionGrammarParser.ParaFtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NegFt}
	 * labeled alternative in {@link ExpressionGrammarParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegFt(ExpressionGrammarParser.NegFtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CompoundFt}
	 * labeled alternative in {@link ExpressionGrammarParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundFt(ExpressionGrammarParser.CompoundFtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryFt}
	 * labeled alternative in {@link ExpressionGrammarParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryFt(ExpressionGrammarParser.UnaryFtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionGrammarParser#pathOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPathOp(ExpressionGrammarParser.PathOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionGrammarParser#doc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoc(ExpressionGrammarParser.DocContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionGrammarParser#tagName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagName(ExpressionGrammarParser.TagNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionGrammarParser#attName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttName(ExpressionGrammarParser.AttNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionGrammarParser#compOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompOp(ExpressionGrammarParser.CompOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionGrammarParser#stringCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringCondition(ExpressionGrammarParser.StringConditionContext ctx);
}