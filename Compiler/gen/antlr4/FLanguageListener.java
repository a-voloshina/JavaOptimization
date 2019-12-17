// Generated from C:/Users/JetBrains/Projects/JavaOptimization/Compiler/src/main/java/antlr4\FLanguage.g4 by ANTLR 4.7.2
package antlr4;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FLanguageParser}.
 */
public interface FLanguageListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FLanguageParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(FLanguageParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link FLanguageParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(FLanguageParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link FLanguageParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(FLanguageParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FLanguageParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(FLanguageParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FLanguageParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(FLanguageParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link FLanguageParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(FLanguageParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link FLanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(FLanguageParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FLanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(FLanguageParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Subexpr}
	 * labeled alternative in {@link FLanguageParser#arithm}.
	 * @param ctx the parse tree
	 */
	void enterSubexpr(FLanguageParser.SubexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Subexpr}
	 * labeled alternative in {@link FLanguageParser#arithm}.
	 * @param ctx the parse tree
	 */
	void exitSubexpr(FLanguageParser.SubexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link FLanguageParser#arithm}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(FLanguageParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link FLanguageParser#arithm}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(FLanguageParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryMinus}
	 * labeled alternative in {@link FLanguageParser#arithm}.
	 * @param ctx the parse tree
	 */
	void enterUnaryMinus(FLanguageParser.UnaryMinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryMinus}
	 * labeled alternative in {@link FLanguageParser#arithm}.
	 * @param ctx the parse tree
	 */
	void exitUnaryMinus(FLanguageParser.UnaryMinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntLiteral}
	 * labeled alternative in {@link FLanguageParser#arithm}.
	 * @param ctx the parse tree
	 */
	void enterIntLiteral(FLanguageParser.IntLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntLiteral}
	 * labeled alternative in {@link FLanguageParser#arithm}.
	 * @param ctx the parse tree
	 */
	void exitIntLiteral(FLanguageParser.IntLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntVariable}
	 * labeled alternative in {@link FLanguageParser#arithm}.
	 * @param ctx the parse tree
	 */
	void enterIntVariable(FLanguageParser.IntVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntVariable}
	 * labeled alternative in {@link FLanguageParser#arithm}.
	 * @param ctx the parse tree
	 */
	void exitIntVariable(FLanguageParser.IntVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultDiv}
	 * labeled alternative in {@link FLanguageParser#arithm}.
	 * @param ctx the parse tree
	 */
	void enterMultDiv(FLanguageParser.MultDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultDiv}
	 * labeled alternative in {@link FLanguageParser#arithm}.
	 * @param ctx the parse tree
	 */
	void exitMultDiv(FLanguageParser.MultDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogEqual}
	 * labeled alternative in {@link FLanguageParser#logic}.
	 * @param ctx the parse tree
	 */
	void enterLogEqual(FLanguageParser.LogEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogEqual}
	 * labeled alternative in {@link FLanguageParser#logic}.
	 * @param ctx the parse tree
	 */
	void exitLogEqual(FLanguageParser.LogEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Or}
	 * labeled alternative in {@link FLanguageParser#logic}.
	 * @param ctx the parse tree
	 */
	void enterOr(FLanguageParser.OrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Or}
	 * labeled alternative in {@link FLanguageParser#logic}.
	 * @param ctx the parse tree
	 */
	void exitOr(FLanguageParser.OrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolLiteral}
	 * labeled alternative in {@link FLanguageParser#logic}.
	 * @param ctx the parse tree
	 */
	void enterBoolLiteral(FLanguageParser.BoolLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolLiteral}
	 * labeled alternative in {@link FLanguageParser#logic}.
	 * @param ctx the parse tree
	 */
	void exitBoolLiteral(FLanguageParser.BoolLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code And}
	 * labeled alternative in {@link FLanguageParser#logic}.
	 * @param ctx the parse tree
	 */
	void enterAnd(FLanguageParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code And}
	 * labeled alternative in {@link FLanguageParser#logic}.
	 * @param ctx the parse tree
	 */
	void exitAnd(FLanguageParser.AndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Compare}
	 * labeled alternative in {@link FLanguageParser#logic}.
	 * @param ctx the parse tree
	 */
	void enterCompare(FLanguageParser.CompareContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Compare}
	 * labeled alternative in {@link FLanguageParser#logic}.
	 * @param ctx the parse tree
	 */
	void exitCompare(FLanguageParser.CompareContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolVariable}
	 * labeled alternative in {@link FLanguageParser#logic}.
	 * @param ctx the parse tree
	 */
	void enterBoolVariable(FLanguageParser.BoolVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolVariable}
	 * labeled alternative in {@link FLanguageParser#logic}.
	 * @param ctx the parse tree
	 */
	void exitBoolVariable(FLanguageParser.BoolVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StrEquals}
	 * labeled alternative in {@link FLanguageParser#logic}.
	 * @param ctx the parse tree
	 */
	void enterStrEquals(FLanguageParser.StrEqualsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StrEquals}
	 * labeled alternative in {@link FLanguageParser#logic}.
	 * @param ctx the parse tree
	 */
	void exitStrEquals(FLanguageParser.StrEqualsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FLanguageParser#cmp}.
	 * @param ctx the parse tree
	 */
	void enterCmp(FLanguageParser.CmpContext ctx);
	/**
	 * Exit a parse tree produced by {@link FLanguageParser#cmp}.
	 * @param ctx the parse tree
	 */
	void exitCmp(FLanguageParser.CmpContext ctx);
	/**
	 * Enter a parse tree produced by {@link FLanguageParser#strEqual}.
	 * @param ctx the parse tree
	 */
	void enterStrEqual(FLanguageParser.StrEqualContext ctx);
	/**
	 * Exit a parse tree produced by {@link FLanguageParser#strEqual}.
	 * @param ctx the parse tree
	 */
	void exitStrEqual(FLanguageParser.StrEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringVariable}
	 * labeled alternative in {@link FLanguageParser#string}.
	 * @param ctx the parse tree
	 */
	void enterStringVariable(FLanguageParser.StringVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringVariable}
	 * labeled alternative in {@link FLanguageParser#string}.
	 * @param ctx the parse tree
	 */
	void exitStringVariable(FLanguageParser.StringVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringLiteral}
	 * labeled alternative in {@link FLanguageParser#string}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(FLanguageParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringLiteral}
	 * labeled alternative in {@link FLanguageParser#string}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(FLanguageParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link FLanguageParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(FLanguageParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link FLanguageParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(FLanguageParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link FLanguageParser#ifCondition}.
	 * @param ctx the parse tree
	 */
	void enterIfCondition(FLanguageParser.IfConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FLanguageParser#ifCondition}.
	 * @param ctx the parse tree
	 */
	void exitIfCondition(FLanguageParser.IfConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FLanguageParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoop(FLanguageParser.WhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link FLanguageParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoop(FLanguageParser.WhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link FLanguageParser#printVariable}.
	 * @param ctx the parse tree
	 */
	void enterPrintVariable(FLanguageParser.PrintVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link FLanguageParser#printVariable}.
	 * @param ctx the parse tree
	 */
	void exitPrintVariable(FLanguageParser.PrintVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link FLanguageParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(FLanguageParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FLanguageParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(FLanguageParser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FLanguageParser#varAssign}.
	 * @param ctx the parse tree
	 */
	void enterVarAssign(FLanguageParser.VarAssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link FLanguageParser#varAssign}.
	 * @param ctx the parse tree
	 */
	void exitVarAssign(FLanguageParser.VarAssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link FLanguageParser#varInit}.
	 * @param ctx the parse tree
	 */
	void enterVarInit(FLanguageParser.VarInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link FLanguageParser#varInit}.
	 * @param ctx the parse tree
	 */
	void exitVarInit(FLanguageParser.VarInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link FLanguageParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(FLanguageParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link FLanguageParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(FLanguageParser.VariableContext ctx);
}