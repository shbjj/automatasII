/*--------------- 1ra Area: Codigo de Usuario----------------*/
//------------> Paquetes, importaciones
package codigo;
import static codigo.Tokens.*;

%%
%class Lexer
%type Tokens
%char
%column
%full
%line
%unicode

//------------>Expreciones regulares
L=[a-zA-Z]+
D=[0-9]+
Du=[0-9]
espacio=[ \t\r\n]+

//------------>Estados
%{
    public String lexeme;
    public int linea;
    public int columna;
    
%}
%%

/*--------------- 3ra Area: Reglas Lexicas----------------*/

//------------> Simbolos
const |
var |
procedure |
call |
if |
then |
while |
do |
odd {lexeme = yytext(); linea=(yyline+1); columna=(yycolumn+1); return Reservadas;}
{espacio} {/*Ignore*/}
"//".* {/*Ignore*/}
(\/\*([^*]|[\r\n]|(\*+([^*/]|[\r\n])))*\*+\/)|(\/\/.*) {/*Ignore*/}
">=" {lexeme=yytext();  linea=(yyline+1); columna=(yycolumn+1); return MayorIgual;}
"<=" {lexeme=yytext();  linea=(yyline+1); columna=(yycolumn+1); return MenorIgual;}
"=" {lexeme=yytext();  linea=(yyline+1); columna=(yycolumn+1); return Igual;}
">" {lexeme=yytext();  linea=(yyline+1); columna=(yycolumn+1); return Mayor;}
"<" {lexeme=yytext();  linea=(yyline+1); columna=(yycolumn+1); return Menor;}
"\," {lexeme=yytext();  linea=(yyline+1); columna=(yycolumn+1); return Coma;}
";" {lexeme=yytext();  linea=(yyline+1); columna=(yycolumn+1); return PuntoComa;}
"." {lexeme=yytext();  linea=(yyline+1); columna=(yycolumn+1); return Punto;}
"*" {lexeme=yytext();  linea=(yyline+1); columna=(yycolumn+1); return Asterisco;}
"/" {lexeme=yytext();  linea=(yyline+1); columna=(yycolumn+1); return Diagonal;}
"+" {lexeme=yytext();  linea=(yyline+1); columna=(yycolumn+1); return Mas;}
"-" {lexeme=yytext();  linea=(yyline+1); columna=(yycolumn+1); return Menos;}
"#" {lexeme=yytext();  linea=(yyline+1); columna=(yycolumn+1); return Diferente;}
":=" {lexeme=yytext();  linea=(yyline+1); columna=(yycolumn+1); return Asignacion;}
.dd | o.d | od. | ODD | oDD  | oDd | ODd  | "odd"{Du} {lexeme=yytext();  linea=(yyline+1); columna=(yycolumn+1); return errorOdd;}
.onst | c.nst |co.st | con.t | cons.  | CONST | CONSt | cONST | CoNST |  COnST | CONsT | "const"{Du} |
CONst | COnsT | ConST | coNST | cONSt | cONsT | cOnST | CoNSt | CoNsT | COnSt | 
COnst | ConsT | cONst | coNSt | conST | ConSt | ConSt | CoNst | cOnsT | cOnSt | coNsT | cosnt | conts {lexeme=yytext();  linea=(yyline+1); columna=(yycolumn+1); return errorConst;}
.all | c.ll | ca.l | cal. | "call"{Du} |
CALL | CALl | CAlL | CaLL | cALL |
cALl | cAlL | caLL | CaLl | CalL | CAll | cAlL | cALl {lexeme=yytext();  linea=(yyline+1); columna=(yycolumn+1); return errorCall;}
.hen | t.en | th.n | the. | "then"{Du} |
tehn | ten |
THEN |
THEn | THeN | ThEN | tHEN |
tHEn | THen |  tHeN | thEN | ThEn | TheN  {lexeme=yytext();  linea=(yyline+1); columna=(yycolumn+1); return errorThen;}
.hile | w.ile | wh.le | whi.e  | whil. | "while"{Du} |
WHILE | wile | wihle | wilhe {lexeme=yytext();  linea=(yyline+1); columna=(yycolumn+1); return errorWhile;}
.rocedure | p.ocedure | pr.cedure | pro.edure | proc.dure | proce.ure | proced.re | procedu.e |
 procedur. | PROCEDURE | .ROCEDURE | P.OCEDURE | PR.CEDURE | PRO.EDURE | PROC.DURE | PROCE.URE | 
PROCED.RE | PROCEDU.E | PROCEDUR. | PRocedure | PrOcedure | ProCedure | ProcEdure | ProcEdure | 
ProceDure | ProcedUre | ProceduRe | ProcedurE | pROcedure | pRoCedure | pRocEdure | pRoceDure | 
pRocedUre | pRoceduRe | pRocedurE | pROcedure | prOCedure | prOcEdure | prOceDure | prOcedUre | 
prOceduRe | prOcedurE | proCedure | pRoCedure | proCEdure | proCeDure | proCedUre | proCeduRe | 
proCedurE | procEdure | procEDure | procEdUre | procEduRe | procEdurE | proceDure | proceDUre | 
proceDuRe | proceDurE | procedUre | procedURe | procedUrE | proceduRe | proceduRE | PrOCEDURE | 
PRoCEDURE | PROcEDURE | PROCeDURE | PROCEdURE | PROCEDuRE | PROCEDUrE | PROCEDURe | ProCEDURE | 
PrOcEDURE | PrOCeDURE | PrOCEdURE | PrOCEDuRE | PrOCEDUrE | PrOCEDURe | PRocEDURE | PRoCeDURE | 
PRoCEdURE | PRoCEDuRE | PRoCEDUrE | PRoCEDURe | PROceDURE | PROcEdURE | PROcEDuRE | PROcEDUrE | 
PROcEDURe | PROCedURE | PROCeDuRE | PROCeDUrE | PROCeDURe | PROCEduRE | PROCEdUrE | PROCEdURe | 
PROCEDurE | PROCEDuRe | PROCEDUre | "procedure"{Du}   {lexeme=yytext();  linea=(yyline+1); columna=(yycolumn+1);  return errorProcedure;}
"_"({L}|{D}|"_")+ | {D}+{L}+({L}|"_"|{D})* {lexeme=yytext();  linea=(yyline+1); columna=(yycolumn+1); return errorIdentificador;}
{D}+(".")+({D}|".")* {lexeme=yytext();  linea=(yyline+1); columna=(yycolumn+1); return errorNumero;}
"/*"({L}|{D}|{espacio})* {lexeme=yytext();  linea=(yyline+1); columna=(yycolumn+1); return errorComentario;}
{L}({L}|{D}|"_")* {lexeme=yytext();  linea=(yyline+1); columna=(yycolumn+1); return Identificador;}
{D}+ {lexeme=yytext();  linea=(yyline+1); columna=(yycolumn+1); return Numero;}

 . {lexeme=yytext();  linea=(yyline+1); columna=(yycolumn+1); return ERROR;}