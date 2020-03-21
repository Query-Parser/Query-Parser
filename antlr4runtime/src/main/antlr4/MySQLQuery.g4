grammar MySQLQuery;

/*
 * Parser Rules
 */
query:
    EOF
    | (simpleStatement | beginWork) (SEMICOLON_SYMBOL EOF? | EOF)
;

simpleStatement:
    deleteStatement
    | insertStatement
    | selectStatement
    | updateStatement
    | createStatement
;

//SELECT
selectStatement:
    SELECT_SYMBOL selectItemList intoClause? fromClause? whereClause?
        groupByClause? havingClause? orderClause?
;

selectItemList:
    (selectItem | MULT_OPERATOR) (COMMA_SYMBOL selectItem)*
;

selectItem:
    columnName
    | (columnName selectAlias?)
;

columnName:
    WORD | tableName
;
selectAlias:
    AS_SYMBOL (SINGLE_QUOTE alias SINGLE_QUOTE | DOUBLE_QUOTE alias DOUBLE_QUOTE)
;

alias:
    WORD
;

intoClause:
    INTO_SYMBOL (
        OUTFILE_SYMBOL (SINGLE_QUOTE fileName SINGLE_QUOTE | DOUBLE_QUOTE fileName DOUBLE_QUOTE)
        | DUMPFILE_SYMBOL (SINGLE_QUOTE fileName SINGLE_QUOTE | DOUBLE_QUOTE fileName DOUBLE_QUOTE)
        | varName (COMMA_SYMBOL varName)*
    )
;

fileName:
    WORD
;

varName:
    WORD
;

fromClause:
    FROM_SYMBOL  tableList
;

tableList:
    tableItem (COMMA_SYMBOL tableItem)*
;

tableItem:
    tableName
    | (tableName selectAlias?)
;

tableName:
    WORD DOT_SYMBOL WORD
    | WORD
;

whereClause:
    WHERE_SYMBOL
        expr (likeClause? inClause?
        | NOT_SYMBOL? EXISTS_SYMBOL selectStatement
        | ANY_SYMBOL OPEN_PAR_SYMBOL selectStatement CLOSE_PAR_SYMBOL
        | BETWEEN_SYMBOL valueName AND_SYMBOL valueName)
        | OR_SYMBOL expr
;

likeClause:
    LIKE_SYMBOL SINGLE_QUOTE MOD_OPERATOR? WORD MOD_OPERATOR? SINGLE_QUOTE
;

inClause:
    IN_SYMBOL OPEN_PAR_SYMBOL valuesList CLOSE_PAR_SYMBOL
;

valuesList:
    valueName (COMMA_SYMBOL valueName)*
;

valueName:
    WORD
    | NUMBER
    | SINGLE_QUOTED_TEXT
;

expr:
    columnName
    | (columnName compOp NUMBER) (AND_SYMBOL expr)*
    | (columnName EQUAL_OPERATOR SINGLE_QUOTE WORD SINGLE_QUOTE) (AND_SYMBOL expr)*
;

groupByClause:
    GROUP_SYMBOL BY_SYMBOL orderList
;

orderList:
    orderExpression (COMMA_SYMBOL orderExpression)*
;

orderExpression:
    expr direction?
;

direction:
    ASC_SYMBOL
    | DESC_SYMBOL
;

havingClause:
    HAVING_SYMBOL expr
;

compOp:
    EQUAL_OPERATOR
    | NULL_SAFE_EQUAL_OPERATOR
    | GREATER_OR_EQUAL_OPERATOR
    | GREATER_THAN_OPERATOR
    | LESS_OR_EQUAL_OPERATOR
    | LESS_THAN_OPERATOR
    | NOT_EQUAL_OPERATOR
;

orderClause:
    ORDER_SYMBOL BY_SYMBOL orderList
;

//DELETE
deleteStatement:
     DELETE_SYMBOL FROM_SYMBOL tableList whereClause? orderClause? limitClause?
;

limitClause:
    WORD
    | NUMBER
;

//CREATE
createStatement:
    CREATE_SYMBOL TABLE_SYMBOL newTable (
    LIKE_SYMBOL existingTable
    | SELECT_SYMBOL existingTable
    )
;

newTable:
    tableName
;

existingTable:
    tableName
    | tableName DOT_SYMBOL columnName
;

//INSERT
 insertStatement:
     INSERT_SYMBOL INTO_SYMBOL tableName columnItem
     (VALUES_SYMBOL valueItem | selectStatement)
 ;

 columnItem:
  OPEN_PAR_SYMBOL columnList CLOSE_PAR_SYMBOL
 ;

 columnList:
     columnName (COMMA_SYMBOL columnName)*
 ;

 valueItem:
     OPEN_PAR_SYMBOL valuesList CLOSE_PAR_SYMBOL
 ;

 //UPDATE
updateStatement:
    UPDATE_SYMBOL tableRefList SET_SYMBOL assignmentList whereClause? orderClause? limitClause?
;

tableRefList:
    tableReference (COMMA_SYMBOL tableReference)*
;

tableReference:
    WORD
;

assignmentList :
    columnName EQUAL_OPERATOR columnName math?
;

math:
    ARITHMETIC NUMBER
;


//joins
//naturalJoinType:
//    NATURAL_SYMBOL INNER_SYMBOL? JOIN_SYMBOL
//    | NATURAL_SYMBOL (LEFT_SYMBOL | RIGHT_SYMBOL) OUTER_SYMBOL? JOIN_SYMBOL
//;
//
//innerJoinType:
//    type = (INNER_SYMBOL | CROSS_SYMBOL)? JOIN_SYMBOL
//    | type = STRAIGHT_JOIN_SYMBOL
//;
//
//outerJoinType:
//    type = (LEFT_SYMBOL | RIGHT_SYMBOL) OUTER_SYMBOL? JOIN_SYMBOL
//;


