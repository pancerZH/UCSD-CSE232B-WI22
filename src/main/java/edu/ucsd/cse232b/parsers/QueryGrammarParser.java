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
		RULE_returnClause = 4, RULE_cond = 5, RULE_satisfy = 6, RULE_startTag = 7, 
		RULE_endTag = 8, RULE_ap = 9, RULE_rp = 10, RULE_filter = 11, RULE_pathOp = 12, 
		RULE_docName = 13, RULE_fileName = 14, RULE_tagName = 15, RULE_attName = 16, 
		RULE_compOp = 17, RULE_stringCondition = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"xq", "forClause", "letClause", "whereClause", "returnClause", "cond", 
			"satisfy", "startTag", "endTag", "ap", "rp", "filter", "pathOp", "docName", 
			"fileName", "tagName", "attName", "compOp", "stringCondition"
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
			setState(64);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				{
				_localctx = new VarXqContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(39);
				match(VAR);
				}
				break;
			case STRING:
				{
				_localctx = new StringXqContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(40);
				match(STRING);
				}
				break;
			case DOC:
				{
				_localctx = new ApXqContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(41);
				ap();
				}
				break;
			case LPR:
				{
				_localctx = new ParaXqContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(42);
				match(LPR);
				setState(43);
				xq(0);
				setState(44);
				match(RPR);
				}
				break;
			case LAB:
				{
				_localctx = new TagXqContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(46);
				startTag();
				setState(47);
				match(LBB);
				setState(48);
				xq(0);
				setState(49);
				match(RBB);
				setState(50);
				endTag();
				}
				break;
			case FOR:
				{
				_localctx = new ForXqContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(52);
				forClause();
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LET) {
					{
					setState(53);
					letClause();
					}
				}

				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(56);
					whereClause();
					}
				}

				setState(59);
				returnClause();
				}
				break;
			case LET:
				{
				_localctx = new LetXqContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(61);
				letClause();
				setState(62);
				xq(1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(75);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(73);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new BinaryXqContext(new XqContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_xq);
						setState(66);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(67);
						match(COMMA);
						setState(68);
						xq(6);
						}
						break;
					case 2:
						{
						_localctx = new RpXqContext(new XqContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_xq);
						setState(69);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(70);
						pathOp();
						setState(71);
						rp(0);
						}
						break;
					}
					} 
				}
				setState(77);
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
			setState(78);
			match(FOR);
			setState(79);
			match(VAR);
			setState(80);
			match(IN);
			setState(81);
			xq(0);
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(82);
				match(COMMA);
				setState(83);
				match(VAR);
				setState(84);
				match(IN);
				setState(85);
				xq(0);
				}
				}
				setState(90);
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
			setState(91);
			match(LET);
			setState(92);
			match(VAR);
			setState(93);
			match(ASSIGN);
			setState(94);
			xq(0);
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(95);
				match(COMMA);
				setState(96);
				match(VAR);
				setState(97);
				match(ASSIGN);
				setState(98);
				xq(0);
				}
				}
				setState(103);
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
			setState(104);
			match(WHERE);
			setState(105);
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
			setState(107);
			match(RETURN);
			setState(108);
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
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_cond, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				_localctx = new EqCond1Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(111);
				xq(0);
				setState(112);
				match(EQ);
				setState(113);
				xq(0);
				}
				break;
			case 2:
				{
				_localctx = new EqCond2Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(115);
				xq(0);
				setState(116);
				match(EQS);
				setState(117);
				xq(0);
				}
				break;
			case 3:
				{
				_localctx = new IsCond1Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(119);
				xq(0);
				setState(120);
				match(IS);
				setState(121);
				xq(0);
				}
				break;
			case 4:
				{
				_localctx = new IsCond2Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(123);
				xq(0);
				setState(124);
				match(ISS);
				setState(125);
				xq(0);
				}
				break;
			case 5:
				{
				_localctx = new EmptyCondContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(127);
				match(EMPTY);
				setState(128);
				match(LPR);
				setState(129);
				xq(0);
				setState(130);
				match(RPR);
				}
				break;
			case 6:
				{
				_localctx = new SatCondContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(132);
				satisfy();
				setState(133);
				cond(4);
				}
				break;
			case 7:
				{
				_localctx = new ParaCondContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(135);
				match(LPR);
				setState(136);
				cond(0);
				setState(137);
				match(RPR);
				}
				break;
			case 8:
				{
				_localctx = new NegCondContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(139);
				match(NEG);
				setState(140);
				cond(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(148);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CompoundCondContext(new CondContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_cond);
					setState(143);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(144);
					match(CONJ);
					setState(145);
					cond(3);
					}
					} 
				}
				setState(150);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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
		enterRule(_localctx, 12, RULE_satisfy);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(SOME);
			setState(152);
			match(VAR);
			setState(153);
			match(IN);
			setState(154);
			xq(0);
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(155);
				match(COMMA);
				setState(156);
				match(VAR);
				setState(157);
				match(IN);
				setState(158);
				xq(0);
				}
				}
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(164);
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
		enterRule(_localctx, 14, RULE_startTag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(LAB);
			setState(167);
			tagName();
			setState(168);
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
		enterRule(_localctx, 16, RULE_endTag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(LAB);
			setState(171);
			match(SL);
			setState(172);
			tagName();
			setState(173);
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
		enterRule(_localctx, 18, RULE_ap);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			docName();
			setState(176);
			pathOp();
			setState(177);
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
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_rp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				_localctx = new UnaryRp1Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(180);
				tagName();
				}
				break;
			case AT:
				{
				_localctx = new UnaryRp2Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(181);
				attName();
				}
				break;
			case TEXT:
				{
				_localctx = new UnaryRp3Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(182);
				match(TEXT);
				}
				break;
			case STAR:
				{
				_localctx = new UnaryRp4Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(183);
				match(STAR);
				}
				break;
			case SELF:
				{
				_localctx = new UnaryRp5Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(184);
				match(SELF);
				}
				break;
			case PENT:
				{
				_localctx = new UnaryRp6Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(185);
				match(PENT);
				}
				break;
			case LPR:
				{
				_localctx = new ParaRpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(186);
				match(LPR);
				setState(187);
				rp(0);
				setState(188);
				match(RPR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(206);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(204);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new BinaryRp1Context(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(192);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(193);
						pathOp();
						setState(194);
						rp(5);
						}
						break;
					case 2:
						{
						_localctx = new BinaryRp2Context(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(196);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(197);
						match(COMMA);
						setState(198);
						rp(4);
						}
						break;
					case 3:
						{
						_localctx = new FilterRpContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(199);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(200);
						match(LSB);
						setState(201);
						filter(0);
						setState(202);
						match(RSB);
						}
						break;
					}
					} 
				}
				setState(208);
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
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_filter, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				_localctx = new UnaryFtContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(210);
				rp(0);
				}
				break;
			case 2:
				{
				_localctx = new BinaryFt1Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(211);
				rp(0);
				setState(212);
				compOp();
				setState(213);
				rp(0);
				}
				break;
			case 3:
				{
				_localctx = new BinaryFt2Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(215);
				rp(0);
				setState(216);
				match(EQS);
				setState(217);
				stringCondition();
				}
				break;
			case 4:
				{
				_localctx = new ParaFtContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(219);
				match(LPR);
				setState(220);
				filter(0);
				setState(221);
				match(RPR);
				}
				break;
			case 5:
				{
				_localctx = new NegFtContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(223);
				match(NEG);
				setState(224);
				filter(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(232);
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
					setState(227);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(228);
					match(CONJ);
					setState(229);
					filter(3);
					}
					} 
				}
				setState(234);
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
		enterRule(_localctx, 24, RULE_pathOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
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
		enterRule(_localctx, 26, RULE_docName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(DOC);
			setState(238);
			match(LPR);
			setState(239);
			fileName();
			setState(240);
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
		enterRule(_localctx, 28, RULE_fileName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
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
		enterRule(_localctx, 30, RULE_tagName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
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
		enterRule(_localctx, 32, RULE_attName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(AT);
			setState(247);
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
		enterRule(_localctx, 34, RULE_compOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
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
		enterRule(_localctx, 36, RULE_stringCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
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
		case 10:
			return rp_sempred((RpContext)_localctx, predIndex);
		case 11:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\'\u0100\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\5\29\n\2\3\2\5\2<\n\2\3\2\3\2\3\2\3\2\3\2\5\2C\n\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\7\2L\n\2\f\2\16\2O\13\2\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\7\3Y\n\3\f\3\16\3\\\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7"+
		"\4f\n\4\f\4\16\4i\13\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0090\n\7\3\7\3\7\3\7\7\7\u0095\n\7"+
		"\f\7\16\7\u0098\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u00a2\n\b\f\b"+
		"\16\b\u00a5\13\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00c1\n\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00cf\n\f\f\f\16\f"+
		"\u00d2\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\5\r\u00e4\n\r\3\r\3\r\3\r\7\r\u00e9\n\r\f\r\16\r\u00ec\13\r\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\23"+
		"\3\23\3\24\3\24\3\24\2\6\2\f\26\30\25\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&\2\4\3\2\21\22\3\2\33\36\2\u010f\2B\3\2\2\2\4P\3\2\2\2\6]\3"+
		"\2\2\2\bj\3\2\2\2\nm\3\2\2\2\f\u008f\3\2\2\2\16\u0099\3\2\2\2\20\u00a8"+
		"\3\2\2\2\22\u00ac\3\2\2\2\24\u00b1\3\2\2\2\26\u00c0\3\2\2\2\30\u00e3\3"+
		"\2\2\2\32\u00ed\3\2\2\2\34\u00ef\3\2\2\2\36\u00f4\3\2\2\2 \u00f6\3\2\2"+
		"\2\"\u00f8\3\2\2\2$\u00fb\3\2\2\2&\u00fd\3\2\2\2()\b\2\1\2)C\7\3\2\2*"+
		"C\7&\2\2+C\5\24\13\2,-\7\26\2\2-.\5\2\2\2./\7\27\2\2/C\3\2\2\2\60\61\5"+
		"\20\t\2\61\62\7\6\2\2\62\63\5\2\2\2\63\64\7\7\2\2\64\65\5\22\n\2\65C\3"+
		"\2\2\2\668\5\4\3\2\679\5\6\4\28\67\3\2\2\289\3\2\2\29;\3\2\2\2:<\5\b\5"+
		"\2;:\3\2\2\2;<\3\2\2\2<=\3\2\2\2=>\5\n\6\2>C\3\2\2\2?@\5\6\4\2@A\5\2\2"+
		"\3AC\3\2\2\2B(\3\2\2\2B*\3\2\2\2B+\3\2\2\2B,\3\2\2\2B\60\3\2\2\2B\66\3"+
		"\2\2\2B?\3\2\2\2CM\3\2\2\2DE\f\7\2\2EF\7\32\2\2FL\5\2\2\bGH\f\6\2\2HI"+
		"\5\32\16\2IJ\5\26\f\2JL\3\2\2\2KD\3\2\2\2KG\3\2\2\2LO\3\2\2\2MK\3\2\2"+
		"\2MN\3\2\2\2N\3\3\2\2\2OM\3\2\2\2PQ\7\b\2\2QR\7\3\2\2RS\7\t\2\2SZ\5\2"+
		"\2\2TU\7\32\2\2UV\7\3\2\2VW\7\t\2\2WY\5\2\2\2XT\3\2\2\2Y\\\3\2\2\2ZX\3"+
		"\2\2\2Z[\3\2\2\2[\5\3\2\2\2\\Z\3\2\2\2]^\7\n\2\2^_\7\3\2\2_`\7\13\2\2"+
		"`g\5\2\2\2ab\7\32\2\2bc\7\3\2\2cd\7\13\2\2df\5\2\2\2ea\3\2\2\2fi\3\2\2"+
		"\2ge\3\2\2\2gh\3\2\2\2h\7\3\2\2\2ig\3\2\2\2jk\7\f\2\2kl\5\f\7\2l\t\3\2"+
		"\2\2mn\7\r\2\2no\5\2\2\2o\13\3\2\2\2pq\b\7\1\2qr\5\2\2\2rs\7\34\2\2st"+
		"\5\2\2\2t\u0090\3\2\2\2uv\5\2\2\2vw\7\33\2\2wx\5\2\2\2x\u0090\3\2\2\2"+
		"yz\5\2\2\2z{\7\36\2\2{|\5\2\2\2|\u0090\3\2\2\2}~\5\2\2\2~\177\7\35\2\2"+
		"\177\u0080\5\2\2\2\u0080\u0090\3\2\2\2\u0081\u0082\7\16\2\2\u0082\u0083"+
		"\7\26\2\2\u0083\u0084\5\2\2\2\u0084\u0085\7\27\2\2\u0085\u0090\3\2\2\2"+
		"\u0086\u0087\5\16\b\2\u0087\u0088\5\f\7\6\u0088\u0090\3\2\2\2\u0089\u008a"+
		"\7\26\2\2\u008a\u008b\5\f\7\2\u008b\u008c\7\27\2\2\u008c\u0090\3\2\2\2"+
		"\u008d\u008e\7\37\2\2\u008e\u0090\5\f\7\3\u008fp\3\2\2\2\u008fu\3\2\2"+
		"\2\u008fy\3\2\2\2\u008f}\3\2\2\2\u008f\u0081\3\2\2\2\u008f\u0086\3\2\2"+
		"\2\u008f\u0089\3\2\2\2\u008f\u008d\3\2\2\2\u0090\u0096\3\2\2\2\u0091\u0092"+
		"\f\4\2\2\u0092\u0093\7 \2\2\u0093\u0095\5\f\7\5\u0094\u0091\3\2\2\2\u0095"+
		"\u0098\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\r\3\2\2\2"+
		"\u0098\u0096\3\2\2\2\u0099\u009a\7\17\2\2\u009a\u009b\7\3\2\2\u009b\u009c"+
		"\7\t\2\2\u009c\u00a3\5\2\2\2\u009d\u009e\7\32\2\2\u009e\u009f\7\3\2\2"+
		"\u009f\u00a0\7\t\2\2\u00a0\u00a2\5\2\2\2\u00a1\u009d\3\2\2\2\u00a2\u00a5"+
		"\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a6\3\2\2\2\u00a5"+
		"\u00a3\3\2\2\2\u00a6\u00a7\7\20\2\2\u00a7\17\3\2\2\2\u00a8\u00a9\7\4\2"+
		"\2\u00a9\u00aa\5 \21\2\u00aa\u00ab\7\5\2\2\u00ab\21\3\2\2\2\u00ac\u00ad"+
		"\7\4\2\2\u00ad\u00ae\7\21\2\2\u00ae\u00af\5 \21\2\u00af\u00b0\7\5\2\2"+
		"\u00b0\23\3\2\2\2\u00b1\u00b2\5\34\17\2\u00b2\u00b3\5\32\16\2\u00b3\u00b4"+
		"\5\26\f\2\u00b4\25\3\2\2\2\u00b5\u00b6\b\f\1\2\u00b6\u00c1\5 \21\2\u00b7"+
		"\u00c1\5\"\22\2\u00b8\u00c1\7!\2\2\u00b9\u00c1\7\25\2\2\u00ba\u00c1\7"+
		"\23\2\2\u00bb\u00c1\7\24\2\2\u00bc\u00bd\7\26\2\2\u00bd\u00be\5\26\f\2"+
		"\u00be\u00bf\7\27\2\2\u00bf\u00c1\3\2\2\2\u00c0\u00b5\3\2\2\2\u00c0\u00b7"+
		"\3\2\2\2\u00c0\u00b8\3\2\2\2\u00c0\u00b9\3\2\2\2\u00c0\u00ba\3\2\2\2\u00c0"+
		"\u00bb\3\2\2\2\u00c0\u00bc\3\2\2\2\u00c1\u00d0\3\2\2\2\u00c2\u00c3\f\6"+
		"\2\2\u00c3\u00c4\5\32\16\2\u00c4\u00c5\5\26\f\7\u00c5\u00cf\3\2\2\2\u00c6"+
		"\u00c7\f\5\2\2\u00c7\u00c8\7\32\2\2\u00c8\u00cf\5\26\f\6\u00c9\u00ca\f"+
		"\3\2\2\u00ca\u00cb\7\30\2\2\u00cb\u00cc\5\30\r\2\u00cc\u00cd\7\31\2\2"+
		"\u00cd\u00cf\3\2\2\2\u00ce\u00c2\3\2\2\2\u00ce\u00c6\3\2\2\2\u00ce\u00c9"+
		"\3\2\2\2\u00cf\u00d2\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1"+
		"\27\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3\u00d4\b\r\1\2\u00d4\u00e4\5\26\f"+
		"\2\u00d5\u00d6\5\26\f\2\u00d6\u00d7\5$\23\2\u00d7\u00d8\5\26\f\2\u00d8"+
		"\u00e4\3\2\2\2\u00d9\u00da\5\26\f\2\u00da\u00db\7\33\2\2\u00db\u00dc\5"+
		"&\24\2\u00dc\u00e4\3\2\2\2\u00dd\u00de\7\26\2\2\u00de\u00df\5\30\r\2\u00df"+
		"\u00e0\7\27\2\2\u00e0\u00e4\3\2\2\2\u00e1\u00e2\7\37\2\2\u00e2\u00e4\5"+
		"\30\r\3\u00e3\u00d3\3\2\2\2\u00e3\u00d5\3\2\2\2\u00e3\u00d9\3\2\2\2\u00e3"+
		"\u00dd\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e4\u00ea\3\2\2\2\u00e5\u00e6\f\4"+
		"\2\2\u00e6\u00e7\7 \2\2\u00e7\u00e9\5\30\r\5\u00e8\u00e5\3\2\2\2\u00e9"+
		"\u00ec\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\31\3\2\2"+
		"\2\u00ec\u00ea\3\2\2\2\u00ed\u00ee\t\2\2\2\u00ee\33\3\2\2\2\u00ef\u00f0"+
		"\7#\2\2\u00f0\u00f1\7\26\2\2\u00f1\u00f2\5\36\20\2\u00f2\u00f3\7\27\2"+
		"\2\u00f3\35\3\2\2\2\u00f4\u00f5\7&\2\2\u00f5\37\3\2\2\2\u00f6\u00f7\7"+
		"$\2\2\u00f7!\3\2\2\2\u00f8\u00f9\7\"\2\2\u00f9\u00fa\7$\2\2\u00fa#\3\2"+
		"\2\2\u00fb\u00fc\t\3\2\2\u00fc%\3\2\2\2\u00fd\u00fe\7&\2\2\u00fe\'\3\2"+
		"\2\2\218;BKMZg\u008f\u0096\u00a3\u00c0\u00ce\u00d0\u00e3\u00ea";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}