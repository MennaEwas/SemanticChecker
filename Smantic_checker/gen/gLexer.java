// Generated from D:/curri/Seventh/Compilers/projects/Project2/src\g.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class gLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, Int_literal=37, Decimal_literal=38, 
		Bool_literal=39, ID=40, Hex_literal=41, DIGIT=42, Char_literal=43, String_literal=44, 
		COMMENT1=45, WHITESPACE=46;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
			"T__33", "T__34", "T__35", "Int_literal", "Decimal_literal", "Bool_literal", 
			"ID", "ALPHA", "Hex_literal", "DIGIT", "Char_literal", "String_literal", 
			"CHAR", "COMMENT1", "WHITESPACE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'class Program'", "'{'", "'}'", "'['", "']'", "','", "';'", "'void'", 
			"'('", "')'", "'int'", "'boolean'", "'if'", "'else'", "'for'", "'='", 
			"'return'", "'break'", "'continue'", "'+='", "'-='", "'callout'", "'-'", 
			"'!'", "'+'", "'*'", "'/'", "'%'", "'<'", "'>'", "'<='", "'>='", "'=='", 
			"'!='", "'&&'", "'||'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "Int_literal", "Decimal_literal", "Bool_literal", "ID", "Hex_literal", 
			"DIGIT", "Char_literal", "String_literal", "COMMENT1", "WHITESPACE"
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


	public gLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "g.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\60\u013f\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3"+
		"\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30"+
		"\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37"+
		"\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\5"+
		"&\u00e9\n&\3\'\6\'\u00ec\n\'\r\'\16\'\u00ed\3(\3(\3(\3(\3(\3(\3(\3(\3"+
		"(\5(\u00f9\n(\3)\3)\3)\7)\u00fe\n)\f)\16)\u0101\13)\3*\5*\u0104\n*\3+"+
		"\3+\3+\3+\6+\u010a\n+\r+\16+\u010b\3,\3,\3-\3-\3-\3-\3.\3.\7.\u0116\n"+
		".\f.\16.\u0119\13.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/"+
		"\5/\u012c\n/\3\60\3\60\3\60\3\60\7\60\u0132\n\60\f\60\16\60\u0135\13\60"+
		"\3\60\5\60\u0138\n\60\3\60\3\60\3\61\3\61\3\61\3\61\3\u0133\2\62\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E$G%I&K\'M(O)Q*S\2U+W,Y-[.]\2_/a\60\3\2\t\5\2C\\aac|\5\2\62;CHch"+
		"\3\2\62;\4\2%(*\60\7\2\61\61<B]]_b}\u0080\3\3\f\f\4\2\13\f\"\"\2\u014d"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2U\3\2\2\2\2"+
		"W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\3c\3\2\2\2\5q\3"+
		"\2\2\2\7s\3\2\2\2\tu\3\2\2\2\13w\3\2\2\2\ry\3\2\2\2\17{\3\2\2\2\21}\3"+
		"\2\2\2\23\u0082\3\2\2\2\25\u0084\3\2\2\2\27\u0086\3\2\2\2\31\u008a\3\2"+
		"\2\2\33\u0092\3\2\2\2\35\u0095\3\2\2\2\37\u009a\3\2\2\2!\u009e\3\2\2\2"+
		"#\u00a0\3\2\2\2%\u00a7\3\2\2\2\'\u00ad\3\2\2\2)\u00b6\3\2\2\2+\u00b9\3"+
		"\2\2\2-\u00bc\3\2\2\2/\u00c4\3\2\2\2\61\u00c6\3\2\2\2\63\u00c8\3\2\2\2"+
		"\65\u00ca\3\2\2\2\67\u00cc\3\2\2\29\u00ce\3\2\2\2;\u00d0\3\2\2\2=\u00d2"+
		"\3\2\2\2?\u00d4\3\2\2\2A\u00d7\3\2\2\2C\u00da\3\2\2\2E\u00dd\3\2\2\2G"+
		"\u00e0\3\2\2\2I\u00e3\3\2\2\2K\u00e8\3\2\2\2M\u00eb\3\2\2\2O\u00f8\3\2"+
		"\2\2Q\u00fa\3\2\2\2S\u0103\3\2\2\2U\u0105\3\2\2\2W\u010d\3\2\2\2Y\u010f"+
		"\3\2\2\2[\u0113\3\2\2\2]\u012b\3\2\2\2_\u012d\3\2\2\2a\u013b\3\2\2\2c"+
		"d\7e\2\2de\7n\2\2ef\7c\2\2fg\7u\2\2gh\7u\2\2hi\7\"\2\2ij\7R\2\2jk\7t\2"+
		"\2kl\7q\2\2lm\7i\2\2mn\7t\2\2no\7c\2\2op\7o\2\2p\4\3\2\2\2qr\7}\2\2r\6"+
		"\3\2\2\2st\7\177\2\2t\b\3\2\2\2uv\7]\2\2v\n\3\2\2\2wx\7_\2\2x\f\3\2\2"+
		"\2yz\7.\2\2z\16\3\2\2\2{|\7=\2\2|\20\3\2\2\2}~\7x\2\2~\177\7q\2\2\177"+
		"\u0080\7k\2\2\u0080\u0081\7f\2\2\u0081\22\3\2\2\2\u0082\u0083\7*\2\2\u0083"+
		"\24\3\2\2\2\u0084\u0085\7+\2\2\u0085\26\3\2\2\2\u0086\u0087\7k\2\2\u0087"+
		"\u0088\7p\2\2\u0088\u0089\7v\2\2\u0089\30\3\2\2\2\u008a\u008b\7d\2\2\u008b"+
		"\u008c\7q\2\2\u008c\u008d\7q\2\2\u008d\u008e\7n\2\2\u008e\u008f\7g\2\2"+
		"\u008f\u0090\7c\2\2\u0090\u0091\7p\2\2\u0091\32\3\2\2\2\u0092\u0093\7"+
		"k\2\2\u0093\u0094\7h\2\2\u0094\34\3\2\2\2\u0095\u0096\7g\2\2\u0096\u0097"+
		"\7n\2\2\u0097\u0098\7u\2\2\u0098\u0099\7g\2\2\u0099\36\3\2\2\2\u009a\u009b"+
		"\7h\2\2\u009b\u009c\7q\2\2\u009c\u009d\7t\2\2\u009d \3\2\2\2\u009e\u009f"+
		"\7?\2\2\u009f\"\3\2\2\2\u00a0\u00a1\7t\2\2\u00a1\u00a2\7g\2\2\u00a2\u00a3"+
		"\7v\2\2\u00a3\u00a4\7w\2\2\u00a4\u00a5\7t\2\2\u00a5\u00a6\7p\2\2\u00a6"+
		"$\3\2\2\2\u00a7\u00a8\7d\2\2\u00a8\u00a9\7t\2\2\u00a9\u00aa\7g\2\2\u00aa"+
		"\u00ab\7c\2\2\u00ab\u00ac\7m\2\2\u00ac&\3\2\2\2\u00ad\u00ae\7e\2\2\u00ae"+
		"\u00af\7q\2\2\u00af\u00b0\7p\2\2\u00b0\u00b1\7v\2\2\u00b1\u00b2\7k\2\2"+
		"\u00b2\u00b3\7p\2\2\u00b3\u00b4\7w\2\2\u00b4\u00b5\7g\2\2\u00b5(\3\2\2"+
		"\2\u00b6\u00b7\7-\2\2\u00b7\u00b8\7?\2\2\u00b8*\3\2\2\2\u00b9\u00ba\7"+
		"/\2\2\u00ba\u00bb\7?\2\2\u00bb,\3\2\2\2\u00bc\u00bd\7e\2\2\u00bd\u00be"+
		"\7c\2\2\u00be\u00bf\7n\2\2\u00bf\u00c0\7n\2\2\u00c0\u00c1\7q\2\2\u00c1"+
		"\u00c2\7w\2\2\u00c2\u00c3\7v\2\2\u00c3.\3\2\2\2\u00c4\u00c5\7/\2\2\u00c5"+
		"\60\3\2\2\2\u00c6\u00c7\7#\2\2\u00c7\62\3\2\2\2\u00c8\u00c9\7-\2\2\u00c9"+
		"\64\3\2\2\2\u00ca\u00cb\7,\2\2\u00cb\66\3\2\2\2\u00cc\u00cd\7\61\2\2\u00cd"+
		"8\3\2\2\2\u00ce\u00cf\7\'\2\2\u00cf:\3\2\2\2\u00d0\u00d1\7>\2\2\u00d1"+
		"<\3\2\2\2\u00d2\u00d3\7@\2\2\u00d3>\3\2\2\2\u00d4\u00d5\7>\2\2\u00d5\u00d6"+
		"\7?\2\2\u00d6@\3\2\2\2\u00d7\u00d8\7@\2\2\u00d8\u00d9\7?\2\2\u00d9B\3"+
		"\2\2\2\u00da\u00db\7?\2\2\u00db\u00dc\7?\2\2\u00dcD\3\2\2\2\u00dd\u00de"+
		"\7#\2\2\u00de\u00df\7?\2\2\u00dfF\3\2\2\2\u00e0\u00e1\7(\2\2\u00e1\u00e2"+
		"\7(\2\2\u00e2H\3\2\2\2\u00e3\u00e4\7~\2\2\u00e4\u00e5\7~\2\2\u00e5J\3"+
		"\2\2\2\u00e6\u00e9\5M\'\2\u00e7\u00e9\5U+\2\u00e8\u00e6\3\2\2\2\u00e8"+
		"\u00e7\3\2\2\2\u00e9L\3\2\2\2\u00ea\u00ec\5W,\2\u00eb\u00ea\3\2\2\2\u00ec"+
		"\u00ed\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00eeN\3\2\2\2"+
		"\u00ef\u00f0\7v\2\2\u00f0\u00f1\7t\2\2\u00f1\u00f2\7w\2\2\u00f2\u00f9"+
		"\7g\2\2\u00f3\u00f4\7h\2\2\u00f4\u00f5\7c\2\2\u00f5\u00f6\7n\2\2\u00f6"+
		"\u00f7\7u\2\2\u00f7\u00f9\7g\2\2\u00f8\u00ef\3\2\2\2\u00f8\u00f3\3\2\2"+
		"\2\u00f9P\3\2\2\2\u00fa\u00ff\5S*\2\u00fb\u00fe\5S*\2\u00fc\u00fe\5W,"+
		"\2\u00fd\u00fb\3\2\2\2\u00fd\u00fc\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff\u00fd"+
		"\3\2\2\2\u00ff\u0100\3\2\2\2\u0100R\3\2\2\2\u0101\u00ff\3\2\2\2\u0102"+
		"\u0104\t\2\2\2\u0103\u0102\3\2\2\2\u0104T\3\2\2\2\u0105\u0106\7\62\2\2"+
		"\u0106\u0107\7z\2\2\u0107\u0109\3\2\2\2\u0108\u010a\t\3\2\2\u0109\u0108"+
		"\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c"+
		"V\3\2\2\2\u010d\u010e\t\4\2\2\u010eX\3\2\2\2\u010f\u0110\7)\2\2\u0110"+
		"\u0111\5]/\2\u0111\u0112\7)\2\2\u0112Z\3\2\2\2\u0113\u0117\7$\2\2\u0114"+
		"\u0116\5]/\2\u0115\u0114\3\2\2\2\u0116\u0119\3\2\2\2\u0117\u0115\3\2\2"+
		"\2\u0117\u0118\3\2\2\2\u0118\u011a\3\2\2\2\u0119\u0117\3\2\2\2\u011a\u011b"+
		"\7$\2\2\u011b\\\3\2\2\2\u011c\u012c\5S*\2\u011d\u012c\5W,\2\u011e\u012c"+
		"\4\"#\2\u011f\u0120\7^\2\2\u0120\u012c\7$\2\2\u0121\u012c\t\5\2\2\u0122"+
		"\u0123\7^\2\2\u0123\u012c\7)\2\2\u0124\u012c\t\6\2\2\u0125\u0126\7^\2"+
		"\2\u0126\u012c\7p\2\2\u0127\u0128\7^\2\2\u0128\u012c\7v\2\2\u0129\u012a"+
		"\7^\2\2\u012a\u012c\7^\2\2\u012b\u011c\3\2\2\2\u012b\u011d\3\2\2\2\u012b"+
		"\u011e\3\2\2\2\u012b\u011f\3\2\2\2\u012b\u0121\3\2\2\2\u012b\u0122\3\2"+
		"\2\2\u012b\u0124\3\2\2\2\u012b\u0125\3\2\2\2\u012b\u0127\3\2\2\2\u012b"+
		"\u0129\3\2\2\2\u012c^\3\2\2\2\u012d\u012e\7\61\2\2\u012e\u012f\7\61\2"+
		"\2\u012f\u0133\3\2\2\2\u0130\u0132\13\2\2\2\u0131\u0130\3\2\2\2\u0132"+
		"\u0135\3\2\2\2\u0133\u0134\3\2\2\2\u0133\u0131\3\2\2\2\u0134\u0137\3\2"+
		"\2\2\u0135\u0133\3\2\2\2\u0136\u0138\t\7\2\2\u0137\u0136\3\2\2\2\u0138"+
		"\u0139\3\2\2\2\u0139\u013a\b\60\2\2\u013a`\3\2\2\2\u013b\u013c\t\b\2\2"+
		"\u013c\u013d\3\2\2\2\u013d\u013e\b\61\2\2\u013eb\3\2\2\2\16\2\u00e8\u00ed"+
		"\u00f8\u00fd\u00ff\u0103\u010b\u0117\u012b\u0133\u0137\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}