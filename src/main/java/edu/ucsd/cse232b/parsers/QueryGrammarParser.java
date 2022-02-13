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
		VAR=1, LAB=2, RAB=3, LBB=4, RBB=5, FOR=6, IN=7, LET=8, ASSIGN=9, WHERE=10, 
		RETURN=11, EMPTY=12, SOME=13, SATISF=14, SL=15, DSL=16, SELF=17, PENT=18, 
		STAR=19, LPR=20, RPR=21, LSB=22, RSB=23, COMMA=24, EQS=25, EQ=26, ISS=27, 
		IS=28, NEG=29, CONJ=30, TEXT=31, AT=32, DOC=33, ID=34, WS=35, STRING=36, 
		ESCAPE=37;
	public static final int
		RULE_xq = 0, RULE_forClause = 1, RULE_letClause = 2, RULE_whereClause = 3, 
		RULE_returnClause = 4, RULE_cond = 5, RULE_startTag = 6, RULE_endTag = 7, 
		RULE_ap = 8, RULE_rp = 9, RULE_filter = 10, RULE_pathOp = 11, RULE_docName = 12, 
		RULE_fileName = 13, RULE_tagName = 14, RULE_attName = 15, RULE_compOp = 16, 
		RULE_stringCondition = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"xq", "forClause", "letClause", "whereClause", "returnClause", "cond", 
			"startTag", "endTag", "ap", "rp", "filter", "pathOp", "docName", "fileName", 
			"tagName", "attName", "compOp", "stringCondition"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'<'", "'>'", "'{'", "'}'", "'for'", "'in'", "'let'", "':='", 
			"'where'", "'return'", "'empty'", "'some'", "'satisfies'", "'/'", "'//'", 
			"'.'", "'..'", "'*'", "'('", "')'", "'['", "']'", "','", "'='", "'eq'", 
			"'=='", "'is'", "'not'", null, "'text()'", "'@'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "VAR", "LAB", "RAB", "LBB", "RBB", "FOR", "IN", "LET", "ASSIGN", 
			"WHERE", "RETURN", "EMPTY", "SOME", "SATISF", "SL", "DSL", "SELF", "PENT", 
			"STAR", "LPR", "RPR", "LSB", "RSB", "COMMA", "EQS", "EQ", "ISS", "IS", 
			"NEG", "CONJ", "TEXT", "AT", "DOC", "ID", "WS", "STRING", "ESCAPE"
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
			setState(62);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				{
				_localctx = new VarXqContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(37);
				match(VAR);
				}
				break;
			case STRING:
				{
				_localctx = new StringXqContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(38);
				match(STRING);
				}
				break;
			case DOC:
				{
				_localctx = new ApXqContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(39);
				ap();
				}
				break;
			case LPR:
				{
				_localctx = new ParaXqContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(40);
				match(LPR);
				setState(41);
				xq(0);
				setState(42);
				match(RPR);
				}
				break;
			case LAB:
				{
				_localctx = new TagXqContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(44);
				startTag();
				setState(45);
				match(LBB);
				setState(46);
				xq(0);
				setState(47);
				match(RBB);
				setState(48);
				endTag();
				}
				break;
			case FOR:
				{
				_localctx = new ForXqContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(50);
				forClause();
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LET) {
					{
					setState(51);
					letClause();
					}
				}

				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(54);
					whereClause();
					}
				}

				setState(57);
				returnClause();
				}
				break;
			case LET:
				{
				_localctx = new LetXqContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(59);
				letClause();
				setState(60);
				xq(1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(73);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(71);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new BinaryXqContext(new XqContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_xq);
						setState(64);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(65);
						match(COMMA);
						setState(66);
						xq(6);
						}
						break;
					case 2:
						{
						_localctx = new RpXqContext(new XqContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_xq);
						setState(67);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(68);
						pathOp();
						setState(69);
						rp(0);
						}
						break;
					}
					} 
				}
				setState(75);
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
		enterRule(_localctx, 2, RULE_forClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(FOR);
			setState(77);
			match(VAR);
			setState(78);
			match(IN);
			setState(79);
			xq(0);
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(80);
				match(COMMA);
				setState(81);
				match(VAR);
				setState(82);
				match(IN);
				setState(83);
				xq(0);
				}
				}
				setState(88);
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
		enterRule(_localctx, 4, RULE_letClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(LET);
			setState(90);
			match(VAR);
			setState(91);
			match(ASSIGN);
			setState(92);
			xq(0);
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(93);
				match(COMMA);
				setState(94);
				match(VAR);
				setState(95);
				match(ASSIGN);
				setState(96);
				xq(0);
				}
				}
				setState(101);
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
		enterRule(_localctx, 6, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(WHERE);
			setState(103);
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
		enterRule(_localctx, 8, RULE_returnClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(RETURN);
			setState(106);
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
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(QueryGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(QueryGrammarParser.COMMA, i);
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
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_cond, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				_localctx = new EqCond1Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(109);
				xq(0);
				setState(110);
				match(EQ);
				setState(111);
				xq(0);
				}
				break;
			case 2:
				{
				_localctx = new EqCond2Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(113);
				xq(0);
				setState(114);
				match(EQS);
				setState(115);
				xq(0);
				}
				break;
			case 3:
				{
				_localctx = new IsCond1Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(117);
				xq(0);
				setState(118);
				match(IS);
				setState(119);
				xq(0);
				}
				break;
			case 4:
				{
				_localctx = new IsCond2Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(121);
				xq(0);
				setState(122);
				match(ISS);
				setState(123);
				xq(0);
				}
				break;
			case 5:
				{
				_localctx = new EmptyCondContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(125);
				match(EMPTY);
				setState(126);
				match(LPR);
				setState(127);
				xq(0);
				setState(128);
				match(RPR);
				}
				break;
			case 6:
				{
				_localctx = new SatCondContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(130);
				match(SOME);
				setState(131);
				match(VAR);
				setState(132);
				match(IN);
				setState(133);
				xq(0);
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(134);
					match(COMMA);
					setState(135);
					match(VAR);
					setState(136);
					match(IN);
					setState(137);
					xq(0);
					}
					}
					setState(142);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(143);
				match(SATISF);
				setState(144);
				cond(4);
				}
				break;
			case 7:
				{
				_localctx = new ParaCondContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(146);
				match(LPR);
				setState(147);
				cond(0);
				setState(148);
				match(RPR);
				}
				break;
			case 8:
				{
				_localctx = new NegCondContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(150);
				match(NEG);
				setState(151);
				cond(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(159);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CompoundCondContext(new CondContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_cond);
					setState(154);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(155);
					match(CONJ);
					setState(156);
					cond(3);
					}
					} 
				}
				setState(161);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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
		enterRule(_localctx, 12, RULE_startTag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(LAB);
			setState(163);
			tagName();
			setState(164);
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
		enterRule(_localctx, 14, RULE_endTag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(LAB);
			setState(167);
			match(SL);
			setState(168);
			tagName();
			setState(169);
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
		enterRule(_localctx, 16, RULE_ap);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			docName();
			setState(172);
			pathOp();
			setState(173);
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
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_rp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				_localctx = new UnaryRp1Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(176);
				tagName();
				}
				break;
			case AT:
				{
				_localctx = new UnaryRp2Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(177);
				attName();
				}
				break;
			case TEXT:
				{
				_localctx = new UnaryRp3Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(178);
				match(TEXT);
				}
				break;
			case STAR:
				{
				_localctx = new UnaryRp4Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(179);
				match(STAR);
				}
				break;
			case SELF:
				{
				_localctx = new UnaryRp5Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(180);
				match(SELF);
				}
				break;
			case PENT:
				{
				_localctx = new UnaryRp6Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(181);
				match(PENT);
				}
				break;
			case LPR:
				{
				_localctx = new ParaRpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(182);
				match(LPR);
				setState(183);
				rp(0);
				setState(184);
				match(RPR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(202);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(200);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new BinaryRp1Context(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(188);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(189);
						pathOp();
						setState(190);
						rp(5);
						}
						break;
					case 2:
						{
						_localctx = new BinaryRp2Context(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(192);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(193);
						match(COMMA);
						setState(194);
						rp(4);
						}
						break;
					case 3:
						{
						_localctx = new FilterRpContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(195);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(196);
						match(LSB);
						setState(197);
						filter(0);
						setState(198);
						match(RSB);
						}
						break;
					}
					} 
				}
				setState(204);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_filter, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				_localctx = new UnaryFtContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(206);
				rp(0);
				}
				break;
			case 2:
				{
				_localctx = new BinaryFt1Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(207);
				rp(0);
				setState(208);
				compOp();
				setState(209);
				rp(0);
				}
				break;
			case 3:
				{
				_localctx = new BinaryFt2Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(211);
				rp(0);
				setState(212);
				match(EQS);
				setState(213);
				stringCondition();
				}
				break;
			case 4:
				{
				_localctx = new ParaFtContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(215);
				match(LPR);
				setState(216);
				filter(0);
				setState(217);
				match(RPR);
				}
				break;
			case 5:
				{
				_localctx = new NegFtContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(219);
				match(NEG);
				setState(220);
				filter(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(228);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CompoundFtContext(new FilterContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_filter);
					setState(223);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(224);
					match(CONJ);
					setState(225);
					filter(3);
					}
					} 
				}
				setState(230);
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
		enterRule(_localctx, 22, RULE_pathOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
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
		enterRule(_localctx, 24, RULE_docName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(DOC);
			setState(234);
			match(LPR);
			setState(235);
			fileName();
			setState(236);
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
		enterRule(_localctx, 26, RULE_fileName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
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
		enterRule(_localctx, 28, RULE_tagName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
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
		enterRule(_localctx, 30, RULE_attName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			match(AT);
			setState(243);
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
		enterRule(_localctx, 32, RULE_compOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
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
		enterRule(_localctx, 34, RULE_stringCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
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
		case 5:
			return cond_sempred((CondContext)_localctx, predIndex);
		case 9:
			return rp_sempred((RpContext)_localctx, predIndex);
		case 10:
			return filter_sempred((FilterContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean xq_sempred(XqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\'\u00fc\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\5\2\67\n\2\3\2\5\2:\n\2\3\2\3\2\3\2\3\2\3\2\5\2A\n\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\7\2J\n\2\f\2\16\2M\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\7\3W\n\3\f\3\16\3Z\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4d\n\4\f"+
		"\4\16\4g\13\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\7\7\u008d\n\7\f\7\16\7\u0090\13\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\5\7\u009b\n\7\3\7\3\7\3\7\7\7\u00a0\n\7\f\7\16\7\u00a3"+
		"\13\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00bd\n\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00cb\n\13\f\13"+
		"\16\13\u00ce\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\5\f\u00e0\n\f\3\f\3\f\3\f\7\f\u00e5\n\f\f\f\16\f\u00e8\13"+
		"\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21"+
		"\3\22\3\22\3\23\3\23\3\23\2\6\2\f\24\26\24\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$\2\4\3\2\21\22\3\2\33\36\2\u010c\2@\3\2\2\2\4N\3\2\2\2"+
		"\6[\3\2\2\2\bh\3\2\2\2\nk\3\2\2\2\f\u009a\3\2\2\2\16\u00a4\3\2\2\2\20"+
		"\u00a8\3\2\2\2\22\u00ad\3\2\2\2\24\u00bc\3\2\2\2\26\u00df\3\2\2\2\30\u00e9"+
		"\3\2\2\2\32\u00eb\3\2\2\2\34\u00f0\3\2\2\2\36\u00f2\3\2\2\2 \u00f4\3\2"+
		"\2\2\"\u00f7\3\2\2\2$\u00f9\3\2\2\2&\'\b\2\1\2\'A\7\3\2\2(A\7&\2\2)A\5"+
		"\22\n\2*+\7\26\2\2+,\5\2\2\2,-\7\27\2\2-A\3\2\2\2./\5\16\b\2/\60\7\6\2"+
		"\2\60\61\5\2\2\2\61\62\7\7\2\2\62\63\5\20\t\2\63A\3\2\2\2\64\66\5\4\3"+
		"\2\65\67\5\6\4\2\66\65\3\2\2\2\66\67\3\2\2\2\679\3\2\2\28:\5\b\5\298\3"+
		"\2\2\29:\3\2\2\2:;\3\2\2\2;<\5\n\6\2<A\3\2\2\2=>\5\6\4\2>?\5\2\2\3?A\3"+
		"\2\2\2@&\3\2\2\2@(\3\2\2\2@)\3\2\2\2@*\3\2\2\2@.\3\2\2\2@\64\3\2\2\2@"+
		"=\3\2\2\2AK\3\2\2\2BC\f\7\2\2CD\7\32\2\2DJ\5\2\2\bEF\f\6\2\2FG\5\30\r"+
		"\2GH\5\24\13\2HJ\3\2\2\2IB\3\2\2\2IE\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2"+
		"\2\2L\3\3\2\2\2MK\3\2\2\2NO\7\b\2\2OP\7\3\2\2PQ\7\t\2\2QX\5\2\2\2RS\7"+
		"\32\2\2ST\7\3\2\2TU\7\t\2\2UW\5\2\2\2VR\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY"+
		"\3\2\2\2Y\5\3\2\2\2ZX\3\2\2\2[\\\7\n\2\2\\]\7\3\2\2]^\7\13\2\2^e\5\2\2"+
		"\2_`\7\32\2\2`a\7\3\2\2ab\7\13\2\2bd\5\2\2\2c_\3\2\2\2dg\3\2\2\2ec\3\2"+
		"\2\2ef\3\2\2\2f\7\3\2\2\2ge\3\2\2\2hi\7\f\2\2ij\5\f\7\2j\t\3\2\2\2kl\7"+
		"\r\2\2lm\5\2\2\2m\13\3\2\2\2no\b\7\1\2op\5\2\2\2pq\7\34\2\2qr\5\2\2\2"+
		"r\u009b\3\2\2\2st\5\2\2\2tu\7\33\2\2uv\5\2\2\2v\u009b\3\2\2\2wx\5\2\2"+
		"\2xy\7\36\2\2yz\5\2\2\2z\u009b\3\2\2\2{|\5\2\2\2|}\7\35\2\2}~\5\2\2\2"+
		"~\u009b\3\2\2\2\177\u0080\7\16\2\2\u0080\u0081\7\26\2\2\u0081\u0082\5"+
		"\2\2\2\u0082\u0083\7\27\2\2\u0083\u009b\3\2\2\2\u0084\u0085\7\17\2\2\u0085"+
		"\u0086\7\3\2\2\u0086\u0087\7\t\2\2\u0087\u008e\5\2\2\2\u0088\u0089\7\32"+
		"\2\2\u0089\u008a\7\3\2\2\u008a\u008b\7\t\2\2\u008b\u008d\5\2\2\2\u008c"+
		"\u0088\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2"+
		"\2\2\u008f\u0091\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u0092\7\20\2\2\u0092"+
		"\u0093\5\f\7\6\u0093\u009b\3\2\2\2\u0094\u0095\7\26\2\2\u0095\u0096\5"+
		"\f\7\2\u0096\u0097\7\27\2\2\u0097\u009b\3\2\2\2\u0098\u0099\7\37\2\2\u0099"+
		"\u009b\5\f\7\3\u009an\3\2\2\2\u009as\3\2\2\2\u009aw\3\2\2\2\u009a{\3\2"+
		"\2\2\u009a\177\3\2\2\2\u009a\u0084\3\2\2\2\u009a\u0094\3\2\2\2\u009a\u0098"+
		"\3\2\2\2\u009b\u00a1\3\2\2\2\u009c\u009d\f\4\2\2\u009d\u009e\7 \2\2\u009e"+
		"\u00a0\5\f\7\5\u009f\u009c\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3\2"+
		"\2\2\u00a1\u00a2\3\2\2\2\u00a2\r\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00a5"+
		"\7\4\2\2\u00a5\u00a6\5\36\20\2\u00a6\u00a7\7\5\2\2\u00a7\17\3\2\2\2\u00a8"+
		"\u00a9\7\4\2\2\u00a9\u00aa\7\21\2\2\u00aa\u00ab\5\36\20\2\u00ab\u00ac"+
		"\7\5\2\2\u00ac\21\3\2\2\2\u00ad\u00ae\5\32\16\2\u00ae\u00af\5\30\r\2\u00af"+
		"\u00b0\5\24\13\2\u00b0\23\3\2\2\2\u00b1\u00b2\b\13\1\2\u00b2\u00bd\5\36"+
		"\20\2\u00b3\u00bd\5 \21\2\u00b4\u00bd\7!\2\2\u00b5\u00bd\7\25\2\2\u00b6"+
		"\u00bd\7\23\2\2\u00b7\u00bd\7\24\2\2\u00b8\u00b9\7\26\2\2\u00b9\u00ba"+
		"\5\24\13\2\u00ba\u00bb\7\27\2\2\u00bb\u00bd\3\2\2\2\u00bc\u00b1\3\2\2"+
		"\2\u00bc\u00b3\3\2\2\2\u00bc\u00b4\3\2\2\2\u00bc\u00b5\3\2\2\2\u00bc\u00b6"+
		"\3\2\2\2\u00bc\u00b7\3\2\2\2\u00bc\u00b8\3\2\2\2\u00bd\u00cc\3\2\2\2\u00be"+
		"\u00bf\f\6\2\2\u00bf\u00c0\5\30\r\2\u00c0\u00c1\5\24\13\7\u00c1\u00cb"+
		"\3\2\2\2\u00c2\u00c3\f\5\2\2\u00c3\u00c4\7\32\2\2\u00c4\u00cb\5\24\13"+
		"\6\u00c5\u00c6\f\3\2\2\u00c6\u00c7\7\30\2\2\u00c7\u00c8\5\26\f\2\u00c8"+
		"\u00c9\7\31\2\2\u00c9\u00cb\3\2\2\2\u00ca\u00be\3\2\2\2\u00ca\u00c2\3"+
		"\2\2\2\u00ca\u00c5\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc"+
		"\u00cd\3\2\2\2\u00cd\25\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf\u00d0\b\f\1"+
		"\2\u00d0\u00e0\5\24\13\2\u00d1\u00d2\5\24\13\2\u00d2\u00d3\5\"\22\2\u00d3"+
		"\u00d4\5\24\13\2\u00d4\u00e0\3\2\2\2\u00d5\u00d6\5\24\13\2\u00d6\u00d7"+
		"\7\33\2\2\u00d7\u00d8\5$\23\2\u00d8\u00e0\3\2\2\2\u00d9\u00da\7\26\2\2"+
		"\u00da\u00db\5\26\f\2\u00db\u00dc\7\27\2\2\u00dc\u00e0\3\2\2\2\u00dd\u00de"+
		"\7\37\2\2\u00de\u00e0\5\26\f\3\u00df\u00cf\3\2\2\2\u00df\u00d1\3\2\2\2"+
		"\u00df\u00d5\3\2\2\2\u00df\u00d9\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0\u00e6"+
		"\3\2\2\2\u00e1\u00e2\f\4\2\2\u00e2\u00e3\7 \2\2\u00e3\u00e5\5\26\f\5\u00e4"+
		"\u00e1\3\2\2\2\u00e5\u00e8\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2"+
		"\2\2\u00e7\27\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e9\u00ea\t\2\2\2\u00ea\31"+
		"\3\2\2\2\u00eb\u00ec\7#\2\2\u00ec\u00ed\7\26\2\2\u00ed\u00ee\5\34\17\2"+
		"\u00ee\u00ef\7\27\2\2\u00ef\33\3\2\2\2\u00f0\u00f1\7&\2\2\u00f1\35\3\2"+
		"\2\2\u00f2\u00f3\7$\2\2\u00f3\37\3\2\2\2\u00f4\u00f5\7\"\2\2\u00f5\u00f6"+
		"\7$\2\2\u00f6!\3\2\2\2\u00f7\u00f8\t\3\2\2\u00f8#\3\2\2\2\u00f9\u00fa"+
		"\7&\2\2\u00fa%\3\2\2\2\21\669@IKXe\u008e\u009a\u00a1\u00bc\u00ca\u00cc"+
		"\u00df\u00e6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}