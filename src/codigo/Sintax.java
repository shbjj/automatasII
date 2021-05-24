
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Mon May 24 11:35:28 CDT 2021
//----------------------------------------------------

package codigo;

import java_cup.runtime.Symbol;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Mon May 24 11:35:28 CDT 2021
  */
public class Sintax extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public Sintax() {super();}

  /** Constructor which sets the default scanner. */
  public Sintax(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Sintax(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\060\000\002\002\004\000\002\002\004\000\002\003" +
    "\006\000\002\003\006\000\002\003\006\000\002\003\007" +
    "\000\002\003\010\000\002\003\003\000\002\010\004\000" +
    "\002\010\005\000\002\006\005\000\002\006\005\000\002" +
    "\007\005\000\002\004\005\000\002\004\004\000\002\004" +
    "\005\000\002\004\006\000\002\004\006\000\002\004\006" +
    "\000\002\004\002\000\002\005\004\000\002\005\005\000" +
    "\002\011\004\000\002\011\005\000\002\011\005\000\002" +
    "\011\005\000\002\011\005\000\002\011\005\000\002\011" +
    "\005\000\002\012\003\000\002\012\004\000\002\012\004" +
    "\000\002\012\004\000\002\012\005\000\002\012\005\000" +
    "\002\013\004\000\002\013\004\000\002\013\005\000\002" +
    "\013\005\000\002\014\003\000\002\014\004\000\002\015" +
    "\004\000\002\015\004\000\002\015\005\000\002\015\005" +
    "\000\002\016\003\000\002\016\003\000\002\016\005" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\142\000\024\004\004\005\015\006\011\007\012\010" +
    "\010\012\007\016\016\030\uffee\037\013\001\002\000\004" +
    "\037\133\001\002\000\006\027\ufffa\030\ufffa\001\002\000" +
    "\004\002\130\001\002\000\016\014\103\017\042\033\043" +
    "\034\044\037\050\040\041\001\002\000\016\014\103\017" +
    "\042\033\043\034\044\037\050\040\041\001\002\000\004" +
    "\037\076\001\002\000\004\037\075\001\002\000\004\036" +
    "\040\001\002\000\004\030\037\001\002\000\004\037\026" +
    "\001\002\000\020\007\012\010\010\012\007\015\uffee\016" +
    "\016\027\uffee\037\013\001\002\000\006\015\021\027\022" +
    "\001\002\000\004\015\025\001\002\000\010\015\ufff2\027" +
    "\ufff2\030\ufff2\001\002\000\020\007\012\010\010\012\007" +
    "\015\uffee\016\016\027\uffee\037\013\001\002\000\006\015" +
    "\uffed\027\022\001\002\000\004\015\uffec\001\002\000\010" +
    "\015\ufff1\027\ufff1\030\ufff1\001\002\000\006\026\027\027" +
    "\031\001\002\000\004\037\035\001\002\000\004\027\033" +
    "\001\002\000\026\004\004\005\015\006\011\007\012\010" +
    "\010\012\007\016\016\027\uffee\030\uffee\037\013\001\002" +
    "\000\006\027\ufffd\030\ufffd\001\002\000\026\004\004\005" +
    "\015\006\011\007\012\010\010\012\007\016\016\027\uffee" +
    "\030\uffee\037\013\001\002\000\006\027\ufffc\030\ufffc\001" +
    "\002\000\006\026\027\027\ufff9\001\002\000\004\027\ufff8" +
    "\001\002\000\004\002\000\001\002\000\014\017\042\033" +
    "\043\034\044\037\050\040\041\001\002\000\042\011\uffd3" +
    "\013\uffd3\015\uffd3\020\uffd3\021\uffd3\022\uffd3\023\uffd3\024" +
    "\uffd3\025\uffd3\027\uffd3\030\uffd3\031\uffd3\032\uffd3\033\uffd3" +
    "\034\uffd3\035\uffd3\001\002\000\014\017\042\033\043\034" +
    "\044\037\050\040\041\001\002\000\010\017\042\037\050" +
    "\040\041\001\002\000\010\017\042\037\050\040\041\001" +
    "\002\000\042\011\uffda\013\uffda\015\uffda\020\uffda\021\uffda" +
    "\022\uffda\023\uffda\024\uffda\025\uffda\027\uffda\030\uffda\031" +
    "\060\032\062\033\uffda\034\uffda\035\uffda\001\002\000\036" +
    "\011\uffe4\013\uffe4\015\uffe4\020\uffe4\021\uffe4\022\uffe4\023" +
    "\uffe4\024\uffe4\025\uffe4\027\uffe4\030\uffe4\033\051\034\052" +
    "\035\uffe4\001\002\000\010\015\ufff4\027\ufff4\030\ufff4\001" +
    "\002\000\042\011\uffd4\013\uffd4\015\uffd4\020\uffd4\021\uffd4" +
    "\022\uffd4\023\uffd4\024\uffd4\025\uffd4\027\uffd4\030\uffd4\031" +
    "\uffd4\032\uffd4\033\uffd4\034\uffd4\035\uffd4\001\002\000\010" +
    "\017\042\037\050\040\041\001\002\000\010\017\042\037" +
    "\050\040\041\001\002\000\032\011\uffe1\013\uffe1\015\uffe1" +
    "\020\uffe1\021\uffe1\022\uffe1\023\uffe1\024\uffe1\025\uffe1\027" +
    "\uffe1\030\uffe1\035\uffe1\001\002\000\036\011\uffdd\013\uffdd" +
    "\015\uffdd\020\uffdd\021\uffdd\022\uffdd\023\uffdd\024\uffdd\025" +
    "\uffdd\027\uffdd\030\uffdd\033\051\034\052\035\uffdd\001\002" +
    "\000\032\011\uffdb\013\uffdb\015\uffdb\020\uffdb\021\uffdb\022" +
    "\uffdb\023\uffdb\024\uffdb\025\uffdb\027\uffdb\030\uffdb\035\uffdb" +
    "\001\002\000\036\011\uffde\013\uffde\015\uffde\020\uffde\021" +
    "\uffde\022\uffde\023\uffde\024\uffde\025\uffde\027\uffde\030\uffde" +
    "\033\051\034\052\035\uffde\001\002\000\032\011\uffdc\013" +
    "\uffdc\015\uffdc\020\uffdc\021\uffdc\022\uffdc\023\uffdc\024\uffdc" +
    "\025\uffdc\027\uffdc\030\uffdc\035\uffdc\001\002\000\010\017" +
    "\042\037\050\040\041\001\002\000\036\011\uffd9\013\uffd9" +
    "\015\uffd9\020\uffd9\021\uffd9\022\uffd9\023\uffd9\024\uffd9\025" +
    "\uffd9\027\uffd9\030\uffd9\033\uffd9\034\uffd9\035\uffd9\001\002" +
    "\000\010\017\042\037\050\040\041\001\002\000\042\011" +
    "\uffd7\013\uffd7\015\uffd7\020\uffd7\021\uffd7\022\uffd7\023\uffd7" +
    "\024\uffd7\025\uffd7\027\uffd7\030\uffd7\031\060\032\062\033" +
    "\uffd7\034\uffd7\035\uffd7\001\002\000\036\011\uffd5\013\uffd5" +
    "\015\uffd5\020\uffd5\021\uffd5\022\uffd5\023\uffd5\024\uffd5\025" +
    "\uffd5\027\uffd5\030\uffd5\033\uffd5\034\uffd5\035\uffd5\001\002" +
    "\000\042\011\uffd8\013\uffd8\015\uffd8\020\uffd8\021\uffd8\022" +
    "\uffd8\023\uffd8\024\uffd8\025\uffd8\027\uffd8\030\uffd8\031\060" +
    "\032\062\033\uffd8\034\uffd8\035\uffd8\001\002\000\036\011" +
    "\uffd6\013\uffd6\015\uffd6\020\uffd6\021\uffd6\022\uffd6\023\uffd6" +
    "\024\uffd6\025\uffd6\027\uffd6\030\uffd6\033\uffd6\034\uffd6\035" +
    "\uffd6\001\002\000\036\011\uffe2\013\uffe2\015\uffe2\020\uffe2" +
    "\021\uffe2\022\uffe2\023\uffe2\024\uffe2\025\uffe2\027\uffe2\030" +
    "\uffe2\033\051\034\052\035\uffe2\001\002\000\032\011\uffdf" +
    "\013\uffdf\015\uffdf\020\uffdf\021\uffdf\022\uffdf\023\uffdf\024" +
    "\uffdf\025\uffdf\027\uffdf\030\uffdf\035\uffdf\001\002\000\036" +
    "\011\uffe3\013\uffe3\015\uffe3\020\uffe3\021\uffe3\022\uffe3\023" +
    "\uffe3\024\uffe3\025\uffe3\027\uffe3\030\uffe3\033\051\034\052" +
    "\035\uffe3\001\002\000\032\011\uffe0\013\uffe0\015\uffe0\020" +
    "\uffe0\021\uffe0\022\uffe0\023\uffe0\024\uffe0\025\uffe0\027\uffe0" +
    "\030\uffe0\035\uffe0\001\002\000\004\020\074\001\002\000" +
    "\042\011\uffd2\013\uffd2\015\uffd2\020\uffd2\021\uffd2\022\uffd2" +
    "\023\uffd2\024\uffd2\025\uffd2\027\uffd2\030\uffd2\031\uffd2\032" +
    "\uffd2\033\uffd2\034\uffd2\035\uffd2\001\002\000\010\015\ufff3" +
    "\027\ufff3\030\ufff3\001\002\000\004\027\077\001\002\000" +
    "\024\004\004\005\015\006\011\007\012\010\010\012\007" +
    "\016\016\027\uffee\037\013\001\002\000\004\027\101\001" +
    "\002\000\026\004\004\005\015\006\011\007\012\010\010" +
    "\012\007\016\016\027\uffee\030\uffee\037\013\001\002\000" +
    "\006\027\ufffb\030\ufffb\001\002\000\014\017\042\033\043" +
    "\034\044\037\050\040\041\001\002\000\016\021\112\022" +
    "\115\023\114\024\111\025\110\035\113\001\002\000\004" +
    "\011\106\001\002\000\022\007\012\010\010\012\007\015" +
    "\uffee\016\016\027\uffee\030\uffee\037\013\001\002\000\010" +
    "\015\ufff0\027\ufff0\030\ufff0\001\002\000\014\017\042\033" +
    "\043\034\044\037\050\040\041\001\002\000\014\017\042" +
    "\033\043\034\044\037\050\040\041\001\002\000\014\017" +
    "\042\033\043\034\044\037\050\040\041\001\002\000\014" +
    "\017\042\033\043\034\044\037\050\040\041\001\002\000" +
    "\014\017\042\033\043\034\044\037\050\040\041\001\002" +
    "\000\014\017\042\033\043\034\044\037\050\040\041\001" +
    "\002\000\006\011\uffe6\013\uffe6\001\002\000\006\011\uffea" +
    "\013\uffea\001\002\000\006\011\uffe9\013\uffe9\001\002\000" +
    "\006\011\uffe5\013\uffe5\001\002\000\006\011\uffe7\013\uffe7" +
    "\001\002\000\006\011\uffe8\013\uffe8\001\002\000\006\011" +
    "\uffeb\013\uffeb\001\002\000\004\013\126\001\002\000\022" +
    "\007\012\010\010\012\007\015\uffee\016\016\027\uffee\030" +
    "\uffee\037\013\001\002\000\010\015\uffef\027\uffef\030\uffef" +
    "\001\002\000\004\002\001\001\002\000\006\026\140\027" +
    "\141\001\002\000\004\027\136\001\002\000\004\023\134" +
    "\001\002\000\004\040\135\001\002\000\006\026\ufff5\027" +
    "\ufff5\001\002\000\026\004\004\005\015\006\011\007\012" +
    "\010\010\012\007\016\016\027\uffee\030\uffee\037\013\001" +
    "\002\000\006\027\ufffe\030\ufffe\001\002\000\004\037\133" +
    "\001\002\000\026\004\004\005\015\006\011\007\012\010" +
    "\010\012\007\016\016\027\uffee\030\uffee\037\013\001\002" +
    "\000\006\027\uffff\030\uffff\001\002\000\006\026\140\027" +
    "\ufff6\001\002\000\004\027\ufff7\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\142\000\010\002\005\003\013\004\004\001\001\000" +
    "\006\006\131\007\130\001\001\000\002\001\001\000\002" +
    "\001\001\000\012\011\124\012\103\014\045\016\044\001" +
    "\001\000\012\011\104\012\103\014\045\016\044\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\004\016\001\001" +
    "\000\004\005\017\001\001\000\002\001\001\000\002\001" +
    "\001\000\004\004\022\001\001\000\004\005\023\001\001" +
    "\000\002\001\001\000\002\001\001\000\004\010\027\001" +
    "\001\000\002\001\001\000\002\001\001\000\006\003\031" +
    "\004\004\001\001\000\002\001\001\000\006\003\033\004" +
    "\004\001\001\000\002\001\001\000\004\010\035\001\001" +
    "\000\002\001\001\000\002\001\001\000\010\012\046\014" +
    "\045\016\044\001\001\000\002\001\001\000\010\012\072" +
    "\014\045\016\044\001\001\000\006\014\070\016\044\001" +
    "\001\000\006\014\066\016\044\001\001\000\004\015\060" +
    "\001\001\000\004\013\052\001\001\000\002\001\001\000" +
    "\002\001\001\000\006\014\055\016\044\001\001\000\006" +
    "\014\053\016\044\001\001\000\002\001\001\000\004\013" +
    "\054\001\001\000\002\001\001\000\004\013\056\001\001" +
    "\000\002\001\001\000\004\016\064\001\001\000\002\001" +
    "\001\000\004\016\062\001\001\000\004\015\063\001\001" +
    "\000\002\001\001\000\004\015\065\001\001\000\002\001" +
    "\001\000\004\013\067\001\001\000\002\001\001\000\004" +
    "\013\071\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\006" +
    "\003\077\004\004\001\001\000\002\001\001\000\006\003" +
    "\101\004\004\001\001\000\002\001\001\000\010\012\123" +
    "\014\045\016\044\001\001\000\002\001\001\000\002\001" +
    "\001\000\004\004\106\001\001\000\002\001\001\000\010" +
    "\012\122\014\045\016\044\001\001\000\010\012\121\014" +
    "\045\016\044\001\001\000\010\012\120\014\045\016\044" +
    "\001\001\000\010\012\117\014\045\016\044\001\001\000" +
    "\010\012\116\014\045\016\044\001\001\000\010\012\115" +
    "\014\045\016\044\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\004\004\126\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\006\003\136\004\004" +
    "\001\001\000\002\001\001\000\006\006\143\007\142\001" +
    "\001\000\006\003\141\004\004\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Sintax$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Sintax$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Sintax$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    private Symbol s;
    
    public void syntax_error(Symbol s){
        this.s = s;
    }

    public Symbol getS(){
        return this.s;
}

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$Sintax$actions {
  private final Sintax parser;

  /** Constructor */
  CUP$Sintax$actions(Sintax parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$Sintax$do_action(
    int                        CUP$Sintax$act_num,
    java_cup.runtime.lr_parser CUP$Sintax$parser,
    java.util.Stack            CUP$Sintax$stack,
    int                        CUP$Sintax$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Sintax$result;

      /* select the action based on the action number */
      switch (CUP$Sintax$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 47: // FACTOR ::= Parentesis_a EXPRESION Parentesis_c 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("FACTOR",12, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 46: // FACTOR ::= Numero 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("FACTOR",12, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 45: // FACTOR ::= Identificador 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("FACTOR",12, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 44: // SUB_TERMINO ::= Diagonal FACTOR SUB_TERMINO 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SUB_TERMINO",11, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 43: // SUB_TERMINO ::= Asterisco FACTOR SUB_TERMINO 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SUB_TERMINO",11, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 42: // SUB_TERMINO ::= Diagonal FACTOR 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SUB_TERMINO",11, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 41: // SUB_TERMINO ::= Asterisco FACTOR 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SUB_TERMINO",11, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 40: // TERMINO ::= FACTOR SUB_TERMINO 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("TERMINO",10, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 39: // TERMINO ::= FACTOR 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("TERMINO",10, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 38: // SUB_EXPRESION ::= Menos TERMINO SUB_EXPRESION 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SUB_EXPRESION",9, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 37: // SUB_EXPRESION ::= Mas TERMINO SUB_EXPRESION 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SUB_EXPRESION",9, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 36: // SUB_EXPRESION ::= Menos TERMINO 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SUB_EXPRESION",9, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 35: // SUB_EXPRESION ::= Mas TERMINO 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SUB_EXPRESION",9, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 34: // EXPRESION ::= Menos TERMINO SUB_EXPRESION 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("EXPRESION",8, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 33: // EXPRESION ::= Mas TERMINO SUB_EXPRESION 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("EXPRESION",8, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 32: // EXPRESION ::= TERMINO SUB_EXPRESION 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("EXPRESION",8, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // EXPRESION ::= Menos TERMINO 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("EXPRESION",8, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // EXPRESION ::= Mas TERMINO 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("EXPRESION",8, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // EXPRESION ::= TERMINO 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("EXPRESION",8, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // CONDICION ::= EXPRESION MayorIgual EXPRESION 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("CONDICION",7, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // CONDICION ::= EXPRESION MenorIgual EXPRESION 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("CONDICION",7, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // CONDICION ::= EXPRESION Mayor EXPRESION 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("CONDICION",7, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // CONDICION ::= EXPRESION Menor EXPRESION 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("CONDICION",7, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // CONDICION ::= EXPRESION Diferente EXPRESION 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("CONDICION",7, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // CONDICION ::= EXPRESION Igual EXPRESION 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("CONDICION",7, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // CONDICION ::= Odd EXPRESION 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("CONDICION",7, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // SUB_INSTRUCCION ::= PuntoComa INSTRUCCION SUB_INSTRUCCION 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SUB_INSTRUCCION",3, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // SUB_INSTRUCCION ::= PuntoComa INSTRUCCION 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SUB_INSTRUCCION",3, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // INSTRUCCION ::= 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("INSTRUCCION",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // INSTRUCCION ::= While CONDICION Do INSTRUCCION 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("INSTRUCCION",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-3)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // INSTRUCCION ::= If CONDICION Then INSTRUCCION 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("INSTRUCCION",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-3)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // INSTRUCCION ::= Begin INSTRUCCION SUB_INSTRUCCION End 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("INSTRUCCION",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-3)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // INSTRUCCION ::= Begin INSTRUCCION End 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("INSTRUCCION",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // INSTRUCCION ::= Call Identificador 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("INSTRUCCION",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // INSTRUCCION ::= Identificador Asignacion EXPRESION 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("INSTRUCCION",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // DECLARACION ::= Identificador Igual Numero 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION",5, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // DECLARACION_MULTIPLE ::= DECLARACION Coma DECLARACION 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION_MULTIPLE",4, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // DECLARACION_MULTIPLE ::= DECLARACION Coma DECLARACION_MULTIPLE 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION_MULTIPLE",4, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // REP_IDENTIFICADORES ::= Coma Identificador REP_IDENTIFICADORES 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("REP_IDENTIFICADORES",6, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // REP_IDENTIFICADORES ::= Coma Identificador 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("REP_IDENTIFICADORES",6, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // BLOQUE ::= INSTRUCCION 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("BLOQUE",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // BLOQUE ::= Procedure Identificador PuntoComa BLOQUE PuntoComa BLOQUE 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("BLOQUE",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-5)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // BLOQUE ::= Var Identificador REP_IDENTIFICADORES PuntoComa BLOQUE 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("BLOQUE",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-4)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // BLOQUE ::= Var Identificador PuntoComa BLOQUE 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("BLOQUE",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-3)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // BLOQUE ::= Const DECLARACION_MULTIPLE PuntoComa BLOQUE 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("BLOQUE",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-3)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // BLOQUE ::= Const DECLARACION PuntoComa BLOQUE 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("BLOQUE",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-3)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // PROGRAMA ::= BLOQUE Punto 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("PROGRAMA",0, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= PROGRAMA EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).value;
		RESULT = start_val;
              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Sintax$parser.done_parsing();
          return CUP$Sintax$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}
