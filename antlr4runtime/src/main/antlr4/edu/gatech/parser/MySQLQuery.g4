grammar MySQLQuery;

/*
 * Parser Rules
 */
query:
    useClause | (simpleStatement SEMICOLON_SYMBOL)
;

useClause:
    USE_SYMBOL WORD
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
    OPEN_PAR_SYMBOL? SELECT_SYMBOL distinctClause? selectItemList intoClause?
        fromClause joinClause? unionClause? whereClause?
        groupByClause? havingClause? orderClause? CLOSE_PAR_SYMBOL?
;

distinctClause:
    DISTINCT_SYMBOL
;

selectItemList:
    (selectItem | MULT_OPERATOR) (COMMA_SYMBOL selectItem)*
;

selectItem:
    columnItem
    | ((sumClause | countClause | avgClause | minClause | maxClause) (selectAlias | alias)?)?
;

sumClause:
    SUM_SYMBOL OPEN_PAR_SYMBOL columnItem CLOSE_PAR_SYMBOL
;

countClause:
     COUNT_SYMBOL OPEN_PAR_SYMBOL columnItem CLOSE_PAR_SYMBOL
;

avgClause:
    AVERAGE_SYMBOL OPEN_PAR_SYMBOL columnItem CLOSE_PAR_SYMBOL
;

minClause:
    MIN_SYMBOL OPEN_PAR_SYMBOL columnItem CLOSE_PAR_SYMBOL
;

maxClause:
    MAX_SYMBOL OPEN_PAR_SYMBOL columnItem CLOSE_PAR_SYMBOL
;


columnName:
    WORD
;
selectAlias:
    AS_SYMBOL alias
;

alias:
    (SQ_TEXT | DQ_TEXT | WORD )
;

intoClause:
    INTO_SYMBOL (
        OUTFILE_SYMBOL (SQ_TEXT | DQ_TEXT)
        | DUMPFILE_SYMBOL (SQ_TEXT | DQ_TEXT)
        | WORD (COMMA_SYMBOL WORD)*
    )

;

fromClause:
    FROM_SYMBOL tableList
;

tableList:
    tableItem (COMMA_SYMBOL tableItem)*
;

tableItem:
    tableName
    | (tableName alias)
    | (tableName selectAlias)
;

tableName:
    WORD
;

whereClause:
    WHERE_SYMBOL
    condition?
    likeClause? inClause?
    ((NOT_SYMBOL? EXISTS_SYMBOL selectStatement)
    | (ANY_SYMBOL selectStatement)
    | (BETWEEN_SYMBOL valueName AND_SYMBOL valueName))?
;

likeClause:
    LIKE_SYMBOL SINGLE_QUOTE MOD_OPERATOR? WORD MOD_OPERATOR? SINGLE_QUOTE
;

inClause:
    NOT_SYMBOL? IN_SYMBOL OPEN_PAR_SYMBOL (valuesList | selectStatement) CLOSE_PAR_SYMBOL
;

valuesList:
    valueName (COMMA_SYMBOL valueName)*
;

valueName:
    (ARITHMETIC NUMBER)
    | NUMBER
    | SQ_TEXT
    | DQ_TEXT
;

condition:
    conditionInner (OR_SYMBOL condition)?
;

conditionInner:
    OPEN_PAR_SYMBOL condition CLOSE_PAR_SYMBOL ( (OR_SYMBOL condition)? | (AND_SYMBOL condition)? )
    | columnItem (compOp (valueName | columnItem | (ANY_SYMBOL query)))? (AND_SYMBOL condition)?
;

groupByClause:
    GROUP_SYMBOL BY_SYMBOL columnItem
;

orderList:
    orderExpression (COMMA_SYMBOL orderExpression)*
;

orderExpression:
    columnItem direction?
;

direction:
    ASC_SYMBOL
    | DESC_SYMBOL
;

havingClause:
    HAVING_SYMBOL condition
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
    | (AS_SYMBOL selectStatement)
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
     INSERT_SYMBOL INTO_SYMBOL tableName columnPar*
     (VALUES_SYMBOL valueItem | selectStatement)
 ;

 columnPar:
  OPEN_PAR_SYMBOL columnList CLOSE_PAR_SYMBOL
 ;

 columnList:
     columnItem (COMMA_SYMBOL columnItem)*
 ;

 columnItem:
    columnName
    | (columnName alias)
    | (columnName selectAlias)
 ;

 valueItem:
     OPEN_PAR_SYMBOL valuesList CLOSE_PAR_SYMBOL
 ;

 //UPDATE
