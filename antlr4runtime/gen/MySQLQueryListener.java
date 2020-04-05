// Generated from /Users/foo/Downloads/Query-Parser/antlr4runtime/src/main/antlr4/edu/gatech/parser/MySQLQuery.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MySQLQueryParser}.
 */
public interface MySQLQueryListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MySQLQueryParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(MySQLQueryParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLQueryParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(MySQLQueryParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLQueryParser#useClause}.
	 * @param ctx the parse tree
	 */
	void enterUseClause(MySQLQueryParser.UseClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLQueryParser#useClause}.
	 * @param ctx the parse tree
	 */
	void exitUseClause(MySQLQueryParser.UseClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLQueryParser#simpleStatement}.
	 * @param ctx the parse tree
	 */
	void enterSimpleStatement(MySQLQueryParser.SimpleStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLQueryParser#simpleStatement}.
	 * @param ctx the parse tree
	 */
	void exitSimpleStatement(MySQLQueryParser.SimpleStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLQueryParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void enterSelectStatement(MySQLQueryParser.SelectStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLQueryParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void exitSelectStatement(MySQLQueryParser.SelectStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLQueryParser#distinctClause}.
	 * @param ctx the parse tree
	 */
	void enterDistinctClause(MySQLQueryParser.DistinctClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLQueryParser#distinctClause}.
	 * @param ctx the parse tree
	 */
	void exitDistinctClause(MySQLQueryParser.DistinctClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLQueryParser#selectItemList}.
	 * @param ctx the parse tree
	 */
	void enterSelectItemList(MySQLQueryParser.SelectItemListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLQueryParser#selectItemList}.
	 * @param ctx the parse tree
	 */
	void exitSelectItemList(MySQLQueryParser.SelectItemListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLQueryParser#selectItem}.
	 * @param ctx the parse tree
	 */
	void enterSelectItem(MySQLQueryParser.SelectItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLQueryParser#selectItem}.
	 * @param ctx the parse tree
	 */
	void exitSelectItem(MySQLQueryParser.SelectItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLQueryParser#sumClause}.
	 * @param ctx the parse tree
	 */
	void enterSumClause(MySQLQueryParser.SumClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLQueryParser#sumClause}.
	 * @param ctx the parse tree
	 */
	void exitSumClause(MySQLQueryParser.SumClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLQueryParser#countClause}.
	 * @param ctx the parse tree
	 */
	void enterCountClause(MySQLQueryParser.CountClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLQueryParser#countClause}.
	 * @param ctx the parse tree
	 */
	void exitCountClause(MySQLQueryParser.CountClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLQueryParser#avgClause}.
	 * @param ctx the parse tree
	 */
	void enterAvgClause(MySQLQueryParser.AvgClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLQueryParser#avgClause}.
	 * @param ctx the parse tree
	 */
	void exitAvgClause(MySQLQueryParser.AvgClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLQueryParser#minClause}.
	 * @param ctx the parse tree
	 */
	void enterMinClause(MySQLQueryParser.MinClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLQueryParser#minClause}.
	 * @param ctx the parse tree
	 */
	void exitMinClause(MySQLQueryParser.MinClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLQueryParser#maxClause}.
	 * @param ctx the parse tree
	 */
	void enterMaxClause(MySQLQueryParser.MaxClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLQueryParser#maxClause}.
	 * @param ctx the parse tree
	 */
	void exitMaxClause(MySQLQueryParser.MaxClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLQueryParser#columnName}.
	 * @param ctx the parse tree
	 */
	void enterColumnName(MySQLQueryParser.ColumnNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLQueryParser#columnName}.
	 * @param ctx the parse tree
	 */
	void exitColumnName(MySQLQueryParser.ColumnNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLQueryParser#selectAlias}.
	 * @param ctx the parse tree
	 */
	void enterSelectAlias(MySQLQueryParser.SelectAliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLQueryParser#selectAlias}.
	 * @param ctx the parse tree
	 */
	void exitSelectAlias(MySQLQueryParser.SelectAliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLQueryParser#intoClause}.
	 * @param ctx the parse tree
	 */
	void enterIntoClause(MySQLQueryParser.IntoClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLQueryParser#intoClause}.
	 * @param ctx the parse tree
	 */
	void exitIntoClause(MySQLQueryParser.IntoClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLQueryParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void enterFromClause(MySQLQueryParser.FromClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLQueryParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void exitFromClause(MySQLQueryParser.FromClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLQueryParser#tableList}.
	 * @param ctx the parse tree
	 */
	void enterTableList(MySQLQueryParser.TableListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLQueryParser#tableList}.
	 * @param ctx the parse tree
	 */
	void exitTableList(MySQLQueryParser.TableListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLQueryParser#tableItem}.
	 * @param ctx the parse tree
	 */
	void enterTableItem(MySQLQueryParser.TableItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLQueryParser#tableItem}.
	 * @param ctx the parse tree
	 */
	void exitTableItem(MySQLQueryParser.TableItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLQueryParser#tableName}.
	 * @param ctx the parse tree
	 */
	void enterTableName(MySQLQueryParser.TableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLQueryParser#tableName}.
	 * @param ctx the parse tree
	 */
	void exitTableName(MySQLQueryParser.TableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLQueryParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void enterWhereClause(MySQLQueryParser.WhereClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLQueryParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void exitWhereClause(MySQLQueryParser.WhereClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLQueryParser#likeClause}.
	 * @param ctx the parse tree
	 */
	void enterLikeClause(MySQLQueryParser.LikeClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLQueryParser#likeClause}.
	 * @param ctx the parse tree
	 */
	void exitLikeClause(MySQLQueryParser.LikeClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLQueryParser#inClause}.
	 * @param ctx the parse tree
	 */
	void enterInClause(MySQLQueryParser.InClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLQueryParser#inClause}.
	 * @param ctx the parse tree
	 */
	void exitInClause(MySQLQueryParser.InClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLQueryParser#valuesList}.
	 * @param ctx the parse tree
	 */
	void enterValuesList(MySQLQueryParser.ValuesListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLQueryParser#valuesList}.
	 * @param ctx the parse tree
	 */
	void exitValuesList(MySQLQueryParser.ValuesListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLQueryParser#valueName}.
	 * @param ctx the parse tree
	 */
	void enterValueName(MySQLQueryParser.ValueNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLQueryParser#valueName}.
	 * @param ctx the parse tree
	 */
	void exitValueName(MySQLQueryParser.ValueNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLQueryParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(MySQLQueryParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLQueryParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(MySQLQueryParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLQueryParser#groupByClause}.
	 * @param ctx the parse tree
	 */
	void enterGroupByClause(MySQLQueryParser.GroupByClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLQueryParser#groupByClause}.
	 * @param ctx the parse tree
	 */
	void exitGroupByClause(MySQLQueryParser.GroupByClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLQueryParser#orderList}.
	 * @param ctx the parse tree
	 */
	void enterOrderList(MySQLQueryParser.OrderListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLQueryParser#orderList}.
	 * @param ctx the parse tree
	 */
	void exitOrderList(MySQLQueryParser.OrderListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLQueryParser#orderExpression}.
	 * @param ctx the parse tree
	 */
	void enterOrderExpression(MySQLQueryParser.OrderExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLQueryParser#orderExpression}.
	 * @param ctx the parse tree
	 */
	void exitOrderExpression(MySQLQueryParser.OrderExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLQueryParser#direction}.
	 * @param ctx the parse tree
	 */
	void enterDirection(MySQLQueryParser.DirectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLQueryParser#direction}.
	 * @param ctx the parse tree
	 */
	void exitDirection(MySQLQueryParser.DirectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLQueryParser#havingClause}.
	 * @param ctx the parse tree
	 */
	void enterHavingClause(MySQLQueryParser.HavingClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLQueryParser#havingClause}.
	 * @param ctx the parse tree
	 */
	void exitHavingClause(MySQLQueryParser.HavingClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLQueryParser#compOp}.
	 * @param ctx the parse tree
	 */
	void enterCompOp(MySQLQueryParser.CompOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLQueryParser#compOp}.
	 * @param ctx the parse tree
	 */
	void exitCompOp(MySQLQueryParser.CompOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLQueryParser#orderClause}.
	 * @param ctx the parse tree
	 */
	void enterOrderClause(MySQLQueryParser.OrderClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLQueryParser#orderClause}.
	 * @param ctx the parse tree
	 */
	void exitOrderClause(MySQLQueryParser.OrderClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLQueryParser#deleteStatement}.
	 * @param ctx the parse tree
	 */
	void enterDeleteStatement(MySQLQueryParser.DeleteStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLQueryParser#deleteStatement}.
	 * @param ctx the parse tree
	 */
	void exitDeleteStatement(MySQLQueryParser.DeleteStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLQueryParser#limitClause}.
	 * @param ctx the parse tree
	 */
	void enterLimitClause(MySQLQueryParser.LimitClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLQueryParser#limitClause}.
	 * @param ctx the parse tree
	 */
	void exitLimitClause(MySQLQueryParser.LimitClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLQueryParser#createStatement}.
	 * @param ctx the parse tree
	 */
	void enterCreateStatement(MySQLQueryParser.CreateStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLQueryParser#createStatement}.
	 * @param ctx the parse tree
	 */
	void exitCreateStatement(MySQLQueryParser.CreateStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLQueryParser#newTable}.
	 * @param ctx the parse tree
	 */
	void enterNewTable(MySQLQueryParser.NewTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLQueryParser#newTable}.
	 * @param ctx the parse tree
	 */
	void exitNewTable(MySQLQueryParser.NewTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLQueryParser#existingTable}.
	 * @param ctx the parse tree
	 */
	void enterExistingTable(MySQLQueryParser.ExistingTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLQueryParser#existingTable}.
	 * @param ctx the parse tree
	 */
	void exitExistingTable(MySQLQueryParser.ExistingTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLQueryParser#insertStatement}.
	 * @param ctx the parse tree
	 */
	void enterInsertStatement(MySQLQueryParser.InsertStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLQueryParser#insertStatement}.
	 * @param ctx the parse tree
	 */
	void exitInsertStatement(MySQLQueryParser.InsertStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLQueryParser#columnItem}.
	 * @param ctx the parse tree
	 */
	void enterColumnItem(MySQLQueryParser.ColumnItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLQueryParser#columnItem}.
	 * @param ctx the parse tree
	 */
	void exitColumnItem(MySQLQueryParser.ColumnItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLQueryParser#columnList}.
	 * @param ctx the parse tree
	 */
	void enterColumnList(MySQLQueryParser.ColumnListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLQueryParser#columnList}.
	 * @param ctx the parse tree
	 */
	void exitColumnList(MySQLQueryParser.ColumnListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLQueryParser#valueItem}.
	 * @param ctx the parse tree
	 */
	void enterValueItem(MySQLQueryParser.ValueItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLQueryParser#valueItem}.
	 * @param ctx the parse tree
	 */
	void exitValueItem(MySQLQueryParser.ValueItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLQueryParser#updateStatement}.
	 * @param ctx the parse tree
	 */
	void enterUpdateStatement(MySQLQueryParser.UpdateStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLQueryParser#updateStatement}.
	 * @param ctx the parse tree
	 */
	void exitUpdateStatement(MySQLQueryParser.UpdateStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLQueryParser#tableRefList}.
	 * @param ctx the parse tree
	 */
	void enterTableRefList(MySQLQueryParser.TableRefListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLQueryParser#tableRefList}.
	 * @param ctx the parse tree
	 */
	void exitTableRefList(MySQLQueryParser.TableRefListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLQueryParser#assignmentList}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentList(MySQLQueryParser.AssignmentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLQueryParser#assignmentList}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentList(MySQLQueryParser.AssignmentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLQueryParser#joinClause}.
	 * @param ctx the parse tree
	 */
	void enterJoinClause(MySQLQueryParser.JoinClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLQueryParser#joinClause}.
	 * @param ctx the parse tree
	 */
	void exitJoinClause(MySQLQueryParser.JoinClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLQueryParser#unionClause}.
	 * @param ctx the parse tree
	 */
	void enterUnionClause(MySQLQueryParser.UnionClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLQueryParser#unionClause}.
	 * @param ctx the parse tree
	 */
	void exitUnionClause(MySQLQueryParser.UnionClauseContext ctx);
}