/*
 * Lexer Rules
 */
AND_SYMBOL:                      A N D;
AS_SYMBOL:                       A S;
ANY_SYMBOL:                      A N Y;
BETWEEN_SYMBOL:                  B E T W E E N;
BY_SYMBOL:                       B Y;
CREATE_SYMBOL:                   C R E A T E;
EXISTS_SYMBOL:                   E X I S T S;
FROM_SYMBOL:                     F R O M;
GROUP_SYMBOL:                    G R O U P;
IN_SYMBOL:                       I N;
INSERT_SYMBOL:                   I N S E R T;
JOIN_SYMBOL:                     J O I N;
LIKE_SYMBOL:                     L I K E;
ORDER_SYMBOL:                    O R D E R;
NOT_SYMBOL:                      N O T;
OR_SYMBOL:                       O R;
SELECT_SYMBOL:                   S E L E C T;
TABLE_SYMBOL:                    T A B L E;
WHERE_SYMBOL:                    W H E R E;

EQUAL_OPERATOR:            '=';
ASSIGN_OPERATOR:           ':=';
NULL_SAFE_EQUAL_OPERATOR:  '<=>';
GREATER_OR_EQUAL_OPERATOR: '>=';
GREATER_THAN_OPERATOR:     '>';
LESS_OR_EQUAL_OPERATOR:    '<=';
LESS_THAN_OPERATOR:        '<';
NOT_EQUAL_OPERATOR:        '!=';
NOT_EQUAL2_OPERATOR:       '<>' -> type(NOT_EQUAL_OPERATOR);

PLUS_OPERATOR:  '+';
MULT_OPERATOR: '*';
MINUS_OPERATOR: '-';
DIV_OPERATOR:   '/';
MOD_OPERATOR: '%';
fragment ARITHMETIC: ('+' | '*' | '-' | '/' | '%');

LOGICAL_NOT_OPERATOR: '!';
BITWISE_NOT_OPERATOR: '~';
SHIFT_LEFT_OPERATOR:  '<<';
SHIFT_RIGHT_OPERATOR: '>>';
LOGICAL_AND_OPERATOR: '&&';
BITWISE_AND_OPERATOR: '&';
BITWISE_XOR_OPERATOR: '^';
BITWISE_OR_OPERATOR: '|';

DOT_SYMBOL:         '.';
COMMA_SYMBOL:       ',';
SEMICOLON_SYMBOL:   ';';
COLON_SYMBOL:       ':';
OPEN_PAR_SYMBOL:    '(';
CLOSE_PAR_SYMBOL:   ')';
OPEN_CURLY_SYMBOL:  '{';
CLOSE_CURLY_SYMBOL: '}';
UNDERLINE_SYMBOL:   '_';

TRUE_SYMBOL:                     T R U E;
FALSE_SYMBOL:                    F A L S E;
ASC_SYMBOL:                      A S C;
DESC_SYMBOL:                     D E S C;
BEGIN_SYMBOL:                    B E G I N;
WORK_SYMBOL:                     W O R K;
LIMIT_SYMBOL:                    L I M I T;
PRIMARY_SYMBOL:                  P R I M A R Y;
INTO_SYMBOL:                     I N T O;
OUTFILE_SYMBOL:                  O U T F I L E;
DUMPFILE_SYMBOL:                 D U M P F I L E;
HAVING_SYMBOL:                   H A V I N G;

fragment A: [aA];
fragment B: [bB];
fragment C: [cC];
fragment D: [dD];
fragment E: [eE];
fragment F: [fF];
fragment G: [gG];
fragment H: [hH];
fragment I: [iI];
fragment J: [jJ];
fragment K: [kK];
fragment L: [lL];
fragment M: [mM];
fragment N: [nN];
fragment O: [oO];
fragment P: [pP];
fragment Q: [qQ];
fragment R: [rR];
fragment S: [sS];
fragment T: [tT];
fragment U: [uU];
fragment V: [vV];
fragment W: [wW];
fragment X: [xX];
fragment Y: [yY];
fragment Z: [zZ];

fragment SINGLE_QUOTE: '\'';
fragment DOUBLE_QUOTE: '"';
fragment BACK_TICK:    '`';

fragment LETTER_WHEN_UNQUOTED: DIGIT | LETTER_WHEN_UNQUOTED_NO_DIGIT;
fragment LETTER_WHEN_UNQUOTED_NO_DIGIT: [a-zA-Z_$\u0080-\uffff];
fragment LETTER_WITHOUT_FLOAT_PART: [a-df-zA-DF-Z_$\u0080-\uffff];

SINGLE_QUOTED_TEXT: (
        SINGLE_QUOTE ( ('\\')? .)*? SINGLE_QUOTE
    )+
;

BACK_TICK_QUOTED_ID: BACK_TICK (( '\\')? .)*? BACK_TICK;

fragment LOWERCASE  : [a-z] ;
fragment UPPERCASE  : [A-Z];
WORD                : (LOWERCASE | UPPERCASE | '_')+ ;
WHITESPACE          : (' ' | '\t') -> skip;
NEWLINE             : ('\r'? '\n' | '\r')+ -> skip;

fragment DIGIT:    [0-9];
fragment DIGITS:   DIGIT+;
NUMBER         : DIGIT+ ([.,] DIGIT+)? ;