// Generated from /home/xuldir/Desktop/CompilationsProjectations/quiz-comp-05/src/quiz.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class quizParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		OPCOESPOSSIVEIS=18, NAME=19, NUMBER=20, QUIZ=21, ADD_GROUP=22, ADD=23, 
		ALL=24, REMOVE=25, DEFINEANSWER=26, DEFINEMARK=27, EVALUATION=28, MULTICHOICE=29, 
		SHORTANSWER=30, NUMERICANSWER=31, ESSAY=32, OPTION=33, IMPORT=34, FROM=35, 
		GET=36, TO=37, ANSWER=38, SHOW=39, SHUFFLE=40, AND=41, WITH=42, GROUP=43, 
		CHOICE=44, MATCH=45, MATCHING=46, QUESTION=47, NEWLINE=48, COMMENT=49, 
		MULTICOMM=50, WS=51;
	public static final int
		RULE_program = 0, RULE_stat = 1, RULE_expr = 2, RULE_quiz = 3, RULE_add = 4, 
		RULE_sub_question = 5, RULE_load = 6, RULE_remove = 7, RULE_defineAnswer = 8, 
		RULE_defineMark = 9, RULE_evaluation = 10, RULE_multi = 11, RULE_args = 12, 
		RULE_optionsin = 13, RULE_matching = 14, RULE_arguments = 15, RULE_opt = 16, 
		RULE_import_expr = 17, RULE_plist = 18, RULE_p = 19, RULE_show = 20, RULE_ques_opt = 21, 
		RULE_shuffle = 22, RULE_getAnswer = 23, RULE_getChoice = 24, RULE_getAnswerToChoice = 25, 
		RULE_shortQuestion = 26, RULE_numeric = 27, RULE_essay = 28;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "stat", "expr", "quiz", "add", "sub_question", "load", "remove", 
			"defineAnswer", "defineMark", "evaluation", "multi", "args", "optionsin", 
			"matching", "arguments", "opt", "import_expr", "plist", "p", "show", 
			"ques_opt", "shuffle", "getAnswer", "getChoice", "getAnswerToChoice", 
			"shortQuestion", "numeric", "essay"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'auto-corrective'", "','", "'load \"'", "'\" as'", "'id='", "' text=\"'", 
			"'\"'", "'group='", "'{'", "' id='", "'}'", "' side='", "' match='", 
			"'as'", "'id = '", "'text = \"'", "'\" answer = \"'", null, null, null, 
			"'quiz'", "'add group'", "'add'", "'all'", "'remove'", "'define-answer'", 
			"'define-mark'", "'evaluation'", "'multi-choice'", "'short-answer'", 
			"'numeric-answer'", "'essay-answer'", "'option'", null, "'from'", "'get'", 
			"'to'", "'answer'", "'show'", "'shuffle'", "'and'", "'with'", "'group'", 
			"'choice'", "'match'", "'matching'", "'question'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "OPCOESPOSSIVEIS", "NAME", "NUMBER", 
			"QUIZ", "ADD_GROUP", "ADD", "ALL", "REMOVE", "DEFINEANSWER", "DEFINEMARK", 
			"EVALUATION", "MULTICHOICE", "SHORTANSWER", "NUMERICANSWER", "ESSAY", 
			"OPTION", "IMPORT", "FROM", "GET", "TO", "ANSWER", "SHOW", "SHUFFLE", 
			"AND", "WITH", "GROUP", "CHOICE", "MATCH", "MATCHING", "QUESTION", "NEWLINE", 
			"COMMENT", "MULTICOMM", "WS"
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
	public String getGrammarFileName() { return "quiz.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public quizParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(quizParser.EOF, 0); }
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
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << QUIZ) | (1L << ADD_GROUP) | (1L << ADD) | (1L << REMOVE) | (1L << DEFINEANSWER) | (1L << DEFINEMARK) | (1L << EVALUATION) | (1L << MULTICHOICE) | (1L << SHORTANSWER) | (1L << NUMERICANSWER) | (1L << ESSAY) | (1L << GET) | (1L << SHOW) | (1L << SHUFFLE) | (1L << MATCHING) | (1L << NEWLINE))) != 0)) {
				{
				{
				setState(58);
				stat();
				}
				}
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(64);
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
		public TerminalNode NEWLINE() { return getToken(quizParser.NEWLINE, 0); }
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
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << QUIZ) | (1L << ADD_GROUP) | (1L << ADD) | (1L << REMOVE) | (1L << DEFINEANSWER) | (1L << DEFINEMARK) | (1L << EVALUATION) | (1L << MULTICHOICE) | (1L << SHORTANSWER) | (1L << NUMERICANSWER) | (1L << ESSAY) | (1L << GET) | (1L << SHOW) | (1L << SHUFFLE) | (1L << MATCHING))) != 0)) {
				{
				setState(66);
				expr();
				}
			}

			setState(69);
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
		public QuizContext quiz() {
			return getRuleContext(QuizContext.class,0);
		}
		public AddContext add() {
			return getRuleContext(AddContext.class,0);
		}
		public MultiContext multi() {
			return getRuleContext(MultiContext.class,0);
		}
		public MatchingContext matching() {
			return getRuleContext(MatchingContext.class,0);
		}
		public EvaluationContext evaluation() {
			return getRuleContext(EvaluationContext.class,0);
		}
		public RemoveContext remove() {
			return getRuleContext(RemoveContext.class,0);
		}
		public DefineAnswerContext defineAnswer() {
			return getRuleContext(DefineAnswerContext.class,0);
		}
		public DefineMarkContext defineMark() {
			return getRuleContext(DefineMarkContext.class,0);
		}
		public LoadContext load() {
			return getRuleContext(LoadContext.class,0);
		}
		public ShowContext show() {
			return getRuleContext(ShowContext.class,0);
		}
		public ShuffleContext shuffle() {
			return getRuleContext(ShuffleContext.class,0);
		}
		public GetAnswerContext getAnswer() {
			return getRuleContext(GetAnswerContext.class,0);
		}
		public GetChoiceContext getChoice() {
			return getRuleContext(GetChoiceContext.class,0);
		}
		public GetAnswerToChoiceContext getAnswerToChoice() {
			return getRuleContext(GetAnswerToChoiceContext.class,0);
		}
		public ShortQuestionContext shortQuestion() {
			return getRuleContext(ShortQuestionContext.class,0);
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
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expr);
		try {
			setState(88);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				quiz();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
				add();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(73);
				multi();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(74);
				matching();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(75);
				evaluation();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(76);
				remove();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(77);
				defineAnswer();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(78);
				defineMark();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(79);
				load();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(80);
				show();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(81);
				shuffle();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(82);
				getAnswer();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(83);
				getChoice();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(84);
				getAnswerToChoice();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(85);
				shortQuestion();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(86);
				numeric();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(87);
				essay();
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

	public static class QuizContext extends ParserRuleContext {
		public QuizContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quiz; }
	 
		public QuizContext() { }
		public void copyFrom(QuizContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CreateQuizContext extends QuizContext {
		public TerminalNode QUIZ() { return getToken(quizParser.QUIZ, 0); }
		public TerminalNode NAME() { return getToken(quizParser.NAME, 0); }
		public CreateQuizContext(QuizContext ctx) { copyFrom(ctx); }
	}

	public final QuizContext quiz() throws RecognitionException {
		QuizContext _localctx = new QuizContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_quiz);
		int _la;
		try {
			_localctx = new CreateQuizContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(QUIZ);
			setState(91);
			match(NAME);
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(92);
				match(T__0);
				}
				}
				setState(97);
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

	public static class AddContext extends ParserRuleContext {
		public AddContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add; }
	 
		public AddContext() { }
		public void copyFrom(AddContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AddOptionContext extends AddContext {
		public TerminalNode ADD() { return getToken(quizParser.ADD, 0); }
		public TerminalNode NUMBER() { return getToken(quizParser.NUMBER, 0); }
		public TerminalNode TO() { return getToken(quizParser.TO, 0); }
		public Sub_questionContext sub_question() {
			return getRuleContext(Sub_questionContext.class,0);
		}
		public AddOptionContext(AddContext ctx) { copyFrom(ctx); }
	}
	public static class CreateGroupContext extends AddContext {
		public TerminalNode ADD_GROUP() { return getToken(quizParser.ADD_GROUP, 0); }
		public TerminalNode NAME() { return getToken(quizParser.NAME, 0); }
		public CreateGroupContext(AddContext ctx) { copyFrom(ctx); }
	}
	public static class AddAllContext extends AddContext {
		public TerminalNode ADD() { return getToken(quizParser.ADD, 0); }
		public TerminalNode NUMBER() { return getToken(quizParser.NUMBER, 0); }
		public TerminalNode TO() { return getToken(quizParser.TO, 0); }
		public TerminalNode ALL() { return getToken(quizParser.ALL, 0); }
		public AddAllContext(AddContext ctx) { copyFrom(ctx); }
	}
	public static class AddQuestion2GroupContext extends AddContext {
		public TerminalNode ADD() { return getToken(quizParser.ADD, 0); }
		public List<TerminalNode> NAME() { return getTokens(quizParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(quizParser.NAME, i);
		}
		public TerminalNode TO() { return getToken(quizParser.TO, 0); }
		public TerminalNode GROUP() { return getToken(quizParser.GROUP, 0); }
		public AddQuestion2GroupContext(AddContext ctx) { copyFrom(ctx); }
	}

	public final AddContext add() throws RecognitionException {
		AddContext _localctx = new AddContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_add);
		int _la;
		try {
			setState(127);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new CreateGroupContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				match(ADD_GROUP);
				setState(99);
				match(NAME);
				}
				break;
			case 2:
				_localctx = new AddOptionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				match(ADD);
				setState(101);
				match(NUMBER);
				setState(102);
				match(TO);
				setState(103);
				sub_question();
				}
				break;
			case 3:
				_localctx = new AddAllContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(104);
				match(ADD);
				setState(105);
				match(NUMBER);
				setState(106);
				match(TO);
				setState(107);
				match(ALL);
				}
				break;
			case 4:
				_localctx = new AddQuestion2GroupContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(108);
				match(ADD);
				setState(109);
				match(NAME);
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(110);
					match(T__1);
					setState(111);
					match(NAME);
					}
					}
					setState(116);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(117);
				match(TO);
				setState(118);
				match(GROUP);
				setState(119);
				match(NAME);
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(120);
					match(T__1);
					setState(121);
					match(NAME);
					}
					}
					setState(126);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class Sub_questionContext extends ParserRuleContext {
		public List<TerminalNode> NUMBER() { return getTokens(quizParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(quizParser.NUMBER, i);
		}
		public Sub_questionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sub_question; }
	}

	public final Sub_questionContext sub_question() throws RecognitionException {
		Sub_questionContext _localctx = new Sub_questionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_sub_question);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(NUMBER);
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(130);
				match(T__1);
				setState(131);
				match(NUMBER);
				}
				}
				setState(136);
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

	public static class LoadContext extends ParserRuleContext {
		public LoadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_load; }
	 
		public LoadContext() { }
		public void copyFrom(LoadContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LoadBancoContext extends LoadContext {
		public List<TerminalNode> NAME() { return getTokens(quizParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(quizParser.NAME, i);
		}
		public LoadBancoContext(LoadContext ctx) { copyFrom(ctx); }
	}

	public final LoadContext load() throws RecognitionException {
		LoadContext _localctx = new LoadContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_load);
		try {
			_localctx = new LoadBancoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(T__2);
			setState(138);
			match(NAME);
			setState(139);
			match(T__3);
			setState(140);
			match(NAME);
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

	public static class RemoveContext extends ParserRuleContext {
		public RemoveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_remove; }
	 
		public RemoveContext() { }
		public void copyFrom(RemoveContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EliminarContext extends RemoveContext {
		public TerminalNode REMOVE() { return getToken(quizParser.REMOVE, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(quizParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(quizParser.NUMBER, i);
		}
		public TerminalNode FROM() { return getToken(quizParser.FROM, 0); }
		public EliminarContext(RemoveContext ctx) { copyFrom(ctx); }
	}

	public final RemoveContext remove() throws RecognitionException {
		RemoveContext _localctx = new RemoveContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_remove);
		try {
			_localctx = new EliminarContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(REMOVE);
			setState(143);
			match(NUMBER);
			setState(144);
			match(FROM);
			setState(145);
			match(NUMBER);
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

	public static class DefineAnswerContext extends ParserRuleContext {
		public DefineAnswerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defineAnswer; }
	 
		public DefineAnswerContext() { }
		public void copyFrom(DefineAnswerContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DefinirRespostaContext extends DefineAnswerContext {
		public TerminalNode DEFINEANSWER() { return getToken(quizParser.DEFINEANSWER, 0); }
		public TerminalNode NUMBER() { return getToken(quizParser.NUMBER, 0); }
		public TerminalNode TO() { return getToken(quizParser.TO, 0); }
		public Sub_questionContext sub_question() {
			return getRuleContext(Sub_questionContext.class,0);
		}
		public DefinirRespostaContext(DefineAnswerContext ctx) { copyFrom(ctx); }
	}

	public final DefineAnswerContext defineAnswer() throws RecognitionException {
		DefineAnswerContext _localctx = new DefineAnswerContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_defineAnswer);
		try {
			_localctx = new DefinirRespostaContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(DEFINEANSWER);
			setState(148);
			match(NUMBER);
			setState(149);
			match(TO);
			setState(150);
			sub_question();
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

	public static class DefineMarkContext extends ParserRuleContext {
		public DefineMarkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defineMark; }
	 
		public DefineMarkContext() { }
		public void copyFrom(DefineMarkContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DefinirCotacaoContext extends DefineMarkContext {
		public TerminalNode DEFINEMARK() { return getToken(quizParser.DEFINEMARK, 0); }
		public TerminalNode NUMBER() { return getToken(quizParser.NUMBER, 0); }
		public TerminalNode TO() { return getToken(quizParser.TO, 0); }
		public Sub_questionContext sub_question() {
			return getRuleContext(Sub_questionContext.class,0);
		}
		public DefinirCotacaoContext(DefineMarkContext ctx) { copyFrom(ctx); }
	}

	public final DefineMarkContext defineMark() throws RecognitionException {
		DefineMarkContext _localctx = new DefineMarkContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_defineMark);
		try {
			_localctx = new DefinirCotacaoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(DEFINEMARK);
			setState(153);
			match(NUMBER);
			setState(154);
			match(TO);
			setState(155);
			sub_question();
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

	public static class EvaluationContext extends ParserRuleContext {
		public EvaluationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_evaluation; }
	 
		public EvaluationContext() { }
		public void copyFrom(EvaluationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AvaliarContext extends EvaluationContext {
		public TerminalNode EVALUATION() { return getToken(quizParser.EVALUATION, 0); }
		public TerminalNode NUMBER() { return getToken(quizParser.NUMBER, 0); }
		public AvaliarContext(EvaluationContext ctx) { copyFrom(ctx); }
	}

	public final EvaluationContext evaluation() throws RecognitionException {
		EvaluationContext _localctx = new EvaluationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_evaluation);
		try {
			_localctx = new AvaliarContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(EVALUATION);
			setState(158);
			match(NUMBER);
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

	public static class MultiContext extends ParserRuleContext {
		public MultiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multi; }
	 
		public MultiContext() { }
		public void copyFrom(MultiContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MultContext extends MultiContext {
		public TerminalNode MULTICHOICE() { return getToken(quizParser.MULTICHOICE, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public MultContext(MultiContext ctx) { copyFrom(ctx); }
	}

	public final MultiContext multi() throws RecognitionException {
		MultiContext _localctx = new MultiContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_multi);
		try {
			_localctx = new MultContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(MULTICHOICE);
			setState(161);
			args();
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

	public static class ArgsContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(quizParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(quizParser.NAME, i);
		}
		public List<OptionsinContext> optionsin() {
			return getRuleContexts(OptionsinContext.class);
		}
		public OptionsinContext optionsin(int i) {
			return getRuleContext(OptionsinContext.class,i);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(T__4);
			setState(164);
			match(NAME);
			setState(165);
			match(T__5);
			setState(166);
			match(NAME);
			setState(167);
			match(T__6);
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(168);
				match(T__7);
				setState(169);
				match(NAME);
				}
				}
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(175);
				optionsin();
				}
				}
				setState(180);
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

	public static class OptionsinContext extends ParserRuleContext {
		public List<TerminalNode> OPTION() { return getTokens(quizParser.OPTION); }
		public TerminalNode OPTION(int i) {
			return getToken(quizParser.OPTION, i);
		}
		public List<TerminalNode> NAME() { return getTokens(quizParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(quizParser.NAME, i);
		}
		public OptionsinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionsin; }
	}

	public final OptionsinContext optionsin() throws RecognitionException {
		OptionsinContext _localctx = new OptionsinContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_optionsin);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(T__8);
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPTION) {
				{
				{
				setState(182);
				match(OPTION);
				setState(183);
				match(T__9);
				setState(184);
				match(NAME);
				setState(185);
				match(T__5);
				setState(186);
				match(NAME);
				setState(187);
				match(T__6);
				}
				}
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(193);
			match(T__10);
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
		public MatchingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matching; }
	 
		public MatchingContext() { }
		public void copyFrom(MatchingContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MatchQuestionContext extends MatchingContext {
		public TerminalNode MATCHING() { return getToken(quizParser.MATCHING, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public MatchQuestionContext(MatchingContext ctx) { copyFrom(ctx); }
	}

	public final MatchingContext matching() throws RecognitionException {
		MatchingContext _localctx = new MatchingContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_matching);
		try {
			_localctx = new MatchQuestionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(MATCHING);
			setState(196);
			arguments();
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

	public static class ArgumentsContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(quizParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(quizParser.NAME, i);
		}
		public List<OptContext> opt() {
			return getRuleContexts(OptContext.class);
		}
		public OptContext opt(int i) {
			return getRuleContext(OptContext.class,i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(T__4);
			setState(199);
			match(NAME);
			setState(200);
			match(T__5);
			setState(201);
			match(NAME);
			setState(202);
			match(T__6);
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(203);
				match(T__7);
				setState(204);
				match(NAME);
				}
				}
				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(210);
				opt();
				}
				}
				setState(215);
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

	public static class OptContext extends ParserRuleContext {
		public List<TerminalNode> OPTION() { return getTokens(quizParser.OPTION); }
		public TerminalNode OPTION(int i) {
			return getToken(quizParser.OPTION, i);
		}
		public List<TerminalNode> NAME() { return getTokens(quizParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(quizParser.NAME, i);
		}
		public List<TerminalNode> OPCOESPOSSIVEIS() { return getTokens(quizParser.OPCOESPOSSIVEIS); }
		public TerminalNode OPCOESPOSSIVEIS(int i) {
			return getToken(quizParser.OPCOESPOSSIVEIS, i);
		}
		public OptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opt; }
	}

	public final OptContext opt() throws RecognitionException {
		OptContext _localctx = new OptContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_opt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(T__8);
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPTION) {
				{
				{
				setState(217);
				match(OPTION);
				setState(218);
				match(T__9);
				setState(219);
				match(NAME);
				setState(220);
				match(T__5);
				setState(221);
				match(NAME);
				setState(222);
				match(T__6);
				setState(223);
				match(T__11);
				setState(224);
				match(OPCOESPOSSIVEIS);
				setState(225);
				match(T__12);
				setState(226);
				match(NAME);
				}
				}
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(232);
			match(T__10);
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

	public static class Import_exprContext extends ParserRuleContext {
		public Import_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_expr; }
	 
		public Import_exprContext() { }
		public void copyFrom(Import_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ImportContext extends Import_exprContext {
		public TerminalNode IMPORT() { return getToken(quizParser.IMPORT, 0); }
		public PlistContext plist() {
			return getRuleContext(PlistContext.class,0);
		}
		public ImportContext(Import_exprContext ctx) { copyFrom(ctx); }
	}

	public final Import_exprContext import_expr() throws RecognitionException {
		Import_exprContext _localctx = new Import_exprContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_import_expr);
		try {
			_localctx = new ImportContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(IMPORT);
			setState(235);
			plist();
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

	public static class PlistContext extends ParserRuleContext {
		public List<PContext> p() {
			return getRuleContexts(PContext.class);
		}
		public PContext p(int i) {
			return getRuleContext(PContext.class,i);
		}
		public PlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plist; }
	}

	public final PlistContext plist() throws RecognitionException {
		PlistContext _localctx = new PlistContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_plist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			p();
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(238);
				match(T__1);
				setState(239);
				p();
				}
				}
				setState(244);
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

	public static class PContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(quizParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(quizParser.NAME, i);
		}
		public PContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_p; }
	}

	public final PContext p() throws RecognitionException {
		PContext _localctx = new PContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_p);
		try {
			setState(249);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(245);
				match(NAME);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(246);
				match(NAME);
				setState(247);
				match(T__13);
				setState(248);
				match(NAME);
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

	public static class ShowContext extends ParserRuleContext {
		public ShowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_show; }
	 
		public ShowContext() { }
		public void copyFrom(ShowContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ShowQuestionMultiOptandQuestionContext extends ShowContext {
		public TerminalNode SHOW() { return getToken(quizParser.SHOW, 0); }
		public TerminalNode NAME() { return getToken(quizParser.NAME, 0); }
		public List<Ques_optContext> ques_opt() {
			return getRuleContexts(Ques_optContext.class);
		}
		public Ques_optContext ques_opt(int i) {
			return getRuleContext(Ques_optContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(quizParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(quizParser.AND, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(quizParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(quizParser.NUMBER, i);
		}
		public ShowQuestionMultiOptandQuestionContext(ShowContext ctx) { copyFrom(ctx); }
	}
	public static class ShowQuestionMultiOptContext extends ShowContext {
		public TerminalNode SHOW() { return getToken(quizParser.SHOW, 0); }
		public TerminalNode NAME() { return getToken(quizParser.NAME, 0); }
		public Ques_optContext ques_opt() {
			return getRuleContext(Ques_optContext.class,0);
		}
		public ShowQuestionMultiOptContext(ShowContext ctx) { copyFrom(ctx); }
	}
	public static class ShowQuestionBasicContext extends ShowContext {
		public TerminalNode SHOW() { return getToken(quizParser.SHOW, 0); }
		public TerminalNode NAME() { return getToken(quizParser.NAME, 0); }
		public ShowQuestionBasicContext(ShowContext ctx) { copyFrom(ctx); }
	}

	public final ShowContext show() throws RecognitionException {
		ShowContext _localctx = new ShowContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_show);
		int _la;
		try {
			setState(267);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new ShowQuestionBasicContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(251);
				match(SHOW);
				setState(252);
				match(NAME);
				}
				break;
			case 2:
				_localctx = new ShowQuestionMultiOptContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(253);
				match(SHOW);
				setState(254);
				match(NAME);
				setState(255);
				ques_opt();
				}
				break;
			case 3:
				_localctx = new ShowQuestionMultiOptandQuestionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(256);
				match(SHOW);
				setState(257);
				match(NAME);
				setState(258);
				ques_opt();
				setState(264);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AND) {
					{
					{
					setState(259);
					match(AND);
					setState(260);
					match(NUMBER);
					{
					setState(261);
					ques_opt();
					}
					}
					}
					setState(266);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class Ques_optContext extends ParserRuleContext {
		public List<TerminalNode> WITH() { return getTokens(quizParser.WITH); }
		public TerminalNode WITH(int i) {
			return getToken(quizParser.WITH, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(quizParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(quizParser.NUMBER, i);
		}
		public Ques_optContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ques_opt; }
	}

	public final Ques_optContext ques_opt() throws RecognitionException {
		Ques_optContext _localctx = new Ques_optContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_ques_opt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WITH) {
				{
				{
				setState(269);
				match(WITH);
				setState(270);
				match(NUMBER);
				{
				setState(271);
				match(T__1);
				setState(272);
				match(NUMBER);
				}
				}
				}
				setState(277);
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

	public static class ShuffleContext extends ParserRuleContext {
		public ShuffleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shuffle; }
	 
		public ShuffleContext() { }
		public void copyFrom(ShuffleContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ShuffleQuestionContext extends ShuffleContext {
		public TerminalNode SHUFFLE() { return getToken(quizParser.SHUFFLE, 0); }
		public TerminalNode NUMBER() { return getToken(quizParser.NUMBER, 0); }
		public ShuffleQuestionContext(ShuffleContext ctx) { copyFrom(ctx); }
	}

	public final ShuffleContext shuffle() throws RecognitionException {
		ShuffleContext _localctx = new ShuffleContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_shuffle);
		try {
			_localctx = new ShuffleQuestionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			match(SHUFFLE);
			setState(279);
			match(NUMBER);
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

	public static class GetAnswerContext extends ParserRuleContext {
		public GetAnswerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getAnswer; }
	 
		public GetAnswerContext() { }
		public void copyFrom(GetAnswerContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class GetAnswerNumContext extends GetAnswerContext {
		public TerminalNode GET() { return getToken(quizParser.GET, 0); }
		public TerminalNode ANSWER() { return getToken(quizParser.ANSWER, 0); }
		public TerminalNode TO() { return getToken(quizParser.TO, 0); }
		public TerminalNode NUMBER() { return getToken(quizParser.NUMBER, 0); }
		public GetAnswerNumContext(GetAnswerContext ctx) { copyFrom(ctx); }
	}

	public final GetAnswerContext getAnswer() throws RecognitionException {
		GetAnswerContext _localctx = new GetAnswerContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_getAnswer);
		try {
			_localctx = new GetAnswerNumContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			match(GET);
			setState(282);
			match(ANSWER);
			setState(283);
			match(TO);
			setState(284);
			match(NUMBER);
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

	public static class GetChoiceContext extends ParserRuleContext {
		public TerminalNode GET() { return getToken(quizParser.GET, 0); }
		public TerminalNode CHOICE() { return getToken(quizParser.CHOICE, 0); }
		public GetChoiceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getChoice; }
	}

	public final GetChoiceContext getChoice() throws RecognitionException {
		GetChoiceContext _localctx = new GetChoiceContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_getChoice);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			match(GET);
			setState(287);
			match(CHOICE);
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

	public static class GetAnswerToChoiceContext extends ParserRuleContext {
		public TerminalNode GET() { return getToken(quizParser.GET, 0); }
		public TerminalNode ANSWER() { return getToken(quizParser.ANSWER, 0); }
		public TerminalNode TO() { return getToken(quizParser.TO, 0); }
		public TerminalNode CHOICE() { return getToken(quizParser.CHOICE, 0); }
		public GetAnswerToChoiceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getAnswerToChoice; }
	}

	public final GetAnswerToChoiceContext getAnswerToChoice() throws RecognitionException {
		GetAnswerToChoiceContext _localctx = new GetAnswerToChoiceContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_getAnswerToChoice);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(GET);
			setState(290);
			match(ANSWER);
			setState(291);
			match(TO);
			setState(292);
			match(CHOICE);
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

	public static class ShortQuestionContext extends ParserRuleContext {
		public ShortQuestionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shortQuestion; }
	 
		public ShortQuestionContext() { }
		public void copyFrom(ShortQuestionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RespostaCurtaContext extends ShortQuestionContext {
		public TerminalNode SHORTANSWER() { return getToken(quizParser.SHORTANSWER, 0); }
		public List<TerminalNode> NAME() { return getTokens(quizParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(quizParser.NAME, i);
		}
		public TerminalNode NEWLINE() { return getToken(quizParser.NEWLINE, 0); }
		public RespostaCurtaContext(ShortQuestionContext ctx) { copyFrom(ctx); }
	}

	public final ShortQuestionContext shortQuestion() throws RecognitionException {
		ShortQuestionContext _localctx = new ShortQuestionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_shortQuestion);
		int _la;
		try {
			_localctx = new RespostaCurtaContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(SHORTANSWER);
			setState(295);
			match(T__14);
			setState(296);
			match(NAME);
			setState(297);
			match(T__15);
			setState(298);
			match(NAME);
			setState(304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__16) {
				{
				{
				setState(299);
				match(T__16);
				setState(300);
				match(NAME);
				setState(301);
				match(T__6);
				}
				}
				setState(306);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(307);
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
		public NumericContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numeric; }
	 
		public NumericContext() { }
		public void copyFrom(NumericContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NumericQuestionContext extends NumericContext {
		public TerminalNode NUMERICANSWER() { return getToken(quizParser.NUMERICANSWER, 0); }
		public List<TerminalNode> NAME() { return getTokens(quizParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(quizParser.NAME, i);
		}
		public TerminalNode NEWLINE() { return getToken(quizParser.NEWLINE, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(quizParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(quizParser.NUMBER, i);
		}
		public NumericQuestionContext(NumericContext ctx) { copyFrom(ctx); }
	}

	public final NumericContext numeric() throws RecognitionException {
		NumericContext _localctx = new NumericContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_numeric);
		int _la;
		try {
			_localctx = new NumericQuestionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			match(NUMERICANSWER);
			setState(310);
			match(T__14);
			setState(311);
			match(NAME);
			setState(312);
			match(T__15);
			setState(313);
			match(NAME);
			setState(319);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__16) {
				{
				{
				setState(314);
				match(T__16);
				setState(315);
				match(NUMBER);
				setState(316);
				match(T__6);
				}
				}
				setState(321);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(322);
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
		public EssayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_essay; }
	 
		public EssayContext() { }
		public void copyFrom(EssayContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EssayQuestionContext extends EssayContext {
		public TerminalNode ESSAY() { return getToken(quizParser.ESSAY, 0); }
		public List<TerminalNode> NAME() { return getTokens(quizParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(quizParser.NAME, i);
		}
		public EssayQuestionContext(EssayContext ctx) { copyFrom(ctx); }
	}

	public final EssayContext essay() throws RecognitionException {
		EssayContext _localctx = new EssayContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_essay);
		try {
			_localctx = new EssayQuestionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			match(ESSAY);
			setState(325);
			match(T__14);
			setState(326);
			match(NAME);
			setState(327);
			match(T__15);
			setState(328);
			match(NAME);
			setState(329);
			match(T__6);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\65\u014e\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\7\2>\n\2\f\2\16"+
		"\2A\13\2\3\2\3\2\3\3\5\3F\n\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4[\n\4\3\5\3\5\3\5\7\5`\n\5\f\5"+
		"\16\5c\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7"+
		"\6s\n\6\f\6\16\6v\13\6\3\6\3\6\3\6\3\6\3\6\7\6}\n\6\f\6\16\6\u0080\13"+
		"\6\5\6\u0082\n\6\3\7\3\7\3\7\7\7\u0087\n\7\f\7\16\7\u008a\13\7\3\b\3\b"+
		"\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3"+
		"\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7"+
		"\16\u00ad\n\16\f\16\16\16\u00b0\13\16\3\16\7\16\u00b3\n\16\f\16\16\16"+
		"\u00b6\13\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u00bf\n\17\f\17\16"+
		"\17\u00c2\13\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\7\21\u00d0\n\21\f\21\16\21\u00d3\13\21\3\21\7\21\u00d6\n\21\f\21"+
		"\16\21\u00d9\13\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\7\22\u00e6\n\22\f\22\16\22\u00e9\13\22\3\22\3\22\3\23\3\23\3\23\3"+
		"\24\3\24\3\24\7\24\u00f3\n\24\f\24\16\24\u00f6\13\24\3\25\3\25\3\25\3"+
		"\25\5\25\u00fc\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\7\26\u0109\n\26\f\26\16\26\u010c\13\26\5\26\u010e\n\26\3\27\3\27"+
		"\3\27\3\27\7\27\u0114\n\27\f\27\16\27\u0117\13\27\3\30\3\30\3\30\3\31"+
		"\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\7\34\u0131\n\34\f\34\16\34\u0134\13\34"+
		"\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\7\35\u0140\n\35\f\35"+
		"\16\35\u0143\13\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\2"+
		"\2\37\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:\2"+
		"\2\2\u0157\2?\3\2\2\2\4E\3\2\2\2\6Z\3\2\2\2\b\\\3\2\2\2\n\u0081\3\2\2"+
		"\2\f\u0083\3\2\2\2\16\u008b\3\2\2\2\20\u0090\3\2\2\2\22\u0095\3\2\2\2"+
		"\24\u009a\3\2\2\2\26\u009f\3\2\2\2\30\u00a2\3\2\2\2\32\u00a5\3\2\2\2\34"+
		"\u00b7\3\2\2\2\36\u00c5\3\2\2\2 \u00c8\3\2\2\2\"\u00da\3\2\2\2$\u00ec"+
		"\3\2\2\2&\u00ef\3\2\2\2(\u00fb\3\2\2\2*\u010d\3\2\2\2,\u0115\3\2\2\2."+
		"\u0118\3\2\2\2\60\u011b\3\2\2\2\62\u0120\3\2\2\2\64\u0123\3\2\2\2\66\u0128"+
		"\3\2\2\28\u0137\3\2\2\2:\u0146\3\2\2\2<>\5\4\3\2=<\3\2\2\2>A\3\2\2\2?"+
		"=\3\2\2\2?@\3\2\2\2@B\3\2\2\2A?\3\2\2\2BC\7\2\2\3C\3\3\2\2\2DF\5\6\4\2"+
		"ED\3\2\2\2EF\3\2\2\2FG\3\2\2\2GH\7\62\2\2H\5\3\2\2\2I[\5\b\5\2J[\5\n\6"+
		"\2K[\5\30\r\2L[\5\36\20\2M[\5\26\f\2N[\5\20\t\2O[\5\22\n\2P[\5\24\13\2"+
		"Q[\5\16\b\2R[\5*\26\2S[\5.\30\2T[\5\60\31\2U[\5\62\32\2V[\5\64\33\2W["+
		"\5\66\34\2X[\58\35\2Y[\5:\36\2ZI\3\2\2\2ZJ\3\2\2\2ZK\3\2\2\2ZL\3\2\2\2"+
		"ZM\3\2\2\2ZN\3\2\2\2ZO\3\2\2\2ZP\3\2\2\2ZQ\3\2\2\2ZR\3\2\2\2ZS\3\2\2\2"+
		"ZT\3\2\2\2ZU\3\2\2\2ZV\3\2\2\2ZW\3\2\2\2ZX\3\2\2\2ZY\3\2\2\2[\7\3\2\2"+
		"\2\\]\7\27\2\2]a\7\25\2\2^`\7\3\2\2_^\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3"+
		"\2\2\2b\t\3\2\2\2ca\3\2\2\2de\7\30\2\2e\u0082\7\25\2\2fg\7\31\2\2gh\7"+
		"\26\2\2hi\7\'\2\2i\u0082\5\f\7\2jk\7\31\2\2kl\7\26\2\2lm\7\'\2\2m\u0082"+
		"\7\32\2\2no\7\31\2\2ot\7\25\2\2pq\7\4\2\2qs\7\25\2\2rp\3\2\2\2sv\3\2\2"+
		"\2tr\3\2\2\2tu\3\2\2\2uw\3\2\2\2vt\3\2\2\2wx\7\'\2\2xy\7-\2\2y~\7\25\2"+
		"\2z{\7\4\2\2{}\7\25\2\2|z\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2~\177\3\2\2"+
		"\2\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0081d\3\2\2\2\u0081f\3\2\2\2\u0081"+
		"j\3\2\2\2\u0081n\3\2\2\2\u0082\13\3\2\2\2\u0083\u0088\7\26\2\2\u0084\u0085"+
		"\7\4\2\2\u0085\u0087\7\26\2\2\u0086\u0084\3\2\2\2\u0087\u008a\3\2\2\2"+
		"\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\r\3\2\2\2\u008a\u0088\3"+
		"\2\2\2\u008b\u008c\7\5\2\2\u008c\u008d\7\25\2\2\u008d\u008e\7\6\2\2\u008e"+
		"\u008f\7\25\2\2\u008f\17\3\2\2\2\u0090\u0091\7\33\2\2\u0091\u0092\7\26"+
		"\2\2\u0092\u0093\7%\2\2\u0093\u0094\7\26\2\2\u0094\21\3\2\2\2\u0095\u0096"+
		"\7\34\2\2\u0096\u0097\7\26\2\2\u0097\u0098\7\'\2\2\u0098\u0099\5\f\7\2"+
		"\u0099\23\3\2\2\2\u009a\u009b\7\35\2\2\u009b\u009c\7\26\2\2\u009c\u009d"+
		"\7\'\2\2\u009d\u009e\5\f\7\2\u009e\25\3\2\2\2\u009f\u00a0\7\36\2\2\u00a0"+
		"\u00a1\7\26\2\2\u00a1\27\3\2\2\2\u00a2\u00a3\7\37\2\2\u00a3\u00a4\5\32"+
		"\16\2\u00a4\31\3\2\2\2\u00a5\u00a6\7\7\2\2\u00a6\u00a7\7\25\2\2\u00a7"+
		"\u00a8\7\b\2\2\u00a8\u00a9\7\25\2\2\u00a9\u00ae\7\t\2\2\u00aa\u00ab\7"+
		"\n\2\2\u00ab\u00ad\7\25\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00b0\3\2\2\2\u00ae"+
		"\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b4\3\2\2\2\u00b0\u00ae\3\2"+
		"\2\2\u00b1\u00b3\5\34\17\2\u00b2\u00b1\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4"+
		"\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\33\3\2\2\2\u00b6\u00b4\3\2\2"+
		"\2\u00b7\u00c0\7\13\2\2\u00b8\u00b9\7#\2\2\u00b9\u00ba\7\f\2\2\u00ba\u00bb"+
		"\7\25\2\2\u00bb\u00bc\7\b\2\2\u00bc\u00bd\7\25\2\2\u00bd\u00bf\7\t\2\2"+
		"\u00be\u00b8\3\2\2\2\u00bf\u00c2\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1"+
		"\3\2\2\2\u00c1\u00c3\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c3\u00c4\7\r\2\2\u00c4"+
		"\35\3\2\2\2\u00c5\u00c6\7\60\2\2\u00c6\u00c7\5 \21\2\u00c7\37\3\2\2\2"+
		"\u00c8\u00c9\7\7\2\2\u00c9\u00ca\7\25\2\2\u00ca\u00cb\7\b\2\2\u00cb\u00cc"+
		"\7\25\2\2\u00cc\u00d1\7\t\2\2\u00cd\u00ce\7\n\2\2\u00ce\u00d0\7\25\2\2"+
		"\u00cf\u00cd\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2"+
		"\3\2\2\2\u00d2\u00d7\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4\u00d6\5\"\22\2"+
		"\u00d5\u00d4\3\2\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8"+
		"\3\2\2\2\u00d8!\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da\u00e7\7\13\2\2\u00db"+
		"\u00dc\7#\2\2\u00dc\u00dd\7\f\2\2\u00dd\u00de\7\25\2\2\u00de\u00df\7\b"+
		"\2\2\u00df\u00e0\7\25\2\2\u00e0\u00e1\7\t\2\2\u00e1\u00e2\7\16\2\2\u00e2"+
		"\u00e3\7\24\2\2\u00e3\u00e4\7\17\2\2\u00e4\u00e6\7\25\2\2\u00e5\u00db"+
		"\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8"+
		"\u00ea\3\2\2\2\u00e9\u00e7\3\2\2\2\u00ea\u00eb\7\r\2\2\u00eb#\3\2\2\2"+
		"\u00ec\u00ed\7$\2\2\u00ed\u00ee\5&\24\2\u00ee%\3\2\2\2\u00ef\u00f4\5("+
		"\25\2\u00f0\u00f1\7\4\2\2\u00f1\u00f3\5(\25\2\u00f2\u00f0\3\2\2\2\u00f3"+
		"\u00f6\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\'\3\2\2\2"+
		"\u00f6\u00f4\3\2\2\2\u00f7\u00fc\7\25\2\2\u00f8\u00f9\7\25\2\2\u00f9\u00fa"+
		"\7\20\2\2\u00fa\u00fc\7\25\2\2\u00fb\u00f7\3\2\2\2\u00fb\u00f8\3\2\2\2"+
		"\u00fc)\3\2\2\2\u00fd\u00fe\7)\2\2\u00fe\u010e\7\25\2\2\u00ff\u0100\7"+
		")\2\2\u0100\u0101\7\25\2\2\u0101\u010e\5,\27\2\u0102\u0103\7)\2\2\u0103"+
		"\u0104\7\25\2\2\u0104\u010a\5,\27\2\u0105\u0106\7+\2\2\u0106\u0107\7\26"+
		"\2\2\u0107\u0109\5,\27\2\u0108\u0105\3\2\2\2\u0109\u010c\3\2\2\2\u010a"+
		"\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010e\3\2\2\2\u010c\u010a\3\2"+
		"\2\2\u010d\u00fd\3\2\2\2\u010d\u00ff\3\2\2\2\u010d\u0102\3\2\2\2\u010e"+
		"+\3\2\2\2\u010f\u0110\7,\2\2\u0110\u0111\7\26\2\2\u0111\u0112\7\4\2\2"+
		"\u0112\u0114\7\26\2\2\u0113\u010f\3\2\2\2\u0114\u0117\3\2\2\2\u0115\u0113"+
		"\3\2\2\2\u0115\u0116\3\2\2\2\u0116-\3\2\2\2\u0117\u0115\3\2\2\2\u0118"+
		"\u0119\7*\2\2\u0119\u011a\7\26\2\2\u011a/\3\2\2\2\u011b\u011c\7&\2\2\u011c"+
		"\u011d\7(\2\2\u011d\u011e\7\'\2\2\u011e\u011f\7\26\2\2\u011f\61\3\2\2"+
		"\2\u0120\u0121\7&\2\2\u0121\u0122\7.\2\2\u0122\63\3\2\2\2\u0123\u0124"+
		"\7&\2\2\u0124\u0125\7(\2\2\u0125\u0126\7\'\2\2\u0126\u0127\7.\2\2\u0127"+
		"\65\3\2\2\2\u0128\u0129\7 \2\2\u0129\u012a\7\21\2\2\u012a\u012b\7\25\2"+
		"\2\u012b\u012c\7\22\2\2\u012c\u0132\7\25\2\2\u012d\u012e\7\23\2\2\u012e"+
		"\u012f\7\25\2\2\u012f\u0131\7\t\2\2\u0130\u012d\3\2\2\2\u0131\u0134\3"+
		"\2\2\2\u0132\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0135\3\2\2\2\u0134"+
		"\u0132\3\2\2\2\u0135\u0136\7\62\2\2\u0136\67\3\2\2\2\u0137\u0138\7!\2"+
		"\2\u0138\u0139\7\21\2\2\u0139\u013a\7\25\2\2\u013a\u013b\7\22\2\2\u013b"+
		"\u0141\7\25\2\2\u013c\u013d\7\23\2\2\u013d\u013e\7\26\2\2\u013e\u0140"+
		"\7\t\2\2\u013f\u013c\3\2\2\2\u0140\u0143\3\2\2\2\u0141\u013f\3\2\2\2\u0141"+
		"\u0142\3\2\2\2\u0142\u0144\3\2\2\2\u0143\u0141\3\2\2\2\u0144\u0145\7\62"+
		"\2\2\u01459\3\2\2\2\u0146\u0147\7\"\2\2\u0147\u0148\7\21\2\2\u0148\u0149"+
		"\7\25\2\2\u0149\u014a\7\22\2\2\u014a\u014b\7\25\2\2\u014b\u014c\7\t\2"+
		"\2\u014c;\3\2\2\2\27?EZat~\u0081\u0088\u00ae\u00b4\u00c0\u00d1\u00d7\u00e7"+
		"\u00f4\u00fb\u010a\u010d\u0115\u0132\u0141";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}