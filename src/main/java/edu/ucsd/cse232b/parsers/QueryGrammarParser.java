// Generated from QueryGrammar.g4 by ANTLR 4.7.2

package edu.ucsd.cse232b.parsers;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class QueryGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		JOIN=1, VAR=2, LAB=3, RAB=4, LBB=5, RBB=6, FOR=7, IN=8, LET=9, ASSIGN=10, 
		WHERE=11, RETURN=12, EMPTY=13, SOME=14, SATISF=15, SL=16, DSL=17, SELF=18, 
		PENT=19, STAR=20, LPR=21, RPR=22, LSB=23, RSB=24, COMMA=25, EQS=26, EQ=27, 
		ISS=28, IS=29, NEG=30, CONJ=31, TEXT=32, AT=33, DOC=34, ID=35, WS=36, 
		STRING=37, ESCAPE=38;
	public static final int
		RULE_xq = 0, RULE_constantList = 1, RULE_joinClause = 2, RULE_forClause = 3, 
		RULE_letClause = 4, RULE_whereClause = 5, RULE_returnClause = 6, RULE_cond = 7, 
		RULE_satisfy = 8, RULE_startTag = 9, RULE_endTag = 10, RULE_ap = 11, RULE_rp = 12, 
		RULE_filter = 13, RULE_pathOp = 14, RULE_docName = 15, RULE_fileName = 16, 
		RULE_tagName = 17, RULE_attName = 18, RULE_compOp = 19, RULE_stringCondition = 20;
	private static String[] makeRuleNames() {
		return new String[] {
			"xq", "constantList", "joinClause", "forClause", "letClause", "whereClause", 
			"returnClause", "cond", "satisfy", "startTag", "endTag", "ap", "rp", 
			"filter", "pathOp", "docName", "fileName", "tagName", "attName", "compOp", 
			"stringCondition"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'<'", "'>'", "'{'", "'}'", "'for'", "'in'", "'let'", 
			"':='", "'where'", "'return'", "'empty'", "'some'", "'satisfies'", "'/'", 
			"'//'", "'.'", "'..'", "'*'", "'('", "')'", "'['", "']'", "','", "'='", 
			"'eq'", "'=='", "'is'", "'not'", null, "'text()'", "'@'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "JOIN", "VAR", "LAB", "RAB", "LBB", "RBB", "FOR", "IN", "LET", 
			"ASSIGN", "WHERE", "RETURN", "EMPTY", "SOME", "SATISF", "SL", "DSL", 
			"SELF", "PENT", "STAR", "LPR", "RPR", "LSB", "RSB", "COMMA", "EQS", "EQ", 
			"ISS", "IS", "NEG", "CONJ", "TEXT", "AT", "DOC", "ID", "WS", "STRING", 
			"ESCAPE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "QueryGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public QueryGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class XqContext extends ParserRuleContext {
		public XqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xq; }
	 
		public XqContext() { }
		public void copyFrom(XqContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RpXqContext extends XqContext {
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public PathOpContext pathOp() {
			return getRuleContext(PathOpContext.class,0);
		}
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public RpXqContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryGrammarListener ) ((QueryGrammarListener)listener).enterRpXq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryGrammarListener ) ((QueryGrammarListener)listener).exitRpXq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryGrammarVisitor ) return ((QueryGrammarVisitor<? extends T>)visitor).visitRpXq(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringXqContext extends XqContext {
		public TerminalNode STRING() { return getToken(QueryGrammarParser.STRING, 0); }
		public StringXqContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryGrammarListener ) ((QueryGrammarListener)listener).enterStringXq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryGrammarListener ) ((QueryGrammarListener)listener).exitStringXq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryGrammarVisitor ) return ((QueryGrammarVisitor<? extends T>)visitor).visitStringXq(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParaXqContext extends XqContext {
		public TerminalNode LPR() { return getToken(QueryGrammarParser.LPR, 0); }
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public TerminalNode RPR() { return getToken(QueryGrammarParser.RPR, 0); }
		public ParaXqContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryGrammarListener ) ((QueryGrammarListener)listener).enterParaXq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryGrammarListener ) ((QueryGrammarListener)listener).exitParaXq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryGrammarVisitor ) return ((QueryGrammarVisitor<? extends T>)visitor).visitParaXq(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ApXqContext extends XqContext {
		public ApContext ap() {
			return getRuleContext(ApContext.class,0);
		}
		public ApXqContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryGrammarListener ) ((QueryGrammarListener)listener).enterApXq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryGrammarListener ) ((QueryGrammarListener)listener).exitApXq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryGrammarVisitor ) return ((QueryGrammarVisitor<? extends T>)visitor).visitApXq(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class JoinXqContext extends XqContext {
		public JoinClauseContext joinClause() {
			return getRuleContext(JoinClauseContext.class,0);
		}
		public JoinXqContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryGrammarListener ) ((QueryGrammarListener)listener).enterJoinXq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryGrammarListener ) ((QueryGrammarListener)listener).exitJoinXq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryGrammarVisitor ) return ((QueryGrammarVisitor<? extends T>)visitor).visitJoinXq(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BinaryXqContext extends XqContext {
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(QueryGrammarParser.COMMA, 0); }
		public BinaryXqContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryGrammarListener ) ((QueryGrammarListener)listener).enterBinaryXq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryGrammarListener ) ((QueryGrammarListener)listener).exitBinaryXq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryGrammarVisitor ) return ((QueryGrammarVisitor<? extends T>)visitor).visitBinaryXq(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarXqContext extends XqContext {
		public TerminalNode VAR() { return getToken(QueryGrammarParser.VAR, 0); }
		public VarXqContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryGrammarListener ) ((QueryGrammarListener)listener).enterVarXq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryGrammarListener ) ((QueryGrammarListener)listener).exitVarXq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryGrammarVisitor ) return ((QueryGrammarVisitor<? extends T>)visitor).visitVarXq(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LetXqContext extends XqContext {
		public LetClauseContext letClause() {
			return getRuleContext(LetClauseContext.class,0);
		}
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public LetXqContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryGrammarListener ) ((QueryGrammarListener)listener).enterLetXq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryGrammarListener ) ((QueryGrammarListener)listener).exitLetXq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryGrammarVisitor ) return ((QueryGrammarVisitor<? extends T>)visitor).visitLetXq(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForXqContext extends XqContext {
		public ForClauseContext forClause() {
			return getRuleContext(ForClauseContext.class,0);
		}
		public ReturnClauseContext returnClause() {
			return getRuleContext(ReturnClauseContext.class,0);
		}
		public LetClauseContext letClause() {
			return getRuleContext(LetClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public ForXqContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryGrammarListener ) ((QueryGrammarListener)listener).enterForXq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryGrammarListener ) ((QueryGrammarListener)listener).exitForXq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryGrammarVisitor ) return ((QueryGrammarVisitor<? extends T>)visitor).visitForXq(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TagXqContext extends XqContext {
		public StartTagContext startTag() {
			return getRuleContext(StartTagContext.class,0);
		}
		public TerminalNode LBB() { return getToken(QueryGrammarParser.LBB, 0); }
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public TerminalNode RBB() { return getToken(QueryGrammarParser.RBB, 0); }
		public EndTagContext endTag() {
			return getRuleContext(EndTagContext.class,0);
		}
		public TagXqContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryGrammarListener ) ((QueryGrammarListener)listener).enterTagXq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryGrammarListener ) ((QueryGrammarListener)listener).exitTagXq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryGrammarVisitor ) return ((QueryGrammarVisitor<? extends T>)visitor).visitTagXq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final XqContext xq() throws RecognitionException {
		return xq(0);
	}

	private XqContext xq(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		XqContext _localctx = new XqContext(_ctx, _parentState);
		XqContext _prevctx = _localctx;
		int _startState = 0;
		enterRecursionRule(_localctx, 0, RULE_xq, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				{
				_localctx = new VarXqContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(43);
				match(VAR);
				}
				break;
			case STRING:
				{
				_localctx = new StringXqContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(44);
				match(STRING);
				}
				break;
			case DOC:
				{
				_localctx = new ApXqContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(45);
				ap();
				}
				break;
			case LPR:
				{
				_localctx = new ParaXqContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(46);
				match(LPR);
				setState(47);
				xq(0);
				setState(48);
				match(RPR);
				}
				break;
			case LAB:
				{
				_localctx = new TagXqContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(50);
				startTag();
				setState(51);
				match(LBB);
				setState(52);
				xq(0);
				setState(53);
				match(RBB);
				setState(54);
				endTag();
				}
				break;
			case FOR:
				{
				_localctx = new ForXqContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(56);
				forClause();
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LET) {
					{
					setState(57);
					letClause();
					}
				}

				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(60);
					whereClause();
					}
				}

				setState(63);
				returnClause();
				}
				break;
			case LET:
				{
				_localctx = new LetXqContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(65);
				letClause();
				setState(66);
				xq(2);
				}
				break;
			case JOIN:
				{
				_localctx = new JoinXqContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(68);
				joinClause();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(80);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(78);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new BinaryXqContext(new XqContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_xq);
						setState(71);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(72);
						match(COMMA);
						setState(73);
						xq(7);
						}
						break;
					case 2:
						{
						_localctx = new RpXqContext(new XqContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_xq);
						setState(74);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(75);
						pathOp();
						setState(76);
						rp(0);
						}
						break;
					}
					} 
				}
				setState(82);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ConstantListContext extends ParserRuleContext {
		public TerminalNode LSB() { return getToken(QueryGrammarParser.LSB, 0); }
		public List<TerminalNode> ID() { return getTokens(QueryGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(QueryGrammarParser.ID, i);
		}
		public TerminalNode RSB() { return getToken(QueryGrammarParser.RSB, 0); }
		public List<TerminalNode> COMMA() { return getTokens(QueryGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(QueryGrammarParser.COMMA, i);
		}
		public ConstantListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryGrammarListener ) ((QueryGrammarListener)listener).enterConstantList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryGrammarListener ) ((QueryGrammarListener)listener).exitConstantList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryGrammarVisitor ) return ((QueryGrammarVisitor<? extends T>)visitor).visitConstantList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantListContext constantList() throws RecognitionException {
		ConstantListContext _localctx = new ConstantListContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_constantList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(LSB);
			setState(84);
			match(ID);
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(85);
				match(COMMA);
				setState(86);
				match(ID);
				}
				}
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(92);
			match(RSB);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JoinClauseContext extends ParserRuleContext {
		public JoinClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinClause; }
	 
		public JoinClauseContext() { }
		public void copyFrom(JoinClauseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Join1Context extends JoinClauseContext {
		public TerminalNode JOIN() { return getToken(QueryGrammarParser.JOIN, 0); }
		public TerminalNode LPR() { return getToken(QueryGrammarParser.LPR, 0); }
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(QueryGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(QueryGrammarParser.COMMA, i);
		}
		public List<ConstantListContext> constantList() {
			return getRuleContexts(ConstantListContext.class);
		}
		public ConstantListContext constantList(int i) {
			return getRuleContext(ConstantListContext.class,i);
		}
		public TerminalNode RPR() { return getToken(QueryGrammarParser.RPR, 0); }
		public Join1Context(JoinClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryGrammarListener ) ((QueryGrammarListener)listener).enterJoin1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryGrammarListener ) ((QueryGrammarListener)listener).exitJoin1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryGrammarVisitor ) return ((QueryGrammarVisitor<? extends T>)visitor).visitJoin1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Join2Context extends JoinClauseContext {
		public TerminalNode JOIN() { return getToken(QueryGrammarParser.JOIN, 0); }
		public TerminalNode LPR() { return getToken(QueryGrammarParser.LPR, 0); }
		public JoinClauseContext joinClause() {
			return getRuleContext(JoinClauseContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(QueryGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(QueryGrammarParser.COMMA, i);
		}
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public List<ConstantListContext> constantList() {
			return getRuleContexts(ConstantListContext.class);
		}
		public ConstantListContext constantList(int i) {
			return getRuleContext(ConstantListContext.class,i);
		}
		public TerminalNode RPR() { return getToken(QueryGrammarParser.RPR, 0); }
		public Join2Context(JoinClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryGrammarListener ) ((QueryGrammarListener)listener).enterJoin2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryGrammarListener ) ((QueryGrammarListener)listener).exitJoin2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryGrammarVisitor ) return ((QueryGrammarVisitor<? extends T>)visitor).visitJoin2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Join3Context extends JoinClauseContext {
		public TerminalNode JOIN() { return getToken(QueryGrammarParser.JOIN, 0); }
		public TerminalNode LPR() { return getToken(QueryGrammarParser.LPR, 0); }
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(QueryGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(QueryGrammarParser.COMMA, i);
		}
		public JoinClauseContext joinClause() {
			return getRuleContext(JoinClauseContext.class,0);
		}
		public List<ConstantListContext> constantList() {
			return getRuleContexts(ConstantListContext.class);
		}
		public ConstantListContext constantList(int i) {
			return getRuleContext(ConstantListContext.class,i);
		}
		public TerminalNode RPR() { return getToken(QueryGrammarParser.RPR, 0); }
		public Join3Context(JoinClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryGrammarListener ) ((QueryGrammarListener)listener).enterJoin3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryGrammarListener ) ((QueryGrammarListener)listener).exitJoin3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryGrammarVisitor ) return ((QueryGrammarVisitor<? extends T>)visitor).visitJoin3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinClauseContext joinClause() throws RecognitionException {
		JoinClauseContext _localctx = new JoinClauseContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_joinClause);
		try {
			setState(127);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new Join1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				match(JOIN);
				setState(95);
				match(LPR);
				setState(96);
				xq(0);
				setState(97);
				match(COMMA);
				setState(98);
				xq(0);
				setState(99);
				match(COMMA);
				setState(100);
				constantList();
				setState(101);
				match(COMMA);
				setState(102);
				constantList();
				setState(103);
				match(RPR);
				}
				break;
			case 2:
				_localctx = new Join2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				match(JOIN);
				setState(106);
				match(LPR);
				setState(107);
				joinClause();
				setState(108);
				match(COMMA);
				setState(109);
				xq(0);
				setState(110);
				match(COMMA);
				setState(111);
				constantList();
				setState(112);
				match(COMMA);
				setState(113);
				constantList();
				setState(114);
				match(RPR);
				}
				break;
			case 3:
				_localctx = new Join3Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(116);
				match(JOIN);
				setState(117);
				match(LPR);
				setState(118);
				xq(0);
				setState(119);
				match(COMMA);
				setState(120);
				joinClause();
				setState(121);
				match(COMMA);
				setState(122);
				constantList();
				setState(123);
				match(COMMA);
				setState(124);
				constantList();
				setState(125);
				match(RPR);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForClauseContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(QueryGrammarParser.FOR, 0); }
		public List<TerminalNode> VAR() { return getTokens(QueryGrammarParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(QueryGrammarParser.VAR, i);
		}
		public List<TerminalNode> IN() { return getTokens(QueryGrammarParser.IN); }
		public TerminalNode IN(int i) {
			return getToken(QueryGrammarParser.IN, i);
		}
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(QueryGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(QueryGrammarParser.COMMA, i);
		}
		public ForClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryGrammarListener ) ((QueryGrammarListener)listener).enterForClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryGrammarListener ) ((QueryGrammarListener)listener).exitForClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryGrammarVisitor ) return ((QueryGrammarVisitor<? extends T>)visitor).visitForClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForClauseContext forClause() throws RecognitionException {
		ForClauseContext _localctx = new ForClauseContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_forClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(FOR);
			setState(130);
			match(VAR);
			setState(131);
			match(IN);
			setState(132);
			xq(0);
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(133);
				match(COMMA);
				setState(134);
				match(VAR);
				setState(135);
				match(IN);
				setState(136);
				xq(0);
				}
				}
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LetClauseContext extends ParserRuleContext {
		public TerminalNode LET() { return getToken(QueryGrammarParser.LET, 0); }
		public List<TerminalNode> VAR() { return getTokens(QueryGrammarParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(QueryGrammarParser.VAR, i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(QueryGrammarParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(QueryGrammarParser.ASSIGN, i);
		}
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(QueryGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(QueryGrammarParser.COMMA, i);
		}
		public LetClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryGrammarListener ) ((QueryGrammarListener)listener).enterLetClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryGrammarListener ) ((QueryGrammarListener)listener).exitLetClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryGrammarVisitor ) return ((QueryGrammarVisitor<? extends T>)visitor).visitLetClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LetClauseContext letClause() throws RecognitionException {
		LetClauseContext _localctx = new LetClauseContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_letClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(LET);
			setState(143);
			match(VAR);
			setState(144);
			match(ASSIGN);
			setState(145);
			xq(0);
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(146);
				match(COMMA);
				setState(147);
				match(VAR);
				setState(148);
				match(ASSIGN);
				setState(149);
				xq(0);
				}
				}
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhereClauseContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(QueryGrammarParser.WHERE, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryGrammarListener ) ((QueryGrammarListener)listener).enterWhereClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryGrammarListener ) ((QueryGrammarListener)listener).exitWhereClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryGrammarVisitor ) return ((QueryGrammarVisitor<? extends T>)visitor).visitWhereClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(WHERE);
			setState(156);
			cond(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnClauseContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(QueryGrammarParser.RETURN, 0); }
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public ReturnClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryGrammarListener ) ((QueryGrammarListener)listener).enterReturnClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryGrammarListener ) ((QueryGrammarListener)listener).exitReturnClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryGrammarVisitor ) return ((QueryGrammarVisitor<? extends T>)visitor).visitReturnClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnClauseContext returnClause() throws RecognitionException {
		ReturnClauseContext _localctx = new ReturnClauseContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_returnClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(RETURN);
			setState(159);
			xq(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CondContext extends ParserRuleContext {
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
	 
		public CondContext() { }
		public void copyFrom(CondContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EqCond2Context extends CondContext {
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public TerminalNode EQS() { return getToken(QueryGrammarParser.EQS, 0); }
		public EqCond2Context(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryGrammarListener ) ((QueryGrammarListener)listener).enterEqCond2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryGrammarListener ) ((QueryGrammarListener)listener).exitEqCond2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryGrammarVisitor ) return ((QueryGrammarVisitor<? extends T>)visitor).visitEqCond2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CompoundCondContext extends CondContext {
		public List<CondContext> cond() {
			return getRuleContexts(CondContext.class);
		}
		public CondContext cond(int i) {
			return getRuleContext(CondContext.class,i);
		}
		public TerminalNode CONJ() { return getToken(QueryGrammarParser.CONJ, 0); }
		public CompoundCondContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryGrammarListener ) ((QueryGrammarListener)listener).enterCompoundCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryGrammarListener ) ((QueryGrammarListener)listener).exitCompoundCond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryGrammarVisitor ) return ((QueryGrammarVisitor<? extends T>)visitor).visitCompoundCond(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqCond1Context extends CondContext {
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public TerminalNode EQ() { return getToken(QueryGrammarParser.EQ, 0); }
		public EqCond1Context(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryGrammarListener ) ((QueryGrammarListener)listener).enterEqCond1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryGrammarListener ) ((QueryGrammarListener)listener).exitEqCond1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryGrammarVisitor ) return ((QueryGrammarVisitor<? extends T>)visitor).visitEqCond1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SatCondContext extends CondContext {
		public SatisfyContext satisfy() {
			return getRuleContext(SatisfyContext.class,0);
		}
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public SatCondContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryGrammarListener ) ((QueryGrammarListener)listener).enterSatCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryGrammarListener ) ((QueryGrammarListener)listener).exitSatCond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryGrammarVisitor ) return ((QueryGrammarVisitor<? extends T>)visitor).visitSatCond(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EmptyCondContext extends CondContext {
		public TerminalNode EMPTY() { return getToken(QueryGrammarParser.EMPTY, 0); }
		public TerminalNode LPR() { return getToken(QueryGrammarParser.LPR, 0); }
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public TerminalNode RPR() { return getToken(QueryGrammarParser.RPR, 0); }
		public EmptyCondContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryGrammarListener ) ((QueryGrammarListener)listener).enterEmptyCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryGrammarListener ) ((QueryGrammarListener)listener).exitEmptyCond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryGrammarVisitor ) return ((QueryGrammarVisitor<? extends T>)visitor).visitEmptyCond(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NegCondContext extends CondContext {
		public TerminalNode NEG() { return getToken(QueryGrammarParser.NEG, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public NegCondContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryGrammarListener ) ((QueryGrammarListener)listener).enterNegCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryGrammarListener ) ((QueryGrammarListener)listener).exitNegCond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryGrammarVisitor ) return ((QueryGrammarVisitor<? extends T>)visitor).visitNegCond(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParaCondContext extends CondContext {
		public TerminalNode LPR() { return getToken(QueryGrammarParser.LPR, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public TerminalNode RPR() { return getToken(QueryGrammarParser.RPR, 0); }
		public ParaCondContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryGrammarListener ) ((QueryGrammarListener)listener).enterParaCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryGrammarListener ) ((QueryGrammarListener)listener).exitParaCond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryGrammarVisitor ) return ((QueryGrammarVisitor<? extends T>)visitor).visitParaCond(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IsCond1Context extends CondContext {
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public TerminalNode IS() { return getToken(QueryGrammarParser.IS, 0); }
		public IsCond1Context(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryGrammarListener ) ((QueryGrammarListener)listener).enterIsCond1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryGrammarListener ) ((QueryGrammarListener)listener).exitIsCond1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryGrammarVisitor ) return ((QueryGrammarVisitor<? extends T>)visitor).visitIsCond1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IsCond2Context extends CondContext {
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public TerminalNode ISS() { return getToken(QueryGrammarParser.ISS, 0); }
		public IsCond2Context(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryGrammarListener ) ((QueryGrammarListener)listener).enterIsCond2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryGrammarListener ) ((QueryGrammarListener)listener).exitIsCond2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryGrammarVisitor ) return ((QueryGrammarVisitor<? extends T>)visitor).visitIsCond2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondContext cond() throws RecognitionException {
		return cond(0);
	}

	private CondContext cond(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CondContext _localctx = new CondContext(_ctx, _parentState);
		CondContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_cond, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				_localctx = new EqCond1Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(162);
				xq(0);
				setState(163);
				match(EQ);
				setState(164);
				xq(0);
				}
				break;
			case 2:
				{
				_localctx = new EqCond2Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(166);
				xq(0);
				setState(167);
				match(EQS);
				setState(168);
				xq(0);
				}
				break;
			case 3:
				{
				_localctx = new IsCond1Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(170);
				xq(0);
				setState(171);
				match(IS);
				setState(172);
				xq(0);
				}
				break;
			case 4:
				{
				_localctx = new IsCond2Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(174);
				xq(0);
				setState(175);
				match(ISS);
				setState(176);
				xq(0);
				}
				break;
			case 5:
				{
				_localctx = new EmptyCondContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(178);
				match(EMPTY);
				setState(179);
				match(LPR);
				setState(180);
				xq(0);
				setState(181);
				match(RPR);
				}
				break;
			case 6:
				{
				_localctx = new SatCondContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(183);
				satisfy();
				setState(184);
				cond(4);
				}
				break;
			case 7:
				{
				_localctx = new ParaCondContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(186);
				match(LPR);
				setState(187);
				cond(0);
				setState(188);
				match(RPR);
				}
				break;
			case 8:
				{
				_localctx = new NegCondContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(190);
				match(NEG);
				setState(191);
				cond(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(199);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CompoundCondContext(new CondContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_cond);
					setState(194);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(195);
					match(CONJ);
					setState(196);
					cond(3);
					}
					} 
				}
				setState(201);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class SatisfyContext extends ParserRuleContext {
		public TerminalNode SOME() { return getToken(QueryGrammarParser.SOME, 0); }
		public List<TerminalNode> VAR() { return getTokens(QueryGrammarParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(QueryGrammarParser.VAR, i);
		}
		public List<TerminalNode> IN() { return getTokens(QueryGrammarParser.IN); }
		public TerminalNode IN(int i) {
			return getToken(QueryGrammarParser.IN, i);
		}
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public TerminalNode SATISF() { return getToken(QueryGrammarParser.SATISF, 0); }
		public List<TerminalNode> COMMA() { return getTokens(QueryGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(QueryGrammarParser.COMMA, i);
		}
		public SatisfyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_satisfy; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryGrammarListener ) ((QueryGrammarListener)listener).enterSatisfy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryGrammarListener ) ((QueryGrammarListener)listener).exitSatisfy(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryGrammarVisitor ) return ((QueryGrammarVisitor<? extends T>)visitor).visitSatisfy(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SatisfyContext satisfy() throws RecognitionException {
		SatisfyContext _localctx = new SatisfyContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_satisfy);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(SOME);
			setState(203);
			match(VAR);
			setState(204);
			match(IN);
			setState(205);
			xq(0);
			setState(212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(206);
				match(COMMA);
				setState(207);
				match(VAR);
				setState(208);
				match(IN);
				setState(209);
				xq(0);
				}
				}
				setState(214);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(215);
			match(SATISF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StartTagContext extends ParserRuleContext {
		public TerminalNode LAB() { return getToken(QueryGrammarParser.LAB, 0); }
		public TagNameContext tagName() {
			return getRuleContext(TagNameContext.class,0);
		}
		public TerminalNode RAB() { return getToken(QueryGrammarParser.RAB, 0); }
		public StartTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_startTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryGrammarListener ) ((QueryGrammarListener)listener).enterStartTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryGrammarListener ) ((QueryGrammarListener)listener).exitStartTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryGrammarVisitor ) return ((QueryGrammarVisitor<? extends T>)visitor).visitStartTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartTagContext startTag() throws RecognitionException {
		StartTagContext _localctx = new StartTagContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_startTag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(LAB);
			setState(218);
			tagName();
			setState(219);
			match(RAB);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EndTagContext extends ParserRuleContext {
		public TerminalNode LAB() { return getToken(QueryGrammarParser.LAB, 0); }
		public TerminalNode SL() { return getToken(QueryGrammarParser.SL, 0); }
		public TagNameContext tagName() {
			return getRuleContext(TagNameContext.class,0);
		}
		public TerminalNode RAB() { return getToken(QueryGrammarParser.RAB, 0); }
		public EndTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryGrammarListener ) ((QueryGrammarListener)listener).enterEndTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryGrammarListener ) ((QueryGrammarListener)listener).exitEndTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryGrammarVisitor ) return ((QueryGrammarVisitor<? extends T>)visitor).visitEndTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EndTagContext endTag() throws RecognitionException {
		EndTagContext _localctx = new EndTagContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_endTag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(LAB);
			setState(222);
			match(SL);
			setState(223);
			tagName();
			setState(224);
			match(RAB);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ApContext extends ParserRuleContext {
		public DocNameContext docName() {
			return getRuleContext(DocNameContext.class,0);
		}
		public PathOpContext pathOp() {
			return getRuleContext(PathOpContext.class,0);
		}
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public ApContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ap; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryGrammarListener ) ((QueryGrammarListener)listener).enterAp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryGrammarListener ) ((QueryGrammarListener)listener).exitAp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryGrammarVisitor ) return ((QueryGrammarVisitor<? extends T>)visitor).visitAp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ApContext ap() throws RecognitionException {
		ApContext _localctx = new ApContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_ap);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			docName();
			setState(227);
			pathOp();
			setState(228);
			rp(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RpContext extends ParserRuleContext {
		public RpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rp; }
	 
		public RpContext() { }
		public void copyFrom(RpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UnaryRp3Context extends RpContext {
		public TerminalNode TEXT() { return getToken(QueryGrammarParser.TEXT, 0); }
		public UnaryRp3Context(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryGrammarListener ) ((QueryGrammarListener)listener).enterUnaryRp3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryGrammarListener ) ((QueryGrammarListener)listener).exitUnaryRp3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryGrammarVisitor ) return ((QueryGrammarVisitor<? extends T>)visitor).visitUnaryRp3(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BinaryRp1Context extends RpContext {
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public PathOpContext pathOp() {
			return getRuleContext(PathOpContext.class,0);
		}
		public BinaryRp1Context(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryGrammarListener ) ((QueryGrammarListener)listener).enterBinaryRp1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryGrammarListener ) ((QueryGrammarListener)listener).exitBinaryRp1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryGrammarVisitor ) return ((QueryGrammarVisitor<? extends T>)visitor).visitBinaryRp1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryRp4Context extends RpContext {
		public TerminalNode STAR() { return getToken(QueryGrammarParser.STAR, 0); }
		public UnaryRp4Context(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryGrammarListener ) ((QueryGrammarListener)listener).enterUnaryRp4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryGrammarListener ) ((QueryGrammarListener)listener).exitUnaryRp4(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryGrammarVisitor ) return ((QueryGrammarVisitor<? extends T>)visitor).visitUnaryRp4(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParaRpContext extends RpContext {
		public TerminalNode LPR() { return getToken(QueryGrammarParser.LPR, 0); }
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public TerminalNode RPR() { return getToken(QueryGrammarParser.RPR, 0); }
		public ParaRpContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryGrammarListener ) ((QueryGrammarListener)listener).enterParaRp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryGrammarListener ) ((QueryGrammarListener)listener).exitParaRp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryGrammarVisitor ) return ((QueryGrammarVisitor<? extends T>)visitor).visitParaRp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BinaryRp2Context extends RpContext {
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(QueryGrammarParser.COMMA, 0); }
		public BinaryRp2Context(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryGrammarListener ) ((QueryGrammarListener)listener).enterBinaryRp2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryGrammarListener ) ((QueryGrammarListener)listener).exitBinaryRp2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryGrammarVisitor ) return ((QueryGrammarVisitor<? extends T>)visitor).visitBinaryRp2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryRp1Context extends RpContext {
		public TagNameContext tagName() {
			return getRuleContext(TagNameContext.class,0);
		}
		public UnaryRp1Context(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryGrammarListener ) ((QueryGrammarListener)listener).enterUnaryRp1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryGrammarListener ) ((QueryGrammarListener)listener).exitUnaryRp1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryGrammarVisitor ) return ((QueryGrammarVisitor<? extends T>)visitor).visitUnaryRp1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryRp2Context extends RpContext {
		public AttNameContext attName() {
			return getRuleContext(AttNameContext.class,0);
		}
		public UnaryRp2Context(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryGrammarListener ) ((QueryGrammarListener)listener).enterUnaryRp2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryGrammarListener ) ((QueryGrammarListener)listener).exitUnaryRp2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryGrammarVisitor ) return ((QueryGrammarVisitor<? extends T>)visitor).visitUnaryRp2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FilterRpContext extends RpContext {
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public TerminalNode LSB() { return getToken(QueryGrammarParser.LSB, 0); }
		public FilterContext filter() {
			return getRuleContext(FilterContext.class,0);
		}
		public TerminalNode RSB() { return getToken(QueryGrammarParser.RSB, 0); }
		public FilterRpContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryGrammarListener ) ((QueryGrammarListener)listener).enterFilterRp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryGrammarListener ) ((QueryGrammarListener)listener).exitFilterRp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryGrammarVisitor ) return ((QueryGrammarVisitor<? extends T>)visitor).visitFilterRp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryRp5Context extends RpContext {
		public TerminalNode SELF() { return getToken(QueryGrammarParser.SELF, 0); }
		public UnaryRp5Context(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryGrammarListener ) ((QueryGrammarListener)listener).enterUnaryRp5(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryGrammarListener ) ((QueryGrammarListener)listener).exitUnaryRp5(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryGrammarVisitor ) return ((QueryGrammarVisitor<? extends T>)visitor).visitUnaryRp5(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryRp6Context extends RpContext {
		public TerminalNode PENT() { return getToken(QueryGrammarParser.PENT, 0); }
		public UnaryRp6Context(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryGrammarListener ) ((QueryGrammarListener)listener).enterUnaryRp6(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryGrammarListener ) ((QueryGrammarListener)listener).exitUnaryRp6(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryGrammarVisitor ) return ((QueryGrammarVisitor<? extends T>)visitor).visitUnaryRp6(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RpContext rp() throws RecognitionException {
		return rp(0);
	}

	private RpContext rp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RpContext _localctx = new RpContext(_ctx, _parentState);
		RpContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_rp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				_localctx = new UnaryRp1Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(231);
				tagName();
				}
				break;
			case AT:
				{
				_localctx = new UnaryRp2Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(232);
				attName();
				}
				break;
			case TEXT:
				{
				_localctx = new UnaryRp3Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(233);
				match(TEXT);
				}
				break;
			case STAR:
				{
				_localctx = new UnaryRp4Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(234);
				match(STAR);
				}
				break;
			case SELF:
				{
				_localctx = new UnaryRp5Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(235);
				match(SELF);
				}
				break;
			case PENT:
				{
				_localctx = new UnaryRp6Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(236);
				match(PENT);
				}
				break;
			case LPR:
				{
				_localctx = new ParaRpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(237);
				match(LPR);
				setState(238);
				rp(0);
				setState(239);
				match(RPR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(257);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(255);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new BinaryRp1Context(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(243);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(244);
						pathOp();
						setState(245);
						rp(5);
						}
						break;
					case 2:
						{
						_localctx = new BinaryRp2Context(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(247);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(248);
						match(COMMA);
						setState(249);
						rp(4);
						}
						break;
					case 3:
						{
						_localctx = new FilterRpContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(250);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(251);
						match(LSB);
						setState(252);
						filter(0);
						setState(253);
						match(RSB);
						}
						break;
					}
					} 
				}
				setState(259);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class FilterContext extends ParserRuleContext {
		public FilterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filter; }
	 
		public FilterContext() { }
		public void copyFrom(FilterContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BinaryFt1Context extends FilterContext {
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public CompOpContext compOp() {
			return getRuleContext(CompOpContext.class,0);
		}
		public BinaryFt1Context(FilterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryGrammarListener ) ((QueryGrammarListener)listener).enterBinaryFt1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryGrammarListener ) ((QueryGrammarListener)listener).exitBinaryFt1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryGrammarVisitor ) return ((QueryGrammarVisitor<? extends T>)visitor).visitBinaryFt1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BinaryFt2Context extends FilterContext {
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public TerminalNode EQS() { return getToken(QueryGrammarParser.EQS, 0); }
		public StringConditionContext stringCondition() {
			return getRuleContext(StringConditionContext.class,0);
		}
		public BinaryFt2Context(FilterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryGrammarListener ) ((QueryGrammarListener)listener).enterBinaryFt2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryGrammarListener ) ((QueryGrammarListener)listener).exitBinaryFt2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryGrammarVisitor ) return ((QueryGrammarVisitor<? extends T>)visitor).visitBinaryFt2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParaFtContext extends FilterContext {
		public TerminalNode LPR() { return getToken(QueryGrammarParser.LPR, 0); }
		public FilterContext filter() {
			return getRuleContext(FilterContext.class,0);
		}
		public TerminalNode RPR() { return getToken(QueryGrammarParser.RPR, 0); }
		public ParaFtContext(FilterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryGrammarListener ) ((QueryGrammarListener)listener).enterParaFt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryGrammarListener ) ((QueryGrammarListener)listener).exitParaFt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryGrammarVisitor ) return ((QueryGrammarVisitor<? extends T>)visitor).visitParaFt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NegFtContext extends FilterContext {
		public TerminalNode NEG() { return getToken(QueryGrammarParser.NEG, 0); }
		public FilterContext filter() {
			return getRuleContext(FilterContext.class,0);
		}
		public NegFtContext(FilterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryGrammarListener ) ((QueryGrammarListener)listener).enterNegFt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryGrammarListener ) ((QueryGrammarListener)listener).exitNegFt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryGrammarVisitor ) return ((QueryGrammarVisitor<? extends T>)visitor).visitNegFt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CompoundFtContext extends FilterContext {
		public List<FilterContext> filter() {
			return getRuleContexts(FilterContext.class);
		}
		public FilterContext filter(int i) {
			return getRuleContext(FilterContext.class,i);
		}
		public TerminalNode CONJ() { return getToken(QueryGrammarParser.CONJ, 0); }
		public CompoundFtContext(FilterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryGrammarListener ) ((QueryGrammarListener)listener).enterCompoundFt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryGrammarListener ) ((QueryGrammarListener)listener).exitCompoundFt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryGrammarVisitor ) return ((QueryGrammarVisitor<? extends T>)visitor).visitCompoundFt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryFtContext extends FilterContext {
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public UnaryFtContext(FilterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryGrammarListener ) ((QueryGrammarListener)listener).enterUnaryFt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryGrammarListener ) ((QueryGrammarListener)listener).exitUnaryFt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryGrammarVisitor ) return ((QueryGrammarVisitor<? extends T>)visitor).visitUnaryFt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilterContext filter() throws RecognitionException {
		return filter(0);
	}

	private FilterContext filter(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		FilterContext _localctx = new FilterContext(_ctx, _parentState);
		FilterContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_filter, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				_localctx = new UnaryFtContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(261);
				rp(0);
				}
				break;
			case 2:
				{
				_localctx = new BinaryFt1Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(262);
				rp(0);
				setState(263);
				compOp();
				setState(264);
				rp(0);
				}
				break;
			case 3:
				{
				_localctx = new BinaryFt2Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(266);
				rp(0);
				setState(267);
				match(EQS);
				setState(268);
				stringCondition();
				}
				break;
			case 4:
				{
				_localctx = new ParaFtContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(270);
				match(LPR);
				setState(271);
				filter(0);
				setState(272);
				match(RPR);
				}
				break;
			case 5:
				{
				_localctx = new NegFtContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(274);
				match(NEG);
				setState(275);
				filter(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(283);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CompoundFtContext(new FilterContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_filter);
					setState(278);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(279);
					match(CONJ);
					setState(280);
					filter(3);
					}
					} 
				}
				setState(285);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PathOpContext extends ParserRuleContext {
		public TerminalNode SL() { return getToken(QueryGrammarParser.SL, 0); }
		public TerminalNode DSL() { return getToken(QueryGrammarParser.DSL, 0); }
		public PathOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pathOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryGrammarListener ) ((QueryGrammarListener)listener).enterPathOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryGrammarListener ) ((QueryGrammarListener)listener).exitPathOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryGrammarVisitor ) return ((QueryGrammarVisitor<? extends T>)visitor).visitPathOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PathOpContext pathOp() throws RecognitionException {
		PathOpContext _localctx = new PathOpContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_pathOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			_la = _input.LA(1);
			if ( !(_la==SL || _la==DSL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DocNameContext extends ParserRuleContext {
		public TerminalNode DOC() { return getToken(QueryGrammarParser.DOC, 0); }
		public TerminalNode LPR() { return getToken(QueryGrammarParser.LPR, 0); }
		public FileNameContext fileName() {
			return getRuleContext(FileNameContext.class,0);
		}
		public TerminalNode RPR() { return getToken(QueryGrammarParser.RPR, 0); }
		public DocNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_docName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryGrammarListener ) ((QueryGrammarListener)listener).enterDocName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryGrammarListener ) ((QueryGrammarListener)listener).exitDocName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryGrammarVisitor ) return ((QueryGrammarVisitor<? extends T>)visitor).visitDocName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DocNameContext docName() throws RecognitionException {
		DocNameContext _localctx = new DocNameContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_docName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			match(DOC);
			setState(289);
			match(LPR);
			setState(290);
			fileName();
			setState(291);
			match(RPR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FileNameContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(QueryGrammarParser.STRING, 0); }
		public FileNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryGrammarListener ) ((QueryGrammarListener)listener).enterFileName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryGrammarListener ) ((QueryGrammarListener)listener).exitFileName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryGrammarVisitor ) return ((QueryGrammarVisitor<? extends T>)visitor).visitFileName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileNameContext fileName() throws RecognitionException {
		FileNameContext _localctx = new FileNameContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_fileName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TagNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(QueryGrammarParser.ID, 0); }
		public TagNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tagName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryGrammarListener ) ((QueryGrammarListener)listener).enterTagName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryGrammarListener ) ((QueryGrammarListener)listener).exitTagName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryGrammarVisitor ) return ((QueryGrammarVisitor<? extends T>)visitor).visitTagName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TagNameContext tagName() throws RecognitionException {
		TagNameContext _localctx = new TagNameContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_tagName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttNameContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(QueryGrammarParser.AT, 0); }
		public TerminalNode ID() { return getToken(QueryGrammarParser.ID, 0); }
		public AttNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryGrammarListener ) ((QueryGrammarListener)listener).enterAttName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryGrammarListener ) ((QueryGrammarListener)listener).exitAttName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryGrammarVisitor ) return ((QueryGrammarVisitor<? extends T>)visitor).visitAttName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttNameContext attName() throws RecognitionException {
		AttNameContext _localctx = new AttNameContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_attName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			match(AT);
			setState(298);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompOpContext extends ParserRuleContext {
		public TerminalNode EQS() { return getToken(QueryGrammarParser.EQS, 0); }
		public TerminalNode EQ() { return getToken(QueryGrammarParser.EQ, 0); }
		public TerminalNode ISS() { return getToken(QueryGrammarParser.ISS, 0); }
		public TerminalNode IS() { return getToken(QueryGrammarParser.IS, 0); }
		public CompOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryGrammarListener ) ((QueryGrammarListener)listener).enterCompOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryGrammarListener ) ((QueryGrammarListener)listener).exitCompOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryGrammarVisitor ) return ((QueryGrammarVisitor<? extends T>)visitor).visitCompOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompOpContext compOp() throws RecognitionException {
		CompOpContext _localctx = new CompOpContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_compOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQS) | (1L << EQ) | (1L << ISS) | (1L << IS))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringConditionContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(QueryGrammarParser.STRING, 0); }
		public StringConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryGrammarListener ) ((QueryGrammarListener)listener).enterStringCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryGrammarListener ) ((QueryGrammarListener)listener).exitStringCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QueryGrammarVisitor ) return ((QueryGrammarVisitor<? extends T>)visitor).visitStringCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringConditionContext stringCondition() throws RecognitionException {
		StringConditionContext _localctx = new StringConditionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_stringCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 0:
			return xq_sempred((XqContext)_localctx, predIndex);
		case 7:
			return cond_sempred((CondContext)_localctx, predIndex);
		case 12:
			return rp_sempred((RpContext)_localctx, predIndex);
		case 13:
			return filter_sempred((FilterContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean xq_sempred(XqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean cond_sempred(CondContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean rp_sempred(RpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean filter_sempred(FilterContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3(\u0133\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2=\n\2\3\2\5\2@\n\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\5\2H\n\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2Q\n\2\f\2\16\2T\13"+
		"\2\3\3\3\3\3\3\3\3\7\3Z\n\3\f\3\16\3]\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u0082\n\4\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\7\5\u008c\n\5\f\5\16\5\u008f\13\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\7\6\u0099\n\6\f\6\16\6\u009c\13\6\3\7\3\7\3\7\3\b\3\b\3"+
		"\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00c3\n\t"+
		"\3\t\3\t\3\t\7\t\u00c8\n\t\f\t\16\t\u00cb\13\t\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\7\n\u00d5\n\n\f\n\16\n\u00d8\13\n\3\n\3\n\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\5\16\u00f4\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\7\16\u0102\n\16\f\16\16\16\u0105\13\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\5\17\u0117\n\17\3\17\3\17\3\17\7\17\u011c\n\17\f\17\16\17\u011f"+
		"\13\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24"+
		"\3\24\3\25\3\25\3\26\3\26\3\26\2\6\2\20\32\34\27\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*\2\4\3\2\22\23\3\2\34\37\2\u0144\2G\3\2\2\2\4"+
		"U\3\2\2\2\6\u0081\3\2\2\2\b\u0083\3\2\2\2\n\u0090\3\2\2\2\f\u009d\3\2"+
		"\2\2\16\u00a0\3\2\2\2\20\u00c2\3\2\2\2\22\u00cc\3\2\2\2\24\u00db\3\2\2"+
		"\2\26\u00df\3\2\2\2\30\u00e4\3\2\2\2\32\u00f3\3\2\2\2\34\u0116\3\2\2\2"+
		"\36\u0120\3\2\2\2 \u0122\3\2\2\2\"\u0127\3\2\2\2$\u0129\3\2\2\2&\u012b"+
		"\3\2\2\2(\u012e\3\2\2\2*\u0130\3\2\2\2,-\b\2\1\2-H\7\4\2\2.H\7\'\2\2/"+
		"H\5\30\r\2\60\61\7\27\2\2\61\62\5\2\2\2\62\63\7\30\2\2\63H\3\2\2\2\64"+
		"\65\5\24\13\2\65\66\7\7\2\2\66\67\5\2\2\2\678\7\b\2\289\5\26\f\29H\3\2"+
		"\2\2:<\5\b\5\2;=\5\n\6\2<;\3\2\2\2<=\3\2\2\2=?\3\2\2\2>@\5\f\7\2?>\3\2"+
		"\2\2?@\3\2\2\2@A\3\2\2\2AB\5\16\b\2BH\3\2\2\2CD\5\n\6\2DE\5\2\2\4EH\3"+
		"\2\2\2FH\5\6\4\2G,\3\2\2\2G.\3\2\2\2G/\3\2\2\2G\60\3\2\2\2G\64\3\2\2\2"+
		"G:\3\2\2\2GC\3\2\2\2GF\3\2\2\2HR\3\2\2\2IJ\f\b\2\2JK\7\33\2\2KQ\5\2\2"+
		"\tLM\f\7\2\2MN\5\36\20\2NO\5\32\16\2OQ\3\2\2\2PI\3\2\2\2PL\3\2\2\2QT\3"+
		"\2\2\2RP\3\2\2\2RS\3\2\2\2S\3\3\2\2\2TR\3\2\2\2UV\7\31\2\2V[\7%\2\2WX"+
		"\7\33\2\2XZ\7%\2\2YW\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\^\3\2\2\2"+
		"][\3\2\2\2^_\7\32\2\2_\5\3\2\2\2`a\7\3\2\2ab\7\27\2\2bc\5\2\2\2cd\7\33"+
		"\2\2de\5\2\2\2ef\7\33\2\2fg\5\4\3\2gh\7\33\2\2hi\5\4\3\2ij\7\30\2\2j\u0082"+
		"\3\2\2\2kl\7\3\2\2lm\7\27\2\2mn\5\6\4\2no\7\33\2\2op\5\2\2\2pq\7\33\2"+
		"\2qr\5\4\3\2rs\7\33\2\2st\5\4\3\2tu\7\30\2\2u\u0082\3\2\2\2vw\7\3\2\2"+
		"wx\7\27\2\2xy\5\2\2\2yz\7\33\2\2z{\5\6\4\2{|\7\33\2\2|}\5\4\3\2}~\7\33"+
		"\2\2~\177\5\4\3\2\177\u0080\7\30\2\2\u0080\u0082\3\2\2\2\u0081`\3\2\2"+
		"\2\u0081k\3\2\2\2\u0081v\3\2\2\2\u0082\7\3\2\2\2\u0083\u0084\7\t\2\2\u0084"+
		"\u0085\7\4\2\2\u0085\u0086\7\n\2\2\u0086\u008d\5\2\2\2\u0087\u0088\7\33"+
		"\2\2\u0088\u0089\7\4\2\2\u0089\u008a\7\n\2\2\u008a\u008c\5\2\2\2\u008b"+
		"\u0087\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2"+
		"\2\2\u008e\t\3\2\2\2\u008f\u008d\3\2\2\2\u0090\u0091\7\13\2\2\u0091\u0092"+
		"\7\4\2\2\u0092\u0093\7\f\2\2\u0093\u009a\5\2\2\2\u0094\u0095\7\33\2\2"+
		"\u0095\u0096\7\4\2\2\u0096\u0097\7\f\2\2\u0097\u0099\5\2\2\2\u0098\u0094"+
		"\3\2\2\2\u0099\u009c\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b"+
		"\13\3\2\2\2\u009c\u009a\3\2\2\2\u009d\u009e\7\r\2\2\u009e\u009f\5\20\t"+
		"\2\u009f\r\3\2\2\2\u00a0\u00a1\7\16\2\2\u00a1\u00a2\5\2\2\2\u00a2\17\3"+
		"\2\2\2\u00a3\u00a4\b\t\1\2\u00a4\u00a5\5\2\2\2\u00a5\u00a6\7\35\2\2\u00a6"+
		"\u00a7\5\2\2\2\u00a7\u00c3\3\2\2\2\u00a8\u00a9\5\2\2\2\u00a9\u00aa\7\34"+
		"\2\2\u00aa\u00ab\5\2\2\2\u00ab\u00c3\3\2\2\2\u00ac\u00ad\5\2\2\2\u00ad"+
		"\u00ae\7\37\2\2\u00ae\u00af\5\2\2\2\u00af\u00c3\3\2\2\2\u00b0\u00b1\5"+
		"\2\2\2\u00b1\u00b2\7\36\2\2\u00b2\u00b3\5\2\2\2\u00b3\u00c3\3\2\2\2\u00b4"+
		"\u00b5\7\17\2\2\u00b5\u00b6\7\27\2\2\u00b6\u00b7\5\2\2\2\u00b7\u00b8\7"+
		"\30\2\2\u00b8\u00c3\3\2\2\2\u00b9\u00ba\5\22\n\2\u00ba\u00bb\5\20\t\6"+
		"\u00bb\u00c3\3\2\2\2\u00bc\u00bd\7\27\2\2\u00bd\u00be\5\20\t\2\u00be\u00bf"+
		"\7\30\2\2\u00bf\u00c3\3\2\2\2\u00c0\u00c1\7 \2\2\u00c1\u00c3\5\20\t\3"+
		"\u00c2\u00a3\3\2\2\2\u00c2\u00a8\3\2\2\2\u00c2\u00ac\3\2\2\2\u00c2\u00b0"+
		"\3\2\2\2\u00c2\u00b4\3\2\2\2\u00c2\u00b9\3\2\2\2\u00c2\u00bc\3\2\2\2\u00c2"+
		"\u00c0\3\2\2\2\u00c3\u00c9\3\2\2\2\u00c4\u00c5\f\4\2\2\u00c5\u00c6\7!"+
		"\2\2\u00c6\u00c8\5\20\t\5\u00c7\u00c4\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9"+
		"\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\21\3\2\2\2\u00cb\u00c9\3\2\2"+
		"\2\u00cc\u00cd\7\20\2\2\u00cd\u00ce\7\4\2\2\u00ce\u00cf\7\n\2\2\u00cf"+
		"\u00d6\5\2\2\2\u00d0\u00d1\7\33\2\2\u00d1\u00d2\7\4\2\2\u00d2\u00d3\7"+
		"\n\2\2\u00d3\u00d5\5\2\2\2\u00d4\u00d0\3\2\2\2\u00d5\u00d8\3\2\2\2\u00d6"+
		"\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d9\3\2\2\2\u00d8\u00d6\3\2"+
		"\2\2\u00d9\u00da\7\21\2\2\u00da\23\3\2\2\2\u00db\u00dc\7\5\2\2\u00dc\u00dd"+
		"\5$\23\2\u00dd\u00de\7\6\2\2\u00de\25\3\2\2\2\u00df\u00e0\7\5\2\2\u00e0"+
		"\u00e1\7\22\2\2\u00e1\u00e2\5$\23\2\u00e2\u00e3\7\6\2\2\u00e3\27\3\2\2"+
		"\2\u00e4\u00e5\5 \21\2\u00e5\u00e6\5\36\20\2\u00e6\u00e7\5\32\16\2\u00e7"+
		"\31\3\2\2\2\u00e8\u00e9\b\16\1\2\u00e9\u00f4\5$\23\2\u00ea\u00f4\5&\24"+
		"\2\u00eb\u00f4\7\"\2\2\u00ec\u00f4\7\26\2\2\u00ed\u00f4\7\24\2\2\u00ee"+
		"\u00f4\7\25\2\2\u00ef\u00f0\7\27\2\2\u00f0\u00f1\5\32\16\2\u00f1\u00f2"+
		"\7\30\2\2\u00f2\u00f4\3\2\2\2\u00f3\u00e8\3\2\2\2\u00f3\u00ea\3\2\2\2"+
		"\u00f3\u00eb\3\2\2\2\u00f3\u00ec\3\2\2\2\u00f3\u00ed\3\2\2\2\u00f3\u00ee"+
		"\3\2\2\2\u00f3\u00ef\3\2\2\2\u00f4\u0103\3\2\2\2\u00f5\u00f6\f\6\2\2\u00f6"+
		"\u00f7\5\36\20\2\u00f7\u00f8\5\32\16\7\u00f8\u0102\3\2\2\2\u00f9\u00fa"+
		"\f\5\2\2\u00fa\u00fb\7\33\2\2\u00fb\u0102\5\32\16\6\u00fc\u00fd\f\3\2"+
		"\2\u00fd\u00fe\7\31\2\2\u00fe\u00ff\5\34\17\2\u00ff\u0100\7\32\2\2\u0100"+
		"\u0102\3\2\2\2\u0101\u00f5\3\2\2\2\u0101\u00f9\3\2\2\2\u0101\u00fc\3\2"+
		"\2\2\u0102\u0105\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104"+
		"\33\3\2\2\2\u0105\u0103\3\2\2\2\u0106\u0107\b\17\1\2\u0107\u0117\5\32"+
		"\16\2\u0108\u0109\5\32\16\2\u0109\u010a\5(\25\2\u010a\u010b\5\32\16\2"+
		"\u010b\u0117\3\2\2\2\u010c\u010d\5\32\16\2\u010d\u010e\7\34\2\2\u010e"+
		"\u010f\5*\26\2\u010f\u0117\3\2\2\2\u0110\u0111\7\27\2\2\u0111\u0112\5"+
		"\34\17\2\u0112\u0113\7\30\2\2\u0113\u0117\3\2\2\2\u0114\u0115\7 \2\2\u0115"+
		"\u0117\5\34\17\3\u0116\u0106\3\2\2\2\u0116\u0108\3\2\2\2\u0116\u010c\3"+
		"\2\2\2\u0116\u0110\3\2\2\2\u0116\u0114\3\2\2\2\u0117\u011d\3\2\2\2\u0118"+
		"\u0119\f\4\2\2\u0119\u011a\7!\2\2\u011a\u011c\5\34\17\5\u011b\u0118\3"+
		"\2\2\2\u011c\u011f\3\2\2\2\u011d\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e"+
		"\35\3\2\2\2\u011f\u011d\3\2\2\2\u0120\u0121\t\2\2\2\u0121\37\3\2\2\2\u0122"+
		"\u0123\7$\2\2\u0123\u0124\7\27\2\2\u0124\u0125\5\"\22\2\u0125\u0126\7"+
		"\30\2\2\u0126!\3\2\2\2\u0127\u0128\7\'\2\2\u0128#\3\2\2\2\u0129\u012a"+
		"\7%\2\2\u012a%\3\2\2\2\u012b\u012c\7#\2\2\u012c\u012d\7%\2\2\u012d\'\3"+
		"\2\2\2\u012e\u012f\t\3\2\2\u012f)\3\2\2\2\u0130\u0131\7\'\2\2\u0131+\3"+
		"\2\2\2\23<?GPR[\u0081\u008d\u009a\u00c2\u00c9\u00d6\u00f3\u0101\u0103"+
		"\u0116\u011d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}