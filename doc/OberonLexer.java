// Generated from Oberon.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class OberonLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		IDENT=60, STRING=61, INTEGER=62, REAL=63, WS=64, COMMENT=65;
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
			"T__33", "T__34", "T__35", "T__36", "T__37", "T__38", "T__39", "T__40", 
			"T__41", "T__42", "T__43", "T__44", "T__45", "T__46", "T__47", "T__48", 
			"T__49", "T__50", "T__51", "T__52", "T__53", "T__54", "T__55", "T__56", 
			"T__57", "T__58", "IDENT", "STRING", "INTEGER", "REAL", "WS", "COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "'*'", "'='", "'ARRAY'", "','", "'OF'", "'RECORD'", "'('", 
			"')'", "'END'", "';'", "':'", "'POINTER'", "'TO'", "'PROCEDURE'", "'#'", 
			"'<'", "'<='", "'>'", "'>='", "'IN'", "'IS'", "'+'", "'-'", "'OR'", "'/'", 
			"'DIV'", "'MOD'", "'&'", "'NIL'", "'TRUE'", "'FALSE'", "'~'", "'['", 
			"']'", "'^'", "'{'", "'}'", "'..'", "':='", "'IF'", "'THEN'", "'ELSIF'", 
			"'ELSE'", "'CASE'", "'|'", "'WHILE'", "'DO'", "'REPEAT'", "'UNTIL'", 
			"'FOR'", "'BY'", "'BEGIN'", "'RETURN'", "'CONST'", "'TYPE'", "'VAR'", 
			"'MODULE'", "'IMPORT'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"IDENT", "STRING", "INTEGER", "REAL", "WS", "COMMENT"
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


	public OberonLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Oberon.g4"; }

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
		"\u0004\u0000A\u01b4\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007"+
		"&\u0002\'\u0007\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007"+
		"+\u0002,\u0007,\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u0007"+
		"0\u00021\u00071\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u0007"+
		"5\u00026\u00076\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007"+
		":\u0002;\u0007;\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007"+
		"?\u0002@\u0007@\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016"+
		"\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019"+
		"\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001!\u0001!\u0001\"\u0001\"\u0001"+
		"#\u0001#\u0001$\u0001$\u0001%\u0001%\u0001&\u0001&\u0001&\u0001\'\u0001"+
		"\'\u0001\'\u0001(\u0001(\u0001(\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		"*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001+\u0001+\u0001+\u0001+\u0001"+
		"+\u0001,\u0001,\u0001,\u0001,\u0001,\u0001-\u0001-\u0001.\u0001.\u0001"+
		".\u0001.\u0001.\u0001.\u0001/\u0001/\u0001/\u00010\u00010\u00010\u0001"+
		"0\u00010\u00010\u00010\u00011\u00011\u00011\u00011\u00011\u00011\u0001"+
		"2\u00012\u00012\u00012\u00013\u00013\u00013\u00014\u00014\u00014\u0001"+
		"4\u00014\u00014\u00015\u00015\u00015\u00015\u00015\u00015\u00015\u0001"+
		"6\u00016\u00016\u00016\u00016\u00016\u00017\u00017\u00017\u00017\u0001"+
		"7\u00018\u00018\u00018\u00018\u00019\u00019\u00019\u00019\u00019\u0001"+
		"9\u00019\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001;\u0001"+
		";\u0005;\u0166\b;\n;\f;\u0169\t;\u0001<\u0001<\u0005<\u016d\b<\n<\f<\u0170"+
		"\t<\u0001<\u0001<\u0001<\u0005<\u0175\b<\n<\f<\u0178\t<\u0001<\u0003<"+
		"\u017b\b<\u0001=\u0004=\u017e\b=\u000b=\f=\u017f\u0001=\u0001=\u0005="+
		"\u0184\b=\n=\f=\u0187\t=\u0001=\u0003=\u018a\b=\u0001>\u0004>\u018d\b"+
		">\u000b>\f>\u018e\u0001>\u0001>\u0005>\u0193\b>\n>\f>\u0196\t>\u0001>"+
		"\u0001>\u0003>\u019a\b>\u0001>\u0004>\u019d\b>\u000b>\f>\u019e\u0003>"+
		"\u01a1\b>\u0001?\u0001?\u0001?\u0001?\u0001@\u0001@\u0001@\u0001@\u0005"+
		"@\u01ab\b@\n@\f@\u01ae\t@\u0001@\u0001@\u0001@\u0001@\u0001@\u0001\u01ac"+
		"\u0000A\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b"+
		"\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b"+
		"\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016"+
		"-\u0017/\u00181\u00193\u001a5\u001b7\u001c9\u001d;\u001e=\u001f? A!C\""+
		"E#G$I%K&M\'O(Q)S*U+W,Y-[.]/_0a1c2e3g4i5k6m7o8q9s:u;w<y={>}?\u007f@\u0081"+
		"A\u0001\u0000\u0007\u0002\u0000AZaz\u0003\u000009AZaz\u0001\u0000\"\""+
		"\u0001\u000009\u0002\u000009AF\u0002\u0000++--\u0003\u0000\t\n\r\r  \u01c0"+
		"\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000"+
		"\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000"+
		"\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000"+
		"\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001"+
		"\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000"+
		"\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000"+
		"\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/"+
		"\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u00003\u0001\u0000"+
		"\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u00007\u0001\u0000\u0000\u0000"+
		"\u00009\u0001\u0000\u0000\u0000\u0000;\u0001\u0000\u0000\u0000\u0000="+
		"\u0001\u0000\u0000\u0000\u0000?\u0001\u0000\u0000\u0000\u0000A\u0001\u0000"+
		"\u0000\u0000\u0000C\u0001\u0000\u0000\u0000\u0000E\u0001\u0000\u0000\u0000"+
		"\u0000G\u0001\u0000\u0000\u0000\u0000I\u0001\u0000\u0000\u0000\u0000K"+
		"\u0001\u0000\u0000\u0000\u0000M\u0001\u0000\u0000\u0000\u0000O\u0001\u0000"+
		"\u0000\u0000\u0000Q\u0001\u0000\u0000\u0000\u0000S\u0001\u0000\u0000\u0000"+
		"\u0000U\u0001\u0000\u0000\u0000\u0000W\u0001\u0000\u0000\u0000\u0000Y"+
		"\u0001\u0000\u0000\u0000\u0000[\u0001\u0000\u0000\u0000\u0000]\u0001\u0000"+
		"\u0000\u0000\u0000_\u0001\u0000\u0000\u0000\u0000a\u0001\u0000\u0000\u0000"+
		"\u0000c\u0001\u0000\u0000\u0000\u0000e\u0001\u0000\u0000\u0000\u0000g"+
		"\u0001\u0000\u0000\u0000\u0000i\u0001\u0000\u0000\u0000\u0000k\u0001\u0000"+
		"\u0000\u0000\u0000m\u0001\u0000\u0000\u0000\u0000o\u0001\u0000\u0000\u0000"+
		"\u0000q\u0001\u0000\u0000\u0000\u0000s\u0001\u0000\u0000\u0000\u0000u"+
		"\u0001\u0000\u0000\u0000\u0000w\u0001\u0000\u0000\u0000\u0000y\u0001\u0000"+
		"\u0000\u0000\u0000{\u0001\u0000\u0000\u0000\u0000}\u0001\u0000\u0000\u0000"+
		"\u0000\u007f\u0001\u0000\u0000\u0000\u0000\u0081\u0001\u0000\u0000\u0000"+
		"\u0001\u0083\u0001\u0000\u0000\u0000\u0003\u0085\u0001\u0000\u0000\u0000"+
		"\u0005\u0087\u0001\u0000\u0000\u0000\u0007\u0089\u0001\u0000\u0000\u0000"+
		"\t\u008f\u0001\u0000\u0000\u0000\u000b\u0091\u0001\u0000\u0000\u0000\r"+
		"\u0094\u0001\u0000\u0000\u0000\u000f\u009b\u0001\u0000\u0000\u0000\u0011"+
		"\u009d\u0001\u0000\u0000\u0000\u0013\u009f\u0001\u0000\u0000\u0000\u0015"+
		"\u00a3\u0001\u0000\u0000\u0000\u0017\u00a5\u0001\u0000\u0000\u0000\u0019"+
		"\u00a7\u0001\u0000\u0000\u0000\u001b\u00af\u0001\u0000\u0000\u0000\u001d"+
		"\u00b2\u0001\u0000\u0000\u0000\u001f\u00bc\u0001\u0000\u0000\u0000!\u00be"+
		"\u0001\u0000\u0000\u0000#\u00c0\u0001\u0000\u0000\u0000%\u00c3\u0001\u0000"+
		"\u0000\u0000\'\u00c5\u0001\u0000\u0000\u0000)\u00c8\u0001\u0000\u0000"+
		"\u0000+\u00cb\u0001\u0000\u0000\u0000-\u00ce\u0001\u0000\u0000\u0000/"+
		"\u00d0\u0001\u0000\u0000\u00001\u00d2\u0001\u0000\u0000\u00003\u00d5\u0001"+
		"\u0000\u0000\u00005\u00d7\u0001\u0000\u0000\u00007\u00db\u0001\u0000\u0000"+
		"\u00009\u00df\u0001\u0000\u0000\u0000;\u00e1\u0001\u0000\u0000\u0000="+
		"\u00e5\u0001\u0000\u0000\u0000?\u00ea\u0001\u0000\u0000\u0000A\u00f0\u0001"+
		"\u0000\u0000\u0000C\u00f2\u0001\u0000\u0000\u0000E\u00f4\u0001\u0000\u0000"+
		"\u0000G\u00f6\u0001\u0000\u0000\u0000I\u00f8\u0001\u0000\u0000\u0000K"+
		"\u00fa\u0001\u0000\u0000\u0000M\u00fc\u0001\u0000\u0000\u0000O\u00ff\u0001"+
		"\u0000\u0000\u0000Q\u0102\u0001\u0000\u0000\u0000S\u0105\u0001\u0000\u0000"+
		"\u0000U\u010a\u0001\u0000\u0000\u0000W\u0110\u0001\u0000\u0000\u0000Y"+
		"\u0115\u0001\u0000\u0000\u0000[\u011a\u0001\u0000\u0000\u0000]\u011c\u0001"+
		"\u0000\u0000\u0000_\u0122\u0001\u0000\u0000\u0000a\u0125\u0001\u0000\u0000"+
		"\u0000c\u012c\u0001\u0000\u0000\u0000e\u0132\u0001\u0000\u0000\u0000g"+
		"\u0136\u0001\u0000\u0000\u0000i\u0139\u0001\u0000\u0000\u0000k\u013f\u0001"+
		"\u0000\u0000\u0000m\u0146\u0001\u0000\u0000\u0000o\u014c\u0001\u0000\u0000"+
		"\u0000q\u0151\u0001\u0000\u0000\u0000s\u0155\u0001\u0000\u0000\u0000u"+
		"\u015c\u0001\u0000\u0000\u0000w\u0163\u0001\u0000\u0000\u0000y\u017a\u0001"+
		"\u0000\u0000\u0000{\u0189\u0001\u0000\u0000\u0000}\u018c\u0001\u0000\u0000"+
		"\u0000\u007f\u01a2\u0001\u0000\u0000\u0000\u0081\u01a6\u0001\u0000\u0000"+
		"\u0000\u0083\u0084\u0005.\u0000\u0000\u0084\u0002\u0001\u0000\u0000\u0000"+
		"\u0085\u0086\u0005*\u0000\u0000\u0086\u0004\u0001\u0000\u0000\u0000\u0087"+
		"\u0088\u0005=\u0000\u0000\u0088\u0006\u0001\u0000\u0000\u0000\u0089\u008a"+
		"\u0005A\u0000\u0000\u008a\u008b\u0005R\u0000\u0000\u008b\u008c\u0005R"+
		"\u0000\u0000\u008c\u008d\u0005A\u0000\u0000\u008d\u008e\u0005Y\u0000\u0000"+
		"\u008e\b\u0001\u0000\u0000\u0000\u008f\u0090\u0005,\u0000\u0000\u0090"+
		"\n\u0001\u0000\u0000\u0000\u0091\u0092\u0005O\u0000\u0000\u0092\u0093"+
		"\u0005F\u0000\u0000\u0093\f\u0001\u0000\u0000\u0000\u0094\u0095\u0005"+
		"R\u0000\u0000\u0095\u0096\u0005E\u0000\u0000\u0096\u0097\u0005C\u0000"+
		"\u0000\u0097\u0098\u0005O\u0000\u0000\u0098\u0099\u0005R\u0000\u0000\u0099"+
		"\u009a\u0005D\u0000\u0000\u009a\u000e\u0001\u0000\u0000\u0000\u009b\u009c"+
		"\u0005(\u0000\u0000\u009c\u0010\u0001\u0000\u0000\u0000\u009d\u009e\u0005"+
		")\u0000\u0000\u009e\u0012\u0001\u0000\u0000\u0000\u009f\u00a0\u0005E\u0000"+
		"\u0000\u00a0\u00a1\u0005N\u0000\u0000\u00a1\u00a2\u0005D\u0000\u0000\u00a2"+
		"\u0014\u0001\u0000\u0000\u0000\u00a3\u00a4\u0005;\u0000\u0000\u00a4\u0016"+
		"\u0001\u0000\u0000\u0000\u00a5\u00a6\u0005:\u0000\u0000\u00a6\u0018\u0001"+
		"\u0000\u0000\u0000\u00a7\u00a8\u0005P\u0000\u0000\u00a8\u00a9\u0005O\u0000"+
		"\u0000\u00a9\u00aa\u0005I\u0000\u0000\u00aa\u00ab\u0005N\u0000\u0000\u00ab"+
		"\u00ac\u0005T\u0000\u0000\u00ac\u00ad\u0005E\u0000\u0000\u00ad\u00ae\u0005"+
		"R\u0000\u0000\u00ae\u001a\u0001\u0000\u0000\u0000\u00af\u00b0\u0005T\u0000"+
		"\u0000\u00b0\u00b1\u0005O\u0000\u0000\u00b1\u001c\u0001\u0000\u0000\u0000"+
		"\u00b2\u00b3\u0005P\u0000\u0000\u00b3\u00b4\u0005R\u0000\u0000\u00b4\u00b5"+
		"\u0005O\u0000\u0000\u00b5\u00b6\u0005C\u0000\u0000\u00b6\u00b7\u0005E"+
		"\u0000\u0000\u00b7\u00b8\u0005D\u0000\u0000\u00b8\u00b9\u0005U\u0000\u0000"+
		"\u00b9\u00ba\u0005R\u0000\u0000\u00ba\u00bb\u0005E\u0000\u0000\u00bb\u001e"+
		"\u0001\u0000\u0000\u0000\u00bc\u00bd\u0005#\u0000\u0000\u00bd \u0001\u0000"+
		"\u0000\u0000\u00be\u00bf\u0005<\u0000\u0000\u00bf\"\u0001\u0000\u0000"+
		"\u0000\u00c0\u00c1\u0005<\u0000\u0000\u00c1\u00c2\u0005=\u0000\u0000\u00c2"+
		"$\u0001\u0000\u0000\u0000\u00c3\u00c4\u0005>\u0000\u0000\u00c4&\u0001"+
		"\u0000\u0000\u0000\u00c5\u00c6\u0005>\u0000\u0000\u00c6\u00c7\u0005=\u0000"+
		"\u0000\u00c7(\u0001\u0000\u0000\u0000\u00c8\u00c9\u0005I\u0000\u0000\u00c9"+
		"\u00ca\u0005N\u0000\u0000\u00ca*\u0001\u0000\u0000\u0000\u00cb\u00cc\u0005"+
		"I\u0000\u0000\u00cc\u00cd\u0005S\u0000\u0000\u00cd,\u0001\u0000\u0000"+
		"\u0000\u00ce\u00cf\u0005+\u0000\u0000\u00cf.\u0001\u0000\u0000\u0000\u00d0"+
		"\u00d1\u0005-\u0000\u0000\u00d10\u0001\u0000\u0000\u0000\u00d2\u00d3\u0005"+
		"O\u0000\u0000\u00d3\u00d4\u0005R\u0000\u0000\u00d42\u0001\u0000\u0000"+
		"\u0000\u00d5\u00d6\u0005/\u0000\u0000\u00d64\u0001\u0000\u0000\u0000\u00d7"+
		"\u00d8\u0005D\u0000\u0000\u00d8\u00d9\u0005I\u0000\u0000\u00d9\u00da\u0005"+
		"V\u0000\u0000\u00da6\u0001\u0000\u0000\u0000\u00db\u00dc\u0005M\u0000"+
		"\u0000\u00dc\u00dd\u0005O\u0000\u0000\u00dd\u00de\u0005D\u0000\u0000\u00de"+
		"8\u0001\u0000\u0000\u0000\u00df\u00e0\u0005&\u0000\u0000\u00e0:\u0001"+
		"\u0000\u0000\u0000\u00e1\u00e2\u0005N\u0000\u0000\u00e2\u00e3\u0005I\u0000"+
		"\u0000\u00e3\u00e4\u0005L\u0000\u0000\u00e4<\u0001\u0000\u0000\u0000\u00e5"+
		"\u00e6\u0005T\u0000\u0000\u00e6\u00e7\u0005R\u0000\u0000\u00e7\u00e8\u0005"+
		"U\u0000\u0000\u00e8\u00e9\u0005E\u0000\u0000\u00e9>\u0001\u0000\u0000"+
		"\u0000\u00ea\u00eb\u0005F\u0000\u0000\u00eb\u00ec\u0005A\u0000\u0000\u00ec"+
		"\u00ed\u0005L\u0000\u0000\u00ed\u00ee\u0005S\u0000\u0000\u00ee\u00ef\u0005"+
		"E\u0000\u0000\u00ef@\u0001\u0000\u0000\u0000\u00f0\u00f1\u0005~\u0000"+
		"\u0000\u00f1B\u0001\u0000\u0000\u0000\u00f2\u00f3\u0005[\u0000\u0000\u00f3"+
		"D\u0001\u0000\u0000\u0000\u00f4\u00f5\u0005]\u0000\u0000\u00f5F\u0001"+
		"\u0000\u0000\u0000\u00f6\u00f7\u0005^\u0000\u0000\u00f7H\u0001\u0000\u0000"+
		"\u0000\u00f8\u00f9\u0005{\u0000\u0000\u00f9J\u0001\u0000\u0000\u0000\u00fa"+
		"\u00fb\u0005}\u0000\u0000\u00fbL\u0001\u0000\u0000\u0000\u00fc\u00fd\u0005"+
		".\u0000\u0000\u00fd\u00fe\u0005.\u0000\u0000\u00feN\u0001\u0000\u0000"+
		"\u0000\u00ff\u0100\u0005:\u0000\u0000\u0100\u0101\u0005=\u0000\u0000\u0101"+
		"P\u0001\u0000\u0000\u0000\u0102\u0103\u0005I\u0000\u0000\u0103\u0104\u0005"+
		"F\u0000\u0000\u0104R\u0001\u0000\u0000\u0000\u0105\u0106\u0005T\u0000"+
		"\u0000\u0106\u0107\u0005H\u0000\u0000\u0107\u0108\u0005E\u0000\u0000\u0108"+
		"\u0109\u0005N\u0000\u0000\u0109T\u0001\u0000\u0000\u0000\u010a\u010b\u0005"+
		"E\u0000\u0000\u010b\u010c\u0005L\u0000\u0000\u010c\u010d\u0005S\u0000"+
		"\u0000\u010d\u010e\u0005I\u0000\u0000\u010e\u010f\u0005F\u0000\u0000\u010f"+
		"V\u0001\u0000\u0000\u0000\u0110\u0111\u0005E\u0000\u0000\u0111\u0112\u0005"+
		"L\u0000\u0000\u0112\u0113\u0005S\u0000\u0000\u0113\u0114\u0005E\u0000"+
		"\u0000\u0114X\u0001\u0000\u0000\u0000\u0115\u0116\u0005C\u0000\u0000\u0116"+
		"\u0117\u0005A\u0000\u0000\u0117\u0118\u0005S\u0000\u0000\u0118\u0119\u0005"+
		"E\u0000\u0000\u0119Z\u0001\u0000\u0000\u0000\u011a\u011b\u0005|\u0000"+
		"\u0000\u011b\\\u0001\u0000\u0000\u0000\u011c\u011d\u0005W\u0000\u0000"+
		"\u011d\u011e\u0005H\u0000\u0000\u011e\u011f\u0005I\u0000\u0000\u011f\u0120"+
		"\u0005L\u0000\u0000\u0120\u0121\u0005E\u0000\u0000\u0121^\u0001\u0000"+
		"\u0000\u0000\u0122\u0123\u0005D\u0000\u0000\u0123\u0124\u0005O\u0000\u0000"+
		"\u0124`\u0001\u0000\u0000\u0000\u0125\u0126\u0005R\u0000\u0000\u0126\u0127"+
		"\u0005E\u0000\u0000\u0127\u0128\u0005P\u0000\u0000\u0128\u0129\u0005E"+
		"\u0000\u0000\u0129\u012a\u0005A\u0000\u0000\u012a\u012b\u0005T\u0000\u0000"+
		"\u012bb\u0001\u0000\u0000\u0000\u012c\u012d\u0005U\u0000\u0000\u012d\u012e"+
		"\u0005N\u0000\u0000\u012e\u012f\u0005T\u0000\u0000\u012f\u0130\u0005I"+
		"\u0000\u0000\u0130\u0131\u0005L\u0000\u0000\u0131d\u0001\u0000\u0000\u0000"+
		"\u0132\u0133\u0005F\u0000\u0000\u0133\u0134\u0005O\u0000\u0000\u0134\u0135"+
		"\u0005R\u0000\u0000\u0135f\u0001\u0000\u0000\u0000\u0136\u0137\u0005B"+
		"\u0000\u0000\u0137\u0138\u0005Y\u0000\u0000\u0138h\u0001\u0000\u0000\u0000"+
		"\u0139\u013a\u0005B\u0000\u0000\u013a\u013b\u0005E\u0000\u0000\u013b\u013c"+
		"\u0005G\u0000\u0000\u013c\u013d\u0005I\u0000\u0000\u013d\u013e\u0005N"+
		"\u0000\u0000\u013ej\u0001\u0000\u0000\u0000\u013f\u0140\u0005R\u0000\u0000"+
		"\u0140\u0141\u0005E\u0000\u0000\u0141\u0142\u0005T\u0000\u0000\u0142\u0143"+
		"\u0005U\u0000\u0000\u0143\u0144\u0005R\u0000\u0000\u0144\u0145\u0005N"+
		"\u0000\u0000\u0145l\u0001\u0000\u0000\u0000\u0146\u0147\u0005C\u0000\u0000"+
		"\u0147\u0148\u0005O\u0000\u0000\u0148\u0149\u0005N\u0000\u0000\u0149\u014a"+
		"\u0005S\u0000\u0000\u014a\u014b\u0005T\u0000\u0000\u014bn\u0001\u0000"+
		"\u0000\u0000\u014c\u014d\u0005T\u0000\u0000\u014d\u014e\u0005Y\u0000\u0000"+
		"\u014e\u014f\u0005P\u0000\u0000\u014f\u0150\u0005E\u0000\u0000\u0150p"+
		"\u0001\u0000\u0000\u0000\u0151\u0152\u0005V\u0000\u0000\u0152\u0153\u0005"+
		"A\u0000\u0000\u0153\u0154\u0005R\u0000\u0000\u0154r\u0001\u0000\u0000"+
		"\u0000\u0155\u0156\u0005M\u0000\u0000\u0156\u0157\u0005O\u0000\u0000\u0157"+
		"\u0158\u0005D\u0000\u0000\u0158\u0159\u0005U\u0000\u0000\u0159\u015a\u0005"+
		"L\u0000\u0000\u015a\u015b\u0005E\u0000\u0000\u015bt\u0001\u0000\u0000"+
		"\u0000\u015c\u015d\u0005I\u0000\u0000\u015d\u015e\u0005M\u0000\u0000\u015e"+
		"\u015f\u0005P\u0000\u0000\u015f\u0160\u0005O\u0000\u0000\u0160\u0161\u0005"+
		"R\u0000\u0000\u0161\u0162\u0005T\u0000\u0000\u0162v\u0001\u0000\u0000"+
		"\u0000\u0163\u0167\u0007\u0000\u0000\u0000\u0164\u0166\u0007\u0001\u0000"+
		"\u0000\u0165\u0164\u0001\u0000\u0000\u0000\u0166\u0169\u0001\u0000\u0000"+
		"\u0000\u0167\u0165\u0001\u0000\u0000\u0000\u0167\u0168\u0001\u0000\u0000"+
		"\u0000\u0168x\u0001\u0000\u0000\u0000\u0169\u0167\u0001\u0000\u0000\u0000"+
		"\u016a\u016e\u0007\u0002\u0000\u0000\u016b\u016d\b\u0002\u0000\u0000\u016c"+
		"\u016b\u0001\u0000\u0000\u0000\u016d\u0170\u0001\u0000\u0000\u0000\u016e"+
		"\u016c\u0001\u0000\u0000\u0000\u016e\u016f\u0001\u0000\u0000\u0000\u016f"+
		"\u0171\u0001\u0000\u0000\u0000\u0170\u016e\u0001\u0000\u0000\u0000\u0171"+
		"\u017b\u0007\u0002\u0000\u0000\u0172\u0176\u0007\u0003\u0000\u0000\u0173"+
		"\u0175\u0007\u0004\u0000\u0000\u0174\u0173\u0001\u0000\u0000\u0000\u0175"+
		"\u0178\u0001\u0000\u0000\u0000\u0176\u0174\u0001\u0000\u0000\u0000\u0176"+
		"\u0177\u0001\u0000\u0000\u0000\u0177\u0179\u0001\u0000\u0000\u0000\u0178"+
		"\u0176\u0001\u0000\u0000\u0000\u0179\u017b\u0005X\u0000\u0000\u017a\u016a"+
		"\u0001\u0000\u0000\u0000\u017a\u0172\u0001\u0000\u0000\u0000\u017bz\u0001"+
		"\u0000\u0000\u0000\u017c\u017e\u0007\u0003\u0000\u0000\u017d\u017c\u0001"+
		"\u0000\u0000\u0000\u017e\u017f\u0001\u0000\u0000\u0000\u017f\u017d\u0001"+
		"\u0000\u0000\u0000\u017f\u0180\u0001\u0000\u0000\u0000\u0180\u018a\u0001"+
		"\u0000\u0000\u0000\u0181\u0185\u0007\u0003\u0000\u0000\u0182\u0184\u0007"+
		"\u0004\u0000\u0000\u0183\u0182\u0001\u0000\u0000\u0000\u0184\u0187\u0001"+
		"\u0000\u0000\u0000\u0185\u0183\u0001\u0000\u0000\u0000\u0185\u0186\u0001"+
		"\u0000\u0000\u0000\u0186\u0188\u0001\u0000\u0000\u0000\u0187\u0185\u0001"+
		"\u0000\u0000\u0000\u0188\u018a\u0005H\u0000\u0000\u0189\u017d\u0001\u0000"+
		"\u0000\u0000\u0189\u0181\u0001\u0000\u0000\u0000\u018a|\u0001\u0000\u0000"+
		"\u0000\u018b\u018d\u0007\u0003\u0000\u0000\u018c\u018b\u0001\u0000\u0000"+
		"\u0000\u018d\u018e\u0001\u0000\u0000\u0000\u018e\u018c\u0001\u0000\u0000"+
		"\u0000\u018e\u018f\u0001\u0000\u0000\u0000\u018f\u0190\u0001\u0000\u0000"+
		"\u0000\u0190\u0194\u0005.\u0000\u0000\u0191\u0193\u0007\u0003\u0000\u0000"+
		"\u0192\u0191\u0001\u0000\u0000\u0000\u0193\u0196\u0001\u0000\u0000\u0000"+
		"\u0194\u0192\u0001\u0000\u0000\u0000\u0194\u0195\u0001\u0000\u0000\u0000"+
		"\u0195\u01a0\u0001\u0000\u0000\u0000\u0196\u0194\u0001\u0000\u0000\u0000"+
		"\u0197\u0199\u0005E\u0000\u0000\u0198\u019a\u0007\u0005\u0000\u0000\u0199"+
		"\u0198\u0001\u0000\u0000\u0000\u0199\u019a\u0001\u0000\u0000\u0000\u019a"+
		"\u019c\u0001\u0000\u0000\u0000\u019b\u019d\u0007\u0003\u0000\u0000\u019c"+
		"\u019b\u0001\u0000\u0000\u0000\u019d\u019e\u0001\u0000\u0000\u0000\u019e"+
		"\u019c\u0001\u0000\u0000\u0000\u019e\u019f\u0001\u0000\u0000\u0000\u019f"+
		"\u01a1\u0001\u0000\u0000\u0000\u01a0\u0197\u0001\u0000\u0000\u0000\u01a0"+
		"\u01a1\u0001\u0000\u0000\u0000\u01a1~\u0001\u0000\u0000\u0000\u01a2\u01a3"+
		"\u0007\u0006\u0000\u0000\u01a3\u01a4\u0001\u0000\u0000\u0000\u01a4\u01a5"+
		"\u0006?\u0000\u0000\u01a5\u0080\u0001\u0000\u0000\u0000\u01a6\u01a7\u0005"+
		"(\u0000\u0000\u01a7\u01a8\u0005*\u0000\u0000\u01a8\u01ac\u0001\u0000\u0000"+
		"\u0000\u01a9\u01ab\t\u0000\u0000\u0000\u01aa\u01a9\u0001\u0000\u0000\u0000"+
		"\u01ab\u01ae\u0001\u0000\u0000\u0000\u01ac\u01ad\u0001\u0000\u0000\u0000"+
		"\u01ac\u01aa\u0001\u0000\u0000\u0000\u01ad\u01af\u0001\u0000\u0000\u0000"+
		"\u01ae\u01ac\u0001\u0000\u0000\u0000\u01af\u01b0\u0005*\u0000\u0000\u01b0"+
		"\u01b1\u0005)\u0000\u0000\u01b1\u01b2\u0001\u0000\u0000\u0000\u01b2\u01b3"+
		"\u0006@\u0000\u0000\u01b3\u0082\u0001\u0000\u0000\u0000\u000e\u0000\u0167"+
		"\u016e\u0176\u017a\u017f\u0185\u0189\u018e\u0194\u0199\u019e\u01a0\u01ac"+
		"\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}