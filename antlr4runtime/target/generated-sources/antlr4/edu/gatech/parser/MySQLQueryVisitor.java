// Generated from edu/gatech/parser/MySQLQuery.g4 by ANTLR 4.8
package edu.gatech.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MySQLQueryParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MySQLQueryVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MySQLQueryParser#query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery(MySQLQueryParser.QueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLQueryParser#useClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUseClause(MySQLQueryParser.UseClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLQueryParser#simpleStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleStatement(MySQLQueryParser.SimpleStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLQueryParser#selectStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectStatement(MySQLQueryParser.SelectStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLQueryParser#distinctClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDistinctClause(MySQLQueryParser.DistinctClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLQueryParser#selectItemList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectItemList(MySQLQueryParser.SelectItemListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLQueryParser#selectItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectItem(MySQLQueryParser.SelectItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLQueryParser#sumClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSumClause(MySQLQueryParser.SumClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLQueryParser#countClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCountClause(MySQLQueryParser.CountClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLQueryParser#avgClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAvgClause(MySQLQueryParser.AvgClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLQueryParser#minClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinClause(MySQLQueryParser.MinClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLQueryParser#maxClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaxClause(MySQLQueryParser.MaxClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLQueryParser#columnName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnName(MySQLQueryParser.ColumnNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLQueryParser#selectAlias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectAlias(MySQLQueryParser.SelectAliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLQueryParser#alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlias(MySQLQueryParser.AliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLQueryParser#intoClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntoClause(MySQLQueryParser.IntoClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLQueryParser#fromClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromClause(MySQLQueryParser.FromClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLQueryParser#tableList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableList(MySQLQueryParser.TableListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLQueryParser#tableItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableItem(MySQLQueryParser.TableItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLQueryParser#tableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableName(MySQLQueryParser.TableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLQueryParser#whereClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhereClause(MySQLQueryParser.WhereClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLQueryParser#likeClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLikeClause(MySQLQueryParser.LikeClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLQueryParser#inClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInClause(MySQLQueryParser.InClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLQueryParser#valuesList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValuesList(MySQLQueryParser.ValuesListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLQueryParser#valueName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueName(MySQLQueryParser.ValueNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLQueryParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(MySQLQueryParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLQueryParser#groupByClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupByClause(MySQLQueryParser.GroupByClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLQueryParser#orderList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderList(MySQLQueryParser.OrderListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLQueryParser#orderExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderExpression(MySQLQueryParser.OrderExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLQueryParser#direction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirection(MySQLQueryParser.DirectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLQueryParser#havingClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHavingClause(MySQLQueryParser.HavingClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLQueryParser#compOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompOp(MySQLQueryParser.CompOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLQueryParser#orderClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderClause(MySQLQueryParser.OrderClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLQueryParser#deleteStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeleteStatement(MySQLQueryParser.DeleteStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLQueryParser#limitClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimitClause(MySQLQueryParser.LimitClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLQueryParser#createStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateStatement(MySQLQueryParser.CreateStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLQueryParser#newTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewTable(MySQLQueryParser.NewTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLQueryParser#existingTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExistingTable(MySQLQueryParser.ExistingTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLQueryParser#insertStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertStatement(MySQLQueryParser.InsertStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLQueryParser#columnItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnItem(MySQLQueryParser.ColumnItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLQueryParser#columnList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnList(MySQLQueryParser.ColumnListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLQueryParser#valueItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueItem(MySQLQueryParser.ValueItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLQueryParser#updateStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdateStatement(MySQLQueryParser.UpdateStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLQueryParser#tableRefList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableRefList(MySQLQueryParser.TableRefListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLQueryParser#assignmentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentList(MySQLQueryParser.AssignmentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLQueryParser#joinClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinClause(MySQLQueryParser.JoinClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLQueryParser#innerJoin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInnerJoin(MySQLQueryParser.InnerJoinContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLQueryParser#leftJoin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeftJoin(MySQLQueryParser.LeftJoinContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLQueryParser#rightJoin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRightJoin(MySQLQueryParser.RightJoinContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLQueryParser#unionClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnionClause(MySQLQueryParser.UnionClauseContext ctx);
}