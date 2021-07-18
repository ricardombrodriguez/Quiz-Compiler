// Generated from quiz.g4 by ANTLR 4.9.2

    package Quiz;

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
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, CORRECT=47, NUMBER=48, FLOAT=49, NAME=50, STRING=51, COMMENT=52, 
		NEWLINE=53, MULTICOMM=54, WS=55;
	public static final int
		RULE_program = 0, RULE_stat = 1, RULE_expr = 2, RULE_quiz = 3, RULE_createReport = 4, 
		RULE_add = 5, RULE_sub_question = 6, RULE_sub_groups = 7, RULE_load = 8, 
		RULE_remove = 9, RULE_defineAnswer = 10, RULE_defineMark = 11, RULE_mark = 12, 
		RULE_showGroup = 13, RULE_showOpt = 14, RULE_evaluation = 15, RULE_multichoice = 16, 
		RULE_multichoiceoption = 17, RULE_matching = 18, RULE_matchingoption = 19, 
		RULE_match = 20, RULE_import_expr = 21, RULE_plist = 22, RULE_p = 23, 
		RULE_show = 24, RULE_question = 25, RULE_ques_opt = 26, RULE_shuffle = 27, 
		RULE_getAnswer = 28, RULE_getChoice = 29, RULE_getAnswerToChoice = 30, 
		RULE_shortQuestion = 31, RULE_numeric = 32, RULE_essay = 33, RULE_option = 34, 
		RULE_optionMult = 35, RULE_finishQuiz = 36, RULE_title = 37;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "stat", "expr", "quiz", "createReport", "add", "sub_question", 
			"sub_groups", "load", "remove", "defineAnswer", "defineMark", "mark", 
			"showGroup", "showOpt", "evaluation", "multichoice", "multichoiceoption", 
			"matching", "matchingoption", "match", "import_expr", "plist", "p", "show", 
			"question", "ques_opt", "shuffle", "getAnswer", "getChoice", "getAnswerToChoice", 
			"shortQuestion", "numeric", "essay", "option", "optionMult", "finishQuiz", 
			"title"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'create quiz'", "'title'", "'='", "'auto-corrective'", "'create'", 
			"'report'", "'add group'", "','", "'add'", "'to'", "'all'", "'group'", 
			"'load'", "'as'", "'remove'", "'from'", "'define-answer'", "'define-mark'", 
			"'if'", "'wrong'", "'show'", "'repeat'", "'times'", "'discount'", "'{'", 
			"'}'", "'evaluation'", "'multi-choice'", "'id'", "'text'", "'option'", 
			"'matching'", "'side'", "'match'", "'import'", "'and'", "'with'", "'shuffle'", 
			"'get'", "'answer'", "'choice'", "'short-question'", "'numeric-question'", 
			"'essay-question'", "'option-multi'", "'finish quiz'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "CORRECT", 
			"NUMBER", "FLOAT", "NAME", "STRING", "COMMENT", "NEWLINE", "MULTICOMM", 
			"WS"
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof quizVisitor ) return ((quizVisitor<? extends T>)visitor).visitProgram(this);
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
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__6) | (1L << T__8) | (1L << T__12) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__20) | (1L << T__26) | (1L << T__27) | (1L << T__31) | (1L << T__37) | (1L << T__38) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << NEWLINE))) != 0)) {
				{
				{
				setState(76);
				stat();
				}
				}
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(82);
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
			if ( listener instanceof quizListener ) ((quizListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).exitStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof quizVisitor ) return ((quizVisitor<? extends T>)visitor).visitStat(this);
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
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__6) | (1L << T__8) | (1L << T__12) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__20) | (1L << T__26) | (1L << T__27) | (1L << T__31) | (1L << T__37) | (1L << T__38) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45))) != 0)) {
				{
				{
				setState(84);
				expr();
				}
				}
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(90);
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
		public MultichoiceContext multichoice() {
			return getRuleContext(MultichoiceContext.class,0);
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
		public ShowGroupContext showGroup() {
			return getRuleContext(ShowGroupContext.class,0);
		}
		public Import_exprContext import_expr() {
			return getRuleContext(Import_exprContext.class,0);
		}
		public ShowOptContext showOpt() {
			return getRuleContext(ShowOptContext.class,0);
		}
		public LoadContext load() {
			return getRuleContext(LoadContext.class,0);
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
		public CreateReportContext createReport() {
			return getRuleContext(CreateReportContext.class,0);
		}
		public OptionContext option() {
			return getRuleContext(OptionContext.class,0);
		}
		public FinishQuizContext finishQuiz() {
			return getRuleContext(FinishQuizContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof quizVisitor ) return ((quizVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expr);
		try {
			setState(109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				quiz();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				add();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(94);
				multichoice();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(95);
				matching();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(96);
				evaluation();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(97);
				remove();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(98);
				defineAnswer();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(99);
				showGroup();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(100);
				import_expr();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(101);
				showOpt();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(102);
				load();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(103);
				shortQuestion();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(104);
				numeric();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(105);
				essay();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(106);
				createReport();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(107);
				option();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(108);
				finishQuiz();
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
	public static class CreateQuizCorrectionContext extends QuizContext {
		public TerminalNode STRING() { return getToken(quizParser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(quizParser.NUMBER, 0); }
		public CreateQuizCorrectionContext(QuizContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).enterCreateQuizCorrection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).exitCreateQuizCorrection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof quizVisitor ) return ((quizVisitor<? extends T>)visitor).visitCreateQuizCorrection(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateQuizContext extends QuizContext {
		public TerminalNode STRING() { return getToken(quizParser.STRING, 0); }
		public CreateQuizContext(QuizContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).enterCreateQuiz(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).exitCreateQuiz(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof quizVisitor ) return ((quizVisitor<? extends T>)visitor).visitCreateQuiz(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuizContext quiz() throws RecognitionException {
		QuizContext _localctx = new QuizContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_quiz);
		try {
			setState(121);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new CreateQuizContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				match(T__0);
				setState(112);
				match(T__1);
				setState(113);
				match(T__2);
				setState(114);
				match(STRING);
				}
				break;
			case 2:
				_localctx = new CreateQuizCorrectionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				match(T__0);
				setState(116);
				match(T__1);
				setState(117);
				match(T__2);
				setState(118);
				match(STRING);
				setState(119);
				match(T__3);
				setState(120);
				match(NUMBER);
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

	public static class CreateReportContext extends ParserRuleContext {
		public CreateReportContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createReport; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).enterCreateReport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).exitCreateReport(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof quizVisitor ) return ((quizVisitor<? extends T>)visitor).visitCreateReport(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateReportContext createReport() throws RecognitionException {
		CreateReportContext _localctx = new CreateReportContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_createReport);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(T__4);
			setState(124);
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
		public TerminalNode NAME() { return getToken(quizParser.NAME, 0); }
		public Sub_questionContext sub_question() {
			return getRuleContext(Sub_questionContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(quizParser.NEWLINE, 0); }
		public AddOptionContext(AddContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).enterAddOption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).exitAddOption(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof quizVisitor ) return ((quizVisitor<? extends T>)visitor).visitAddOption(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateGroupContext extends AddContext {
		public TerminalNode NAME() { return getToken(quizParser.NAME, 0); }
		public TerminalNode NEWLINE() { return getToken(quizParser.NEWLINE, 0); }
		public CreateGroupContext(AddContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).enterCreateGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).exitCreateGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof quizVisitor ) return ((quizVisitor<? extends T>)visitor).visitCreateGroup(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddAllContext extends AddContext {
		public TerminalNode NAME() { return getToken(quizParser.NAME, 0); }
		public TerminalNode NEWLINE() { return getToken(quizParser.NEWLINE, 0); }
		public AddAllContext(AddContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).enterAddAll(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).exitAddAll(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof quizVisitor ) return ((quizVisitor<? extends T>)visitor).visitAddAll(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateMultiGroupContext extends AddContext {
		public List<TerminalNode> NAME() { return getTokens(quizParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(quizParser.NAME, i);
		}
		public TerminalNode NEWLINE() { return getToken(quizParser.NEWLINE, 0); }
		public CreateMultiGroupContext(AddContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).enterCreateMultiGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).exitCreateMultiGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof quizVisitor ) return ((quizVisitor<? extends T>)visitor).visitCreateMultiGroup(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddQuestion2GroupContext extends AddContext {
		public Sub_questionContext sub_question() {
			return getRuleContext(Sub_questionContext.class,0);
		}
		public Sub_groupsContext sub_groups() {
			return getRuleContext(Sub_groupsContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(quizParser.NEWLINE, 0); }
		public AddQuestion2GroupContext(AddContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).enterAddQuestion2Group(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).exitAddQuestion2Group(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof quizVisitor ) return ((quizVisitor<? extends T>)visitor).visitAddQuestion2Group(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddContext add() throws RecognitionException {
		AddContext _localctx = new AddContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_add);
		int _la;
		try {
			setState(157);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new CreateGroupContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(126);
				match(T__6);
				setState(127);
				match(NAME);
				setState(128);
				match(NEWLINE);
				}
				break;
			case 2:
				_localctx = new CreateMultiGroupContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
				match(T__6);
				setState(130);
				match(NAME);
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(131);
					match(T__7);
					setState(132);
					match(NAME);
					}
					}
					setState(137);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(138);
				match(NEWLINE);
				}
				break;
			case 3:
				_localctx = new AddOptionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(139);
				match(T__8);
				setState(140);
				match(NAME);
				setState(141);
				match(T__9);
				setState(142);
				sub_question();
				setState(143);
				match(NEWLINE);
				}
				break;
			case 4:
				_localctx = new AddAllContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(145);
				match(T__8);
				setState(146);
				match(NAME);
				setState(147);
				match(T__9);
				setState(148);
				match(T__10);
				setState(149);
				match(NEWLINE);
				}
				break;
			case 5:
				_localctx = new AddQuestion2GroupContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(150);
				match(T__8);
				setState(151);
				sub_question();
				setState(152);
				match(T__9);
				setState(153);
				match(T__11);
				setState(154);
				sub_groups();
				setState(155);
				match(NEWLINE);
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
		public List<TerminalNode> NAME() { return getTokens(quizParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(quizParser.NAME, i);
		}
		public Sub_questionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sub_question; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).enterSub_question(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).exitSub_question(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof quizVisitor ) return ((quizVisitor<? extends T>)visitor).visitSub_question(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sub_questionContext sub_question() throws RecognitionException {
		Sub_questionContext _localctx = new Sub_questionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_sub_question);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(NAME);
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(160);
				match(T__7);
				setState(161);
				match(NAME);
				}
				}
				setState(166);
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

	public static class Sub_groupsContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(quizParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(quizParser.NAME, i);
		}
		public Sub_groupsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sub_groups; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).enterSub_groups(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).exitSub_groups(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof quizVisitor ) return ((quizVisitor<? extends T>)visitor).visitSub_groups(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sub_groupsContext sub_groups() throws RecognitionException {
		Sub_groupsContext _localctx = new Sub_groupsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_sub_groups);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(NAME);
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
		public TerminalNode STRING() { return getToken(quizParser.STRING, 0); }
		public TerminalNode NAME() { return getToken(quizParser.NAME, 0); }
		public LoadBancoContext(LoadContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).enterLoadBanco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).exitLoadBanco(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof quizVisitor ) return ((quizVisitor<? extends T>)visitor).visitLoadBanco(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoadContext load() throws RecognitionException {
		LoadContext _localctx = new LoadContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_load);
		try {
			_localctx = new LoadBancoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(T__12);
			setState(176);
			match(STRING);
			setState(177);
			match(T__13);
			setState(178);
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
		public List<TerminalNode> NAME() { return getTokens(quizParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(quizParser.NAME, i);
		}
		public EliminarContext(RemoveContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).enterEliminar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).exitEliminar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof quizVisitor ) return ((quizVisitor<? extends T>)visitor).visitEliminar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RemoveContext remove() throws RecognitionException {
		RemoveContext _localctx = new RemoveContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_remove);
		try {
			_localctx = new EliminarContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(T__14);
			setState(181);
			match(NAME);
			setState(182);
			match(T__15);
			setState(183);
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
		public TerminalNode NAME() { return getToken(quizParser.NAME, 0); }
		public Sub_questionContext sub_question() {
			return getRuleContext(Sub_questionContext.class,0);
		}
		public DefinirRespostaContext(DefineAnswerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).enterDefinirResposta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).exitDefinirResposta(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof quizVisitor ) return ((quizVisitor<? extends T>)visitor).visitDefinirResposta(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefineAnswerContext defineAnswer() throws RecognitionException {
		DefineAnswerContext _localctx = new DefineAnswerContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_defineAnswer);
		try {
			_localctx = new DefinirRespostaContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(T__16);
			setState(186);
			match(NAME);
			setState(187);
			match(T__9);
			setState(188);
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
	public static class DefinirCotacaoMudaPerguntaContext extends DefineMarkContext {
		public MarkContext mark() {
			return getRuleContext(MarkContext.class,0);
		}
		public List<TerminalNode> NAME() { return getTokens(quizParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(quizParser.NAME, i);
		}
		public TerminalNode NEWLINE() { return getToken(quizParser.NEWLINE, 0); }
		public DefinirCotacaoMudaPerguntaContext(DefineMarkContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).enterDefinirCotacaoMudaPergunta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).exitDefinirCotacaoMudaPergunta(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof quizVisitor ) return ((quizVisitor<? extends T>)visitor).visitDefinirCotacaoMudaPergunta(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DefinirCotacaoSemDescontoContext extends DefineMarkContext {
		public MarkContext mark() {
			return getRuleContext(MarkContext.class,0);
		}
		public TerminalNode NAME() { return getToken(quizParser.NAME, 0); }
		public TerminalNode NEWLINE() { return getToken(quizParser.NEWLINE, 0); }
		public DefinirCotacaoSemDescontoContext(DefineMarkContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).enterDefinirCotacaoSemDesconto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).exitDefinirCotacaoSemDesconto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof quizVisitor ) return ((quizVisitor<? extends T>)visitor).visitDefinirCotacaoSemDesconto(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DefinirCotacaoDescontarContext extends DefineMarkContext {
		public List<MarkContext> mark() {
			return getRuleContexts(MarkContext.class);
		}
		public MarkContext mark(int i) {
			return getRuleContext(MarkContext.class,i);
		}
		public TerminalNode NAME() { return getToken(quizParser.NAME, 0); }
		public TerminalNode NUMBER() { return getToken(quizParser.NUMBER, 0); }
		public TerminalNode NEWLINE() { return getToken(quizParser.NEWLINE, 0); }
		public DefinirCotacaoDescontarContext(DefineMarkContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).enterDefinirCotacaoDescontar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).exitDefinirCotacaoDescontar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof quizVisitor ) return ((quizVisitor<? extends T>)visitor).visitDefinirCotacaoDescontar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefineMarkContext defineMark() throws RecognitionException {
		DefineMarkContext _localctx = new DefineMarkContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_defineMark);
		try {
			setState(220);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new DefinirCotacaoSemDescontoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(190);
				match(T__17);
				setState(191);
				mark();
				setState(192);
				match(T__9);
				setState(193);
				match(NAME);
				setState(194);
				match(NEWLINE);
				}
				break;
			case 2:
				_localctx = new DefinirCotacaoMudaPerguntaContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(196);
				match(T__17);
				setState(197);
				mark();
				setState(198);
				match(T__9);
				setState(199);
				match(NAME);
				setState(200);
				match(T__18);
				setState(201);
				match(T__19);
				setState(202);
				match(T__20);
				setState(203);
				match(NAME);
				setState(204);
				match(NEWLINE);
				}
				break;
			case 3:
				_localctx = new DefinirCotacaoDescontarContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(206);
				match(T__17);
				setState(207);
				mark();
				setState(208);
				match(T__9);
				setState(209);
				match(NAME);
				setState(210);
				match(T__18);
				setState(211);
				match(T__19);
				setState(212);
				match(T__21);
				setState(213);
				match(NUMBER);
				setState(214);
				match(T__22);
				setState(215);
				match(T__23);
				setState(216);
				match(T__2);
				setState(217);
				mark();
				setState(218);
				match(NEWLINE);
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

	public static class MarkContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(quizParser.FLOAT, 0); }
		public TerminalNode NUMBER() { return getToken(quizParser.NUMBER, 0); }
		public MarkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mark; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).enterMark(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).exitMark(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof quizVisitor ) return ((quizVisitor<? extends T>)visitor).visitMark(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MarkContext mark() throws RecognitionException {
		MarkContext _localctx = new MarkContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_mark);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			_la = _input.LA(1);
			if ( !(_la==NUMBER || _la==FLOAT) ) {
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

	public static class ShowGroupContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(quizParser.NAME, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(quizParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(quizParser.NEWLINE, i);
		}
		public List<ShowOptContext> showOpt() {
			return getRuleContexts(ShowOptContext.class);
		}
		public ShowOptContext showOpt(int i) {
			return getRuleContext(ShowOptContext.class,i);
		}
		public ShowGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).enterShowGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).exitShowGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof quizVisitor ) return ((quizVisitor<? extends T>)visitor).visitShowGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShowGroupContext showGroup() throws RecognitionException {
		ShowGroupContext _localctx = new ShowGroupContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_showGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(T__20);
			setState(225);
			match(T__11);
			setState(226);
			match(NAME);
			setState(227);
			match(T__24);
			setState(229);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(228);
				match(NEWLINE);
				}
				break;
			}
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__20) | (1L << T__37) | (1L << T__38))) != 0)) {
				{
				{
				setState(231);
				showOpt();
				}
				}
				setState(236);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(237);
				match(NEWLINE);
				}
			}

			setState(240);
			match(T__25);
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

	public static class ShowOptContext extends ParserRuleContext {
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
		public ShowOptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showOpt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).enterShowOpt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).exitShowOpt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof quizVisitor ) return ((quizVisitor<? extends T>)visitor).visitShowOpt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShowOptContext showOpt() throws RecognitionException {
		ShowOptContext _localctx = new ShowOptContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_showOpt);
		try {
			setState(247);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(242);
				show();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(243);
				shuffle();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(244);
				getAnswer();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(245);
				getChoice();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(246);
				getAnswerToChoice();
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
		public TerminalNode NAME() { return getToken(quizParser.NAME, 0); }
		public TerminalNode NEWLINE() { return getToken(quizParser.NEWLINE, 0); }
		public List<DefineMarkContext> defineMark() {
			return getRuleContexts(DefineMarkContext.class);
		}
		public DefineMarkContext defineMark(int i) {
			return getRuleContext(DefineMarkContext.class,i);
		}
		public AvaliarContext(EvaluationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).enterAvaliar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).exitAvaliar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof quizVisitor ) return ((quizVisitor<? extends T>)visitor).visitAvaliar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EvaluationContext evaluation() throws RecognitionException {
		EvaluationContext _localctx = new EvaluationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_evaluation);
		int _la;
		try {
			_localctx = new AvaliarContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(T__26);
			setState(250);
			match(T__11);
			setState(251);
			match(NAME);
			setState(252);
			match(T__24);
			setState(253);
			match(NEWLINE);
			setState(257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__17) {
				{
				{
				setState(254);
				defineMark();
				}
				}
				setState(259);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(260);
			match(T__25);
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
		public TerminalNode NAME() { return getToken(quizParser.NAME, 0); }
		public TitleContext title() {
			return getRuleContext(TitleContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(quizParser.NEWLINE, 0); }
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
			if ( listener instanceof quizListener ) ((quizListener)listener).enterMultichoice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).exitMultichoice(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof quizVisitor ) return ((quizVisitor<? extends T>)visitor).visitMultichoice(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultichoiceContext multichoice() throws RecognitionException {
		MultichoiceContext _localctx = new MultichoiceContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_multichoice);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(T__27);
			setState(263);
			match(T__28);
			setState(264);
			match(T__2);
			setState(265);
			match(NAME);
			setState(266);
			match(T__29);
			setState(267);
			match(T__2);
			setState(268);
			title();
			setState(269);
			match(T__24);
			setState(270);
			match(NEWLINE);
			setState(272); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(271);
				multichoiceoption();
				}
				}
				setState(274); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__30 );
			setState(276);
			match(T__25);
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
		public TerminalNode NAME() { return getToken(quizParser.NAME, 0); }
		public TerminalNode STRING() { return getToken(quizParser.STRING, 0); }
		public TerminalNode NEWLINE() { return getToken(quizParser.NEWLINE, 0); }
		public MultichoiceoptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multichoiceoption; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).enterMultichoiceoption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).exitMultichoiceoption(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof quizVisitor ) return ((quizVisitor<? extends T>)visitor).visitMultichoiceoption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultichoiceoptionContext multichoiceoption() throws RecognitionException {
		MultichoiceoptionContext _localctx = new MultichoiceoptionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_multichoiceoption);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			match(T__30);
			setState(279);
			match(T__28);
			setState(280);
			match(T__2);
			setState(281);
			match(NAME);
			setState(282);
			match(T__29);
			setState(283);
			match(T__2);
			setState(284);
			match(STRING);
			setState(285);
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

	public static class MatchingContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(quizParser.NAME, 0); }
		public TitleContext title() {
			return getRuleContext(TitleContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(quizParser.NEWLINE, 0); }
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
			if ( listener instanceof quizListener ) ((quizListener)listener).enterMatching(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).exitMatching(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof quizVisitor ) return ((quizVisitor<? extends T>)visitor).visitMatching(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchingContext matching() throws RecognitionException {
		MatchingContext _localctx = new MatchingContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_matching);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			match(T__31);
			setState(288);
			match(T__28);
			setState(289);
			match(T__2);
			setState(290);
			match(NAME);
			setState(291);
			match(T__29);
			setState(292);
			match(T__2);
			setState(293);
			title();
			setState(294);
			match(T__24);
			setState(295);
			match(NEWLINE);
			setState(297); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(296);
				matchingoption();
				}
				}
				setState(299); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__30 );
			setState(301);
			match(T__25);
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
		public TerminalNode NAME() { return getToken(quizParser.NAME, 0); }
		public TitleContext title() {
			return getRuleContext(TitleContext.class,0);
		}
		public TerminalNode CORRECT() { return getToken(quizParser.CORRECT, 0); }
		public TerminalNode NEWLINE() { return getToken(quizParser.NEWLINE, 0); }
		public MatchContext match() {
			return getRuleContext(MatchContext.class,0);
		}
		public MatchingoptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchingoption; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).enterMatchingoption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).exitMatchingoption(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof quizVisitor ) return ((quizVisitor<? extends T>)visitor).visitMatchingoption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchingoptionContext matchingoption() throws RecognitionException {
		MatchingoptionContext _localctx = new MatchingoptionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_matchingoption);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			match(T__30);
			setState(304);
			match(T__28);
			setState(305);
			match(T__2);
			setState(306);
			match(NAME);
			setState(307);
			match(T__29);
			setState(308);
			match(T__2);
			setState(309);
			title();
			setState(310);
			match(T__32);
			setState(311);
			match(T__2);
			setState(312);
			match(CORRECT);
			setState(316);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__33) {
				{
				setState(313);
				match(T__33);
				setState(314);
				match(T__2);
				setState(315);
				match();
				}
			}

			setState(318);
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
		public TerminalNode NAME() { return getToken(quizParser.NAME, 0); }
		public MatchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_match; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).enterMatch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).exitMatch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof quizVisitor ) return ((quizVisitor<? extends T>)visitor).visitMatch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchContext match() throws RecognitionException {
		MatchContext _localctx = new MatchContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_match);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
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

	public static class Import_exprContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(quizParser.NAME, 0); }
		public PlistContext plist() {
			return getRuleContext(PlistContext.class,0);
		}
		public Import_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).enterImport_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).exitImport_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof quizVisitor ) return ((quizVisitor<? extends T>)visitor).visitImport_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_exprContext import_expr() throws RecognitionException {
		Import_exprContext _localctx = new Import_exprContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_import_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			match(T__15);
			setState(323);
			match(NAME);
			setState(324);
			match(T__34);
			setState(325);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).enterPlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).exitPlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof quizVisitor ) return ((quizVisitor<? extends T>)visitor).visitPlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PlistContext plist() throws RecognitionException {
		PlistContext _localctx = new PlistContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_plist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			p();
			setState(332);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(328);
				match(T__7);
				setState(329);
				p();
				}
				}
				setState(334);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).enterP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).exitP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof quizVisitor ) return ((quizVisitor<? extends T>)visitor).visitP(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PContext p() throws RecognitionException {
		PContext _localctx = new PContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_p);
		try {
			setState(339);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(335);
				match(NAME);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(336);
				match(NAME);
				setState(337);
				match(T__13);
				setState(338);
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
		public List<QuestionContext> question() {
			return getRuleContexts(QuestionContext.class);
		}
		public QuestionContext question(int i) {
			return getRuleContext(QuestionContext.class,i);
		}
		public TerminalNode NEWLINE() { return getToken(quizParser.NEWLINE, 0); }
		public ShowQuestionMultiOptandQuestionContext(ShowContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).enterShowQuestionMultiOptandQuestion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).exitShowQuestionMultiOptandQuestion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof quizVisitor ) return ((quizVisitor<? extends T>)visitor).visitShowQuestionMultiOptandQuestion(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowQuestionMultiOptContext extends ShowContext {
		public TerminalNode NAME() { return getToken(quizParser.NAME, 0); }
		public Ques_optContext ques_opt() {
			return getRuleContext(Ques_optContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(quizParser.NEWLINE, 0); }
		public ShowQuestionMultiOptContext(ShowContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).enterShowQuestionMultiOpt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).exitShowQuestionMultiOpt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof quizVisitor ) return ((quizVisitor<? extends T>)visitor).visitShowQuestionMultiOpt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowQuestionBasicContext extends ShowContext {
		public TerminalNode NAME() { return getToken(quizParser.NAME, 0); }
		public TerminalNode NEWLINE() { return getToken(quizParser.NEWLINE, 0); }
		public ShowQuestionBasicContext(ShowContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).enterShowQuestionBasic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).exitShowQuestionBasic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof quizVisitor ) return ((quizVisitor<? extends T>)visitor).visitShowQuestionBasic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShowContext show() throws RecognitionException {
		ShowContext _localctx = new ShowContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_show);
		int _la;
		try {
			setState(360);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				_localctx = new ShowQuestionBasicContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(341);
				match(T__20);
				setState(342);
				match(NAME);
				setState(343);
				match(NEWLINE);
				}
				break;
			case 2:
				_localctx = new ShowQuestionMultiOptContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(344);
				match(T__20);
				setState(345);
				match(NAME);
				setState(346);
				ques_opt();
				setState(347);
				match(NEWLINE);
				}
				break;
			case 3:
				_localctx = new ShowQuestionMultiOptandQuestionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(349);
				match(T__20);
				setState(350);
				question();
				setState(355);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__35) {
					{
					{
					setState(351);
					match(T__35);
					setState(352);
					question();
					}
					}
					setState(357);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(358);
				match(NEWLINE);
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

	public static class QuestionContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(quizParser.NAME, 0); }
		public Ques_optContext ques_opt() {
			return getRuleContext(Ques_optContext.class,0);
		}
		public QuestionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_question; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).enterQuestion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).exitQuestion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof quizVisitor ) return ((quizVisitor<? extends T>)visitor).visitQuestion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuestionContext question() throws RecognitionException {
		QuestionContext _localctx = new QuestionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_question);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			match(NAME);
			setState(364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__36) {
				{
				setState(363);
				ques_opt();
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

	public static class Ques_optContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(quizParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(quizParser.NAME, i);
		}
		public Ques_optContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ques_opt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).enterQues_opt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).exitQues_opt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof quizVisitor ) return ((quizVisitor<? extends T>)visitor).visitQues_opt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ques_optContext ques_opt() throws RecognitionException {
		Ques_optContext _localctx = new Ques_optContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_ques_opt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(366);
			match(T__36);
			setState(367);
			match(NAME);
			setState(372);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(368);
				match(T__7);
				setState(369);
				match(NAME);
				}
				}
				setState(374);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
		public TerminalNode NAME() { return getToken(quizParser.NAME, 0); }
		public TerminalNode NEWLINE() { return getToken(quizParser.NEWLINE, 0); }
		public ShuffleQuestionContext(ShuffleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).enterShuffleQuestion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).exitShuffleQuestion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof quizVisitor ) return ((quizVisitor<? extends T>)visitor).visitShuffleQuestion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShuffleContext shuffle() throws RecognitionException {
		ShuffleContext _localctx = new ShuffleContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_shuffle);
		try {
			_localctx = new ShuffleQuestionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			match(T__37);
			setState(376);
			match(NAME);
			setState(377);
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
		public TerminalNode NAME() { return getToken(quizParser.NAME, 0); }
		public TerminalNode NEWLINE() { return getToken(quizParser.NEWLINE, 0); }
		public GetAnswerNumContext(GetAnswerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).enterGetAnswerNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).exitGetAnswerNum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof quizVisitor ) return ((quizVisitor<? extends T>)visitor).visitGetAnswerNum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GetAnswerContext getAnswer() throws RecognitionException {
		GetAnswerContext _localctx = new GetAnswerContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_getAnswer);
		try {
			_localctx = new GetAnswerNumContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			match(T__38);
			setState(380);
			match(T__39);
			setState(381);
			match(T__9);
			setState(382);
			match(NAME);
			setState(383);
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

	public static class GetChoiceContext extends ParserRuleContext {
		public List<QuestionContext> question() {
			return getRuleContexts(QuestionContext.class);
		}
		public QuestionContext question(int i) {
			return getRuleContext(QuestionContext.class,i);
		}
		public GetChoiceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getChoice; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).enterGetChoice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).exitGetChoice(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof quizVisitor ) return ((quizVisitor<? extends T>)visitor).visitGetChoice(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GetChoiceContext getChoice() throws RecognitionException {
		GetChoiceContext _localctx = new GetChoiceContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_getChoice);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			match(T__38);
			setState(386);
			match(T__40);
			setState(387);
			question();
			setState(388);
			match(T__35);
			setState(389);
			question();
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
		public GetAnswerToChoiceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getAnswerToChoice; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).enterGetAnswerToChoice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).exitGetAnswerToChoice(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof quizVisitor ) return ((quizVisitor<? extends T>)visitor).visitGetAnswerToChoice(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GetAnswerToChoiceContext getAnswerToChoice() throws RecognitionException {
		GetAnswerToChoiceContext _localctx = new GetAnswerToChoiceContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_getAnswerToChoice);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			match(T__38);
			setState(392);
			match(T__39);
			setState(393);
			match(T__9);
			setState(394);
			match(T__40);
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
		public TerminalNode NAME() { return getToken(quizParser.NAME, 0); }
		public List<TerminalNode> STRING() { return getTokens(quizParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(quizParser.STRING, i);
		}
		public TerminalNode NEWLINE() { return getToken(quizParser.NEWLINE, 0); }
		public RespostaCurtaContext(ShortQuestionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).enterRespostaCurta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).exitRespostaCurta(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof quizVisitor ) return ((quizVisitor<? extends T>)visitor).visitRespostaCurta(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShortQuestionContext shortQuestion() throws RecognitionException {
		ShortQuestionContext _localctx = new ShortQuestionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_shortQuestion);
		int _la;
		try {
			_localctx = new RespostaCurtaContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			match(T__41);
			setState(397);
			match(T__28);
			setState(398);
			match(T__2);
			setState(399);
			match(NAME);
			setState(400);
			match(T__29);
			setState(401);
			match(T__2);
			setState(402);
			match(STRING);
			setState(415);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__39) {
				{
				setState(403);
				match(T__39);
				setState(404);
				match(T__2);
				setState(405);
				match(STRING);
				setState(412);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(406);
					match(T__7);
					setState(407);
					match(T__39);
					setState(408);
					match(T__2);
					setState(409);
					match(STRING);
					}
					}
					setState(414);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(417);
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
		public TerminalNode NAME() { return getToken(quizParser.NAME, 0); }
		public TitleContext title() {
			return getRuleContext(TitleContext.class,0);
		}
		public MarkContext mark() {
			return getRuleContext(MarkContext.class,0);
		}
		public NumericQuestionContext(NumericContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).enterNumericQuestion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).exitNumericQuestion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof quizVisitor ) return ((quizVisitor<? extends T>)visitor).visitNumericQuestion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumericContext numeric() throws RecognitionException {
		NumericContext _localctx = new NumericContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_numeric);
		int _la;
		try {
			_localctx = new NumericQuestionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			match(T__42);
			setState(420);
			match(T__28);
			setState(421);
			match(T__2);
			setState(422);
			match(NAME);
			setState(423);
			match(T__29);
			setState(424);
			match(T__2);
			setState(425);
			title();
			setState(429);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__39) {
				{
				setState(426);
				match(T__39);
				setState(427);
				match(T__2);
				setState(428);
				mark();
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
		public TerminalNode NAME() { return getToken(quizParser.NAME, 0); }
		public TerminalNode STRING() { return getToken(quizParser.STRING, 0); }
		public EssayQuestionContext(EssayContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).enterEssayQuestion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).exitEssayQuestion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof quizVisitor ) return ((quizVisitor<? extends T>)visitor).visitEssayQuestion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EssayContext essay() throws RecognitionException {
		EssayContext _localctx = new EssayContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_essay);
		try {
			_localctx = new EssayQuestionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
			match(T__43);
			setState(432);
			match(T__28);
			setState(433);
			match(T__2);
			setState(434);
			match(NAME);
			setState(435);
			match(T__29);
			setState(436);
			match(T__2);
			setState(437);
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

	public static class OptionContext extends ParserRuleContext {
		public OptionMultContext optionMult() {
			return getRuleContext(OptionMultContext.class,0);
		}
		public OptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).enterOption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).exitOption(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof quizVisitor ) return ((quizVisitor<? extends T>)visitor).visitOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptionContext option() throws RecognitionException {
		OptionContext _localctx = new OptionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_option);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439);
			optionMult();
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

	public static class OptionMultContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(quizParser.NAME, 0); }
		public TerminalNode STRING() { return getToken(quizParser.STRING, 0); }
		public TerminalNode NEWLINE() { return getToken(quizParser.NEWLINE, 0); }
		public OptionMultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionMult; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).enterOptionMult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).exitOptionMult(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof quizVisitor ) return ((quizVisitor<? extends T>)visitor).visitOptionMult(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptionMultContext optionMult() throws RecognitionException {
		OptionMultContext _localctx = new OptionMultContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_optionMult);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			match(T__44);
			setState(442);
			match(T__28);
			setState(443);
			match(T__2);
			setState(444);
			match(NAME);
			setState(445);
			match(T__29);
			setState(446);
			match(T__2);
			setState(447);
			match(STRING);
			setState(448);
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

	public static class FinishQuizContext extends ParserRuleContext {
		public FinishQuizContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finishQuiz; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).enterFinishQuiz(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).exitFinishQuiz(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof quizVisitor ) return ((quizVisitor<? extends T>)visitor).visitFinishQuiz(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FinishQuizContext finishQuiz() throws RecognitionException {
		FinishQuizContext _localctx = new FinishQuizContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_finishQuiz);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
			match(T__45);
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
		public TerminalNode STRING() { return getToken(quizParser.STRING, 0); }
		public TitleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_title; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).enterTitle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof quizListener ) ((quizListener)listener).exitTitle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof quizVisitor ) return ((quizVisitor<? extends T>)visitor).visitTitle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TitleContext title() throws RecognitionException {
		TitleContext _localctx = new TitleContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_title);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(452);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\39\u01c9\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\7\2P\n\2\f\2\16\2S\13"+
		"\2\3\2\3\2\3\3\7\3X\n\3\f\3\16\3[\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4p\n\4\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\5\5|\n\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\7\7\u0088\n\7\f\7\16\7\u008b\13\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00a0\n\7\3\b\3\b\3\b"+
		"\7\b\u00a5\n\b\f\b\16\b\u00a8\13\b\3\t\3\t\3\t\7\t\u00ad\n\t\f\t\16\t"+
		"\u00b0\13\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3"+
		"\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00df\n\r"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\17\5\17\u00e8\n\17\3\17\7\17\u00eb\n"+
		"\17\f\17\16\17\u00ee\13\17\3\17\5\17\u00f1\n\17\3\17\3\17\3\20\3\20\3"+
		"\20\3\20\3\20\5\20\u00fa\n\20\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u0102"+
		"\n\21\f\21\16\21\u0105\13\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\6\22\u0113\n\22\r\22\16\22\u0114\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\6\24\u012c\n\24\r\24\16\24\u012d\3\24\3\24\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u013f\n\25"+
		"\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\7\30\u014d"+
		"\n\30\f\30\16\30\u0150\13\30\3\31\3\31\3\31\3\31\5\31\u0156\n\31\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u0164\n\32"+
		"\f\32\16\32\u0167\13\32\3\32\3\32\5\32\u016b\n\32\3\33\3\33\5\33\u016f"+
		"\n\33\3\34\3\34\3\34\3\34\7\34\u0175\n\34\f\34\16\34\u0178\13\34\3\35"+
		"\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\7!\u019d"+
		"\n!\f!\16!\u01a0\13!\5!\u01a2\n!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\3\"\3\"\5\"\u01b0\n\"\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3%\3%\3%\3%\3%\3"+
		"%\3%\3%\3%\3&\3&\3\'\3\'\3\'\2\2(\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\668:<>@BDFHJL\2\3\3\2\62\63\2\u01d3\2Q\3\2\2\2\4"+
		"Y\3\2\2\2\6o\3\2\2\2\b{\3\2\2\2\n}\3\2\2\2\f\u009f\3\2\2\2\16\u00a1\3"+
		"\2\2\2\20\u00a9\3\2\2\2\22\u00b1\3\2\2\2\24\u00b6\3\2\2\2\26\u00bb\3\2"+
		"\2\2\30\u00de\3\2\2\2\32\u00e0\3\2\2\2\34\u00e2\3\2\2\2\36\u00f9\3\2\2"+
		"\2 \u00fb\3\2\2\2\"\u0108\3\2\2\2$\u0118\3\2\2\2&\u0121\3\2\2\2(\u0131"+
		"\3\2\2\2*\u0142\3\2\2\2,\u0144\3\2\2\2.\u0149\3\2\2\2\60\u0155\3\2\2\2"+
		"\62\u016a\3\2\2\2\64\u016c\3\2\2\2\66\u0170\3\2\2\28\u0179\3\2\2\2:\u017d"+
		"\3\2\2\2<\u0183\3\2\2\2>\u0189\3\2\2\2@\u018e\3\2\2\2B\u01a5\3\2\2\2D"+
		"\u01b1\3\2\2\2F\u01b9\3\2\2\2H\u01bb\3\2\2\2J\u01c4\3\2\2\2L\u01c6\3\2"+
		"\2\2NP\5\4\3\2ON\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2RT\3\2\2\2SQ\3\2"+
		"\2\2TU\7\2\2\3U\3\3\2\2\2VX\5\6\4\2WV\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3"+
		"\2\2\2Z\\\3\2\2\2[Y\3\2\2\2\\]\7\67\2\2]\5\3\2\2\2^p\5\b\5\2_p\5\f\7\2"+
		"`p\5\"\22\2ap\5&\24\2bp\5 \21\2cp\5\24\13\2dp\5\26\f\2ep\5\34\17\2fp\5"+
		",\27\2gp\5\36\20\2hp\5\22\n\2ip\5@!\2jp\5B\"\2kp\5D#\2lp\5\n\6\2mp\5F"+
		"$\2np\5J&\2o^\3\2\2\2o_\3\2\2\2o`\3\2\2\2oa\3\2\2\2ob\3\2\2\2oc\3\2\2"+
		"\2od\3\2\2\2oe\3\2\2\2of\3\2\2\2og\3\2\2\2oh\3\2\2\2oi\3\2\2\2oj\3\2\2"+
		"\2ok\3\2\2\2ol\3\2\2\2om\3\2\2\2on\3\2\2\2p\7\3\2\2\2qr\7\3\2\2rs\7\4"+
		"\2\2st\7\5\2\2t|\7\65\2\2uv\7\3\2\2vw\7\4\2\2wx\7\5\2\2xy\7\65\2\2yz\7"+
		"\6\2\2z|\7\62\2\2{q\3\2\2\2{u\3\2\2\2|\t\3\2\2\2}~\7\7\2\2~\177\7\b\2"+
		"\2\177\13\3\2\2\2\u0080\u0081\7\t\2\2\u0081\u0082\7\64\2\2\u0082\u00a0"+
		"\7\67\2\2\u0083\u0084\7\t\2\2\u0084\u0089\7\64\2\2\u0085\u0086\7\n\2\2"+
		"\u0086\u0088\7\64\2\2\u0087\u0085\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u0087"+
		"\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008c\3\2\2\2\u008b\u0089\3\2\2\2\u008c"+
		"\u00a0\7\67\2\2\u008d\u008e\7\13\2\2\u008e\u008f\7\64\2\2\u008f\u0090"+
		"\7\f\2\2\u0090\u0091\5\16\b\2\u0091\u0092\7\67\2\2\u0092\u00a0\3\2\2\2"+
		"\u0093\u0094\7\13\2\2\u0094\u0095\7\64\2\2\u0095\u0096\7\f\2\2\u0096\u0097"+
		"\7\r\2\2\u0097\u00a0\7\67\2\2\u0098\u0099\7\13\2\2\u0099\u009a\5\16\b"+
		"\2\u009a\u009b\7\f\2\2\u009b\u009c\7\16\2\2\u009c\u009d\5\20\t\2\u009d"+
		"\u009e\7\67\2\2\u009e\u00a0\3\2\2\2\u009f\u0080\3\2\2\2\u009f\u0083\3"+
		"\2\2\2\u009f\u008d\3\2\2\2\u009f\u0093\3\2\2\2\u009f\u0098\3\2\2\2\u00a0"+
		"\r\3\2\2\2\u00a1\u00a6\7\64\2\2\u00a2\u00a3\7\n\2\2\u00a3\u00a5\7\64\2"+
		"\2\u00a4\u00a2\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7"+
		"\3\2\2\2\u00a7\17\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9\u00ae\7\64\2\2\u00aa"+
		"\u00ab\7\n\2\2\u00ab\u00ad\7\64\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00b0\3"+
		"\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\21\3\2\2\2\u00b0"+
		"\u00ae\3\2\2\2\u00b1\u00b2\7\17\2\2\u00b2\u00b3\7\65\2\2\u00b3\u00b4\7"+
		"\20\2\2\u00b4\u00b5\7\64\2\2\u00b5\23\3\2\2\2\u00b6\u00b7\7\21\2\2\u00b7"+
		"\u00b8\7\64\2\2\u00b8\u00b9\7\22\2\2\u00b9\u00ba\7\64\2\2\u00ba\25\3\2"+
		"\2\2\u00bb\u00bc\7\23\2\2\u00bc\u00bd\7\64\2\2\u00bd\u00be\7\f\2\2\u00be"+
		"\u00bf\5\16\b\2\u00bf\27\3\2\2\2\u00c0\u00c1\7\24\2\2\u00c1\u00c2\5\32"+
		"\16\2\u00c2\u00c3\7\f\2\2\u00c3\u00c4\7\64\2\2\u00c4\u00c5\7\67\2\2\u00c5"+
		"\u00df\3\2\2\2\u00c6\u00c7\7\24\2\2\u00c7\u00c8\5\32\16\2\u00c8\u00c9"+
		"\7\f\2\2\u00c9\u00ca\7\64\2\2\u00ca\u00cb\7\25\2\2\u00cb\u00cc\7\26\2"+
		"\2\u00cc\u00cd\7\27\2\2\u00cd\u00ce\7\64\2\2\u00ce\u00cf\7\67\2\2\u00cf"+
		"\u00df\3\2\2\2\u00d0\u00d1\7\24\2\2\u00d1\u00d2\5\32\16\2\u00d2\u00d3"+
		"\7\f\2\2\u00d3\u00d4\7\64\2\2\u00d4\u00d5\7\25\2\2\u00d5\u00d6\7\26\2"+
		"\2\u00d6\u00d7\7\30\2\2\u00d7\u00d8\7\62\2\2\u00d8\u00d9\7\31\2\2\u00d9"+
		"\u00da\7\32\2\2\u00da\u00db\7\5\2\2\u00db\u00dc\5\32\16\2\u00dc\u00dd"+
		"\7\67\2\2\u00dd\u00df\3\2\2\2\u00de\u00c0\3\2\2\2\u00de\u00c6\3\2\2\2"+
		"\u00de\u00d0\3\2\2\2\u00df\31\3\2\2\2\u00e0\u00e1\t\2\2\2\u00e1\33\3\2"+
		"\2\2\u00e2\u00e3\7\27\2\2\u00e3\u00e4\7\16\2\2\u00e4\u00e5\7\64\2\2\u00e5"+
		"\u00e7\7\33\2\2\u00e6\u00e8\7\67\2\2\u00e7\u00e6\3\2\2\2\u00e7\u00e8\3"+
		"\2\2\2\u00e8\u00ec\3\2\2\2\u00e9\u00eb\5\36\20\2\u00ea\u00e9\3\2\2\2\u00eb"+
		"\u00ee\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00f0\3\2"+
		"\2\2\u00ee\u00ec\3\2\2\2\u00ef\u00f1\7\67\2\2\u00f0\u00ef\3\2\2\2\u00f0"+
		"\u00f1\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f3\7\34\2\2\u00f3\35\3\2\2"+
		"\2\u00f4\u00fa\5\62\32\2\u00f5\u00fa\58\35\2\u00f6\u00fa\5:\36\2\u00f7"+
		"\u00fa\5<\37\2\u00f8\u00fa\5> \2\u00f9\u00f4\3\2\2\2\u00f9\u00f5\3\2\2"+
		"\2\u00f9\u00f6\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00f8\3\2\2\2\u00fa\37"+
		"\3\2\2\2\u00fb\u00fc\7\35\2\2\u00fc\u00fd\7\16\2\2\u00fd\u00fe\7\64\2"+
		"\2\u00fe\u00ff\7\33\2\2\u00ff\u0103\7\67\2\2\u0100\u0102\5\30\r\2\u0101"+
		"\u0100\3\2\2\2\u0102\u0105\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2"+
		"\2\2\u0104\u0106\3\2\2\2\u0105\u0103\3\2\2\2\u0106\u0107\7\34\2\2\u0107"+
		"!\3\2\2\2\u0108\u0109\7\36\2\2\u0109\u010a\7\37\2\2\u010a\u010b\7\5\2"+
		"\2\u010b\u010c\7\64\2\2\u010c\u010d\7 \2\2\u010d\u010e\7\5\2\2\u010e\u010f"+
		"\5L\'\2\u010f\u0110\7\33\2\2\u0110\u0112\7\67\2\2\u0111\u0113\5$\23\2"+
		"\u0112\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0112\3\2\2\2\u0114\u0115"+
		"\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0117\7\34\2\2\u0117#\3\2\2\2\u0118"+
		"\u0119\7!\2\2\u0119\u011a\7\37\2\2\u011a\u011b\7\5\2\2\u011b\u011c\7\64"+
		"\2\2\u011c\u011d\7 \2\2\u011d\u011e\7\5\2\2\u011e\u011f\7\65\2\2\u011f"+
		"\u0120\7\67\2\2\u0120%\3\2\2\2\u0121\u0122\7\"\2\2\u0122\u0123\7\37\2"+
		"\2\u0123\u0124\7\5\2\2\u0124\u0125\7\64\2\2\u0125\u0126\7 \2\2\u0126\u0127"+
		"\7\5\2\2\u0127\u0128\5L\'\2\u0128\u0129\7\33\2\2\u0129\u012b\7\67\2\2"+
		"\u012a\u012c\5(\25\2\u012b\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012b"+
		"\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0130\7\34\2\2"+
		"\u0130\'\3\2\2\2\u0131\u0132\7!\2\2\u0132\u0133\7\37\2\2\u0133\u0134\7"+
		"\5\2\2\u0134\u0135\7\64\2\2\u0135\u0136\7 \2\2\u0136\u0137\7\5\2\2\u0137"+
		"\u0138\5L\'\2\u0138\u0139\7#\2\2\u0139\u013a\7\5\2\2\u013a\u013e\7\61"+
		"\2\2\u013b\u013c\7$\2\2\u013c\u013d\7\5\2\2\u013d\u013f\5*\26\2\u013e"+
		"\u013b\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0141\7\67"+
		"\2\2\u0141)\3\2\2\2\u0142\u0143\7\64\2\2\u0143+\3\2\2\2\u0144\u0145\7"+
		"\22\2\2\u0145\u0146\7\64\2\2\u0146\u0147\7%\2\2\u0147\u0148\5.\30\2\u0148"+
		"-\3\2\2\2\u0149\u014e\5\60\31\2\u014a\u014b\7\n\2\2\u014b\u014d\5\60\31"+
		"\2\u014c\u014a\3\2\2\2\u014d\u0150\3\2\2\2\u014e\u014c\3\2\2\2\u014e\u014f"+
		"\3\2\2\2\u014f/\3\2\2\2\u0150\u014e\3\2\2\2\u0151\u0156\7\64\2\2\u0152"+
		"\u0153\7\64\2\2\u0153\u0154\7\20\2\2\u0154\u0156\7\64\2\2\u0155\u0151"+
		"\3\2\2\2\u0155\u0152\3\2\2\2\u0156\61\3\2\2\2\u0157\u0158\7\27\2\2\u0158"+
		"\u0159\7\64\2\2\u0159\u016b\7\67\2\2\u015a\u015b\7\27\2\2\u015b\u015c"+
		"\7\64\2\2\u015c\u015d\5\66\34\2\u015d\u015e\7\67\2\2\u015e\u016b\3\2\2"+
		"\2\u015f\u0160\7\27\2\2\u0160\u0165\5\64\33\2\u0161\u0162\7&\2\2\u0162"+
		"\u0164\5\64\33\2\u0163\u0161\3\2\2\2\u0164\u0167\3\2\2\2\u0165\u0163\3"+
		"\2\2\2\u0165\u0166\3\2\2\2\u0166\u0168\3\2\2\2\u0167\u0165\3\2\2\2\u0168"+
		"\u0169\7\67\2\2\u0169\u016b\3\2\2\2\u016a\u0157\3\2\2\2\u016a\u015a\3"+
		"\2\2\2\u016a\u015f\3\2\2\2\u016b\63\3\2\2\2\u016c\u016e\7\64\2\2\u016d"+
		"\u016f\5\66\34\2\u016e\u016d\3\2\2\2\u016e\u016f\3\2\2\2\u016f\65\3\2"+
		"\2\2\u0170\u0171\7\'\2\2\u0171\u0176\7\64\2\2\u0172\u0173\7\n\2\2\u0173"+
		"\u0175\7\64\2\2\u0174\u0172\3\2\2\2\u0175\u0178\3\2\2\2\u0176\u0174\3"+
		"\2\2\2\u0176\u0177\3\2\2\2\u0177\67\3\2\2\2\u0178\u0176\3\2\2\2\u0179"+
		"\u017a\7(\2\2\u017a\u017b\7\64\2\2\u017b\u017c\7\67\2\2\u017c9\3\2\2\2"+
		"\u017d\u017e\7)\2\2\u017e\u017f\7*\2\2\u017f\u0180\7\f\2\2\u0180\u0181"+
		"\7\64\2\2\u0181\u0182\7\67\2\2\u0182;\3\2\2\2\u0183\u0184\7)\2\2\u0184"+
		"\u0185\7+\2\2\u0185\u0186\5\64\33\2\u0186\u0187\7&\2\2\u0187\u0188\5\64"+
		"\33\2\u0188=\3\2\2\2\u0189\u018a\7)\2\2\u018a\u018b\7*\2\2\u018b\u018c"+
		"\7\f\2\2\u018c\u018d\7+\2\2\u018d?\3\2\2\2\u018e\u018f\7,\2\2\u018f\u0190"+
		"\7\37\2\2\u0190\u0191\7\5\2\2\u0191\u0192\7\64\2\2\u0192\u0193\7 \2\2"+
		"\u0193\u0194\7\5\2\2\u0194\u01a1\7\65\2\2\u0195\u0196\7*\2\2\u0196\u0197"+
		"\7\5\2\2\u0197\u019e\7\65\2\2\u0198\u0199\7\n\2\2\u0199\u019a\7*\2\2\u019a"+
		"\u019b\7\5\2\2\u019b\u019d\7\65\2\2\u019c\u0198\3\2\2\2\u019d\u01a0\3"+
		"\2\2\2\u019e\u019c\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u01a2\3\2\2\2\u01a0"+
		"\u019e\3\2\2\2\u01a1\u0195\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a3\3\2"+
		"\2\2\u01a3\u01a4\7\67\2\2\u01a4A\3\2\2\2\u01a5\u01a6\7-\2\2\u01a6\u01a7"+
		"\7\37\2\2\u01a7\u01a8\7\5\2\2\u01a8\u01a9\7\64\2\2\u01a9\u01aa\7 \2\2"+
		"\u01aa\u01ab\7\5\2\2\u01ab\u01af\5L\'\2\u01ac\u01ad\7*\2\2\u01ad\u01ae"+
		"\7\5\2\2\u01ae\u01b0\5\32\16\2\u01af\u01ac\3\2\2\2\u01af\u01b0\3\2\2\2"+
		"\u01b0C\3\2\2\2\u01b1\u01b2\7.\2\2\u01b2\u01b3\7\37\2\2\u01b3\u01b4\7"+
		"\5\2\2\u01b4\u01b5\7\64\2\2\u01b5\u01b6\7 \2\2\u01b6\u01b7\7\5\2\2\u01b7"+
		"\u01b8\7\65\2\2\u01b8E\3\2\2\2\u01b9\u01ba\5H%\2\u01baG\3\2\2\2\u01bb"+
		"\u01bc\7/\2\2\u01bc\u01bd\7\37\2\2\u01bd\u01be\7\5\2\2\u01be\u01bf\7\64"+
		"\2\2\u01bf\u01c0\7 \2\2\u01c0\u01c1\7\5\2\2\u01c1\u01c2\7\65\2\2\u01c2"+
		"\u01c3\7\67\2\2\u01c3I\3\2\2\2\u01c4\u01c5\7\60\2\2\u01c5K\3\2\2\2\u01c6"+
		"\u01c7\7\65\2\2\u01c7M\3\2\2\2\34QYo{\u0089\u009f\u00a6\u00ae\u00de\u00e7"+
		"\u00ec\u00f0\u00f9\u0103\u0114\u012d\u013e\u014e\u0155\u0165\u016a\u016e"+
		"\u0176\u019e\u01a1\u01af";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}