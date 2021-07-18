// Generated from bancop.g4 by ANTLR 4.9.2

    package bancoPerguntas;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class bancopLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, CORRECT=15, STRING=16, 
		DIFFERENTIATOR=17, FLOAT=18, NUMBER=19, LETTERNUMBER=20, LETTERS=21, COMMENT=22, 
		NEWLINE=23, MULTICOMM=24, WS=25;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "CORRECT", "STRING", "DIFFERENTIATOR", 
			"FLOAT", "NUMBER", "LETTERNUMBER", "LETTERS", "COMMENT", "NEWLINE", "MULTICOMM", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'multi-choice'", "'id'", "'='", "'text'", "'{'", "'}'", "'matching'", 
			"'short'", "'answer'", "'numeric'", "'essay'", "'option'", "'side'", 
			"'match'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "CORRECT", "STRING", "DIFFERENTIATOR", "FLOAT", "NUMBER", 
			"LETTERNUMBER", "LETTERS", "COMMENT", "NEWLINE", "MULTICOMM", "WS"
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


	public bancopLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "bancop.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\33\u00dc\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u008d\n\20\3\21\3\21\7\21"+
		"\u0091\n\21\f\21\16\21\u0094\13\21\3\21\3\21\3\22\3\22\3\23\6\23\u009b"+
		"\n\23\r\23\16\23\u009c\3\23\3\23\6\23\u00a1\n\23\r\23\16\23\u00a2\5\23"+
		"\u00a5\n\23\3\24\6\24\u00a8\n\24\r\24\16\24\u00a9\3\25\6\25\u00ad\n\25"+
		"\r\25\16\25\u00ae\3\26\6\26\u00b2\n\26\r\26\16\26\u00b3\3\27\3\27\7\27"+
		"\u00b8\n\27\f\27\16\27\u00bb\13\27\3\27\3\27\3\27\3\27\3\30\5\30\u00c2"+
		"\n\30\3\30\3\30\3\31\3\31\3\31\3\31\7\31\u00ca\n\31\f\31\16\31\u00cd\13"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\6\32\u00d7\n\32\r\32\16\32"+
		"\u00d8\3\32\3\32\5\u0092\u00b9\u00cb\2\33\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+"+
		"\27-\30/\31\61\32\63\33\3\2\6\3\2\62;\5\2\62;C\\c|\4\2C\\c|\4\2\13\13"+
		"\"\"\2\u00e7\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2"+
		"\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\3\65\3\2\2\2\5B\3\2\2\2\7E\3\2"+
		"\2\2\tG\3\2\2\2\13L\3\2\2\2\rN\3\2\2\2\17P\3\2\2\2\21Y\3\2\2\2\23_\3\2"+
		"\2\2\25f\3\2\2\2\27n\3\2\2\2\31t\3\2\2\2\33{\3\2\2\2\35\u0080\3\2\2\2"+
		"\37\u008c\3\2\2\2!\u008e\3\2\2\2#\u0097\3\2\2\2%\u009a\3\2\2\2\'\u00a7"+
		"\3\2\2\2)\u00ac\3\2\2\2+\u00b1\3\2\2\2-\u00b5\3\2\2\2/\u00c1\3\2\2\2\61"+
		"\u00c5\3\2\2\2\63\u00d6\3\2\2\2\65\66\7o\2\2\66\67\7w\2\2\678\7n\2\28"+
		"9\7v\2\29:\7k\2\2:;\7/\2\2;<\7e\2\2<=\7j\2\2=>\7q\2\2>?\7k\2\2?@\7e\2"+
		"\2@A\7g\2\2A\4\3\2\2\2BC\7k\2\2CD\7f\2\2D\6\3\2\2\2EF\7?\2\2F\b\3\2\2"+
		"\2GH\7v\2\2HI\7g\2\2IJ\7z\2\2JK\7v\2\2K\n\3\2\2\2LM\7}\2\2M\f\3\2\2\2"+
		"NO\7\177\2\2O\16\3\2\2\2PQ\7o\2\2QR\7c\2\2RS\7v\2\2ST\7e\2\2TU\7j\2\2"+
		"UV\7k\2\2VW\7p\2\2WX\7i\2\2X\20\3\2\2\2YZ\7u\2\2Z[\7j\2\2[\\\7q\2\2\\"+
		"]\7t\2\2]^\7v\2\2^\22\3\2\2\2_`\7c\2\2`a\7p\2\2ab\7u\2\2bc\7y\2\2cd\7"+
		"g\2\2de\7t\2\2e\24\3\2\2\2fg\7p\2\2gh\7w\2\2hi\7o\2\2ij\7g\2\2jk\7t\2"+
		"\2kl\7k\2\2lm\7e\2\2m\26\3\2\2\2no\7g\2\2op\7u\2\2pq\7u\2\2qr\7c\2\2r"+
		"s\7{\2\2s\30\3\2\2\2tu\7q\2\2uv\7r\2\2vw\7v\2\2wx\7k\2\2xy\7q\2\2yz\7"+
		"p\2\2z\32\3\2\2\2{|\7u\2\2|}\7k\2\2}~\7f\2\2~\177\7g\2\2\177\34\3\2\2"+
		"\2\u0080\u0081\7o\2\2\u0081\u0082\7c\2\2\u0082\u0083\7v\2\2\u0083\u0084"+
		"\7e\2\2\u0084\u0085\7j\2\2\u0085\36\3\2\2\2\u0086\u0087\7$\2\2\u0087\u0088"+
		"\7\62\2\2\u0088\u008d\7$\2\2\u0089\u008a\7$\2\2\u008a\u008b\7\63\2\2\u008b"+
		"\u008d\7$\2\2\u008c\u0086\3\2\2\2\u008c\u0089\3\2\2\2\u008d \3\2\2\2\u008e"+
		"\u0092\7$\2\2\u008f\u0091\13\2\2\2\u0090\u008f\3\2\2\2\u0091\u0094\3\2"+
		"\2\2\u0092\u0093\3\2\2\2\u0092\u0090\3\2\2\2\u0093\u0095\3\2\2\2\u0094"+
		"\u0092\3\2\2\2\u0095\u0096\7$\2\2\u0096\"\3\2\2\2\u0097\u0098\4QR\2\u0098"+
		"$\3\2\2\2\u0099\u009b\t\2\2\2\u009a\u0099\3\2\2\2\u009b\u009c\3\2\2\2"+
		"\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u00a4\3\2\2\2\u009e\u00a0"+
		"\7\60\2\2\u009f\u00a1\t\2\2\2\u00a0\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2"+
		"\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a5\3\2\2\2\u00a4\u009e"+
		"\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5&\3\2\2\2\u00a6\u00a8\t\2\2\2\u00a7"+
		"\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2"+
		"\2\2\u00aa(\3\2\2\2\u00ab\u00ad\t\3\2\2\u00ac\u00ab\3\2\2\2\u00ad\u00ae"+
		"\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af*\3\2\2\2\u00b0"+
		"\u00b2\t\4\2\2\u00b1\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b1\3\2"+
		"\2\2\u00b3\u00b4\3\2\2\2\u00b4,\3\2\2\2\u00b5\u00b9\7%\2\2\u00b6\u00b8"+
		"\13\2\2\2\u00b7\u00b6\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00ba\3\2\2\2"+
		"\u00b9\u00b7\3\2\2\2\u00ba\u00bc\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00bd"+
		"\7\f\2\2\u00bd\u00be\3\2\2\2\u00be\u00bf\b\27\2\2\u00bf.\3\2\2\2\u00c0"+
		"\u00c2\7\17\2\2\u00c1\u00c0\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3\3"+
		"\2\2\2\u00c3\u00c4\7\f\2\2\u00c4\60\3\2\2\2\u00c5\u00c6\7%\2\2\u00c6\u00c7"+
		"\7%\2\2\u00c7\u00cb\3\2\2\2\u00c8\u00ca\13\2\2\2\u00c9\u00c8\3\2\2\2\u00ca"+
		"\u00cd\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00ce\3\2"+
		"\2\2\u00cd\u00cb\3\2\2\2\u00ce\u00cf\7%\2\2\u00cf\u00d0\7%\2\2\u00d0\u00d1"+
		"\3\2\2\2\u00d1\u00d2\7\f\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d4\b\31\2\2"+
		"\u00d4\62\3\2\2\2\u00d5\u00d7\t\5\2\2\u00d6\u00d5\3\2\2\2\u00d7\u00d8"+
		"\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00da\3\2\2\2\u00da"+
		"\u00db\b\32\2\2\u00db\64\3\2\2\2\17\2\u008c\u0092\u009c\u00a2\u00a4\u00a9"+
		"\u00ae\u00b3\u00b9\u00c1\u00cb\u00d8\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}