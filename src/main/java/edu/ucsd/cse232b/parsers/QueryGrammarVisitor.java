// Generated from QueryGrammar.g4 by ANTLR 4.7.2

package edu.ucsd.cse232b.parsers;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link QueryGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface QueryGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code RpXq}
	 * labeled alternative in {@link QueryGrammarParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRpXq(QueryGrammarParser.RpXqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringXq}
	 * labeled alternative in {@link QueryGrammarParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringXq(QueryGrammarParser.StringXqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParaXq}
	 * labeled alternative in {@link QueryGrammarParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParaXq(QueryGrammarParser.ParaXqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ApXq}
	 * labeled alternative in {@link QueryGrammarParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApXq(QueryGrammarParser.ApXqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BinaryXq}
	 * labeled alternative in {@link QueryGrammarParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryXq(QueryGrammarParser.BinaryXqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarXq}
	 * labeled alternative in {@link QueryGrammarParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarXq(QueryGrammarParser.VarXqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LetXq}
	 * labeled alternative in {@link QueryGrammarParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetXq(QueryGrammarParser.LetXqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForXq}
	 * labeled alternative in {@link QueryGrammarParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForXq(QueryGrammarParser.ForXqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TagXq}
	 * labeled alternative in {@link QueryGrammarParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagXq(QueryGrammarParser.TagXqContext ctx);
	/**
	 * Visit a parse tree produced by {@link QueryGrammarParser#constanList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstanList(QueryGrammarParser.ConstanListContext ctx);
	/**
	 * Visit a parse tree produced by {@link QueryGrammarParser#joinClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinClause(QueryGrammarParser.JoinClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link QueryGrammarParser#forClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForClause(QueryGrammarParser.ForClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link QueryGrammarParser#letClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetClause(QueryGrammarParser.LetClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link QueryGrammarParser#whereClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhereClause(QueryGrammarParser.WhereClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link QueryGrammarParser#returnClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnClause(QueryGrammarParser.ReturnClauseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EqCond2}
	 * labeled alternative in {@link QueryGrammarParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqCond2(QueryGrammarParser.EqCond2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code CompoundCond}
	 * labeled alternative in {@link QueryGrammarParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundCond(QueryGrammarParser.CompoundCondContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EqCond1}
	 * labeled alternative in {@link QueryGrammarParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqCond1(QueryGrammarParser.EqCond1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code SatCond}
	 * labeled alternative in {@link QueryGrammarParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSatCond(QueryGrammarParser.SatCondContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EmptyCond}
	 * labeled alternative in {@link QueryGrammarParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyCond(QueryGrammarParser.EmptyCondContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NegCond}
	 * labeled alternative in {@link QueryGrammarParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegCond(QueryGrammarParser.NegCondContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParaCond}
	 * labeled alternative in {@link QueryGrammarParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParaCond(QueryGrammarParser.ParaCondContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IsCond1}
	 * labeled alternative in {@link QueryGrammarParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsCond1(QueryGrammarParser.IsCond1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code IsCond2}
	 * labeled alternative in {@link QueryGrammarParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsCond2(QueryGrammarParser.IsCond2Context ctx);
	/**
	 * Visit a parse tree produced by {@link QueryGrammarParser#satisfy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSatisfy(QueryGrammarParser.SatisfyContext ctx);
	/**
	 * Visit a parse tree produced by {@link QueryGrammarParser#startTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStartTag(QueryGrammarParser.StartTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link QueryGrammarParser#endTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndTag(QueryGrammarParser.EndTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link QueryGrammarParser#ap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAp(QueryGrammarParser.ApContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryRp3}
	 * labeled alternative in {@link QueryGrammarParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryRp3(QueryGrammarParser.UnaryRp3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code BinaryRp1}
	 * labeled alternative in {@link QueryGrammarParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryRp1(QueryGrammarParser.BinaryRp1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryRp4}
	 * labeled alternative in {@link QueryGrammarParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryRp4(QueryGrammarParser.UnaryRp4Context ctx);
	/**
	 * Visit a parse tree produced by the {@code ParaRp}
	 * labeled alternative in {@link QueryGrammarParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParaRp(QueryGrammarParser.ParaRpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BinaryRp2}
	 * labeled alternative in {@link QueryGrammarParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryRp2(QueryGrammarParser.BinaryRp2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryRp1}
	 * labeled alternative in {@link QueryGrammarParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryRp1(QueryGrammarParser.UnaryRp1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryRp2}
	 * labeled alternative in {@link QueryGrammarParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryRp2(QueryGrammarParser.UnaryRp2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code FilterRp}
	 * labeled alternative in {@link QueryGrammarParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterRp(QueryGrammarParser.FilterRpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryRp5}
	 * labeled alternative in {@link QueryGrammarParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryRp5(QueryGrammarParser.UnaryRp5Context ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryRp6}
	 * labeled alternative in {@link QueryGrammarParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryRp6(QueryGrammarParser.UnaryRp6Context ctx);
	/**
	 * Visit a parse tree produced by the {@code BinaryFt1}
	 * labeled alternative in {@link QueryGrammarParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryFt1(QueryGrammarParser.BinaryFt1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code BinaryFt2}
	 * labeled alternative in {@link QueryGrammarParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryFt2(QueryGrammarParser.BinaryFt2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code ParaFt}
	 * labeled alternative in {@link QueryGrammarParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParaFt(QueryGrammarParser.ParaFtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NegFt}
	 * labeled alternative in {@link QueryGrammarParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegFt(QueryGrammarParser.NegFtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CompoundFt}
	 * labeled alternative in {@link QueryGrammarParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundFt(QueryGrammarParser.CompoundFtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryFt}
	 * labeled alternative in {@link QueryGrammarParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryFt(QueryGrammarParser.UnaryFtContext ctx);
	/**
	 * Visit a parse tree produced by {@link QueryGrammarParser#pathOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPathOp(QueryGrammarParser.PathOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link QueryGrammarParser#docName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDocName(QueryGrammarParser.DocNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link QueryGrammarParser#fileName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFileName(QueryGrammarParser.FileNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link QueryGrammarParser#tagName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagName(QueryGrammarParser.TagNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link QueryGrammarParser#attName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttName(QueryGrammarParser.AttNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link QueryGrammarParser#compOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompOp(QueryGrammarParser.CompOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link QueryGrammarParser#stringCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringCondition(QueryGrammarParser.StringConditionContext ctx);
}