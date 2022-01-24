// Generated from ExpressionGrammar.g4 by ANTLR 4.7.2

package edu.ucsd.CSE232B.parsers;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExpressionGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SL=1, DSL=2, SELF=3, PENT=4, STAR=5, LPR=6, RPR=7, LSB=8, RSB=9, COMMA=10, 
		EQS=11, EQ=12, ISS=13, IS=14, NEG=15, CONJ=16, TEXT=17, AT=18, DOC=19, 
		DQ=20, StringConstant=21, WS=22;
	public static final int
		RULE_ap = 0, RULE_rp = 1, RULE_filter = 2, RULE_pathOp = 3, RULE_doc = 4, 
		RULE_tagName = 5, RULE_attName = 6, RULE_compOp = 7, RULE_stringCondition = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"ap", "rp", "filter", "pathOp", "doc", "tagName", "attName", "compOp", 
			"stringCondition"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'/'", "'//'", "'.'", "'..'", "'*'", "'('", "')'", "'['", "']'", 
			"','", "'='", "'eq'", "'=='", "'is'", "'not'", null, "'text()'", "'@'", 
			"'doc'", "'\"'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SL", "DSL", "SELF", "PENT", "STAR", "LPR", "RPR", "LSB", "RSB", 
			"COMMA", "EQS", "EQ", "ISS", "IS", "NEG", "CONJ", "TEXT", "AT", "DOC", 
			"DQ", "StringConstant", "WS"
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
	public String getGrammarFileName() { return "ExpressionGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ExpressionGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ApContext extends ParserRuleContext {
		public DocContext doc() {
			return getRuleContext(DocContext.class,0);
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
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterAp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitAp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitAp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ApContext ap() throws RecognitionException {
		ApContext _localctx = new ApContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_ap);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			doc();
			setState(19);
			pathOp();
			setState(20);
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
		public TerminalNode TEXT() { return getToken(ExpressionGrammarParser.TEXT, 0); }
		public UnaryRp3Context(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterUnaryRp3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitUnaryRp3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitUnaryRp3(this);
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
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterBinaryRp1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitBinaryRp1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitBinaryRp1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryRp4Context extends RpContext {
		public TerminalNode STAR() { return getToken(ExpressionGrammarParser.STAR, 0); }
		public UnaryRp4Context(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterUnaryRp4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitUnaryRp4(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitUnaryRp4(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParaRpContext extends RpContext {
		public TerminalNode LPR() { return getToken(ExpressionGrammarParser.LPR, 0); }
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public TerminalNode RPR() { return getToken(ExpressionGrammarParser.RPR, 0); }
		public ParaRpContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterParaRp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitParaRp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitParaRp(this);
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
		public TerminalNode COMMA() { return getToken(ExpressionGrammarParser.COMMA, 0); }
		public BinaryRp2Context(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterBinaryRp2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitBinaryRp2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitBinaryRp2(this);
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
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterUnaryRp1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitUnaryRp1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitUnaryRp1(this);
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
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterUnaryRp2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitUnaryRp2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitUnaryRp2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FilterRpContext extends RpContext {
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public TerminalNode LSB() { return getToken(ExpressionGrammarParser.LSB, 0); }
		public FilterContext filter() {
			return getRuleContext(FilterContext.class,0);
		}
		public TerminalNode RSB() { return getToken(ExpressionGrammarParser.RSB, 0); }
		public FilterRpContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterFilterRp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitFilterRp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitFilterRp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryRp5Context extends RpContext {
		public TerminalNode SELF() { return getToken(ExpressionGrammarParser.SELF, 0); }
		public UnaryRp5Context(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterUnaryRp5(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitUnaryRp5(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitUnaryRp5(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryRp6Context extends RpContext {
		public TerminalNode PENT() { return getToken(ExpressionGrammarParser.PENT, 0); }
		public UnaryRp6Context(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterUnaryRp6(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitUnaryRp6(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitUnaryRp6(this);
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
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_rp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StringConstant:
				{
				_localctx = new UnaryRp1Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(23);
				tagName();
				}
				break;
			case AT:
				{
				_localctx = new UnaryRp2Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(24);
				attName();
				}
				break;
			case TEXT:
				{
				_localctx = new UnaryRp3Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(25);
				match(TEXT);
				}
				break;
			case STAR:
				{
				_localctx = new UnaryRp4Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(26);
				match(STAR);
				}
				break;
			case SELF:
				{
				_localctx = new UnaryRp5Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(27);
				match(SELF);
				}
				break;
			case PENT:
				{
				_localctx = new UnaryRp6Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(28);
				match(PENT);
				}
				break;
			case LPR:
				{
				_localctx = new ParaRpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(29);
				match(LPR);
				setState(30);
				rp(0);
				setState(31);
				match(RPR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(49);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(47);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new BinaryRp1Context(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(35);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(36);
						pathOp();
						setState(37);
						rp(5);
						}
						break;
					case 2:
						{
						_localctx = new BinaryRp2Context(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(39);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(40);
						match(COMMA);
						setState(41);
						rp(4);
						}
						break;
					case 3:
						{
						_localctx = new FilterRpContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(42);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(43);
						match(LSB);
						setState(44);
						filter(0);
						setState(45);
						match(RSB);
						}
						break;
					}
					} 
				}
				setState(51);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterBinaryFt1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitBinaryFt1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitBinaryFt1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BinaryFt2Context extends FilterContext {
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public TerminalNode EQS() { return getToken(ExpressionGrammarParser.EQS, 0); }
		public StringConditionContext stringCondition() {
			return getRuleContext(StringConditionContext.class,0);
		}
		public BinaryFt2Context(FilterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterBinaryFt2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitBinaryFt2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitBinaryFt2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParaFtContext extends FilterContext {
		public TerminalNode LPR() { return getToken(ExpressionGrammarParser.LPR, 0); }
		public FilterContext filter() {
			return getRuleContext(FilterContext.class,0);
		}
		public TerminalNode RPR() { return getToken(ExpressionGrammarParser.RPR, 0); }
		public ParaFtContext(FilterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterParaFt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitParaFt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitParaFt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NegFtContext extends FilterContext {
		public TerminalNode NEG() { return getToken(ExpressionGrammarParser.NEG, 0); }
		public FilterContext filter() {
			return getRuleContext(FilterContext.class,0);
		}
		public NegFtContext(FilterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterNegFt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitNegFt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitNegFt(this);
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
		public TerminalNode CONJ() { return getToken(ExpressionGrammarParser.CONJ, 0); }
		public CompoundFtContext(FilterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterCompoundFt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitCompoundFt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitCompoundFt(this);
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
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterUnaryFt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitUnaryFt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitUnaryFt(this);
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
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_filter, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				_localctx = new UnaryFtContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(53);
				rp(0);
				}
				break;
			case 2:
				{
				_localctx = new BinaryFt1Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(54);
				rp(0);
				setState(55);
				compOp();
				setState(56);
				rp(0);
				}
				break;
			case 3:
				{
				_localctx = new BinaryFt2Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(58);
				rp(0);
				setState(59);
				match(EQS);
				setState(60);
				stringCondition();
				}
				break;
			case 4:
				{
				_localctx = new ParaFtContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(62);
				match(LPR);
				setState(63);
				filter(0);
				setState(64);
				match(RPR);
				}
				break;
			case 5:
				{
				_localctx = new NegFtContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(66);
				match(NEG);
				setState(67);
				filter(1);
				}
				break;
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
					{
					_localctx = new CompoundFtContext(new FilterContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_filter);
					setState(70);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(71);
					match(CONJ);
					setState(72);
					filter(3);
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

	public static class PathOpContext extends ParserRuleContext {
		public TerminalNode SL() { return getToken(ExpressionGrammarParser.SL, 0); }
		public TerminalNode DSL() { return getToken(ExpressionGrammarParser.DSL, 0); }
		public PathOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pathOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterPathOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitPathOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitPathOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PathOpContext pathOp() throws RecognitionException {
		PathOpContext _localctx = new PathOpContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_pathOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
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

	public static class DocContext extends ParserRuleContext {
		public TerminalNode DOC() { return getToken(ExpressionGrammarParser.DOC, 0); }
		public TerminalNode LPR() { return getToken(ExpressionGrammarParser.LPR, 0); }
		public List<TerminalNode> DQ() { return getTokens(ExpressionGrammarParser.DQ); }
		public TerminalNode DQ(int i) {
			return getToken(ExpressionGrammarParser.DQ, i);
		}
		public TerminalNode StringConstant() { return getToken(ExpressionGrammarParser.StringConstant, 0); }
		public TerminalNode RPR() { return getToken(ExpressionGrammarParser.RPR, 0); }
		public DocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterDoc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitDoc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitDoc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DocContext doc() throws RecognitionException {
		DocContext _localctx = new DocContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_doc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(DOC);
			setState(81);
			match(LPR);
			setState(82);
			match(DQ);
			setState(83);
			match(StringConstant);
			setState(84);
			match(DQ);
			setState(85);
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

	public static class TagNameContext extends ParserRuleContext {
		public TerminalNode StringConstant() { return getToken(ExpressionGrammarParser.StringConstant, 0); }
		public TagNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tagName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterTagName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitTagName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitTagName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TagNameContext tagName() throws RecognitionException {
		TagNameContext _localctx = new TagNameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_tagName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(StringConstant);
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
		public TerminalNode AT() { return getToken(ExpressionGrammarParser.AT, 0); }
		public TerminalNode StringConstant() { return getToken(ExpressionGrammarParser.StringConstant, 0); }
		public AttNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterAttName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitAttName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitAttName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttNameContext attName() throws RecognitionException {
		AttNameContext _localctx = new AttNameContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_attName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(AT);
			setState(90);
			match(StringConstant);
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
		public TerminalNode EQS() { return getToken(ExpressionGrammarParser.EQS, 0); }
		public TerminalNode EQ() { return getToken(ExpressionGrammarParser.EQ, 0); }
		public TerminalNode ISS() { return getToken(ExpressionGrammarParser.ISS, 0); }
		public TerminalNode IS() { return getToken(ExpressionGrammarParser.IS, 0); }
		public CompOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterCompOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitCompOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitCompOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompOpContext compOp() throws RecognitionException {
		CompOpContext _localctx = new CompOpContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_compOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
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
		public List<TerminalNode> DQ() { return getTokens(ExpressionGrammarParser.DQ); }
		public TerminalNode DQ(int i) {
			return getToken(ExpressionGrammarParser.DQ, i);
		}
		public TerminalNode StringConstant() { return getToken(ExpressionGrammarParser.StringConstant, 0); }
		public StringConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterStringCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitStringCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitStringCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringConditionContext stringCondition() throws RecognitionException {
		StringConditionContext _localctx = new StringConditionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_stringCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(DQ);
			setState(95);
			match(StringConstant);
			setState(96);
			match(DQ);
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
		case 1:
			return rp_sempred((RpContext)_localctx, predIndex);
		case 2:
			return filter_sempred((FilterContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean rp_sempred(RpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean filter_sempred(FilterContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\30e\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3$\n\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\62\n\3\f\3\16\3\65\13\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4G\n\4\3"+
		"\4\3\4\3\4\7\4L\n\4\f\4\16\4O\13\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\2\4\4\6\13\2\4\6\b\n"+
		"\f\16\20\22\2\4\3\2\3\4\3\2\r\20\2i\2\24\3\2\2\2\4#\3\2\2\2\6F\3\2\2\2"+
		"\bP\3\2\2\2\nR\3\2\2\2\fY\3\2\2\2\16[\3\2\2\2\20^\3\2\2\2\22`\3\2\2\2"+
		"\24\25\5\n\6\2\25\26\5\b\5\2\26\27\5\4\3\2\27\3\3\2\2\2\30\31\b\3\1\2"+
		"\31$\5\f\7\2\32$\5\16\b\2\33$\7\23\2\2\34$\7\7\2\2\35$\7\5\2\2\36$\7\6"+
		"\2\2\37 \7\b\2\2 !\5\4\3\2!\"\7\t\2\2\"$\3\2\2\2#\30\3\2\2\2#\32\3\2\2"+
		"\2#\33\3\2\2\2#\34\3\2\2\2#\35\3\2\2\2#\36\3\2\2\2#\37\3\2\2\2$\63\3\2"+
		"\2\2%&\f\6\2\2&\'\5\b\5\2\'(\5\4\3\7(\62\3\2\2\2)*\f\5\2\2*+\7\f\2\2+"+
		"\62\5\4\3\6,-\f\3\2\2-.\7\n\2\2./\5\6\4\2/\60\7\13\2\2\60\62\3\2\2\2\61"+
		"%\3\2\2\2\61)\3\2\2\2\61,\3\2\2\2\62\65\3\2\2\2\63\61\3\2\2\2\63\64\3"+
		"\2\2\2\64\5\3\2\2\2\65\63\3\2\2\2\66\67\b\4\1\2\67G\5\4\3\289\5\4\3\2"+
		"9:\5\20\t\2:;\5\4\3\2;G\3\2\2\2<=\5\4\3\2=>\7\r\2\2>?\5\22\n\2?G\3\2\2"+
		"\2@A\7\b\2\2AB\5\6\4\2BC\7\t\2\2CG\3\2\2\2DE\7\21\2\2EG\5\6\4\3F\66\3"+
		"\2\2\2F8\3\2\2\2F<\3\2\2\2F@\3\2\2\2FD\3\2\2\2GM\3\2\2\2HI\f\4\2\2IJ\7"+
		"\22\2\2JL\5\6\4\5KH\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2N\7\3\2\2\2O"+
		"M\3\2\2\2PQ\t\2\2\2Q\t\3\2\2\2RS\7\25\2\2ST\7\b\2\2TU\7\26\2\2UV\7\27"+
		"\2\2VW\7\26\2\2WX\7\t\2\2X\13\3\2\2\2YZ\7\27\2\2Z\r\3\2\2\2[\\\7\24\2"+
		"\2\\]\7\27\2\2]\17\3\2\2\2^_\t\3\2\2_\21\3\2\2\2`a\7\26\2\2ab\7\27\2\2"+
		"bc\7\26\2\2c\23\3\2\2\2\7#\61\63FM";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}