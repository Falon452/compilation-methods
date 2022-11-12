// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class SlimpParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		KW_AS=1, KW_BREAK=2, KW_CONTINUE=3, KW_ELSE=4, KW_FALSE=5, KW_FN=6, KW_FOR=7, 
		KW_IF=8, KW_RETURN=9, KW_TRUE=10, KW_WHILE=11, IDENTIFIER=12, COMMENT=13, 
		WHITESPACE=14, NEWLINE=15, INTEGER_LITERAL=16, DEC_LITERAL=17, HEX_LITERAL=18, 
		OCT_LITERAL=19, BIN_LITERAL=20, FLOAT_LITERAL=21, CHAR_LITERAL=22, STRING_LITERAL=23, 
		LUS=24, MINUS=25, STAR=26, SLASH=27, SLASHSLASH=28, PERCENT=29, NOT=30, 
		AND=31, ANDAND=32, OROR=33, EQ=34, EQEQ=35, NE=36, GT=37, LT=38, GE=39, 
		LE=40, UNDERSCORE=41, DOT=42, DOTDOT=43, COMMA=44, SEMI=45, COLON=46, 
		LARROW=47, RARROW=48, POUND=49, LCURLYBRACE=50, RCURLYBRACE=51, LSQUAREBRACKET=52, 
		RSQUAREBRACKET=53, LPAREN=54, RPAREN=55;
	public static final int
		RULE_program = 0, RULE_declaration = 1, RULE_globalVariable = 2, RULE_function = 3, 
		RULE_functionParams = 4, RULE_functionParam = 5, RULE_functionReturnType = 6, 
		RULE_block = 7, RULE_statement = 8, RULE_declarationStatement = 9, RULE_assignmentStatement = 10, 
		RULE_blockStatement = 11, RULE_ifStatement = 12, RULE_forLoop = 13, RULE_whileLoop = 14, 
		RULE_expressionStatement = 15, RULE_expression = 16, RULE_expressionElements = 17, 
		RULE_mapExpressionElements = 18, RULE_comparisonOperator = 19, RULE_arithmeticOperator = 20, 
		RULE_literal = 21, RULE_identifier = 22, RULE_typedIdentifier = 23, RULE_type = 24, 
		RULE_tupleTypeElements = 25, RULE_pattern = 26, RULE_patternElements = 27, 
		RULE_mapPatternElements = 28;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "declaration", "globalVariable", "function", "functionParams", 
			"functionParam", "functionReturnType", "block", "statement", "declarationStatement", 
			"assignmentStatement", "blockStatement", "ifStatement", "forLoop", "whileLoop", 
			"expressionStatement", "expression", "expressionElements", "mapExpressionElements", 
			"comparisonOperator", "arithmeticOperator", "literal", "identifier", 
			"typedIdentifier", "type", "tupleTypeElements", "pattern", "patternElements", 
			"mapPatternElements"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'as'", "'break'", "'continue'", "'else'", "'false'", "'fun'", 
			"'for'", "'if'", "'return'", "'true'", "'while'", null, null, null, null, 
			null, null, null, null, null, null, null, null, "'+'", "'-'", "'*'", 
			"'/'", "'//'", "'%'", "'!'", "'&'", "'&&'", "'||'", "'='", "'=='", "'!='", 
			"'>'", "'<'", "'>='", "'<='", "'_'", "'.'", "'..'", "','", "';'", "':'", 
			"'<-'", "'->'", "'#'", "'{'", "'}'", "'['", "']'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "KW_AS", "KW_BREAK", "KW_CONTINUE", "KW_ELSE", "KW_FALSE", "KW_FN", 
			"KW_FOR", "KW_IF", "KW_RETURN", "KW_TRUE", "KW_WHILE", "IDENTIFIER", 
			"COMMENT", "WHITESPACE", "NEWLINE", "INTEGER_LITERAL", "DEC_LITERAL", 
			"HEX_LITERAL", "OCT_LITERAL", "BIN_LITERAL", "FLOAT_LITERAL", "CHAR_LITERAL", 
			"STRING_LITERAL", "LUS", "MINUS", "STAR", "SLASH", "SLASHSLASH", "PERCENT", 
			"NOT", "AND", "ANDAND", "OROR", "EQ", "EQEQ", "NE", "GT", "LT", "GE", 
			"LE", "UNDERSCORE", "DOT", "DOTDOT", "COMMA", "SEMI", "COLON", "LARROW", 
			"RARROW", "POUND", "LCURLYBRACE", "RCURLYBRACE", "LSQUAREBRACKET", "RSQUAREBRACKET", 
			"LPAREN", "RPAREN"
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
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SlimpParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SlimpParser.EOF, 0); }
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimpParserListener ) ((SlimpParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimpParserListener ) ((SlimpParserListener)listener).exitProgram(this);
		}
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
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 23646097081701472L) != 0) {
				{
				{
				setState(58);
				declaration();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationContext extends ParserRuleContext {
		public GlobalVariableContext globalVariable() {
			return getRuleContext(GlobalVariableContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimpParserListener ) ((SlimpParserListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimpParserListener ) ((SlimpParserListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaration);
		try {
			setState(68);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_FALSE:
			case KW_TRUE:
			case IDENTIFIER:
			case INTEGER_LITERAL:
			case FLOAT_LITERAL:
			case CHAR_LITERAL:
			case STRING_LITERAL:
			case UNDERSCORE:
			case LCURLYBRACE:
			case LSQUAREBRACKET:
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				globalVariable();
				}
				break;
			case KW_FN:
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				function();
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

	@SuppressWarnings("CheckReturnValue")
	public static class GlobalVariableContext extends ParserRuleContext {
		public DeclarationStatementContext declarationStatement() {
			return getRuleContext(DeclarationStatementContext.class,0);
		}
		public AssignmentStatementContext assignmentStatement() {
			return getRuleContext(AssignmentStatementContext.class,0);
		}
		public GlobalVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globalVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimpParserListener ) ((SlimpParserListener)listener).enterGlobalVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimpParserListener ) ((SlimpParserListener)listener).exitGlobalVariable(this);
		}
	}

	public final GlobalVariableContext globalVariable() throws RecognitionException {
		GlobalVariableContext _localctx = new GlobalVariableContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_globalVariable);
		try {
			setState(72);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				declarationStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				assignmentStatement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode KW_FN() { return getToken(SlimpParser.KW_FN, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(SlimpParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(SlimpParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FunctionParamsContext functionParams() {
			return getRuleContext(FunctionParamsContext.class,0);
		}
		public TerminalNode COLON() { return getToken(SlimpParser.COLON, 0); }
		public FunctionReturnTypeContext functionReturnType() {
			return getRuleContext(FunctionReturnTypeContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimpParserListener ) ((SlimpParserListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimpParserListener ) ((SlimpParserListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(KW_FN);
			setState(75);
			identifier();
			setState(76);
			match(LPAREN);
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER || _la==AND) {
				{
				setState(77);
				functionParams();
				}
			}

			setState(80);
			match(RPAREN);
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(81);
				match(COLON);
				setState(82);
				functionReturnType();
				}
			}

			setState(85);
			block();
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionParamsContext extends ParserRuleContext {
		public List<FunctionParamContext> functionParam() {
			return getRuleContexts(FunctionParamContext.class);
		}
		public FunctionParamContext functionParam(int i) {
			return getRuleContext(FunctionParamContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SlimpParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SlimpParser.COMMA, i);
		}
		public FunctionParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimpParserListener ) ((SlimpParserListener)listener).enterFunctionParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimpParserListener ) ((SlimpParserListener)listener).exitFunctionParams(this);
		}
	}

	public final FunctionParamsContext functionParams() throws RecognitionException {
		FunctionParamsContext _localctx = new FunctionParamsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_functionParams);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			functionParam();
			setState(92);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(88);
					match(COMMA);
					setState(89);
					functionParam();
					}
					} 
				}
				setState(94);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(95);
				match(COMMA);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionParamContext extends ParserRuleContext {
		public TypedIdentifierContext typedIdentifier() {
			return getRuleContext(TypedIdentifierContext.class,0);
		}
		public TerminalNode AND() { return getToken(SlimpParser.AND, 0); }
		public FunctionParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimpParserListener ) ((SlimpParserListener)listener).enterFunctionParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimpParserListener ) ((SlimpParserListener)listener).exitFunctionParam(this);
		}
	}

	public final FunctionParamContext functionParam() throws RecognitionException {
		FunctionParamContext _localctx = new FunctionParamContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_functionParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AND) {
				{
				setState(98);
				match(AND);
				}
			}

			setState(101);
			typedIdentifier();
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionReturnTypeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FunctionReturnTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionReturnType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimpParserListener ) ((SlimpParserListener)listener).enterFunctionReturnType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimpParserListener ) ((SlimpParserListener)listener).exitFunctionReturnType(this);
		}
	}

	public final FunctionReturnTypeContext functionReturnType() throws RecognitionException {
		FunctionReturnTypeContext _localctx = new FunctionReturnTypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_functionReturnType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			type();
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

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LCURLYBRACE() { return getToken(SlimpParser.LCURLYBRACE, 0); }
		public TerminalNode RCURLYBRACE() { return getToken(SlimpParser.RCURLYBRACE, 0); }
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
			if ( listener instanceof SlimpParserListener ) ((SlimpParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimpParserListener ) ((SlimpParserListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(LCURLYBRACE);
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 23681282561089452L) != 0) {
				{
				{
				setState(106);
				statement();
				}
				}
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(112);
			match(RCURLYBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(SlimpParser.SEMI, 0); }
		public DeclarationStatementContext declarationStatement() {
			return getRuleContext(DeclarationStatementContext.class,0);
		}
		public AssignmentStatementContext assignmentStatement() {
			return getRuleContext(AssignmentStatementContext.class,0);
		}
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public TerminalNode KW_RETURN() { return getToken(SlimpParser.KW_RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode KW_BREAK() { return getToken(SlimpParser.KW_BREAK, 0); }
		public TerminalNode KW_CONTINUE() { return getToken(SlimpParser.KW_CONTINUE, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimpParserListener ) ((SlimpParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimpParserListener ) ((SlimpParserListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_statement);
		try {
			setState(126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				declarationStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(116);
				assignmentStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(117);
				blockStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(118);
				expressionStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(123);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case KW_RETURN:
					{
					setState(119);
					match(KW_RETURN);
					setState(120);
					expression(0);
					}
					break;
				case KW_BREAK:
					{
					setState(121);
					match(KW_BREAK);
					}
					break;
				case KW_CONTINUE:
					{
					setState(122);
					match(KW_CONTINUE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(125);
				match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationStatementContext extends ParserRuleContext {
		public TypedIdentifierContext typedIdentifier() {
			return getRuleContext(TypedIdentifierContext.class,0);
		}
		public DeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimpParserListener ) ((SlimpParserListener)listener).enterDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimpParserListener ) ((SlimpParserListener)listener).exitDeclarationStatement(this);
		}
	}

	public final DeclarationStatementContext declarationStatement() throws RecognitionException {
		DeclarationStatementContext _localctx = new DeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_declarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			typedIdentifier();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentStatementContext extends ParserRuleContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public TerminalNode EQ() { return getToken(SlimpParser.EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(SlimpParser.SEMI, 0); }
		public AssignmentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimpParserListener ) ((SlimpParserListener)listener).enterAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimpParserListener ) ((SlimpParserListener)listener).exitAssignmentStatement(this);
		}
	}

	public final AssignmentStatementContext assignmentStatement() throws RecognitionException {
		AssignmentStatementContext _localctx = new AssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_assignmentStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			pattern();
			setState(131);
			match(EQ);
			setState(132);
			expression(0);
			setState(133);
			match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BlockStatementContext extends ParserRuleContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public ForLoopContext forLoop() {
			return getRuleContext(ForLoopContext.class,0);
		}
		public WhileLoopContext whileLoop() {
			return getRuleContext(WhileLoopContext.class,0);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimpParserListener ) ((SlimpParserListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimpParserListener ) ((SlimpParserListener)listener).exitBlockStatement(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_blockStatement);
		try {
			setState(138);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				ifStatement();
				}
				break;
			case KW_FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				forLoop();
				}
				break;
			case KW_WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(137);
				whileLoop();
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode KW_IF() { return getToken(SlimpParser.KW_IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode KW_ELSE() { return getToken(SlimpParser.KW_ELSE, 0); }
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimpParserListener ) ((SlimpParserListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimpParserListener ) ((SlimpParserListener)listener).exitIfStatement(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(KW_IF);
			setState(141);
			expression(0);
			setState(142);
			block();
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_ELSE) {
				{
				setState(143);
				match(KW_ELSE);
				setState(146);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LCURLYBRACE:
					{
					setState(144);
					block();
					}
					break;
				case KW_IF:
					{
					setState(145);
					ifStatement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForLoopContext extends ParserRuleContext {
		public TerminalNode KW_FOR() { return getToken(SlimpParser.KW_FOR, 0); }
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public TerminalNode LARROW() { return getToken(SlimpParser.LARROW, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ForLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimpParserListener ) ((SlimpParserListener)listener).enterForLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimpParserListener ) ((SlimpParserListener)listener).exitForLoop(this);
		}
	}

	public final ForLoopContext forLoop() throws RecognitionException {
		ForLoopContext _localctx = new ForLoopContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_forLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(KW_FOR);
			setState(151);
			pattern();
			setState(152);
			match(LARROW);
			setState(153);
			expression(0);
			setState(154);
			block();
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

	@SuppressWarnings("CheckReturnValue")
	public static class WhileLoopContext extends ParserRuleContext {
		public TerminalNode KW_WHILE() { return getToken(SlimpParser.KW_WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
			if ( listener instanceof SlimpParserListener ) ((SlimpParserListener)listener).enterWhileLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimpParserListener ) ((SlimpParserListener)listener).exitWhileLoop(this);
		}
	}

	public final WhileLoopContext whileLoop() throws RecognitionException {
		WhileLoopContext _localctx = new WhileLoopContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_whileLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(KW_WHILE);
			setState(157);
			expression(0);
			setState(158);
			block();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(SlimpParser.SEMI, 0); }
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimpParserListener ) ((SlimpParserListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimpParserListener ) ((SlimpParserListener)listener).exitExpressionStatement(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			expression(0);
			setState(161);
			match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenthesizedExpressionContext extends ExpressionContext {
		public TerminalNode LPAREN() { return getToken(SlimpParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SlimpParser.RPAREN, 0); }
		public ParenthesizedExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimpParserListener ) ((SlimpParserListener)listener).enterParenthesizedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimpParserListener ) ((SlimpParserListener)listener).exitParenthesizedExpression(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MapExpressionContext extends ExpressionContext {
		public TerminalNode LCURLYBRACE() { return getToken(SlimpParser.LCURLYBRACE, 0); }
		public MapExpressionElementsContext mapExpressionElements() {
			return getRuleContext(MapExpressionElementsContext.class,0);
		}
		public TerminalNode RCURLYBRACE() { return getToken(SlimpParser.RCURLYBRACE, 0); }
		public MapExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimpParserListener ) ((SlimpParserListener)listener).enterMapExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimpParserListener ) ((SlimpParserListener)listener).exitMapExpression(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicalExpressionContext extends ExpressionContext {
		public TerminalNode NOT() { return getToken(SlimpParser.NOT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ANDAND() { return getToken(SlimpParser.ANDAND, 0); }
		public TerminalNode OROR() { return getToken(SlimpParser.OROR, 0); }
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public LogicalExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimpParserListener ) ((SlimpParserListener)listener).enterLogicalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimpParserListener ) ((SlimpParserListener)listener).exitLogicalExpression(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IndexingExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LSQUAREBRACKET() { return getToken(SlimpParser.LSQUAREBRACKET, 0); }
		public TerminalNode RSQUAREBRACKET() { return getToken(SlimpParser.RSQUAREBRACKET, 0); }
		public IndexingExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimpParserListener ) ((SlimpParserListener)listener).enterIndexingExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimpParserListener ) ((SlimpParserListener)listener).exitIndexingExpression(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeCastExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode KW_AS() { return getToken(SlimpParser.KW_AS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeCastExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimpParserListener ) ((SlimpParserListener)listener).enterTypeCastExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimpParserListener ) ((SlimpParserListener)listener).exitTypeCastExpression(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LiteralExpressionContext extends ExpressionContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public LiteralExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimpParserListener ) ((SlimpParserListener)listener).enterLiteralExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimpParserListener ) ((SlimpParserListener)listener).exitLiteralExpression(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TupleExpressionContext extends ExpressionContext {
		public TerminalNode LPAREN() { return getToken(SlimpParser.LPAREN, 0); }
		public ExpressionElementsContext expressionElements() {
			return getRuleContext(ExpressionElementsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SlimpParser.RPAREN, 0); }
		public TupleExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimpParserListener ) ((SlimpParserListener)listener).enterTupleExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimpParserListener ) ((SlimpParserListener)listener).exitTupleExpression(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayExpressionContext extends ExpressionContext {
		public TerminalNode LSQUAREBRACKET() { return getToken(SlimpParser.LSQUAREBRACKET, 0); }
		public ExpressionElementsContext expressionElements() {
			return getRuleContext(ExpressionElementsContext.class,0);
		}
		public TerminalNode RSQUAREBRACKET() { return getToken(SlimpParser.RSQUAREBRACKET, 0); }
		public ArrayExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimpParserListener ) ((SlimpParserListener)listener).enterArrayExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimpParserListener ) ((SlimpParserListener)listener).exitArrayExpression(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RangeExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode DOTDOT() { return getToken(SlimpParser.DOTDOT, 0); }
		public RangeExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimpParserListener ) ((SlimpParserListener)listener).enterRangeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimpParserListener ) ((SlimpParserListener)listener).exitRangeExpression(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArithmeticExpressionContext extends ExpressionContext {
		public TerminalNode MINUS() { return getToken(SlimpParser.MINUS, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArithmeticOperatorContext arithmeticOperator() {
			return getRuleContext(ArithmeticOperatorContext.class,0);
		}
		public ArithmeticExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimpParserListener ) ((SlimpParserListener)listener).enterArithmeticExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimpParserListener ) ((SlimpParserListener)listener).exitArithmeticExpression(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallExpressionContext extends ExpressionContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(SlimpParser.LPAREN, 0); }
		public ExpressionElementsContext expressionElements() {
			return getRuleContext(ExpressionElementsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SlimpParser.RPAREN, 0); }
		public FunctionCallExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimpParserListener ) ((SlimpParserListener)listener).enterFunctionCallExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimpParserListener ) ((SlimpParserListener)listener).exitFunctionCallExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				_localctx = new LiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(164);
				literal();
				}
				break;
			case 2:
				{
				_localctx = new FunctionCallExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(165);
				identifier();
				setState(166);
				match(LPAREN);
				setState(167);
				expressionElements();
				setState(168);
				match(RPAREN);
				}
				break;
			case 3:
				{
				_localctx = new LogicalExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(170);
				match(NOT);
				setState(171);
				expression(10);
				}
				break;
			case 4:
				{
				_localctx = new ArithmeticExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(172);
				match(MINUS);
				setState(173);
				expression(7);
				}
				break;
			case 5:
				{
				_localctx = new ParenthesizedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(174);
				match(LPAREN);
				setState(175);
				expression(0);
				setState(176);
				match(RPAREN);
				}
				break;
			case 6:
				{
				_localctx = new TupleExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(178);
				match(LPAREN);
				setState(179);
				expressionElements();
				setState(180);
				match(RPAREN);
				}
				break;
			case 7:
				{
				_localctx = new ArrayExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(182);
				match(LSQUAREBRACKET);
				setState(183);
				expressionElements();
				setState(184);
				match(RSQUAREBRACKET);
				}
				break;
			case 8:
				{
				_localctx = new MapExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(186);
				match(LCURLYBRACE);
				setState(187);
				mapExpressionElements();
				setState(188);
				match(RCURLYBRACE);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(216);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(214);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new LogicalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(192);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(193);
						_la = _input.LA(1);
						if ( !(_la==ANDAND || _la==OROR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(194);
						expression(10);
						}
						break;
					case 2:
						{
						_localctx = new LogicalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(195);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(196);
						comparisonOperator();
						setState(197);
						expression(9);
						}
						break;
					case 3:
						{
						_localctx = new ArithmeticExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(199);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(200);
						arithmeticOperator();
						setState(201);
						expression(7);
						}
						break;
					case 4:
						{
						_localctx = new RangeExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(203);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(204);
						match(DOTDOT);
						setState(205);
						expression(6);
						}
						break;
					case 5:
						{
						_localctx = new IndexingExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(206);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(207);
						match(LSQUAREBRACKET);
						setState(208);
						expression(0);
						setState(209);
						match(RSQUAREBRACKET);
						}
						break;
					case 6:
						{
						_localctx = new TypeCastExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(211);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(212);
						match(KW_AS);
						setState(213);
						type();
						}
						break;
					}
					} 
				}
				setState(218);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionElementsContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SlimpParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SlimpParser.COMMA, i);
		}
		public ExpressionElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionElements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimpParserListener ) ((SlimpParserListener)listener).enterExpressionElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimpParserListener ) ((SlimpParserListener)listener).exitExpressionElements(this);
		}
	}

	public final ExpressionElementsContext expressionElements() throws RecognitionException {
		ExpressionElementsContext _localctx = new ExpressionElementsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_expressionElements);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(219);
					expression(0);
					setState(220);
					match(COMMA);
					}
					} 
				}
				setState(226);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 23643899165742112L) != 0) {
				{
				setState(227);
				expression(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MapExpressionElementsContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RARROW() { return getTokens(SlimpParser.RARROW); }
		public TerminalNode RARROW(int i) {
			return getToken(SlimpParser.RARROW, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SlimpParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SlimpParser.COMMA, i);
		}
		public MapExpressionElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapExpressionElements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimpParserListener ) ((SlimpParserListener)listener).enterMapExpressionElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimpParserListener ) ((SlimpParserListener)listener).exitMapExpressionElements(this);
		}
	}

	public final MapExpressionElementsContext mapExpressionElements() throws RecognitionException {
		MapExpressionElementsContext _localctx = new MapExpressionElementsContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_mapExpressionElements);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(230);
					expression(0);
					setState(231);
					match(RARROW);
					setState(232);
					expression(0);
					setState(233);
					match(COMMA);
					}
					} 
				}
				setState(239);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 23643899165742112L) != 0) {
				{
				setState(240);
				expression(0);
				setState(241);
				match(RARROW);
				setState(242);
				expression(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonOperatorContext extends ParserRuleContext {
		public TerminalNode EQEQ() { return getToken(SlimpParser.EQEQ, 0); }
		public TerminalNode NE() { return getToken(SlimpParser.NE, 0); }
		public TerminalNode GT() { return getToken(SlimpParser.GT, 0); }
		public TerminalNode LT() { return getToken(SlimpParser.LT, 0); }
		public TerminalNode GE() { return getToken(SlimpParser.GE, 0); }
		public TerminalNode LE() { return getToken(SlimpParser.LE, 0); }
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimpParserListener ) ((SlimpParserListener)listener).enterComparisonOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimpParserListener ) ((SlimpParserListener)listener).exitComparisonOperator(this);
		}
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 2164663517184L) != 0) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArithmeticOperatorContext extends ParserRuleContext {
		public TerminalNode LUS() { return getToken(SlimpParser.LUS, 0); }
		public TerminalNode MINUS() { return getToken(SlimpParser.MINUS, 0); }
		public TerminalNode STAR() { return getToken(SlimpParser.STAR, 0); }
		public TerminalNode SLASH() { return getToken(SlimpParser.SLASH, 0); }
		public TerminalNode SLASHSLASH() { return getToken(SlimpParser.SLASHSLASH, 0); }
		public TerminalNode PERCENT() { return getToken(SlimpParser.PERCENT, 0); }
		public ArithmeticOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimpParserListener ) ((SlimpParserListener)listener).enterArithmeticOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimpParserListener ) ((SlimpParserListener)listener).exitArithmeticOperator(this);
		}
	}

	public final ArithmeticOperatorContext arithmeticOperator() throws RecognitionException {
		ArithmeticOperatorContext _localctx = new ArithmeticOperatorContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_arithmeticOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 1056964608L) != 0) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode INTEGER_LITERAL() { return getToken(SlimpParser.INTEGER_LITERAL, 0); }
		public TerminalNode FLOAT_LITERAL() { return getToken(SlimpParser.FLOAT_LITERAL, 0); }
		public TerminalNode CHAR_LITERAL() { return getToken(SlimpParser.CHAR_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(SlimpParser.STRING_LITERAL, 0); }
		public TerminalNode KW_FALSE() { return getToken(SlimpParser.KW_FALSE, 0); }
		public TerminalNode KW_TRUE() { return getToken(SlimpParser.KW_TRUE, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimpParserListener ) ((SlimpParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimpParserListener ) ((SlimpParserListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 14746656L) != 0) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SlimpParser.IDENTIFIER, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimpParserListener ) ((SlimpParserListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimpParserListener ) ((SlimpParserListener)listener).exitIdentifier(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(IDENTIFIER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypedIdentifierContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(SlimpParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypedIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimpParserListener ) ((SlimpParserListener)listener).enterTypedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimpParserListener ) ((SlimpParserListener)listener).exitTypedIdentifier(this);
		}
	}

	public final TypedIdentifierContext typedIdentifier() throws RecognitionException {
		TypedIdentifierContext _localctx = new TypedIdentifierContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_typedIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			identifier();
			setState(255);
			match(COLON);
			setState(256);
			type();
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	 
		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayTypeContext extends TypeContext {
		public TerminalNode LSQUAREBRACKET() { return getToken(SlimpParser.LSQUAREBRACKET, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(SlimpParser.SEMI, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RSQUAREBRACKET() { return getToken(SlimpParser.RSQUAREBRACKET, 0); }
		public ArrayTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimpParserListener ) ((SlimpParserListener)listener).enterArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimpParserListener ) ((SlimpParserListener)listener).exitArrayType(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeIdentifierContext extends TypeContext {
		public TerminalNode IDENTIFIER() { return getToken(SlimpParser.IDENTIFIER, 0); }
		public TypeIdentifierContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimpParserListener ) ((SlimpParserListener)listener).enterTypeIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimpParserListener ) ((SlimpParserListener)listener).exitTypeIdentifier(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenthesizedTypeContext extends TypeContext {
		public TerminalNode LPAREN() { return getToken(SlimpParser.LPAREN, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SlimpParser.RPAREN, 0); }
		public ParenthesizedTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimpParserListener ) ((SlimpParserListener)listener).enterParenthesizedType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimpParserListener ) ((SlimpParserListener)listener).exitParenthesizedType(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TupleTypeContext extends TypeContext {
		public TerminalNode LPAREN() { return getToken(SlimpParser.LPAREN, 0); }
		public TupleTypeElementsContext tupleTypeElements() {
			return getRuleContext(TupleTypeElementsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SlimpParser.RPAREN, 0); }
		public TupleTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimpParserListener ) ((SlimpParserListener)listener).enterTupleType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimpParserListener ) ((SlimpParserListener)listener).exitTupleType(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MapTypeContext extends TypeContext {
		public TerminalNode LCURLYBRACE() { return getToken(SlimpParser.LCURLYBRACE, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TerminalNode RARROW() { return getToken(SlimpParser.RARROW, 0); }
		public TerminalNode RCURLYBRACE() { return getToken(SlimpParser.RCURLYBRACE, 0); }
		public MapTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimpParserListener ) ((SlimpParserListener)listener).enterMapType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimpParserListener ) ((SlimpParserListener)listener).exitMapType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_type);
		try {
			setState(279);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				_localctx = new TypeIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(258);
				match(IDENTIFIER);
				}
				break;
			case 2:
				_localctx = new ParenthesizedTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(259);
				match(LPAREN);
				setState(260);
				type();
				setState(261);
				match(RPAREN);
				}
				break;
			case 3:
				_localctx = new TupleTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(263);
				match(LPAREN);
				setState(264);
				tupleTypeElements();
				setState(265);
				match(RPAREN);
				}
				break;
			case 4:
				_localctx = new ArrayTypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(267);
				match(LSQUAREBRACKET);
				setState(268);
				type();
				setState(269);
				match(SEMI);
				setState(270);
				expression(0);
				setState(271);
				match(RSQUAREBRACKET);
				}
				break;
			case 5:
				_localctx = new MapTypeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(273);
				match(LCURLYBRACE);
				setState(274);
				type();
				setState(275);
				match(RARROW);
				setState(276);
				type();
				setState(277);
				match(RCURLYBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TupleTypeElementsContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SlimpParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SlimpParser.COMMA, i);
		}
		public TupleTypeElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tupleTypeElements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimpParserListener ) ((SlimpParserListener)listener).enterTupleTypeElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimpParserListener ) ((SlimpParserListener)listener).exitTupleTypeElements(this);
		}
	}

	public final TupleTypeElementsContext tupleTypeElements() throws RecognitionException {
		TupleTypeElementsContext _localctx = new TupleTypeElementsContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_tupleTypeElements);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(281);
					type();
					setState(282);
					match(COMMA);
					}
					} 
				}
				setState(288);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			setState(290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 23643898043699200L) != 0) {
				{
				setState(289);
				type();
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

	@SuppressWarnings("CheckReturnValue")
	public static class PatternContext extends ParserRuleContext {
		public PatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern; }
	 
		public PatternContext() { }
		public void copyFrom(PatternContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TuplePatternContext extends PatternContext {
		public TerminalNode LPAREN() { return getToken(SlimpParser.LPAREN, 0); }
		public PatternElementsContext patternElements() {
			return getRuleContext(PatternElementsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SlimpParser.RPAREN, 0); }
		public TuplePatternContext(PatternContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimpParserListener ) ((SlimpParserListener)listener).enterTuplePattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimpParserListener ) ((SlimpParserListener)listener).exitTuplePattern(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayPatternContext extends PatternContext {
		public TerminalNode LSQUAREBRACKET() { return getToken(SlimpParser.LSQUAREBRACKET, 0); }
		public PatternElementsContext patternElements() {
			return getRuleContext(PatternElementsContext.class,0);
		}
		public TerminalNode RSQUAREBRACKET() { return getToken(SlimpParser.RSQUAREBRACKET, 0); }
		public ArrayPatternContext(PatternContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimpParserListener ) ((SlimpParserListener)listener).enterArrayPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimpParserListener ) ((SlimpParserListener)listener).exitArrayPattern(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WildCardPatternContext extends PatternContext {
		public TerminalNode UNDERSCORE() { return getToken(SlimpParser.UNDERSCORE, 0); }
		public WildCardPatternContext(PatternContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimpParserListener ) ((SlimpParserListener)listener).enterWildCardPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimpParserListener ) ((SlimpParserListener)listener).exitWildCardPattern(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UntypedPatternIdentifierContext extends PatternContext {
		public TerminalNode IDENTIFIER() { return getToken(SlimpParser.IDENTIFIER, 0); }
		public UntypedPatternIdentifierContext(PatternContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimpParserListener ) ((SlimpParserListener)listener).enterUntypedPatternIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimpParserListener ) ((SlimpParserListener)listener).exitUntypedPatternIdentifier(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenthesizedPatternContext extends PatternContext {
		public TerminalNode LPAREN() { return getToken(SlimpParser.LPAREN, 0); }
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SlimpParser.RPAREN, 0); }
		public ParenthesizedPatternContext(PatternContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimpParserListener ) ((SlimpParserListener)listener).enterParenthesizedPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimpParserListener ) ((SlimpParserListener)listener).exitParenthesizedPattern(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypedPatternIdentifierContext extends PatternContext {
		public TerminalNode IDENTIFIER() { return getToken(SlimpParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(SlimpParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypedPatternIdentifierContext(PatternContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimpParserListener ) ((SlimpParserListener)listener).enterTypedPatternIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimpParserListener ) ((SlimpParserListener)listener).exitTypedPatternIdentifier(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PatternLiteralContext extends PatternContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public PatternLiteralContext(PatternContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimpParserListener ) ((SlimpParserListener)listener).enterPatternLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimpParserListener ) ((SlimpParserListener)listener).exitPatternLiteral(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MapPatternContext extends PatternContext {
		public TerminalNode LCURLYBRACE() { return getToken(SlimpParser.LCURLYBRACE, 0); }
		public MapPatternElementsContext mapPatternElements() {
			return getRuleContext(MapPatternElementsContext.class,0);
		}
		public TerminalNode RCURLYBRACE() { return getToken(SlimpParser.RCURLYBRACE, 0); }
		public MapPatternContext(PatternContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimpParserListener ) ((SlimpParserListener)listener).enterMapPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimpParserListener ) ((SlimpParserListener)listener).exitMapPattern(this);
		}
	}

	public final PatternContext pattern() throws RecognitionException {
		PatternContext _localctx = new PatternContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_pattern);
		try {
			setState(314);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				_localctx = new PatternLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(292);
				literal();
				}
				break;
			case 2:
				_localctx = new UntypedPatternIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(293);
				match(IDENTIFIER);
				}
				break;
			case 3:
				_localctx = new TypedPatternIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(294);
				match(IDENTIFIER);
				setState(295);
				match(COLON);
				setState(296);
				type();
				}
				break;
			case 4:
				_localctx = new WildCardPatternContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(297);
				match(UNDERSCORE);
				}
				break;
			case 5:
				_localctx = new ParenthesizedPatternContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(298);
				match(LPAREN);
				setState(299);
				pattern();
				setState(300);
				match(RPAREN);
				}
				break;
			case 6:
				_localctx = new TuplePatternContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(302);
				match(LPAREN);
				setState(303);
				patternElements();
				setState(304);
				match(RPAREN);
				}
				break;
			case 7:
				_localctx = new ArrayPatternContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(306);
				match(LSQUAREBRACKET);
				setState(307);
				patternElements();
				setState(308);
				match(RSQUAREBRACKET);
				}
				break;
			case 8:
				_localctx = new MapPatternContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(310);
				match(LCURLYBRACE);
				setState(311);
				mapPatternElements();
				setState(312);
				match(RCURLYBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PatternElementsContext extends ParserRuleContext {
		public List<PatternContext> pattern() {
			return getRuleContexts(PatternContext.class);
		}
		public PatternContext pattern(int i) {
			return getRuleContext(PatternContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SlimpParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SlimpParser.COMMA, i);
		}
		public PatternElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_patternElements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimpParserListener ) ((SlimpParserListener)listener).enterPatternElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimpParserListener ) ((SlimpParserListener)listener).exitPatternElements(this);
		}
	}

	public final PatternElementsContext patternElements() throws RecognitionException {
		PatternElementsContext _localctx = new PatternElementsContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_patternElements);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(316);
					pattern();
					setState(317);
					match(COMMA);
					}
					} 
				}
				setState(323);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			setState(325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 23646097081701408L) != 0) {
				{
				setState(324);
				pattern();
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

	@SuppressWarnings("CheckReturnValue")
	public static class MapPatternElementsContext extends ParserRuleContext {
		public List<PatternContext> pattern() {
			return getRuleContexts(PatternContext.class);
		}
		public PatternContext pattern(int i) {
			return getRuleContext(PatternContext.class,i);
		}
		public List<TerminalNode> RARROW() { return getTokens(SlimpParser.RARROW); }
		public TerminalNode RARROW(int i) {
			return getToken(SlimpParser.RARROW, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SlimpParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SlimpParser.COMMA, i);
		}
		public MapPatternElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapPatternElements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SlimpParserListener ) ((SlimpParserListener)listener).enterMapPatternElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SlimpParserListener ) ((SlimpParserListener)listener).exitMapPatternElements(this);
		}
	}

	public final MapPatternElementsContext mapPatternElements() throws RecognitionException {
		MapPatternElementsContext _localctx = new MapPatternElementsContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_mapPatternElements);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(327);
					pattern();
					setState(328);
					match(RARROW);
					setState(329);
					pattern();
					setState(330);
					match(COMMA);
					}
					} 
				}
				setState(336);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			}
			setState(341);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 23646097081701408L) != 0) {
				{
				setState(337);
				pattern();
				setState(338);
				match(RARROW);
				setState(339);
				pattern();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 16:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 12);
		case 5:
			return precpred(_ctx, 11);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00017\u0158\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0001\u0000\u0005\u0000<\b\u0000\n\u0000\f\u0000"+
		"?\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0003\u0001"+
		"E\b\u0001\u0001\u0002\u0001\u0002\u0003\u0002I\b\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0003\u0003O\b\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003T\b\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0005\u0004[\b\u0004\n\u0004\f\u0004^\t"+
		"\u0004\u0001\u0004\u0003\u0004a\b\u0004\u0001\u0005\u0003\u0005d\b\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0005\u0007l\b\u0007\n\u0007\f\u0007o\t\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0003\b|\b\b\u0001\b\u0003\b\u007f\b\b\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b"+
		"\u008b\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f"+
		"\u0093\b\f\u0003\f\u0095\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00bf\b\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u00d7\b\u0010"+
		"\n\u0010\f\u0010\u00da\t\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0005"+
		"\u0011\u00df\b\u0011\n\u0011\f\u0011\u00e2\t\u0011\u0001\u0011\u0003\u0011"+
		"\u00e5\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0005\u0012\u00ec\b\u0012\n\u0012\f\u0012\u00ef\t\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u00f5\b\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0003\u0018\u0118\b\u0018\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0005\u0019\u011d\b\u0019\n\u0019\f\u0019\u0120\t\u0019\u0001\u0019"+
		"\u0003\u0019\u0123\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0003\u001a\u013b\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0005\u001b"+
		"\u0140\b\u001b\n\u001b\f\u001b\u0143\t\u001b\u0001\u001b\u0003\u001b\u0146"+
		"\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0005"+
		"\u001c\u014d\b\u001c\n\u001c\f\u001c\u0150\t\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0003\u001c\u0156\b\u001c\u0001\u001c\u0000\u0001"+
		" \u001d\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*,.02468\u0000\u0004\u0001\u0000 !\u0001\u0000"+
		"#(\u0001\u0000\u0018\u001d\u0004\u0000\u0005\u0005\n\n\u0010\u0010\u0015"+
		"\u0017\u0170\u0000=\u0001\u0000\u0000\u0000\u0002D\u0001\u0000\u0000\u0000"+
		"\u0004H\u0001\u0000\u0000\u0000\u0006J\u0001\u0000\u0000\u0000\bW\u0001"+
		"\u0000\u0000\u0000\nc\u0001\u0000\u0000\u0000\fg\u0001\u0000\u0000\u0000"+
		"\u000ei\u0001\u0000\u0000\u0000\u0010~\u0001\u0000\u0000\u0000\u0012\u0080"+
		"\u0001\u0000\u0000\u0000\u0014\u0082\u0001\u0000\u0000\u0000\u0016\u008a"+
		"\u0001\u0000\u0000\u0000\u0018\u008c\u0001\u0000\u0000\u0000\u001a\u0096"+
		"\u0001\u0000\u0000\u0000\u001c\u009c\u0001\u0000\u0000\u0000\u001e\u00a0"+
		"\u0001\u0000\u0000\u0000 \u00be\u0001\u0000\u0000\u0000\"\u00e0\u0001"+
		"\u0000\u0000\u0000$\u00ed\u0001\u0000\u0000\u0000&\u00f6\u0001\u0000\u0000"+
		"\u0000(\u00f8\u0001\u0000\u0000\u0000*\u00fa\u0001\u0000\u0000\u0000,"+
		"\u00fc\u0001\u0000\u0000\u0000.\u00fe\u0001\u0000\u0000\u00000\u0117\u0001"+
		"\u0000\u0000\u00002\u011e\u0001\u0000\u0000\u00004\u013a\u0001\u0000\u0000"+
		"\u00006\u0141\u0001\u0000\u0000\u00008\u014e\u0001\u0000\u0000\u0000:"+
		"<\u0003\u0002\u0001\u0000;:\u0001\u0000\u0000\u0000<?\u0001\u0000\u0000"+
		"\u0000=;\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000>@\u0001\u0000"+
		"\u0000\u0000?=\u0001\u0000\u0000\u0000@A\u0005\u0000\u0000\u0001A\u0001"+
		"\u0001\u0000\u0000\u0000BE\u0003\u0004\u0002\u0000CE\u0003\u0006\u0003"+
		"\u0000DB\u0001\u0000\u0000\u0000DC\u0001\u0000\u0000\u0000E\u0003\u0001"+
		"\u0000\u0000\u0000FI\u0003\u0012\t\u0000GI\u0003\u0014\n\u0000HF\u0001"+
		"\u0000\u0000\u0000HG\u0001\u0000\u0000\u0000I\u0005\u0001\u0000\u0000"+
		"\u0000JK\u0005\u0006\u0000\u0000KL\u0003,\u0016\u0000LN\u00056\u0000\u0000"+
		"MO\u0003\b\u0004\u0000NM\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000"+
		"OP\u0001\u0000\u0000\u0000PS\u00057\u0000\u0000QR\u0005.\u0000\u0000R"+
		"T\u0003\f\u0006\u0000SQ\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000"+
		"TU\u0001\u0000\u0000\u0000UV\u0003\u000e\u0007\u0000V\u0007\u0001\u0000"+
		"\u0000\u0000W\\\u0003\n\u0005\u0000XY\u0005,\u0000\u0000Y[\u0003\n\u0005"+
		"\u0000ZX\u0001\u0000\u0000\u0000[^\u0001\u0000\u0000\u0000\\Z\u0001\u0000"+
		"\u0000\u0000\\]\u0001\u0000\u0000\u0000]`\u0001\u0000\u0000\u0000^\\\u0001"+
		"\u0000\u0000\u0000_a\u0005,\u0000\u0000`_\u0001\u0000\u0000\u0000`a\u0001"+
		"\u0000\u0000\u0000a\t\u0001\u0000\u0000\u0000bd\u0005\u001f\u0000\u0000"+
		"cb\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000de\u0001\u0000\u0000"+
		"\u0000ef\u0003.\u0017\u0000f\u000b\u0001\u0000\u0000\u0000gh\u00030\u0018"+
		"\u0000h\r\u0001\u0000\u0000\u0000im\u00052\u0000\u0000jl\u0003\u0010\b"+
		"\u0000kj\u0001\u0000\u0000\u0000lo\u0001\u0000\u0000\u0000mk\u0001\u0000"+
		"\u0000\u0000mn\u0001\u0000\u0000\u0000np\u0001\u0000\u0000\u0000om\u0001"+
		"\u0000\u0000\u0000pq\u00053\u0000\u0000q\u000f\u0001\u0000\u0000\u0000"+
		"r\u007f\u0005-\u0000\u0000s\u007f\u0003\u0012\t\u0000t\u007f\u0003\u0014"+
		"\n\u0000u\u007f\u0003\u0016\u000b\u0000v\u007f\u0003\u001e\u000f\u0000"+
		"wx\u0005\t\u0000\u0000x|\u0003 \u0010\u0000y|\u0005\u0002\u0000\u0000"+
		"z|\u0005\u0003\u0000\u0000{w\u0001\u0000\u0000\u0000{y\u0001\u0000\u0000"+
		"\u0000{z\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000}\u007f\u0005"+
		"-\u0000\u0000~r\u0001\u0000\u0000\u0000~s\u0001\u0000\u0000\u0000~t\u0001"+
		"\u0000\u0000\u0000~u\u0001\u0000\u0000\u0000~v\u0001\u0000\u0000\u0000"+
		"~{\u0001\u0000\u0000\u0000\u007f\u0011\u0001\u0000\u0000\u0000\u0080\u0081"+
		"\u0003.\u0017\u0000\u0081\u0013\u0001\u0000\u0000\u0000\u0082\u0083\u0003"+
		"4\u001a\u0000\u0083\u0084\u0005\"\u0000\u0000\u0084\u0085\u0003 \u0010"+
		"\u0000\u0085\u0086\u0005-\u0000\u0000\u0086\u0015\u0001\u0000\u0000\u0000"+
		"\u0087\u008b\u0003\u0018\f\u0000\u0088\u008b\u0003\u001a\r\u0000\u0089"+
		"\u008b\u0003\u001c\u000e\u0000\u008a\u0087\u0001\u0000\u0000\u0000\u008a"+
		"\u0088\u0001\u0000\u0000\u0000\u008a\u0089\u0001\u0000\u0000\u0000\u008b"+
		"\u0017\u0001\u0000\u0000\u0000\u008c\u008d\u0005\b\u0000\u0000\u008d\u008e"+
		"\u0003 \u0010\u0000\u008e\u0094\u0003\u000e\u0007\u0000\u008f\u0092\u0005"+
		"\u0004\u0000\u0000\u0090\u0093\u0003\u000e\u0007\u0000\u0091\u0093\u0003"+
		"\u0018\f\u0000\u0092\u0090\u0001\u0000\u0000\u0000\u0092\u0091\u0001\u0000"+
		"\u0000\u0000\u0093\u0095\u0001\u0000\u0000\u0000\u0094\u008f\u0001\u0000"+
		"\u0000\u0000\u0094\u0095\u0001\u0000\u0000\u0000\u0095\u0019\u0001\u0000"+
		"\u0000\u0000\u0096\u0097\u0005\u0007\u0000\u0000\u0097\u0098\u00034\u001a"+
		"\u0000\u0098\u0099\u0005/\u0000\u0000\u0099\u009a\u0003 \u0010\u0000\u009a"+
		"\u009b\u0003\u000e\u0007\u0000\u009b\u001b\u0001\u0000\u0000\u0000\u009c"+
		"\u009d\u0005\u000b\u0000\u0000\u009d\u009e\u0003 \u0010\u0000\u009e\u009f"+
		"\u0003\u000e\u0007\u0000\u009f\u001d\u0001\u0000\u0000\u0000\u00a0\u00a1"+
		"\u0003 \u0010\u0000\u00a1\u00a2\u0005-\u0000\u0000\u00a2\u001f\u0001\u0000"+
		"\u0000\u0000\u00a3\u00a4\u0006\u0010\uffff\uffff\u0000\u00a4\u00bf\u0003"+
		"*\u0015\u0000\u00a5\u00a6\u0003,\u0016\u0000\u00a6\u00a7\u00056\u0000"+
		"\u0000\u00a7\u00a8\u0003\"\u0011\u0000\u00a8\u00a9\u00057\u0000\u0000"+
		"\u00a9\u00bf\u0001\u0000\u0000\u0000\u00aa\u00ab\u0005\u001e\u0000\u0000"+
		"\u00ab\u00bf\u0003 \u0010\n\u00ac\u00ad\u0005\u0019\u0000\u0000\u00ad"+
		"\u00bf\u0003 \u0010\u0007\u00ae\u00af\u00056\u0000\u0000\u00af\u00b0\u0003"+
		" \u0010\u0000\u00b0\u00b1\u00057\u0000\u0000\u00b1\u00bf\u0001\u0000\u0000"+
		"\u0000\u00b2\u00b3\u00056\u0000\u0000\u00b3\u00b4\u0003\"\u0011\u0000"+
		"\u00b4\u00b5\u00057\u0000\u0000\u00b5\u00bf\u0001\u0000\u0000\u0000\u00b6"+
		"\u00b7\u00054\u0000\u0000\u00b7\u00b8\u0003\"\u0011\u0000\u00b8\u00b9"+
		"\u00055\u0000\u0000\u00b9\u00bf\u0001\u0000\u0000\u0000\u00ba\u00bb\u0005"+
		"2\u0000\u0000\u00bb\u00bc\u0003$\u0012\u0000\u00bc\u00bd\u00053\u0000"+
		"\u0000\u00bd\u00bf\u0001\u0000\u0000\u0000\u00be\u00a3\u0001\u0000\u0000"+
		"\u0000\u00be\u00a5\u0001\u0000\u0000\u0000\u00be\u00aa\u0001\u0000\u0000"+
		"\u0000\u00be\u00ac\u0001\u0000\u0000\u0000\u00be\u00ae\u0001\u0000\u0000"+
		"\u0000\u00be\u00b2\u0001\u0000\u0000\u0000\u00be\u00b6\u0001\u0000\u0000"+
		"\u0000\u00be\u00ba\u0001\u0000\u0000\u0000\u00bf\u00d8\u0001\u0000\u0000"+
		"\u0000\u00c0\u00c1\n\t\u0000\u0000\u00c1\u00c2\u0007\u0000\u0000\u0000"+
		"\u00c2\u00d7\u0003 \u0010\n\u00c3\u00c4\n\b\u0000\u0000\u00c4\u00c5\u0003"+
		"&\u0013\u0000\u00c5\u00c6\u0003 \u0010\t\u00c6\u00d7\u0001\u0000\u0000"+
		"\u0000\u00c7\u00c8\n\u0006\u0000\u0000\u00c8\u00c9\u0003(\u0014\u0000"+
		"\u00c9\u00ca\u0003 \u0010\u0007\u00ca\u00d7\u0001\u0000\u0000\u0000\u00cb"+
		"\u00cc\n\u0005\u0000\u0000\u00cc\u00cd\u0005+\u0000\u0000\u00cd\u00d7"+
		"\u0003 \u0010\u0006\u00ce\u00cf\n\f\u0000\u0000\u00cf\u00d0\u00054\u0000"+
		"\u0000\u00d0\u00d1\u0003 \u0010\u0000\u00d1\u00d2\u00055\u0000\u0000\u00d2"+
		"\u00d7\u0001\u0000\u0000\u0000\u00d3\u00d4\n\u000b\u0000\u0000\u00d4\u00d5"+
		"\u0005\u0001\u0000\u0000\u00d5\u00d7\u00030\u0018\u0000\u00d6\u00c0\u0001"+
		"\u0000\u0000\u0000\u00d6\u00c3\u0001\u0000\u0000\u0000\u00d6\u00c7\u0001"+
		"\u0000\u0000\u0000\u00d6\u00cb\u0001\u0000\u0000\u0000\u00d6\u00ce\u0001"+
		"\u0000\u0000\u0000\u00d6\u00d3\u0001\u0000\u0000\u0000\u00d7\u00da\u0001"+
		"\u0000\u0000\u0000\u00d8\u00d6\u0001\u0000\u0000\u0000\u00d8\u00d9\u0001"+
		"\u0000\u0000\u0000\u00d9!\u0001\u0000\u0000\u0000\u00da\u00d8\u0001\u0000"+
		"\u0000\u0000\u00db\u00dc\u0003 \u0010\u0000\u00dc\u00dd\u0005,\u0000\u0000"+
		"\u00dd\u00df\u0001\u0000\u0000\u0000\u00de\u00db\u0001\u0000\u0000\u0000"+
		"\u00df\u00e2\u0001\u0000\u0000\u0000\u00e0\u00de\u0001\u0000\u0000\u0000"+
		"\u00e0\u00e1\u0001\u0000\u0000\u0000\u00e1\u00e4\u0001\u0000\u0000\u0000"+
		"\u00e2\u00e0\u0001\u0000\u0000\u0000\u00e3\u00e5\u0003 \u0010\u0000\u00e4"+
		"\u00e3\u0001\u0000\u0000\u0000\u00e4\u00e5\u0001\u0000\u0000\u0000\u00e5"+
		"#\u0001\u0000\u0000\u0000\u00e6\u00e7\u0003 \u0010\u0000\u00e7\u00e8\u0005"+
		"0\u0000\u0000\u00e8\u00e9\u0003 \u0010\u0000\u00e9\u00ea\u0005,\u0000"+
		"\u0000\u00ea\u00ec\u0001\u0000\u0000\u0000\u00eb\u00e6\u0001\u0000\u0000"+
		"\u0000\u00ec\u00ef\u0001\u0000\u0000\u0000\u00ed\u00eb\u0001\u0000\u0000"+
		"\u0000\u00ed\u00ee\u0001\u0000\u0000\u0000\u00ee\u00f4\u0001\u0000\u0000"+
		"\u0000\u00ef\u00ed\u0001\u0000\u0000\u0000\u00f0\u00f1\u0003 \u0010\u0000"+
		"\u00f1\u00f2\u00050\u0000\u0000\u00f2\u00f3\u0003 \u0010\u0000\u00f3\u00f5"+
		"\u0001\u0000\u0000\u0000\u00f4\u00f0\u0001\u0000\u0000\u0000\u00f4\u00f5"+
		"\u0001\u0000\u0000\u0000\u00f5%\u0001\u0000\u0000\u0000\u00f6\u00f7\u0007"+
		"\u0001\u0000\u0000\u00f7\'\u0001\u0000\u0000\u0000\u00f8\u00f9\u0007\u0002"+
		"\u0000\u0000\u00f9)\u0001\u0000\u0000\u0000\u00fa\u00fb\u0007\u0003\u0000"+
		"\u0000\u00fb+\u0001\u0000\u0000\u0000\u00fc\u00fd\u0005\f\u0000\u0000"+
		"\u00fd-\u0001\u0000\u0000\u0000\u00fe\u00ff\u0003,\u0016\u0000\u00ff\u0100"+
		"\u0005.\u0000\u0000\u0100\u0101\u00030\u0018\u0000\u0101/\u0001\u0000"+
		"\u0000\u0000\u0102\u0118\u0005\f\u0000\u0000\u0103\u0104\u00056\u0000"+
		"\u0000\u0104\u0105\u00030\u0018\u0000\u0105\u0106\u00057\u0000\u0000\u0106"+
		"\u0118\u0001\u0000\u0000\u0000\u0107\u0108\u00056\u0000\u0000\u0108\u0109"+
		"\u00032\u0019\u0000\u0109\u010a\u00057\u0000\u0000\u010a\u0118\u0001\u0000"+
		"\u0000\u0000\u010b\u010c\u00054\u0000\u0000\u010c\u010d\u00030\u0018\u0000"+
		"\u010d\u010e\u0005-\u0000\u0000\u010e\u010f\u0003 \u0010\u0000\u010f\u0110"+
		"\u00055\u0000\u0000\u0110\u0118\u0001\u0000\u0000\u0000\u0111\u0112\u0005"+
		"2\u0000\u0000\u0112\u0113\u00030\u0018\u0000\u0113\u0114\u00050\u0000"+
		"\u0000\u0114\u0115\u00030\u0018\u0000\u0115\u0116\u00053\u0000\u0000\u0116"+
		"\u0118\u0001\u0000\u0000\u0000\u0117\u0102\u0001\u0000\u0000\u0000\u0117"+
		"\u0103\u0001\u0000\u0000\u0000\u0117\u0107\u0001\u0000\u0000\u0000\u0117"+
		"\u010b\u0001\u0000\u0000\u0000\u0117\u0111\u0001\u0000\u0000\u0000\u0118"+
		"1\u0001\u0000\u0000\u0000\u0119\u011a\u00030\u0018\u0000\u011a\u011b\u0005"+
		",\u0000\u0000\u011b\u011d\u0001\u0000\u0000\u0000\u011c\u0119\u0001\u0000"+
		"\u0000\u0000\u011d\u0120\u0001\u0000\u0000\u0000\u011e\u011c\u0001\u0000"+
		"\u0000\u0000\u011e\u011f\u0001\u0000\u0000\u0000\u011f\u0122\u0001\u0000"+
		"\u0000\u0000\u0120\u011e\u0001\u0000\u0000\u0000\u0121\u0123\u00030\u0018"+
		"\u0000\u0122\u0121\u0001\u0000\u0000\u0000\u0122\u0123\u0001\u0000\u0000"+
		"\u0000\u01233\u0001\u0000\u0000\u0000\u0124\u013b\u0003*\u0015\u0000\u0125"+
		"\u013b\u0005\f\u0000\u0000\u0126\u0127\u0005\f\u0000\u0000\u0127\u0128"+
		"\u0005.\u0000\u0000\u0128\u013b\u00030\u0018\u0000\u0129\u013b\u0005)"+
		"\u0000\u0000\u012a\u012b\u00056\u0000\u0000\u012b\u012c\u00034\u001a\u0000"+
		"\u012c\u012d\u00057\u0000\u0000\u012d\u013b\u0001\u0000\u0000\u0000\u012e"+
		"\u012f\u00056\u0000\u0000\u012f\u0130\u00036\u001b\u0000\u0130\u0131\u0005"+
		"7\u0000\u0000\u0131\u013b\u0001\u0000\u0000\u0000\u0132\u0133\u00054\u0000"+
		"\u0000\u0133\u0134\u00036\u001b\u0000\u0134\u0135\u00055\u0000\u0000\u0135"+
		"\u013b\u0001\u0000\u0000\u0000\u0136\u0137\u00052\u0000\u0000\u0137\u0138"+
		"\u00038\u001c\u0000\u0138\u0139\u00053\u0000\u0000\u0139\u013b\u0001\u0000"+
		"\u0000\u0000\u013a\u0124\u0001\u0000\u0000\u0000\u013a\u0125\u0001\u0000"+
		"\u0000\u0000\u013a\u0126\u0001\u0000\u0000\u0000\u013a\u0129\u0001\u0000"+
		"\u0000\u0000\u013a\u012a\u0001\u0000\u0000\u0000\u013a\u012e\u0001\u0000"+
		"\u0000\u0000\u013a\u0132\u0001\u0000\u0000\u0000\u013a\u0136\u0001\u0000"+
		"\u0000\u0000\u013b5\u0001\u0000\u0000\u0000\u013c\u013d\u00034\u001a\u0000"+
		"\u013d\u013e\u0005,\u0000\u0000\u013e\u0140\u0001\u0000\u0000\u0000\u013f"+
		"\u013c\u0001\u0000\u0000\u0000\u0140\u0143\u0001\u0000\u0000\u0000\u0141"+
		"\u013f\u0001\u0000\u0000\u0000\u0141\u0142\u0001\u0000\u0000\u0000\u0142"+
		"\u0145\u0001\u0000\u0000\u0000\u0143\u0141\u0001\u0000\u0000\u0000\u0144"+
		"\u0146\u00034\u001a\u0000\u0145\u0144\u0001\u0000\u0000\u0000\u0145\u0146"+
		"\u0001\u0000\u0000\u0000\u01467\u0001\u0000\u0000\u0000\u0147\u0148\u0003"+
		"4\u001a\u0000\u0148\u0149\u00050\u0000\u0000\u0149\u014a\u00034\u001a"+
		"\u0000\u014a\u014b\u0005,\u0000\u0000\u014b\u014d\u0001\u0000\u0000\u0000"+
		"\u014c\u0147\u0001\u0000\u0000\u0000\u014d\u0150\u0001\u0000\u0000\u0000"+
		"\u014e\u014c\u0001\u0000\u0000\u0000\u014e\u014f\u0001\u0000\u0000\u0000"+
		"\u014f\u0155\u0001\u0000\u0000\u0000\u0150\u014e\u0001\u0000\u0000\u0000"+
		"\u0151\u0152\u00034\u001a\u0000\u0152\u0153\u00050\u0000\u0000\u0153\u0154"+
		"\u00034\u001a\u0000\u0154\u0156\u0001\u0000\u0000\u0000\u0155\u0151\u0001"+
		"\u0000\u0000\u0000\u0155\u0156\u0001\u0000\u0000\u0000\u01569\u0001\u0000"+
		"\u0000\u0000\u001d=DHNS\\`cm{~\u008a\u0092\u0094\u00be\u00d6\u00d8\u00e0"+
		"\u00e4\u00ed\u00f4\u0117\u011e\u0122\u013a\u0141\u0145\u014e\u0155";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}