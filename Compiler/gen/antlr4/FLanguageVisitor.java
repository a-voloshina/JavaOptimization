// Generated from C:/Users/JetBrains/Projects/JavaOptimization/Compiler/src/main/java/antlr4\FLanguage.g4 by ANTLR 4.7.2
package antlr4;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link FLanguageParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface FLanguageVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link FLanguageParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(FLanguageParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link FLanguageParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(FLanguageParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FLanguageParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(FLanguageParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link FLanguageParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(FLanguageParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Subexpr}
	 * labeled alternative in {@link FLanguageParser#arithm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubexpr(FLanguageParser.SubexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link FLanguageParser#arithm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSub(FLanguageParser.AddSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryMinus}
	 * labeled alternative in {@link FLanguageParser#arithm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryMinus(FLanguageParser.UnaryMinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntLiteral}
	 * labeled alternative in {@link FLanguageParser#arithm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntLiteral(FLanguageParser.IntLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntVariable}
	 * labeled alternative in {@link FLanguageParser#arithm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntVariable(FLanguageParser.IntVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MultDiv}
	 * labeled alternative in {@link FLanguageParser#arithm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultDiv(FLanguageParser.MultDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogEqual}
	 * labeled alternative in {@link FLanguageParser#logic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogEqual(FLanguageParser.LogEqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Or}
	 * labeled alternative in {@link FLanguageParser#logic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr(FLanguageParser.OrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolLiteral}
	 * labeled alternative in {@link FLanguageParser#logic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolLiteral(FLanguageParser.BoolLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code And}
	 * labeled alternative in {@link FLanguageParser#logic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(FLanguageParser.AndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Compare}
	 * labeled alternative in {@link FLanguageParser#logic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompare(FLanguageParser.CompareContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolVariable}
	 * labeled alternative in {@link FLanguageParser#logic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolVariable(FLanguageParser.BoolVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StrEquals}
	 * labeled alternative in {@link FLanguageParser#logic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrEquals(FLanguageParser.StrEqualsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FLanguageParser#cmp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmp(FLanguageParser.CmpContext ctx);
	/**
	 * Visit a parse tree produced by {@link FLanguageParser#strEqual}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrEqual(FLanguageParser.StrEqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringVariable}
	 * labeled alternative in {@link FLanguageParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringVariable(FLanguageParser.StringVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringLiteral}
	 * labeled alternative in {@link FLanguageParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(FLanguageParser.StringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link FLanguageParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(FLanguageParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link FLanguageParser#ifCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfCondition(FLanguageParser.IfConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FLanguageParser#whileLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileLoop(FLanguageParser.WhileLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link FLanguageParser#printVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintVariable(FLanguageParser.PrintVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link FLanguageParser#varDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclaration(FLanguageParser.VarDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link FLanguageParser#varAssign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarAssign(FLanguageParser.VarAssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link FLanguageParser#varInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarInit(FLanguageParser.VarInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link FLanguageParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(FLanguageParser.VariableContext ctx);
}