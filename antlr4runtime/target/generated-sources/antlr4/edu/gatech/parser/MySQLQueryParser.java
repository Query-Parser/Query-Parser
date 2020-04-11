// Generated from edu/gatech/parser/MySQLQuery.g4 by ANTLR 4.8
package edu.gatech.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MySQLQueryParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ALL_SYMBOL=1, AND_SYMBOL=2, AVERAGE_SYMBOL=3, AS_SYMBOL=4, ANY_SYMBOL=5, 
		BETWEEN_SYMBOL=6, BY_SYMBOL=7, COUNT_SYMBOL=8, DELETE_SYMBOL=9, DISTINCT_SYMBOL=10, 
		CREATE_SYMBOL=11, EXISTS_SYMBOL=12, LEFT_SYMBOL=13, FROM_SYMBOL=14, GROUP_SYMBOL=15, 
		IN_SYMBOL=16, INNER_SYMBOL=17, INSERT_SYMBOL=18, JOIN_SYMBOL=19, LIKE_SYMBOL=20, 
		MIN_SYMBOL=21, MAX_SYMBOL=22, ORDER_SYMBOL=23, NOT_SYMBOL=24, OR_SYMBOL=25, 
		RIGHT_SYMBOL=26, SELECT_SYMBOL=27, SET_SYMBOL=28, SUM_SYMBOL=29, TABLE_SYMBOL=30, 
		UPDATE_SYMBOL=31, UNION_SYMBOL=32, USING_SYMBOL=33, USE_SYMBOL=34, ON_SYMBOL=35, 
		VALUES_SYMBOL=36, WHERE_SYMBOL=37, EQUAL_OPERATOR=38, ASSIGN_OPERATOR=39, 
		NULL_SAFE_EQUAL_OPERATOR=40, GREATER_OR_EQUAL_OPERATOR=41, GREATER_THAN_OPERATOR=42, 
		LESS_OR_EQUAL_OPERATOR=43, LESS_THAN_OPERATOR=44, NOT_EQUAL_OPERATOR=45, 
		PLUS_OPERATOR=46, MULT_OPERATOR=47, MINUS_OPERATOR=48, DIV_OPERATOR=49, 
		MOD_OPERATOR=50, ARITHMETIC=51, LOGICAL_NOT_OPERATOR=52, BITWISE_NOT_OPERATOR=53, 
		SHIFT_LEFT_OPERATOR=54, SHIFT_RIGHT_OPERATOR=55, LOGICAL_AND_OPERATOR=56, 
		BITWISE_AND_OPERATOR=57, BITWISE_XOR_OPERATOR=58, BITWISE_OR_OPERATOR=59, 
		DOT_SYMBOL=60, COMMA_SYMBOL=61, SEMICOLON_SYMBOL=62, COLON_SYMBOL=63, 
		OPEN_PAR_SYMBOL=64, CLOSE_PAR_SYMBOL=65, OPEN_CURLY_SYMBOL=66, CLOSE_CURLY_SYMBOL=67, 
		UNDERLINE_SYMBOL=68, TRUE_SYMBOL=69, FALSE_SYMBOL=70, ASC_SYMBOL=71, DESC_SYMBOL=72, 
		BEGIN_SYMBOL=73, WORK_SYMBOL=74, LIMIT_SYMBOL=75, PRIMARY_SYMBOL=76, INTO_SYMBOL=77, 
		OUTFILE_SYMBOL=78, DUMPFILE_SYMBOL=79, HAVING_SYMBOL=80, SQ_TEXT=81, DQ_TEXT=82, 
		NAME=83, SINGLE_QUOTE=84, DOUBLE_QUOTE=85, TABLE_NAME=86, WORD=87, WHITESPACE=88, 
		NEWLINE=89, NUMBER=90, NOT_EQUAL2_OPERATOR=91;
	public static final int
		RULE_query = 0, RULE_useClause = 1, RULE_simpleStatement = 2, RULE_selectStatement = 3, 
		RULE_distinctClause = 4, RULE_selectItemList = 5, RULE_selectItem = 6, 
		RULE_sumClause = 7, RULE_countClause = 8, RULE_avgClause = 9, RULE_minClause = 10, 
		RULE_maxClause = 11, RULE_columnName = 12, RULE_selectAlias = 13, RULE_alias = 14, 
		RULE_intoClause = 15, RULE_fromClause = 16, RULE_tableList = 17, RULE_tableItem = 18, 
		RULE_tableName = 19, RULE_whereClause = 20, RULE_likeClause = 21, RULE_inClause = 22, 
		RULE_valuesList = 23, RULE_valueName = 24, RULE_expr = 25, RULE_groupByClause = 26, 
		RULE_orderList = 27, RULE_orderExpression = 28, RULE_direction = 29, RULE_havingClause = 30, 
		RULE_compOp = 31, RULE_orderClause = 32, RULE_deleteStatement = 33, RULE_limitClause = 34, 
		RULE_createStatement = 35, RULE_newTable = 36, RULE_existingTable = 37, 
		RULE_insertStatement = 38, RULE_columnItem = 39, RULE_columnList = 40, 
		RULE_valueItem = 41, RULE_updateStatement = 42, RULE_tableRefList = 43, 
		RULE_assignmentList = 44, RULE_joinClause = 45, RULE_innerJoin = 46, RULE_leftJoin = 47, 
		RULE_rightJoin = 48, RULE_unionClause = 49;
	private static String[] makeRuleNames() {
		return new String[] {
			"query", "useClause", "simpleStatement", "selectStatement", "distinctClause", 
			"selectItemList", "selectItem", "sumClause", "countClause", "avgClause", 
			"minClause", "maxClause", "columnName", "selectAlias", "alias", "intoClause", 
			"fromClause", "tableList", "tableItem", "tableName", "whereClause", "likeClause", 
			"inClause", "valuesList", "valueName", "expr", "groupByClause", "orderList", 
			"orderExpression", "direction", "havingClause", "compOp", "orderClause", 
			"deleteStatement", "limitClause", "createStatement", "newTable", "existingTable", 
			"insertStatement", "columnItem", "columnList", "valueItem", "updateStatement", 
			"tableRefList", "assignmentList", "joinClause", "innerJoin", "leftJoin", 
			"rightJoin", "unionClause"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "'='", "':='", "'<=>'", "'>='", "'>'", "'<='", "'<'", "'!='", 
			"'+'", "'*'", "'-'", "'/'", "'%'", null, "'!'", "'~'", "'<<'", "'>>'", 
			"'&&'", "'&'", "'^'", "'|'", "'.'", "','", "';'", "':'", "'('", "')'", 
			"'{'", "'}'", "'_'", null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "'''", "'\"'", null, null, 
			null, null, null, "'<>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ALL_SYMBOL", "AND_SYMBOL", "AVERAGE_SYMBOL", "AS_SYMBOL", "ANY_SYMBOL", 
			"BETWEEN_SYMBOL", "BY_SYMBOL", "COUNT_SYMBOL", "DELETE_SYMBOL", "DISTINCT_SYMBOL", 
			"CREATE_SYMBOL", "EXISTS_SYMBOL", "LEFT_SYMBOL", "FROM_SYMBOL", "GROUP_SYMBOL", 
			"IN_SYMBOL", "INNER_SYMBOL", "INSERT_SYMBOL", "JOIN_SYMBOL", "LIKE_SYMBOL", 
			"MIN_SYMBOL", "MAX_SYMBOL", "ORDER_SYMBOL", "NOT_SYMBOL", "OR_SYMBOL", 
			"RIGHT_SYMBOL", "SELECT_SYMBOL", "SET_SYMBOL", "SUM_SYMBOL", "TABLE_SYMBOL", 
			"UPDATE_SYMBOL", "UNION_SYMBOL", "USING_SYMBOL", "USE_SYMBOL", "ON_SYMBOL", 
			"VALUES_SYMBOL", "WHERE_SYMBOL", "EQUAL_OPERATOR", "ASSIGN_OPERATOR", 
			"NULL_SAFE_EQUAL_OPERATOR", "GREATER_OR_EQUAL_OPERATOR", "GREATER_THAN_OPERATOR", 
			"LESS_OR_EQUAL_OPERATOR", "LESS_THAN_OPERATOR", "NOT_EQUAL_OPERATOR", 
			"PLUS_OPERATOR", "MULT_OPERATOR", "MINUS_OPERATOR", "DIV_OPERATOR", "MOD_OPERATOR", 
			"ARITHMETIC", "LOGICAL_NOT_OPERATOR", "BITWISE_NOT_OPERATOR", "SHIFT_LEFT_OPERATOR", 
			"SHIFT_RIGHT_OPERATOR", "LOGICAL_AND_OPERATOR", "BITWISE_AND_OPERATOR", 
			"BITWISE_XOR_OPERATOR", "BITWISE_OR_OPERATOR", "DOT_SYMBOL", "COMMA_SYMBOL", 
			"SEMICOLON_SYMBOL", "COLON_SYMBOL", "OPEN_PAR_SYMBOL", "CLOSE_PAR_SYMBOL", 
			"OPEN_CURLY_SYMBOL", "CLOSE_CURLY_SYMBOL", "UNDERLINE_SYMBOL", "TRUE_SYMBOL", 
			"FALSE_SYMBOL", "ASC_SYMBOL", "DESC_SYMBOL", "BEGIN_SYMBOL", "WORK_SYMBOL", 
			"LIMIT_SYMBOL", "PRIMARY_SYMBOL", "INTO_SYMBOL", "OUTFILE_SYMBOL", "DUMPFILE_SYMBOL", 
			"HAVING_SYMBOL", "SQ_TEXT", "DQ_TEXT", "NAME", "SINGLE_QUOTE", "DOUBLE_QUOTE", 
			"TABLE_NAME", "WORD", "WHITESPACE", "NEWLINE", "NUMBER", "NOT_EQUAL2_OPERATOR"
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
	public String getGrammarFileName() { return "MySQLQuery.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MySQLQueryParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class QueryContext extends ParserRuleContext {
		public UseClauseContext useClause() {
			return getRuleContext(UseClauseContext.class,0);
		}
		public SimpleStatementContext simpleStatement() {
			return getRuleContext(SimpleStatementContext.class,0);
		}
		public TerminalNode SEMICOLON_SYMBOL() { return getToken(MySQLQueryParser.SEMICOLON_SYMBOL, 0); }
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLQueryListener ) ((MySQLQueryListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLQueryListener ) ((MySQLQueryListener)listener).exitQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLQueryVisitor ) return ((MySQLQueryVisitor<? extends T>)visitor).visitQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_query);
		try {
			setState(104);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case USE_SYMBOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				useClause();
				}
				break;
			case DELETE_SYMBOL:
			case CREATE_SYMBOL:
			case INSERT_SYMBOL:
			case SELECT_SYMBOL:
			case UPDATE_SYMBOL:
			case OPEN_PAR_SYMBOL:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(101);
				simpleStatement();
				setState(102);
				match(SEMICOLON_SYMBOL);
				}
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

	public static class UseClauseContext extends ParserRuleContext {
		public TerminalNode USE_SYMBOL() { return getToken(MySQLQueryParser.USE_SYMBOL, 0); }
		public TerminalNode WORD() { return getToken(MySQLQueryParser.WORD, 0); }
		public UseClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLQueryListener ) ((MySQLQueryListener)listener).enterUseClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLQueryListener ) ((MySQLQueryListener)listener).exitUseClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLQueryVisitor ) return ((MySQLQueryVisitor<? extends T>)visitor).visitUseClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UseClauseContext useClause() throws RecognitionException {
		UseClauseContext _localctx = new UseClauseContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_useClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(USE_SYMBOL);
			setState(107);
			match(WORD);
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

	public static class SimpleStatementContext extends ParserRuleContext {
		public DeleteStatementContext deleteStatement() {
			return getRuleContext(DeleteStatementContext.class,0);
		}
		public InsertStatementContext insertStatement() {
			return getRuleContext(InsertStatementContext.class,0);
		}
		public SelectStatementContext selectStatement() {
			return getRuleContext(SelectStatementContext.class,0);
		}
		public UpdateStatementContext updateStatement() {
			return getRuleContext(UpdateStatementContext.class,0);
		}
		public CreateStatementContext createStatement() {
			return getRuleContext(CreateStatementContext.class,0);
		}
		public SimpleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLQueryListener ) ((MySQLQueryListener)listener).enterSimpleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLQueryListener ) ((MySQLQueryListener)listener).exitSimpleStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLQueryVisitor ) return ((MySQLQueryVisitor<? extends T>)visitor).visitSimpleStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleStatementContext simpleStatement() throws RecognitionException {
		SimpleStatementContext _localctx = new SimpleStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_simpleStatement);
		try {
			setState(114);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DELETE_SYMBOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				deleteStatement();
				}
				break;
			case INSERT_SYMBOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
				insertStatement();
				}
				break;
			case SELECT_SYMBOL:
			case OPEN_PAR_SYMBOL:
				enterOuterAlt(_localctx, 3);
				{
				setState(111);
				selectStatement();
				}
				break;
			case UPDATE_SYMBOL:
				enterOuterAlt(_localctx, 4);
				{
				setState(112);
				updateStatement();
				}
				break;
			case CREATE_SYMBOL:
				enterOuterAlt(_localctx, 5);
				{
				setState(113);
				createStatement();
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

	public static class SelectStatementContext extends ParserRuleContext {
		public TerminalNode SELECT_SYMBOL() { return getToken(MySQLQueryParser.SELECT_SYMBOL, 0); }
		public SelectItemListContext selectItemList() {
			return getRuleContext(SelectItemListContext.class,0);
		}
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public TerminalNode OPEN_PAR_SYMBOL() { return getToken(MySQLQueryParser.OPEN_PAR_SYMBOL, 0); }
		public DistinctClauseContext distinctClause() {
			return getRuleContext(DistinctClauseContext.class,0);
		}
		public IntoClauseContext intoClause() {
			return getRuleContext(IntoClauseContext.class,0);
		}
		public JoinClauseContext joinClause() {
			return getRuleContext(JoinClauseContext.class,0);
		}
		public UnionClauseContext unionClause() {
			return getRuleContext(UnionClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public GroupByClauseContext groupByClause() {
			return getRuleContext(GroupByClauseContext.class,0);
		}
		public HavingClauseContext havingClause() {
			return getRuleContext(HavingClauseContext.class,0);
		}
		public OrderClauseContext orderClause() {
			return getRuleContext(OrderClauseContext.class,0);
		}
		public TerminalNode CLOSE_PAR_SYMBOL() { return getToken(MySQLQueryParser.CLOSE_PAR_SYMBOL, 0); }
		public SelectStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLQueryListener ) ((MySQLQueryListener)listener).enterSelectStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLQueryListener ) ((MySQLQueryListener)listener).exitSelectStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLQueryVisitor ) return ((MySQLQueryVisitor<? extends T>)visitor).visitSelectStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectStatementContext selectStatement() throws RecognitionException {
		SelectStatementContext _localctx = new SelectStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_selectStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR_SYMBOL) {
				{
				setState(116);
				match(OPEN_PAR_SYMBOL);
				}
			}

			setState(119);
			match(SELECT_SYMBOL);
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DISTINCT_SYMBOL) {
				{
				setState(120);
				distinctClause();
				}
			}

			setState(123);
			selectItemList();
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INTO_SYMBOL) {
				{
				setState(124);
				intoClause();
				}
			}

			setState(127);
			fromClause();
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFT_SYMBOL) | (1L << INNER_SYMBOL) | (1L << RIGHT_SYMBOL))) != 0)) {
				{
				setState(128);
				joinClause();
				}
			}

			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==UNION_SYMBOL) {
				{
				setState(131);
				unionClause();
				}
			}

			setState(135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(134);
				whereClause();
				}
				break;
			}
			setState(138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(137);
				groupByClause();
				}
				break;
			}
			setState(141);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(140);
				havingClause();
				}
				break;
			}
			setState(144);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(143);
				orderClause();
				}
				break;
			}
			setState(147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(146);
				match(CLOSE_PAR_SYMBOL);
				}
				break;
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

	public static class DistinctClauseContext extends ParserRuleContext {
		public TerminalNode DISTINCT_SYMBOL() { return getToken(MySQLQueryParser.DISTINCT_SYMBOL, 0); }
		public DistinctClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_distinctClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLQueryListener ) ((MySQLQueryListener)listener).enterDistinctClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLQueryListener ) ((MySQLQueryListener)listener).exitDistinctClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLQueryVisitor ) return ((MySQLQueryVisitor<? extends T>)visitor).visitDistinctClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DistinctClauseContext distinctClause() throws RecognitionException {
		DistinctClauseContext _localctx = new DistinctClauseContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_distinctClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(DISTINCT_SYMBOL);
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

	public static class SelectItemListContext extends ParserRuleContext {
		public List<SelectItemContext> selectItem() {
			return getRuleContexts(SelectItemContext.class);
		}
		public SelectItemContext selectItem(int i) {
			return getRuleContext(SelectItemContext.class,i);
		}
		public TerminalNode MULT_OPERATOR() { return getToken(MySQLQueryParser.MULT_OPERATOR, 0); }
		public List<TerminalNode> COMMA_SYMBOL() { return getTokens(MySQLQueryParser.COMMA_SYMBOL); }
		public TerminalNode COMMA_SYMBOL(int i) {
			return getToken(MySQLQueryParser.COMMA_SYMBOL, i);
		}
		public SelectItemListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectItemList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLQueryListener ) ((MySQLQueryListener)listener).enterSelectItemList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLQueryListener ) ((MySQLQueryListener)listener).exitSelectItemList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLQueryVisitor ) return ((MySQLQueryVisitor<? extends T>)visitor).visitSelectItemList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectItemListContext selectItemList() throws RecognitionException {
		SelectItemListContext _localctx = new SelectItemListContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_selectItemList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AVERAGE_SYMBOL:
			case COUNT_SYMBOL:
			case FROM_SYMBOL:
			case MIN_SYMBOL:
			case MAX_SYMBOL:
			case SUM_SYMBOL:
			case COMMA_SYMBOL:
			case INTO_SYMBOL:
			case TABLE_NAME:
			case WORD:
				{
				setState(151);
				selectItem();
				}
				break;
			case MULT_OPERATOR:
				{
				setState(152);
				match(MULT_OPERATOR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_SYMBOL) {
				{
				{
				setState(155);
				match(COMMA_SYMBOL);
				setState(156);
				selectItem();
				}
				}
				setState(161);
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

	public static class SelectItemContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public SelectAliasContext selectAlias() {
			return getRuleContext(SelectAliasContext.class,0);
		}
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public SumClauseContext sumClause() {
			return getRuleContext(SumClauseContext.class,0);
		}
		public CountClauseContext countClause() {
			return getRuleContext(CountClauseContext.class,0);
		}
		public AvgClauseContext avgClause() {
			return getRuleContext(AvgClauseContext.class,0);
		}
		public MinClauseContext minClause() {
			return getRuleContext(MinClauseContext.class,0);
		}
		public MaxClauseContext maxClause() {
			return getRuleContext(MaxClauseContext.class,0);
		}
		public SelectItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLQueryListener ) ((MySQLQueryListener)listener).enterSelectItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLQueryListener ) ((MySQLQueryListener)listener).exitSelectItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLQueryVisitor ) return ((MySQLQueryVisitor<? extends T>)visitor).visitSelectItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectItemContext selectItem() throws RecognitionException {
		SelectItemContext _localctx = new SelectItemContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_selectItem);
		int _la;
		try {
			setState(181);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				columnName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(163);
				columnName();
				setState(166);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case AS_SYMBOL:
					{
					setState(164);
					selectAlias();
					}
					break;
				case SQ_TEXT:
				case DQ_TEXT:
				case WORD:
					{
					setState(165);
					alias();
					}
					break;
				case FROM_SYMBOL:
				case COMMA_SYMBOL:
				case INTO_SYMBOL:
					break;
				default:
					break;
				}
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AVERAGE_SYMBOL) | (1L << COUNT_SYMBOL) | (1L << MIN_SYMBOL) | (1L << MAX_SYMBOL) | (1L << SUM_SYMBOL))) != 0)) {
					{
					setState(173);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case SUM_SYMBOL:
						{
						setState(168);
						sumClause();
						}
						break;
					case COUNT_SYMBOL:
						{
						setState(169);
						countClause();
						}
						break;
					case AVERAGE_SYMBOL:
						{
						setState(170);
						avgClause();
						}
						break;
					case MIN_SYMBOL:
						{
						setState(171);
						minClause();
						}
						break;
					case MAX_SYMBOL:
						{
						setState(172);
						maxClause();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(177);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case AS_SYMBOL:
						{
						setState(175);
						selectAlias();
						}
						break;
					case SQ_TEXT:
					case DQ_TEXT:
					case WORD:
						{
						setState(176);
						alias();
						}
						break;
					case FROM_SYMBOL:
					case COMMA_SYMBOL:
					case INTO_SYMBOL:
						break;
					default:
						break;
					}
					}
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

	public static class SumClauseContext extends ParserRuleContext {
		public TerminalNode SUM_SYMBOL() { return getToken(MySQLQueryParser.SUM_SYMBOL, 0); }
		public TerminalNode OPEN_PAR_SYMBOL() { return getToken(MySQLQueryParser.OPEN_PAR_SYMBOL, 0); }
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode CLOSE_PAR_SYMBOL() { return getToken(MySQLQueryParser.CLOSE_PAR_SYMBOL, 0); }
		public SumClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sumClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLQueryListener ) ((MySQLQueryListener)listener).enterSumClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLQueryListener ) ((MySQLQueryListener)listener).exitSumClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLQueryVisitor ) return ((MySQLQueryVisitor<? extends T>)visitor).visitSumClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SumClauseContext sumClause() throws RecognitionException {
		SumClauseContext _localctx = new SumClauseContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_sumClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(SUM_SYMBOL);
			setState(184);
			match(OPEN_PAR_SYMBOL);
			setState(185);
			columnName();
			setState(186);
			match(CLOSE_PAR_SYMBOL);
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

	public static class CountClauseContext extends ParserRuleContext {
		public TerminalNode COUNT_SYMBOL() { return getToken(MySQLQueryParser.COUNT_SYMBOL, 0); }
		public TerminalNode OPEN_PAR_SYMBOL() { return getToken(MySQLQueryParser.OPEN_PAR_SYMBOL, 0); }
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode CLOSE_PAR_SYMBOL() { return getToken(MySQLQueryParser.CLOSE_PAR_SYMBOL, 0); }
		public CountClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_countClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLQueryListener ) ((MySQLQueryListener)listener).enterCountClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLQueryListener ) ((MySQLQueryListener)listener).exitCountClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLQueryVisitor ) return ((MySQLQueryVisitor<? extends T>)visitor).visitCountClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CountClauseContext countClause() throws RecognitionException {
		CountClauseContext _localctx = new CountClauseContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_countClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(COUNT_SYMBOL);
			setState(189);
			match(OPEN_PAR_SYMBOL);
			setState(190);
			columnName();
			setState(191);
			match(CLOSE_PAR_SYMBOL);
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

	public static class AvgClauseContext extends ParserRuleContext {
		public TerminalNode AVERAGE_SYMBOL() { return getToken(MySQLQueryParser.AVERAGE_SYMBOL, 0); }
		public TerminalNode OPEN_PAR_SYMBOL() { return getToken(MySQLQueryParser.OPEN_PAR_SYMBOL, 0); }
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode CLOSE_PAR_SYMBOL() { return getToken(MySQLQueryParser.CLOSE_PAR_SYMBOL, 0); }
		public AvgClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_avgClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLQueryListener ) ((MySQLQueryListener)listener).enterAvgClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLQueryListener ) ((MySQLQueryListener)listener).exitAvgClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLQueryVisitor ) return ((MySQLQueryVisitor<? extends T>)visitor).visitAvgClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AvgClauseContext avgClause() throws RecognitionException {
		AvgClauseContext _localctx = new AvgClauseContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_avgClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(AVERAGE_SYMBOL);
			setState(194);
			match(OPEN_PAR_SYMBOL);
			setState(195);
			columnName();
			setState(196);
			match(CLOSE_PAR_SYMBOL);
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

	public static class MinClauseContext extends ParserRuleContext {
		public TerminalNode MIN_SYMBOL() { return getToken(MySQLQueryParser.MIN_SYMBOL, 0); }
		public TerminalNode OPEN_PAR_SYMBOL() { return getToken(MySQLQueryParser.OPEN_PAR_SYMBOL, 0); }
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode CLOSE_PAR_SYMBOL() { return getToken(MySQLQueryParser.CLOSE_PAR_SYMBOL, 0); }
		public MinClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_minClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLQueryListener ) ((MySQLQueryListener)listener).enterMinClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLQueryListener ) ((MySQLQueryListener)listener).exitMinClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLQueryVisitor ) return ((MySQLQueryVisitor<? extends T>)visitor).visitMinClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MinClauseContext minClause() throws RecognitionException {
		MinClauseContext _localctx = new MinClauseContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_minClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(MIN_SYMBOL);
			setState(199);
			match(OPEN_PAR_SYMBOL);
			setState(200);
			columnName();
			setState(201);
			match(CLOSE_PAR_SYMBOL);
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

	public static class MaxClauseContext extends ParserRuleContext {
		public TerminalNode MAX_SYMBOL() { return getToken(MySQLQueryParser.MAX_SYMBOL, 0); }
		public TerminalNode OPEN_PAR_SYMBOL() { return getToken(MySQLQueryParser.OPEN_PAR_SYMBOL, 0); }
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode CLOSE_PAR_SYMBOL() { return getToken(MySQLQueryParser.CLOSE_PAR_SYMBOL, 0); }
		public MaxClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_maxClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLQueryListener ) ((MySQLQueryListener)listener).enterMaxClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLQueryListener ) ((MySQLQueryListener)listener).exitMaxClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLQueryVisitor ) return ((MySQLQueryVisitor<? extends T>)visitor).visitMaxClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MaxClauseContext maxClause() throws RecognitionException {
		MaxClauseContext _localctx = new MaxClauseContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_maxClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(MAX_SYMBOL);
			setState(204);
			match(OPEN_PAR_SYMBOL);
			setState(205);
			columnName();
			setState(206);
			match(CLOSE_PAR_SYMBOL);
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

	public static class ColumnNameContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(MySQLQueryParser.WORD, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public ColumnNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLQueryListener ) ((MySQLQueryListener)listener).enterColumnName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLQueryListener ) ((MySQLQueryListener)listener).exitColumnName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLQueryVisitor ) return ((MySQLQueryVisitor<? extends T>)visitor).visitColumnName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnNameContext columnName() throws RecognitionException {
		ColumnNameContext _localctx = new ColumnNameContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_columnName);
		try {
			setState(210);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(208);
				match(WORD);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(209);
				tableName();
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

	public static class SelectAliasContext extends ParserRuleContext {
		public TerminalNode AS_SYMBOL() { return getToken(MySQLQueryParser.AS_SYMBOL, 0); }
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public SelectAliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectAlias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLQueryListener ) ((MySQLQueryListener)listener).enterSelectAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLQueryListener ) ((MySQLQueryListener)listener).exitSelectAlias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLQueryVisitor ) return ((MySQLQueryVisitor<? extends T>)visitor).visitSelectAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectAliasContext selectAlias() throws RecognitionException {
		SelectAliasContext _localctx = new SelectAliasContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_selectAlias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(AS_SYMBOL);
			setState(213);
			alias();
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

	public static class AliasContext extends ParserRuleContext {
		public TerminalNode SQ_TEXT() { return getToken(MySQLQueryParser.SQ_TEXT, 0); }
		public TerminalNode DQ_TEXT() { return getToken(MySQLQueryParser.DQ_TEXT, 0); }
		public TerminalNode WORD() { return getToken(MySQLQueryParser.WORD, 0); }
		public AliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLQueryListener ) ((MySQLQueryListener)listener).enterAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLQueryListener ) ((MySQLQueryListener)listener).exitAlias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLQueryVisitor ) return ((MySQLQueryVisitor<? extends T>)visitor).visitAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AliasContext alias() throws RecognitionException {
		AliasContext _localctx = new AliasContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_alias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			_la = _input.LA(1);
			if ( !(((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (SQ_TEXT - 81)) | (1L << (DQ_TEXT - 81)) | (1L << (WORD - 81)))) != 0)) ) {
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

	public static class IntoClauseContext extends ParserRuleContext {
		public TerminalNode INTO_SYMBOL() { return getToken(MySQLQueryParser.INTO_SYMBOL, 0); }
		public TerminalNode OUTFILE_SYMBOL() { return getToken(MySQLQueryParser.OUTFILE_SYMBOL, 0); }
		public TerminalNode DUMPFILE_SYMBOL() { return getToken(MySQLQueryParser.DUMPFILE_SYMBOL, 0); }
		public List<TerminalNode> WORD() { return getTokens(MySQLQueryParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(MySQLQueryParser.WORD, i);
		}
		public TerminalNode SQ_TEXT() { return getToken(MySQLQueryParser.SQ_TEXT, 0); }
		public TerminalNode DQ_TEXT() { return getToken(MySQLQueryParser.DQ_TEXT, 0); }
		public List<TerminalNode> COMMA_SYMBOL() { return getTokens(MySQLQueryParser.COMMA_SYMBOL); }
		public TerminalNode COMMA_SYMBOL(int i) {
			return getToken(MySQLQueryParser.COMMA_SYMBOL, i);
		}
		public IntoClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intoClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLQueryListener ) ((MySQLQueryListener)listener).enterIntoClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLQueryListener ) ((MySQLQueryListener)listener).exitIntoClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLQueryVisitor ) return ((MySQLQueryVisitor<? extends T>)visitor).visitIntoClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntoClauseContext intoClause() throws RecognitionException {
		IntoClauseContext _localctx = new IntoClauseContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_intoClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(INTO_SYMBOL);
			setState(230);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OUTFILE_SYMBOL:
				{
				setState(218);
				match(OUTFILE_SYMBOL);
				setState(219);
				_la = _input.LA(1);
				if ( !(_la==SQ_TEXT || _la==DQ_TEXT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case DUMPFILE_SYMBOL:
				{
				setState(220);
				match(DUMPFILE_SYMBOL);
				setState(221);
				_la = _input.LA(1);
				if ( !(_la==SQ_TEXT || _la==DQ_TEXT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case WORD:
				{
				setState(222);
				match(WORD);
				setState(227);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_SYMBOL) {
					{
					{
					setState(223);
					match(COMMA_SYMBOL);
					setState(224);
					match(WORD);
					}
					}
					setState(229);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class FromClauseContext extends ParserRuleContext {
		public TerminalNode FROM_SYMBOL() { return getToken(MySQLQueryParser.FROM_SYMBOL, 0); }
		public TableListContext tableList() {
			return getRuleContext(TableListContext.class,0);
		}
		public FromClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLQueryListener ) ((MySQLQueryListener)listener).enterFromClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLQueryListener ) ((MySQLQueryListener)listener).exitFromClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLQueryVisitor ) return ((MySQLQueryVisitor<? extends T>)visitor).visitFromClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromClauseContext fromClause() throws RecognitionException {
		FromClauseContext _localctx = new FromClauseContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_fromClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(FROM_SYMBOL);
			setState(233);
			tableList();
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

	public static class TableListContext extends ParserRuleContext {
		public List<TableItemContext> tableItem() {
			return getRuleContexts(TableItemContext.class);
		}
		public TableItemContext tableItem(int i) {
			return getRuleContext(TableItemContext.class,i);
		}
		public List<TerminalNode> COMMA_SYMBOL() { return getTokens(MySQLQueryParser.COMMA_SYMBOL); }
		public TerminalNode COMMA_SYMBOL(int i) {
			return getToken(MySQLQueryParser.COMMA_SYMBOL, i);
		}
		public TableListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLQueryListener ) ((MySQLQueryListener)listener).enterTableList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLQueryListener ) ((MySQLQueryListener)listener).exitTableList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLQueryVisitor ) return ((MySQLQueryVisitor<? extends T>)visitor).visitTableList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableListContext tableList() throws RecognitionException {
		TableListContext _localctx = new TableListContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_tableList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			tableItem();
			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_SYMBOL) {
				{
				{
				setState(236);
				match(COMMA_SYMBOL);
				setState(237);
				tableItem();
				}
				}
				setState(242);
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

	public static class TableItemContext extends ParserRuleContext {
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public SelectAliasContext selectAlias() {
			return getRuleContext(SelectAliasContext.class,0);
		}
		public TableItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLQueryListener ) ((MySQLQueryListener)listener).enterTableItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLQueryListener ) ((MySQLQueryListener)listener).exitTableItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLQueryVisitor ) return ((MySQLQueryVisitor<? extends T>)visitor).visitTableItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableItemContext tableItem() throws RecognitionException {
		TableItemContext _localctx = new TableItemContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_tableItem);
		try {
			setState(250);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(243);
				tableName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(244);
				tableName();
				setState(245);
				alias();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(247);
				tableName();
				setState(248);
				selectAlias();
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

	public static class TableNameContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(MySQLQueryParser.WORD, 0); }
		public TerminalNode TABLE_NAME() { return getToken(MySQLQueryParser.TABLE_NAME, 0); }
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLQueryListener ) ((MySQLQueryListener)listener).enterTableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLQueryListener ) ((MySQLQueryListener)listener).exitTableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLQueryVisitor ) return ((MySQLQueryVisitor<? extends T>)visitor).visitTableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableNameContext tableName() throws RecognitionException {
		TableNameContext _localctx = new TableNameContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_tableName);
		try {
			setState(255);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WORD:
				enterOuterAlt(_localctx, 1);
				{
				setState(252);
				match(WORD);
				}
				break;
			case TABLE_NAME:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(253);
				match(TABLE_NAME);
				setState(254);
				columnName();
				}
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

	public static class WhereClauseContext extends ParserRuleContext {
		public TerminalNode WHERE_SYMBOL() { return getToken(MySQLQueryParser.WHERE_SYMBOL, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public LikeClauseContext likeClause() {
			return getRuleContext(LikeClauseContext.class,0);
		}
		public InClauseContext inClause() {
			return getRuleContext(InClauseContext.class,0);
		}
		public TerminalNode OR_SYMBOL() { return getToken(MySQLQueryParser.OR_SYMBOL, 0); }
		public TerminalNode EXISTS_SYMBOL() { return getToken(MySQLQueryParser.EXISTS_SYMBOL, 0); }
		public SelectStatementContext selectStatement() {
			return getRuleContext(SelectStatementContext.class,0);
		}
		public TerminalNode ANY_SYMBOL() { return getToken(MySQLQueryParser.ANY_SYMBOL, 0); }
		public TerminalNode BETWEEN_SYMBOL() { return getToken(MySQLQueryParser.BETWEEN_SYMBOL, 0); }
		public List<ValueNameContext> valueName() {
			return getRuleContexts(ValueNameContext.class);
		}
		public ValueNameContext valueName(int i) {
			return getRuleContext(ValueNameContext.class,i);
		}
		public TerminalNode AND_SYMBOL() { return getToken(MySQLQueryParser.AND_SYMBOL, 0); }
		public TerminalNode NOT_SYMBOL() { return getToken(MySQLQueryParser.NOT_SYMBOL, 0); }
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLQueryListener ) ((MySQLQueryListener)listener).enterWhereClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLQueryListener ) ((MySQLQueryListener)listener).exitWhereClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLQueryVisitor ) return ((MySQLQueryVisitor<? extends T>)visitor).visitWhereClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_whereClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			match(WHERE_SYMBOL);
			setState(259);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(258);
				expr();
				}
				break;
			}
			setState(262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIKE_SYMBOL) {
				{
				setState(261);
				likeClause();
				}
			}

			setState(265);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(264);
				inClause();
				}
				break;
			}
			setState(283);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ANY_SYMBOL:
			case BETWEEN_SYMBOL:
			case EXISTS_SYMBOL:
			case NOT_SYMBOL:
				{
				setState(279);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case EXISTS_SYMBOL:
				case NOT_SYMBOL:
					{
					{
					setState(268);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NOT_SYMBOL) {
						{
						setState(267);
						match(NOT_SYMBOL);
						}
					}

					setState(270);
					match(EXISTS_SYMBOL);
					setState(271);
					selectStatement();
					}
					}
					break;
				case ANY_SYMBOL:
					{
					{
					setState(272);
					match(ANY_SYMBOL);
					setState(273);
					selectStatement();
					}
					}
					break;
				case BETWEEN_SYMBOL:
					{
					{
					setState(274);
					match(BETWEEN_SYMBOL);
					setState(275);
					valueName();
					setState(276);
					match(AND_SYMBOL);
					setState(277);
					valueName();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case OR_SYMBOL:
				{
				{
				setState(281);
				match(OR_SYMBOL);
				setState(282);
				expr();
				}
				}
				break;
			case GROUP_SYMBOL:
			case ORDER_SYMBOL:
			case WHERE_SYMBOL:
			case SEMICOLON_SYMBOL:
			case CLOSE_PAR_SYMBOL:
			case HAVING_SYMBOL:
			case WORD:
			case NUMBER:
				break;
			default:
				break;
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

	public static class LikeClauseContext extends ParserRuleContext {
		public TerminalNode LIKE_SYMBOL() { return getToken(MySQLQueryParser.LIKE_SYMBOL, 0); }
		public List<TerminalNode> SINGLE_QUOTE() { return getTokens(MySQLQueryParser.SINGLE_QUOTE); }
		public TerminalNode SINGLE_QUOTE(int i) {
			return getToken(MySQLQueryParser.SINGLE_QUOTE, i);
		}
		public TerminalNode WORD() { return getToken(MySQLQueryParser.WORD, 0); }
		public List<TerminalNode> MOD_OPERATOR() { return getTokens(MySQLQueryParser.MOD_OPERATOR); }
		public TerminalNode MOD_OPERATOR(int i) {
			return getToken(MySQLQueryParser.MOD_OPERATOR, i);
		}
		public LikeClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_likeClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLQueryListener ) ((MySQLQueryListener)listener).enterLikeClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLQueryListener ) ((MySQLQueryListener)listener).exitLikeClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLQueryVisitor ) return ((MySQLQueryVisitor<? extends T>)visitor).visitLikeClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LikeClauseContext likeClause() throws RecognitionException {
		LikeClauseContext _localctx = new LikeClauseContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_likeClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			match(LIKE_SYMBOL);
			setState(286);
			match(SINGLE_QUOTE);
			setState(288);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MOD_OPERATOR) {
				{
				setState(287);
				match(MOD_OPERATOR);
				}
			}

			setState(290);
			match(WORD);
			setState(292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MOD_OPERATOR) {
				{
				setState(291);
				match(MOD_OPERATOR);
				}
			}

			setState(294);
			match(SINGLE_QUOTE);
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

	public static class InClauseContext extends ParserRuleContext {
		public TerminalNode IN_SYMBOL() { return getToken(MySQLQueryParser.IN_SYMBOL, 0); }
		public TerminalNode OPEN_PAR_SYMBOL() { return getToken(MySQLQueryParser.OPEN_PAR_SYMBOL, 0); }
		public TerminalNode CLOSE_PAR_SYMBOL() { return getToken(MySQLQueryParser.CLOSE_PAR_SYMBOL, 0); }
		public ValuesListContext valuesList() {
			return getRuleContext(ValuesListContext.class,0);
		}
		public SelectStatementContext selectStatement() {
			return getRuleContext(SelectStatementContext.class,0);
		}
		public TerminalNode NOT_SYMBOL() { return getToken(MySQLQueryParser.NOT_SYMBOL, 0); }
		public InClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLQueryListener ) ((MySQLQueryListener)listener).enterInClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLQueryListener ) ((MySQLQueryListener)listener).exitInClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLQueryVisitor ) return ((MySQLQueryVisitor<? extends T>)visitor).visitInClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InClauseContext inClause() throws RecognitionException {
		InClauseContext _localctx = new InClauseContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_inClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT_SYMBOL) {
				{
				setState(296);
				match(NOT_SYMBOL);
				}
			}

			setState(299);
			match(IN_SYMBOL);
			setState(300);
			match(OPEN_PAR_SYMBOL);
			setState(303);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ARITHMETIC:
			case SQ_TEXT:
			case DQ_TEXT:
			case WORD:
			case NUMBER:
				{
				setState(301);
				valuesList();
				}
				break;
			case SELECT_SYMBOL:
			case OPEN_PAR_SYMBOL:
				{
				setState(302);
				selectStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(305);
			match(CLOSE_PAR_SYMBOL);
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

	public static class ValuesListContext extends ParserRuleContext {
		public List<ValueNameContext> valueName() {
			return getRuleContexts(ValueNameContext.class);
		}
		public ValueNameContext valueName(int i) {
			return getRuleContext(ValueNameContext.class,i);
		}
		public List<TerminalNode> COMMA_SYMBOL() { return getTokens(MySQLQueryParser.COMMA_SYMBOL); }
		public TerminalNode COMMA_SYMBOL(int i) {
			return getToken(MySQLQueryParser.COMMA_SYMBOL, i);
		}
		public ValuesListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valuesList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLQueryListener ) ((MySQLQueryListener)listener).enterValuesList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLQueryListener ) ((MySQLQueryListener)listener).exitValuesList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLQueryVisitor ) return ((MySQLQueryVisitor<? extends T>)visitor).visitValuesList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValuesListContext valuesList() throws RecognitionException {
		ValuesListContext _localctx = new ValuesListContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_valuesList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			valueName();
			setState(312);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_SYMBOL) {
				{
				{
				setState(308);
				match(COMMA_SYMBOL);
				setState(309);
				valueName();
				}
				}
				setState(314);
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

	public static class ValueNameContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(MySQLQueryParser.WORD, 0); }
		public TerminalNode ARITHMETIC() { return getToken(MySQLQueryParser.ARITHMETIC, 0); }
		public TerminalNode NUMBER() { return getToken(MySQLQueryParser.NUMBER, 0); }
		public TerminalNode SQ_TEXT() { return getToken(MySQLQueryParser.SQ_TEXT, 0); }
		public TerminalNode DQ_TEXT() { return getToken(MySQLQueryParser.DQ_TEXT, 0); }
		public ValueNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLQueryListener ) ((MySQLQueryListener)listener).enterValueName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLQueryListener ) ((MySQLQueryListener)listener).exitValueName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLQueryVisitor ) return ((MySQLQueryVisitor<? extends T>)visitor).visitValueName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueNameContext valueName() throws RecognitionException {
		ValueNameContext _localctx = new ValueNameContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_valueName);
		try {
			setState(321);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WORD:
				enterOuterAlt(_localctx, 1);
				{
				setState(315);
				match(WORD);
				}
				break;
			case ARITHMETIC:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(316);
				match(ARITHMETIC);
				setState(317);
				match(NUMBER);
				}
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 3);
				{
				setState(318);
				match(NUMBER);
				}
				break;
			case SQ_TEXT:
				enterOuterAlt(_localctx, 4);
				{
				setState(319);
				match(SQ_TEXT);
				}
				break;
			case DQ_TEXT:
				enterOuterAlt(_localctx, 5);
				{
				setState(320);
				match(DQ_TEXT);
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

	public static class ExprContext extends ParserRuleContext {
		public CompOpContext compOp() {
			return getRuleContext(CompOpContext.class,0);
		}
		public List<TerminalNode> AND_SYMBOL() { return getTokens(MySQLQueryParser.AND_SYMBOL); }
		public TerminalNode AND_SYMBOL(int i) {
			return getToken(MySQLQueryParser.AND_SYMBOL, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TableItemContext> tableItem() {
			return getRuleContexts(TableItemContext.class);
		}
		public TableItemContext tableItem(int i) {
			return getRuleContext(TableItemContext.class,i);
		}
		public List<ColumnNameContext> columnName() {
			return getRuleContexts(ColumnNameContext.class);
		}
		public ColumnNameContext columnName(int i) {
			return getRuleContext(ColumnNameContext.class,i);
		}
		public TerminalNode NUMBER() { return getToken(MySQLQueryParser.NUMBER, 0); }
		public TerminalNode ANY_SYMBOL() { return getToken(MySQLQueryParser.ANY_SYMBOL, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode EQUAL_OPERATOR() { return getToken(MySQLQueryParser.EQUAL_OPERATOR, 0); }
		public TerminalNode NAME() { return getToken(MySQLQueryParser.NAME, 0); }
		public TerminalNode SQ_TEXT() { return getToken(MySQLQueryParser.SQ_TEXT, 0); }
		public TerminalNode DQ_TEXT() { return getToken(MySQLQueryParser.DQ_TEXT, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLQueryListener ) ((MySQLQueryListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLQueryListener ) ((MySQLQueryListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLQueryVisitor ) return ((MySQLQueryVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_expr);
		int _la;
		try {
			int _alt;
			setState(371);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				{
				setState(325);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					setState(323);
					tableItem();
					}
					break;
				case 2:
					{
					setState(324);
					columnName();
					}
					break;
				}
				setState(327);
				compOp();
				setState(333);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
				case 1:
					{
					setState(328);
					match(NUMBER);
					}
					break;
				case 2:
					{
					setState(329);
					tableItem();
					}
					break;
				case 3:
					{
					setState(330);
					columnName();
					}
					break;
				case 4:
					{
					{
					setState(331);
					match(ANY_SYMBOL);
					setState(332);
					query();
					}
					}
					break;
				}
				}
				setState(337);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(335);
					match(AND_SYMBOL);
					setState(336);
					expr();
					}
					break;
				}
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(341);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
				case 1:
					{
					setState(339);
					tableItem();
					}
					break;
				case 2:
					{
					setState(340);
					columnName();
					}
					break;
				}
				setState(343);
				match(EQUAL_OPERATOR);
				setState(344);
				match(NAME);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(348);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
				case 1:
					{
					setState(346);
					tableItem();
					}
					break;
				case 2:
					{
					setState(347);
					columnName();
					}
					break;
				}
				setState(350);
				match(EQUAL_OPERATOR);
				setState(351);
				tableItem();
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				{
				setState(355);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(353);
					tableItem();
					}
					break;
				case 2:
					{
					setState(354);
					columnName();
					}
					break;
				}
				setState(357);
				match(EQUAL_OPERATOR);
				setState(358);
				_la = _input.LA(1);
				if ( !(_la==SQ_TEXT || _la==DQ_TEXT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				setState(364);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(360);
						match(AND_SYMBOL);
						setState(361);
						expr();
						}
						} 
					}
					setState(366);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
				}
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(369);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
				case 1:
					{
					setState(367);
					tableItem();
					}
					break;
				case 2:
					{
					setState(368);
					columnName();
					}
					break;
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

	public static class GroupByClauseContext extends ParserRuleContext {
		public TerminalNode GROUP_SYMBOL() { return getToken(MySQLQueryParser.GROUP_SYMBOL, 0); }
		public TerminalNode BY_SYMBOL() { return getToken(MySQLQueryParser.BY_SYMBOL, 0); }
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public GroupByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupByClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLQueryListener ) ((MySQLQueryListener)listener).enterGroupByClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLQueryListener ) ((MySQLQueryListener)listener).exitGroupByClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLQueryVisitor ) return ((MySQLQueryVisitor<? extends T>)visitor).visitGroupByClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupByClauseContext groupByClause() throws RecognitionException {
		GroupByClauseContext _localctx = new GroupByClauseContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_groupByClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			match(GROUP_SYMBOL);
			setState(374);
			match(BY_SYMBOL);
			setState(375);
			columnName();
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

	public static class OrderListContext extends ParserRuleContext {
		public List<OrderExpressionContext> orderExpression() {
			return getRuleContexts(OrderExpressionContext.class);
		}
		public OrderExpressionContext orderExpression(int i) {
			return getRuleContext(OrderExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA_SYMBOL() { return getTokens(MySQLQueryParser.COMMA_SYMBOL); }
		public TerminalNode COMMA_SYMBOL(int i) {
			return getToken(MySQLQueryParser.COMMA_SYMBOL, i);
		}
		public OrderListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLQueryListener ) ((MySQLQueryListener)listener).enterOrderList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLQueryListener ) ((MySQLQueryListener)listener).exitOrderList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLQueryVisitor ) return ((MySQLQueryVisitor<? extends T>)visitor).visitOrderList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderListContext orderList() throws RecognitionException {
		OrderListContext _localctx = new OrderListContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_orderList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			orderExpression();
			setState(382);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_SYMBOL) {
				{
				{
				setState(378);
				match(COMMA_SYMBOL);
				setState(379);
				orderExpression();
				}
				}
				setState(384);
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

	public static class OrderExpressionContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DirectionContext direction() {
			return getRuleContext(DirectionContext.class,0);
		}
		public OrderExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLQueryListener ) ((MySQLQueryListener)listener).enterOrderExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLQueryListener ) ((MySQLQueryListener)listener).exitOrderExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLQueryVisitor ) return ((MySQLQueryVisitor<? extends T>)visitor).visitOrderExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderExpressionContext orderExpression() throws RecognitionException {
		OrderExpressionContext _localctx = new OrderExpressionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_orderExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			expr();
			setState(387);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC_SYMBOL || _la==DESC_SYMBOL) {
				{
				setState(386);
				direction();
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

	public static class DirectionContext extends ParserRuleContext {
		public TerminalNode ASC_SYMBOL() { return getToken(MySQLQueryParser.ASC_SYMBOL, 0); }
		public TerminalNode DESC_SYMBOL() { return getToken(MySQLQueryParser.DESC_SYMBOL, 0); }
		public DirectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_direction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLQueryListener ) ((MySQLQueryListener)listener).enterDirection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLQueryListener ) ((MySQLQueryListener)listener).exitDirection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLQueryVisitor ) return ((MySQLQueryVisitor<? extends T>)visitor).visitDirection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DirectionContext direction() throws RecognitionException {
		DirectionContext _localctx = new DirectionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_direction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			_la = _input.LA(1);
			if ( !(_la==ASC_SYMBOL || _la==DESC_SYMBOL) ) {
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

	public static class HavingClauseContext extends ParserRuleContext {
		public TerminalNode HAVING_SYMBOL() { return getToken(MySQLQueryParser.HAVING_SYMBOL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public HavingClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_havingClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLQueryListener ) ((MySQLQueryListener)listener).enterHavingClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLQueryListener ) ((MySQLQueryListener)listener).exitHavingClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLQueryVisitor ) return ((MySQLQueryVisitor<? extends T>)visitor).visitHavingClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HavingClauseContext havingClause() throws RecognitionException {
		HavingClauseContext _localctx = new HavingClauseContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_havingClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			match(HAVING_SYMBOL);
			setState(392);
			expr();
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

	public static class CompOpContext extends ParserRuleContext {
		public TerminalNode EQUAL_OPERATOR() { return getToken(MySQLQueryParser.EQUAL_OPERATOR, 0); }
		public TerminalNode NULL_SAFE_EQUAL_OPERATOR() { return getToken(MySQLQueryParser.NULL_SAFE_EQUAL_OPERATOR, 0); }
		public TerminalNode GREATER_OR_EQUAL_OPERATOR() { return getToken(MySQLQueryParser.GREATER_OR_EQUAL_OPERATOR, 0); }
		public TerminalNode GREATER_THAN_OPERATOR() { return getToken(MySQLQueryParser.GREATER_THAN_OPERATOR, 0); }
		public TerminalNode LESS_OR_EQUAL_OPERATOR() { return getToken(MySQLQueryParser.LESS_OR_EQUAL_OPERATOR, 0); }
		public TerminalNode LESS_THAN_OPERATOR() { return getToken(MySQLQueryParser.LESS_THAN_OPERATOR, 0); }
		public TerminalNode NOT_EQUAL_OPERATOR() { return getToken(MySQLQueryParser.NOT_EQUAL_OPERATOR, 0); }
		public CompOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLQueryListener ) ((MySQLQueryListener)listener).enterCompOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLQueryListener ) ((MySQLQueryListener)listener).exitCompOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLQueryVisitor ) return ((MySQLQueryVisitor<? extends T>)visitor).visitCompOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompOpContext compOp() throws RecognitionException {
		CompOpContext _localctx = new CompOpContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_compOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL_OPERATOR) | (1L << NULL_SAFE_EQUAL_OPERATOR) | (1L << GREATER_OR_EQUAL_OPERATOR) | (1L << GREATER_THAN_OPERATOR) | (1L << LESS_OR_EQUAL_OPERATOR) | (1L << LESS_THAN_OPERATOR) | (1L << NOT_EQUAL_OPERATOR))) != 0)) ) {
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

	public static class OrderClauseContext extends ParserRuleContext {
		public TerminalNode ORDER_SYMBOL() { return getToken(MySQLQueryParser.ORDER_SYMBOL, 0); }
		public TerminalNode BY_SYMBOL() { return getToken(MySQLQueryParser.BY_SYMBOL, 0); }
		public OrderListContext orderList() {
			return getRuleContext(OrderListContext.class,0);
		}
		public OrderClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLQueryListener ) ((MySQLQueryListener)listener).enterOrderClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLQueryListener ) ((MySQLQueryListener)listener).exitOrderClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLQueryVisitor ) return ((MySQLQueryVisitor<? extends T>)visitor).visitOrderClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderClauseContext orderClause() throws RecognitionException {
		OrderClauseContext _localctx = new OrderClauseContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_orderClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			match(ORDER_SYMBOL);
			setState(397);
			match(BY_SYMBOL);
			setState(398);
			orderList();
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

	public static class DeleteStatementContext extends ParserRuleContext {
		public TerminalNode DELETE_SYMBOL() { return getToken(MySQLQueryParser.DELETE_SYMBOL, 0); }
		public TerminalNode FROM_SYMBOL() { return getToken(MySQLQueryParser.FROM_SYMBOL, 0); }
		public TableListContext tableList() {
			return getRuleContext(TableListContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public OrderClauseContext orderClause() {
			return getRuleContext(OrderClauseContext.class,0);
		}
		public LimitClauseContext limitClause() {
			return getRuleContext(LimitClauseContext.class,0);
		}
		public DeleteStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deleteStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLQueryListener ) ((MySQLQueryListener)listener).enterDeleteStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLQueryListener ) ((MySQLQueryListener)listener).exitDeleteStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLQueryVisitor ) return ((MySQLQueryVisitor<? extends T>)visitor).visitDeleteStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeleteStatementContext deleteStatement() throws RecognitionException {
		DeleteStatementContext _localctx = new DeleteStatementContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_deleteStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			match(DELETE_SYMBOL);
			setState(401);
			match(FROM_SYMBOL);
			setState(402);
			tableList();
			setState(404);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE_SYMBOL) {
				{
				setState(403);
				whereClause();
				}
			}

			setState(407);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER_SYMBOL) {
				{
				setState(406);
				orderClause();
				}
			}

			setState(410);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WORD || _la==NUMBER) {
				{
				setState(409);
				limitClause();
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

	public static class LimitClauseContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(MySQLQueryParser.WORD, 0); }
		public TerminalNode NUMBER() { return getToken(MySQLQueryParser.NUMBER, 0); }
		public LimitClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limitClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLQueryListener ) ((MySQLQueryListener)listener).enterLimitClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLQueryListener ) ((MySQLQueryListener)listener).exitLimitClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLQueryVisitor ) return ((MySQLQueryVisitor<? extends T>)visitor).visitLimitClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LimitClauseContext limitClause() throws RecognitionException {
		LimitClauseContext _localctx = new LimitClauseContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_limitClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			_la = _input.LA(1);
			if ( !(_la==WORD || _la==NUMBER) ) {
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

	public static class CreateStatementContext extends ParserRuleContext {
		public TerminalNode CREATE_SYMBOL() { return getToken(MySQLQueryParser.CREATE_SYMBOL, 0); }
		public TerminalNode TABLE_SYMBOL() { return getToken(MySQLQueryParser.TABLE_SYMBOL, 0); }
		public NewTableContext newTable() {
			return getRuleContext(NewTableContext.class,0);
		}
		public TerminalNode LIKE_SYMBOL() { return getToken(MySQLQueryParser.LIKE_SYMBOL, 0); }
		public ExistingTableContext existingTable() {
			return getRuleContext(ExistingTableContext.class,0);
		}
		public TerminalNode AS_SYMBOL() { return getToken(MySQLQueryParser.AS_SYMBOL, 0); }
		public SelectStatementContext selectStatement() {
			return getRuleContext(SelectStatementContext.class,0);
		}
		public CreateStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLQueryListener ) ((MySQLQueryListener)listener).enterCreateStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLQueryListener ) ((MySQLQueryListener)listener).exitCreateStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLQueryVisitor ) return ((MySQLQueryVisitor<? extends T>)visitor).visitCreateStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateStatementContext createStatement() throws RecognitionException {
		CreateStatementContext _localctx = new CreateStatementContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_createStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			match(CREATE_SYMBOL);
			setState(415);
			match(TABLE_SYMBOL);
			setState(416);
			newTable();
			setState(421);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LIKE_SYMBOL:
				{
				setState(417);
				match(LIKE_SYMBOL);
				setState(418);
				existingTable();
				}
				break;
			case AS_SYMBOL:
				{
				{
				setState(419);
				match(AS_SYMBOL);
				setState(420);
				selectStatement();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class NewTableContext extends ParserRuleContext {
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public NewTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLQueryListener ) ((MySQLQueryListener)listener).enterNewTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLQueryListener ) ((MySQLQueryListener)listener).exitNewTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLQueryVisitor ) return ((MySQLQueryVisitor<? extends T>)visitor).visitNewTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewTableContext newTable() throws RecognitionException {
		NewTableContext _localctx = new NewTableContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_newTable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			tableName();
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

	public static class ExistingTableContext extends ParserRuleContext {
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode DOT_SYMBOL() { return getToken(MySQLQueryParser.DOT_SYMBOL, 0); }
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public ExistingTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_existingTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLQueryListener ) ((MySQLQueryListener)listener).enterExistingTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLQueryListener ) ((MySQLQueryListener)listener).exitExistingTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLQueryVisitor ) return ((MySQLQueryVisitor<? extends T>)visitor).visitExistingTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExistingTableContext existingTable() throws RecognitionException {
		ExistingTableContext _localctx = new ExistingTableContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_existingTable);
		try {
			setState(430);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(425);
				tableName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(426);
				tableName();
				setState(427);
				match(DOT_SYMBOL);
				setState(428);
				columnName();
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

	public static class InsertStatementContext extends ParserRuleContext {
		public TerminalNode INSERT_SYMBOL() { return getToken(MySQLQueryParser.INSERT_SYMBOL, 0); }
		public TerminalNode INTO_SYMBOL() { return getToken(MySQLQueryParser.INTO_SYMBOL, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode VALUES_SYMBOL() { return getToken(MySQLQueryParser.VALUES_SYMBOL, 0); }
		public ValueItemContext valueItem() {
			return getRuleContext(ValueItemContext.class,0);
		}
		public SelectStatementContext selectStatement() {
			return getRuleContext(SelectStatementContext.class,0);
		}
		public List<ColumnItemContext> columnItem() {
			return getRuleContexts(ColumnItemContext.class);
		}
		public ColumnItemContext columnItem(int i) {
			return getRuleContext(ColumnItemContext.class,i);
		}
		public InsertStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLQueryListener ) ((MySQLQueryListener)listener).enterInsertStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLQueryListener ) ((MySQLQueryListener)listener).exitInsertStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLQueryVisitor ) return ((MySQLQueryVisitor<? extends T>)visitor).visitInsertStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertStatementContext insertStatement() throws RecognitionException {
		InsertStatementContext _localctx = new InsertStatementContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_insertStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
			match(INSERT_SYMBOL);
			setState(433);
			match(INTO_SYMBOL);
			setState(434);
			tableName();
			setState(438);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(435);
					columnItem();
					}
					} 
				}
				setState(440);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			}
			setState(444);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VALUES_SYMBOL:
				{
				setState(441);
				match(VALUES_SYMBOL);
				setState(442);
				valueItem();
				}
				break;
			case SELECT_SYMBOL:
			case OPEN_PAR_SYMBOL:
				{
				setState(443);
				selectStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ColumnItemContext extends ParserRuleContext {
		public TerminalNode OPEN_PAR_SYMBOL() { return getToken(MySQLQueryParser.OPEN_PAR_SYMBOL, 0); }
		public ColumnListContext columnList() {
			return getRuleContext(ColumnListContext.class,0);
		}
		public TerminalNode CLOSE_PAR_SYMBOL() { return getToken(MySQLQueryParser.CLOSE_PAR_SYMBOL, 0); }
		public ColumnItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLQueryListener ) ((MySQLQueryListener)listener).enterColumnItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLQueryListener ) ((MySQLQueryListener)listener).exitColumnItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLQueryVisitor ) return ((MySQLQueryVisitor<? extends T>)visitor).visitColumnItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnItemContext columnItem() throws RecognitionException {
		ColumnItemContext _localctx = new ColumnItemContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_columnItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			match(OPEN_PAR_SYMBOL);
			setState(447);
			columnList();
			setState(448);
			match(CLOSE_PAR_SYMBOL);
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

	public static class ColumnListContext extends ParserRuleContext {
		public List<ColumnNameContext> columnName() {
			return getRuleContexts(ColumnNameContext.class);
		}
		public ColumnNameContext columnName(int i) {
			return getRuleContext(ColumnNameContext.class,i);
		}
		public List<TerminalNode> COMMA_SYMBOL() { return getTokens(MySQLQueryParser.COMMA_SYMBOL); }
		public TerminalNode COMMA_SYMBOL(int i) {
			return getToken(MySQLQueryParser.COMMA_SYMBOL, i);
		}
		public ColumnListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLQueryListener ) ((MySQLQueryListener)listener).enterColumnList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLQueryListener ) ((MySQLQueryListener)listener).exitColumnList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLQueryVisitor ) return ((MySQLQueryVisitor<? extends T>)visitor).visitColumnList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnListContext columnList() throws RecognitionException {
		ColumnListContext _localctx = new ColumnListContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_columnList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
			columnName();
			setState(455);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_SYMBOL) {
				{
				{
				setState(451);
				match(COMMA_SYMBOL);
				setState(452);
				columnName();
				}
				}
				setState(457);
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

	public static class ValueItemContext extends ParserRuleContext {
		public TerminalNode OPEN_PAR_SYMBOL() { return getToken(MySQLQueryParser.OPEN_PAR_SYMBOL, 0); }
		public ValuesListContext valuesList() {
			return getRuleContext(ValuesListContext.class,0);
		}
		public TerminalNode CLOSE_PAR_SYMBOL() { return getToken(MySQLQueryParser.CLOSE_PAR_SYMBOL, 0); }
		public ValueItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLQueryListener ) ((MySQLQueryListener)listener).enterValueItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLQueryListener ) ((MySQLQueryListener)listener).exitValueItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLQueryVisitor ) return ((MySQLQueryVisitor<? extends T>)visitor).visitValueItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueItemContext valueItem() throws RecognitionException {
		ValueItemContext _localctx = new ValueItemContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_valueItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			match(OPEN_PAR_SYMBOL);
			setState(459);
			valuesList();
			setState(460);
			match(CLOSE_PAR_SYMBOL);
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

	public static class UpdateStatementContext extends ParserRuleContext {
		public TerminalNode UPDATE_SYMBOL() { return getToken(MySQLQueryParser.UPDATE_SYMBOL, 0); }
		public TableRefListContext tableRefList() {
			return getRuleContext(TableRefListContext.class,0);
		}
		public TerminalNode SET_SYMBOL() { return getToken(MySQLQueryParser.SET_SYMBOL, 0); }
		public AssignmentListContext assignmentList() {
			return getRuleContext(AssignmentListContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public OrderClauseContext orderClause() {
			return getRuleContext(OrderClauseContext.class,0);
		}
		public LimitClauseContext limitClause() {
			return getRuleContext(LimitClauseContext.class,0);
		}
		public UpdateStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_updateStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLQueryListener ) ((MySQLQueryListener)listener).enterUpdateStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLQueryListener ) ((MySQLQueryListener)listener).exitUpdateStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLQueryVisitor ) return ((MySQLQueryVisitor<? extends T>)visitor).visitUpdateStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpdateStatementContext updateStatement() throws RecognitionException {
		UpdateStatementContext _localctx = new UpdateStatementContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_updateStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(462);
			match(UPDATE_SYMBOL);
			setState(463);
			tableRefList();
			setState(464);
			match(SET_SYMBOL);
			setState(465);
			assignmentList();
			setState(467);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE_SYMBOL) {
				{
				setState(466);
				whereClause();
				}
			}

			setState(470);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER_SYMBOL) {
				{
				setState(469);
				orderClause();
				}
			}

			setState(473);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WORD || _la==NUMBER) {
				{
				setState(472);
				limitClause();
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

	public static class TableRefListContext extends ParserRuleContext {
		public List<TerminalNode> WORD() { return getTokens(MySQLQueryParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(MySQLQueryParser.WORD, i);
		}
		public List<TerminalNode> COMMA_SYMBOL() { return getTokens(MySQLQueryParser.COMMA_SYMBOL); }
		public TerminalNode COMMA_SYMBOL(int i) {
			return getToken(MySQLQueryParser.COMMA_SYMBOL, i);
		}
		public TableRefListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableRefList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLQueryListener ) ((MySQLQueryListener)listener).enterTableRefList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLQueryListener ) ((MySQLQueryListener)listener).exitTableRefList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLQueryVisitor ) return ((MySQLQueryVisitor<? extends T>)visitor).visitTableRefList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableRefListContext tableRefList() throws RecognitionException {
		TableRefListContext _localctx = new TableRefListContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_tableRefList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(475);
			match(WORD);
			setState(480);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_SYMBOL) {
				{
				{
				setState(476);
				match(COMMA_SYMBOL);
				setState(477);
				match(WORD);
				}
				}
				setState(482);
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

	public static class AssignmentListContext extends ParserRuleContext {
		public List<ColumnNameContext> columnName() {
			return getRuleContexts(ColumnNameContext.class);
		}
		public ColumnNameContext columnName(int i) {
			return getRuleContext(ColumnNameContext.class,i);
		}
		public List<TerminalNode> EQUAL_OPERATOR() { return getTokens(MySQLQueryParser.EQUAL_OPERATOR); }
		public TerminalNode EQUAL_OPERATOR(int i) {
			return getToken(MySQLQueryParser.EQUAL_OPERATOR, i);
		}
		public List<ValueNameContext> valueName() {
			return getRuleContexts(ValueNameContext.class);
		}
		public ValueNameContext valueName(int i) {
			return getRuleContext(ValueNameContext.class,i);
		}
		public List<TerminalNode> COMMA_SYMBOL() { return getTokens(MySQLQueryParser.COMMA_SYMBOL); }
		public TerminalNode COMMA_SYMBOL(int i) {
			return getToken(MySQLQueryParser.COMMA_SYMBOL, i);
		}
		public AssignmentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLQueryListener ) ((MySQLQueryListener)listener).enterAssignmentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLQueryListener ) ((MySQLQueryListener)listener).exitAssignmentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLQueryVisitor ) return ((MySQLQueryVisitor<? extends T>)visitor).visitAssignmentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentListContext assignmentList() throws RecognitionException {
		AssignmentListContext _localctx = new AssignmentListContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_assignmentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(483);
			columnName();
			setState(484);
			match(EQUAL_OPERATOR);
			setState(485);
			valueName();
			setState(493);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_SYMBOL) {
				{
				{
				setState(486);
				match(COMMA_SYMBOL);
				setState(487);
				columnName();
				setState(488);
				match(EQUAL_OPERATOR);
				setState(489);
				valueName();
				}
				}
				setState(495);
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

	public static class JoinClauseContext extends ParserRuleContext {
		public TableItemContext tableItem() {
			return getRuleContext(TableItemContext.class,0);
		}
		public InnerJoinContext innerJoin() {
			return getRuleContext(InnerJoinContext.class,0);
		}
		public RightJoinContext rightJoin() {
			return getRuleContext(RightJoinContext.class,0);
		}
		public LeftJoinContext leftJoin() {
			return getRuleContext(LeftJoinContext.class,0);
		}
		public TerminalNode ON_SYMBOL() { return getToken(MySQLQueryParser.ON_SYMBOL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode USING_SYMBOL() { return getToken(MySQLQueryParser.USING_SYMBOL, 0); }
		public TerminalNode OPEN_PAR_SYMBOL() { return getToken(MySQLQueryParser.OPEN_PAR_SYMBOL, 0); }
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode CLOSE_PAR_SYMBOL() { return getToken(MySQLQueryParser.CLOSE_PAR_SYMBOL, 0); }
		public List<JoinClauseContext> joinClause() {
			return getRuleContexts(JoinClauseContext.class);
		}
		public JoinClauseContext joinClause(int i) {
			return getRuleContext(JoinClauseContext.class,i);
		}
		public JoinClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLQueryListener ) ((MySQLQueryListener)listener).enterJoinClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLQueryListener ) ((MySQLQueryListener)listener).exitJoinClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLQueryVisitor ) return ((MySQLQueryVisitor<? extends T>)visitor).visitJoinClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinClauseContext joinClause() throws RecognitionException {
		JoinClauseContext _localctx = new JoinClauseContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_joinClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(499);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INNER_SYMBOL:
				{
				setState(496);
				innerJoin();
				}
				break;
			case RIGHT_SYMBOL:
				{
				setState(497);
				rightJoin();
				}
				break;
			case LEFT_SYMBOL:
				{
				setState(498);
				leftJoin();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(501);
			tableItem();
			setState(509);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ON_SYMBOL:
				{
				setState(502);
				match(ON_SYMBOL);
				setState(503);
				expr();
				}
				break;
			case USING_SYMBOL:
				{
				setState(504);
				match(USING_SYMBOL);
				setState(505);
				match(OPEN_PAR_SYMBOL);
				setState(506);
				columnName();
				setState(507);
				match(CLOSE_PAR_SYMBOL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(514);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(511);
					joinClause();
					}
					} 
				}
				setState(516);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
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

	public static class InnerJoinContext extends ParserRuleContext {
		public TerminalNode INNER_SYMBOL() { return getToken(MySQLQueryParser.INNER_SYMBOL, 0); }
		public TerminalNode JOIN_SYMBOL() { return getToken(MySQLQueryParser.JOIN_SYMBOL, 0); }
		public InnerJoinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_innerJoin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLQueryListener ) ((MySQLQueryListener)listener).enterInnerJoin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLQueryListener ) ((MySQLQueryListener)listener).exitInnerJoin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLQueryVisitor ) return ((MySQLQueryVisitor<? extends T>)visitor).visitInnerJoin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InnerJoinContext innerJoin() throws RecognitionException {
		InnerJoinContext _localctx = new InnerJoinContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_innerJoin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(517);
			match(INNER_SYMBOL);
			setState(518);
			match(JOIN_SYMBOL);
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

	public static class LeftJoinContext extends ParserRuleContext {
		public TerminalNode LEFT_SYMBOL() { return getToken(MySQLQueryParser.LEFT_SYMBOL, 0); }
		public TerminalNode JOIN_SYMBOL() { return getToken(MySQLQueryParser.JOIN_SYMBOL, 0); }
		public LeftJoinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leftJoin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLQueryListener ) ((MySQLQueryListener)listener).enterLeftJoin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLQueryListener ) ((MySQLQueryListener)listener).exitLeftJoin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLQueryVisitor ) return ((MySQLQueryVisitor<? extends T>)visitor).visitLeftJoin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LeftJoinContext leftJoin() throws RecognitionException {
		LeftJoinContext _localctx = new LeftJoinContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_leftJoin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(520);
			match(LEFT_SYMBOL);
			setState(521);
			match(JOIN_SYMBOL);
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

	public static class RightJoinContext extends ParserRuleContext {
		public TerminalNode RIGHT_SYMBOL() { return getToken(MySQLQueryParser.RIGHT_SYMBOL, 0); }
		public TerminalNode JOIN_SYMBOL() { return getToken(MySQLQueryParser.JOIN_SYMBOL, 0); }
		public RightJoinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rightJoin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLQueryListener ) ((MySQLQueryListener)listener).enterRightJoin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLQueryListener ) ((MySQLQueryListener)listener).exitRightJoin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLQueryVisitor ) return ((MySQLQueryVisitor<? extends T>)visitor).visitRightJoin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RightJoinContext rightJoin() throws RecognitionException {
		RightJoinContext _localctx = new RightJoinContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_rightJoin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(523);
			match(RIGHT_SYMBOL);
			setState(524);
			match(JOIN_SYMBOL);
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

	public static class UnionClauseContext extends ParserRuleContext {
		public TerminalNode UNION_SYMBOL() { return getToken(MySQLQueryParser.UNION_SYMBOL, 0); }
		public SelectStatementContext selectStatement() {
			return getRuleContext(SelectStatementContext.class,0);
		}
		public TerminalNode TABLE_SYMBOL() { return getToken(MySQLQueryParser.TABLE_SYMBOL, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode ALL_SYMBOL() { return getToken(MySQLQueryParser.ALL_SYMBOL, 0); }
		public UnionClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unionClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLQueryListener ) ((MySQLQueryListener)listener).enterUnionClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLQueryListener ) ((MySQLQueryListener)listener).exitUnionClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLQueryVisitor ) return ((MySQLQueryVisitor<? extends T>)visitor).visitUnionClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnionClauseContext unionClause() throws RecognitionException {
		UnionClauseContext _localctx = new UnionClauseContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_unionClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(526);
			match(UNION_SYMBOL);
			setState(532);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALL_SYMBOL:
				{
				{
				setState(527);
				match(ALL_SYMBOL);
				setState(528);
				selectStatement();
				}
				}
				break;
			case SELECT_SYMBOL:
			case OPEN_PAR_SYMBOL:
				{
				setState(529);
				selectStatement();
				}
				break;
			case TABLE_SYMBOL:
				{
				setState(530);
				match(TABLE_SYMBOL);
				setState(531);
				tableName();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3]\u0219\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\3\2\3\2"+
		"\3\2\3\2\5\2k\n\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\5\4u\n\4\3\5\5\5x\n"+
		"\5\3\5\3\5\5\5|\n\5\3\5\3\5\5\5\u0080\n\5\3\5\3\5\5\5\u0084\n\5\3\5\5"+
		"\5\u0087\n\5\3\5\5\5\u008a\n\5\3\5\5\5\u008d\n\5\3\5\5\5\u0090\n\5\3\5"+
		"\5\5\u0093\n\5\3\5\5\5\u0096\n\5\3\6\3\6\3\7\3\7\5\7\u009c\n\7\3\7\3\7"+
		"\7\7\u00a0\n\7\f\7\16\7\u00a3\13\7\3\b\3\b\3\b\3\b\5\b\u00a9\n\b\3\b\3"+
		"\b\3\b\3\b\3\b\5\b\u00b0\n\b\3\b\3\b\5\b\u00b4\n\b\5\b\u00b6\n\b\5\b\u00b8"+
		"\n\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\5\16\u00d5\n\16\3\17"+
		"\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u00e4"+
		"\n\21\f\21\16\21\u00e7\13\21\5\21\u00e9\n\21\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\7\23\u00f1\n\23\f\23\16\23\u00f4\13\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\5\24\u00fd\n\24\3\25\3\25\3\25\5\25\u0102\n\25\3\26\3\26\5"+
		"\26\u0106\n\26\3\26\5\26\u0109\n\26\3\26\5\26\u010c\n\26\3\26\5\26\u010f"+
		"\n\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u011a\n\26\3\26"+
		"\3\26\5\26\u011e\n\26\3\27\3\27\3\27\5\27\u0123\n\27\3\27\3\27\5\27\u0127"+
		"\n\27\3\27\3\27\3\30\5\30\u012c\n\30\3\30\3\30\3\30\3\30\5\30\u0132\n"+
		"\30\3\30\3\30\3\31\3\31\3\31\7\31\u0139\n\31\f\31\16\31\u013c\13\31\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\5\32\u0144\n\32\3\33\3\33\5\33\u0148\n\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0150\n\33\3\33\3\33\5\33\u0154\n"+
		"\33\3\33\3\33\5\33\u0158\n\33\3\33\3\33\3\33\3\33\3\33\5\33\u015f\n\33"+
		"\3\33\3\33\3\33\3\33\3\33\5\33\u0166\n\33\3\33\3\33\3\33\3\33\3\33\7\33"+
		"\u016d\n\33\f\33\16\33\u0170\13\33\3\33\3\33\5\33\u0174\n\33\5\33\u0176"+
		"\n\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\7\35\u017f\n\35\f\35\16\35\u0182"+
		"\13\35\3\36\3\36\5\36\u0186\n\36\3\37\3\37\3 \3 \3 \3!\3!\3\"\3\"\3\""+
		"\3\"\3#\3#\3#\3#\5#\u0197\n#\3#\5#\u019a\n#\3#\5#\u019d\n#\3$\3$\3%\3"+
		"%\3%\3%\3%\3%\3%\5%\u01a8\n%\3&\3&\3\'\3\'\3\'\3\'\3\'\5\'\u01b1\n\'\3"+
		"(\3(\3(\3(\7(\u01b7\n(\f(\16(\u01ba\13(\3(\3(\3(\5(\u01bf\n(\3)\3)\3)"+
		"\3)\3*\3*\3*\7*\u01c8\n*\f*\16*\u01cb\13*\3+\3+\3+\3+\3,\3,\3,\3,\3,\5"+
		",\u01d6\n,\3,\5,\u01d9\n,\3,\5,\u01dc\n,\3-\3-\3-\7-\u01e1\n-\f-\16-\u01e4"+
		"\13-\3.\3.\3.\3.\3.\3.\3.\3.\7.\u01ee\n.\f.\16.\u01f1\13.\3/\3/\3/\5/"+
		"\u01f6\n/\3/\3/\3/\3/\3/\3/\3/\3/\5/\u0200\n/\3/\7/\u0203\n/\f/\16/\u0206"+
		"\13/\3\60\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\62\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\5\63\u0217\n\63\3\63\2\2\64\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bd\2\7\4\2STYY\3\2ST"+
		"\3\2IJ\4\2((*/\4\2YY\\\\\2\u023e\2j\3\2\2\2\4l\3\2\2\2\6t\3\2\2\2\bw\3"+
		"\2\2\2\n\u0097\3\2\2\2\f\u009b\3\2\2\2\16\u00b7\3\2\2\2\20\u00b9\3\2\2"+
		"\2\22\u00be\3\2\2\2\24\u00c3\3\2\2\2\26\u00c8\3\2\2\2\30\u00cd\3\2\2\2"+
		"\32\u00d4\3\2\2\2\34\u00d6\3\2\2\2\36\u00d9\3\2\2\2 \u00db\3\2\2\2\"\u00ea"+
		"\3\2\2\2$\u00ed\3\2\2\2&\u00fc\3\2\2\2(\u0101\3\2\2\2*\u0103\3\2\2\2,"+
		"\u011f\3\2\2\2.\u012b\3\2\2\2\60\u0135\3\2\2\2\62\u0143\3\2\2\2\64\u0175"+
		"\3\2\2\2\66\u0177\3\2\2\28\u017b\3\2\2\2:\u0183\3\2\2\2<\u0187\3\2\2\2"+
		">\u0189\3\2\2\2@\u018c\3\2\2\2B\u018e\3\2\2\2D\u0192\3\2\2\2F\u019e\3"+
		"\2\2\2H\u01a0\3\2\2\2J\u01a9\3\2\2\2L\u01b0\3\2\2\2N\u01b2\3\2\2\2P\u01c0"+
		"\3\2\2\2R\u01c4\3\2\2\2T\u01cc\3\2\2\2V\u01d0\3\2\2\2X\u01dd\3\2\2\2Z"+
		"\u01e5\3\2\2\2\\\u01f5\3\2\2\2^\u0207\3\2\2\2`\u020a\3\2\2\2b\u020d\3"+
		"\2\2\2d\u0210\3\2\2\2fk\5\4\3\2gh\5\6\4\2hi\7@\2\2ik\3\2\2\2jf\3\2\2\2"+
		"jg\3\2\2\2k\3\3\2\2\2lm\7$\2\2mn\7Y\2\2n\5\3\2\2\2ou\5D#\2pu\5N(\2qu\5"+
		"\b\5\2ru\5V,\2su\5H%\2to\3\2\2\2tp\3\2\2\2tq\3\2\2\2tr\3\2\2\2ts\3\2\2"+
		"\2u\7\3\2\2\2vx\7B\2\2wv\3\2\2\2wx\3\2\2\2xy\3\2\2\2y{\7\35\2\2z|\5\n"+
		"\6\2{z\3\2\2\2{|\3\2\2\2|}\3\2\2\2}\177\5\f\7\2~\u0080\5 \21\2\177~\3"+
		"\2\2\2\177\u0080\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0083\5\"\22\2\u0082"+
		"\u0084\5\\/\2\u0083\u0082\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0086\3\2"+
		"\2\2\u0085\u0087\5d\63\2\u0086\u0085\3\2\2\2\u0086\u0087\3\2\2\2\u0087"+
		"\u0089\3\2\2\2\u0088\u008a\5*\26\2\u0089\u0088\3\2\2\2\u0089\u008a\3\2"+
		"\2\2\u008a\u008c\3\2\2\2\u008b\u008d\5\66\34\2\u008c\u008b\3\2\2\2\u008c"+
		"\u008d\3\2\2\2\u008d\u008f\3\2\2\2\u008e\u0090\5> \2\u008f\u008e\3\2\2"+
		"\2\u008f\u0090\3\2\2\2\u0090\u0092\3\2\2\2\u0091\u0093\5B\"\2\u0092\u0091"+
		"\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0095\3\2\2\2\u0094\u0096\7C\2\2\u0095"+
		"\u0094\3\2\2\2\u0095\u0096\3\2\2\2\u0096\t\3\2\2\2\u0097\u0098\7\f\2\2"+
		"\u0098\13\3\2\2\2\u0099\u009c\5\16\b\2\u009a\u009c\7\61\2\2\u009b\u0099"+
		"\3\2\2\2\u009b\u009a\3\2\2\2\u009c\u00a1\3\2\2\2\u009d\u009e\7?\2\2\u009e"+
		"\u00a0\5\16\b\2\u009f\u009d\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3"+
		"\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\r\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00b8"+
		"\5\32\16\2\u00a5\u00a8\5\32\16\2\u00a6\u00a9\5\34\17\2\u00a7\u00a9\5\36"+
		"\20\2\u00a8\u00a6\3\2\2\2\u00a8\u00a7\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9"+
		"\u00b8\3\2\2\2\u00aa\u00b0\5\20\t\2\u00ab\u00b0\5\22\n\2\u00ac\u00b0\5"+
		"\24\13\2\u00ad\u00b0\5\26\f\2\u00ae\u00b0\5\30\r\2\u00af\u00aa\3\2\2\2"+
		"\u00af\u00ab\3\2\2\2\u00af\u00ac\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00ae"+
		"\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1\u00b4\5\34\17\2\u00b2\u00b4\5\36\20"+
		"\2\u00b3\u00b1\3\2\2\2\u00b3\u00b2\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b6"+
		"\3\2\2\2\u00b5\u00af\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b8\3\2\2\2\u00b7"+
		"\u00a4\3\2\2\2\u00b7\u00a5\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8\17\3\2\2"+
		"\2\u00b9\u00ba\7\37\2\2\u00ba\u00bb\7B\2\2\u00bb\u00bc\5\32\16\2\u00bc"+
		"\u00bd\7C\2\2\u00bd\21\3\2\2\2\u00be\u00bf\7\n\2\2\u00bf\u00c0\7B\2\2"+
		"\u00c0\u00c1\5\32\16\2\u00c1\u00c2\7C\2\2\u00c2\23\3\2\2\2\u00c3\u00c4"+
		"\7\5\2\2\u00c4\u00c5\7B\2\2\u00c5\u00c6\5\32\16\2\u00c6\u00c7\7C\2\2\u00c7"+
		"\25\3\2\2\2\u00c8\u00c9\7\27\2\2\u00c9\u00ca\7B\2\2\u00ca\u00cb\5\32\16"+
		"\2\u00cb\u00cc\7C\2\2\u00cc\27\3\2\2\2\u00cd\u00ce\7\30\2\2\u00ce\u00cf"+
		"\7B\2\2\u00cf\u00d0\5\32\16\2\u00d0\u00d1\7C\2\2\u00d1\31\3\2\2\2\u00d2"+
		"\u00d5\7Y\2\2\u00d3\u00d5\5(\25\2\u00d4\u00d2\3\2\2\2\u00d4\u00d3\3\2"+
		"\2\2\u00d5\33\3\2\2\2\u00d6\u00d7\7\6\2\2\u00d7\u00d8\5\36\20\2\u00d8"+
		"\35\3\2\2\2\u00d9\u00da\t\2\2\2\u00da\37\3\2\2\2\u00db\u00e8\7O\2\2\u00dc"+
		"\u00dd\7P\2\2\u00dd\u00e9\t\3\2\2\u00de\u00df\7Q\2\2\u00df\u00e9\t\3\2"+
		"\2\u00e0\u00e5\7Y\2\2\u00e1\u00e2\7?\2\2\u00e2\u00e4\7Y\2\2\u00e3\u00e1"+
		"\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6"+
		"\u00e9\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8\u00dc\3\2\2\2\u00e8\u00de\3\2"+
		"\2\2\u00e8\u00e0\3\2\2\2\u00e9!\3\2\2\2\u00ea\u00eb\7\20\2\2\u00eb\u00ec"+
		"\5$\23\2\u00ec#\3\2\2\2\u00ed\u00f2\5&\24\2\u00ee\u00ef\7?\2\2\u00ef\u00f1"+
		"\5&\24\2\u00f0\u00ee\3\2\2\2\u00f1\u00f4\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2"+
		"\u00f3\3\2\2\2\u00f3%\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f5\u00fd\5(\25\2"+
		"\u00f6\u00f7\5(\25\2\u00f7\u00f8\5\36\20\2\u00f8\u00fd\3\2\2\2\u00f9\u00fa"+
		"\5(\25\2\u00fa\u00fb\5\34\17\2\u00fb\u00fd\3\2\2\2\u00fc\u00f5\3\2\2\2"+
		"\u00fc\u00f6\3\2\2\2\u00fc\u00f9\3\2\2\2\u00fd\'\3\2\2\2\u00fe\u0102\7"+
		"Y\2\2\u00ff\u0100\7X\2\2\u0100\u0102\5\32\16\2\u0101\u00fe\3\2\2\2\u0101"+
		"\u00ff\3\2\2\2\u0102)\3\2\2\2\u0103\u0105\7\'\2\2\u0104\u0106\5\64\33"+
		"\2\u0105\u0104\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0108\3\2\2\2\u0107\u0109"+
		"\5,\27\2\u0108\u0107\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010b\3\2\2\2\u010a"+
		"\u010c\5.\30\2\u010b\u010a\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u011d\3\2"+
		"\2\2\u010d\u010f\7\32\2\2\u010e\u010d\3\2\2\2\u010e\u010f\3\2\2\2\u010f"+
		"\u0110\3\2\2\2\u0110\u0111\7\16\2\2\u0111\u011a\5\b\5\2\u0112\u0113\7"+
		"\7\2\2\u0113\u011a\5\b\5\2\u0114\u0115\7\b\2\2\u0115\u0116\5\62\32\2\u0116"+
		"\u0117\7\4\2\2\u0117\u0118\5\62\32\2\u0118\u011a\3\2\2\2\u0119\u010e\3"+
		"\2\2\2\u0119\u0112\3\2\2\2\u0119\u0114\3\2\2\2\u011a\u011e\3\2\2\2\u011b"+
		"\u011c\7\33\2\2\u011c\u011e\5\64\33\2\u011d\u0119\3\2\2\2\u011d\u011b"+
		"\3\2\2\2\u011d\u011e\3\2\2\2\u011e+\3\2\2\2\u011f\u0120\7\26\2\2\u0120"+
		"\u0122\7V\2\2\u0121\u0123\7\64\2\2\u0122\u0121\3\2\2\2\u0122\u0123\3\2"+
		"\2\2\u0123\u0124\3\2\2\2\u0124\u0126\7Y\2\2\u0125\u0127\7\64\2\2\u0126"+
		"\u0125\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u0129\7V"+
		"\2\2\u0129-\3\2\2\2\u012a\u012c\7\32\2\2\u012b\u012a\3\2\2\2\u012b\u012c"+
		"\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012e\7\22\2\2\u012e\u0131\7B\2\2\u012f"+
		"\u0132\5\60\31\2\u0130\u0132\5\b\5\2\u0131\u012f\3\2\2\2\u0131\u0130\3"+
		"\2\2\2\u0132\u0133\3\2\2\2\u0133\u0134\7C\2\2\u0134/\3\2\2\2\u0135\u013a"+
		"\5\62\32\2\u0136\u0137\7?\2\2\u0137\u0139\5\62\32\2\u0138\u0136\3\2\2"+
		"\2\u0139\u013c\3\2\2\2\u013a\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b\61"+
		"\3\2\2\2\u013c\u013a\3\2\2\2\u013d\u0144\7Y\2\2\u013e\u013f\7\65\2\2\u013f"+
		"\u0144\7\\\2\2\u0140\u0144\7\\\2\2\u0141\u0144\7S\2\2\u0142\u0144\7T\2"+
		"\2\u0143\u013d\3\2\2\2\u0143\u013e\3\2\2\2\u0143\u0140\3\2\2\2\u0143\u0141"+
		"\3\2\2\2\u0143\u0142\3\2\2\2\u0144\63\3\2\2\2\u0145\u0148\5&\24\2\u0146"+
		"\u0148\5\32\16\2\u0147\u0145\3\2\2\2\u0147\u0146\3\2\2\2\u0148\u0149\3"+
		"\2\2\2\u0149\u014f\5@!\2\u014a\u0150\7\\\2\2\u014b\u0150\5&\24\2\u014c"+
		"\u0150\5\32\16\2\u014d\u014e\7\7\2\2\u014e\u0150\5\2\2\2\u014f\u014a\3"+
		"\2\2\2\u014f\u014b\3\2\2\2\u014f\u014c\3\2\2\2\u014f\u014d\3\2\2\2\u0150"+
		"\u0153\3\2\2\2\u0151\u0152\7\4\2\2\u0152\u0154\5\64\33\2\u0153\u0151\3"+
		"\2\2\2\u0153\u0154\3\2\2\2\u0154\u0176\3\2\2\2\u0155\u0158\5&\24\2\u0156"+
		"\u0158\5\32\16\2\u0157\u0155\3\2\2\2\u0157\u0156\3\2\2\2\u0158\u0159\3"+
		"\2\2\2\u0159\u015a\7(\2\2\u015a\u015b\7U\2\2\u015b\u0176\3\2\2\2\u015c"+
		"\u015f\5&\24\2\u015d\u015f\5\32\16\2\u015e\u015c\3\2\2\2\u015e\u015d\3"+
		"\2\2\2\u015f\u0160\3\2\2\2\u0160\u0161\7(\2\2\u0161\u0162\5&\24\2\u0162"+
		"\u0176\3\2\2\2\u0163\u0166\5&\24\2\u0164\u0166\5\32\16\2\u0165\u0163\3"+
		"\2\2\2\u0165\u0164\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u0168\7(\2\2\u0168"+
		"\u0169\t\3\2\2\u0169\u016e\3\2\2\2\u016a\u016b\7\4\2\2\u016b\u016d\5\64"+
		"\33\2\u016c\u016a\3\2\2\2\u016d\u0170\3\2\2\2\u016e\u016c\3\2\2\2\u016e"+
		"\u016f\3\2\2\2\u016f\u0176\3\2\2\2\u0170\u016e\3\2\2\2\u0171\u0174\5&"+
		"\24\2\u0172\u0174\5\32\16\2\u0173\u0171\3\2\2\2\u0173\u0172\3\2\2\2\u0174"+
		"\u0176\3\2\2\2\u0175\u0147\3\2\2\2\u0175\u0157\3\2\2\2\u0175\u015e\3\2"+
		"\2\2\u0175\u0165\3\2\2\2\u0175\u0173\3\2\2\2\u0176\65\3\2\2\2\u0177\u0178"+
		"\7\21\2\2\u0178\u0179\7\t\2\2\u0179\u017a\5\32\16\2\u017a\67\3\2\2\2\u017b"+
		"\u0180\5:\36\2\u017c\u017d\7?\2\2\u017d\u017f\5:\36\2\u017e\u017c\3\2"+
		"\2\2\u017f\u0182\3\2\2\2\u0180\u017e\3\2\2\2\u0180\u0181\3\2\2\2\u0181"+
		"9\3\2\2\2\u0182\u0180\3\2\2\2\u0183\u0185\5\64\33\2\u0184\u0186\5<\37"+
		"\2\u0185\u0184\3\2\2\2\u0185\u0186\3\2\2\2\u0186;\3\2\2\2\u0187\u0188"+
		"\t\4\2\2\u0188=\3\2\2\2\u0189\u018a\7R\2\2\u018a\u018b\5\64\33\2\u018b"+
		"?\3\2\2\2\u018c\u018d\t\5\2\2\u018dA\3\2\2\2\u018e\u018f\7\31\2\2\u018f"+
		"\u0190\7\t\2\2\u0190\u0191\58\35\2\u0191C\3\2\2\2\u0192\u0193\7\13\2\2"+
		"\u0193\u0194\7\20\2\2\u0194\u0196\5$\23\2\u0195\u0197\5*\26\2\u0196\u0195"+
		"\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u0199\3\2\2\2\u0198\u019a\5B\"\2\u0199"+
		"\u0198\3\2\2\2\u0199\u019a\3\2\2\2\u019a\u019c\3\2\2\2\u019b\u019d\5F"+
		"$\2\u019c\u019b\3\2\2\2\u019c\u019d\3\2\2\2\u019dE\3\2\2\2\u019e\u019f"+
		"\t\6\2\2\u019fG\3\2\2\2\u01a0\u01a1\7\r\2\2\u01a1\u01a2\7 \2\2\u01a2\u01a7"+
		"\5J&\2\u01a3\u01a4\7\26\2\2\u01a4\u01a8\5L\'\2\u01a5\u01a6\7\6\2\2\u01a6"+
		"\u01a8\5\b\5\2\u01a7\u01a3\3\2\2\2\u01a7\u01a5\3\2\2\2\u01a8I\3\2\2\2"+
		"\u01a9\u01aa\5(\25\2\u01aaK\3\2\2\2\u01ab\u01b1\5(\25\2\u01ac\u01ad\5"+
		"(\25\2\u01ad\u01ae\7>\2\2\u01ae\u01af\5\32\16\2\u01af\u01b1\3\2\2\2\u01b0"+
		"\u01ab\3\2\2\2\u01b0\u01ac\3\2\2\2\u01b1M\3\2\2\2\u01b2\u01b3\7\24\2\2"+
		"\u01b3\u01b4\7O\2\2\u01b4\u01b8\5(\25\2\u01b5\u01b7\5P)\2\u01b6\u01b5"+
		"\3\2\2\2\u01b7\u01ba\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9"+
		"\u01be\3\2\2\2\u01ba\u01b8\3\2\2\2\u01bb\u01bc\7&\2\2\u01bc\u01bf\5T+"+
		"\2\u01bd\u01bf\5\b\5\2\u01be\u01bb\3\2\2\2\u01be\u01bd\3\2\2\2\u01bfO"+
		"\3\2\2\2\u01c0\u01c1\7B\2\2\u01c1\u01c2\5R*\2\u01c2\u01c3\7C\2\2\u01c3"+
		"Q\3\2\2\2\u01c4\u01c9\5\32\16\2\u01c5\u01c6\7?\2\2\u01c6\u01c8\5\32\16"+
		"\2\u01c7\u01c5\3\2\2\2\u01c8\u01cb\3\2\2\2\u01c9\u01c7\3\2\2\2\u01c9\u01ca"+
		"\3\2\2\2\u01caS\3\2\2\2\u01cb\u01c9\3\2\2\2\u01cc\u01cd\7B\2\2\u01cd\u01ce"+
		"\5\60\31\2\u01ce\u01cf\7C\2\2\u01cfU\3\2\2\2\u01d0\u01d1\7!\2\2\u01d1"+
		"\u01d2\5X-\2\u01d2\u01d3\7\36\2\2\u01d3\u01d5\5Z.\2\u01d4\u01d6\5*\26"+
		"\2\u01d5\u01d4\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01d8\3\2\2\2\u01d7\u01d9"+
		"\5B\"\2\u01d8\u01d7\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9\u01db\3\2\2\2\u01da"+
		"\u01dc\5F$\2\u01db\u01da\3\2\2\2\u01db\u01dc\3\2\2\2\u01dcW\3\2\2\2\u01dd"+
		"\u01e2\7Y\2\2\u01de\u01df\7?\2\2\u01df\u01e1\7Y\2\2\u01e0\u01de\3\2\2"+
		"\2\u01e1\u01e4\3\2\2\2\u01e2\u01e0\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3Y"+
		"\3\2\2\2\u01e4\u01e2\3\2\2\2\u01e5\u01e6\5\32\16\2\u01e6\u01e7\7(\2\2"+
		"\u01e7\u01ef\5\62\32\2\u01e8\u01e9\7?\2\2\u01e9\u01ea\5\32\16\2\u01ea"+
		"\u01eb\7(\2\2\u01eb\u01ec\5\62\32\2\u01ec\u01ee\3\2\2\2\u01ed\u01e8\3"+
		"\2\2\2\u01ee\u01f1\3\2\2\2\u01ef\u01ed\3\2\2\2\u01ef\u01f0\3\2\2\2\u01f0"+
		"[\3\2\2\2\u01f1\u01ef\3\2\2\2\u01f2\u01f6\5^\60\2\u01f3\u01f6\5b\62\2"+
		"\u01f4\u01f6\5`\61\2\u01f5\u01f2\3\2\2\2\u01f5\u01f3\3\2\2\2\u01f5\u01f4"+
		"\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7\u01ff\5&\24\2\u01f8\u01f9\7%\2\2\u01f9"+
		"\u0200\5\64\33\2\u01fa\u01fb\7#\2\2\u01fb\u01fc\7B\2\2\u01fc\u01fd\5\32"+
		"\16\2\u01fd\u01fe\7C\2\2\u01fe\u0200\3\2\2\2\u01ff\u01f8\3\2\2\2\u01ff"+
		"\u01fa\3\2\2\2\u0200\u0204\3\2\2\2\u0201\u0203\5\\/\2\u0202\u0201\3\2"+
		"\2\2\u0203\u0206\3\2\2\2\u0204\u0202\3\2\2\2\u0204\u0205\3\2\2\2\u0205"+
		"]\3\2\2\2\u0206\u0204\3\2\2\2\u0207\u0208\7\23\2\2\u0208\u0209\7\25\2"+
		"\2\u0209_\3\2\2\2\u020a\u020b\7\17\2\2\u020b\u020c\7\25\2\2\u020ca\3\2"+
		"\2\2\u020d\u020e\7\34\2\2\u020e\u020f\7\25\2\2\u020fc\3\2\2\2\u0210\u0216"+
		"\7\"\2\2\u0211\u0212\7\3\2\2\u0212\u0217\5\b\5\2\u0213\u0217\5\b\5\2\u0214"+
		"\u0215\7 \2\2\u0215\u0217\5(\25\2\u0216\u0211\3\2\2\2\u0216\u0213\3\2"+
		"\2\2\u0216\u0214\3\2\2\2\u0217e\3\2\2\2Cjtw{\177\u0083\u0086\u0089\u008c"+
		"\u008f\u0092\u0095\u009b\u00a1\u00a8\u00af\u00b3\u00b5\u00b7\u00d4\u00e5"+
		"\u00e8\u00f2\u00fc\u0101\u0105\u0108\u010b\u010e\u0119\u011d\u0122\u0126"+
		"\u012b\u0131\u013a\u0143\u0147\u014f\u0153\u0157\u015e\u0165\u016e\u0173"+
		"\u0175\u0180\u0185\u0196\u0199\u019c\u01a7\u01b0\u01b8\u01be\u01c9\u01d5"+
		"\u01d8\u01db\u01e2\u01ef\u01f5\u01ff\u0204\u0216";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}