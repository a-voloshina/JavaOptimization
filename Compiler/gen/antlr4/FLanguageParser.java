// Generated from C:/Users/JetBrains/Projects/JavaOptimization/Compiler/src/main/java/antlr4\FLanguage.g4 by ANTLR 4.7.2
package antlr4;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FLanguageParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, WS=23, INT=24, BOOL=25, 
		STRING=26, TYPE=27, ID=28;
	public static final int
		RULE_prog = 0, RULE_statement = 1, RULE_print = 2, RULE_expression = 3, 
		RULE_arithm = 4, RULE_logic = 5, RULE_cmp = 6, RULE_strEqual = 7, RULE_string = 8, 
		RULE_block = 9, RULE_ifCondition = 10, RULE_whileLoop = 11, RULE_printVariable = 12, 
		RULE_varDeclaration = 13, RULE_varAssign = 14, RULE_varInit = 15, RULE_variable = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "statement", "print", "expression", "arithm", "logic", "cmp", 
			"strEqual", "string", "block", "ifCondition", "whileLoop", "printVariable", 
			"varDeclaration", "varAssign", "varInit", "variable"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'print'", "'('", "')'", "'*'", "'/'", "'+'", "'-'", "'=='", 
			"'!='", "'&&'", "'||'", "'<'", "'>'", "'<='", "'>='", "'{'", "'}'", "'if'", 
			"'else'", "'while'", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "WS", 
			"INT", "BOOL", "STRING", "TYPE", "ID"
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
	public String getGrammarFileName() { return "FLanguage.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public FLanguageParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FLanguageListener ) ((FLanguageListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FLanguageListener ) ((FLanguageListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FLanguageVisitor ) return ((FLanguageVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__7) | (1L << T__16) | (1L << T__18) | (1L << T__20) | (1L << INT) | (1L << BOOL) | (1L << STRING) | (1L << TYPE) | (1L << ID))) != 0)) {
				{
				{
				setState(34);
				statement();
				}
				}
				setState(39);
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

	public static class StatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public VarDeclarationContext varDeclaration() {
			return getRuleContext(VarDeclarationContext.class,0);
		}
		public VarAssignContext varAssign() {
			return getRuleContext(VarAssignContext.class,0);
		}
		public VarInitContext varInit() {
			return getRuleContext(VarInitContext.class,0);
		}
		public IfConditionContext ifCondition() {
			return getRuleContext(IfConditionContext.class,0);
		}
		public WhileLoopContext whileLoop() {
			return getRuleContext(WhileLoopContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FLanguageListener ) ((FLanguageListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FLanguageListener ) ((FLanguageListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FLanguageVisitor ) return ((FLanguageVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(52);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__2:
			case T__7:
			case INT:
			case BOOL:
			case STRING:
			case TYPE:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(45);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(40);
					expression();
					}
					break;
				case 2:
					{
					setState(41);
					print();
					}
					break;
				case 3:
					{
					setState(42);
					varDeclaration();
					}
					break;
				case 4:
					{
					setState(43);
					varAssign();
					}
					break;
				case 5:
					{
					setState(44);
					varInit();
					}
					break;
				}
				setState(47);
				match(T__0);
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 2);
				{
				setState(49);
				ifCondition();
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 3);
				{
				setState(50);
				whileLoop();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 4);
				{
				setState(51);
				block();
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

	public static class PrintContext extends ParserRuleContext {
		public PrintVariableContext var;
		public ExpressionContext expr;
		public PrintVariableContext printVariable() {
			return getRuleContext(PrintVariableContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FLanguageListener ) ((FLanguageListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FLanguageListener ) ((FLanguageListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FLanguageVisitor ) return ((FLanguageVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(T__1);
			setState(55);
			match(T__2);
			setState(58);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(56);
				((PrintContext)_localctx).var = printVariable();
				}
				break;
			case 2:
				{
				setState(57);
				((PrintContext)_localctx).expr = expression();
				}
				break;
			}
			setState(60);
			match(T__3);
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

	public static class ExpressionContext extends ParserRuleContext {
		public ArithmContext arithm() {
			return getRuleContext(ArithmContext.class,0);
		}
		public LogicContext logic() {
			return getRuleContext(LogicContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FLanguageListener ) ((FLanguageListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FLanguageListener ) ((FLanguageListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FLanguageVisitor ) return ((FLanguageVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_expression);
		try {
			setState(65);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				arithm(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				logic(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(64);
				string();
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

	public static class ArithmContext extends ParserRuleContext {
		public ArithmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithm; }
	 
		public ArithmContext() { }
		public void copyFrom(ArithmContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SubexprContext extends ArithmContext {
		public ArithmContext arithm() {
			return getRuleContext(ArithmContext.class,0);
		}
		public SubexprContext(ArithmContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FLanguageListener ) ((FLanguageListener)listener).enterSubexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FLanguageListener ) ((FLanguageListener)listener).exitSubexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FLanguageVisitor ) return ((FLanguageVisitor<? extends T>)visitor).visitSubexpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddSubContext extends ArithmContext {
		public List<ArithmContext> arithm() {
			return getRuleContexts(ArithmContext.class);
		}
		public ArithmContext arithm(int i) {
			return getRuleContext(ArithmContext.class,i);
		}
		public AddSubContext(ArithmContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FLanguageListener ) ((FLanguageListener)listener).enterAddSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FLanguageListener ) ((FLanguageListener)listener).exitAddSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FLanguageVisitor ) return ((FLanguageVisitor<? extends T>)visitor).visitAddSub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryMinusContext extends ArithmContext {
		public ArithmContext arithm() {
			return getRuleContext(ArithmContext.class,0);
		}
		public UnaryMinusContext(ArithmContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FLanguageListener ) ((FLanguageListener)listener).enterUnaryMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FLanguageListener ) ((FLanguageListener)listener).exitUnaryMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FLanguageVisitor ) return ((FLanguageVisitor<? extends T>)visitor).visitUnaryMinus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntLiteralContext extends ArithmContext {
		public TerminalNode INT() { return getToken(FLanguageParser.INT, 0); }
		public IntLiteralContext(ArithmContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FLanguageListener ) ((FLanguageListener)listener).enterIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FLanguageListener ) ((FLanguageListener)listener).exitIntLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FLanguageVisitor ) return ((FLanguageVisitor<? extends T>)visitor).visitIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntVariableContext extends ArithmContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public IntVariableContext(ArithmContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FLanguageListener ) ((FLanguageListener)listener).enterIntVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FLanguageListener ) ((FLanguageListener)listener).exitIntVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FLanguageVisitor ) return ((FLanguageVisitor<? extends T>)visitor).visitIntVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultDivContext extends ArithmContext {
		public List<ArithmContext> arithm() {
			return getRuleContexts(ArithmContext.class);
		}
		public ArithmContext arithm(int i) {
			return getRuleContext(ArithmContext.class,i);
		}
		public MultDivContext(ArithmContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FLanguageListener ) ((FLanguageListener)listener).enterMultDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FLanguageListener ) ((FLanguageListener)listener).exitMultDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FLanguageVisitor ) return ((FLanguageVisitor<? extends T>)visitor).visitMultDiv(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithmContext arithm() throws RecognitionException {
		return arithm(0);
	}

	private ArithmContext arithm(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ArithmContext _localctx = new ArithmContext(_ctx, _parentState);
		ArithmContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_arithm, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				{
				_localctx = new UnaryMinusContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(68);
				match(T__7);
				setState(69);
				arithm(4);
				}
				break;
			case ID:
				{
				_localctx = new IntVariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(70);
				variable();
				}
				break;
			case INT:
				{
				_localctx = new IntLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(71);
				match(INT);
				}
				break;
			case T__2:
				{
				_localctx = new SubexprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(72);
				match(T__2);
				setState(73);
				arithm(0);
				setState(74);
				match(T__3);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(86);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(84);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new MultDivContext(new ArithmContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_arithm);
						setState(78);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(79);
						_la = _input.LA(1);
						if ( !(_la==T__4 || _la==T__5) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(80);
						arithm(7);
						}
						break;
					case 2:
						{
						_localctx = new AddSubContext(new ArithmContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_arithm);
						setState(81);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(82);
						_la = _input.LA(1);
						if ( !(_la==T__6 || _la==T__7) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(83);
						arithm(6);
						}
						break;
					}
					} 
				}
				setState(88);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class LogicContext extends ParserRuleContext {
		public LogicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logic; }
	 
		public LogicContext() { }
		public void copyFrom(LogicContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LogEqualContext extends LogicContext {
		public List<LogicContext> logic() {
			return getRuleContexts(LogicContext.class);
		}
		public LogicContext logic(int i) {
			return getRuleContext(LogicContext.class,i);
		}
		public LogEqualContext(LogicContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FLanguageListener ) ((FLanguageListener)listener).enterLogEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FLanguageListener ) ((FLanguageListener)listener).exitLogEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FLanguageVisitor ) return ((FLanguageVisitor<? extends T>)visitor).visitLogEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrContext extends LogicContext {
		public List<LogicContext> logic() {
			return getRuleContexts(LogicContext.class);
		}
		public LogicContext logic(int i) {
			return getRuleContext(LogicContext.class,i);
		}
		public OrContext(LogicContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FLanguageListener ) ((FLanguageListener)listener).enterOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FLanguageListener ) ((FLanguageListener)listener).exitOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FLanguageVisitor ) return ((FLanguageVisitor<? extends T>)visitor).visitOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolLiteralContext extends LogicContext {
		public TerminalNode BOOL() { return getToken(FLanguageParser.BOOL, 0); }
		public BoolLiteralContext(LogicContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FLanguageListener ) ((FLanguageListener)listener).enterBoolLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FLanguageListener ) ((FLanguageListener)listener).exitBoolLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FLanguageVisitor ) return ((FLanguageVisitor<? extends T>)visitor).visitBoolLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndContext extends LogicContext {
		public List<LogicContext> logic() {
			return getRuleContexts(LogicContext.class);
		}
		public LogicContext logic(int i) {
			return getRuleContext(LogicContext.class,i);
		}
		public AndContext(LogicContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FLanguageListener ) ((FLanguageListener)listener).enterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FLanguageListener ) ((FLanguageListener)listener).exitAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FLanguageVisitor ) return ((FLanguageVisitor<? extends T>)visitor).visitAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CompareContext extends LogicContext {
		public CmpContext cmp() {
			return getRuleContext(CmpContext.class,0);
		}
		public CompareContext(LogicContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FLanguageListener ) ((FLanguageListener)listener).enterCompare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FLanguageListener ) ((FLanguageListener)listener).exitCompare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FLanguageVisitor ) return ((FLanguageVisitor<? extends T>)visitor).visitCompare(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolVariableContext extends LogicContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public BoolVariableContext(LogicContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FLanguageListener ) ((FLanguageListener)listener).enterBoolVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FLanguageListener ) ((FLanguageListener)listener).exitBoolVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FLanguageVisitor ) return ((FLanguageVisitor<? extends T>)visitor).visitBoolVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StrEqualsContext extends LogicContext {
		public StrEqualContext strEqual() {
			return getRuleContext(StrEqualContext.class,0);
		}
		public StrEqualsContext(LogicContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FLanguageListener ) ((FLanguageListener)listener).enterStrEquals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FLanguageListener ) ((FLanguageListener)listener).exitStrEquals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FLanguageVisitor ) return ((FLanguageVisitor<? extends T>)visitor).visitStrEquals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicContext logic() throws RecognitionException {
		return logic(0);
	}

	private LogicContext logic(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicContext _localctx = new LogicContext(_ctx, _parentState);
		LogicContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_logic, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				_localctx = new CompareContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(90);
				cmp();
				}
				break;
			case 2:
				{
				_localctx = new StrEqualsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(91);
				strEqual();
				}
				break;
			case 3:
				{
				_localctx = new BoolVariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(92);
				variable();
				}
				break;
			case 4:
				{
				_localctx = new BoolLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(93);
				match(BOOL);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(107);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(105);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new LogEqualContext(new LogicContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_logic);
						setState(96);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(97);
						_la = _input.LA(1);
						if ( !(_la==T__8 || _la==T__9) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(98);
						logic(6);
						}
						break;
					case 2:
						{
						_localctx = new AndContext(new LogicContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_logic);
						setState(99);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(100);
						match(T__10);
						setState(101);
						logic(5);
						}
						break;
					case 3:
						{
						_localctx = new OrContext(new LogicContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_logic);
						setState(102);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(103);
						match(T__11);
						setState(104);
						logic(4);
						}
						break;
					}
					} 
				}
				setState(109);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class CmpContext extends ParserRuleContext {
		public Token sign;
		public List<ArithmContext> arithm() {
			return getRuleContexts(ArithmContext.class);
		}
		public ArithmContext arithm(int i) {
			return getRuleContext(ArithmContext.class,i);
		}
		public CmpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FLanguageListener ) ((FLanguageListener)listener).enterCmp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FLanguageListener ) ((FLanguageListener)listener).exitCmp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FLanguageVisitor ) return ((FLanguageVisitor<? extends T>)visitor).visitCmp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmpContext cmp() throws RecognitionException {
		CmpContext _localctx = new CmpContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_cmp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			arithm(0);
			setState(111);
			((CmpContext)_localctx).sign = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15))) != 0)) ) {
				((CmpContext)_localctx).sign = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(112);
			arithm(0);
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

	public static class StrEqualContext extends ParserRuleContext {
		public List<StringContext> string() {
			return getRuleContexts(StringContext.class);
		}
		public StringContext string(int i) {
			return getRuleContext(StringContext.class,i);
		}
		public StrEqualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strEqual; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FLanguageListener ) ((FLanguageListener)listener).enterStrEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FLanguageListener ) ((FLanguageListener)listener).exitStrEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FLanguageVisitor ) return ((FLanguageVisitor<? extends T>)visitor).visitStrEqual(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StrEqualContext strEqual() throws RecognitionException {
		StrEqualContext _localctx = new StrEqualContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_strEqual);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			string();
			setState(115);
			_la = _input.LA(1);
			if ( !(_la==T__8 || _la==T__9) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(116);
			string();
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

	public static class StringContext extends ParserRuleContext {
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
	 
		public StringContext() { }
		public void copyFrom(StringContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StringLiteralContext extends StringContext {
		public TerminalNode STRING() { return getToken(FLanguageParser.STRING, 0); }
		public StringLiteralContext(StringContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FLanguageListener ) ((FLanguageListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FLanguageListener ) ((FLanguageListener)listener).exitStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FLanguageVisitor ) return ((FLanguageVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringVariableContext extends StringContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public StringVariableContext(StringContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FLanguageListener ) ((FLanguageListener)listener).enterStringVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FLanguageListener ) ((FLanguageListener)listener).exitStringVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FLanguageVisitor ) return ((FLanguageVisitor<? extends T>)visitor).visitStringVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_string);
		try {
			setState(120);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new StringVariableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				variable();
				}
				break;
			case STRING:
				_localctx = new StringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				match(STRING);
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

	public static class BlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FLanguageListener ) ((FLanguageListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FLanguageListener ) ((FLanguageListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FLanguageVisitor ) return ((FLanguageVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(T__16);
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__7) | (1L << T__16) | (1L << T__18) | (1L << T__20) | (1L << INT) | (1L << BOOL) | (1L << STRING) | (1L << TYPE) | (1L << ID))) != 0)) {
				{
				{
				setState(123);
				statement();
				}
				}
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(129);
			match(T__17);
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

	public static class IfConditionContext extends ParserRuleContext {
		public LogicContext condition;
		public BlockContext thenBlock;
		public BlockContext elseBlock;
		public LogicContext logic() {
			return getRuleContext(LogicContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public IfConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FLanguageListener ) ((FLanguageListener)listener).enterIfCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FLanguageListener ) ((FLanguageListener)listener).exitIfCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FLanguageVisitor ) return ((FLanguageVisitor<? extends T>)visitor).visitIfCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfConditionContext ifCondition() throws RecognitionException {
		IfConditionContext _localctx = new IfConditionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_ifCondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(T__18);
			setState(132);
			match(T__2);
			setState(133);
			((IfConditionContext)_localctx).condition = logic(0);
			setState(134);
			match(T__3);
			setState(135);
			((IfConditionContext)_localctx).thenBlock = block();
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__19) {
				{
				setState(136);
				match(T__19);
				setState(137);
				((IfConditionContext)_localctx).elseBlock = block();
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

	public static class WhileLoopContext extends ParserRuleContext {
		public LogicContext condition;
		public BlockContext body;
		public LogicContext logic() {
			return getRuleContext(LogicContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FLanguageListener ) ((FLanguageListener)listener).enterWhileLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FLanguageListener ) ((FLanguageListener)listener).exitWhileLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FLanguageVisitor ) return ((FLanguageVisitor<? extends T>)visitor).visitWhileLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileLoopContext whileLoop() throws RecognitionException {
		WhileLoopContext _localctx = new WhileLoopContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_whileLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(T__20);
			setState(141);
			match(T__2);
			setState(142);
			((WhileLoopContext)_localctx).condition = logic(0);
			setState(143);
			match(T__3);
			setState(144);
			((WhileLoopContext)_localctx).body = block();
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

	public static class PrintVariableContext extends ParserRuleContext {
		public VariableContext var;
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public PrintVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FLanguageListener ) ((FLanguageListener)listener).enterPrintVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FLanguageListener ) ((FLanguageListener)listener).exitPrintVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FLanguageVisitor ) return ((FLanguageVisitor<? extends T>)visitor).visitPrintVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintVariableContext printVariable() throws RecognitionException {
		PrintVariableContext _localctx = new PrintVariableContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_printVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			((PrintVariableContext)_localctx).var = variable();
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

	public static class VarDeclarationContext extends ParserRuleContext {
		public Token type;
		public Token name;
		public TerminalNode TYPE() { return getToken(FLanguageParser.TYPE, 0); }
		public TerminalNode ID() { return getToken(FLanguageParser.ID, 0); }
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FLanguageListener ) ((FLanguageListener)listener).enterVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FLanguageListener ) ((FLanguageListener)listener).exitVarDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FLanguageVisitor ) return ((FLanguageVisitor<? extends T>)visitor).visitVarDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_varDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			((VarDeclarationContext)_localctx).type = match(TYPE);
			setState(149);
			((VarDeclarationContext)_localctx).name = match(ID);
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

	public static class VarAssignContext extends ParserRuleContext {
		public Token name;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ID() { return getToken(FLanguageParser.ID, 0); }
		public VarAssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varAssign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FLanguageListener ) ((FLanguageListener)listener).enterVarAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FLanguageListener ) ((FLanguageListener)listener).exitVarAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FLanguageVisitor ) return ((FLanguageVisitor<? extends T>)visitor).visitVarAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarAssignContext varAssign() throws RecognitionException {
		VarAssignContext _localctx = new VarAssignContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_varAssign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			((VarAssignContext)_localctx).name = match(ID);
			setState(152);
			match(T__21);
			setState(153);
			expression();
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

	public static class VarInitContext extends ParserRuleContext {
		public Token type;
		public Token name;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode TYPE() { return getToken(FLanguageParser.TYPE, 0); }
		public TerminalNode ID() { return getToken(FLanguageParser.ID, 0); }
		public VarInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FLanguageListener ) ((FLanguageListener)listener).enterVarInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FLanguageListener ) ((FLanguageListener)listener).exitVarInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FLanguageVisitor ) return ((FLanguageVisitor<? extends T>)visitor).visitVarInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarInitContext varInit() throws RecognitionException {
		VarInitContext _localctx = new VarInitContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_varInit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			((VarInitContext)_localctx).type = match(TYPE);
			setState(156);
			((VarInitContext)_localctx).name = match(ID);
			setState(157);
			match(T__21);
			setState(158);
			expression();
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

	public static class VariableContext extends ParserRuleContext {
		public Token name;
		public TerminalNode ID() { return getToken(FLanguageParser.ID, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FLanguageListener ) ((FLanguageListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FLanguageListener ) ((FLanguageListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FLanguageVisitor ) return ((FLanguageVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			((VariableContext)_localctx).name = match(ID);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return arithm_sempred((ArithmContext)_localctx, predIndex);
		case 5:
			return logic_sempred((LogicContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean arithm_sempred(ArithmContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean logic_sempred(LogicContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\36\u00a5\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\7\2&\n\2\f\2\16\2)\13\2\3\3\3\3\3\3\3\3\3\3\5\3\60\n\3\3\3\3\3\3"+
		"\3\3\3\3\3\5\3\67\n\3\3\4\3\4\3\4\3\4\5\4=\n\4\3\4\3\4\3\5\3\5\3\5\5\5"+
		"D\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6O\n\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\7\6W\n\6\f\6\16\6Z\13\6\3\7\3\7\3\7\3\7\3\7\5\7a\n\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\7\7l\n\7\f\7\16\7o\13\7\3\b\3\b\3\b\3\b\3\t\3"+
		"\t\3\t\3\t\3\n\3\n\5\n{\n\n\3\13\3\13\7\13\177\n\13\f\13\16\13\u0082\13"+
		"\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u008d\n\f\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\2\4\n\f\23\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"\2\6\3\2\7\b\3\2\t\n\3\2\13\f\4\2\13\f\17\22\2\u00ac\2\'\3\2"+
		"\2\2\4\66\3\2\2\2\68\3\2\2\2\bC\3\2\2\2\nN\3\2\2\2\f`\3\2\2\2\16p\3\2"+
		"\2\2\20t\3\2\2\2\22z\3\2\2\2\24|\3\2\2\2\26\u0085\3\2\2\2\30\u008e\3\2"+
		"\2\2\32\u0094\3\2\2\2\34\u0096\3\2\2\2\36\u0099\3\2\2\2 \u009d\3\2\2\2"+
		"\"\u00a2\3\2\2\2$&\5\4\3\2%$\3\2\2\2&)\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2("+
		"\3\3\2\2\2)\'\3\2\2\2*\60\5\b\5\2+\60\5\6\4\2,\60\5\34\17\2-\60\5\36\20"+
		"\2.\60\5 \21\2/*\3\2\2\2/+\3\2\2\2/,\3\2\2\2/-\3\2\2\2/.\3\2\2\2\60\61"+
		"\3\2\2\2\61\62\7\3\2\2\62\67\3\2\2\2\63\67\5\26\f\2\64\67\5\30\r\2\65"+
		"\67\5\24\13\2\66/\3\2\2\2\66\63\3\2\2\2\66\64\3\2\2\2\66\65\3\2\2\2\67"+
		"\5\3\2\2\289\7\4\2\29<\7\5\2\2:=\5\32\16\2;=\5\b\5\2<:\3\2\2\2<;\3\2\2"+
		"\2=>\3\2\2\2>?\7\6\2\2?\7\3\2\2\2@D\5\n\6\2AD\5\f\7\2BD\5\22\n\2C@\3\2"+
		"\2\2CA\3\2\2\2CB\3\2\2\2D\t\3\2\2\2EF\b\6\1\2FG\7\n\2\2GO\5\n\6\6HO\5"+
		"\"\22\2IO\7\32\2\2JK\7\5\2\2KL\5\n\6\2LM\7\6\2\2MO\3\2\2\2NE\3\2\2\2N"+
		"H\3\2\2\2NI\3\2\2\2NJ\3\2\2\2OX\3\2\2\2PQ\f\b\2\2QR\t\2\2\2RW\5\n\6\t"+
		"ST\f\7\2\2TU\t\3\2\2UW\5\n\6\bVP\3\2\2\2VS\3\2\2\2WZ\3\2\2\2XV\3\2\2\2"+
		"XY\3\2\2\2Y\13\3\2\2\2ZX\3\2\2\2[\\\b\7\1\2\\a\5\16\b\2]a\5\20\t\2^a\5"+
		"\"\22\2_a\7\33\2\2`[\3\2\2\2`]\3\2\2\2`^\3\2\2\2`_\3\2\2\2am\3\2\2\2b"+
		"c\f\7\2\2cd\t\4\2\2dl\5\f\7\bef\f\6\2\2fg\7\r\2\2gl\5\f\7\7hi\f\5\2\2"+
		"ij\7\16\2\2jl\5\f\7\6kb\3\2\2\2ke\3\2\2\2kh\3\2\2\2lo\3\2\2\2mk\3\2\2"+
		"\2mn\3\2\2\2n\r\3\2\2\2om\3\2\2\2pq\5\n\6\2qr\t\5\2\2rs\5\n\6\2s\17\3"+
		"\2\2\2tu\5\22\n\2uv\t\4\2\2vw\5\22\n\2w\21\3\2\2\2x{\5\"\22\2y{\7\34\2"+
		"\2zx\3\2\2\2zy\3\2\2\2{\23\3\2\2\2|\u0080\7\23\2\2}\177\5\4\3\2~}\3\2"+
		"\2\2\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0083"+
		"\3\2\2\2\u0082\u0080\3\2\2\2\u0083\u0084\7\24\2\2\u0084\25\3\2\2\2\u0085"+
		"\u0086\7\25\2\2\u0086\u0087\7\5\2\2\u0087\u0088\5\f\7\2\u0088\u0089\7"+
		"\6\2\2\u0089\u008c\5\24\13\2\u008a\u008b\7\26\2\2\u008b\u008d\5\24\13"+
		"\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\27\3\2\2\2\u008e\u008f"+
		"\7\27\2\2\u008f\u0090\7\5\2\2\u0090\u0091\5\f\7\2\u0091\u0092\7\6\2\2"+
		"\u0092\u0093\5\24\13\2\u0093\31\3\2\2\2\u0094\u0095\5\"\22\2\u0095\33"+
		"\3\2\2\2\u0096\u0097\7\35\2\2\u0097\u0098\7\36\2\2\u0098\35\3\2\2\2\u0099"+
		"\u009a\7\36\2\2\u009a\u009b\7\30\2\2\u009b\u009c\5\b\5\2\u009c\37\3\2"+
		"\2\2\u009d\u009e\7\35\2\2\u009e\u009f\7\36\2\2\u009f\u00a0\7\30\2\2\u00a0"+
		"\u00a1\5\b\5\2\u00a1!\3\2\2\2\u00a2\u00a3\7\36\2\2\u00a3#\3\2\2\2\20\'"+
		"/\66<CNVX`kmz\u0080\u008c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}