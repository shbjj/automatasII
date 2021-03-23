/* The following code was generated by JFlex 1.4.3 on 23/03/21 09:31 AM */

package codigo;
import static codigo.Tokens.*;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 23/03/21 09:31 AM from the specification file
 * <tt>src/codigo/Lexer.flex</tt>
 */
class Lexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\3\1\26\2\0\1\3\22\0\1\3\2\0\1\40\6\0"+
    "\1\27\1\36\1\33\1\37\1\35\1\25\12\2\1\41\1\34\1\32"+
    "\1\31\1\30\2\0\1\50\1\1\1\44\1\43\1\53\2\1\1\52"+
    "\1\55\2\1\1\51\1\1\1\45\1\42\1\56\1\1\1\57\1\46"+
    "\1\47\1\60\1\1\1\54\3\1\4\0\1\61\1\0\1\12\1\1"+
    "\1\4\1\16\1\15\1\22\1\1\1\23\1\21\2\1\1\20\1\1"+
    "\1\6\1\5\1\14\1\1\1\13\1\7\1\10\1\17\1\11\1\24"+
    "\3\1\uff85\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\10\2\1\5\1\4"+
    "\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15"+
    "\1\16\1\17\1\1\5\2\1\1\6\0\7\2\1\20"+
    "\1\3\5\20\1\21\1\20\1\0\20\2\1\0\17\2"+
    "\2\22\1\0\10\2\1\4\1\23\1\24\1\25\1\26"+
    "\11\2\3\0\1\27\3\0\3\2\1\27\3\2\3\20"+
    "\1\27\3\20\6\2\1\22\1\30\10\2\2\0\4\2"+
    "\1\0\1\31\1\0\1\30\2\0\1\2\1\31\3\2"+
    "\1\20\1\31\1\20\1\30\2\20\3\2\2\22\2\2"+
    "\1\32\1\2\1\4\4\2\1\33\1\0\1\32\1\0"+
    "\1\33\2\2\1\33\1\20\1\32\1\20\1\22\2\2"+
    "\1\22\2\2\2\0\2\2\2\20\4\2\2\0\2\2"+
    "\2\20\4\2\2\0\2\2\2\20\3\2\3\34";

  private static int [] zzUnpackAction() {
    int [] result = new int[235];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\62\0\144\0\226\0\310\0\372\0\u012c\0\u015e"+
    "\0\u0190\0\u01c2\0\u01f4\0\u0226\0\u0258\0\u028a\0\u02bc\0\62"+
    "\0\u02ee\0\62\0\u0320\0\62\0\62\0\62\0\62\0\62"+
    "\0\62\0\u0352\0\u0384\0\u03b6\0\u03e8\0\u041a\0\u044c\0\u047e"+
    "\0\u04b0\0\u04e2\0\u0514\0\u0546\0\u0578\0\u05aa\0\u05dc\0\u060e"+
    "\0\u0640\0\u0672\0\u06a4\0\u06d6\0\u0708\0\u073a\0\u076c\0\u079e"+
    "\0\u07d0\0\u0802\0\u0834\0\u0866\0\u0898\0\u08ca\0\u08fc\0\u092e"+
    "\0\u0960\0\u0992\0\u09c4\0\u09f6\0\u0a28\0\u0a5a\0\u0a8c\0\u0abe"+
    "\0\u0af0\0\u0b22\0\u0b54\0\u0b86\0\u0bb8\0\u0bea\0\u0c1c\0\u0c4e"+
    "\0\u0c80\0\u0cb2\0\u0ce4\0\u0d16\0\u0d48\0\u0d7a\0\u0dac\0\u0dde"+
    "\0\u0e10\0\u0e42\0\u0e74\0\u0ea6\0\u0ed8\0\u0f0a\0\u0f3c\0\u060e"+
    "\0\u05dc\0\u0f6e\0\u0fa0\0\u0fd2\0\u1004\0\u1036\0\u1068\0\u109a"+
    "\0\u10cc\0\u10fe\0\u1130\0\u1162\0\u1194\0\u1194\0\u1194\0\u11c6"+
    "\0\u11f8\0\u122a\0\u125c\0\u128e\0\u12c0\0\u12f2\0\u1324\0\u1356"+
    "\0\u1388\0\u13ba\0\u13ec\0\u1194\0\u141e\0\u1450\0\u1482\0\u14b4"+
    "\0\u14e6\0\u1518\0\u05dc\0\u154a\0\u157c\0\u15ae\0\u15e0\0\u1612"+
    "\0\u1644\0\u073a\0\u1676\0\u16a8\0\u16da\0\u170c\0\u173e\0\u1770"+
    "\0\u17a2\0\u17d4\0\u1806\0\u1838\0\u05dc\0\u186a\0\u189c\0\u18ce"+
    "\0\u1900\0\u1932\0\u1964\0\u1996\0\u19c8\0\u19fa\0\u1a2c\0\u1a5e"+
    "\0\u1a90\0\u1ac2\0\u1af4\0\u1b26\0\u1194\0\u1b58\0\u1194\0\u1b8a"+
    "\0\u1bbc\0\u1bee\0\u05dc\0\u1c20\0\u1c52\0\u1c84\0\u1cb6\0\u073a"+
    "\0\u1ce8\0\u073a\0\u1d1a\0\u1d4c\0\u1d7e\0\u1db0\0\u1de2\0\u1e14"+
    "\0\u1e46\0\u1e78\0\u1eaa\0\u05dc\0\u1edc\0\u1194\0\u1f0e\0\u1f40"+
    "\0\u1f72\0\u1fa4\0\u1194\0\u1fd6\0\u1194\0\u2008\0\u05dc\0\u203a"+
    "\0\u206c\0\u073a\0\u209e\0\u073a\0\u20d0\0\u2102\0\u2134\0\u2166"+
    "\0\u2198\0\u21ca\0\u21fc\0\u222e\0\u2260\0\u2292\0\u22c4\0\u22f6"+
    "\0\u2328\0\u235a\0\u238c\0\u23be\0\u23f0\0\u2422\0\u2454\0\u2486"+
    "\0\u24b8\0\u24ea\0\u251c\0\u254e\0\u2580\0\u25b2\0\u25e4\0\u2616"+
    "\0\u2648\0\u267a\0\u26ac\0\u26de\0\u2710\0\u2742\0\u2774\0\u27a6"+
    "\0\u1194\0\u05dc\0\u073a";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[235];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\6\1\7\2\3\1\10"+
    "\1\11\2\3\1\12\1\3\1\13\2\3\1\14\2\3"+
    "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24"+
    "\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\3"+
    "\1\34\2\3\1\35\4\3\1\36\1\3\1\37\2\3"+
    "\1\40\5\0\1\41\4\0\1\42\1\43\2\0\1\44"+
    "\4\0\1\45\33\0\1\46\3\0\2\47\1\0\1\47"+
    "\1\50\4\47\1\51\1\52\2\47\1\53\4\47\1\54"+
    "\1\47\15\0\15\47\1\55\2\47\1\0\1\56\1\57"+
    "\1\0\1\56\1\60\4\56\1\61\1\62\2\56\1\63"+
    "\4\56\1\64\1\56\10\0\1\65\4\0\15\56\1\66"+
    "\1\56\4\0\1\17\1\0\1\41\4\0\1\42\1\43"+
    "\2\0\1\44\4\0\1\45\2\0\1\17\30\0\1\46"+
    "\2\0\1\67\2\70\1\67\1\70\1\71\4\70\1\72"+
    "\1\73\2\70\1\74\4\70\1\75\1\70\1\67\1\0"+
    "\13\67\1\76\5\70\1\77\6\70\1\100\2\70\1\44"+
    "\2\53\1\44\1\53\1\101\4\53\1\102\1\103\2\53"+
    "\1\104\4\53\1\105\1\53\1\44\1\0\13\44\1\53"+
    "\1\106\13\53\1\107\2\53\1\110\2\111\1\110\1\111"+
    "\1\112\4\111\1\113\1\114\1\111\1\115\1\116\4\111"+
    "\1\117\1\111\1\110\1\0\13\110\10\111\1\120\4\111"+
    "\1\121\2\111\1\0\2\47\1\0\1\47\1\50\4\47"+
    "\1\122\1\52\2\47\1\53\4\47\1\54\1\47\15\0"+
    "\15\47\1\55\2\47\1\43\2\52\1\43\1\52\1\123"+
    "\4\52\1\124\1\125\2\52\1\103\4\52\1\126\1\52"+
    "\1\43\1\0\13\43\15\52\1\127\2\52\1\0\2\47"+
    "\1\0\1\47\1\130\4\47\1\51\1\52\2\47\1\53"+
    "\4\47\1\54\1\47\15\0\15\47\1\55\2\47\1\0"+
    "\2\47\1\0\1\47\1\50\4\47\1\51\1\52\2\47"+
    "\1\53\3\47\1\131\1\54\1\47\15\0\15\47\1\55"+
    "\2\47\1\132\2\133\1\132\1\133\1\134\4\133\1\135"+
    "\1\136\2\133\1\137\2\133\1\140\1\133\1\141\1\133"+
    "\1\132\1\0\13\132\15\133\1\142\2\133\5\0\1\41"+
    "\4\0\1\42\1\43\2\0\1\44\4\0\1\45\1\0"+
    "\1\143\1\0\1\144\27\0\1\46\5\0\1\17\22\0"+
    "\1\17\40\0\1\41\4\0\1\42\1\43\2\0\1\44"+
    "\4\0\1\45\5\0\1\145\25\0\1\46\7\0\1\41"+
    "\4\0\1\42\1\43\2\0\1\44\4\0\1\45\5\0"+
    "\1\146\25\0\1\46\7\0\1\41\4\0\1\42\1\43"+
    "\2\0\1\44\4\0\1\45\5\0\1\147\25\0\1\46"+
    "\3\0\2\47\1\0\1\47\1\50\4\47\1\51\1\52"+
    "\2\47\1\53\4\47\1\54\1\47\15\0\1\47\1\106"+
    "\13\47\1\55\2\47\1\0\2\47\1\0\1\47\1\150"+
    "\4\47\1\151\1\52\2\47\1\53\4\47\1\54\1\47"+
    "\15\0\1\150\5\47\1\151\6\47\1\55\2\47\1\0"+
    "\2\47\1\0\1\47\1\50\4\47\1\51\1\52\2\47"+
    "\1\53\4\47\1\152\1\47\15\0\10\47\1\120\4\47"+
    "\1\55\2\47\1\0\2\47\1\0\1\47\1\50\4\47"+
    "\1\51\1\52\2\47\1\53\4\47\1\54\1\47\15\0"+
    "\10\47\1\153\4\47\1\55\2\47\1\46\2\55\1\46"+
    "\1\55\1\154\4\55\1\155\1\156\2\55\1\107\4\55"+
    "\1\157\1\55\1\46\1\0\13\46\15\55\1\160\2\55"+
    "\1\0\2\56\1\0\1\56\1\60\4\56\1\61\1\62"+
    "\2\56\1\63\4\56\1\64\1\56\15\0\15\56\1\66"+
    "\2\56\6\0\1\161\73\0\1\162\46\0\1\163\72\0"+
    "\1\164\60\0\1\165\3\0\1\166\102\0\1\167\20\0"+
    "\2\47\1\0\21\47\15\0\20\47\1\0\2\47\1\0"+
    "\2\47\1\170\16\47\15\0\20\47\1\0\2\47\1\0"+
    "\14\47\1\171\4\47\15\0\20\47\1\0\2\47\1\0"+
    "\1\47\1\172\17\47\15\0\20\47\1\0\2\47\1\0"+
    "\12\47\1\173\6\47\15\0\20\47\1\0\2\47\1\0"+
    "\11\47\1\174\3\47\1\175\3\47\15\0\20\47\1\0"+
    "\2\47\1\0\21\47\15\0\1\176\17\47\1\0\2\56"+
    "\1\0\21\56\15\0\20\56\1\0\1\56\1\57\1\0"+
    "\21\56\10\0\1\65\4\0\17\56\2\0\2\56\1\0"+
    "\2\56\1\177\16\56\15\0\20\56\1\0\2\56\1\0"+
    "\14\56\1\200\4\56\15\0\20\56\1\0\2\56\1\0"+
    "\1\56\1\201\17\56\15\0\20\56\1\0\2\56\1\0"+
    "\12\56\1\202\6\56\15\0\20\56\1\0\2\56\1\0"+
    "\11\56\1\203\3\56\1\204\3\56\15\0\20\56\2\0"+
    "\1\65\32\0\1\65\25\0\2\56\1\0\21\56\15\0"+
    "\1\205\17\56\6\0\1\161\11\0\1\162\42\0\2\47"+
    "\1\0\2\47\1\170\11\47\1\171\4\47\15\0\20\47"+
    "\1\161\2\170\1\161\2\170\1\206\1\207\10\170\1\210"+
    "\4\170\1\161\1\0\13\161\3\170\1\211\14\170\1\162"+
    "\2\171\1\162\2\171\1\210\11\171\1\212\4\171\1\162"+
    "\1\0\13\162\7\171\1\213\10\171\1\0\2\47\1\0"+
    "\1\47\1\172\1\170\11\47\1\171\4\47\15\0\20\47"+
    "\1\0\2\47\1\0\2\47\1\170\7\47\1\173\1\47"+
    "\1\171\4\47\15\0\20\47\1\0\2\47\1\0\2\47"+
    "\1\170\6\47\1\174\2\47\1\171\1\175\3\47\15\0"+
    "\20\47\1\0\2\47\1\0\2\47\1\211\11\47\1\171"+
    "\4\47\15\0\3\47\1\211\14\47\1\0\2\47\1\0"+
    "\2\47\1\170\11\47\1\213\4\47\15\0\7\47\1\213"+
    "\10\47\1\0\2\47\1\0\2\47\1\170\11\47\1\171"+
    "\4\47\15\0\1\176\17\47\1\0\2\47\1\0\2\47"+
    "\1\170\7\47\1\173\6\47\15\0\20\47\1\0\2\47"+
    "\1\0\12\47\1\173\1\47\1\171\4\47\15\0\20\47"+
    "\1\0\2\47\1\0\1\47\1\172\10\47\1\173\6\47"+
    "\15\0\20\47\1\164\2\173\1\164\12\173\1\214\6\173"+
    "\1\164\1\0\13\164\20\173\1\0\2\47\1\0\11\47"+
    "\1\174\1\173\2\47\1\175\3\47\15\0\20\47\1\0"+
    "\2\47\1\0\12\47\1\173\6\47\15\0\1\47\1\173"+
    "\16\47\1\0\2\47\1\0\12\47\1\173\6\47\15\0"+
    "\1\176\17\47\15\0\1\165\45\0\2\47\1\0\11\47"+
    "\1\174\7\47\15\0\20\47\1\0\2\47\1\0\2\47"+
    "\1\170\6\47\1\174\7\47\15\0\20\47\1\0\2\47"+
    "\1\0\11\47\1\174\2\47\1\171\4\47\15\0\20\47"+
    "\1\0\2\47\1\0\1\47\1\172\7\47\1\174\7\47"+
    "\15\0\20\47\1\0\2\47\1\0\2\47\1\215\6\47"+
    "\1\174\5\47\1\174\1\47\15\0\20\47\1\0\2\47"+
    "\1\0\11\47\1\174\1\173\6\47\15\0\20\47\1\165"+
    "\2\174\1\165\11\174\1\216\3\174\1\217\3\174\1\165"+
    "\1\0\13\165\11\174\1\220\6\174\1\0\2\47\1\0"+
    "\11\47\1\220\7\47\15\0\11\47\1\220\6\47\1\0"+
    "\2\47\1\0\11\47\1\174\7\47\15\0\1\176\17\47"+
    "\1\0\2\47\1\0\7\47\1\131\4\47\1\171\4\47"+
    "\15\0\20\47\1\0\2\47\1\0\1\47\1\172\1\170"+
    "\16\47\15\0\20\47\1\0\2\47\1\0\1\47\1\172"+
    "\12\47\1\171\4\47\15\0\20\47\1\163\2\172\1\163"+
    "\1\172\1\221\17\172\1\163\1\0\13\163\1\222\17\172"+
    "\1\0\2\47\1\0\1\47\1\172\7\47\1\174\3\47"+
    "\1\175\3\47\15\0\20\47\1\0\2\47\1\0\1\47"+
    "\1\222\17\47\15\0\1\223\17\47\21\0\1\166\41\0"+
    "\2\47\1\0\15\47\1\175\3\47\15\0\20\47\1\0"+
    "\2\47\1\0\2\47\1\170\12\47\1\175\3\47\15\0"+
    "\20\47\1\0\2\47\1\0\14\47\1\171\1\175\3\47"+
    "\15\0\20\47\1\0\2\47\1\0\1\47\1\172\13\47"+
    "\1\175\3\47\15\0\20\47\1\0\2\47\1\0\12\47"+
    "\1\173\2\47\1\175\3\47\15\0\20\47\1\0\2\47"+
    "\1\0\14\47\1\224\1\175\1\47\1\175\1\47\15\0"+
    "\20\47\1\166\2\175\1\166\11\175\1\217\3\175\1\225"+
    "\3\175\1\166\1\0\13\166\20\175\1\0\2\47\1\0"+
    "\15\47\1\175\3\47\15\0\1\176\17\47\26\143\1\0"+
    "\33\143\1\226\24\144\1\226\1\144\1\227\12\226\17\144"+
    "\1\226\63\0\2\47\1\0\2\47\1\211\16\47\15\0"+
    "\3\47\1\211\14\47\1\0\2\47\1\0\14\47\1\213"+
    "\4\47\15\0\7\47\1\213\10\47\1\0\2\47\1\0"+
    "\11\47\1\220\3\47\1\175\3\47\15\0\11\47\1\220"+
    "\6\47\1\0\2\47\1\0\21\47\15\0\13\47\1\230"+
    "\4\47\1\0\2\47\1\0\2\47\1\170\16\47\15\0"+
    "\1\176\17\47\1\0\2\47\1\0\14\47\1\171\4\47"+
    "\15\0\1\176\17\47\1\0\2\47\1\0\1\47\1\231"+
    "\17\47\15\0\1\232\17\47\1\0\2\47\1\0\11\47"+
    "\1\174\3\47\1\175\3\47\15\0\1\176\17\47\1\167"+
    "\2\176\1\167\1\176\1\232\17\176\1\167\1\0\13\167"+
    "\1\233\17\176\7\0\1\234\72\0\1\235\45\0\1\236"+
    "\63\0\1\237\73\0\1\240\105\0\1\241\16\0\2\47"+
    "\1\0\3\47\1\242\15\47\15\0\20\47\1\0\2\47"+
    "\1\0\14\47\1\243\4\47\15\0\20\47\1\0\2\47"+
    "\1\0\1\244\20\47\15\0\20\47\1\0\2\47\1\0"+
    "\2\47\1\215\16\47\15\0\20\47\1\0\2\47\1\0"+
    "\14\47\1\245\4\47\15\0\20\47\1\0\2\47\1\0"+
    "\21\47\15\0\2\47\1\246\15\47\1\0\2\56\1\0"+
    "\3\56\1\247\15\56\15\0\20\56\1\0\2\56\1\0"+
    "\14\56\1\250\4\56\15\0\20\56\1\0\2\56\1\0"+
    "\1\251\20\56\15\0\20\56\1\0\2\56\1\0\2\56"+
    "\1\252\16\56\15\0\20\56\1\0\2\56\1\0\14\56"+
    "\1\253\4\56\15\0\20\56\1\0\2\56\1\0\21\56"+
    "\15\0\2\56\1\254\15\56\1\234\2\242\1\234\3\242"+
    "\1\255\1\256\14\242\1\234\1\0\13\234\4\242\1\257"+
    "\13\242\1\0\2\47\1\0\2\47\2\242\15\47\15\0"+
    "\20\47\1\0\2\47\1\0\3\47\1\242\10\47\1\243"+
    "\4\47\15\0\20\47\1\0\2\47\1\0\3\47\1\257"+
    "\15\47\15\0\4\47\1\257\13\47\1\235\2\243\1\235"+
    "\14\243\1\260\4\243\1\235\1\0\13\235\20\243\1\0"+
    "\2\47\1\0\14\47\1\243\4\47\15\0\7\47\1\243"+
    "\10\47\1\0\1\47\1\173\1\0\21\47\15\0\20\47"+
    "\1\237\2\215\1\237\2\215\1\261\16\215\1\237\1\0"+
    "\13\237\20\215\1\0\2\47\1\0\2\47\1\215\11\47"+
    "\1\245\4\47\15\0\20\47\1\0\2\47\1\0\2\47"+
    "\1\215\16\47\15\0\3\47\1\215\14\47\1\236\2\244"+
    "\1\236\1\262\20\244\1\236\1\0\13\236\2\244\1\263"+
    "\15\244\1\0\2\47\1\0\1\263\20\47\15\0\2\47"+
    "\1\244\15\47\1\0\2\47\1\0\1\244\20\47\15\0"+
    "\2\47\1\246\15\47\1\0\2\47\1\0\11\47\1\264"+
    "\5\47\1\245\1\47\15\0\20\47\1\240\2\245\1\240"+
    "\14\245\1\265\4\245\1\240\1\0\13\240\20\245\27\226"+
    "\1\227\57\226\1\266\1\226\1\227\32\226\1\0\2\47"+
    "\1\0\21\47\15\0\7\47\1\267\10\47\1\0\2\47"+
    "\1\0\1\263\20\47\15\0\2\47\1\270\15\47\1\0"+
    "\2\47\1\0\1\270\20\47\15\0\2\47\1\271\15\47"+
    "\1\241\2\246\1\241\1\271\20\246\1\241\1\0\13\241"+
    "\2\246\1\272\15\246\10\0\1\273\66\0\1\274\61\0"+
    "\1\275\117\0\1\276\7\0\2\47\1\0\4\47\1\277"+
    "\14\47\15\0\20\47\1\0\2\47\1\0\11\47\1\300"+
    "\7\47\15\0\20\47\1\0\2\47\1\0\11\47\1\264"+
    "\7\47\15\0\20\47\1\0\2\47\1\0\21\47\15\0"+
    "\11\47\1\301\6\47\1\0\2\56\1\0\4\56\1\302"+
    "\14\56\15\0\20\56\1\0\2\56\1\0\11\56\1\303"+
    "\7\56\15\0\20\56\1\0\2\56\1\0\11\56\1\304"+
    "\7\56\15\0\20\56\1\0\2\56\1\0\21\56\15\0"+
    "\11\56\1\305\6\56\1\273\2\277\1\273\4\277\1\306"+
    "\14\277\1\273\1\0\13\273\20\277\1\0\2\47\1\0"+
    "\3\47\2\277\14\47\15\0\20\47\1\0\2\47\1\0"+
    "\4\47\1\277\14\47\15\0\5\47\1\277\12\47\1\0"+
    "\1\47\1\243\1\0\21\47\15\0\20\47\1\0\1\47"+
    "\1\215\1\0\21\47\15\0\20\47\1\274\2\300\1\274"+
    "\11\300\1\307\7\300\1\274\1\0\13\274\11\300\1\310"+
    "\6\300\1\0\2\47\1\0\11\47\1\310\7\47\15\0"+
    "\11\47\1\300\6\47\1\275\2\264\1\275\11\264\1\311"+
    "\7\264\1\275\1\0\13\275\20\264\1\0\2\47\1\0"+
    "\21\47\15\0\11\47\1\264\6\47\1\0\2\47\1\0"+
    "\11\47\1\300\7\47\15\0\11\47\1\301\6\47\1\0"+
    "\2\47\1\0\11\47\1\301\7\47\15\0\11\47\1\312"+
    "\6\47\1\276\2\301\1\276\11\301\1\312\7\301\1\276"+
    "\1\0\13\276\11\301\1\313\6\301\16\0\1\314\106\0"+
    "\1\315\17\0\2\47\1\0\12\47\1\316\6\47\15\0"+
    "\20\47\1\0\2\47\1\0\21\47\15\0\1\47\1\317"+
    "\16\47\1\0\2\56\1\0\12\56\1\320\6\56\15\0"+
    "\20\56\1\0\2\56\1\0\21\56\15\0\1\56\1\321"+
    "\16\56\1\0\1\47\1\277\1\0\21\47\15\0\20\47"+
    "\1\314\2\316\1\314\12\316\1\322\6\316\1\314\1\0"+
    "\13\314\1\316\1\323\16\316\1\0\2\47\1\0\12\47"+
    "\1\323\6\47\15\0\1\47\1\316\16\47\1\0\1\47"+
    "\1\264\1\0\21\47\15\0\20\47\1\0\2\47\1\0"+
    "\12\47\1\317\6\47\15\0\1\47\1\324\16\47\1\315"+
    "\2\317\1\315\12\317\1\324\6\317\1\315\1\0\13\315"+
    "\1\317\1\325\16\317\17\0\1\326\122\0\1\327\2\0"+
    "\2\47\1\0\13\47\1\330\5\47\15\0\20\47\1\0"+
    "\2\47\1\0\21\47\15\0\16\47\1\331\1\47\1\0"+
    "\2\56\1\0\13\56\1\332\5\56\15\0\20\56\1\0"+
    "\2\56\1\0\21\56\15\0\16\56\1\333\1\56\1\326"+
    "\2\330\1\326\13\330\1\334\5\330\1\326\1\0\13\326"+
    "\16\330\1\335\1\330\1\0\2\47\1\0\13\47\1\335"+
    "\5\47\15\0\16\47\1\330\1\47\1\0\2\47\1\0"+
    "\13\47\1\331\5\47\15\0\16\47\1\336\1\47\1\327"+
    "\2\331\1\327\13\331\1\336\5\331\1\327\1\0\13\327"+
    "\16\331\1\337\1\331\13\0\1\340\125\0\1\341\3\0"+
    "\2\47\1\0\7\47\1\342\11\47\15\0\20\47\1\0"+
    "\2\47\1\0\21\47\15\0\15\47\1\343\2\47\1\0"+
    "\2\56\1\0\7\56\1\344\11\56\15\0\20\56\1\0"+
    "\2\56\1\0\21\56\15\0\15\56\1\345\2\56\1\340"+
    "\2\342\1\340\7\342\1\346\11\342\1\340\1\0\13\340"+
    "\15\342\1\347\2\342\1\0\2\47\1\0\7\47\1\347"+
    "\11\47\15\0\15\47\1\342\2\47\1\0\2\47\1\0"+
    "\7\47\1\343\11\47\15\0\15\47\1\347\2\47\1\341"+
    "\2\343\1\341\7\343\1\347\11\343\1\341\1\0\13\341"+
    "\15\343\1\350\2\343\15\0\1\351\117\0\1\351\7\0"+
    "\2\47\1\0\11\47\1\352\7\47\15\0\20\47\1\0"+
    "\2\47\1\0\21\47\15\0\11\47\1\352\6\47\1\0"+
    "\2\56\1\0\11\56\1\353\7\56\15\0\20\56\1\0"+
    "\2\56\1\0\21\56\15\0\11\56\1\353\6\56\1\351"+
    "\2\352\1\351\11\352\1\131\7\352\1\351\1\0\13\351"+
    "\20\352\1\0\2\47\1\0\11\47\1\352\7\47\15\0"+
    "\11\47\1\352\6\47\1\351\2\352\1\351\21\352\1\351"+
    "\1\0\13\351\20\352";

  private static int [] zzUnpackTrans() {
    int [] result = new int[10200];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\37\1\6\0\20\1\1\0\20\1\1\0\21\1"+
    "\1\0\12\1\3\11\11\1\3\0\1\11\3\0\36\1"+
    "\2\0\4\1\1\0\1\11\1\0\1\11\2\0\24\1"+
    "\1\11\4\1\1\11\1\0\1\11\1\0\15\1\2\0"+
    "\10\1\2\0\10\1\2\0\7\1\1\11\2\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[235];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
    public String lexeme;


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Lexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  Lexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 144) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public Tokens yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 25: 
          { lexeme=yytext(); return errorCall;
          }
        case 29: break;
        case 11: 
          { lexeme=yytext(); return PuntoComa;
          }
        case 30: break;
        case 1: 
          { lexeme=yytext(); return ERROR;
          }
        case 31: break;
        case 6: 
          { lexeme=yytext(); return Asterisco;
          }
        case 32: break;
        case 18: 
          { lexeme = yytext(); return Reservadas;
          }
        case 33: break;
        case 26: 
          { lexeme=yytext(); return errorWhile;
          }
        case 34: break;
        case 13: 
          { lexeme=yytext(); return Mas;
          }
        case 35: break;
        case 24: 
          { lexeme=yytext(); return errorThen;
          }
        case 36: break;
        case 22: 
          { lexeme=yytext(); return Asignacion;
          }
        case 37: break;
        case 20: 
          { lexeme=yytext(); return MayorIgual;
          }
        case 38: break;
        case 10: 
          { lexeme=yytext(); return Coma;
          }
        case 39: break;
        case 16: 
          { lexeme=yytext(); return errorIdentificador;
          }
        case 40: break;
        case 8: 
          { lexeme=yytext(); return Igual;
          }
        case 41: break;
        case 9: 
          { lexeme=yytext(); return Menor;
          }
        case 42: break;
        case 12: 
          { lexeme=yytext(); return Punto;
          }
        case 43: break;
        case 3: 
          { lexeme=yytext(); return Numero;
          }
        case 44: break;
        case 23: 
          { lexeme=yytext(); return errorOdd;
          }
        case 45: break;
        case 27: 
          { lexeme=yytext(); return errorConst;
          }
        case 46: break;
        case 2: 
          { lexeme=yytext(); return Identificador;
          }
        case 47: break;
        case 21: 
          { lexeme=yytext(); return MenorIgual;
          }
        case 48: break;
        case 5: 
          { lexeme=yytext(); return Diagonal;
          }
        case 49: break;
        case 7: 
          { lexeme=yytext(); return Mayor;
          }
        case 50: break;
        case 15: 
          { lexeme=yytext(); return Diferente;
          }
        case 51: break;
        case 4: 
          { /*Ignore*/
          }
        case 52: break;
        case 28: 
          { lexeme=yytext(); return errorProcedure;
          }
        case 53: break;
        case 19: 
          { lexeme=yytext(); return errorComentario;
          }
        case 54: break;
        case 17: 
          { lexeme=yytext(); return errorNumero;
          }
        case 55: break;
        case 14: 
          { lexeme=yytext(); return Menos;
          }
        case 56: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            return null;
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}