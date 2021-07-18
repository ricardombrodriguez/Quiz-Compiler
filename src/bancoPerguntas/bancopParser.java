// Generated from bancop.g4 by ANTLR 4.9.2

    package bancoPerguntas;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class bancopParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, CORRECT=15, STRING=16, 
		DIFFERENTIATOR=17, FLOAT=18, NUMBER=19, LETTERNUMBER=20, LETTERS=21, COMMENT=22, 
		NEWLINE=23, MULTICOMM=24, WS=25;
	public static final int
		RULE_program = 0, RULE_stat = 1, RULE_expr = 2, RULE_multichoice = 3, 
		RULE_matching = 4, RULE_shortQ = 5, RULE_numeric = 6, RULE_essay = 7, 
		RULE_multichoiceoption = 8, RULE_matchingoption = 9, RULE_match = 10, 
		RULE_answer = 11, RULE_title = 12, RULE_id = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "stat", "expr", "multichoice", "matching", "shortQ", "numeric", 
			"essay", "multichoiceoption", "matchingoption", "match", "answer", "title", 
			"id"
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

	@Override
	public String getGrammarFileName() { return "bancop.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public bancopParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(bancopParser.EOF, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bancopListener ) ((bancopListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bancopListener ) ((bancopListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bancopVisitor ) return ((bancopVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__6) | (1L << T__7) | (1L << T__9) | (1L << T__10) | (1L << NEWLINE))) != 0)) {
				{
				{
				setState(28);
				stat();
				}
				}
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(34);
			match(EOF);
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

	public static class StatContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(bancopParser.NEWLINE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bancopListener ) ((bancopListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bancopListener ) ((bancopListener)listener).exitStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bancopVisitor ) return ((bancopVisitor<? extends T>)visitor).visitStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__6) | (1L << T__7) | (1L << T__9) | (1L << T__10))) != 0)) {
				{
				{
				setState(36);
				expr();
				}
				}
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(42);
			match(NEWLINE);
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

	public static class ExprContext extends ParserRuleContext {
		public MultichoiceContext multichoice() {
			return getRuleContext(MultichoiceContext.class,0);
		}
		public MatchingContext matching() {
			return getRuleContext(MatchingContext.class,0);
		}
		public ShortQContext shortQ() {
			return getRuleContext(ShortQContext.class,0);
		}
		public NumericContext numeric() {
			return getRuleContext(NumericContext.class,0);
		}
		public EssayContext essay() {
			return getRuleContext(EssayContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bancopListener ) ((bancopListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bancopListener ) ((bancopListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bancopVisitor ) return ((bancopVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expr);
		try {
			setState(49);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(44);
				multichoice();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(45);
				matching();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 3);
				{
				setState(46);
				shortQ();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 4);
				{
				setState(47);
				numeric();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 5);
				{
				setState(48);
				essay();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class MultichoiceContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TitleContext title() {
			return getRuleContext(TitleContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(bancopParser.NEWLINE, 0); }
		public List<MultichoiceoptionContext> multichoiceoption() {
			return getRuleContexts(MultichoiceoptionContext.class);
		}
		public MultichoiceoptionContext multichoiceoption(int i) {
			return getRuleContext(MultichoiceoptionContext.class,i);
		}
		public MultichoiceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multichoice; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bancopListener ) ((bancopListener)listener).enterMultichoice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bancopListener ) ((bancopListener)listener).exitMultichoice(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bancopVisitor ) return ((bancopVisitor<? extends T>)visitor).visitMultichoice(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultichoiceContext multichoice() throws RecognitionException {
		MultichoiceContext _localctx = new MultichoiceContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_multichoice);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(T__0);
			setState(52);
			match(T__1);
			setState(53);
			match(T__2);
			setState(54);
			id();
			setState(55);
			match(T__3);
			setState(56);
			match(T__2);
			setState(57);
			title();
			setState(58);
			match(T__4);
			setState(59);
			match(NEWLINE);
			setState(61); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(60);
				multichoiceoption();
				}
				}
				setState(63); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__11 );
			setState(65);
			match(T__5);
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

	public static class MatchingContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TitleContext title() {
			return getRuleContext(TitleContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(bancopParser.NEWLINE, 0); }
		public List<MatchingoptionContext> matchingoption() {
			return getRuleContexts(MatchingoptionContext.class);
		}
		public MatchingoptionContext matchingoption(int i) {
			return getRuleContext(MatchingoptionContext.class,i);
		}
		public MatchingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matching; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bancopListener ) ((bancopListener)listener).enterMatching(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bancopListener ) ((bancopListener)listener).exitMatching(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bancopVisitor ) return ((bancopVisitor<? extends T>)visitor).visitMatching(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchingContext matching() throws RecognitionException {
		MatchingContext _localctx = new MatchingContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_matching);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(T__6);
			setState(68);
			match(T__1);
			setState(69);
			match(T__2);
			setState(70);
			id();
			setState(71);
			match(T__3);
			setState(72);
			match(T__2);
			setState(73);
			title();
			setState(74);
			match(T__4);
			setState(75);
			match(NEWLINE);
			setState(77); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(76);
				matchingoption();
				}
				}
				setState(79); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__11 );
			setState(81);
			match(T__5);
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

	public static class ShortQContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TitleContext title() {
			return getRuleContext(TitleContext.class,0);
		}
		public AnswerContext answer() {
			return getRuleContext(AnswerContext.class,0);
		}
		public ShortQContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shortQ; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bancopListener ) ((bancopListener)listener).enterShortQ(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bancopListener ) ((bancopListener)listener).exitShortQ(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bancopVisitor ) return ((bancopVisitor<? extends T>)visitor).visitShortQ(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShortQContext shortQ() throws RecognitionException {
		ShortQContext _localctx = new ShortQContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_shortQ);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(T__7);
			setState(84);
			match(T__1);
			setState(85);
			match(T__2);
			setState(86);
			id();
			setState(87);
			match(T__3);
			setState(88);
			match(T__2);
			setState(89);
			title();
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(90);
				match(T__8);
				setState(91);
				match(T__2);
				setState(92);
				answer();
				}
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

	public static class NumericContext extends ParserRuleContext {
		public Token tipo;
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TitleContext title() {
			return getRuleContext(TitleContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(bancopParser.NUMBER, 0); }
		public TerminalNode FLOAT() { return getToken(bancopParser.FLOAT, 0); }
		public NumericContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numeric; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bancopListener ) ((bancopListener)listener).enterNumeric(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bancopListener ) ((bancopListener)listener).exitNumeric(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bancopVisitor ) return ((bancopVisitor<? extends T>)visitor).visitNumeric(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumericContext numeric() throws RecognitionException {
		NumericContext _localctx = new NumericContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_numeric);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(T__9);
			setState(96);
			match(T__1);
			setState(97);
			match(T__2);
			setState(98);
			id();
			setState(99);
			match(T__3);
			setState(100);
			match(T__2);
			setState(101);
			title();
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(102);
				match(T__8);
				setState(103);
				match(T__2);
				setState(104);
				((NumericContext)_localctx).tipo = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==FLOAT || _la==NUMBER) ) {
					((NumericContext)_localctx).tipo = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
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

	public static class EssayContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TitleContext title() {
			return getRuleContext(TitleContext.class,0);
		}
		public EssayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_essay; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bancopListener ) ((bancopListener)listener).enterEssay(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bancopListener ) ((bancopListener)listener).exitEssay(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bancopVisitor ) return ((bancopVisitor<? extends T>)visitor).visitEssay(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EssayContext essay() throws RecognitionException {
		EssayContext _localctx = new EssayContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_essay);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(T__10);
			setState(108);
			match(T__1);
			setState(109);
			match(T__2);
			setState(110);
			id();
			setState(111);
			match(T__3);
			setState(112);
			match(T__2);
			setState(113);
			title();
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

	public static class MultichoiceoptionContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TitleContext title() {
			return getRuleContext(TitleContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(bancopParser.NEWLINE, 0); }
		public MultichoiceoptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multichoiceoption; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bancopListener ) ((bancopListener)listener).enterMultichoiceoption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bancopListener ) ((bancopListener)listener).exitMultichoiceoption(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bancopVisitor ) return ((bancopVisitor<? extends T>)visitor).visitMultichoiceoption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultichoiceoptionContext multichoiceoption() throws RecognitionException {
		MultichoiceoptionContext _localctx = new MultichoiceoptionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_multichoiceoption);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(T__11);
			setState(116);
			match(T__1);
			setState(117);
			match(T__2);
			setState(118);
			id();
			setState(119);
			match(T__3);
			setState(120);
			match(T__2);
			setState(121);
			title();
			setState(122);
			match(NEWLINE);
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

	public static class MatchingoptionContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TitleContext title() {
			return getRuleContext(TitleContext.class,0);
		}
		public TerminalNode CORRECT() { return getToken(bancopParser.CORRECT, 0); }
		public MatchContext match() {
			return getRuleContext(MatchContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(bancopParser.NEWLINE, 0); }
		public MatchingoptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchingoption; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bancopListener ) ((bancopListener)listener).enterMatchingoption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bancopListener ) ((bancopListener)listener).exitMatchingoption(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bancopVisitor ) return ((bancopVisitor<? extends T>)visitor).visitMatchingoption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchingoptionContext matchingoption() throws RecognitionException {
		MatchingoptionContext _localctx = new MatchingoptionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_matchingoption);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(T__11);
			setState(125);
			match(T__1);
			setState(126);
			match(T__2);
			setState(127);
			id();
			setState(128);
			match(T__3);
			setState(129);
			match(T__2);
			setState(130);
			title();
			setState(131);
			match(T__12);
			setState(132);
			match(T__2);
			setState(133);
			match(CORRECT);
			setState(134);
			match(T__13);
			setState(135);
			match(T__2);
			setState(136);
			match();
			setState(137);
			match(NEWLINE);
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

	public static class MatchContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public MatchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_match; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bancopListener ) ((bancopListener)listener).enterMatch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bancopListener ) ((bancopListener)listener).exitMatch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bancopVisitor ) return ((bancopVisitor<? extends T>)visitor).visitMatch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchContext match() throws RecognitionException {
		MatchContext _localctx = new MatchContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_match);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			id();
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

	public static class AnswerContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(bancopParser.STRING, 0); }
		public AnswerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_answer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bancopListener ) ((bancopListener)listener).enterAnswer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bancopListener ) ((bancopListener)listener).exitAnswer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bancopVisitor ) return ((bancopVisitor<? extends T>)visitor).visitAnswer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnswerContext answer() throws RecognitionException {
		AnswerContext _localctx = new AnswerContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_answer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
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

	public static class TitleContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(bancopParser.STRING, 0); }
		public TitleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_title; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bancopListener ) ((bancopListener)listener).enterTitle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bancopListener ) ((bancopListener)listener).exitTitle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bancopVisitor ) return ((bancopVisitor<? extends T>)visitor).visitTitle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TitleContext title() throws RecognitionException {
		TitleContext _localctx = new TitleContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_title);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
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

	public static class IdContext extends ParserRuleContext {
		public TerminalNode LETTERNUMBER() { return getToken(bancopParser.LETTERNUMBER, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof bancopListener ) ((bancopListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof bancopListener ) ((bancopListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof bancopVisitor ) return ((bancopVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(LETTERNUMBER);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\33\u0096\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\7\2 \n\2\f\2\16\2#\13\2"+
		"\3\2\3\2\3\3\7\3(\n\3\f\3\16\3+\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\5\4\64"+
		"\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\6\5@\n\5\r\5\16\5A\3\5\3"+
		"\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\6\6P\n\6\r\6\16\6Q\3\6\3\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7`\n\7\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\5\bl\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17"+
		"\3\17\2\2\20\2\4\6\b\n\f\16\20\22\24\26\30\32\34\2\3\3\2\24\25\2\u0091"+
		"\2!\3\2\2\2\4)\3\2\2\2\6\63\3\2\2\2\b\65\3\2\2\2\nE\3\2\2\2\fU\3\2\2\2"+
		"\16a\3\2\2\2\20m\3\2\2\2\22u\3\2\2\2\24~\3\2\2\2\26\u008d\3\2\2\2\30\u008f"+
		"\3\2\2\2\32\u0091\3\2\2\2\34\u0093\3\2\2\2\36 \5\4\3\2\37\36\3\2\2\2 "+
		"#\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"$\3\2\2\2#!\3\2\2\2$%\7\2\2\3%\3\3\2"+
		"\2\2&(\5\6\4\2\'&\3\2\2\2(+\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*,\3\2\2\2+)\3"+
		"\2\2\2,-\7\31\2\2-\5\3\2\2\2.\64\5\b\5\2/\64\5\n\6\2\60\64\5\f\7\2\61"+
		"\64\5\16\b\2\62\64\5\20\t\2\63.\3\2\2\2\63/\3\2\2\2\63\60\3\2\2\2\63\61"+
		"\3\2\2\2\63\62\3\2\2\2\64\7\3\2\2\2\65\66\7\3\2\2\66\67\7\4\2\2\678\7"+
		"\5\2\289\5\34\17\29:\7\6\2\2:;\7\5\2\2;<\5\32\16\2<=\7\7\2\2=?\7\31\2"+
		"\2>@\5\22\n\2?>\3\2\2\2@A\3\2\2\2A?\3\2\2\2AB\3\2\2\2BC\3\2\2\2CD\7\b"+
		"\2\2D\t\3\2\2\2EF\7\t\2\2FG\7\4\2\2GH\7\5\2\2HI\5\34\17\2IJ\7\6\2\2JK"+
		"\7\5\2\2KL\5\32\16\2LM\7\7\2\2MO\7\31\2\2NP\5\24\13\2ON\3\2\2\2PQ\3\2"+
		"\2\2QO\3\2\2\2QR\3\2\2\2RS\3\2\2\2ST\7\b\2\2T\13\3\2\2\2UV\7\n\2\2VW\7"+
		"\4\2\2WX\7\5\2\2XY\5\34\17\2YZ\7\6\2\2Z[\7\5\2\2[_\5\32\16\2\\]\7\13\2"+
		"\2]^\7\5\2\2^`\5\30\r\2_\\\3\2\2\2_`\3\2\2\2`\r\3\2\2\2ab\7\f\2\2bc\7"+
		"\4\2\2cd\7\5\2\2de\5\34\17\2ef\7\6\2\2fg\7\5\2\2gk\5\32\16\2hi\7\13\2"+
		"\2ij\7\5\2\2jl\t\2\2\2kh\3\2\2\2kl\3\2\2\2l\17\3\2\2\2mn\7\r\2\2no\7\4"+
		"\2\2op\7\5\2\2pq\5\34\17\2qr\7\6\2\2rs\7\5\2\2st\5\32\16\2t\21\3\2\2\2"+
		"uv\7\16\2\2vw\7\4\2\2wx\7\5\2\2xy\5\34\17\2yz\7\6\2\2z{\7\5\2\2{|\5\32"+
		"\16\2|}\7\31\2\2}\23\3\2\2\2~\177\7\16\2\2\177\u0080\7\4\2\2\u0080\u0081"+
		"\7\5\2\2\u0081\u0082\5\34\17\2\u0082\u0083\7\6\2\2\u0083\u0084\7\5\2\2"+
		"\u0084\u0085\5\32\16\2\u0085\u0086\7\17\2\2\u0086\u0087\7\5\2\2\u0087"+
		"\u0088\7\21\2\2\u0088\u0089\7\20\2\2\u0089\u008a\7\5\2\2\u008a\u008b\5"+
		"\26\f\2\u008b\u008c\7\31\2\2\u008c\25\3\2\2\2\u008d\u008e\5\34\17\2\u008e"+
		"\27\3\2\2\2\u008f\u0090\7\22\2\2\u0090\31\3\2\2\2\u0091\u0092\7\22\2\2"+
		"\u0092\33\3\2\2\2\u0093\u0094\7\26\2\2\u0094\35\3\2\2\2\t!)\63AQ_k";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}