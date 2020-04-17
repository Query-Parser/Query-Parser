// Generated from MySQLQuery.g4 by ANTLR 4.7
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
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

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
		NAME=83, SINGLE_QUOTE=84, DOUBLE_QUOTE=85, NUMBER=86, WORD=87, VARIABLE=88, 
		TC_NAME=89, EMAIL=90, WHITESPACE=91, NEWLINE=92, NOT_EQUAL2_OPERATOR=93;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
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
		"LETTER_WHEN_UNQUOTED_NO_DIGIT", "LETTER_WITHOUT_FLOAT_PART", "DIGIT", 
		"DIGITS", "NUMBER", "LOWERCASE", "UPPERCASE", "WORD", "VARIABLE", "TC_NAME", 
		"EMAIL", "WHITESPACE", "NEWLINE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "'='", "':='", "'<=>'", "'>='", "'>'", "'<='", "'<'", "'!='", 
		"'+'", "'*'", "'-'", "'/'", "'%'", null, "'!'", "'~'", "'<<'", "'>>'", 
		"'&&'", "'&'", "'^'", "'|'", "'.'", "','", "';'", "':'", "'('", "')'", 
		"'{'", "'}'", "'_'", null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, "'''", "'\"'", null, null, null, null, 
		null, null, null, "'<>'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
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
		"NUMBER", "WORD", "VARIABLE", "TC_NAME", "EMAIL", "WHITESPACE", "NEWLINE", 
		"NOT_EQUAL2_OPERATOR"
	};
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2_\u02fb\b\1\4\2\t"+
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
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\3\2\3\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3"+
		"\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31"+
		"\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&"+
		"\3&\3&\3&\3\'\3\'\3(\3(\3(\3)\3)\3)\3)\3*\3*\3*\3+\3+\3,\3,\3,\3-\3-\3"+
		".\3.\3.\3/\3/\3/\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3"+
		"\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\38\39\39\39\3:\3:\3:\3;\3;\3<"+
		"\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3F\3F\3G\3G"+
		"\3G\3G\3G\3H\3H\3H\3H\3H\3H\3I\3I\3I\3I\3J\3J\3J\3J\3J\3K\3K\3K\3K\3K"+
		"\3K\3L\3L\3L\3L\3L\3M\3M\3M\3M\3M\3M\3N\3N\3N\3N\3N\3N\3N\3N\3O\3O\3O"+
		"\3O\3O\3P\3P\3P\3P\3P\3P\3P\3P\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3R\3R\3R\3R"+
		"\3R\3R\3R\3S\3S\3T\3T\3U\3U\3V\3V\3W\3W\3X\3X\3Y\3Y\3Z\3Z\3[\3[\3\\\3"+
		"\\\3]\3]\3^\3^\3_\3_\3`\3`\3a\3a\3b\3b\3c\3c\3d\3d\3e\3e\3f\3f\3g\3g\3"+
		"h\3h\3i\3i\3j\3j\3k\3k\3l\3l\3m\3m\3m\3m\3n\3n\3n\3n\3o\3o\3o\3o\3o\3"+
		"o\3p\3p\3p\3p\3q\3q\3q\3q\3r\3r\5r\u02a9\nr\3s\3s\3t\3t\3u\3u\3v\6v\u02b2"+
		"\nv\rv\16v\u02b3\3w\6w\u02b7\nw\rw\16w\u02b8\3w\3w\6w\u02bd\nw\rw\16w"+
		"\u02be\5w\u02c1\nw\3x\3x\3y\3y\3z\3z\3z\3z\6z\u02cb\nz\rz\16z\u02cc\3"+
		"{\3{\3{\6{\u02d2\n{\r{\16{\u02d3\3|\3|\3|\6|\u02d9\n|\r|\16|\u02da\3|"+
		"\3|\3|\3|\6|\u02e1\n|\r|\16|\u02e2\3}\3}\3}\3}\6}\u02e9\n}\r}\16}\u02ea"+
		"\3~\3~\3~\3~\3\177\5\177\u02f2\n\177\3\177\3\177\6\177\u02f6\n\177\r\177"+
		"\16\177\u02f7\3\177\3\177\2\2\u0080\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
		"\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.["+
		"/]__\60a\61c\62e\63g\64i\65k\66m\67o8q9s:u;w<y={>}?\177@\u0081A\u0083"+
		"B\u0085C\u0087D\u0089E\u008bF\u008dG\u008fH\u0091I\u0093J\u0095K\u0097"+
		"L\u0099M\u009bN\u009dO\u009fP\u00a1Q\u00a3R\u00a5\2\u00a7\2\u00a9\2\u00ab"+
		"\2\u00ad\2\u00af\2\u00b1\2\u00b3\2\u00b5\2\u00b7\2\u00b9\2\u00bb\2\u00bd"+
		"\2\u00bf\2\u00c1\2\u00c3\2\u00c5\2\u00c7\2\u00c9\2\u00cb\2\u00cd\2\u00cf"+
		"\2\u00d1\2\u00d3\2\u00d5\2\u00d7\2\u00d9S\u00dbT\u00ddU\u00dfV\u00e1W"+
		"\u00e3\2\u00e5\2\u00e7\2\u00e9\2\u00eb\2\u00edX\u00ef\2\u00f1\2\u00f3"+
		"Y\u00f5Z\u00f7[\u00f9\\\u00fb]\u00fd^\3\2&\6\2\'\',-//\61\61\4\2CCcc\4"+
		"\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2LLl"+
		"l\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2"+
		"UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\7\2&&C"+
		"\\aac|\u0082\1\t\2&&CFH\\aacfh|\u0082\1\3\2\62;\4\2..\60\60\3\2c|\3\2"+
		"C\\\3\2\60\60\5\2\60\60BBaa\4\2\13\13\"\"\2\u02f2\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2"+
		"\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2"+
		"Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3"+
		"\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2"+
		"\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2"+
		"\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3"+
		"\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2"+
		"\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099"+
		"\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\2\u00a1\3\2\2"+
		"\2\2\u00a3\3\2\2\2\2\u00d9\3\2\2\2\2\u00db\3\2\2\2\2\u00dd\3\2\2\2\2\u00df"+
		"\3\2\2\2\2\u00e1\3\2\2\2\2\u00ed\3\2\2\2\2\u00f3\3\2\2\2\2\u00f5\3\2\2"+
		"\2\2\u00f7\3\2\2\2\2\u00f9\3\2\2\2\2\u00fb\3\2\2\2\2\u00fd\3\2\2\2\3\u00ff"+
		"\3\2\2\2\5\u0103\3\2\2\2\7\u0107\3\2\2\2\t\u010f\3\2\2\2\13\u0112\3\2"+
		"\2\2\r\u0116\3\2\2\2\17\u011e\3\2\2\2\21\u0121\3\2\2\2\23\u0127\3\2\2"+
		"\2\25\u012e\3\2\2\2\27\u0137\3\2\2\2\31\u013e\3\2\2\2\33\u0145\3\2\2\2"+
		"\35\u014a\3\2\2\2\37\u014f\3\2\2\2!\u0155\3\2\2\2#\u0158\3\2\2\2%\u015e"+
		"\3\2\2\2\'\u0165\3\2\2\2)\u016a\3\2\2\2+\u016f\3\2\2\2-\u0173\3\2\2\2"+
		"/\u0177\3\2\2\2\61\u017d\3\2\2\2\63\u0181\3\2\2\2\65\u0184\3\2\2\2\67"+
		"\u018a\3\2\2\29\u0191\3\2\2\2;\u0195\3\2\2\2=\u0199\3\2\2\2?\u019f\3\2"+
		"\2\2A\u01a6\3\2\2\2C\u01ac\3\2\2\2E\u01b2\3\2\2\2G\u01b6\3\2\2\2I\u01b9"+
		"\3\2\2\2K\u01c0\3\2\2\2M\u01c6\3\2\2\2O\u01c8\3\2\2\2Q\u01cb\3\2\2\2S"+
		"\u01cf\3\2\2\2U\u01d2\3\2\2\2W\u01d4\3\2\2\2Y\u01d7\3\2\2\2[\u01d9\3\2"+
		"\2\2]\u01dc\3\2\2\2_\u01e1\3\2\2\2a\u01e3\3\2\2\2c\u01e5\3\2\2\2e\u01e7"+
		"\3\2\2\2g\u01e9\3\2\2\2i\u01eb\3\2\2\2k\u01ed\3\2\2\2m\u01ef\3\2\2\2o"+
		"\u01f1\3\2\2\2q\u01f4\3\2\2\2s\u01f7\3\2\2\2u\u01fa\3\2\2\2w\u01fc\3\2"+
		"\2\2y\u01fe\3\2\2\2{\u0200\3\2\2\2}\u0202\3\2\2\2\177\u0204\3\2\2\2\u0081"+
		"\u0206\3\2\2\2\u0083\u0208\3\2\2\2\u0085\u020a\3\2\2\2\u0087\u020c\3\2"+
		"\2\2\u0089\u020e\3\2\2\2\u008b\u0210\3\2\2\2\u008d\u0212\3\2\2\2\u008f"+
		"\u0217\3\2\2\2\u0091\u021d\3\2\2\2\u0093\u0221\3\2\2\2\u0095\u0226\3\2"+
		"\2\2\u0097\u022c\3\2\2\2\u0099\u0231\3\2\2\2\u009b\u0237\3\2\2\2\u009d"+
		"\u023f\3\2\2\2\u009f\u0244\3\2\2\2\u00a1\u024c\3\2\2\2\u00a3\u0255\3\2"+
		"\2\2\u00a5\u025c\3\2\2\2\u00a7\u025e\3\2\2\2\u00a9\u0260\3\2\2\2\u00ab"+
		"\u0262\3\2\2\2\u00ad\u0264\3\2\2\2\u00af\u0266\3\2\2\2\u00b1\u0268\3\2"+
		"\2\2\u00b3\u026a\3\2\2\2\u00b5\u026c\3\2\2\2\u00b7\u026e\3\2\2\2\u00b9"+
		"\u0270\3\2\2\2\u00bb\u0272\3\2\2\2\u00bd\u0274\3\2\2\2\u00bf\u0276\3\2"+
		"\2\2\u00c1\u0278\3\2\2\2\u00c3\u027a\3\2\2\2\u00c5\u027c\3\2\2\2\u00c7"+
		"\u027e\3\2\2\2\u00c9\u0280\3\2\2\2\u00cb\u0282\3\2\2\2\u00cd\u0284\3\2"+
		"\2\2\u00cf\u0286\3\2\2\2\u00d1\u0288\3\2\2\2\u00d3\u028a\3\2\2\2\u00d5"+
		"\u028c\3\2\2\2\u00d7\u028e\3\2\2\2\u00d9\u0290\3\2\2\2\u00db\u0294\3\2"+
		"\2\2\u00dd\u0298\3\2\2\2\u00df\u029e\3\2\2\2\u00e1\u02a2\3\2\2\2\u00e3"+
		"\u02a8\3\2\2\2\u00e5\u02aa\3\2\2\2\u00e7\u02ac\3\2\2\2\u00e9\u02ae\3\2"+
		"\2\2\u00eb\u02b1\3\2\2\2\u00ed\u02b6\3\2\2\2\u00ef\u02c2\3\2\2\2\u00f1"+
		"\u02c4\3\2\2\2\u00f3\u02ca\3\2\2\2\u00f5\u02d1\3\2\2\2\u00f7\u02d8\3\2"+
		"\2\2\u00f9\u02e8\3\2\2\2\u00fb\u02ec\3\2\2\2\u00fd\u02f5\3\2\2\2\u00ff"+
		"\u0100\5\u00a5S\2\u0100\u0101\5\u00bb^\2\u0101\u0102\5\u00bb^\2\u0102"+
		"\4\3\2\2\2\u0103\u0104\5\u00a5S\2\u0104\u0105\5\u00bf`\2\u0105\u0106\5"+
		"\u00abV\2\u0106\6\3\2\2\2\u0107\u0108\5\u00a5S\2\u0108\u0109\5\u00cfh"+
		"\2\u0109\u010a\5\u00adW\2\u010a\u010b\5\u00c7d\2\u010b\u010c\5\u00a5S"+
		"\2\u010c\u010d\5\u00b1Y\2\u010d\u010e\5\u00adW\2\u010e\b\3\2\2\2\u010f"+
		"\u0110\5\u00a5S\2\u0110\u0111\5\u00c9e\2\u0111\n\3\2\2\2\u0112\u0113\5"+
		"\u00a5S\2\u0113\u0114\5\u00bf`\2\u0114\u0115\5\u00d5k\2\u0115\f\3\2\2"+
		"\2\u0116\u0117\5\u00a7T\2\u0117\u0118\5\u00adW\2\u0118\u0119\5\u00cbf"+
		"\2\u0119\u011a\5\u00d1i\2\u011a\u011b\5\u00adW\2\u011b\u011c\5\u00adW"+
		"\2\u011c\u011d\5\u00bf`\2\u011d\16\3\2\2\2\u011e\u011f\5\u00a7T\2\u011f"+
		"\u0120\5\u00d5k\2\u0120\20\3\2\2\2\u0121\u0122\5\u00a9U\2\u0122\u0123"+
		"\5\u00c1a\2\u0123\u0124\5\u00cdg\2\u0124\u0125\5\u00bf`\2\u0125\u0126"+
		"\5\u00cbf\2\u0126\22\3\2\2\2\u0127\u0128\5\u00abV\2\u0128\u0129\5\u00ad"+
		"W\2\u0129\u012a\5\u00bb^\2\u012a\u012b\5\u00adW\2\u012b\u012c\5\u00cb"+
		"f\2\u012c\u012d\5\u00adW\2\u012d\24\3\2\2\2\u012e\u012f\5\u00abV\2\u012f"+
		"\u0130\5\u00b5[\2\u0130\u0131\5\u00c9e\2\u0131\u0132\5\u00cbf\2\u0132"+
		"\u0133\5\u00b5[\2\u0133\u0134\5\u00bf`\2\u0134\u0135\5\u00a9U\2\u0135"+
		"\u0136\5\u00cbf\2\u0136\26\3\2\2\2\u0137\u0138\5\u00a9U\2\u0138\u0139"+
		"\5\u00c7d\2\u0139\u013a\5\u00adW\2\u013a\u013b\5\u00a5S\2\u013b\u013c"+
		"\5\u00cbf\2\u013c\u013d\5\u00adW\2\u013d\30\3\2\2\2\u013e\u013f\5\u00ad"+
		"W\2\u013f\u0140\5\u00d3j\2\u0140\u0141\5\u00b5[\2\u0141\u0142\5\u00c9"+
		"e\2\u0142\u0143\5\u00cbf\2\u0143\u0144\5\u00c9e\2\u0144\32\3\2\2\2\u0145"+
		"\u0146\5\u00bb^\2\u0146\u0147\5\u00adW\2\u0147\u0148\5\u00afX\2\u0148"+
		"\u0149\5\u00cbf\2\u0149\34\3\2\2\2\u014a\u014b\5\u00afX\2\u014b\u014c"+
		"\5\u00c7d\2\u014c\u014d\5\u00c1a\2\u014d\u014e\5\u00bd_\2\u014e\36\3\2"+
		"\2\2\u014f\u0150\5\u00b1Y\2\u0150\u0151\5\u00c7d\2\u0151\u0152\5\u00c1"+
		"a\2\u0152\u0153\5\u00cdg\2\u0153\u0154\5\u00c3b\2\u0154 \3\2\2\2\u0155"+
		"\u0156\5\u00b5[\2\u0156\u0157\5\u00bf`\2\u0157\"\3\2\2\2\u0158\u0159\5"+
		"\u00b5[\2\u0159\u015a\5\u00bf`\2\u015a\u015b\5\u00bf`\2\u015b\u015c\5"+
		"\u00adW\2\u015c\u015d\5\u00c7d\2\u015d$\3\2\2\2\u015e\u015f\5\u00b5[\2"+
		"\u015f\u0160\5\u00bf`\2\u0160\u0161\5\u00c9e\2\u0161\u0162\5\u00adW\2"+
		"\u0162\u0163\5\u00c7d\2\u0163\u0164\5\u00cbf\2\u0164&\3\2\2\2\u0165\u0166"+
		"\5\u00b7\\\2\u0166\u0167\5\u00c1a\2\u0167\u0168\5\u00b5[\2\u0168\u0169"+
		"\5\u00bf`\2\u0169(\3\2\2\2\u016a\u016b\5\u00bb^\2\u016b\u016c\5\u00b5"+
		"[\2\u016c\u016d\5\u00b9]\2\u016d\u016e\5\u00adW\2\u016e*\3\2\2\2\u016f"+
		"\u0170\5\u00bd_\2\u0170\u0171\5\u00b5[\2\u0171\u0172\5\u00bf`\2\u0172"+
		",\3\2\2\2\u0173\u0174\5\u00bd_\2\u0174\u0175\5\u00a5S\2\u0175\u0176\5"+
		"\u00d3j\2\u0176.\3\2\2\2\u0177\u0178\5\u00c1a\2\u0178\u0179\5\u00c7d\2"+
		"\u0179\u017a\5\u00abV\2\u017a\u017b\5\u00adW\2\u017b\u017c\5\u00c7d\2"+
		"\u017c\60\3\2\2\2\u017d\u017e\5\u00bf`\2\u017e\u017f\5\u00c1a\2\u017f"+
		"\u0180\5\u00cbf\2\u0180\62\3\2\2\2\u0181\u0182\5\u00c1a\2\u0182\u0183"+
		"\5\u00c7d\2\u0183\64\3\2\2\2\u0184\u0185\5\u00c7d\2\u0185\u0186\5\u00b5"+
		"[\2\u0186\u0187\5\u00b1Y\2\u0187\u0188\5\u00b3Z\2\u0188\u0189\5\u00cb"+
		"f\2\u0189\66\3\2\2\2\u018a\u018b\5\u00c9e\2\u018b\u018c\5\u00adW\2\u018c"+
		"\u018d\5\u00bb^\2\u018d\u018e\5\u00adW\2\u018e\u018f\5\u00a9U\2\u018f"+
		"\u0190\5\u00cbf\2\u01908\3\2\2\2\u0191\u0192\5\u00c9e\2\u0192\u0193\5"+
		"\u00adW\2\u0193\u0194\5\u00cbf\2\u0194:\3\2\2\2\u0195\u0196\5\u00c9e\2"+
		"\u0196\u0197\5\u00cdg\2\u0197\u0198\5\u00bd_\2\u0198<\3\2\2\2\u0199\u019a"+
		"\5\u00cbf\2\u019a\u019b\5\u00a5S\2\u019b\u019c\5\u00a7T\2\u019c\u019d"+
		"\5\u00bb^\2\u019d\u019e\5\u00adW\2\u019e>\3\2\2\2\u019f\u01a0\5\u00cd"+
		"g\2\u01a0\u01a1\5\u00c3b\2\u01a1\u01a2\5\u00abV\2\u01a2\u01a3\5\u00a5"+
		"S\2\u01a3\u01a4\5\u00cbf\2\u01a4\u01a5\5\u00adW\2\u01a5@\3\2\2\2\u01a6"+
		"\u01a7\5\u00cdg\2\u01a7\u01a8\5\u00bf`\2\u01a8\u01a9\5\u00b5[\2\u01a9"+
		"\u01aa\5\u00c1a\2\u01aa\u01ab\5\u00bf`\2\u01abB\3\2\2\2\u01ac\u01ad\5"+
		"\u00cdg\2\u01ad\u01ae\5\u00c9e\2\u01ae\u01af\5\u00b5[\2\u01af\u01b0\5"+
		"\u00bf`\2\u01b0\u01b1\5\u00b1Y\2\u01b1D\3\2\2\2\u01b2\u01b3\5\u00cdg\2"+
		"\u01b3\u01b4\5\u00c9e\2\u01b4\u01b5\5\u00adW\2\u01b5F\3\2\2\2\u01b6\u01b7"+
		"\5\u00c1a\2\u01b7\u01b8\5\u00bf`\2\u01b8H\3\2\2\2\u01b9\u01ba\5\u00cf"+
		"h\2\u01ba\u01bb\5\u00a5S\2\u01bb\u01bc\5\u00bb^\2\u01bc\u01bd\5\u00cd"+
		"g\2\u01bd\u01be\5\u00adW\2\u01be\u01bf\5\u00c9e\2\u01bfJ\3\2\2\2\u01c0"+
		"\u01c1\5\u00d1i\2\u01c1\u01c2\5\u00b3Z\2\u01c2\u01c3\5\u00adW\2\u01c3"+
		"\u01c4\5\u00c7d\2\u01c4\u01c5\5\u00adW\2\u01c5L\3\2\2\2\u01c6\u01c7\7"+
		"?\2\2\u01c7N\3\2\2\2\u01c8\u01c9\7<\2\2\u01c9\u01ca\7?\2\2\u01caP\3\2"+
		"\2\2\u01cb\u01cc\7>\2\2\u01cc\u01cd\7?\2\2\u01cd\u01ce\7@\2\2\u01ceR\3"+
		"\2\2\2\u01cf\u01d0\7@\2\2\u01d0\u01d1\7?\2\2\u01d1T\3\2\2\2\u01d2\u01d3"+
		"\7@\2\2\u01d3V\3\2\2\2\u01d4\u01d5\7>\2\2\u01d5\u01d6\7?\2\2\u01d6X\3"+
		"\2\2\2\u01d7\u01d8\7>\2\2\u01d8Z\3\2\2\2\u01d9\u01da\7#\2\2\u01da\u01db"+
		"\7?\2\2\u01db\\\3\2\2\2\u01dc\u01dd\7>\2\2\u01dd\u01de\7@\2\2\u01de\u01df"+
		"\3\2\2\2\u01df\u01e0\b/\2\2\u01e0^\3\2\2\2\u01e1\u01e2\7-\2\2\u01e2`\3"+
		"\2\2\2\u01e3\u01e4\7,\2\2\u01e4b\3\2\2\2\u01e5\u01e6\7/\2\2\u01e6d\3\2"+
		"\2\2\u01e7\u01e8\7\61\2\2\u01e8f\3\2\2\2\u01e9\u01ea\7\'\2\2\u01eah\3"+
		"\2\2\2\u01eb\u01ec\t\2\2\2\u01ecj\3\2\2\2\u01ed\u01ee\7#\2\2\u01eel\3"+
		"\2\2\2\u01ef\u01f0\7\u0080\2\2\u01f0n\3\2\2\2\u01f1\u01f2\7>\2\2\u01f2"+
		"\u01f3\7>\2\2\u01f3p\3\2\2\2\u01f4\u01f5\7@\2\2\u01f5\u01f6\7@\2\2\u01f6"+
		"r\3\2\2\2\u01f7\u01f8\7(\2\2\u01f8\u01f9\7(\2\2\u01f9t\3\2\2\2\u01fa\u01fb"+
		"\7(\2\2\u01fbv\3\2\2\2\u01fc\u01fd\7`\2\2\u01fdx\3\2\2\2\u01fe\u01ff\7"+
		"~\2\2\u01ffz\3\2\2\2\u0200\u0201\7\60\2\2\u0201|\3\2\2\2\u0202\u0203\7"+
		".\2\2\u0203~\3\2\2\2\u0204\u0205\7=\2\2\u0205\u0080\3\2\2\2\u0206\u0207"+
		"\7<\2\2\u0207\u0082\3\2\2\2\u0208\u0209\7*\2\2\u0209\u0084\3\2\2\2\u020a"+
		"\u020b\7+\2\2\u020b\u0086\3\2\2\2\u020c\u020d\7}\2\2\u020d\u0088\3\2\2"+
		"\2\u020e\u020f\7\177\2\2\u020f\u008a\3\2\2\2\u0210\u0211\7a\2\2\u0211"+
		"\u008c\3\2\2\2\u0212\u0213\5\u00cbf\2\u0213\u0214\5\u00c7d\2\u0214\u0215"+
		"\5\u00cdg\2\u0215\u0216\5\u00adW\2\u0216\u008e\3\2\2\2\u0217\u0218\5\u00af"+
		"X\2\u0218\u0219\5\u00a5S\2\u0219\u021a\5\u00bb^\2\u021a\u021b\5\u00c9"+
		"e\2\u021b\u021c\5\u00adW\2\u021c\u0090\3\2\2\2\u021d\u021e\5\u00a5S\2"+
		"\u021e\u021f\5\u00c9e\2\u021f\u0220\5\u00a9U\2\u0220\u0092\3\2\2\2\u0221"+
		"\u0222\5\u00abV\2\u0222\u0223\5\u00adW\2\u0223\u0224\5\u00c9e\2\u0224"+
		"\u0225\5\u00a9U\2\u0225\u0094\3\2\2\2\u0226\u0227\5\u00a7T\2\u0227\u0228"+
		"\5\u00adW\2\u0228\u0229\5\u00b1Y\2\u0229\u022a\5\u00b5[\2\u022a\u022b"+
		"\5\u00bf`\2\u022b\u0096\3\2\2\2\u022c\u022d\5\u00d1i\2\u022d\u022e\5\u00c1"+
		"a\2\u022e\u022f\5\u00c7d\2\u022f\u0230\5\u00b9]\2\u0230\u0098\3\2\2\2"+
		"\u0231\u0232\5\u00bb^\2\u0232\u0233\5\u00b5[\2\u0233\u0234\5\u00bd_\2"+
		"\u0234\u0235\5\u00b5[\2\u0235\u0236\5\u00cbf\2\u0236\u009a\3\2\2\2\u0237"+
		"\u0238\5\u00c3b\2\u0238\u0239\5\u00c7d\2\u0239\u023a\5\u00b5[\2\u023a"+
		"\u023b\5\u00bd_\2\u023b\u023c\5\u00a5S\2\u023c\u023d\5\u00c7d\2\u023d"+
		"\u023e\5\u00d5k\2\u023e\u009c\3\2\2\2\u023f\u0240\5\u00b5[\2\u0240\u0241"+
		"\5\u00bf`\2\u0241\u0242\5\u00cbf\2\u0242\u0243\5\u00c1a\2\u0243\u009e"+
		"\3\2\2\2\u0244\u0245\5\u00c1a\2\u0245\u0246\5\u00cdg\2\u0246\u0247\5\u00cb"+
		"f\2\u0247\u0248\5\u00afX\2\u0248\u0249\5\u00b5[\2\u0249\u024a\5\u00bb"+
		"^\2\u024a\u024b\5\u00adW\2\u024b\u00a0\3\2\2\2\u024c\u024d\5\u00abV\2"+
		"\u024d\u024e\5\u00cdg\2\u024e\u024f\5\u00bd_\2\u024f\u0250\5\u00c3b\2"+
		"\u0250\u0251\5\u00afX\2\u0251\u0252\5\u00b5[\2\u0252\u0253\5\u00bb^\2"+
		"\u0253\u0254\5\u00adW\2\u0254\u00a2\3\2\2\2\u0255\u0256\5\u00b3Z\2\u0256"+
		"\u0257\5\u00a5S\2\u0257\u0258\5\u00cfh\2\u0258\u0259\5\u00b5[\2\u0259"+
		"\u025a\5\u00bf`\2\u025a\u025b\5\u00b1Y\2\u025b\u00a4\3\2\2\2\u025c\u025d"+
		"\t\3\2\2\u025d\u00a6\3\2\2\2\u025e\u025f\t\4\2\2\u025f\u00a8\3\2\2\2\u0260"+
		"\u0261\t\5\2\2\u0261\u00aa\3\2\2\2\u0262\u0263\t\6\2\2\u0263\u00ac\3\2"+
		"\2\2\u0264\u0265\t\7\2\2\u0265\u00ae\3\2\2\2\u0266\u0267\t\b\2\2\u0267"+
		"\u00b0\3\2\2\2\u0268\u0269\t\t\2\2\u0269\u00b2\3\2\2\2\u026a\u026b\t\n"+
		"\2\2\u026b\u00b4\3\2\2\2\u026c\u026d\t\13\2\2\u026d\u00b6\3\2\2\2\u026e"+
		"\u026f\t\f\2\2\u026f\u00b8\3\2\2\2\u0270\u0271\t\r\2\2\u0271\u00ba\3\2"+
		"\2\2\u0272\u0273\t\16\2\2\u0273\u00bc\3\2\2\2\u0274\u0275\t\17\2\2\u0275"+
		"\u00be\3\2\2\2\u0276\u0277\t\20\2\2\u0277\u00c0\3\2\2\2\u0278\u0279\t"+
		"\21\2\2\u0279\u00c2\3\2\2\2\u027a\u027b\t\22\2\2\u027b\u00c4\3\2\2\2\u027c"+
		"\u027d\t\23\2\2\u027d\u00c6\3\2\2\2\u027e\u027f\t\24\2\2\u027f\u00c8\3"+
		"\2\2\2\u0280\u0281\t\25\2\2\u0281\u00ca\3\2\2\2\u0282\u0283\t\26\2\2\u0283"+
		"\u00cc\3\2\2\2\u0284\u0285\t\27\2\2\u0285\u00ce\3\2\2\2\u0286\u0287\t"+
		"\30\2\2\u0287\u00d0\3\2\2\2\u0288\u0289\t\31\2\2\u0289\u00d2\3\2\2\2\u028a"+
		"\u028b\t\32\2\2\u028b\u00d4\3\2\2\2\u028c\u028d\t\33\2\2\u028d\u00d6\3"+
		"\2\2\2\u028e\u028f\t\34\2\2\u028f\u00d8\3\2\2\2\u0290\u0291\7)\2\2\u0291"+
		"\u0292\5\u00f3z\2\u0292\u0293\7)\2\2\u0293\u00da\3\2\2\2\u0294\u0295\7"+
		"$\2\2\u0295\u0296\5\u00f3z\2\u0296\u0297\7$\2\2\u0297\u00dc\3\2\2\2\u0298"+
		"\u0299\7)\2\2\u0299\u029a\5\u00f3z\2\u029a\u029b\5\u00fb~\2\u029b\u029c"+
		"\5\u00f3z\2\u029c\u029d\7)\2\2\u029d\u00de\3\2\2\2\u029e\u029f\7)\2\2"+
		"\u029f\u02a0\3\2\2\2\u02a0\u02a1\bp\3\2\u02a1\u00e0\3\2\2\2\u02a2\u02a3"+
		"\7$\2\2\u02a3\u02a4\3\2\2\2\u02a4\u02a5\bq\3\2\u02a5\u00e2\3\2\2\2\u02a6"+
		"\u02a9\5\u00e9u\2\u02a7\u02a9\5\u00e5s\2\u02a8\u02a6\3\2\2\2\u02a8\u02a7"+
		"\3\2\2\2\u02a9\u00e4\3\2\2\2\u02aa\u02ab\t\35\2\2\u02ab\u00e6\3\2\2\2"+
		"\u02ac\u02ad\t\36\2\2\u02ad\u00e8\3\2\2\2\u02ae\u02af\t\37\2\2\u02af\u00ea"+
		"\3\2\2\2\u02b0\u02b2\5\u00e9u\2\u02b1\u02b0\3\2\2\2\u02b2\u02b3\3\2\2"+
		"\2\u02b3\u02b1\3\2\2\2\u02b3\u02b4\3\2\2\2\u02b4\u00ec\3\2\2\2\u02b5\u02b7"+
		"\5\u00e9u\2\u02b6\u02b5\3\2\2\2\u02b7\u02b8\3\2\2\2\u02b8\u02b6\3\2\2"+
		"\2\u02b8\u02b9\3\2\2\2\u02b9\u02c0\3\2\2\2\u02ba\u02bc\t \2\2\u02bb\u02bd"+
		"\5\u00e9u\2\u02bc\u02bb\3\2\2\2\u02bd\u02be\3\2\2\2\u02be\u02bc\3\2\2"+
		"\2\u02be\u02bf\3\2\2\2\u02bf\u02c1\3\2\2\2\u02c0\u02ba\3\2\2\2\u02c0\u02c1"+
		"\3\2\2\2\u02c1\u00ee\3\2\2\2\u02c2\u02c3\t!\2\2\u02c3\u00f0\3\2\2\2\u02c4"+
		"\u02c5\t\"\2\2\u02c5\u00f2\3\2\2\2\u02c6\u02cb\5\u00efx\2\u02c7\u02cb"+
		"\5\u00f1y\2\u02c8\u02cb\7a\2\2\u02c9\u02cb\5\u00ebv\2\u02ca\u02c6\3\2"+
		"\2\2\u02ca\u02c7\3\2\2\2\u02ca\u02c8\3\2\2\2\u02ca\u02c9\3\2\2\2\u02cb"+
		"\u02cc\3\2\2\2\u02cc\u02ca\3\2\2\2\u02cc\u02cd\3\2\2\2\u02cd\u00f4\3\2"+
		"\2\2\u02ce\u02d2\5\u00efx\2\u02cf\u02d2\5\u00f1y\2\u02d0\u02d2\7B\2\2"+
		"\u02d1\u02ce\3\2\2\2\u02d1\u02cf\3\2\2\2\u02d1\u02d0\3\2\2\2\u02d2\u02d3"+
		"\3\2\2\2\u02d3\u02d1\3\2\2\2\u02d3\u02d4\3\2\2\2\u02d4\u00f6\3\2\2\2\u02d5"+
		"\u02d9\5\u00efx\2\u02d6\u02d9\5\u00f1y\2\u02d7\u02d9\5\u00e9u\2\u02d8"+
		"\u02d5\3\2\2\2\u02d8\u02d6\3\2\2\2\u02d8\u02d7\3\2\2\2\u02d9\u02da\3\2"+
		"\2\2\u02da\u02d8\3\2\2\2\u02da\u02db\3\2\2\2\u02db\u02dc\3\2\2\2\u02dc"+
		"\u02e0\t#\2\2\u02dd\u02e1\5\u00efx\2\u02de\u02e1\5\u00f1y\2\u02df\u02e1"+
		"\5\u00e9u\2\u02e0\u02dd\3\2\2\2\u02e0\u02de\3\2\2\2\u02e0\u02df\3\2\2"+
		"\2\u02e1\u02e2\3\2\2\2\u02e2\u02e0\3\2\2\2\u02e2\u02e3\3\2\2\2\u02e3\u00f8"+
		"\3\2\2\2\u02e4\u02e9\5\u00efx\2\u02e5\u02e9\5\u00f1y\2\u02e6\u02e9\5\u00e9"+
		"u\2\u02e7\u02e9\t$\2\2\u02e8\u02e4\3\2\2\2\u02e8\u02e5\3\2\2\2\u02e8\u02e6"+
		"\3\2\2\2\u02e8\u02e7\3\2\2\2\u02e9\u02ea\3\2\2\2\u02ea\u02e8\3\2\2\2\u02ea"+
		"\u02eb\3\2\2\2\u02eb\u00fa\3\2\2\2\u02ec\u02ed\t%\2\2\u02ed\u02ee\3\2"+
		"\2\2\u02ee\u02ef\b~\3\2\u02ef\u00fc\3\2\2\2\u02f0\u02f2\7\17\2\2\u02f1"+
		"\u02f0\3\2\2\2\u02f1\u02f2\3\2\2\2\u02f2\u02f3\3\2\2\2\u02f3\u02f6\7\f"+
		"\2\2\u02f4\u02f6\7\17\2\2\u02f5\u02f1\3\2\2\2\u02f5\u02f4\3\2\2\2\u02f6"+
		"\u02f7\3\2\2\2\u02f7\u02f5\3\2\2\2\u02f7\u02f8\3\2\2\2\u02f8\u02f9\3\2"+
		"\2\2\u02f9\u02fa\b\177\3\2\u02fa\u00fe\3\2\2\2\25\2\u02a8\u02b3\u02b8"+
		"\u02be\u02c0\u02ca\u02cc\u02d1\u02d3\u02d8\u02da\u02e0\u02e2\u02e8\u02ea"+
		"\u02f1\u02f5\u02f7\4\t/\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}