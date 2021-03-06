// Generated from /Users/foo/Downloads/Query-Parser/antlr4runtime/src/main/antlr4/edu/gatech/parser/MySQLQuery.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MySQLQueryLexer extends Lexer {
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
		NAME=83, SINGLE_QUOTE=84, DOUBLE_QUOTE=85, WORD=86, WHITESPACE=87, NEWLINE=88, 
		NUMBER=89, NOT_EQUAL2_OPERATOR=90;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ALL_SYMBOL", "AND_SYMBOL", "AVERAGE_SYMBOL", "AS_SYMBOL", "ANY_SYMBOL", 
			"BETWEEN_SYMBOL", "BY_SYMBOL", "COUNT_SYMBOL", "DELETE_SYMBOL", "DISTINCT_SYMBOL", 
			"CREATE_SYMBOL", "EXISTS_SYMBOL", "LEFT_SYMBOL", "FROM_SYMBOL", "GROUP_SYMBOL", 
			"IN_SYMBOL", "INNER_SYMBOL", "INSERT_SYMBOL", "JOIN_SYMBOL", "LIKE_SYMBOL", 
			"MIN_SYMBOL", "MAX_SYMBOL", "ORDER_SYMBOL", "NOT_SYMBOL", "OR_SYMBOL", 
			"RIGHT_SYMBOL", "SELECT_SYMBOL", "SET_SYMBOL", "SUM_SYMBOL", "TABLE_SYMBOL", 
			"UPDATE_SYMBOL", "UNION_SYMBOL", "USING_SYMBOL", "USE_SYMBOL", "ON_SYMBOL", 
			"VALUES_SYMBOL", "WHERE_SYMBOL", "EQUAL_OPERATOR", "ASSIGN_OPERATOR", 
			"NULL_SAFE_EQUAL_OPERATOR", "GREATER_OR_EQUAL_OPERATOR", "GREATER_THAN_OPERATOR", 
			"LESS_OR_EQUAL_OPERATOR", "LESS_THAN_OPERATOR", "NOT_EQUAL_OPERATOR", 
			"NOT_EQUAL2_OPERATOR", "PLUS_OPERATOR", "MULT_OPERATOR", "MINUS_OPERATOR", 
			"DIV_OPERATOR", "MOD_OPERATOR", "ARITHMETIC", "LOGICAL_NOT_OPERATOR", 
			"BITWISE_NOT_OPERATOR", "SHIFT_LEFT_OPERATOR", "SHIFT_RIGHT_OPERATOR", 
			"LOGICAL_AND_OPERATOR", "BITWISE_AND_OPERATOR", "BITWISE_XOR_OPERATOR", 
			"BITWISE_OR_OPERATOR", "DOT_SYMBOL", "COMMA_SYMBOL", "SEMICOLON_SYMBOL", 
			"COLON_SYMBOL", "OPEN_PAR_SYMBOL", "CLOSE_PAR_SYMBOL", "OPEN_CURLY_SYMBOL", 
			"CLOSE_CURLY_SYMBOL", "UNDERLINE_SYMBOL", "TRUE_SYMBOL", "FALSE_SYMBOL", 
			"ASC_SYMBOL", "DESC_SYMBOL", "BEGIN_SYMBOL", "WORK_SYMBOL", "LIMIT_SYMBOL", 
			"PRIMARY_SYMBOL", "INTO_SYMBOL", "OUTFILE_SYMBOL", "DUMPFILE_SYMBOL", 
			"HAVING_SYMBOL", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", 
			"L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", 
			"Z", "SQ_TEXT", "DQ_TEXT", "NAME", "SINGLE_QUOTE", "DOUBLE_QUOTE", "LETTER_WHEN_UNQUOTED", 
			"LETTER_WHEN_UNQUOTED_NO_DIGIT", "LETTER_WITHOUT_FLOAT_PART", "LOWERCASE", 
			"UPPERCASE", "WORD", "WHITESPACE", "NEWLINE", "DIGIT", "DIGITS", "NUMBER"
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
			null, null, "'<>'"
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
			"WORD", "WHITESPACE", "NEWLINE", "NUMBER", "NOT_EQUAL2_OPERATOR"
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


	public MySQLQueryLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MySQLQuery.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\\\u02d7\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27"+
		"\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32"+
		"\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3"+
		"#\3#\3#\3#\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3\'\3\'\3("+
		"\3(\3(\3)\3)\3)\3)\3*\3*\3*\3+\3+\3,\3,\3,\3-\3-\3.\3.\3.\3/\3/\3/\3/"+
		"\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3"+
		"\66\3\67\3\67\38\38\38\39\39\39\3:\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3"+
		"?\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3F\3F\3G\3G\3G\3G\3G\3H\3H\3H\3"+
		"H\3H\3H\3I\3I\3I\3I\3J\3J\3J\3J\3J\3K\3K\3K\3K\3K\3K\3L\3L\3L\3L\3L\3"+
		"M\3M\3M\3M\3M\3M\3N\3N\3N\3N\3N\3N\3N\3N\3O\3O\3O\3O\3O\3P\3P\3P\3P\3"+
		"P\3P\3P\3P\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3R\3R\3R\3R\3R\3R\3R\3S\3S\3T\3"+
		"T\3U\3U\3V\3V\3W\3W\3X\3X\3Y\3Y\3Z\3Z\3[\3[\3\\\3\\\3]\3]\3^\3^\3_\3_"+
		"\3`\3`\3a\3a\3b\3b\3c\3c\3d\3d\3e\3e\3f\3f\3g\3g\3h\3h\3i\3i\3j\3j\3k"+
		"\3k\3l\3l\3m\3m\3m\3m\3n\3n\3n\3n\3o\3o\3o\3o\3o\3o\3p\3p\3p\3p\3q\3q"+
		"\3q\3q\3r\3r\5r\u02a3\nr\3s\3s\3t\3t\3u\3u\3v\3v\3w\3w\3w\3w\6w\u02b1"+
		"\nw\rw\16w\u02b2\3x\3x\3x\3x\3y\5y\u02ba\ny\3y\3y\6y\u02be\ny\ry\16y\u02bf"+
		"\3y\3y\3z\3z\3{\6{\u02c7\n{\r{\16{\u02c8\3|\6|\u02cc\n|\r|\16|\u02cd\3"+
		"|\3|\6|\u02d2\n|\r|\16|\u02d3\5|\u02d6\n|\2\2}\3\3\5\4\7\5\t\6\13\7\r"+
		"\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O"+
		")Q*S+U,W-Y.[/]\\_\60a\61c\62e\63g\64i\65k\66m\67o8q9s:u;w<y={>}?\177@"+
		"\u0081A\u0083B\u0085C\u0087D\u0089E\u008bF\u008dG\u008fH\u0091I\u0093"+
		"J\u0095K\u0097L\u0099M\u009bN\u009dO\u009fP\u00a1Q\u00a3R\u00a5\2\u00a7"+
		"\2\u00a9\2\u00ab\2\u00ad\2\u00af\2\u00b1\2\u00b3\2\u00b5\2\u00b7\2\u00b9"+
		"\2\u00bb\2\u00bd\2\u00bf\2\u00c1\2\u00c3\2\u00c5\2\u00c7\2\u00c9\2\u00cb"+
		"\2\u00cd\2\u00cf\2\u00d1\2\u00d3\2\u00d5\2\u00d7\2\u00d9S\u00dbT\u00dd"+
		"U\u00dfV\u00e1W\u00e3\2\u00e5\2\u00e7\2\u00e9\2\u00eb\2\u00edX\u00efY"+
		"\u00f1Z\u00f3\2\u00f5\2\u00f7[\3\2%\6\2\'\',-//\61\61\4\2CCcc\4\2DDdd"+
		"\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2M"+
		"Mmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4"+
		"\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\7\2&&C\\aac|"+
		"\u0082\1\t\2&&CFH\\aacfh|\u0082\1\3\2c|\3\2C\\\5\2\60\60BBaa\4\2\13\13"+
		"\"\"\3\2\62;\4\2..\60\60\2\u02c1\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2"+
		"\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2"+
		"\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2"+
		"\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O"+
		"\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2"+
		"\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2"+
		"\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u"+
		"\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081"+
		"\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2"+
		"\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093"+
		"\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2"+
		"\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2\2\2\u00d9"+
		"\3\2\2\2\2\u00db\3\2\2\2\2\u00dd\3\2\2\2\2\u00df\3\2\2\2\2\u00e1\3\2\2"+
		"\2\2\u00ed\3\2\2\2\2\u00ef\3\2\2\2\2\u00f1\3\2\2\2\2\u00f7\3\2\2\2\3\u00f9"+
		"\3\2\2\2\5\u00fd\3\2\2\2\7\u0101\3\2\2\2\t\u0109\3\2\2\2\13\u010c\3\2"+
		"\2\2\r\u0110\3\2\2\2\17\u0118\3\2\2\2\21\u011b\3\2\2\2\23\u0121\3\2\2"+
		"\2\25\u0128\3\2\2\2\27\u0131\3\2\2\2\31\u0138\3\2\2\2\33\u013f\3\2\2\2"+
		"\35\u0144\3\2\2\2\37\u0149\3\2\2\2!\u014f\3\2\2\2#\u0152\3\2\2\2%\u0158"+
		"\3\2\2\2\'\u015f\3\2\2\2)\u0164\3\2\2\2+\u0169\3\2\2\2-\u016d\3\2\2\2"+
		"/\u0171\3\2\2\2\61\u0177\3\2\2\2\63\u017b\3\2\2\2\65\u017e\3\2\2\2\67"+
		"\u0184\3\2\2\29\u018b\3\2\2\2;\u018f\3\2\2\2=\u0193\3\2\2\2?\u0199\3\2"+
		"\2\2A\u01a0\3\2\2\2C\u01a6\3\2\2\2E\u01ac\3\2\2\2G\u01b0\3\2\2\2I\u01b3"+
		"\3\2\2\2K\u01ba\3\2\2\2M\u01c0\3\2\2\2O\u01c2\3\2\2\2Q\u01c5\3\2\2\2S"+
		"\u01c9\3\2\2\2U\u01cc\3\2\2\2W\u01ce\3\2\2\2Y\u01d1\3\2\2\2[\u01d3\3\2"+
		"\2\2]\u01d6\3\2\2\2_\u01db\3\2\2\2a\u01dd\3\2\2\2c\u01df\3\2\2\2e\u01e1"+
		"\3\2\2\2g\u01e3\3\2\2\2i\u01e5\3\2\2\2k\u01e7\3\2\2\2m\u01e9\3\2\2\2o"+
		"\u01eb\3\2\2\2q\u01ee\3\2\2\2s\u01f1\3\2\2\2u\u01f4\3\2\2\2w\u01f6\3\2"+
		"\2\2y\u01f8\3\2\2\2{\u01fa\3\2\2\2}\u01fc\3\2\2\2\177\u01fe\3\2\2\2\u0081"+
		"\u0200\3\2\2\2\u0083\u0202\3\2\2\2\u0085\u0204\3\2\2\2\u0087\u0206\3\2"+
		"\2\2\u0089\u0208\3\2\2\2\u008b\u020a\3\2\2\2\u008d\u020c\3\2\2\2\u008f"+
		"\u0211\3\2\2\2\u0091\u0217\3\2\2\2\u0093\u021b\3\2\2\2\u0095\u0220\3\2"+
		"\2\2\u0097\u0226\3\2\2\2\u0099\u022b\3\2\2\2\u009b\u0231\3\2\2\2\u009d"+
		"\u0239\3\2\2\2\u009f\u023e\3\2\2\2\u00a1\u0246\3\2\2\2\u00a3\u024f\3\2"+
		"\2\2\u00a5\u0256\3\2\2\2\u00a7\u0258\3\2\2\2\u00a9\u025a\3\2\2\2\u00ab"+
		"\u025c\3\2\2\2\u00ad\u025e\3\2\2\2\u00af\u0260\3\2\2\2\u00b1\u0262\3\2"+
		"\2\2\u00b3\u0264\3\2\2\2\u00b5\u0266\3\2\2\2\u00b7\u0268\3\2\2\2\u00b9"+
		"\u026a\3\2\2\2\u00bb\u026c\3\2\2\2\u00bd\u026e\3\2\2\2\u00bf\u0270\3\2"+
		"\2\2\u00c1\u0272\3\2\2\2\u00c3\u0274\3\2\2\2\u00c5\u0276\3\2\2\2\u00c7"+
		"\u0278\3\2\2\2\u00c9\u027a\3\2\2\2\u00cb\u027c\3\2\2\2\u00cd\u027e\3\2"+
		"\2\2\u00cf\u0280\3\2\2\2\u00d1\u0282\3\2\2\2\u00d3\u0284\3\2\2\2\u00d5"+
		"\u0286\3\2\2\2\u00d7\u0288\3\2\2\2\u00d9\u028a\3\2\2\2\u00db\u028e\3\2"+
		"\2\2\u00dd\u0292\3\2\2\2\u00df\u0298\3\2\2\2\u00e1\u029c\3\2\2\2\u00e3"+
		"\u02a2\3\2\2\2\u00e5\u02a4\3\2\2\2\u00e7\u02a6\3\2\2\2\u00e9\u02a8\3\2"+
		"\2\2\u00eb\u02aa\3\2\2\2\u00ed\u02b0\3\2\2\2\u00ef\u02b4\3\2\2\2\u00f1"+
		"\u02bd\3\2\2\2\u00f3\u02c3\3\2\2\2\u00f5\u02c6\3\2\2\2\u00f7\u02cb\3\2"+
		"\2\2\u00f9\u00fa\5\u00a5S\2\u00fa\u00fb\5\u00bb^\2\u00fb\u00fc\5\u00bb"+
		"^\2\u00fc\4\3\2\2\2\u00fd\u00fe\5\u00a5S\2\u00fe\u00ff\5\u00bf`\2\u00ff"+
		"\u0100\5\u00abV\2\u0100\6\3\2\2\2\u0101\u0102\5\u00a5S\2\u0102\u0103\5"+
		"\u00cfh\2\u0103\u0104\5\u00adW\2\u0104\u0105\5\u00c7d\2\u0105\u0106\5"+
		"\u00a5S\2\u0106\u0107\5\u00b1Y\2\u0107\u0108\5\u00adW\2\u0108\b\3\2\2"+
		"\2\u0109\u010a\5\u00a5S\2\u010a\u010b\5\u00c9e\2\u010b\n\3\2\2\2\u010c"+
		"\u010d\5\u00a5S\2\u010d\u010e\5\u00bf`\2\u010e\u010f\5\u00d5k\2\u010f"+
		"\f\3\2\2\2\u0110\u0111\5\u00a7T\2\u0111\u0112\5\u00adW\2\u0112\u0113\5"+
		"\u00cbf\2\u0113\u0114\5\u00d1i\2\u0114\u0115\5\u00adW\2\u0115\u0116\5"+
		"\u00adW\2\u0116\u0117\5\u00bf`\2\u0117\16\3\2\2\2\u0118\u0119\5\u00a7"+
		"T\2\u0119\u011a\5\u00d5k\2\u011a\20\3\2\2\2\u011b\u011c\5\u00a9U\2\u011c"+
		"\u011d\5\u00c1a\2\u011d\u011e\5\u00cdg\2\u011e\u011f\5\u00bf`\2\u011f"+
		"\u0120\5\u00cbf\2\u0120\22\3\2\2\2\u0121\u0122\5\u00abV\2\u0122\u0123"+
		"\5\u00adW\2\u0123\u0124\5\u00bb^\2\u0124\u0125\5\u00adW\2\u0125\u0126"+
		"\5\u00cbf\2\u0126\u0127\5\u00adW\2\u0127\24\3\2\2\2\u0128\u0129\5\u00ab"+
		"V\2\u0129\u012a\5\u00b5[\2\u012a\u012b\5\u00c9e\2\u012b\u012c\5\u00cb"+
		"f\2\u012c\u012d\5\u00b5[\2\u012d\u012e\5\u00bf`\2\u012e\u012f\5\u00a9"+
		"U\2\u012f\u0130\5\u00cbf\2\u0130\26\3\2\2\2\u0131\u0132\5\u00a9U\2\u0132"+
		"\u0133\5\u00c7d\2\u0133\u0134\5\u00adW\2\u0134\u0135\5\u00a5S\2\u0135"+
		"\u0136\5\u00cbf\2\u0136\u0137\5\u00adW\2\u0137\30\3\2\2\2\u0138\u0139"+
		"\5\u00adW\2\u0139\u013a\5\u00d3j\2\u013a\u013b\5\u00b5[\2\u013b\u013c"+
		"\5\u00c9e\2\u013c\u013d\5\u00cbf\2\u013d\u013e\5\u00c9e\2\u013e\32\3\2"+
		"\2\2\u013f\u0140\5\u00bb^\2\u0140\u0141\5\u00adW\2\u0141\u0142\5\u00af"+
		"X\2\u0142\u0143\5\u00cbf\2\u0143\34\3\2\2\2\u0144\u0145\5\u00afX\2\u0145"+
		"\u0146\5\u00c7d\2\u0146\u0147\5\u00c1a\2\u0147\u0148\5\u00bd_\2\u0148"+
		"\36\3\2\2\2\u0149\u014a\5\u00b1Y\2\u014a\u014b\5\u00c7d\2\u014b\u014c"+
		"\5\u00c1a\2\u014c\u014d\5\u00cdg\2\u014d\u014e\5\u00c3b\2\u014e \3\2\2"+
		"\2\u014f\u0150\5\u00b5[\2\u0150\u0151\5\u00bf`\2\u0151\"\3\2\2\2\u0152"+
		"\u0153\5\u00b5[\2\u0153\u0154\5\u00bf`\2\u0154\u0155\5\u00bf`\2\u0155"+
		"\u0156\5\u00adW\2\u0156\u0157\5\u00c7d\2\u0157$\3\2\2\2\u0158\u0159\5"+
		"\u00b5[\2\u0159\u015a\5\u00bf`\2\u015a\u015b\5\u00c9e\2\u015b\u015c\5"+
		"\u00adW\2\u015c\u015d\5\u00c7d\2\u015d\u015e\5\u00cbf\2\u015e&\3\2\2\2"+
		"\u015f\u0160\5\u00b7\\\2\u0160\u0161\5\u00c1a\2\u0161\u0162\5\u00b5[\2"+
		"\u0162\u0163\5\u00bf`\2\u0163(\3\2\2\2\u0164\u0165\5\u00bb^\2\u0165\u0166"+
		"\5\u00b5[\2\u0166\u0167\5\u00b9]\2\u0167\u0168\5\u00adW\2\u0168*\3\2\2"+
		"\2\u0169\u016a\5\u00bd_\2\u016a\u016b\5\u00b5[\2\u016b\u016c\5\u00bf`"+
		"\2\u016c,\3\2\2\2\u016d\u016e\5\u00bd_\2\u016e\u016f\5\u00a5S\2\u016f"+
		"\u0170\5\u00d3j\2\u0170.\3\2\2\2\u0171\u0172\5\u00c1a\2\u0172\u0173\5"+
		"\u00c7d\2\u0173\u0174\5\u00abV\2\u0174\u0175\5\u00adW\2\u0175\u0176\5"+
		"\u00c7d\2\u0176\60\3\2\2\2\u0177\u0178\5\u00bf`\2\u0178\u0179\5\u00c1"+
		"a\2\u0179\u017a\5\u00cbf\2\u017a\62\3\2\2\2\u017b\u017c\5\u00c1a\2\u017c"+
		"\u017d\5\u00c7d\2\u017d\64\3\2\2\2\u017e\u017f\5\u00c7d\2\u017f\u0180"+
		"\5\u00b5[\2\u0180\u0181\5\u00b1Y\2\u0181\u0182\5\u00b3Z\2\u0182\u0183"+
		"\5\u00cbf\2\u0183\66\3\2\2\2\u0184\u0185\5\u00c9e\2\u0185\u0186\5\u00ad"+
		"W\2\u0186\u0187\5\u00bb^\2\u0187\u0188\5\u00adW\2\u0188\u0189\5\u00a9"+
		"U\2\u0189\u018a\5\u00cbf\2\u018a8\3\2\2\2\u018b\u018c\5\u00c9e\2\u018c"+
		"\u018d\5\u00adW\2\u018d\u018e\5\u00cbf\2\u018e:\3\2\2\2\u018f\u0190\5"+
		"\u00c9e\2\u0190\u0191\5\u00cdg\2\u0191\u0192\5\u00bd_\2\u0192<\3\2\2\2"+
		"\u0193\u0194\5\u00cbf\2\u0194\u0195\5\u00a5S\2\u0195\u0196\5\u00a7T\2"+
		"\u0196\u0197\5\u00bb^\2\u0197\u0198\5\u00adW\2\u0198>\3\2\2\2\u0199\u019a"+
		"\5\u00cdg\2\u019a\u019b\5\u00c3b\2\u019b\u019c\5\u00abV\2\u019c\u019d"+
		"\5\u00a5S\2\u019d\u019e\5\u00cbf\2\u019e\u019f\5\u00adW\2\u019f@\3\2\2"+
		"\2\u01a0\u01a1\5\u00cdg\2\u01a1\u01a2\5\u00bf`\2\u01a2\u01a3\5\u00b5["+
		"\2\u01a3\u01a4\5\u00c1a\2\u01a4\u01a5\5\u00bf`\2\u01a5B\3\2\2\2\u01a6"+
		"\u01a7\5\u00cdg\2\u01a7\u01a8\5\u00c9e\2\u01a8\u01a9\5\u00b5[\2\u01a9"+
		"\u01aa\5\u00bf`\2\u01aa\u01ab\5\u00b1Y\2\u01abD\3\2\2\2\u01ac\u01ad\5"+
		"\u00cdg\2\u01ad\u01ae\5\u00c9e\2\u01ae\u01af\5\u00adW\2\u01afF\3\2\2\2"+
		"\u01b0\u01b1\5\u00c1a\2\u01b1\u01b2\5\u00bf`\2\u01b2H\3\2\2\2\u01b3\u01b4"+
		"\5\u00cfh\2\u01b4\u01b5\5\u00a5S\2\u01b5\u01b6\5\u00bb^\2\u01b6\u01b7"+
		"\5\u00cdg\2\u01b7\u01b8\5\u00adW\2\u01b8\u01b9\5\u00c9e\2\u01b9J\3\2\2"+
		"\2\u01ba\u01bb\5\u00d1i\2\u01bb\u01bc\5\u00b3Z\2\u01bc\u01bd\5\u00adW"+
		"\2\u01bd\u01be\5\u00c7d\2\u01be\u01bf\5\u00adW\2\u01bfL\3\2\2\2\u01c0"+
		"\u01c1\7?\2\2\u01c1N\3\2\2\2\u01c2\u01c3\7<\2\2\u01c3\u01c4\7?\2\2\u01c4"+
		"P\3\2\2\2\u01c5\u01c6\7>\2\2\u01c6\u01c7\7?\2\2\u01c7\u01c8\7@\2\2\u01c8"+
		"R\3\2\2\2\u01c9\u01ca\7@\2\2\u01ca\u01cb\7?\2\2\u01cbT\3\2\2\2\u01cc\u01cd"+
		"\7@\2\2\u01cdV\3\2\2\2\u01ce\u01cf\7>\2\2\u01cf\u01d0\7?\2\2\u01d0X\3"+
		"\2\2\2\u01d1\u01d2\7>\2\2\u01d2Z\3\2\2\2\u01d3\u01d4\7#\2\2\u01d4\u01d5"+
		"\7?\2\2\u01d5\\\3\2\2\2\u01d6\u01d7\7>\2\2\u01d7\u01d8\7@\2\2\u01d8\u01d9"+
		"\3\2\2\2\u01d9\u01da\b/\2\2\u01da^\3\2\2\2\u01db\u01dc\7-\2\2\u01dc`\3"+
		"\2\2\2\u01dd\u01de\7,\2\2\u01deb\3\2\2\2\u01df\u01e0\7/\2\2\u01e0d\3\2"+
		"\2\2\u01e1\u01e2\7\61\2\2\u01e2f\3\2\2\2\u01e3\u01e4\7\'\2\2\u01e4h\3"+
		"\2\2\2\u01e5\u01e6\t\2\2\2\u01e6j\3\2\2\2\u01e7\u01e8\7#\2\2\u01e8l\3"+
		"\2\2\2\u01e9\u01ea\7\u0080\2\2\u01ean\3\2\2\2\u01eb\u01ec\7>\2\2\u01ec"+
		"\u01ed\7>\2\2\u01edp\3\2\2\2\u01ee\u01ef\7@\2\2\u01ef\u01f0\7@\2\2\u01f0"+
		"r\3\2\2\2\u01f1\u01f2\7(\2\2\u01f2\u01f3\7(\2\2\u01f3t\3\2\2\2\u01f4\u01f5"+
		"\7(\2\2\u01f5v\3\2\2\2\u01f6\u01f7\7`\2\2\u01f7x\3\2\2\2\u01f8\u01f9\7"+
		"~\2\2\u01f9z\3\2\2\2\u01fa\u01fb\7\60\2\2\u01fb|\3\2\2\2\u01fc\u01fd\7"+
		".\2\2\u01fd~\3\2\2\2\u01fe\u01ff\7=\2\2\u01ff\u0080\3\2\2\2\u0200\u0201"+
		"\7<\2\2\u0201\u0082\3\2\2\2\u0202\u0203\7*\2\2\u0203\u0084\3\2\2\2\u0204"+
		"\u0205\7+\2\2\u0205\u0086\3\2\2\2\u0206\u0207\7}\2\2\u0207\u0088\3\2\2"+
		"\2\u0208\u0209\7\177\2\2\u0209\u008a\3\2\2\2\u020a\u020b\7a\2\2\u020b"+
		"\u008c\3\2\2\2\u020c\u020d\5\u00cbf\2\u020d\u020e\5\u00c7d\2\u020e\u020f"+
		"\5\u00cdg\2\u020f\u0210\5\u00adW\2\u0210\u008e\3\2\2\2\u0211\u0212\5\u00af"+
		"X\2\u0212\u0213\5\u00a5S\2\u0213\u0214\5\u00bb^\2\u0214\u0215\5\u00c9"+
		"e\2\u0215\u0216\5\u00adW\2\u0216\u0090\3\2\2\2\u0217\u0218\5\u00a5S\2"+
		"\u0218\u0219\5\u00c9e\2\u0219\u021a\5\u00a9U\2\u021a\u0092\3\2\2\2\u021b"+
		"\u021c\5\u00abV\2\u021c\u021d\5\u00adW\2\u021d\u021e\5\u00c9e\2\u021e"+
		"\u021f\5\u00a9U\2\u021f\u0094\3\2\2\2\u0220\u0221\5\u00a7T\2\u0221\u0222"+
		"\5\u00adW\2\u0222\u0223\5\u00b1Y\2\u0223\u0224\5\u00b5[\2\u0224\u0225"+
		"\5\u00bf`\2\u0225\u0096\3\2\2\2\u0226\u0227\5\u00d1i\2\u0227\u0228\5\u00c1"+
		"a\2\u0228\u0229\5\u00c7d\2\u0229\u022a\5\u00b9]\2\u022a\u0098\3\2\2\2"+
		"\u022b\u022c\5\u00bb^\2\u022c\u022d\5\u00b5[\2\u022d\u022e\5\u00bd_\2"+
		"\u022e\u022f\5\u00b5[\2\u022f\u0230\5\u00cbf\2\u0230\u009a\3\2\2\2\u0231"+
		"\u0232\5\u00c3b\2\u0232\u0233\5\u00c7d\2\u0233\u0234\5\u00b5[\2\u0234"+
		"\u0235\5\u00bd_\2\u0235\u0236\5\u00a5S\2\u0236\u0237\5\u00c7d\2\u0237"+
		"\u0238\5\u00d5k\2\u0238\u009c\3\2\2\2\u0239\u023a\5\u00b5[\2\u023a\u023b"+
		"\5\u00bf`\2\u023b\u023c\5\u00cbf\2\u023c\u023d\5\u00c1a\2\u023d\u009e"+
		"\3\2\2\2\u023e\u023f\5\u00c1a\2\u023f\u0240\5\u00cdg\2\u0240\u0241\5\u00cb"+
		"f\2\u0241\u0242\5\u00afX\2\u0242\u0243\5\u00b5[\2\u0243\u0244\5\u00bb"+
		"^\2\u0244\u0245\5\u00adW\2\u0245\u00a0\3\2\2\2\u0246\u0247\5\u00abV\2"+
		"\u0247\u0248\5\u00cdg\2\u0248\u0249\5\u00bd_\2\u0249\u024a\5\u00c3b\2"+
		"\u024a\u024b\5\u00afX\2\u024b\u024c\5\u00b5[\2\u024c\u024d\5\u00bb^\2"+
		"\u024d\u024e\5\u00adW\2\u024e\u00a2\3\2\2\2\u024f\u0250\5\u00b3Z\2\u0250"+
		"\u0251\5\u00a5S\2\u0251\u0252\5\u00cfh\2\u0252\u0253\5\u00b5[\2\u0253"+
		"\u0254\5\u00bf`\2\u0254\u0255\5\u00b1Y\2\u0255\u00a4\3\2\2\2\u0256\u0257"+
		"\t\3\2\2\u0257\u00a6\3\2\2\2\u0258\u0259\t\4\2\2\u0259\u00a8\3\2\2\2\u025a"+
		"\u025b\t\5\2\2\u025b\u00aa\3\2\2\2\u025c\u025d\t\6\2\2\u025d\u00ac\3\2"+
		"\2\2\u025e\u025f\t\7\2\2\u025f\u00ae\3\2\2\2\u0260\u0261\t\b\2\2\u0261"+
		"\u00b0\3\2\2\2\u0262\u0263\t\t\2\2\u0263\u00b2\3\2\2\2\u0264\u0265\t\n"+
		"\2\2\u0265\u00b4\3\2\2\2\u0266\u0267\t\13\2\2\u0267\u00b6\3\2\2\2\u0268"+
		"\u0269\t\f\2\2\u0269\u00b8\3\2\2\2\u026a\u026b\t\r\2\2\u026b\u00ba\3\2"+
		"\2\2\u026c\u026d\t\16\2\2\u026d\u00bc\3\2\2\2\u026e\u026f\t\17\2\2\u026f"+
		"\u00be\3\2\2\2\u0270\u0271\t\20\2\2\u0271\u00c0\3\2\2\2\u0272\u0273\t"+
		"\21\2\2\u0273\u00c2\3\2\2\2\u0274\u0275\t\22\2\2\u0275\u00c4\3\2\2\2\u0276"+
		"\u0277\t\23\2\2\u0277\u00c6\3\2\2\2\u0278\u0279\t\24\2\2\u0279\u00c8\3"+
		"\2\2\2\u027a\u027b\t\25\2\2\u027b\u00ca\3\2\2\2\u027c\u027d\t\26\2\2\u027d"+
		"\u00cc\3\2\2\2\u027e\u027f\t\27\2\2\u027f\u00ce\3\2\2\2\u0280\u0281\t"+
		"\30\2\2\u0281\u00d0\3\2\2\2\u0282\u0283\t\31\2\2\u0283\u00d2\3\2\2\2\u0284"+
		"\u0285\t\32\2\2\u0285\u00d4\3\2\2\2\u0286\u0287\t\33\2\2\u0287\u00d6\3"+
		"\2\2\2\u0288\u0289\t\34\2\2\u0289\u00d8\3\2\2\2\u028a\u028b\7)\2\2\u028b"+
		"\u028c\5\u00edw\2\u028c\u028d\7)\2\2\u028d\u00da\3\2\2\2\u028e\u028f\7"+
		"$\2\2\u028f\u0290\5\u00edw\2\u0290\u0291\7$\2\2\u0291\u00dc\3\2\2\2\u0292"+
		"\u0293\7)\2\2\u0293\u0294\5\u00edw\2\u0294\u0295\5\u00efx\2\u0295\u0296"+
		"\5\u00edw\2\u0296\u0297\7)\2\2\u0297\u00de\3\2\2\2\u0298\u0299\7)\2\2"+
		"\u0299\u029a\3\2\2\2\u029a\u029b\bp\3\2\u029b\u00e0\3\2\2\2\u029c\u029d"+
		"\7$\2\2\u029d\u029e\3\2\2\2\u029e\u029f\bq\3\2\u029f\u00e2\3\2\2\2\u02a0"+
		"\u02a3\5\u00f3z\2\u02a1\u02a3\5\u00e5s\2\u02a2\u02a0\3\2\2\2\u02a2\u02a1"+
		"\3\2\2\2\u02a3\u00e4\3\2\2\2\u02a4\u02a5\t\35\2\2\u02a5\u00e6\3\2\2\2"+
		"\u02a6\u02a7\t\36\2\2\u02a7\u00e8\3\2\2\2\u02a8\u02a9\t\37\2\2\u02a9\u00ea"+
		"\3\2\2\2\u02aa\u02ab\t \2\2\u02ab\u00ec\3\2\2\2\u02ac\u02b1\5\u00e9u\2"+
		"\u02ad\u02b1\5\u00ebv\2\u02ae\u02b1\5\u00f3z\2\u02af\u02b1\t!\2\2\u02b0"+
		"\u02ac\3\2\2\2\u02b0\u02ad\3\2\2\2\u02b0\u02ae\3\2\2\2\u02b0\u02af\3\2"+
		"\2\2\u02b1\u02b2\3\2\2\2\u02b2\u02b0\3\2\2\2\u02b2\u02b3\3\2\2\2\u02b3"+
		"\u00ee\3\2\2\2\u02b4\u02b5\t\"\2\2\u02b5\u02b6\3\2\2\2\u02b6\u02b7\bx"+
		"\3\2\u02b7\u00f0\3\2\2\2\u02b8\u02ba\7\17\2\2\u02b9\u02b8\3\2\2\2\u02b9"+
		"\u02ba\3\2\2\2\u02ba\u02bb\3\2\2\2\u02bb\u02be\7\f\2\2\u02bc\u02be\7\17"+
		"\2\2\u02bd\u02b9\3\2\2\2\u02bd\u02bc\3\2\2\2\u02be\u02bf\3\2\2\2\u02bf"+
		"\u02bd\3\2\2\2\u02bf\u02c0\3\2\2\2\u02c0\u02c1\3\2\2\2\u02c1\u02c2\by"+
		"\3\2\u02c2\u00f2\3\2\2\2\u02c3\u02c4\t#\2\2\u02c4\u00f4\3\2\2\2\u02c5"+
		"\u02c7\5\u00f3z\2\u02c6\u02c5\3\2\2\2\u02c7\u02c8\3\2\2\2\u02c8\u02c6"+
		"\3\2\2\2\u02c8\u02c9\3\2\2\2\u02c9\u00f6\3\2\2\2\u02ca\u02cc\5\u00f3z"+
		"\2\u02cb\u02ca\3\2\2\2\u02cc\u02cd\3\2\2\2\u02cd\u02cb\3\2\2\2\u02cd\u02ce"+
		"\3\2\2\2\u02ce\u02d5\3\2\2\2\u02cf\u02d1\t$\2\2\u02d0\u02d2\5\u00f3z\2"+
		"\u02d1\u02d0\3\2\2\2\u02d2\u02d3\3\2\2\2\u02d3\u02d1\3\2\2\2\u02d3\u02d4"+
		"\3\2\2\2\u02d4\u02d6\3\2\2\2\u02d5\u02cf\3\2\2\2\u02d5\u02d6\3\2\2\2\u02d6"+
		"\u00f8\3\2\2\2\r\2\u02a2\u02b0\u02b2\u02b9\u02bd\u02bf\u02c8\u02cd\u02d3"+
		"\u02d5\4\t/\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}