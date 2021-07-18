// Generated from bancop.g4 by ANTLR 4.9.2

    package bancoPerguntas;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link bancopParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface bancopVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link bancopParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(bancopParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link bancopParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(bancopParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link bancopParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(bancopParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link bancopParser#multichoice}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultichoice(bancopParser.MultichoiceContext ctx);
	/**
	 * Visit a parse tree produced by {@link bancopParser#matching}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatching(bancopParser.MatchingContext ctx);
	/**
	 * Visit a parse tree produced by {@link bancopParser#shortQ}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShortQ(bancopParser.ShortQContext ctx);
	/**
	 * Visit a parse tree produced by {@link bancopParser#numeric}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumeric(bancopParser.NumericContext ctx);
	/**
	 * Visit a parse tree produced by {@link bancopParser#essay}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEssay(bancopParser.EssayContext ctx);
	/**
	 * Visit a parse tree produced by {@link bancopParser#multichoiceoption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultichoiceoption(bancopParser.MultichoiceoptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link bancopParser#matchingoption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatchingoption(bancopParser.MatchingoptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link bancopParser#match}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatch(bancopParser.MatchContext ctx);
	/**
	 * Visit a parse tree produced by {@link bancopParser#answer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnswer(bancopParser.AnswerContext ctx);
	/**
	 * Visit a parse tree produced by {@link bancopParser#title}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTitle(bancopParser.TitleContext ctx);
	/**
	 * Visit a parse tree produced by {@link bancopParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(bancopParser.IdContext ctx);
}