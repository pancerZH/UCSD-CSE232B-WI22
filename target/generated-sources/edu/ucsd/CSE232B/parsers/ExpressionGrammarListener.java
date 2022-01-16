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
	 * Enter a parse tree produced by {@link ExpressionGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRp(ExpressionGrammarParser.RpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRp(ExpressionGrammarParser.RpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionGrammarParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilter(ExpressionGrammarParser.FilterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionGrammarParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilter(ExpressionGrammarParser.FilterContext ctx);
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
	 * Enter a parse tree produced by {@link ExpressionGrammarParser#text}.
	 * @param ctx the parse tree
	 */
	void enterText(ExpressionGrammarParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionGrammarParser#text}.
	 * @param ctx the parse tree
	 */
	void exitText(ExpressionGrammarParser.TextContext ctx);
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
	 * Enter a parse tree produced by {@link ExpressionGrammarParser#comp}.
	 * @param ctx the parse tree
	 */
	void enterComp(ExpressionGrammarParser.CompContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionGrammarParser#comp}.
	 * @param ctx the parse tree
	 */
	void exitComp(ExpressionGrammarParser.CompContext ctx);
}