// Generated from /home/xuldir/Desktop/CompilationsProjectations/quiz-comp-05/src/bancop.g4 by ANTLR 4.8
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
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		DIFFERENTIATOR=18, LETTERNUMBER=19, LETTERS=20, NUMBER=21, COMMENT=22, 
		NEWLINE=23, MULTICOMM=24, WS=25, SIDE=26;
	public static final int
		RULE_program = 0, RULE_stat = 1, RULE_expr = 2, RULE_multichoice = 3, 
		RULE_matching = 4, RULE_shortQ = 5, RULE_numeric = 6, RULE_essay = 7, 
		RULE_multichoiceoption = 8, RULE_matchingoption = 9, RULE_match = 10, 
		RULE_answer = 11, RULE_title = 12, RULE_id = 13, RULE_side = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "stat", "expr", "multichoice", "matching", "shortQ", "numeric", 
			"essay", "multichoiceoption", "matchingoption", "match", "answer", "title", 
			"id", "side"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'multi-choice id = '", "'text = \"'", "'\"'", "'{'", "'}'", "'matching id = '", 
			"'short id = '", "'\" answer = \"'", "'numeric'", "'id = '", "'essay id = '", 
			"'option id = '", "'text = '", "'side = '", "'match = '", "'1'", "'2'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "DIFFERENTIATOR", "LETTERNUMBER", 
			"LETTERS", "NUMBER", "COMMENT", "NEWLINE", "MULTICOMM", "WS", "SIDE"
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
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__5) | (1L << T__6) | (1L << T__8) | (1L << T__10) | (1L << NEWLINE))) != 0)) {
				{
				{
				setState(30);
				stat();
				}
				}
				setState(35);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(36);
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
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
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__5) | (1L << T__6) | (1L << T__8) | (1L << T__10))) != 0)) {
				{
				setState(38);
				expr();
				}
			}

			setState(41);
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
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EssayQuestionContext extends ExprContext {
		public EssayContext essay() {
			return getRuleContext(EssayContext.class,0);
		}
		public EssayQuestionContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ShortQuestionContext extends ExprContext {
		public ShortQContext shortQ() {
			return getRuleContext(ShortQContext.class,0);
		}
		public ShortQuestionContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class NumericQuestionContext extends ExprContext {
		public NumericContext numeric() {
			return getRuleContext(NumericContext.class,0);
		}
		public NumericQuestionContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class MatchingQuestionContext extends ExprContext {
		public MatchingContext matching() {
			return getRuleContext(MatchingContext.class,0);
		}
		public MatchingQuestionContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class MultiChoiceQuestionContext extends ExprContext {
		public MultichoiceContext multichoice() {
			return getRuleContext(MultichoiceContext.class,0);
		}
		public MultiChoiceQuestionContext(ExprContext ctx) { copyFrom(ctx); }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expr);
		try {
			setState(48);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				_localctx = new MultiChoiceQuestionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(43);
				multichoice();
				}
				break;
			case T__5:
				_localctx = new MatchingQuestionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(44);
				matching();
				}
				break;
			case T__6:
				_localctx = new ShortQuestionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(45);
				shortQ();
				}
				break;
			case T__8:
				_localctx = new NumericQuestionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(46);
				numeric();
				}
				break;
			case T__10:
				_localctx = new EssayQuestionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(47);
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
	}

	public final MultichoiceContext multichoice() throws RecognitionException {
		MultichoiceContext _localctx = new MultichoiceContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_multichoice);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(T__0);
			setState(51);
			id();
			setState(52);
			match(T__1);
			setState(53);
			title();
			setState(54);
			match(T__2);
			setState(55);
			match(T__3);
			setState(56);
			match(NEWLINE);
			setState(58); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(57);
				multichoiceoption();
				}
				}
				setState(60); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__11 );
			setState(62);
			match(T__4);
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
	}

	public final MatchingContext matching() throws RecognitionException {
		MatchingContext _localctx = new MatchingContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_matching);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(T__5);
			setState(65);
			id();
			setState(66);
			match(T__1);
			setState(67);
			title();
			setState(68);
			match(T__2);
			setState(69);
			match(T__3);
			setState(70);
			match(NEWLINE);
			setState(72); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(71);
				matchingoption();
				}
				}
				setState(74); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__11 );
			setState(76);
			match(T__4);
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
		public TerminalNode NEWLINE() { return getToken(bancopParser.NEWLINE, 0); }
		public ShortQContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shortQ; }
	}

	public final ShortQContext shortQ() throws RecognitionException {
		ShortQContext _localctx = new ShortQContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_shortQ);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(T__6);
			setState(79);
			id();
			setState(80);
			match(T__1);
			setState(81);
			title();
			setState(82);
			match(T__7);
			setState(83);
			answer();
			setState(84);
			match(T__2);
			setState(85);
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

	public static class NumericContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TitleContext title() {
			return getRuleContext(TitleContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(bancopParser.NUMBER, 0); }
		public TerminalNode NEWLINE() { return getToken(bancopParser.NEWLINE, 0); }
		public NumericContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numeric; }
	}

	public final NumericContext numeric() throws RecognitionException {
		NumericContext _localctx = new NumericContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_numeric);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(T__8);
			setState(88);
			match(T__9);
			setState(89);
			id();
			setState(90);
			match(T__1);
			setState(91);
			title();
			setState(92);
			match(T__7);
			setState(93);
			match(NUMBER);
			setState(94);
			match(T__2);
			setState(95);
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
	}

	public final EssayContext essay() throws RecognitionException {
		EssayContext _localctx = new EssayContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_essay);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(T__10);
			setState(98);
			id();
			setState(99);
			match(T__1);
			setState(100);
			title();
			setState(101);
			match(T__2);
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
		public MultichoiceoptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multichoiceoption; }
	 
		public MultichoiceoptionContext() { }
		public void copyFrom(MultichoiceoptionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MultiChoiceOptionContext extends MultichoiceoptionContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TitleContext title() {
			return getRuleContext(TitleContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(bancopParser.NEWLINE, 0); }
		public MultiChoiceOptionContext(MultichoiceoptionContext ctx) { copyFrom(ctx); }
	}

	public final MultichoiceoptionContext multichoiceoption() throws RecognitionException {
		MultichoiceoptionContext _localctx = new MultichoiceoptionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_multichoiceoption);
		try {
			_localctx = new MultiChoiceOptionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(T__11);
			setState(104);
			id();
			setState(105);
			match(T__1);
			setState(106);
			title();
			setState(107);
			match(T__2);
			setState(108);
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
		public MatchingoptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchingoption; }
	 
		public MatchingoptionContext() { }
		public void copyFrom(MatchingoptionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MatchingOptionContext extends MatchingoptionContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TitleContext title() {
			return getRuleContext(TitleContext.class,0);
		}
		public TerminalNode SIDE() { return getToken(bancopParser.SIDE, 0); }
		public MatchContext match() {
			return getRuleContext(MatchContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(bancopParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(bancopParser.NEWLINE, i);
		}
		public MatchingOptionContext(MatchingoptionContext ctx) { copyFrom(ctx); }
	}

	public final MatchingoptionContext matchingoption() throws RecognitionException {
		MatchingoptionContext _localctx = new MatchingoptionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_matchingoption);
		int _la;
		try {
			_localctx = new MatchingOptionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(T__11);
			setState(111);
			id();
			setState(112);
			match(T__12);
			setState(113);
			title();
			setState(114);
			match(T__13);
			setState(115);
			match(SIDE);
			setState(116);
			match(T__14);
			setState(117);
			match();
			setState(119); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(118);
				match(NEWLINE);
				}
				}
				setState(121); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
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
	}

	public final MatchContext match() throws RecognitionException {
		MatchContext _localctx = new MatchContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_match);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
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
		public List<TerminalNode> LETTERNUMBER() { return getTokens(bancopParser.LETTERNUMBER); }
		public TerminalNode LETTERNUMBER(int i) {
			return getToken(bancopParser.LETTERNUMBER, i);
		}
		public AnswerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_answer; }
	}

	public final AnswerContext answer() throws RecognitionException {
		AnswerContext _localctx = new AnswerContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_answer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(125);
				match(LETTERNUMBER);
				}
				}
				setState(128); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LETTERNUMBER );
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
		public List<TerminalNode> LETTERNUMBER() { return getTokens(bancopParser.LETTERNUMBER); }
		public TerminalNode LETTERNUMBER(int i) {
			return getToken(bancopParser.LETTERNUMBER, i);
		}
		public TitleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_title; }
	}

	public final TitleContext title() throws RecognitionException {
		TitleContext _localctx = new TitleContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_title);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(130);
				match(LETTERNUMBER);
				}
				}
				setState(133); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LETTERNUMBER );
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
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
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

	public static class SideContext extends ParserRuleContext {
		public SideContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_side; }
	}

	public final SideContext side() throws RecognitionException {
		SideContext _localctx = new SideContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_side);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			_la = _input.LA(1);
			if ( !(_la==T__15 || _la==T__16) ) {
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\34\u008e\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\7\2\"\n\2\f\2"+
		"\16\2%\13\2\3\2\3\2\3\3\5\3*\n\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\5\4\63\n"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\6\5=\n\5\r\5\16\5>\3\5\3\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\6\6K\n\6\r\6\16\6L\3\6\3\6\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\6\13z\n\13\r\13\16\13{\3\f\3\f\3\r\6\r\u0081\n\r\r\r\16"+
		"\r\u0082\3\16\6\16\u0086\n\16\r\16\16\16\u0087\3\17\3\17\3\20\3\20\3\20"+
		"\2\2\21\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36\2\3\3\2\22\23\2\u0089\2"+
		"#\3\2\2\2\4)\3\2\2\2\6\62\3\2\2\2\b\64\3\2\2\2\nB\3\2\2\2\fP\3\2\2\2\16"+
		"Y\3\2\2\2\20c\3\2\2\2\22i\3\2\2\2\24p\3\2\2\2\26}\3\2\2\2\30\u0080\3\2"+
		"\2\2\32\u0085\3\2\2\2\34\u0089\3\2\2\2\36\u008b\3\2\2\2 \"\5\4\3\2! \3"+
		"\2\2\2\"%\3\2\2\2#!\3\2\2\2#$\3\2\2\2$&\3\2\2\2%#\3\2\2\2&\'\7\2\2\3\'"+
		"\3\3\2\2\2(*\5\6\4\2)(\3\2\2\2)*\3\2\2\2*+\3\2\2\2+,\7\31\2\2,\5\3\2\2"+
		"\2-\63\5\b\5\2.\63\5\n\6\2/\63\5\f\7\2\60\63\5\16\b\2\61\63\5\20\t\2\62"+
		"-\3\2\2\2\62.\3\2\2\2\62/\3\2\2\2\62\60\3\2\2\2\62\61\3\2\2\2\63\7\3\2"+
		"\2\2\64\65\7\3\2\2\65\66\5\34\17\2\66\67\7\4\2\2\678\5\32\16\289\7\5\2"+
		"\29:\7\6\2\2:<\7\31\2\2;=\5\22\n\2<;\3\2\2\2=>\3\2\2\2><\3\2\2\2>?\3\2"+
		"\2\2?@\3\2\2\2@A\7\7\2\2A\t\3\2\2\2BC\7\b\2\2CD\5\34\17\2DE\7\4\2\2EF"+
		"\5\32\16\2FG\7\5\2\2GH\7\6\2\2HJ\7\31\2\2IK\5\24\13\2JI\3\2\2\2KL\3\2"+
		"\2\2LJ\3\2\2\2LM\3\2\2\2MN\3\2\2\2NO\7\7\2\2O\13\3\2\2\2PQ\7\t\2\2QR\5"+
		"\34\17\2RS\7\4\2\2ST\5\32\16\2TU\7\n\2\2UV\5\30\r\2VW\7\5\2\2WX\7\31\2"+
		"\2X\r\3\2\2\2YZ\7\13\2\2Z[\7\f\2\2[\\\5\34\17\2\\]\7\4\2\2]^\5\32\16\2"+
		"^_\7\n\2\2_`\7\27\2\2`a\7\5\2\2ab\7\31\2\2b\17\3\2\2\2cd\7\r\2\2de\5\34"+
		"\17\2ef\7\4\2\2fg\5\32\16\2gh\7\5\2\2h\21\3\2\2\2ij\7\16\2\2jk\5\34\17"+
		"\2kl\7\4\2\2lm\5\32\16\2mn\7\5\2\2no\7\31\2\2o\23\3\2\2\2pq\7\16\2\2q"+
		"r\5\34\17\2rs\7\17\2\2st\5\32\16\2tu\7\20\2\2uv\7\34\2\2vw\7\21\2\2wy"+
		"\5\26\f\2xz\7\31\2\2yx\3\2\2\2z{\3\2\2\2{y\3\2\2\2{|\3\2\2\2|\25\3\2\2"+
		"\2}~\5\34\17\2~\27\3\2\2\2\177\u0081\7\25\2\2\u0080\177\3\2\2\2\u0081"+
		"\u0082\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\31\3\2\2"+
		"\2\u0084\u0086\7\25\2\2\u0085\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087"+
		"\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\33\3\2\2\2\u0089\u008a\7\25\2"+
		"\2\u008a\35\3\2\2\2\u008b\u008c\t\2\2\2\u008c\37\3\2\2\2\n#)\62>L{\u0082"+
		"\u0087";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}