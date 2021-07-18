// Generated from quiz.g4 by ANTLR 4.9.2

    package Quiz;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link quizParser}.
 */
public interface quizListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link quizParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(quizParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link quizParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(quizParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link quizParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(quizParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link quizParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(quizParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link quizParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(quizParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link quizParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(quizParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CreateQuiz}
	 * labeled alternative in {@link quizParser#quiz}.
	 * @param ctx the parse tree
	 */
	void enterCreateQuiz(quizParser.CreateQuizContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CreateQuiz}
	 * labeled alternative in {@link quizParser#quiz}.
	 * @param ctx the parse tree
	 */
	void exitCreateQuiz(quizParser.CreateQuizContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CreateQuizCorrection}
	 * labeled alternative in {@link quizParser#quiz}.
	 * @param ctx the parse tree
	 */
	void enterCreateQuizCorrection(quizParser.CreateQuizCorrectionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CreateQuizCorrection}
	 * labeled alternative in {@link quizParser#quiz}.
	 * @param ctx the parse tree
	 */
	void exitCreateQuizCorrection(quizParser.CreateQuizCorrectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link quizParser#createReport}.
	 * @param ctx the parse tree
	 */
	void enterCreateReport(quizParser.CreateReportContext ctx);
	/**
	 * Exit a parse tree produced by {@link quizParser#createReport}.
	 * @param ctx the parse tree
	 */
	void exitCreateReport(quizParser.CreateReportContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CreateGroup}
	 * labeled alternative in {@link quizParser#add}.
	 * @param ctx the parse tree
	 */
	void enterCreateGroup(quizParser.CreateGroupContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CreateGroup}
	 * labeled alternative in {@link quizParser#add}.
	 * @param ctx the parse tree
	 */
	void exitCreateGroup(quizParser.CreateGroupContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CreateMultiGroup}
	 * labeled alternative in {@link quizParser#add}.
	 * @param ctx the parse tree
	 */
	void enterCreateMultiGroup(quizParser.CreateMultiGroupContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CreateMultiGroup}
	 * labeled alternative in {@link quizParser#add}.
	 * @param ctx the parse tree
	 */
	void exitCreateMultiGroup(quizParser.CreateMultiGroupContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddOption}
	 * labeled alternative in {@link quizParser#add}.
	 * @param ctx the parse tree
	 */
	void enterAddOption(quizParser.AddOptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddOption}
	 * labeled alternative in {@link quizParser#add}.
	 * @param ctx the parse tree
	 */
	void exitAddOption(quizParser.AddOptionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddAll}
	 * labeled alternative in {@link quizParser#add}.
	 * @param ctx the parse tree
	 */
	void enterAddAll(quizParser.AddAllContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddAll}
	 * labeled alternative in {@link quizParser#add}.
	 * @param ctx the parse tree
	 */
	void exitAddAll(quizParser.AddAllContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddQuestion2Group}
	 * labeled alternative in {@link quizParser#add}.
	 * @param ctx the parse tree
	 */
	void enterAddQuestion2Group(quizParser.AddQuestion2GroupContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddQuestion2Group}
	 * labeled alternative in {@link quizParser#add}.
	 * @param ctx the parse tree
	 */
	void exitAddQuestion2Group(quizParser.AddQuestion2GroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link quizParser#sub_question}.
	 * @param ctx the parse tree
	 */
	void enterSub_question(quizParser.Sub_questionContext ctx);
	/**
	 * Exit a parse tree produced by {@link quizParser#sub_question}.
	 * @param ctx the parse tree
	 */
	void exitSub_question(quizParser.Sub_questionContext ctx);
	/**
	 * Enter a parse tree produced by {@link quizParser#sub_groups}.
	 * @param ctx the parse tree
	 */
	void enterSub_groups(quizParser.Sub_groupsContext ctx);
	/**
	 * Exit a parse tree produced by {@link quizParser#sub_groups}.
	 * @param ctx the parse tree
	 */
	void exitSub_groups(quizParser.Sub_groupsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LoadBanco}
	 * labeled alternative in {@link quizParser#load}.
	 * @param ctx the parse tree
	 */
	void enterLoadBanco(quizParser.LoadBancoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LoadBanco}
	 * labeled alternative in {@link quizParser#load}.
	 * @param ctx the parse tree
	 */
	void exitLoadBanco(quizParser.LoadBancoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Eliminar}
	 * labeled alternative in {@link quizParser#remove}.
	 * @param ctx the parse tree
	 */
	void enterEliminar(quizParser.EliminarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Eliminar}
	 * labeled alternative in {@link quizParser#remove}.
	 * @param ctx the parse tree
	 */
	void exitEliminar(quizParser.EliminarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DefinirResposta}
	 * labeled alternative in {@link quizParser#defineAnswer}.
	 * @param ctx the parse tree
	 */
	void enterDefinirResposta(quizParser.DefinirRespostaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DefinirResposta}
	 * labeled alternative in {@link quizParser#defineAnswer}.
	 * @param ctx the parse tree
	 */
	void exitDefinirResposta(quizParser.DefinirRespostaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DefinirCotacaoSemDesconto}
	 * labeled alternative in {@link quizParser#defineMark}.
	 * @param ctx the parse tree
	 */
	void enterDefinirCotacaoSemDesconto(quizParser.DefinirCotacaoSemDescontoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DefinirCotacaoSemDesconto}
	 * labeled alternative in {@link quizParser#defineMark}.
	 * @param ctx the parse tree
	 */
	void exitDefinirCotacaoSemDesconto(quizParser.DefinirCotacaoSemDescontoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DefinirCotacaoMudaPergunta}
	 * labeled alternative in {@link quizParser#defineMark}.
	 * @param ctx the parse tree
	 */
	void enterDefinirCotacaoMudaPergunta(quizParser.DefinirCotacaoMudaPerguntaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DefinirCotacaoMudaPergunta}
	 * labeled alternative in {@link quizParser#defineMark}.
	 * @param ctx the parse tree
	 */
	void exitDefinirCotacaoMudaPergunta(quizParser.DefinirCotacaoMudaPerguntaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DefinirCotacaoDescontar}
	 * labeled alternative in {@link quizParser#defineMark}.
	 * @param ctx the parse tree
	 */
	void enterDefinirCotacaoDescontar(quizParser.DefinirCotacaoDescontarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DefinirCotacaoDescontar}
	 * labeled alternative in {@link quizParser#defineMark}.
	 * @param ctx the parse tree
	 */
	void exitDefinirCotacaoDescontar(quizParser.DefinirCotacaoDescontarContext ctx);
	/**
	 * Enter a parse tree produced by {@link quizParser#mark}.
	 * @param ctx the parse tree
	 */
	void enterMark(quizParser.MarkContext ctx);
	/**
	 * Exit a parse tree produced by {@link quizParser#mark}.
	 * @param ctx the parse tree
	 */
	void exitMark(quizParser.MarkContext ctx);
	/**
	 * Enter a parse tree produced by {@link quizParser#showGroup}.
	 * @param ctx the parse tree
	 */
	void enterShowGroup(quizParser.ShowGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link quizParser#showGroup}.
	 * @param ctx the parse tree
	 */
	void exitShowGroup(quizParser.ShowGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link quizParser#showOpt}.
	 * @param ctx the parse tree
	 */
	void enterShowOpt(quizParser.ShowOptContext ctx);
	/**
	 * Exit a parse tree produced by {@link quizParser#showOpt}.
	 * @param ctx the parse tree
	 */
	void exitShowOpt(quizParser.ShowOptContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Avaliar}
	 * labeled alternative in {@link quizParser#evaluation}.
	 * @param ctx the parse tree
	 */
	void enterAvaliar(quizParser.AvaliarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Avaliar}
	 * labeled alternative in {@link quizParser#evaluation}.
	 * @param ctx the parse tree
	 */
	void exitAvaliar(quizParser.AvaliarContext ctx);
	/**
	 * Enter a parse tree produced by {@link quizParser#multichoice}.
	 * @param ctx the parse tree
	 */
	void enterMultichoice(quizParser.MultichoiceContext ctx);
	/**
	 * Exit a parse tree produced by {@link quizParser#multichoice}.
	 * @param ctx the parse tree
	 */
	void exitMultichoice(quizParser.MultichoiceContext ctx);
	/**
	 * Enter a parse tree produced by {@link quizParser#multichoiceoption}.
	 * @param ctx the parse tree
	 */
	void enterMultichoiceoption(quizParser.MultichoiceoptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link quizParser#multichoiceoption}.
	 * @param ctx the parse tree
	 */
	void exitMultichoiceoption(quizParser.MultichoiceoptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link quizParser#matching}.
	 * @param ctx the parse tree
	 */
	void enterMatching(quizParser.MatchingContext ctx);
	/**
	 * Exit a parse tree produced by {@link quizParser#matching}.
	 * @param ctx the parse tree
	 */
	void exitMatching(quizParser.MatchingContext ctx);
	/**
	 * Enter a parse tree produced by {@link quizParser#matchingoption}.
	 * @param ctx the parse tree
	 */
	void enterMatchingoption(quizParser.MatchingoptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link quizParser#matchingoption}.
	 * @param ctx the parse tree
	 */
	void exitMatchingoption(quizParser.MatchingoptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link quizParser#match}.
	 * @param ctx the parse tree
	 */
	void enterMatch(quizParser.MatchContext ctx);
	/**
	 * Exit a parse tree produced by {@link quizParser#match}.
	 * @param ctx the parse tree
	 */
	void exitMatch(quizParser.MatchContext ctx);
	/**
	 * Enter a parse tree produced by {@link quizParser#import_expr}.
	 * @param ctx the parse tree
	 */
	void enterImport_expr(quizParser.Import_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link quizParser#import_expr}.
	 * @param ctx the parse tree
	 */
	void exitImport_expr(quizParser.Import_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link quizParser#plist}.
	 * @param ctx the parse tree
	 */
	void enterPlist(quizParser.PlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link quizParser#plist}.
	 * @param ctx the parse tree
	 */
	void exitPlist(quizParser.PlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link quizParser#p}.
	 * @param ctx the parse tree
	 */
	void enterP(quizParser.PContext ctx);
	/**
	 * Exit a parse tree produced by {@link quizParser#p}.
	 * @param ctx the parse tree
	 */
	void exitP(quizParser.PContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ShowQuestionBasic}
	 * labeled alternative in {@link quizParser#show}.
	 * @param ctx the parse tree
	 */
	void enterShowQuestionBasic(quizParser.ShowQuestionBasicContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ShowQuestionBasic}
	 * labeled alternative in {@link quizParser#show}.
	 * @param ctx the parse tree
	 */
	void exitShowQuestionBasic(quizParser.ShowQuestionBasicContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ShowQuestionMultiOpt}
	 * labeled alternative in {@link quizParser#show}.
	 * @param ctx the parse tree
	 */
	void enterShowQuestionMultiOpt(quizParser.ShowQuestionMultiOptContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ShowQuestionMultiOpt}
	 * labeled alternative in {@link quizParser#show}.
	 * @param ctx the parse tree
	 */
	void exitShowQuestionMultiOpt(quizParser.ShowQuestionMultiOptContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ShowQuestionMultiOptandQuestion}
	 * labeled alternative in {@link quizParser#show}.
	 * @param ctx the parse tree
	 */
	void enterShowQuestionMultiOptandQuestion(quizParser.ShowQuestionMultiOptandQuestionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ShowQuestionMultiOptandQuestion}
	 * labeled alternative in {@link quizParser#show}.
	 * @param ctx the parse tree
	 */
	void exitShowQuestionMultiOptandQuestion(quizParser.ShowQuestionMultiOptandQuestionContext ctx);
	/**
	 * Enter a parse tree produced by {@link quizParser#question}.
	 * @param ctx the parse tree
	 */
	void enterQuestion(quizParser.QuestionContext ctx);
	/**
	 * Exit a parse tree produced by {@link quizParser#question}.
	 * @param ctx the parse tree
	 */
	void exitQuestion(quizParser.QuestionContext ctx);
	/**
	 * Enter a parse tree produced by {@link quizParser#ques_opt}.
	 * @param ctx the parse tree
	 */
	void enterQues_opt(quizParser.Ques_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link quizParser#ques_opt}.
	 * @param ctx the parse tree
	 */
	void exitQues_opt(quizParser.Ques_optContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ShuffleQuestion}
	 * labeled alternative in {@link quizParser#shuffle}.
	 * @param ctx the parse tree
	 */
	void enterShuffleQuestion(quizParser.ShuffleQuestionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ShuffleQuestion}
	 * labeled alternative in {@link quizParser#shuffle}.
	 * @param ctx the parse tree
	 */
	void exitShuffleQuestion(quizParser.ShuffleQuestionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GetAnswerNum}
	 * labeled alternative in {@link quizParser#getAnswer}.
	 * @param ctx the parse tree
	 */
	void enterGetAnswerNum(quizParser.GetAnswerNumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GetAnswerNum}
	 * labeled alternative in {@link quizParser#getAnswer}.
	 * @param ctx the parse tree
	 */
	void exitGetAnswerNum(quizParser.GetAnswerNumContext ctx);
	/**
	 * Enter a parse tree produced by {@link quizParser#getChoice}.
	 * @param ctx the parse tree
	 */
	void enterGetChoice(quizParser.GetChoiceContext ctx);
	/**
	 * Exit a parse tree produced by {@link quizParser#getChoice}.
	 * @param ctx the parse tree
	 */
	void exitGetChoice(quizParser.GetChoiceContext ctx);
	/**
	 * Enter a parse tree produced by {@link quizParser#getAnswerToChoice}.
	 * @param ctx the parse tree
	 */
	void enterGetAnswerToChoice(quizParser.GetAnswerToChoiceContext ctx);
	/**
	 * Exit a parse tree produced by {@link quizParser#getAnswerToChoice}.
	 * @param ctx the parse tree
	 */
	void exitGetAnswerToChoice(quizParser.GetAnswerToChoiceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code respostaCurta}
	 * labeled alternative in {@link quizParser#shortQuestion}.
	 * @param ctx the parse tree
	 */
	void enterRespostaCurta(quizParser.RespostaCurtaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code respostaCurta}
	 * labeled alternative in {@link quizParser#shortQuestion}.
	 * @param ctx the parse tree
	 */
	void exitRespostaCurta(quizParser.RespostaCurtaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumericQuestion}
	 * labeled alternative in {@link quizParser#numeric}.
	 * @param ctx the parse tree
	 */
	void enterNumericQuestion(quizParser.NumericQuestionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumericQuestion}
	 * labeled alternative in {@link quizParser#numeric}.
	 * @param ctx the parse tree
	 */
	void exitNumericQuestion(quizParser.NumericQuestionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EssayQuestion}
	 * labeled alternative in {@link quizParser#essay}.
	 * @param ctx the parse tree
	 */
	void enterEssayQuestion(quizParser.EssayQuestionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EssayQuestion}
	 * labeled alternative in {@link quizParser#essay}.
	 * @param ctx the parse tree
	 */
	void exitEssayQuestion(quizParser.EssayQuestionContext ctx);
	/**
	 * Enter a parse tree produced by {@link quizParser#option}.
	 * @param ctx the parse tree
	 */
	void enterOption(quizParser.OptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link quizParser#option}.
	 * @param ctx the parse tree
	 */
	void exitOption(quizParser.OptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link quizParser#optionMult}.
	 * @param ctx the parse tree
	 */
	void enterOptionMult(quizParser.OptionMultContext ctx);
	/**
	 * Exit a parse tree produced by {@link quizParser#optionMult}.
	 * @param ctx the parse tree
	 */
	void exitOptionMult(quizParser.OptionMultContext ctx);
	/**
	 * Enter a parse tree produced by {@link quizParser#finishQuiz}.
	 * @param ctx the parse tree
	 */
	void enterFinishQuiz(quizParser.FinishQuizContext ctx);
	/**
	 * Exit a parse tree produced by {@link quizParser#finishQuiz}.
	 * @param ctx the parse tree
	 */
	void exitFinishQuiz(quizParser.FinishQuizContext ctx);
	/**
	 * Enter a parse tree produced by {@link quizParser#title}.
	 * @param ctx the parse tree
	 */
	void enterTitle(quizParser.TitleContext ctx);
	/**
	 * Exit a parse tree produced by {@link quizParser#title}.
	 * @param ctx the parse tree
	 */
	void exitTitle(quizParser.TitleContext ctx);
}