updateStatement:
    UPDATE_SYMBOL tableRefList SET_SYMBOL assignmentList whereClause? orderClause? limitClause?
;

tableRefList:
    WORD (COMMA_SYMBOL WORD)*
;

assignmentList :
    columnItem EQUAL_OPERATOR valueName (COMMA_SYMBOL columnItem EQUAL_OPERATOR valueName)*
;

//JOIN
joinClause:
    (innerJoin | rightJoin | leftJoin) tableItem
    (onClause | USING_SYMBOL OPEN_PAR_SYMBOL columnItem CLOSE_PAR_SYMBOL)
    (joinClause)*
;

innerJoin:
    INNER_SYMBOL JOIN_SYMBOL
;

leftJoin:
    LEFT_SYMBOL JOIN_SYMBOL
;

rightJoin:
    RIGHT_SYMBOL JOIN_SYMBOL
;

onClause:
    ON_SYMBOL onList (AND_SYMBOL onList)*
;

onList:
    columnItem compOp columnItem
;

//UNION
unionClause:
    UNION_SYMBOL ((ALL_SYMBOL selectStatement)| selectStatement | TABLE_SYMBOL tableName )
;

/*
 * Lexer Rules
 */
ALL_SYMBOL:                      A L L;
AND_SYMBOL:                      A N D;
AVERAGE_SYMBOL:                  A V E R A G E;
AS_SYMBOL:                       A S;
ANY_SYMBOL:                      A N Y;
BETWEEN_SYMBOL:                  B E T W E E N;
BY_SYMBOL:                       B Y;
COUNT_SYMBOL:                    C O U N T;
DELETE_SYMBOL:                   D E L E T E;
DISTINCT_SYMBOL:                 D I S T I N C T;
CREATE_SYMBOL:                   C R E A T E;
EXISTS_SYMBOL:                   E X I S T S;
LEFT_SYMBOL:                     L E F T;
FROM_SYMBOL:                     F R O M;
GROUP_SYMBOL:                    G R O U P;
IN_SYMBOL:                       I N;
INNER_SYMBOL:                    I N N E R;
INSERT_SYMBOL:                   I N S E R T;
JOIN_SYMBOL:                     J O I N;
LIKE_SYMBOL:                     L I K E;
MIN_SYMBOL:                      M I N;
MAX_SYMBOL:                      M A X;
ORDER_SYMBOL:                    O R D E R;
NOT_SYMBOL:                      N O T;
OR_SYMBOL:                       O R;
RIGHT_SYMBOL:                    R I G H T;
SELECT_SYMBOL:                   S E L E C T;
SET_SYMBOL:                      S E T;
SUM_SYMBOL:                      S U M;
TABLE_SYMBOL:                    T A B L E;
UPDATE_SYMBOL:                   U P D A T E;
UNION_SYMBOL:                    U N I O N;
USING_SYMBOL:                    U S I N G;
USE_SYMBOL:                      U S E;
ON_SYMBOL:                       O N;
VALUES_SYMBOL:                   V A L U E S;
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
ARITHMETIC: ('+' | '*' | '-' | '/' | '%');

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

SQ_TEXT: '\'' WORD '\'';
DQ_TEXT: '"' WORD '"';
NAME: '\'' WORD WHITESPACE WORD '\'';
SINGLE_QUOTE: '\'' -> skip;
DOUBLE_QUOTE: '"' -> skip;

fragment LETTER_WHEN_UNQUOTED: DIGIT | LETTER_WHEN_UNQUOTED_NO_DIGIT;
fragment LETTER_WHEN_UNQUOTED_NO_DIGIT: [a-zA-Z_$\u0080-\uffff];
fragment LETTER_WITHOUT_FLOAT_PART: [a-df-zA-DF-Z_$\u0080-\uffff];

fragment DIGIT:    [0-9];
fragment DIGITS:   DIGIT+;
NUMBER         : DIGIT+ ([.,] DIGIT+)? ;

fragment LOWERCASE  : [a-z] ;
fragment UPPERCASE  : [A-Z];
WORD                : (LOWERCASE | UPPERCASE | '_' | DIGITS)+ ;
VARIABLE            : (LOWERCASE| UPPERCASE| '@')+ ;
TC_NAME             : (LOWERCASE| UPPERCASE| DIGIT)+ [.] (LOWERCASE| UPPERCASE| DIGIT)+ ;
EMAIL               : (LOWERCASE | UPPERCASE | DIGIT | '_' | '.' | '@')+ ;
WHITESPACE          : (' ' | '\t') -> skip;
NEWLINE             : ('\r'? '\n' | '\r')+ -> skip;
