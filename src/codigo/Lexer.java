/* The following code was generated by JFlex 1.4.3 on 24/05/21 11:35 AM */

/*--------------- 1ra Area: Codigo de Usuario----------------*/
//------------> Paquetes, importaciones
package codigo;
import static codigo.Tokens.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 24/05/21 11:35 AM from the specification file
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
    "\11\0\1\3\1\30\2\0\1\3\22\0\1\3\2\0\1\44\4\0"+
    "\1\32\1\33\1\31\1\42\1\37\1\43\1\41\1\27\12\2\1\45"+
    "\1\40\1\36\1\35\1\34\2\0\1\54\1\1\1\50\1\47\1\57"+
    "\2\1\1\56\1\61\2\1\1\55\1\1\1\51\1\46\1\62\1\1"+
    "\1\63\1\52\1\53\1\64\1\1\1\60\3\1\4\0\1\65\1\0"+
    "\1\12\1\25\1\4\1\16\1\15\1\22\1\26\1\23\1\21\2\1"+
    "\1\20\1\1\1\6\1\5\1\14\1\1\1\13\1\7\1\10\1\17"+
    "\1\11\1\24\3\1\uff85\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\12\2\1\5\1\6"+
    "\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16"+
    "\1\17\1\20\1\21\1\22\1\1\5\2\1\1\6\0"+
    "\7\2\1\23\1\3\5\23\1\24\1\23\1\4\1\0"+
    "\20\2\1\0\20\2\1\25\1\26\1\0\11\2\1\4"+
    "\1\27\1\30\1\31\1\32\11\2\3\0\1\33\3\0"+
    "\3\2\1\33\3\2\3\23\1\33\3\23\4\2\1\34"+
    "\1\2\1\35\2\36\2\2\1\37\3\2\1\40\3\2"+
    "\2\0\4\2\1\0\1\34\1\0\1\36\2\0\1\2"+
    "\1\34\3\2\1\23\1\34\1\23\1\36\2\23\1\41"+
    "\2\2\1\42\1\43\2\2\2\44\1\2\1\4\4\2"+
    "\1\41\1\0\1\44\1\0\1\41\2\2\1\41\1\23"+
    "\1\44\1\23\1\45\2\2\1\46\1\47\2\2\2\0"+
    "\2\2\2\23\4\2\2\0\2\2\2\23\4\2\2\0"+
    "\2\2\2\23\3\2\3\50\1\51";

  private static int [] zzUnpackAction() {
    int [] result = new int[248];
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
    "\0\0\0\66\0\154\0\242\0\330\0\u010e\0\u0144\0\u017a"+
    "\0\u01b0\0\u01e6\0\u021c\0\u0252\0\u0288\0\u02be\0\u02f4\0\u032a"+
    "\0\u0360\0\66\0\66\0\66\0\u0396\0\66\0\u03cc\0\66"+
    "\0\66\0\66\0\66\0\66\0\66\0\u0402\0\u0438\0\u046e"+
    "\0\u04a4\0\u04da\0\u0510\0\u0546\0\u057c\0\u05b2\0\u05e8\0\u061e"+
    "\0\u0654\0\u068a\0\u06c0\0\u06f6\0\u072c\0\u0762\0\u0798\0\u07ce"+
    "\0\u0804\0\u083a\0\u0870\0\u08a6\0\u08dc\0\u0912\0\u0948\0\u097e"+
    "\0\u09b4\0\u09ea\0\u0a20\0\u0a56\0\u0a8c\0\u0ac2\0\u0af8\0\u0b2e"+
    "\0\u0b64\0\u0b9a\0\u0bd0\0\u0c06\0\u0c3c\0\u0c72\0\u0ca8\0\u0cde"+
    "\0\u0d14\0\u0d4a\0\u0d80\0\u0db6\0\u0dec\0\u0e22\0\u0e58\0\u0e8e"+
    "\0\u0ec4\0\u0efa\0\u0f30\0\u0f66\0\u0f9c\0\u0fd2\0\u1008\0\u103e"+
    "\0\u1074\0\u10aa\0\u10e0\0\u1116\0\u114c\0\u06f6\0\u06c0\0\u1182"+
    "\0\u11b8\0\u11ee\0\u1224\0\u125a\0\u1290\0\u12c6\0\u12fc\0\u1332"+
    "\0\u1368\0\u139e\0\u13d4\0\u0360\0\u0360\0\u0360\0\u140a\0\u1440"+
    "\0\u1476\0\u14ac\0\u14e2\0\u1518\0\u154e\0\u1584\0\u15ba\0\u15f0"+
    "\0\u1626\0\u165c\0\u0360\0\u1692\0\u16c8\0\u16fe\0\u1734\0\u176a"+
    "\0\u17a0\0\u06c0\0\u17d6\0\u180c\0\u1842\0\u1878\0\u18ae\0\u18e4"+
    "\0\u083a\0\u191a\0\u1950\0\u1986\0\u19bc\0\u19f2\0\u1a28\0\u1a5e"+
    "\0\u1a94\0\u1aca\0\u1b00\0\u06c0\0\u1b36\0\u1b6c\0\u1ba2\0\u06c0"+
    "\0\u1bd8\0\u1c0e\0\u1c44\0\u06c0\0\u1c7a\0\u1cb0\0\u1ce6\0\u1d1c"+
    "\0\u1d52\0\u1d88\0\u1dbe\0\u1df4\0\u1e2a\0\u1e60\0\u0360\0\u1e96"+
    "\0\u0360\0\u1ecc\0\u1f02\0\u1f38\0\u06c0\0\u1f6e\0\u1fa4\0\u1fda"+
    "\0\u2010\0\u083a\0\u2046\0\u083a\0\u207c\0\u20b2\0\u20e8\0\u211e"+
    "\0\u2154\0\u218a\0\u21c0\0\u21f6\0\u222c\0\u06c0\0\u2262\0\u2298"+
    "\0\u0360\0\u22ce\0\u2304\0\u233a\0\u2370\0\u0360\0\u23a6\0\u0360"+
    "\0\u23dc\0\u06c0\0\u2412\0\u2448\0\u083a\0\u247e\0\u083a\0\u24b4"+
    "\0\u24ea\0\u2520\0\u2556\0\u258c\0\u06c0\0\u25c2\0\u25f8\0\u262e"+
    "\0\u2664\0\u269a\0\u26d0\0\u2706\0\u273c\0\u2772\0\u27a8\0\u27de"+
    "\0\u2814\0\u284a\0\u2880\0\u28b6\0\u28ec\0\u2922\0\u2958\0\u298e"+
    "\0\u29c4\0\u29fa\0\u2a30\0\u2a66\0\u2a9c\0\u2ad2\0\u2b08\0\u2b3e"+
    "\0\u2b74\0\u2baa\0\u2be0\0\u2c16\0\u0360\0\u06c0\0\u083a\0\u2c4c";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[248];
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
    "\1\11\2\3\1\12\1\13\1\14\2\3\1\15\2\3"+
    "\1\16\1\17\1\3\1\20\1\21\1\22\1\23\1\24"+
    "\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34"+
    "\1\35\1\36\1\37\1\3\1\40\2\3\1\41\4\3"+
    "\1\42\1\3\1\43\2\3\1\44\5\0\1\45\4\0"+
    "\1\46\1\47\2\0\1\50\4\0\1\51\37\0\1\52"+
    "\3\0\2\53\1\0\1\53\1\54\4\53\1\55\1\56"+
    "\2\53\1\57\4\53\1\60\3\53\17\0\15\53\1\61"+
    "\2\53\1\0\1\62\1\63\1\0\1\62\1\64\4\62"+
    "\1\65\1\66\2\62\1\67\4\62\1\70\3\62\12\0"+
    "\1\71\4\0\15\62\1\72\1\62\4\0\1\73\1\0"+
    "\1\45\4\0\1\46\1\47\2\0\1\50\4\0\1\51"+
    "\37\0\1\52\2\0\1\74\2\75\1\74\1\75\1\76"+
    "\4\75\1\77\1\100\2\75\1\101\4\75\1\102\3\75"+
    "\1\74\1\0\15\74\1\103\5\75\1\104\6\75\1\105"+
    "\2\75\1\50\2\57\1\50\1\57\1\106\4\57\1\107"+
    "\1\110\2\57\1\111\4\57\1\112\3\57\1\50\1\0"+
    "\15\50\1\57\1\113\13\57\1\114\2\57\1\115\2\116"+
    "\1\115\1\116\1\117\4\116\1\120\1\121\1\116\1\122"+
    "\1\123\4\116\1\124\3\116\1\115\1\0\15\115\10\116"+
    "\1\125\4\116\1\126\2\116\1\0\2\53\1\0\1\53"+
    "\1\54\4\53\1\127\1\56\2\53\1\57\4\53\1\60"+
    "\3\53\17\0\15\53\1\61\2\53\1\47\2\56\1\47"+
    "\1\56\1\130\4\56\1\131\1\132\2\56\1\110\4\56"+
    "\1\133\3\56\1\47\1\0\15\47\15\56\1\134\2\56"+
    "\1\0\2\53\1\0\1\53\1\54\1\135\3\53\1\55"+
    "\1\56\2\53\1\57\4\53\1\60\3\53\17\0\15\53"+
    "\1\61\2\53\1\0\2\53\1\0\1\53\1\136\4\53"+
    "\1\55\1\56\2\53\1\57\4\53\1\60\3\53\17\0"+
    "\15\53\1\61\2\53\1\0\2\53\1\0\1\53\1\54"+
    "\4\53\1\55\1\56\2\53\1\57\3\53\1\137\1\60"+
    "\3\53\17\0\15\53\1\61\2\53\1\140\2\141\1\140"+
    "\1\141\1\142\4\141\1\143\1\144\2\141\1\145\2\141"+
    "\1\146\1\141\1\147\3\141\1\140\1\0\15\140\15\141"+
    "\1\150\2\141\1\0\2\53\1\0\1\53\1\54\4\53"+
    "\1\55\1\56\1\53\1\151\1\57\4\53\1\60\3\53"+
    "\17\0\15\53\1\61\2\53\5\0\1\45\4\0\1\46"+
    "\1\47\2\0\1\50\4\0\1\51\3\0\1\152\1\0"+
    "\1\153\31\0\1\52\75\0\1\45\4\0\1\46\1\47"+
    "\2\0\1\50\4\0\1\51\11\0\1\154\25\0\1\52"+
    "\7\0\1\45\4\0\1\46\1\47\2\0\1\50\4\0"+
    "\1\51\11\0\1\155\25\0\1\52\7\0\1\45\4\0"+
    "\1\46\1\47\2\0\1\50\4\0\1\51\11\0\1\156"+
    "\25\0\1\52\3\0\2\53\1\0\1\53\1\54\4\53"+
    "\1\55\1\56\2\53\1\57\4\53\1\60\3\53\17\0"+
    "\1\53\1\113\13\53\1\61\2\53\1\0\2\53\1\0"+
    "\1\53\1\157\4\53\1\160\1\56\2\53\1\57\4\53"+
    "\1\60\3\53\17\0\1\157\5\53\1\160\6\53\1\61"+
    "\2\53\1\0\2\53\1\0\1\53\1\54\4\53\1\55"+
    "\1\56\2\53\1\57\4\53\1\161\3\53\17\0\10\53"+
    "\1\125\4\53\1\61\2\53\1\0\2\53\1\0\1\53"+
    "\1\54\4\53\1\55\1\56\2\53\1\57\4\53\1\60"+
    "\3\53\17\0\10\53\1\162\4\53\1\61\2\53\1\52"+
    "\2\61\1\52\1\61\1\163\4\61\1\164\1\165\2\61"+
    "\1\114\4\61\1\166\3\61\1\52\1\0\15\52\15\61"+
    "\1\167\2\61\1\0\2\62\1\0\1\62\1\64\4\62"+
    "\1\65\1\66\2\62\1\67\4\62\1\70\3\62\17\0"+
    "\15\62\1\72\2\62\6\0\1\170\77\0\1\171\52\0"+
    "\1\172\76\0\1\173\64\0\1\174\3\0\1\175\112\0"+
    "\1\176\20\0\2\53\1\0\23\53\17\0\20\53\1\0"+
    "\2\53\1\0\2\53\1\177\20\53\17\0\20\53\1\0"+
    "\2\53\1\0\14\53\1\200\6\53\17\0\20\53\1\0"+
    "\2\53\1\0\1\53\1\201\21\53\17\0\20\53\1\0"+
    "\2\53\1\0\12\53\1\202\10\53\17\0\20\53\1\0"+
    "\2\53\1\0\11\53\1\203\3\53\1\204\5\53\17\0"+
    "\20\53\1\0\2\53\1\0\23\53\17\0\1\205\17\53"+
    "\1\0\2\62\1\0\23\62\17\0\20\62\1\0\1\62"+
    "\1\63\1\0\23\62\12\0\1\71\4\0\17\62\2\0"+
    "\2\62\1\0\2\62\1\206\20\62\17\0\20\62\1\0"+
    "\2\62\1\0\14\62\1\207\6\62\17\0\20\62\1\0"+
    "\2\62\1\0\1\62\1\210\21\62\17\0\20\62\1\0"+
    "\2\62\1\0\12\62\1\211\10\62\17\0\20\62\1\0"+
    "\2\62\1\0\11\62\1\212\3\62\1\213\5\62\17\0"+
    "\20\62\1\0\2\71\1\0\23\71\12\0\1\71\4\0"+
    "\17\71\2\0\2\62\1\0\23\62\17\0\1\214\17\62"+
    "\3\0\1\73\70\0\1\170\11\0\1\171\46\0\2\53"+
    "\1\0\2\53\1\177\11\53\1\200\6\53\17\0\20\53"+
    "\1\170\2\177\1\170\2\177\1\215\1\216\10\177\1\217"+
    "\6\177\1\170\1\0\15\170\3\177\1\220\14\177\1\171"+
    "\2\200\1\171\2\200\1\217\11\200\1\221\6\200\1\171"+
    "\1\0\15\171\7\200\1\222\10\200\1\0\2\53\1\0"+
    "\1\53\1\201\1\177\11\53\1\200\6\53\17\0\20\53"+
    "\1\0\2\53\1\0\2\53\1\177\7\53\1\202\1\53"+
    "\1\200\6\53\17\0\20\53\1\0\2\53\1\0\2\53"+
    "\1\177\6\53\1\203\2\53\1\200\1\204\5\53\17\0"+
    "\20\53\1\0\2\53\1\0\2\53\1\220\11\53\1\200"+
    "\6\53\17\0\3\53\1\220\14\53\1\0\2\53\1\0"+
    "\2\53\1\177\11\53\1\222\6\53\17\0\7\53\1\222"+
    "\10\53\1\0\2\53\1\0\2\53\1\177\11\53\1\200"+
    "\6\53\17\0\1\205\17\53\1\0\2\53\1\0\2\53"+
    "\1\177\7\53\1\202\10\53\17\0\20\53\1\0\2\53"+
    "\1\0\12\53\1\202\1\53\1\200\6\53\17\0\20\53"+
    "\1\0\2\53\1\0\1\53\1\201\10\53\1\202\10\53"+
    "\17\0\20\53\1\173\2\202\1\173\12\202\1\223\10\202"+
    "\1\173\1\0\15\173\20\202\1\0\2\53\1\0\11\53"+
    "\1\203\1\202\2\53\1\204\5\53\17\0\20\53\1\0"+
    "\2\53\1\0\12\53\1\202\10\53\17\0\1\53\1\202"+
    "\16\53\1\0\2\53\1\0\12\53\1\202\10\53\17\0"+
    "\1\205\17\53\15\0\1\174\51\0\2\53\1\0\11\53"+
    "\1\203\11\53\17\0\20\53\1\0\2\53\1\0\2\53"+
    "\1\177\6\53\1\203\11\53\17\0\20\53\1\0\2\53"+
    "\1\0\11\53\1\203\2\53\1\200\6\53\17\0\20\53"+
    "\1\0\2\53\1\0\1\53\1\201\7\53\1\203\11\53"+
    "\17\0\20\53\1\0\2\53\1\0\2\53\1\224\6\53"+
    "\1\203\5\53\1\203\3\53\17\0\20\53\1\0\2\53"+
    "\1\0\11\53\1\203\1\202\10\53\17\0\20\53\1\174"+
    "\2\203\1\174\11\203\1\225\3\203\1\226\5\203\1\174"+
    "\1\0\15\174\11\203\1\227\6\203\1\0\2\53\1\0"+
    "\11\53\1\227\11\53\17\0\11\53\1\227\6\53\1\0"+
    "\2\53\1\0\11\53\1\203\11\53\17\0\1\205\17\53"+
    "\1\0\2\53\1\0\7\53\1\230\4\53\1\200\6\53"+
    "\17\0\20\53\1\0\2\53\1\0\1\53\1\201\1\177"+
    "\20\53\17\0\20\53\1\0\2\53\1\0\1\53\1\201"+
    "\12\53\1\200\6\53\17\0\20\53\1\172\2\201\1\172"+
    "\1\201\1\231\21\201\1\172\1\0\15\172\1\232\17\201"+
    "\1\0\2\53\1\0\1\53\1\201\7\53\1\203\3\53"+
    "\1\204\5\53\17\0\20\53\1\0\2\53\1\0\1\53"+
    "\1\232\21\53\17\0\1\233\17\53\1\0\2\53\1\0"+
    "\12\53\1\234\10\53\17\0\20\53\21\0\1\175\45\0"+
    "\2\53\1\0\15\53\1\204\5\53\17\0\20\53\1\0"+
    "\2\53\1\0\2\53\1\177\12\53\1\204\5\53\17\0"+
    "\20\53\1\0\2\53\1\0\14\53\1\200\1\204\5\53"+
    "\17\0\20\53\1\0\2\53\1\0\1\53\1\201\13\53"+
    "\1\204\5\53\17\0\20\53\1\0\2\53\1\0\12\53"+
    "\1\202\2\53\1\204\5\53\17\0\20\53\1\0\2\53"+
    "\1\0\14\53\1\235\1\204\1\53\1\204\3\53\17\0"+
    "\20\53\1\175\2\204\1\175\11\204\1\226\3\204\1\236"+
    "\5\204\1\175\1\0\15\175\20\204\1\0\2\53\1\0"+
    "\15\53\1\204\5\53\17\0\1\205\17\53\1\0\2\53"+
    "\1\0\22\53\1\237\17\0\20\53\30\152\1\0\35\152"+
    "\1\240\26\153\2\240\1\241\14\240\17\153\1\240\1\0"+
    "\2\53\1\0\2\53\1\220\20\53\17\0\3\53\1\220"+
    "\14\53\1\0\2\53\1\0\14\53\1\222\6\53\17\0"+
    "\7\53\1\222\10\53\1\0\2\53\1\0\11\53\1\227"+
    "\3\53\1\204\5\53\17\0\11\53\1\227\6\53\1\0"+
    "\2\53\1\0\23\53\17\0\13\53\1\242\4\53\1\0"+
    "\2\53\1\0\2\53\1\177\20\53\17\0\1\205\17\53"+
    "\1\0\2\53\1\0\14\53\1\200\6\53\17\0\1\205"+
    "\17\53\1\0\2\53\1\0\1\53\1\243\21\53\17\0"+
    "\1\244\17\53\1\0\2\53\1\0\11\53\1\203\3\53"+
    "\1\204\5\53\17\0\1\205\17\53\1\176\2\205\1\176"+
    "\1\205\1\244\21\205\1\176\1\0\15\176\1\245\17\205"+
    "\7\0\1\246\76\0\1\247\51\0\1\250\67\0\1\251"+
    "\77\0\1\252\115\0\1\253\16\0\2\53\1\0\3\53"+
    "\1\254\17\53\17\0\20\53\1\0\2\53\1\0\14\53"+
    "\1\255\6\53\17\0\20\53\1\0\2\53\1\0\1\256"+
    "\22\53\17\0\20\53\1\0\2\53\1\0\2\53\1\224"+
    "\20\53\17\0\20\53\1\0\2\53\1\0\14\53\1\257"+
    "\6\53\17\0\20\53\1\0\2\53\1\0\23\53\17\0"+
    "\2\53\1\260\15\53\1\0\2\62\1\0\3\62\1\261"+
    "\17\62\17\0\20\62\1\0\2\62\1\0\14\62\1\262"+
    "\6\62\17\0\20\62\1\0\2\62\1\0\1\263\22\62"+
    "\17\0\20\62\1\0\2\62\1\0\2\62\1\264\20\62"+
    "\17\0\20\62\1\0\2\62\1\0\14\62\1\265\6\62"+
    "\17\0\20\62\1\0\2\62\1\0\23\62\17\0\2\62"+
    "\1\266\15\62\1\246\2\254\1\246\3\254\1\267\1\270"+
    "\16\254\1\246\1\0\15\246\4\254\1\271\13\254\1\0"+
    "\2\53\1\0\2\53\2\254\17\53\17\0\20\53\1\0"+
    "\2\53\1\0\3\53\1\254\10\53\1\255\6\53\17\0"+
    "\20\53\1\0\2\53\1\0\3\53\1\271\17\53\17\0"+
    "\4\53\1\271\13\53\1\247\2\255\1\247\14\255\1\272"+
    "\6\255\1\247\1\0\15\247\20\255\1\0\2\53\1\0"+
    "\14\53\1\255\6\53\17\0\7\53\1\255\10\53\1\0"+
    "\1\53\1\202\1\0\23\53\17\0\20\53\1\251\2\224"+
    "\1\251\2\224\1\273\20\224\1\251\1\0\15\251\20\224"+
    "\1\0\2\53\1\0\2\53\1\224\11\53\1\257\6\53"+
    "\17\0\20\53\1\0\2\53\1\0\2\53\1\224\20\53"+
    "\17\0\3\53\1\224\14\53\1\250\2\256\1\250\1\274"+
    "\22\256\1\250\1\0\15\250\2\256\1\275\15\256\1\0"+
    "\2\53\1\0\1\275\22\53\17\0\2\53\1\256\15\53"+
    "\1\0\2\53\1\0\1\256\22\53\17\0\2\53\1\260"+
    "\15\53\1\0\2\53\1\0\11\53\1\276\5\53\1\257"+
    "\3\53\17\0\20\53\1\252\2\257\1\252\14\257\1\277"+
    "\6\257\1\252\1\0\15\252\20\257\1\0\2\53\1\0"+
    "\15\53\1\300\5\53\17\0\20\53\31\240\1\241\63\240"+
    "\1\301\1\240\1\241\34\240\1\0\2\53\1\0\23\53"+
    "\17\0\7\53\1\302\10\53\1\0\2\53\1\0\1\275"+
    "\22\53\17\0\2\53\1\303\15\53\1\0\2\53\1\0"+
    "\1\303\22\53\17\0\2\53\1\304\15\53\1\253\2\260"+
    "\1\253\1\304\22\260\1\253\1\0\15\253\2\260\1\305"+
    "\15\260\10\0\1\306\72\0\1\307\65\0\1\310\127\0"+
    "\1\311\7\0\2\53\1\0\4\53\1\312\16\53\17\0"+
    "\20\53\1\0\2\53\1\0\11\53\1\313\11\53\17\0"+
    "\20\53\1\0\2\53\1\0\11\53\1\276\11\53\17\0"+
    "\20\53\1\0\2\53\1\0\23\53\17\0\11\53\1\314"+
    "\6\53\1\0\2\62\1\0\4\62\1\315\16\62\17\0"+
    "\20\62\1\0\2\62\1\0\11\62\1\316\11\62\17\0"+
    "\20\62\1\0\2\62\1\0\11\62\1\317\11\62\17\0"+
    "\20\62\1\0\2\62\1\0\23\62\17\0\11\62\1\320"+
    "\6\62\1\306\2\312\1\306\4\312\1\321\16\312\1\306"+
    "\1\0\15\306\20\312\1\0\2\53\1\0\3\53\2\312"+
    "\16\53\17\0\20\53\1\0\2\53\1\0\4\53\1\312"+
    "\16\53\17\0\5\53\1\312\12\53\1\0\1\53\1\255"+
    "\1\0\23\53\17\0\20\53\1\0\1\53\1\224\1\0"+
    "\23\53\17\0\20\53\1\307\2\313\1\307\11\313\1\322"+
    "\11\313\1\307\1\0\15\307\11\313\1\323\6\313\1\0"+
    "\2\53\1\0\11\53\1\323\11\53\17\0\11\53\1\313"+
    "\6\53\1\310\2\276\1\310\11\276\1\324\11\276\1\310"+
    "\1\0\15\310\20\276\1\0\2\53\1\0\2\53\1\325"+
    "\20\53\17\0\20\53\1\0\2\53\1\0\23\53\17\0"+
    "\11\53\1\276\6\53\1\0\2\53\1\0\11\53\1\313"+
    "\11\53\17\0\11\53\1\314\6\53\1\0\2\53\1\0"+
    "\11\53\1\314\11\53\17\0\11\53\1\326\6\53\1\311"+
    "\2\314\1\311\11\314\1\326\11\314\1\311\1\0\15\311"+
    "\11\314\1\327\6\314\16\0\1\330\116\0\1\331\17\0"+
    "\2\53\1\0\12\53\1\332\10\53\17\0\20\53\1\0"+
    "\2\53\1\0\23\53\17\0\1\53\1\333\16\53\1\0"+
    "\2\62\1\0\12\62\1\334\10\62\17\0\20\62\1\0"+
    "\2\62\1\0\23\62\17\0\1\62\1\335\16\62\1\0"+
    "\1\53\1\312\1\0\23\53\17\0\20\53\1\330\2\332"+
    "\1\330\12\332\1\336\10\332\1\330\1\0\15\330\1\332"+
    "\1\337\16\332\1\0\2\53\1\0\12\53\1\337\10\53"+
    "\17\0\1\53\1\332\16\53\1\0\1\53\1\276\1\0"+
    "\23\53\17\0\20\53\1\0\2\53\1\0\12\53\1\333"+
    "\10\53\17\0\1\53\1\340\16\53\1\331\2\333\1\331"+
    "\12\333\1\340\10\333\1\331\1\0\15\331\1\333\1\341"+
    "\16\333\17\0\1\342\132\0\1\343\2\0\2\53\1\0"+
    "\13\53\1\344\7\53\17\0\20\53\1\0\2\53\1\0"+
    "\23\53\17\0\16\53\1\345\1\53\1\0\2\62\1\0"+
    "\13\62\1\346\7\62\17\0\20\62\1\0\2\62\1\0"+
    "\23\62\17\0\16\62\1\347\1\62\1\342\2\344\1\342"+
    "\13\344\1\350\7\344\1\342\1\0\15\342\16\344\1\351"+
    "\1\344\1\0\2\53\1\0\13\53\1\351\7\53\17\0"+
    "\16\53\1\344\1\53\1\0\2\53\1\0\13\53\1\345"+
    "\7\53\17\0\16\53\1\352\1\53\1\343\2\345\1\343"+
    "\13\345\1\352\7\345\1\343\1\0\15\343\16\345\1\353"+
    "\1\345\13\0\1\354\135\0\1\355\3\0\2\53\1\0"+
    "\7\53\1\356\13\53\17\0\20\53\1\0\2\53\1\0"+
    "\23\53\17\0\15\53\1\357\2\53\1\0\2\62\1\0"+
    "\7\62\1\360\13\62\17\0\20\62\1\0\2\62\1\0"+
    "\23\62\17\0\15\62\1\361\2\62\1\354\2\356\1\354"+
    "\7\356\1\362\13\356\1\354\1\0\15\354\15\356\1\363"+
    "\2\356\1\0\2\53\1\0\7\53\1\363\13\53\17\0"+
    "\15\53\1\356\2\53\1\0\2\53\1\0\7\53\1\357"+
    "\13\53\17\0\15\53\1\363\2\53\1\355\2\357\1\355"+
    "\7\357\1\363\13\357\1\355\1\0\15\355\15\357\1\364"+
    "\2\357\15\0\1\365\127\0\1\365\7\0\2\53\1\0"+
    "\11\53\1\366\11\53\17\0\20\53\1\0\2\53\1\0"+
    "\23\53\17\0\11\53\1\366\6\53\1\0\2\62\1\0"+
    "\11\62\1\367\11\62\17\0\20\62\1\0\2\62\1\0"+
    "\23\62\17\0\11\62\1\367\6\62\1\365\2\366\1\365"+
    "\11\366\1\370\11\366\1\365\1\0\15\365\20\366\1\0"+
    "\2\53\1\0\11\53\1\366\11\53\17\0\11\53\1\366"+
    "\6\53\1\365\2\366\1\365\23\366\1\365\1\0\15\365"+
    "\20\366\1\0\1\53\1\366\1\0\23\53\17\0\20\53";

  private static int [] zzUnpackTrans() {
    int [] result = new int[11394];
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
    "\1\0\17\1\1\11\23\1\6\0\21\1\1\0\20\1"+
    "\1\0\22\1\1\0\13\1\3\11\11\1\3\0\1\11"+
    "\3\0\41\1\2\0\4\1\1\0\1\11\1\0\1\11"+
    "\2\0\25\1\1\11\4\1\1\11\1\0\1\11\1\0"+
    "\16\1\2\0\10\1\2\0\10\1\2\0\7\1\1\11"+
    "\3\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[248];
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
    public int linea;
    public int columna;
    


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
    while (i < 148) {
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

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn++;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
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
        case 19: 
          { lexeme=yytext();  linea=(yyline+1); columna=(yycolumn+1); return errorIdentificador;
          }
        case 42: break;
        case 12: 
          { lexeme=yytext();  linea=(yyline+1); columna=(yycolumn+1); return Menor;
          }
        case 43: break;
        case 2: 
          { lexeme=yytext();  linea=(yyline+1); columna=(yycolumn+1); return Identificador;
          }
        case 44: break;
        case 26: 
          { lexeme=yytext();  linea=(yyline+1); columna=(yycolumn+1); return Asignacion;
          }
        case 45: break;
        case 18: 
          { lexeme=yytext();  linea=(yyline+1); columna=(yycolumn+1); return Diferente;
          }
        case 46: break;
        case 39: 
          { lexeme = yytext(); linea=(yyline+1); columna=(yycolumn+1); return Begin;
          }
        case 47: break;
        case 6: 
          { return Linea;
          }
        case 48: break;
        case 23: 
          { lexeme=yytext();  linea=(yyline+1); columna=(yycolumn+1); return errorComentario;
          }
        case 49: break;
        case 31: 
          { lexeme = yytext(); linea=(yyline+1); columna=(yycolumn+1); return Var;
          }
        case 50: break;
        case 16: 
          { lexeme=yytext();  linea=(yyline+1); columna=(yycolumn+1); return Mas;
          }
        case 51: break;
        case 27: 
          { lexeme=yytext();  linea=(yyline+1); columna=(yycolumn+1); return errorOdd;
          }
        case 52: break;
        case 9: 
          { lexeme=yytext();  linea=(yyline+1); columna=(yycolumn+1); return Parentesis_c;
          }
        case 53: break;
        case 3: 
          { lexeme=yytext();  linea=(yyline+1); columna=(yycolumn+1); return Numero;
          }
        case 54: break;
        case 40: 
          { lexeme=yytext();  linea=(yyline+1); columna=(yycolumn+1);  return errorProcedure;
          }
        case 55: break;
        case 32: 
          { lexeme = yytext(); linea=(yyline+1); columna=(yycolumn+1); return End;
          }
        case 56: break;
        case 13: 
          { lexeme=yytext();  linea=(yyline+1); columna=(yycolumn+1); return Coma;
          }
        case 57: break;
        case 28: 
          { lexeme=yytext();  linea=(yyline+1); columna=(yycolumn+1); return errorCall;
          }
        case 58: break;
        case 34: 
          { lexeme = yytext(); linea=(yyline+1); columna=(yycolumn+1); return Call;
          }
        case 59: break;
        case 7: 
          { lexeme=yytext();  linea=(yyline+1); columna=(yycolumn+1); return Asterisco;
          }
        case 60: break;
        case 21: 
          { lexeme = yytext(); linea=(yyline+1); columna=(yycolumn+1); return Do;
          }
        case 61: break;
        case 15: 
          { lexeme=yytext();  linea=(yyline+1); columna=(yycolumn+1); return Punto;
          }
        case 62: break;
        case 41: 
          { lexeme = yytext(); linea=(yyline+1); columna=(yycolumn+1); return Procedure;
          }
        case 63: break;
        case 10: 
          { lexeme=yytext();  linea=(yyline+1); columna=(yycolumn+1); return Mayor;
          }
        case 64: break;
        case 29: 
          { lexeme = yytext(); linea=(yyline+1); columna=(yycolumn+1); return Odd;
          }
        case 65: break;
        case 38: 
          { lexeme = yytext(); linea=(yyline+1); columna=(yycolumn+1); return While;
          }
        case 66: break;
        case 14: 
          { lexeme=yytext();  linea=(yyline+1); columna=(yycolumn+1); return PuntoComa;
          }
        case 67: break;
        case 5: 
          { lexeme=yytext();  linea=(yyline+1); columna=(yycolumn+1); return Diagonal;
          }
        case 68: break;
        case 17: 
          { lexeme=yytext();  linea=(yyline+1); columna=(yycolumn+1); return Menos;
          }
        case 69: break;
        case 37: 
          { lexeme = yytext(); linea=(yyline+1); columna=(yycolumn+1); return Const;
          }
        case 70: break;
        case 1: 
          { lexeme=yytext();  linea=(yyline+1); columna=(yycolumn+1); return ERROR;
          }
        case 71: break;
        case 30: 
          { lexeme=yytext();  linea=(yyline+1); columna=(yycolumn+1); return errorThen;
          }
        case 72: break;
        case 24: 
          { lexeme=yytext();  linea=(yyline+1); columna=(yycolumn+1); return MayorIgual;
          }
        case 73: break;
        case 20: 
          { lexeme=yytext();  linea=(yyline+1); columna=(yycolumn+1); return errorNumero;
          }
        case 74: break;
        case 35: 
          { lexeme = yytext(); linea=(yyline+1); columna=(yycolumn+1); return Then;
          }
        case 75: break;
        case 11: 
          { lexeme=yytext();  linea=(yyline+1); columna=(yycolumn+1); return Igual;
          }
        case 76: break;
        case 36: 
          { lexeme=yytext();  linea=(yyline+1); columna=(yycolumn+1); return errorWhile;
          }
        case 77: break;
        case 4: 
          { /*Ignore*/
          }
        case 78: break;
        case 22: 
          { lexeme = yytext(); linea=(yyline+1); columna=(yycolumn+1); return If;
          }
        case 79: break;
        case 25: 
          { lexeme=yytext();  linea=(yyline+1); columna=(yycolumn+1); return MenorIgual;
          }
        case 80: break;
        case 8: 
          { lexeme=yytext();  linea=(yyline+1); columna=(yycolumn+1); return Parentesis_a;
          }
        case 81: break;
        case 33: 
          { lexeme=yytext();  linea=(yyline+1); columna=(yycolumn+1); return errorConst;
          }
        case 82: break;
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
