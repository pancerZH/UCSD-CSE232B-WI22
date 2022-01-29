// Generated from ExpressionGrammar.g4 by ANTLR 4.7.2

package edu.ucsd.cse232b.parsers;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExpressionGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SL=1, DSL=2, SELF=3, PENT=4, STAR=5, LPR=6, RPR=7, LSB=8, RSB=9, COMMA=10, 
		EQS=11, EQ=12, ISS=13, IS=14, NEG=15, CONJ=16, TEXT=17, AT=18, DOC=19, 
		ID=20, WS=21, STRING=22, ESCAPE=23;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"SL", "DSL", "SELF", "PENT", "STAR", "LPR", "RPR", "LSB", "RSB", "COMMA", 
			"EQS", "EQ", "ISS", "IS", "NEG", "CONJ", "TEXT", "AT", "DOC", "ID", "WS", 
			"STRING", "ESCAPE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'/'", "'//'", "'.'", "'..'", "'*'", "'('", "')'", "'['", "']'", 
			"','", "'='", "'eq'", "'=='", "'is'", "'not'", null, "'text()'", "'@'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SL", "DSL", "SELF", "PENT", "STAR", "LPR", "RPR", "LSB", "RSB", 
			"COMMA", "EQS", "EQ", "ISS", "IS", "NEG", "CONJ", "TEXT", "AT", "DOC", 
			"ID", "WS", "STRING", "ESCAPE"
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


	public ExpressionGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ExpressionGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\31\u008f\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2"+
		"\3\2\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3"+
		"\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\5\21\\\n\21\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\7\25m\n\25"+
		"\f\25\16\25p\13\25\3\26\6\26s\n\26\r\26\16\26t\3\26\3\26\3\27\3\27\3\27"+
		"\7\27|\n\27\f\27\16\27\177\13\27\3\27\3\27\3\27\3\27\7\27\u0085\n\27\f"+
		"\27\16\27\u0088\13\27\3\27\5\27\u008b\n\27\3\30\3\30\3\30\2\2\31\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\3\2\13\4\2FFff\4\2QQqq\4\2EEee\4\2C"+
		"\\c|\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\4\2$$^^\4\2))^^\5\2$$))^^\2\u0096"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\3\61\3\2\2\2\5\63\3\2\2\2\7\66\3\2\2\2\t8\3\2\2\2\13;\3\2\2\2\r=\3"+
		"\2\2\2\17?\3\2\2\2\21A\3\2\2\2\23C\3\2\2\2\25E\3\2\2\2\27G\3\2\2\2\31"+
		"I\3\2\2\2\33L\3\2\2\2\35O\3\2\2\2\37R\3\2\2\2![\3\2\2\2#]\3\2\2\2%d\3"+
		"\2\2\2\'f\3\2\2\2)j\3\2\2\2+r\3\2\2\2-\u008a\3\2\2\2/\u008c\3\2\2\2\61"+
		"\62\7\61\2\2\62\4\3\2\2\2\63\64\7\61\2\2\64\65\7\61\2\2\65\6\3\2\2\2\66"+
		"\67\7\60\2\2\67\b\3\2\2\289\7\60\2\29:\7\60\2\2:\n\3\2\2\2;<\7,\2\2<\f"+
		"\3\2\2\2=>\7*\2\2>\16\3\2\2\2?@\7+\2\2@\20\3\2\2\2AB\7]\2\2B\22\3\2\2"+
		"\2CD\7_\2\2D\24\3\2\2\2EF\7.\2\2F\26\3\2\2\2GH\7?\2\2H\30\3\2\2\2IJ\7"+
		"g\2\2JK\7s\2\2K\32\3\2\2\2LM\7?\2\2MN\7?\2\2N\34\3\2\2\2OP\7k\2\2PQ\7"+
		"u\2\2Q\36\3\2\2\2RS\7p\2\2ST\7q\2\2TU\7v\2\2U \3\2\2\2VW\7c\2\2WX\7p\2"+
		"\2X\\\7f\2\2YZ\7q\2\2Z\\\7t\2\2[V\3\2\2\2[Y\3\2\2\2\\\"\3\2\2\2]^\7v\2"+
		"\2^_\7g\2\2_`\7z\2\2`a\7v\2\2ab\7*\2\2bc\7+\2\2c$\3\2\2\2de\7B\2\2e&\3"+
		"\2\2\2fg\t\2\2\2gh\t\3\2\2hi\t\4\2\2i(\3\2\2\2jn\t\5\2\2km\t\6\2\2lk\3"+
		"\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2o*\3\2\2\2pn\3\2\2\2qs\t\7\2\2rq\3"+
		"\2\2\2st\3\2\2\2tr\3\2\2\2tu\3\2\2\2uv\3\2\2\2vw\b\26\2\2w,\3\2\2\2x}"+
		"\7$\2\2y|\5/\30\2z|\n\b\2\2{y\3\2\2\2{z\3\2\2\2|\177\3\2\2\2}{\3\2\2\2"+
		"}~\3\2\2\2~\u0080\3\2\2\2\177}\3\2\2\2\u0080\u008b\7$\2\2\u0081\u0086"+
		"\7)\2\2\u0082\u0085\5/\30\2\u0083\u0085\n\t\2\2\u0084\u0082\3\2\2\2\u0084"+
		"\u0083\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2"+
		"\2\2\u0087\u0089\3\2\2\2\u0088\u0086\3\2\2\2\u0089\u008b\7)\2\2\u008a"+
		"x\3\2\2\2\u008a\u0081\3\2\2\2\u008b.\3\2\2\2\u008c\u008d\7^\2\2\u008d"+
		"\u008e\t\n\2\2\u008e\60\3\2\2\2\13\2[nt{}\u0084\u0086\u008a\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}