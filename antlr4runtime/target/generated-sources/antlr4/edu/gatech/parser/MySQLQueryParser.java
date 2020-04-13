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
		NAME=83, SINGLE_QUOTE=84, DOUBLE_QUOTE=85, NUMBER=86, TABLE_NAME=87, WORD=88, 
		WHITESPACE=89, NEWLINE=90, NOT_EQUAL2_OPERATOR=91;
	public static final int
		RULE_query = 0, RULE_useClause = 1, RULE_simpleStatement = 2, RULE_selectStatement = 3, 
		RULE_distinctClause = 4, RULE_selectItemList = 5, RULE_selectItem = 6, 
		RULE_sumClause = 7, RULE_countClause = 8, RULE_avgClause = 9, RULE_minClause = 10, 
		RULE_maxClause = 11, RULE_columnName = 12, RULE_selectAlias = 13, RULE_alias = 14, 
		RULE_intoClause = 15, RULE_fromClause = 16, RULE_tableList = 17, RULE_tableItem = 18, 
		RULE_tableName = 19, RULE_whereClause = 20, RULE_likeClause = 21, RULE_inClause = 22, 
		RULE_valuesList = 23, RULE_valueName = 24, RULE_condition = 25, RULE_conditionInner = 26, 
		RULE_groupByClause = 27, RULE_orderList = 28, RULE_orderExpression = 29, 
		RULE_direction = 30, RULE_havingClause = 31, RULE_compOp = 32, RULE_orderClause = 33, 
		RULE_deleteStatement = 34, RULE_limitClause = 35, RULE_createStatement = 36, 
		RULE_newTable = 37, RULE_existingTable = 38, RULE_insertStatement = 39, 
		RULE_columnPar = 40, RULE_columnList = 41, RULE_columnItem = 42, RULE_valueItem = 43, 
		RULE_updateStatement = 44, RULE_tableRefList = 45, RULE_assignmentList = 46, 
		RULE_joinClause = 47, RULE_innerJoin = 48, RULE_leftJoin = 49, RULE_rightJoin = 50, 
		RULE_onClause = 51, RULE_onList = 52, RULE_unionClause = 53;
	private static String[] makeRuleNames() {
		return new String[] {
			"query", "useClause", "simpleStatement", "selectStatement", "distinctClause", 
			"selectItemList", "selectItem", "sumClause", "countClause", "avgClause", 
			"minClause", "maxClause", "columnName", "selectAlias", "alias", "intoClause", 
			"fromClause", "tableList", "tableItem", "tableName", "whereClause", "likeClause", 
			"inClause", "valuesList", "valueName", "condition", "conditionInner", 
			"groupByClause", "orderList", "orderExpression", "direction", "havingClause", 
			"compOp", "orderClause", "deleteStatement", "limitClause", "createStatement", 
			"newTable", "existingTable", "insertStatement", "columnPar", "columnList", 
			"columnItem", "valueItem", "updateStatement", "tableRefList", "assignmentList", 
			"joinClause", "innerJoin", "leftJoin", "rightJoin", "onClause", "onList", 
			"unionClause"
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
			"NUMBER", "TABLE_NAME", "WORD", "WHITESPACE", "NEWLINE", "NOT_EQUAL2_OPERATOR"
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
			setState(112);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case USE_SYMBOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
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
				setState(109);
				simpleStatement();
				setState(110);
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
			setState(114);
			match(USE_SYMBOL);
			setState(115);
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
			setState(122);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DELETE_SYMBOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(117);
				deleteStatement();
				}
				break;
			case INSERT_SYMBOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(118);
				insertStatement();
				}
				break;
			case SELECT_SYMBOL:
			case OPEN_PAR_SYMBOL:
				enterOuterAlt(_localctx, 3);
				{
				setState(119);
				selectStatement();
				}
				break;
			case UPDATE_SYMBOL:
				enterOuterAlt(_localctx, 4);
				{
				setState(120);
				updateStatement();
				}
				break;
			case CREATE_SYMBOL:
				enterOuterAlt(_localctx, 5);
				{
				setState(121);
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
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR_SYMBOL) {
				{
				setState(124);
				match(OPEN_PAR_SYMBOL);
				}
			}

			setState(127);
			match(SELECT_SYMBOL);
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DISTINCT_SYMBOL) {
				{
				setState(128);
				distinctClause();
				}
			}

			setState(131);
			selectItemList();
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INTO_SYMBOL) {
				{
				setState(132);
				intoClause();
				}
			}

			setState(135);
			fromClause();
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFT_SYMBOL) | (1L << INNER_SYMBOL) | (1L << RIGHT_SYMBOL))) != 0)) {
				{
				setState(136);
				joinClause();
				}
			}

			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==UNION_SYMBOL) {
				{
				setState(139);
				unionClause();
				}
			}

			setState(143);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(142);
				whereClause();
				}
				break;
			}
			setState(146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(145);
				groupByClause();
				}
				break;
			}
			setState(149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(148);
				havingClause();
				}
				break;
			}
			setState(152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(151);
				orderClause();
				}
				break;
			}
			setState(155);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(154);
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
			setState(157);
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
			setState(161);
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
			case WORD:
				{
				setState(159);
				selectItem();
				}
				break;
			case MULT_OPERATOR:
				{
				setState(160);
				match(MULT_OPERATOR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_SYMBOL) {
				{
				{
				setState(163);
				match(COMMA_SYMBOL);
				setState(164);
				selectItem();
				}
				}
				setState(169);
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
		public ColumnItemContext columnItem() {
			return getRuleContext(ColumnItemContext.class,0);
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
		public SelectAliasContext selectAlias() {
			return getRuleContext(SelectAliasContext.class,0);
		}
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
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
			setState(184);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WORD:
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				columnItem();
				}
				break;
			case AVERAGE_SYMBOL:
			case COUNT_SYMBOL:
			case FROM_SYMBOL:
			case MIN_SYMBOL:
			case MAX_SYMBOL:
			case SUM_SYMBOL:
			case COMMA_SYMBOL:
			case INTO_SYMBOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AVERAGE_SYMBOL) | (1L << COUNT_SYMBOL) | (1L << MIN_SYMBOL) | (1L << MAX_SYMBOL) | (1L << SUM_SYMBOL))) != 0)) {
					{
					setState(176);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case SUM_SYMBOL:
						{
						setState(171);
						sumClause();
						}
						break;
					case COUNT_SYMBOL:
						{
						setState(172);
						countClause();
						}
						break;
					case AVERAGE_SYMBOL:
						{
						setState(173);
						avgClause();
						}
						break;
					case MIN_SYMBOL:
						{
						setState(174);
						minClause();
						}
						break;
					case MAX_SYMBOL:
						{
						setState(175);
						maxClause();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(180);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case AS_SYMBOL:
						{
						setState(178);
						selectAlias();
						}
						break;
					case SQ_TEXT:
					case DQ_TEXT:
					case WORD:
						{
						setState(179);
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

	public static class SumClauseContext extends ParserRuleContext {
		public TerminalNode SUM_SYMBOL() { return getToken(MySQLQueryParser.SUM_SYMBOL, 0); }
		public TerminalNode OPEN_PAR_SYMBOL() { return getToken(MySQLQueryParser.OPEN_PAR_SYMBOL, 0); }
		public ColumnItemContext columnItem() {
			return getRuleContext(ColumnItemContext.class,0);
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
			setState(186);
			match(SUM_SYMBOL);
			setState(187);
			match(OPEN_PAR_SYMBOL);
			setState(188);
			columnItem();
			setState(189);
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
		public ColumnItemContext columnItem() {
			return getRuleContext(ColumnItemContext.class,0);
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
			setState(191);
			match(COUNT_SYMBOL);
			setState(192);
			match(OPEN_PAR_SYMBOL);
			setState(193);
			columnItem();
			setState(194);
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
		public ColumnItemContext columnItem() {
			return getRuleContext(ColumnItemContext.class,0);
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
			setState(196);
			match(AVERAGE_SYMBOL);
			setState(197);
			match(OPEN_PAR_SYMBOL);
			setState(198);
			columnItem();
			setState(199);
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
		public ColumnItemContext columnItem() {
			return getRuleContext(ColumnItemContext.class,0);
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
			setState(201);
			match(MIN_SYMBOL);
			setState(202);
			match(OPEN_PAR_SYMBOL);
			setState(203);
			columnItem();
			setState(204);
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
		public ColumnItemContext columnItem() {
			return getRuleContext(ColumnItemContext.class,0);
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
			setState(206);
			match(MAX_SYMBOL);
			setState(207);
			match(OPEN_PAR_SYMBOL);
			setState(208);
			columnItem();
			setState(209);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
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
			setState(213);
			match(AS_SYMBOL);
			setState(214);
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
			setState(216);
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
			setState(218);
			match(INTO_SYMBOL);
			setState(231);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OUTFILE_SYMBOL:
				{
				setState(219);
				match(OUTFILE_SYMBOL);
				setState(220);
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
				setState(221);
				match(DUMPFILE_SYMBOL);
				setState(222);
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
				setState(223);
				match(WORD);
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_SYMBOL) {
					{
					{
					setState(224);
					match(COMMA_SYMBOL);
					setState(225);
					match(WORD);
					}
					}
					setState(230);
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
			setState(233);
			match(FROM_SYMBOL);
			setState(234);
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
			setState(236);
			tableItem();
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_SYMBOL) {
				{
				{
				setState(237);
				match(COMMA_SYMBOL);
				setState(238);
				tableItem();
				}
				}
				setState(243);
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
			setState(251);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(244);
				tableName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(245);
				tableName();
				setState(246);
				alias();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(248);
				tableName();
				setState(249);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
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

	public static class WhereClauseContext extends ParserRuleContext {
		public TerminalNode WHERE_SYMBOL() { return getToken(MySQLQueryParser.WHERE_SYMBOL, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public LikeClauseContext likeClause() {
			return getRuleContext(LikeClauseContext.class,0);
		}
		public InClauseContext inClause() {
			return getRuleContext(InClauseContext.class,0);
		}
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
			setState(255);
			match(WHERE_SYMBOL);
			setState(257);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(256);
				condition();
				}
				break;
			}
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIKE_SYMBOL) {
				{
				setState(259);
				likeClause();
				}
			}

			setState(263);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(262);
				inClause();
				}
				break;
			}
			setState(277);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EXISTS_SYMBOL:
			case NOT_SYMBOL:
				{
				{
				setState(266);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT_SYMBOL) {
					{
					setState(265);
					match(NOT_SYMBOL);
					}
				}

				setState(268);
				match(EXISTS_SYMBOL);
				setState(269);
				selectStatement();
				}
				}
				break;
			case ANY_SYMBOL:
				{
				{
				setState(270);
				match(ANY_SYMBOL);
				setState(271);
				selectStatement();
				}
				}
				break;
			case BETWEEN_SYMBOL:
				{
				{
				setState(272);
				match(BETWEEN_SYMBOL);
				setState(273);
				valueName();
				setState(274);
				match(AND_SYMBOL);
				setState(275);
				valueName();
				}
				}
				break;
			case GROUP_SYMBOL:
			case ORDER_SYMBOL:
			case WHERE_SYMBOL:
			case SEMICOLON_SYMBOL:
			case CLOSE_PAR_SYMBOL:
			case HAVING_SYMBOL:
			case NUMBER:
			case WORD:
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
			setState(279);
			match(LIKE_SYMBOL);
			setState(280);
			match(SINGLE_QUOTE);
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MOD_OPERATOR) {
				{
				setState(281);
				match(MOD_OPERATOR);
				}
			}

			setState(284);
			match(WORD);
			setState(286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MOD_OPERATOR) {
				{
				setState(285);
				match(MOD_OPERATOR);
				}
			}

			setState(288);
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
			setState(291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT_SYMBOL) {
				{
				setState(290);
				match(NOT_SYMBOL);
				}
			}

			setState(293);
			match(IN_SYMBOL);
			setState(294);
			match(OPEN_PAR_SYMBOL);
			setState(297);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ARITHMETIC:
			case SQ_TEXT:
			case DQ_TEXT:
			case NUMBER:
				{
				setState(295);
				valuesList();
				}
				break;
			case SELECT_SYMBOL:
			case OPEN_PAR_SYMBOL:
				{
				setState(296);
				selectStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(299);
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
			setState(301);
			valueName();
			setState(306);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_SYMBOL) {
				{
				{
				setState(302);
				match(COMMA_SYMBOL);
				setState(303);
				valueName();
				}
				}
				setState(308);
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
			setState(314);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ARITHMETIC:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(309);
				match(ARITHMETIC);
				setState(310);
				match(NUMBER);
				}
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(311);
				match(NUMBER);
				}
				break;
			case SQ_TEXT:
				enterOuterAlt(_localctx, 3);
				{
				setState(312);
				match(SQ_TEXT);
				}
				break;
			case DQ_TEXT:
				enterOuterAlt(_localctx, 4);
				{
				setState(313);
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

	public static class ConditionContext extends ParserRuleContext {
		public ConditionInnerContext conditionInner() {
			return getRuleContext(ConditionInnerContext.class,0);
		}
		public TerminalNode OR_SYMBOL() { return getToken(MySQLQueryParser.OR_SYMBOL, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLQueryListener ) ((MySQLQueryListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLQueryListener ) ((MySQLQueryListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLQueryVisitor ) return ((MySQLQueryVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			conditionInner();
			setState(319);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(317);
				match(OR_SYMBOL);
				setState(318);
				condition();
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

	public static class ConditionInnerContext extends ParserRuleContext {
		public TerminalNode OPEN_PAR_SYMBOL() { return getToken(MySQLQueryParser.OPEN_PAR_SYMBOL, 0); }
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public TerminalNode CLOSE_PAR_SYMBOL() { return getToken(MySQLQueryParser.CLOSE_PAR_SYMBOL, 0); }
		public TerminalNode OR_SYMBOL() { return getToken(MySQLQueryParser.OR_SYMBOL, 0); }
		public TerminalNode AND_SYMBOL() { return getToken(MySQLQueryParser.AND_SYMBOL, 0); }
		public List<ColumnItemContext> columnItem() {
			return getRuleContexts(ColumnItemContext.class);
		}
		public ColumnItemContext columnItem(int i) {
			return getRuleContext(ColumnItemContext.class,i);
		}
		public CompOpContext compOp() {
			return getRuleContext(CompOpContext.class,0);
		}
		public ValueNameContext valueName() {
			return getRuleContext(ValueNameContext.class,0);
		}
		public TerminalNode ANY_SYMBOL() { return getToken(MySQLQueryParser.ANY_SYMBOL, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public ConditionInnerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionInner; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLQueryListener ) ((MySQLQueryListener)listener).enterConditionInner(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLQueryListener ) ((MySQLQueryListener)listener).exitConditionInner(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLQueryVisitor ) return ((MySQLQueryVisitor<? extends T>)visitor).visitConditionInner(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionInnerContext conditionInner() throws RecognitionException {
		ConditionInnerContext _localctx = new ConditionInnerContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_conditionInner);
		int _la;
		try {
			setState(348);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAR_SYMBOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(321);
				match(OPEN_PAR_SYMBOL);
				setState(322);
				condition();
				setState(323);
				match(CLOSE_PAR_SYMBOL);
				setState(332);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(326);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
					case 1:
						{
						setState(324);
						match(OR_SYMBOL);
						setState(325);
						condition();
						}
						break;
					}
					}
					break;
				case 2:
					{
					setState(330);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AND_SYMBOL) {
						{
						setState(328);
						match(AND_SYMBOL);
						setState(329);
						condition();
						}
					}

					}
					break;
				}
				}
				break;
			case WORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(334);
				columnItem();
				setState(342);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL_OPERATOR) | (1L << NULL_SAFE_EQUAL_OPERATOR) | (1L << GREATER_OR_EQUAL_OPERATOR) | (1L << GREATER_THAN_OPERATOR) | (1L << LESS_OR_EQUAL_OPERATOR) | (1L << LESS_THAN_OPERATOR) | (1L << NOT_EQUAL_OPERATOR))) != 0)) {
					{
					setState(335);
					compOp();
					setState(340);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case ARITHMETIC:
					case SQ_TEXT:
					case DQ_TEXT:
					case NUMBER:
						{
						setState(336);
						valueName();
						}
						break;
					case WORD:
						{
						setState(337);
						columnItem();
						}
						break;
					case ANY_SYMBOL:
						{
						{
						setState(338);
						match(ANY_SYMBOL);
						setState(339);
						query();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				setState(346);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AND_SYMBOL) {
					{
					setState(344);
					match(AND_SYMBOL);
					setState(345);
					condition();
					}
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

	public static class GroupByClauseContext extends ParserRuleContext {
		public TerminalNode GROUP_SYMBOL() { return getToken(MySQLQueryParser.GROUP_SYMBOL, 0); }
		public TerminalNode BY_SYMBOL() { return getToken(MySQLQueryParser.BY_SYMBOL, 0); }
		public ColumnItemContext columnItem() {
			return getRuleContext(ColumnItemContext.class,0);
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
		enterRule(_localctx, 54, RULE_groupByClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			match(GROUP_SYMBOL);
			setState(351);
			match(BY_SYMBOL);
			setState(352);
			columnItem();
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
		enterRule(_localctx, 56, RULE_orderList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			orderExpression();
			setState(359);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_SYMBOL) {
				{
				{
				setState(355);
				match(COMMA_SYMBOL);
				setState(356);
				orderExpression();
				}
				}
				setState(361);
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
		public ColumnItemContext columnItem() {
			return getRuleContext(ColumnItemContext.class,0);
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
		enterRule(_localctx, 58, RULE_orderExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			columnItem();
			setState(364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC_SYMBOL || _la==DESC_SYMBOL) {
				{
				setState(363);
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
		enterRule(_localctx, 60, RULE_direction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
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
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
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
		enterRule(_localctx, 62, RULE_havingClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			match(HAVING_SYMBOL);
			setState(369);
			condition();
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
		enterRule(_localctx, 64, RULE_compOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
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
		enterRule(_localctx, 66, RULE_orderClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			match(ORDER_SYMBOL);
			setState(374);
			match(BY_SYMBOL);
			setState(375);
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
		enterRule(_localctx, 68, RULE_deleteStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			match(DELETE_SYMBOL);
			setState(378);
			match(FROM_SYMBOL);
			setState(379);
			tableList();
			setState(381);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE_SYMBOL) {
				{
				setState(380);
				whereClause();
				}
			}

			setState(384);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER_SYMBOL) {
				{
				setState(383);
				orderClause();
				}
			}

			setState(387);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUMBER || _la==WORD) {
				{
				setState(386);
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
		enterRule(_localctx, 70, RULE_limitClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			_la = _input.LA(1);
			if ( !(_la==NUMBER || _la==WORD) ) {
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
		enterRule(_localctx, 72, RULE_createStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			match(CREATE_SYMBOL);
			setState(392);
			match(TABLE_SYMBOL);
			setState(393);
			newTable();
			setState(398);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LIKE_SYMBOL:
				{
				setState(394);
				match(LIKE_SYMBOL);
				setState(395);
				existingTable();
				}
				break;
			case AS_SYMBOL:
				{
				{
				setState(396);
				match(AS_SYMBOL);
				setState(397);
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
		enterRule(_localctx, 74, RULE_newTable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
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
		enterRule(_localctx, 76, RULE_existingTable);
		try {
			setState(407);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(402);
				tableName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(403);
				tableName();
				setState(404);
				match(DOT_SYMBOL);
				setState(405);
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
		public List<ColumnParContext> columnPar() {
			return getRuleContexts(ColumnParContext.class);
		}
		public ColumnParContext columnPar(int i) {
			return getRuleContext(ColumnParContext.class,i);
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
		enterRule(_localctx, 78, RULE_insertStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
			match(INSERT_SYMBOL);
			setState(410);
			match(INTO_SYMBOL);
			setState(411);
			tableName();
			setState(415);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(412);
					columnPar();
					}
					} 
				}
				setState(417);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			}
			setState(421);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VALUES_SYMBOL:
				{
				setState(418);
				match(VALUES_SYMBOL);
				setState(419);
				valueItem();
				}
				break;
			case SELECT_SYMBOL:
			case OPEN_PAR_SYMBOL:
				{
				setState(420);
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

	public static class ColumnParContext extends ParserRuleContext {
		public TerminalNode OPEN_PAR_SYMBOL() { return getToken(MySQLQueryParser.OPEN_PAR_SYMBOL, 0); }
		public ColumnListContext columnList() {
			return getRuleContext(ColumnListContext.class,0);
		}
		public TerminalNode CLOSE_PAR_SYMBOL() { return getToken(MySQLQueryParser.CLOSE_PAR_SYMBOL, 0); }
		public ColumnParContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnPar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLQueryListener ) ((MySQLQueryListener)listener).enterColumnPar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLQueryListener ) ((MySQLQueryListener)listener).exitColumnPar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLQueryVisitor ) return ((MySQLQueryVisitor<? extends T>)visitor).visitColumnPar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnParContext columnPar() throws RecognitionException {
		ColumnParContext _localctx = new ColumnParContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_columnPar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			match(OPEN_PAR_SYMBOL);
			setState(424);
			columnList();
			setState(425);
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
		public List<ColumnItemContext> columnItem() {
			return getRuleContexts(ColumnItemContext.class);
		}
		public ColumnItemContext columnItem(int i) {
			return getRuleContext(ColumnItemContext.class,i);
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
		enterRule(_localctx, 82, RULE_columnList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
			columnItem();
			setState(432);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_SYMBOL) {
				{
				{
				setState(428);
				match(COMMA_SYMBOL);
				setState(429);
				columnItem();
				}
				}
				setState(434);
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

	public static class ColumnItemContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public SelectAliasContext selectAlias() {
			return getRuleContext(SelectAliasContext.class,0);
		}
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
		enterRule(_localctx, 84, RULE_columnItem);
		try {
			setState(442);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(435);
				columnName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(436);
				columnName();
				setState(437);
				alias();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(439);
				columnName();
				setState(440);
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
		enterRule(_localctx, 86, RULE_valueItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			match(OPEN_PAR_SYMBOL);
			setState(445);
			valuesList();
			setState(446);
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
		enterRule(_localctx, 88, RULE_updateStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			match(UPDATE_SYMBOL);
			setState(449);
			tableRefList();
			setState(450);
			match(SET_SYMBOL);
			setState(451);
			assignmentList();
			setState(453);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE_SYMBOL) {
				{
				setState(452);
				whereClause();
				}
			}

			setState(456);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER_SYMBOL) {
				{
				setState(455);
				orderClause();
				}
			}

			setState(459);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUMBER || _la==WORD) {
				{
				setState(458);
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
		enterRule(_localctx, 90, RULE_tableRefList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			match(WORD);
			setState(466);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_SYMBOL) {
				{
				{
				setState(462);
				match(COMMA_SYMBOL);
				setState(463);
				match(WORD);
				}
				}
				setState(468);
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
		public List<ColumnItemContext> columnItem() {
			return getRuleContexts(ColumnItemContext.class);
		}
		public ColumnItemContext columnItem(int i) {
			return getRuleContext(ColumnItemContext.class,i);
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
		enterRule(_localctx, 92, RULE_assignmentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(469);
			columnItem();
			setState(470);
			match(EQUAL_OPERATOR);
			setState(471);
			valueName();
			setState(479);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_SYMBOL) {
				{
				{
				setState(472);
				match(COMMA_SYMBOL);
				setState(473);
				columnItem();
				setState(474);
				match(EQUAL_OPERATOR);
				setState(475);
				valueName();
				}
				}
				setState(481);
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
		public OnClauseContext onClause() {
			return getRuleContext(OnClauseContext.class,0);
		}
		public TerminalNode USING_SYMBOL() { return getToken(MySQLQueryParser.USING_SYMBOL, 0); }
		public TerminalNode OPEN_PAR_SYMBOL() { return getToken(MySQLQueryParser.OPEN_PAR_SYMBOL, 0); }
		public ColumnItemContext columnItem() {
			return getRuleContext(ColumnItemContext.class,0);
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
		enterRule(_localctx, 94, RULE_joinClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(485);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INNER_SYMBOL:
				{
				setState(482);
				innerJoin();
				}
				break;
			case RIGHT_SYMBOL:
				{
				setState(483);
				rightJoin();
				}
				break;
			case LEFT_SYMBOL:
				{
				setState(484);
				leftJoin();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(487);
			tableItem();
			setState(494);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ON_SYMBOL:
				{
				setState(488);
				onClause();
				}
				break;
			case USING_SYMBOL:
				{
				setState(489);
				match(USING_SYMBOL);
				setState(490);
				match(OPEN_PAR_SYMBOL);
				setState(491);
				columnItem();
				setState(492);
				match(CLOSE_PAR_SYMBOL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(499);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(496);
					joinClause();
					}
					} 
				}
				setState(501);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
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
		enterRule(_localctx, 96, RULE_innerJoin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(502);
			match(INNER_SYMBOL);
			setState(503);
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
		enterRule(_localctx, 98, RULE_leftJoin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(505);
			match(LEFT_SYMBOL);
			setState(506);
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
		enterRule(_localctx, 100, RULE_rightJoin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(508);
			match(RIGHT_SYMBOL);
			setState(509);
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

	public static class OnClauseContext extends ParserRuleContext {
		public TerminalNode ON_SYMBOL() { return getToken(MySQLQueryParser.ON_SYMBOL, 0); }
		public List<OnListContext> onList() {
			return getRuleContexts(OnListContext.class);
		}
		public OnListContext onList(int i) {
			return getRuleContext(OnListContext.class,i);
		}
		public List<TerminalNode> AND_SYMBOL() { return getTokens(MySQLQueryParser.AND_SYMBOL); }
		public TerminalNode AND_SYMBOL(int i) {
			return getToken(MySQLQueryParser.AND_SYMBOL, i);
		}
		public OnClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLQueryListener ) ((MySQLQueryListener)listener).enterOnClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLQueryListener ) ((MySQLQueryListener)listener).exitOnClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLQueryVisitor ) return ((MySQLQueryVisitor<? extends T>)visitor).visitOnClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OnClauseContext onClause() throws RecognitionException {
		OnClauseContext _localctx = new OnClauseContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_onClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(511);
			match(ON_SYMBOL);
			setState(512);
			onList();
			setState(517);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND_SYMBOL) {
				{
				{
				setState(513);
				match(AND_SYMBOL);
				setState(514);
				onList();
				}
				}
				setState(519);
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

	public static class OnListContext extends ParserRuleContext {
		public List<ColumnItemContext> columnItem() {
			return getRuleContexts(ColumnItemContext.class);
		}
		public ColumnItemContext columnItem(int i) {
			return getRuleContext(ColumnItemContext.class,i);
		}
		public CompOpContext compOp() {
			return getRuleContext(CompOpContext.class,0);
		}
		public OnListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLQueryListener ) ((MySQLQueryListener)listener).enterOnList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLQueryListener ) ((MySQLQueryListener)listener).exitOnList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLQueryVisitor ) return ((MySQLQueryVisitor<? extends T>)visitor).visitOnList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OnListContext onList() throws RecognitionException {
		OnListContext _localctx = new OnListContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_onList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(520);
			columnItem();
			setState(521);
			compOp();
			setState(522);
			columnItem();
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
		enterRule(_localctx, 106, RULE_unionClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(524);
			match(UNION_SYMBOL);
			setState(530);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALL_SYMBOL:
				{
				{
				setState(525);
				match(ALL_SYMBOL);
				setState(526);
				selectStatement();
				}
				}
				break;
			case SELECT_SYMBOL:
			case OPEN_PAR_SYMBOL:
				{
				setState(527);
				selectStatement();
				}
				break;
			case TABLE_SYMBOL:
				{
				setState(528);
				match(TABLE_SYMBOL);
				setState(529);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3]\u0217\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\3\2\3\2\3\2\3\2\5\2s\n\2\3\3\3\3\3\3"+
		"\3\4\3\4\3\4\3\4\3\4\5\4}\n\4\3\5\5\5\u0080\n\5\3\5\3\5\5\5\u0084\n\5"+
		"\3\5\3\5\5\5\u0088\n\5\3\5\3\5\5\5\u008c\n\5\3\5\5\5\u008f\n\5\3\5\5\5"+
		"\u0092\n\5\3\5\5\5\u0095\n\5\3\5\5\5\u0098\n\5\3\5\5\5\u009b\n\5\3\5\5"+
		"\5\u009e\n\5\3\6\3\6\3\7\3\7\5\7\u00a4\n\7\3\7\3\7\7\7\u00a8\n\7\f\7\16"+
		"\7\u00ab\13\7\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00b3\n\b\3\b\3\b\5\b\u00b7"+
		"\n\b\5\b\u00b9\n\b\5\b\u00bb\n\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3"+
		"\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3"+
		"\16\3\16\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\7\21\u00e5\n\21\f\21\16\21\u00e8\13\21\5\21\u00ea\n\21\3\22\3\22\3"+
		"\22\3\23\3\23\3\23\7\23\u00f2\n\23\f\23\16\23\u00f5\13\23\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\5\24\u00fe\n\24\3\25\3\25\3\26\3\26\5\26\u0104"+
		"\n\26\3\26\5\26\u0107\n\26\3\26\5\26\u010a\n\26\3\26\5\26\u010d\n\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0118\n\26\3\27\3\27"+
		"\3\27\5\27\u011d\n\27\3\27\3\27\5\27\u0121\n\27\3\27\3\27\3\30\5\30\u0126"+
		"\n\30\3\30\3\30\3\30\3\30\5\30\u012c\n\30\3\30\3\30\3\31\3\31\3\31\7\31"+
		"\u0133\n\31\f\31\16\31\u0136\13\31\3\32\3\32\3\32\3\32\3\32\5\32\u013d"+
		"\n\32\3\33\3\33\3\33\5\33\u0142\n\33\3\34\3\34\3\34\3\34\3\34\5\34\u0149"+
		"\n\34\3\34\3\34\5\34\u014d\n\34\5\34\u014f\n\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\5\34\u0157\n\34\5\34\u0159\n\34\3\34\3\34\5\34\u015d\n\34\5\34"+
		"\u015f\n\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\7\36\u0168\n\36\f\36\16"+
		"\36\u016b\13\36\3\37\3\37\5\37\u016f\n\37\3 \3 \3!\3!\3!\3\"\3\"\3#\3"+
		"#\3#\3#\3$\3$\3$\3$\5$\u0180\n$\3$\5$\u0183\n$\3$\5$\u0186\n$\3%\3%\3"+
		"&\3&\3&\3&\3&\3&\3&\5&\u0191\n&\3\'\3\'\3(\3(\3(\3(\3(\5(\u019a\n(\3)"+
		"\3)\3)\3)\7)\u01a0\n)\f)\16)\u01a3\13)\3)\3)\3)\5)\u01a8\n)\3*\3*\3*\3"+
		"*\3+\3+\3+\7+\u01b1\n+\f+\16+\u01b4\13+\3,\3,\3,\3,\3,\3,\3,\5,\u01bd"+
		"\n,\3-\3-\3-\3-\3.\3.\3.\3.\3.\5.\u01c8\n.\3.\5.\u01cb\n.\3.\5.\u01ce"+
		"\n.\3/\3/\3/\7/\u01d3\n/\f/\16/\u01d6\13/\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\7\60\u01e0\n\60\f\60\16\60\u01e3\13\60\3\61\3\61\3\61\5\61"+
		"\u01e8\n\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u01f1\n\61\3\61\7"+
		"\61\u01f4\n\61\f\61\16\61\u01f7\13\61\3\62\3\62\3\62\3\63\3\63\3\63\3"+
		"\64\3\64\3\64\3\65\3\65\3\65\3\65\7\65\u0206\n\65\f\65\16\65\u0209\13"+
		"\65\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\5\67\u0215\n\67"+
		"\3\67\2\28\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66"+
		"8:<>@BDFHJLNPRTVXZ\\^`bdfhjl\2\7\4\2STZZ\3\2ST\3\2IJ\4\2((*/\4\2XXZZ\2"+
		"\u022f\2r\3\2\2\2\4t\3\2\2\2\6|\3\2\2\2\b\177\3\2\2\2\n\u009f\3\2\2\2"+
		"\f\u00a3\3\2\2\2\16\u00ba\3\2\2\2\20\u00bc\3\2\2\2\22\u00c1\3\2\2\2\24"+
		"\u00c6\3\2\2\2\26\u00cb\3\2\2\2\30\u00d0\3\2\2\2\32\u00d5\3\2\2\2\34\u00d7"+
		"\3\2\2\2\36\u00da\3\2\2\2 \u00dc\3\2\2\2\"\u00eb\3\2\2\2$\u00ee\3\2\2"+
		"\2&\u00fd\3\2\2\2(\u00ff\3\2\2\2*\u0101\3\2\2\2,\u0119\3\2\2\2.\u0125"+
		"\3\2\2\2\60\u012f\3\2\2\2\62\u013c\3\2\2\2\64\u013e\3\2\2\2\66\u015e\3"+
		"\2\2\28\u0160\3\2\2\2:\u0164\3\2\2\2<\u016c\3\2\2\2>\u0170\3\2\2\2@\u0172"+
		"\3\2\2\2B\u0175\3\2\2\2D\u0177\3\2\2\2F\u017b\3\2\2\2H\u0187\3\2\2\2J"+
		"\u0189\3\2\2\2L\u0192\3\2\2\2N\u0199\3\2\2\2P\u019b\3\2\2\2R\u01a9\3\2"+
		"\2\2T\u01ad\3\2\2\2V\u01bc\3\2\2\2X\u01be\3\2\2\2Z\u01c2\3\2\2\2\\\u01cf"+
		"\3\2\2\2^\u01d7\3\2\2\2`\u01e7\3\2\2\2b\u01f8\3\2\2\2d\u01fb\3\2\2\2f"+
		"\u01fe\3\2\2\2h\u0201\3\2\2\2j\u020a\3\2\2\2l\u020e\3\2\2\2ns\5\4\3\2"+
		"op\5\6\4\2pq\7@\2\2qs\3\2\2\2rn\3\2\2\2ro\3\2\2\2s\3\3\2\2\2tu\7$\2\2"+
		"uv\7Z\2\2v\5\3\2\2\2w}\5F$\2x}\5P)\2y}\5\b\5\2z}\5Z.\2{}\5J&\2|w\3\2\2"+
		"\2|x\3\2\2\2|y\3\2\2\2|z\3\2\2\2|{\3\2\2\2}\7\3\2\2\2~\u0080\7B\2\2\177"+
		"~\3\2\2\2\177\u0080\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0083\7\35\2\2\u0082"+
		"\u0084\5\n\6\2\u0083\u0082\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\3\2"+
		"\2\2\u0085\u0087\5\f\7\2\u0086\u0088\5 \21\2\u0087\u0086\3\2\2\2\u0087"+
		"\u0088\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008b\5\"\22\2\u008a\u008c\5"+
		"`\61\2\u008b\u008a\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008e\3\2\2\2\u008d"+
		"\u008f\5l\67\2\u008e\u008d\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0091\3\2"+
		"\2\2\u0090\u0092\5*\26\2\u0091\u0090\3\2\2\2\u0091\u0092\3\2\2\2\u0092"+
		"\u0094\3\2\2\2\u0093\u0095\58\35\2\u0094\u0093\3\2\2\2\u0094\u0095\3\2"+
		"\2\2\u0095\u0097\3\2\2\2\u0096\u0098\5@!\2\u0097\u0096\3\2\2\2\u0097\u0098"+
		"\3\2\2\2\u0098\u009a\3\2\2\2\u0099\u009b\5D#\2\u009a\u0099\3\2\2\2\u009a"+
		"\u009b\3\2\2\2\u009b\u009d\3\2\2\2\u009c\u009e\7C\2\2\u009d\u009c\3\2"+
		"\2\2\u009d\u009e\3\2\2\2\u009e\t\3\2\2\2\u009f\u00a0\7\f\2\2\u00a0\13"+
		"\3\2\2\2\u00a1\u00a4\5\16\b\2\u00a2\u00a4\7\61\2\2\u00a3\u00a1\3\2\2\2"+
		"\u00a3\u00a2\3\2\2\2\u00a4\u00a9\3\2\2\2\u00a5\u00a6\7?\2\2\u00a6\u00a8"+
		"\5\16\b\2\u00a7\u00a5\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2"+
		"\u00a9\u00aa\3\2\2\2\u00aa\r\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00bb\5"+
		"V,\2\u00ad\u00b3\5\20\t\2\u00ae\u00b3\5\22\n\2\u00af\u00b3\5\24\13\2\u00b0"+
		"\u00b3\5\26\f\2\u00b1\u00b3\5\30\r\2\u00b2\u00ad\3\2\2\2\u00b2\u00ae\3"+
		"\2\2\2\u00b2\u00af\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b1\3\2\2\2\u00b3"+
		"\u00b6\3\2\2\2\u00b4\u00b7\5\34\17\2\u00b5\u00b7\5\36\20\2\u00b6\u00b4"+
		"\3\2\2\2\u00b6\u00b5\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b9\3\2\2\2\u00b8"+
		"\u00b2\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00bb\3\2\2\2\u00ba\u00ac\3\2"+
		"\2\2\u00ba\u00b8\3\2\2\2\u00bb\17\3\2\2\2\u00bc\u00bd\7\37\2\2\u00bd\u00be"+
		"\7B\2\2\u00be\u00bf\5V,\2\u00bf\u00c0\7C\2\2\u00c0\21\3\2\2\2\u00c1\u00c2"+
		"\7\n\2\2\u00c2\u00c3\7B\2\2\u00c3\u00c4\5V,\2\u00c4\u00c5\7C\2\2\u00c5"+
		"\23\3\2\2\2\u00c6\u00c7\7\5\2\2\u00c7\u00c8\7B\2\2\u00c8\u00c9\5V,\2\u00c9"+
		"\u00ca\7C\2\2\u00ca\25\3\2\2\2\u00cb\u00cc\7\27\2\2\u00cc\u00cd\7B\2\2"+
		"\u00cd\u00ce\5V,\2\u00ce\u00cf\7C\2\2\u00cf\27\3\2\2\2\u00d0\u00d1\7\30"+
		"\2\2\u00d1\u00d2\7B\2\2\u00d2\u00d3\5V,\2\u00d3\u00d4\7C\2\2\u00d4\31"+
		"\3\2\2\2\u00d5\u00d6\7Z\2\2\u00d6\33\3\2\2\2\u00d7\u00d8\7\6\2\2\u00d8"+
		"\u00d9\5\36\20\2\u00d9\35\3\2\2\2\u00da\u00db\t\2\2\2\u00db\37\3\2\2\2"+
		"\u00dc\u00e9\7O\2\2\u00dd\u00de\7P\2\2\u00de\u00ea\t\3\2\2\u00df\u00e0"+
		"\7Q\2\2\u00e0\u00ea\t\3\2\2\u00e1\u00e6\7Z\2\2\u00e2\u00e3\7?\2\2\u00e3"+
		"\u00e5\7Z\2\2\u00e4\u00e2\3\2\2\2\u00e5\u00e8\3\2\2\2\u00e6\u00e4\3\2"+
		"\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00ea\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e9"+
		"\u00dd\3\2\2\2\u00e9\u00df\3\2\2\2\u00e9\u00e1\3\2\2\2\u00ea!\3\2\2\2"+
		"\u00eb\u00ec\7\20\2\2\u00ec\u00ed\5$\23\2\u00ed#\3\2\2\2\u00ee\u00f3\5"+
		"&\24\2\u00ef\u00f0\7?\2\2\u00f0\u00f2\5&\24\2\u00f1\u00ef\3\2\2\2\u00f2"+
		"\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4%\3\2\2\2"+
		"\u00f5\u00f3\3\2\2\2\u00f6\u00fe\5(\25\2\u00f7\u00f8\5(\25\2\u00f8\u00f9"+
		"\5\36\20\2\u00f9\u00fe\3\2\2\2\u00fa\u00fb\5(\25\2\u00fb\u00fc\5\34\17"+
		"\2\u00fc\u00fe\3\2\2\2\u00fd\u00f6\3\2\2\2\u00fd\u00f7\3\2\2\2\u00fd\u00fa"+
		"\3\2\2\2\u00fe\'\3\2\2\2\u00ff\u0100\7Z\2\2\u0100)\3\2\2\2\u0101\u0103"+
		"\7\'\2\2\u0102\u0104\5\64\33\2\u0103\u0102\3\2\2\2\u0103\u0104\3\2\2\2"+
		"\u0104\u0106\3\2\2\2\u0105\u0107\5,\27\2\u0106\u0105\3\2\2\2\u0106\u0107"+
		"\3\2\2\2\u0107\u0109\3\2\2\2\u0108\u010a\5.\30\2\u0109\u0108\3\2\2\2\u0109"+
		"\u010a\3\2\2\2\u010a\u0117\3\2\2\2\u010b\u010d\7\32\2\2\u010c\u010b\3"+
		"\2\2\2\u010c\u010d\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u010f\7\16\2\2\u010f"+
		"\u0118\5\b\5\2\u0110\u0111\7\7\2\2\u0111\u0118\5\b\5\2\u0112\u0113\7\b"+
		"\2\2\u0113\u0114\5\62\32\2\u0114\u0115\7\4\2\2\u0115\u0116\5\62\32\2\u0116"+
		"\u0118\3\2\2\2\u0117\u010c\3\2\2\2\u0117\u0110\3\2\2\2\u0117\u0112\3\2"+
		"\2\2\u0117\u0118\3\2\2\2\u0118+\3\2\2\2\u0119\u011a\7\26\2\2\u011a\u011c"+
		"\7V\2\2\u011b\u011d\7\64\2\2\u011c\u011b\3\2\2\2\u011c\u011d\3\2\2\2\u011d"+
		"\u011e\3\2\2\2\u011e\u0120\7Z\2\2\u011f\u0121\7\64\2\2\u0120\u011f\3\2"+
		"\2\2\u0120\u0121\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0123\7V\2\2\u0123"+
		"-\3\2\2\2\u0124\u0126\7\32\2\2\u0125\u0124\3\2\2\2\u0125\u0126\3\2\2\2"+
		"\u0126\u0127\3\2\2\2\u0127\u0128\7\22\2\2\u0128\u012b\7B\2\2\u0129\u012c"+
		"\5\60\31\2\u012a\u012c\5\b\5\2\u012b\u0129\3\2\2\2\u012b\u012a\3\2\2\2"+
		"\u012c\u012d\3\2\2\2\u012d\u012e\7C\2\2\u012e/\3\2\2\2\u012f\u0134\5\62"+
		"\32\2\u0130\u0131\7?\2\2\u0131\u0133\5\62\32\2\u0132\u0130\3\2\2\2\u0133"+
		"\u0136\3\2\2\2\u0134\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135\61\3\2\2"+
		"\2\u0136\u0134\3\2\2\2\u0137\u0138\7\65\2\2\u0138\u013d\7X\2\2\u0139\u013d"+
		"\7X\2\2\u013a\u013d\7S\2\2\u013b\u013d\7T\2\2\u013c\u0137\3\2\2\2\u013c"+
		"\u0139\3\2\2\2\u013c\u013a\3\2\2\2\u013c\u013b\3\2\2\2\u013d\63\3\2\2"+
		"\2\u013e\u0141\5\66\34\2\u013f\u0140\7\33\2\2\u0140\u0142\5\64\33\2\u0141"+
		"\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142\65\3\2\2\2\u0143\u0144\7B\2\2"+
		"\u0144\u0145\5\64\33\2\u0145\u014e\7C\2\2\u0146\u0147\7\33\2\2\u0147\u0149"+
		"\5\64\33\2\u0148\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014f\3\2\2\2"+
		"\u014a\u014b\7\4\2\2\u014b\u014d\5\64\33\2\u014c\u014a\3\2\2\2\u014c\u014d"+
		"\3\2\2\2\u014d\u014f\3\2\2\2\u014e\u0148\3\2\2\2\u014e\u014c\3\2\2\2\u014f"+
		"\u015f\3\2\2\2\u0150\u0158\5V,\2\u0151\u0156\5B\"\2\u0152\u0157\5\62\32"+
		"\2\u0153\u0157\5V,\2\u0154\u0155\7\7\2\2\u0155\u0157\5\2\2\2\u0156\u0152"+
		"\3\2\2\2\u0156\u0153\3\2\2\2\u0156\u0154\3\2\2\2\u0157\u0159\3\2\2\2\u0158"+
		"\u0151\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u015c\3\2\2\2\u015a\u015b\7\4"+
		"\2\2\u015b\u015d\5\64\33\2\u015c\u015a\3\2\2\2\u015c\u015d\3\2\2\2\u015d"+
		"\u015f\3\2\2\2\u015e\u0143\3\2\2\2\u015e\u0150\3\2\2\2\u015f\67\3\2\2"+
		"\2\u0160\u0161\7\21\2\2\u0161\u0162\7\t\2\2\u0162\u0163\5V,\2\u01639\3"+
		"\2\2\2\u0164\u0169\5<\37\2\u0165\u0166\7?\2\2\u0166\u0168\5<\37\2\u0167"+
		"\u0165\3\2\2\2\u0168\u016b\3\2\2\2\u0169\u0167\3\2\2\2\u0169\u016a\3\2"+
		"\2\2\u016a;\3\2\2\2\u016b\u0169\3\2\2\2\u016c\u016e\5V,\2\u016d\u016f"+
		"\5> \2\u016e\u016d\3\2\2\2\u016e\u016f\3\2\2\2\u016f=\3\2\2\2\u0170\u0171"+
		"\t\4\2\2\u0171?\3\2\2\2\u0172\u0173\7R\2\2\u0173\u0174\5\64\33\2\u0174"+
		"A\3\2\2\2\u0175\u0176\t\5\2\2\u0176C\3\2\2\2\u0177\u0178\7\31\2\2\u0178"+
		"\u0179\7\t\2\2\u0179\u017a\5:\36\2\u017aE\3\2\2\2\u017b\u017c\7\13\2\2"+
		"\u017c\u017d\7\20\2\2\u017d\u017f\5$\23\2\u017e\u0180\5*\26\2\u017f\u017e"+
		"\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0182\3\2\2\2\u0181\u0183\5D#\2\u0182"+
		"\u0181\3\2\2\2\u0182\u0183\3\2\2\2\u0183\u0185\3\2\2\2\u0184\u0186\5H"+
		"%\2\u0185\u0184\3\2\2\2\u0185\u0186\3\2\2\2\u0186G\3\2\2\2\u0187\u0188"+
		"\t\6\2\2\u0188I\3\2\2\2\u0189\u018a\7\r\2\2\u018a\u018b\7 \2\2\u018b\u0190"+
		"\5L\'\2\u018c\u018d\7\26\2\2\u018d\u0191\5N(\2\u018e\u018f\7\6\2\2\u018f"+
		"\u0191\5\b\5\2\u0190\u018c\3\2\2\2\u0190\u018e\3\2\2\2\u0191K\3\2\2\2"+
		"\u0192\u0193\5(\25\2\u0193M\3\2\2\2\u0194\u019a\5(\25\2\u0195\u0196\5"+
		"(\25\2\u0196\u0197\7>\2\2\u0197\u0198\5\32\16\2\u0198\u019a\3\2\2\2\u0199"+
		"\u0194\3\2\2\2\u0199\u0195\3\2\2\2\u019aO\3\2\2\2\u019b\u019c\7\24\2\2"+
		"\u019c\u019d\7O\2\2\u019d\u01a1\5(\25\2\u019e\u01a0\5R*\2\u019f\u019e"+
		"\3\2\2\2\u01a0\u01a3\3\2\2\2\u01a1\u019f\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2"+
		"\u01a7\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a4\u01a5\7&\2\2\u01a5\u01a8\5X-"+
		"\2\u01a6\u01a8\5\b\5\2\u01a7\u01a4\3\2\2\2\u01a7\u01a6\3\2\2\2\u01a8Q"+
		"\3\2\2\2\u01a9\u01aa\7B\2\2\u01aa\u01ab\5T+\2\u01ab\u01ac\7C\2\2\u01ac"+
		"S\3\2\2\2\u01ad\u01b2\5V,\2\u01ae\u01af\7?\2\2\u01af\u01b1\5V,\2\u01b0"+
		"\u01ae\3\2\2\2\u01b1\u01b4\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b2\u01b3\3\2"+
		"\2\2\u01b3U\3\2\2\2\u01b4\u01b2\3\2\2\2\u01b5\u01bd\5\32\16\2\u01b6\u01b7"+
		"\5\32\16\2\u01b7\u01b8\5\36\20\2\u01b8\u01bd\3\2\2\2\u01b9\u01ba\5\32"+
		"\16\2\u01ba\u01bb\5\34\17\2\u01bb\u01bd\3\2\2\2\u01bc\u01b5\3\2\2\2\u01bc"+
		"\u01b6\3\2\2\2\u01bc\u01b9\3\2\2\2\u01bdW\3\2\2\2\u01be\u01bf\7B\2\2\u01bf"+
		"\u01c0\5\60\31\2\u01c0\u01c1\7C\2\2\u01c1Y\3\2\2\2\u01c2\u01c3\7!\2\2"+
		"\u01c3\u01c4\5\\/\2\u01c4\u01c5\7\36\2\2\u01c5\u01c7\5^\60\2\u01c6\u01c8"+
		"\5*\26\2\u01c7\u01c6\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8\u01ca\3\2\2\2\u01c9"+
		"\u01cb\5D#\2\u01ca\u01c9\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01cd\3\2\2"+
		"\2\u01cc\u01ce\5H%\2\u01cd\u01cc\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce[\3"+
		"\2\2\2\u01cf\u01d4\7Z\2\2\u01d0\u01d1\7?\2\2\u01d1\u01d3\7Z\2\2\u01d2"+
		"\u01d0\3\2\2\2\u01d3\u01d6\3\2\2\2\u01d4\u01d2\3\2\2\2\u01d4\u01d5\3\2"+
		"\2\2\u01d5]\3\2\2\2\u01d6\u01d4\3\2\2\2\u01d7\u01d8\5V,\2\u01d8\u01d9"+
		"\7(\2\2\u01d9\u01e1\5\62\32\2\u01da\u01db\7?\2\2\u01db\u01dc\5V,\2\u01dc"+
		"\u01dd\7(\2\2\u01dd\u01de\5\62\32\2\u01de\u01e0\3\2\2\2\u01df\u01da\3"+
		"\2\2\2\u01e0\u01e3\3\2\2\2\u01e1\u01df\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2"+
		"_\3\2\2\2\u01e3\u01e1\3\2\2\2\u01e4\u01e8\5b\62\2\u01e5\u01e8\5f\64\2"+
		"\u01e6\u01e8\5d\63\2\u01e7\u01e4\3\2\2\2\u01e7\u01e5\3\2\2\2\u01e7\u01e6"+
		"\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9\u01f0\5&\24\2\u01ea\u01f1\5h\65\2\u01eb"+
		"\u01ec\7#\2\2\u01ec\u01ed\7B\2\2\u01ed\u01ee\5V,\2\u01ee\u01ef\7C\2\2"+
		"\u01ef\u01f1\3\2\2\2\u01f0\u01ea\3\2\2\2\u01f0\u01eb\3\2\2\2\u01f1\u01f5"+
		"\3\2\2\2\u01f2\u01f4\5`\61\2\u01f3\u01f2\3\2\2\2\u01f4\u01f7\3\2\2\2\u01f5"+
		"\u01f3\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6a\3\2\2\2\u01f7\u01f5\3\2\2\2"+
		"\u01f8\u01f9\7\23\2\2\u01f9\u01fa\7\25\2\2\u01fac\3\2\2\2\u01fb\u01fc"+
		"\7\17\2\2\u01fc\u01fd\7\25\2\2\u01fde\3\2\2\2\u01fe\u01ff\7\34\2\2\u01ff"+
		"\u0200\7\25\2\2\u0200g\3\2\2\2\u0201\u0202\7%\2\2\u0202\u0207\5j\66\2"+
		"\u0203\u0204\7\4\2\2\u0204\u0206\5j\66\2\u0205\u0203\3\2\2\2\u0206\u0209"+
		"\3\2\2\2\u0207\u0205\3\2\2\2\u0207\u0208\3\2\2\2\u0208i\3\2\2\2\u0209"+
		"\u0207\3\2\2\2\u020a\u020b\5V,\2\u020b\u020c\5B\"\2\u020c\u020d\5V,\2"+
		"\u020dk\3\2\2\2\u020e\u0214\7\"\2\2\u020f\u0210\7\3\2\2\u0210\u0215\5"+
		"\b\5\2\u0211\u0215\5\b\5\2\u0212\u0213\7 \2\2\u0213\u0215\5(\25\2\u0214"+
		"\u020f\3\2\2\2\u0214\u0211\3\2\2\2\u0214\u0212\3\2\2\2\u0215m\3\2\2\2"+
		"@r|\177\u0083\u0087\u008b\u008e\u0091\u0094\u0097\u009a\u009d\u00a3\u00a9"+
		"\u00b2\u00b6\u00b8\u00ba\u00e6\u00e9\u00f3\u00fd\u0103\u0106\u0109\u010c"+
		"\u0117\u011c\u0120\u0125\u012b\u0134\u013c\u0141\u0148\u014c\u014e\u0156"+
		"\u0158\u015c\u015e\u0169\u016e\u017f\u0182\u0185\u0190\u0199\u01a1\u01a7"+
		"\u01b2\u01bc\u01c7\u01ca\u01cd\u01d4\u01e1\u01e7\u01f0\u01f5\u0207\u0214";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}