// Generated from bancop.g4 by ANTLR 4.9.2

    package bancoPerguntas;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link bancopParser}.
 */
public interface bancopListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link bancopParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(bancopParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link bancopParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(bancopParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link bancopParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(bancopParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link bancopParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(bancopParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link bancopParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(bancopParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link bancopParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(bancopParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link bancopParser#multichoice}.
	 * @param ctx the parse tree
	 */
	void enterMultichoice(bancopParser.MultichoiceContext ctx);
	/**
	 * Exit a parse tree produced by {@link bancopParser#multichoice}.
	 * @param ctx the parse tree
	 */
	void exitMultichoice(bancopParser.MultichoiceContext ctx);
	/**
	 * Enter a parse tree produced by {@link bancopParser#matching}.
	 * @param ctx the parse tree
	 */
	void enterMatching(bancopParser.MatchingContext ctx);
	/**
	 * Exit a parse tree produced by {@link bancopParser#matching}.
	 * @param ctx the parse tree
	 */
	void exitMatching(bancopParser.MatchingContext ctx);
	/**
	 * Enter a parse tree produced by {@link bancopParser#shortQ}.
	 * @param ctx the parse tree
	 */
	void enterShortQ(bancopParser.ShortQContext ctx);
	/**
	 * Exit a parse tree produced by {@link bancopParser#shortQ}.
	 * @param ctx the parse tree
	 */
	void exitShortQ(bancopParser.ShortQContext ctx);
	/**
	 * Enter a parse tree produced by {@link bancopParser#numeric}.
	 * @param ctx the parse tree
	 */
	void enterNumeric(bancopParser.NumericContext ctx);
	/**
	 * Exit a parse tree produced by {@link bancopParser#numeric}.
	 * @param ctx the parse tree
	 */
	void exitNumeric(bancopParser.NumericContext ctx);
	/**
	 * Enter a parse tree produced by {@link bancopParser#essay}.
	 * @param ctx the parse tree
	 */
	void enterEssay(bancopParser.EssayContext ctx);
	/**
	 * Exit a parse tree produced by {@link bancopParser#essay}.
	 * @param ctx the parse tree
	 */
	void exitEssay(bancopParser.EssayContext ctx);
	/**
	 * Enter a parse tree produced by {@link bancopParser#multichoiceoption}.
	 * @param ctx the parse tree
	 */
	void enterMultichoiceoption(bancopParser.MultichoiceoptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link bancopParser#multichoiceoption}.
	 * @param ctx the parse tree
	 */
	void exitMultichoiceoption(bancopParser.MultichoiceoptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link bancopParser#matchingoption}.
	 * @param ctx the parse tree
	 */
	void enterMatchingoption(bancopParser.MatchingoptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link bancopParser#matchingoption}.
	 * @param ctx the parse tree
	 */
	void exitMatchingoption(bancopParser.MatchingoptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link bancopParser#match}.
	 * @param ctx the parse tree
	 */
	void enterMatch(bancopParser.MatchContext ctx);
	/**
	 * Exit a parse tree produced by {@link bancopParser#match}.
	 * @param ctx the parse tree
	 */
	void exitMatch(bancopParser.MatchContext ctx);
	/**
	 * Enter a parse tree produced by {@link bancopParser#answer}.
	 * @param ctx the parse tree
	 */
	void enterAnswer(bancopParser.AnswerContext ctx);
	/**
	 * Exit a parse tree produced by {@link bancopParser#answer}.
	 * @param ctx the parse tree
	 */
	void exitAnswer(bancopParser.AnswerContext ctx);
	/**
	 * Enter a parse tree produced by {@link bancopParser#title}.
	 * @param ctx the parse tree
	 */
	void enterTitle(bancopParser.TitleContext ctx);
	/**
	 * Exit a parse tree produced by {@link bancopParser#title}.
	 * @param ctx the parse tree
	 */
	void exitTitle(bancopParser.TitleContext ctx);
	/**
	 * Enter a parse tree produced by {@link bancopParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(bancopParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link bancopParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(bancopParser.IdContext ctx);
}