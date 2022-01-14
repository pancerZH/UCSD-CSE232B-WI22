// Generated from /Users/wenzhezhang/Documents/learn_how_to_learn/CSE232B/UCSD-CSE232B-WI22/src/main/resources/antlr4/ExpressionGrammar.g4 by ANTLR 4.9.2
package antlr4;

package edu.ucsd.CSE232B.parsers;

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
	 * Visit a parse tree produced by {@link ExpressionGrammarParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(ExpressionGrammarParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Expr_Number}
	 * labeled alternative in {@link ExpressionGrammarParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_Number(ExpressionGrammarParser.Expr_NumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Expr_Binary}
	 * labeled alternative in {@link ExpressionGrammarParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_Binary(ExpressionGrammarParser.Expr_BinaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Expr_Variable}
	 * labeled alternative in {@link ExpressionGrammarParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_Variable(ExpressionGrammarParser.Expr_VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Expr_Parentheses}
	 * labeled alternative in {@link ExpressionGrammarParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_Parentheses(ExpressionGrammarParser.Expr_ParenthesesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionGrammarParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(ExpressionGrammarParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionGrammarParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(ExpressionGrammarParser.VariableContext ctx);
}