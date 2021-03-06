// Generated from /home/jedouik/Documents/gl53/src/main/antlr4/fr/ensimag/deca/syntax/DecaLexer.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DecaLexer extends AbstractDecaLexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SEMI=1, ASM=2, INSTANCEOF=3, PRINTLN=4, TRUE=5, CLASS=6, NEW=7, PRINTLNX=8, 
		WHILE=9, EXTENDS=10, NULL=11, PRINTX=12, ELSE=13, READINT=14, PROTECTED=15, 
		FALSE=16, READFLOAT=17, RETURN=18, IF=19, PRINT=20, THIS=21, PLUS=22, 
		MINUS=23, TIMES=24, SLASH=25, PERCENT=26, EXCLAM=27, LEQ=28, GEQ=29, LT=30, 
		GT=31, EQUALS=32, EQEQ=33, NEQ=34, DOT=35, COMMA=36, OPARENT=37, CPARENT=38, 
		OBRACE=39, CBRACE=40, OR=41, AND=42, INT=43, FLOAT=44, STRING=45, MULTI_LINE_STRING=46, 
		WS=47, INCLUDE=48, IDENT=49;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"SEMI", "ASM", "INSTANCEOF", "PRINTLN", "TRUE", "CLASS", "NEW", "PRINTLNX", 
		"WHILE", "EXTENDS", "NULL", "PRINTX", "ELSE", "READINT", "PROTECTED", 
		"FALSE", "READFLOAT", "RETURN", "IF", "PRINT", "THIS", "PLUS", "MINUS", 
		"TIMES", "SLASH", "PERCENT", "EXCLAM", "LEQ", "GEQ", "LT", "GT", "EQUALS", 
		"EQEQ", "NEQ", "DOT", "COMMA", "OPARENT", "CPARENT", "OBRACE", "CBRACE", 
		"OR", "AND", "EOL", "TAB", "LETTER", "DIGIT", "SKIPCAR", "POSITIVE_DIGITS", 
		"INT", "HEXA_MAJ", "HEXA_MIN", "NUM", "SIGN", "EXP", "DEC", "FLOATDEC", 
		"DIGITHEX", "NUMHEX", "FLOATHEX", "FLOAT", "STRING_CAR", "STRING", "MULTI_LINE_STRING", 
		"COMMENT", "WS", "FILENAME", "INCLUDE", "IDENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'asm'", "'instanceof'", "'println'", "'true'", "'class'", 
		"'new'", "'printlnx'", "'while'", "'extends'", "'null'", "'printx'", "'else'", 
		"'readInt'", "'protected'", "'false'", "'readFloat'", "'return'", "'if'", 
		"'print'", "'this'", "'+'", "'-'", "'*'", "'/'", "'%'", "'!'", "'<='", 
		"'>='", "'<'", "'>'", "'='", "'=='", "'!='", "'.'", "','", "'('", "')'", 
		"'{'", "'}'", "'||'", "'&&'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SEMI", "ASM", "INSTANCEOF", "PRINTLN", "TRUE", "CLASS", "NEW", 
		"PRINTLNX", "WHILE", "EXTENDS", "NULL", "PRINTX", "ELSE", "READINT", "PROTECTED", 
		"FALSE", "READFLOAT", "RETURN", "IF", "PRINT", "THIS", "PLUS", "MINUS", 
		"TIMES", "SLASH", "PERCENT", "EXCLAM", "LEQ", "GEQ", "LT", "GT", "EQUALS", 
		"EQEQ", "NEQ", "DOT", "COMMA", "OPARENT", "CPARENT", "OBRACE", "CBRACE", 
		"OR", "AND", "INT", "FLOAT", "STRING", "MULTI_LINE_STRING", "WS", "INCLUDE", 
		"IDENT"
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




	public DecaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "DecaLexer.g4"; }

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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 64:
			WS_action((RuleContext)_localctx, actionIndex);
			break;
		case 66:
			INCLUDE_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			skip();
			break;
		}
	}
	private void INCLUDE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			doInclude(getText());
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\63\u01f5\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t"+
		"=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3"+
		"\33\3\33\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3 \3 \3!\3"+
		"!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3*"+
		"\3+\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\60\3\60\5\60\u014f\n\60"+
		"\3\61\3\61\3\62\3\62\6\62\u0155\n\62\r\62\16\62\u0156\3\63\3\63\3\64\3"+
		"\64\3\65\6\65\u015e\n\65\r\65\16\65\u015f\3\66\5\66\u0163\n\66\3\67\3"+
		"\67\3\67\3\67\38\38\38\38\39\39\39\39\59\u0171\n9\39\59\u0174\n9\3:\3"+
		":\3:\5:\u0179\n:\3;\6;\u017c\n;\r;\16;\u017d\3<\3<\3<\3<\5<\u0184\n<\3"+
		"<\3<\3<\3<\3<\3<\3<\5<\u018d\n<\3=\3=\5=\u0191\n=\3>\3>\3?\3?\3?\3?\3"+
		"?\3?\7?\u019b\n?\f?\16?\u019e\13?\3?\3?\3@\3@\3@\3@\3@\3@\3@\7@\u01a9"+
		"\n@\f@\16@\u01ac\13@\3@\3@\3A\3A\3A\3A\7A\u01b4\nA\fA\16A\u01b7\13A\3"+
		"A\3A\3A\3A\3A\3A\7A\u01bf\nA\fA\16A\u01c2\13A\3A\5A\u01c5\nA\5A\u01c7"+
		"\nA\3B\3B\5B\u01cb\nB\3B\3B\3C\3C\3C\6C\u01d2\nC\rC\16C\u01d3\3D\3D\3"+
		"D\3D\3D\3D\3D\3D\3D\3D\7D\u01e0\nD\fD\16D\u01e3\13D\3D\3D\3D\3D\3D\3E"+
		"\3E\5E\u01ec\nE\3E\3E\3E\7E\u01f1\nE\fE\16E\u01f4\13E\4\u01b5\u01c0\2"+
		"F\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37"+
		"= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W\2Y\2[\2]\2_\2a\2c-e\2g\2i\2k\2m\2o\2q\2"+
		"s\2u\2w\2y.{\2}/\177\60\u0081\2\u0083\61\u0085\2\u0087\62\u0089\63\3\2"+
		"\13\4\2C\\c|\4\2--//\4\2GGgg\4\2HHhh\4\2RRrr\5\2\f\f$$^^\3\3\f\f\4\2/"+
		"\60aa\4\2&&aa\2\u0203\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2"+
		"\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2"+
		"Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2c\3\2\2\2\2y\3\2\2\2\2}\3\2\2\2\2\177"+
		"\3\2\2\2\2\u0083\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\3\u008b\3\2\2"+
		"\2\5\u008d\3\2\2\2\7\u0091\3\2\2\2\t\u009c\3\2\2\2\13\u00a4\3\2\2\2\r"+
		"\u00a9\3\2\2\2\17\u00af\3\2\2\2\21\u00b3\3\2\2\2\23\u00bc\3\2\2\2\25\u00c2"+
		"\3\2\2\2\27\u00ca\3\2\2\2\31\u00cf\3\2\2\2\33\u00d6\3\2\2\2\35\u00db\3"+
		"\2\2\2\37\u00e3\3\2\2\2!\u00ed\3\2\2\2#\u00f3\3\2\2\2%\u00fd\3\2\2\2\'"+
		"\u0104\3\2\2\2)\u0107\3\2\2\2+\u010d\3\2\2\2-\u0112\3\2\2\2/\u0114\3\2"+
		"\2\2\61\u0116\3\2\2\2\63\u0118\3\2\2\2\65\u011a\3\2\2\2\67\u011c\3\2\2"+
		"\29\u011e\3\2\2\2;\u0121\3\2\2\2=\u0124\3\2\2\2?\u0126\3\2\2\2A\u0128"+
		"\3\2\2\2C\u012a\3\2\2\2E\u012d\3\2\2\2G\u0130\3\2\2\2I\u0132\3\2\2\2K"+
		"\u0134\3\2\2\2M\u0136\3\2\2\2O\u0138\3\2\2\2Q\u013a\3\2\2\2S\u013c\3\2"+
		"\2\2U\u013f\3\2\2\2W\u0142\3\2\2\2Y\u0144\3\2\2\2[\u0146\3\2\2\2]\u0148"+
		"\3\2\2\2_\u014e\3\2\2\2a\u0150\3\2\2\2c\u0154\3\2\2\2e\u0158\3\2\2\2g"+
		"\u015a\3\2\2\2i\u015d\3\2\2\2k\u0162\3\2\2\2m\u0164\3\2\2\2o\u0168\3\2"+
		"\2\2q\u0170\3\2\2\2s\u0178\3\2\2\2u\u017b\3\2\2\2w\u0183\3\2\2\2y\u0190"+
		"\3\2\2\2{\u0192\3\2\2\2}\u0194\3\2\2\2\177\u01a1\3\2\2\2\u0081\u01c6\3"+
		"\2\2\2\u0083\u01ca\3\2\2\2\u0085\u01d1\3\2\2\2\u0087\u01d5\3\2\2\2\u0089"+
		"\u01eb\3\2\2\2\u008b\u008c\7=\2\2\u008c\4\3\2\2\2\u008d\u008e\7c\2\2\u008e"+
		"\u008f\7u\2\2\u008f\u0090\7o\2\2\u0090\6\3\2\2\2\u0091\u0092\7k\2\2\u0092"+
		"\u0093\7p\2\2\u0093\u0094\7u\2\2\u0094\u0095\7v\2\2\u0095\u0096\7c\2\2"+
		"\u0096\u0097\7p\2\2\u0097\u0098\7e\2\2\u0098\u0099\7g\2\2\u0099\u009a"+
		"\7q\2\2\u009a\u009b\7h\2\2\u009b\b\3\2\2\2\u009c\u009d\7r\2\2\u009d\u009e"+
		"\7t\2\2\u009e\u009f\7k\2\2\u009f\u00a0\7p\2\2\u00a0\u00a1\7v\2\2\u00a1"+
		"\u00a2\7n\2\2\u00a2\u00a3\7p\2\2\u00a3\n\3\2\2\2\u00a4\u00a5\7v\2\2\u00a5"+
		"\u00a6\7t\2\2\u00a6\u00a7\7w\2\2\u00a7\u00a8\7g\2\2\u00a8\f\3\2\2\2\u00a9"+
		"\u00aa\7e\2\2\u00aa\u00ab\7n\2\2\u00ab\u00ac\7c\2\2\u00ac\u00ad\7u\2\2"+
		"\u00ad\u00ae\7u\2\2\u00ae\16\3\2\2\2\u00af\u00b0\7p\2\2\u00b0\u00b1\7"+
		"g\2\2\u00b1\u00b2\7y\2\2\u00b2\20\3\2\2\2\u00b3\u00b4\7r\2\2\u00b4\u00b5"+
		"\7t\2\2\u00b5\u00b6\7k\2\2\u00b6\u00b7\7p\2\2\u00b7\u00b8\7v\2\2\u00b8"+
		"\u00b9\7n\2\2\u00b9\u00ba\7p\2\2\u00ba\u00bb\7z\2\2\u00bb\22\3\2\2\2\u00bc"+
		"\u00bd\7y\2\2\u00bd\u00be\7j\2\2\u00be\u00bf\7k\2\2\u00bf\u00c0\7n\2\2"+
		"\u00c0\u00c1\7g\2\2\u00c1\24\3\2\2\2\u00c2\u00c3\7g\2\2\u00c3\u00c4\7"+
		"z\2\2\u00c4\u00c5\7v\2\2\u00c5\u00c6\7g\2\2\u00c6\u00c7\7p\2\2\u00c7\u00c8"+
		"\7f\2\2\u00c8\u00c9\7u\2\2\u00c9\26\3\2\2\2\u00ca\u00cb\7p\2\2\u00cb\u00cc"+
		"\7w\2\2\u00cc\u00cd\7n\2\2\u00cd\u00ce\7n\2\2\u00ce\30\3\2\2\2\u00cf\u00d0"+
		"\7r\2\2\u00d0\u00d1\7t\2\2\u00d1\u00d2\7k\2\2\u00d2\u00d3\7p\2\2\u00d3"+
		"\u00d4\7v\2\2\u00d4\u00d5\7z\2\2\u00d5\32\3\2\2\2\u00d6\u00d7\7g\2\2\u00d7"+
		"\u00d8\7n\2\2\u00d8\u00d9\7u\2\2\u00d9\u00da\7g\2\2\u00da\34\3\2\2\2\u00db"+
		"\u00dc\7t\2\2\u00dc\u00dd\7g\2\2\u00dd\u00de\7c\2\2\u00de\u00df\7f\2\2"+
		"\u00df\u00e0\7K\2\2\u00e0\u00e1\7p\2\2\u00e1\u00e2\7v\2\2\u00e2\36\3\2"+
		"\2\2\u00e3\u00e4\7r\2\2\u00e4\u00e5\7t\2\2\u00e5\u00e6\7q\2\2\u00e6\u00e7"+
		"\7v\2\2\u00e7\u00e8\7g\2\2\u00e8\u00e9\7e\2\2\u00e9\u00ea\7v\2\2\u00ea"+
		"\u00eb\7g\2\2\u00eb\u00ec\7f\2\2\u00ec \3\2\2\2\u00ed\u00ee\7h\2\2\u00ee"+
		"\u00ef\7c\2\2\u00ef\u00f0\7n\2\2\u00f0\u00f1\7u\2\2\u00f1\u00f2\7g\2\2"+
		"\u00f2\"\3\2\2\2\u00f3\u00f4\7t\2\2\u00f4\u00f5\7g\2\2\u00f5\u00f6\7c"+
		"\2\2\u00f6\u00f7\7f\2\2\u00f7\u00f8\7H\2\2\u00f8\u00f9\7n\2\2\u00f9\u00fa"+
		"\7q\2\2\u00fa\u00fb\7c\2\2\u00fb\u00fc\7v\2\2\u00fc$\3\2\2\2\u00fd\u00fe"+
		"\7t\2\2\u00fe\u00ff\7g\2\2\u00ff\u0100\7v\2\2\u0100\u0101\7w\2\2\u0101"+
		"\u0102\7t\2\2\u0102\u0103\7p\2\2\u0103&\3\2\2\2\u0104\u0105\7k\2\2\u0105"+
		"\u0106\7h\2\2\u0106(\3\2\2\2\u0107\u0108\7r\2\2\u0108\u0109\7t\2\2\u0109"+
		"\u010a\7k\2\2\u010a\u010b\7p\2\2\u010b\u010c\7v\2\2\u010c*\3\2\2\2\u010d"+
		"\u010e\7v\2\2\u010e\u010f\7j\2\2\u010f\u0110\7k\2\2\u0110\u0111\7u\2\2"+
		"\u0111,\3\2\2\2\u0112\u0113\7-\2\2\u0113.\3\2\2\2\u0114\u0115\7/\2\2\u0115"+
		"\60\3\2\2\2\u0116\u0117\7,\2\2\u0117\62\3\2\2\2\u0118\u0119\7\61\2\2\u0119"+
		"\64\3\2\2\2\u011a\u011b\7\'\2\2\u011b\66\3\2\2\2\u011c\u011d\7#\2\2\u011d"+
		"8\3\2\2\2\u011e\u011f\7>\2\2\u011f\u0120\7?\2\2\u0120:\3\2\2\2\u0121\u0122"+
		"\7@\2\2\u0122\u0123\7?\2\2\u0123<\3\2\2\2\u0124\u0125\7>\2\2\u0125>\3"+
		"\2\2\2\u0126\u0127\7@\2\2\u0127@\3\2\2\2\u0128\u0129\7?\2\2\u0129B\3\2"+
		"\2\2\u012a\u012b\7?\2\2\u012b\u012c\7?\2\2\u012cD\3\2\2\2\u012d\u012e"+
		"\7#\2\2\u012e\u012f\7?\2\2\u012fF\3\2\2\2\u0130\u0131\7\60\2\2\u0131H"+
		"\3\2\2\2\u0132\u0133\7.\2\2\u0133J\3\2\2\2\u0134\u0135\7*\2\2\u0135L\3"+
		"\2\2\2\u0136\u0137\7+\2\2\u0137N\3\2\2\2\u0138\u0139\7}\2\2\u0139P\3\2"+
		"\2\2\u013a\u013b\7\177\2\2\u013bR\3\2\2\2\u013c\u013d\7~\2\2\u013d\u013e"+
		"\7~\2\2\u013eT\3\2\2\2\u013f\u0140\7(\2\2\u0140\u0141\7(\2\2\u0141V\3"+
		"\2\2\2\u0142\u0143\7\f\2\2\u0143X\3\2\2\2\u0144\u0145\7\13\2\2\u0145Z"+
		"\3\2\2\2\u0146\u0147\t\2\2\2\u0147\\\3\2\2\2\u0148\u0149\4\62;\2\u0149"+
		"^\3\2\2\2\u014a\u014f\7\"\2\2\u014b\u014f\5W,\2\u014c\u014f\5Y-\2\u014d"+
		"\u014f\7\17\2\2\u014e\u014a\3\2\2\2\u014e\u014b\3\2\2\2\u014e\u014c\3"+
		"\2\2\2\u014e\u014d\3\2\2\2\u014f`\3\2\2\2\u0150\u0151\4\63;\2\u0151b\3"+
		"\2\2\2\u0152\u0155\7\62\2\2\u0153\u0155\5a\61\2\u0154\u0152\3\2\2\2\u0154"+
		"\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0154\3\2\2\2\u0156\u0157\3\2"+
		"\2\2\u0157d\3\2\2\2\u0158\u0159\4CH\2\u0159f\3\2\2\2\u015a\u015b\4ch\2"+
		"\u015bh\3\2\2\2\u015c\u015e\5]/\2\u015d\u015c\3\2\2\2\u015e\u015f\3\2"+
		"\2\2\u015f\u015d\3\2\2\2\u015f\u0160\3\2\2\2\u0160j\3\2\2\2\u0161\u0163"+
		"\t\3\2\2\u0162\u0161\3\2\2\2\u0162\u0163\3\2\2\2\u0163l\3\2\2\2\u0164"+
		"\u0165\t\4\2\2\u0165\u0166\5k\66\2\u0166\u0167\5i\65\2\u0167n\3\2\2\2"+
		"\u0168\u0169\5i\65\2\u0169\u016a\7\60\2\2\u016a\u016b\5i\65\2\u016bp\3"+
		"\2\2\2\u016c\u0171\5o8\2\u016d\u016e\5o8\2\u016e\u016f\5m\67\2\u016f\u0171"+
		"\3\2\2\2\u0170\u016c\3\2\2\2\u0170\u016d\3\2\2\2\u0171\u0173\3\2\2\2\u0172"+
		"\u0174\t\5\2\2\u0173\u0172\3\2\2\2\u0173\u0174\3\2\2\2\u0174r\3\2\2\2"+
		"\u0175\u0179\5]/\2\u0176\u0179\5e\63\2\u0177\u0179\5g\64\2\u0178\u0175"+
		"\3\2\2\2\u0178\u0176\3\2\2\2\u0178\u0177\3\2\2\2\u0179t\3\2\2\2\u017a"+
		"\u017c\5s:\2\u017b\u017a\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u017b\3\2\2"+
		"\2\u017d\u017e\3\2\2\2\u017ev\3\2\2\2\u017f\u0180\7\62\2\2\u0180\u0184"+
		"\7z\2\2\u0181\u0182\7\62\2\2\u0182\u0184\7Z\2\2\u0183\u017f\3\2\2\2\u0183"+
		"\u0181\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0186\5u;\2\u0186\u0187\7\60"+
		"\2\2\u0187\u0188\5u;\2\u0188\u0189\t\6\2\2\u0189\u018a\5k\66\2\u018a\u018c"+
		"\5i\65\2\u018b\u018d\t\5\2\2\u018c\u018b\3\2\2\2\u018c\u018d\3\2\2\2\u018d"+
		"x\3\2\2\2\u018e\u0191\5q9\2\u018f\u0191\5w<\2\u0190\u018e\3\2\2\2\u0190"+
		"\u018f\3\2\2\2\u0191z\3\2\2\2\u0192\u0193\n\7\2\2\u0193|\3\2\2\2\u0194"+
		"\u019c\7$\2\2\u0195\u019b\5{>\2\u0196\u0197\7^\2\2\u0197\u019b\7$\2\2"+
		"\u0198\u0199\7^\2\2\u0199\u019b\7^\2\2\u019a\u0195\3\2\2\2\u019a\u0196"+
		"\3\2\2\2\u019a\u0198\3\2\2\2\u019b\u019e\3\2\2\2\u019c\u019a\3\2\2\2\u019c"+
		"\u019d\3\2\2\2\u019d\u019f\3\2\2\2\u019e\u019c\3\2\2\2\u019f\u01a0\7$"+
		"\2\2\u01a0~\3\2\2\2\u01a1\u01aa\7$\2\2\u01a2\u01a9\5{>\2\u01a3\u01a9\5"+
		"W,\2\u01a4\u01a5\7^\2\2\u01a5\u01a9\7$\2\2\u01a6\u01a7\7^\2\2\u01a7\u01a9"+
		"\7^\2\2\u01a8\u01a2\3\2\2\2\u01a8\u01a3\3\2\2\2\u01a8\u01a4\3\2\2\2\u01a8"+
		"\u01a6\3\2\2\2\u01a9\u01ac\3\2\2\2\u01aa\u01a8\3\2\2\2\u01aa\u01ab\3\2"+
		"\2\2\u01ab\u01ad\3\2\2\2\u01ac\u01aa\3\2\2\2\u01ad\u01ae\7$\2\2\u01ae"+
		"\u0080\3\2\2\2\u01af\u01b0\7\61\2\2\u01b0\u01b1\7,\2\2\u01b1\u01b5\3\2"+
		"\2\2\u01b2\u01b4\13\2\2\2\u01b3\u01b2\3\2\2\2\u01b4\u01b7\3\2\2\2\u01b5"+
		"\u01b6\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b6\u01b8\3\2\2\2\u01b7\u01b5\3\2"+
		"\2\2\u01b8\u01b9\7,\2\2\u01b9\u01c7\7\61\2\2\u01ba\u01bb\7\61\2\2\u01bb"+
		"\u01bc\7\61\2\2\u01bc\u01c0\3\2\2\2\u01bd\u01bf\13\2\2\2\u01be\u01bd\3"+
		"\2\2\2\u01bf\u01c2\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c0\u01be\3\2\2\2\u01c1"+
		"\u01c4\3\2\2\2\u01c2\u01c0\3\2\2\2\u01c3\u01c5\t\b\2\2\u01c4\u01c3\3\2"+
		"\2\2\u01c5\u01c7\3\2\2\2\u01c6\u01af\3\2\2\2\u01c6\u01ba\3\2\2\2\u01c7"+
		"\u0082\3\2\2\2\u01c8\u01cb\5_\60\2\u01c9\u01cb\5\u0081A\2\u01ca\u01c8"+
		"\3\2\2\2\u01ca\u01c9\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\u01cd\bB\2\2\u01cd"+
		"\u0084\3\2\2\2\u01ce\u01d2\5[.\2\u01cf\u01d2\5]/\2\u01d0\u01d2\t\t\2\2"+
		"\u01d1\u01ce\3\2\2\2\u01d1\u01cf\3\2\2\2\u01d1\u01d0\3\2\2\2\u01d2\u01d3"+
		"\3\2\2\2\u01d3\u01d1\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4\u0086\3\2\2\2\u01d5"+
		"\u01d6\7%\2\2\u01d6\u01d7\7k\2\2\u01d7\u01d8\7p\2\2\u01d8\u01d9\7e\2\2"+
		"\u01d9\u01da\7n\2\2\u01da\u01db\7w\2\2\u01db\u01dc\7f\2\2\u01dc\u01dd"+
		"\7g\2\2\u01dd\u01e1\3\2\2\2\u01de\u01e0\7\"\2\2\u01df\u01de\3\2\2\2\u01e0"+
		"\u01e3\3\2\2\2\u01e1\u01df\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\u01e4\3\2"+
		"\2\2\u01e3\u01e1\3\2\2\2\u01e4\u01e5\7$\2\2\u01e5\u01e6\5\u0085C\2\u01e6"+
		"\u01e7\7$\2\2\u01e7\u01e8\bD\3\2\u01e8\u0088\3\2\2\2\u01e9\u01ec\5[.\2"+
		"\u01ea\u01ec\t\n\2\2\u01eb\u01e9\3\2\2\2\u01eb\u01ea\3\2\2\2\u01ec\u01f2"+
		"\3\2\2\2\u01ed\u01f1\5[.\2\u01ee\u01f1\5]/\2\u01ef\u01f1\t\n\2\2\u01f0"+
		"\u01ed\3\2\2\2\u01f0\u01ee\3\2\2\2\u01f0\u01ef\3\2\2\2\u01f1\u01f4\3\2"+
		"\2\2\u01f2\u01f0\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3\u008a\3\2\2\2\u01f4"+
		"\u01f2\3\2\2\2\36\2\u014e\u0154\u0156\u015f\u0162\u0170\u0173\u0178\u017d"+
		"\u0183\u018c\u0190\u019a\u019c\u01a8\u01aa\u01b5\u01c0\u01c4\u01c6\u01ca"+
		"\u01d1\u01d3\u01e1\u01eb\u01f0\u01f2\4\3B\2\3D\3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}