// Generated from quiz.g4 by ANTLR 4.9.2

    package Quiz;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link quizParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface quizVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link quizParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(quizParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link quizParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(quizParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link quizParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(quizParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CreateQuiz}
	 * labeled alternative in {@link quizParser#quiz}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateQuiz(quizParser.CreateQuizContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CreateQuizCorrection}
	 * labeled alternative in {@link quizParser#quiz}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateQuizCorrection(quizParser.CreateQuizCorrectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link quizParser#createReport}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateReport(quizParser.CreateReportContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CreateGroup}
	 * labeled alternative in {@link quizParser#add}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateGroup(quizParser.CreateGroupContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CreateMultiGroup}
	 * labeled alternative in {@link quizParser#add}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateMultiGroup(quizParser.CreateMultiGroupContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddOption}
	 * labeled alternative in {@link quizParser#add}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddOption(quizParser.AddOptionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddAll}
	 * labeled alternative in {@link quizParser#add}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddAll(quizParser.AddAllContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddQuestion2Group}
	 * labeled alternative in {@link quizParser#add}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddQuestion2Group(quizParser.AddQuestion2GroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link quizParser#sub_question}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSub_question(quizParser.Sub_questionContext ctx);
	/**
	 * Visit a parse tree produced by {@link quizParser#sub_groups}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSub_groups(quizParser.Sub_groupsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LoadBanco}
	 * labeled alternative in {@link quizParser#load}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoadBanco(quizParser.LoadBancoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Eliminar}
	 * labeled alternative in {@link quizParser#remove}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEliminar(quizParser.EliminarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DefinirResposta}
	 * labeled alternative in {@link quizParser#defineAnswer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinirResposta(quizParser.DefinirRespostaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DefinirCotacaoSemDesconto}
	 * labeled alternative in {@link quizParser#defineMark}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinirCotacaoSemDesconto(quizParser.DefinirCotacaoSemDescontoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DefinirCotacaoMudaPergunta}
	 * labeled alternative in {@link quizParser#defineMark}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinirCotacaoMudaPergunta(quizParser.DefinirCotacaoMudaPerguntaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DefinirCotacaoDescontar}
	 * labeled alternative in {@link quizParser#defineMark}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinirCotacaoDescontar(quizParser.DefinirCotacaoDescontarContext ctx);
	/**
	 * Visit a parse tree produced by {@link quizParser#mark}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMark(quizParser.MarkContext ctx);
	/**
	 * Visit a parse tree produced by {@link quizParser#showGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowGroup(quizParser.ShowGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link quizParser#showOpt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowOpt(quizParser.ShowOptContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Avaliar}
	 * labeled alternative in {@link quizParser#evaluation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAvaliar(quizParser.AvaliarContext ctx);
	/**
	 * Visit a parse tree produced by {@link quizParser#multichoice}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultichoice(quizParser.MultichoiceContext ctx);
	/**
	 * Visit a parse tree produced by {@link quizParser#multichoiceoption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultichoiceoption(quizParser.MultichoiceoptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link quizParser#matching}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatching(quizParser.MatchingContext ctx);
	/**
	 * Visit a parse tree produced by {@link quizParser#matchingoption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatchingoption(quizParser.MatchingoptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link quizParser#match}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatch(quizParser.MatchContext ctx);
	/**
	 * Visit a parse tree produced by {@link quizParser#import_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_expr(quizParser.Import_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link quizParser#plist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlist(quizParser.PlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link quizParser#p}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitP(quizParser.PContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ShowQuestionBasic}
	 * labeled alternative in {@link quizParser#show}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowQuestionBasic(quizParser.ShowQuestionBasicContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ShowQuestionMultiOpt}
	 * labeled alternative in {@link quizParser#show}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowQuestionMultiOpt(quizParser.ShowQuestionMultiOptContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ShowQuestionMultiOptandQuestion}
	 * labeled alternative in {@link quizParser#show}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowQuestionMultiOptandQuestion(quizParser.ShowQuestionMultiOptandQuestionContext ctx);
	/**
	 * Visit a parse tree produced by {@link quizParser#question}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestion(quizParser.QuestionContext ctx);
	/**
	 * Visit a parse tree produced by {@link quizParser#ques_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQues_opt(quizParser.Ques_optContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ShuffleQuestion}
	 * labeled alternative in {@link quizParser#shuffle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShuffleQuestion(quizParser.ShuffleQuestionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GetAnswerNum}
	 * labeled alternative in {@link quizParser#getAnswer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetAnswerNum(quizParser.GetAnswerNumContext ctx);
	/**
	 * Visit a parse tree produced by {@link quizParser#getChoice}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetChoice(quizParser.GetChoiceContext ctx);
	/**
	 * Visit a parse tree produced by {@link quizParser#getAnswerToChoice}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetAnswerToChoice(quizParser.GetAnswerToChoiceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code respostaCurta}
	 * labeled alternative in {@link quizParser#shortQuestion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRespostaCurta(quizParser.RespostaCurtaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumericQuestion}
	 * labeled alternative in {@link quizParser#numeric}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericQuestion(quizParser.NumericQuestionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EssayQuestion}
	 * labeled alternative in {@link quizParser#essay}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEssayQuestion(quizParser.EssayQuestionContext ctx);
	/**
	 * Visit a parse tree produced by {@link quizParser#option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOption(quizParser.OptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link quizParser#optionMult}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionMult(quizParser.OptionMultContext ctx);
	/**
	 * Visit a parse tree produced by {@link quizParser#finishQuiz}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinishQuiz(quizParser.FinishQuizContext ctx);
	/**
	 * Visit a parse tree produced by {@link quizParser#title}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTitle(quizParser.TitleContext ctx);
}