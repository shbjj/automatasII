package codigo;
import static codigo.Tokens.*;
%%
%class Lexer
%type Tokens
L=[a-zA-Z]+
D=[0-9]+
Du=[0-9]
espacio=[ \t\r\n]+
%{
    public String lexeme;
%}
%%
const |
var |
procedure |
call |
if |
then |
while |
do |
odd {lexeme = yytext(); return Reservadas;}
{espacio} {/*Ignore*/}
"//".* {/*Ignore*/}
(\/\*([^*]|[\r\n]|(\*+([^*/]|[\r\n])))*\*+\/)|(\/\/.*) {/*Ignore*/}
">=" {lexeme=yytext(); return MayorIgual;}
"<=" {lexeme=yytext(); return MenorIgual;}
"=" {lexeme=yytext(); return Igual;}
">" {lexeme=yytext(); return Mayor;}
"<" {lexeme=yytext(); return Menor;}
"\," {lexeme=yytext(); return Coma;}
";" {lexeme=yytext(); return PuntoComa;}
"." {lexeme=yytext(); return Punto;}
"*" {lexeme=yytext(); return Asterisco;}
"/" {lexeme=yytext(); return Diagonal;}
"+" {lexeme=yytext(); return Mas;}
"-" {lexeme=yytext(); return Menos;}
"#" {lexeme=yytext(); return Diferente;}
":=" {lexeme=yytext(); return Asignacion;}
.dd | o.d | od. | ODD | oDD  | oDd | ODd  | "odd"{Du} {lexeme=yytext(); return errorOdd;}
.onst | c.nst |co.st | con.t | cons.  | CONST | CONSt | cONST | CoNST |  COnST | CONsT | "const"{Du} |
CONst | COnsT | ConST | coNST | cONSt | cONsT | cOnST | CoNSt | CoNsT | COnSt | 
COnst | ConsT | cONst | coNSt | conST | ConSt | ConSt | CoNst | cOnsT | cOnSt | coNsT | cosnt | conts {lexeme=yytext(); return errorConst;}
.all | c.ll | ca.l | cal. | "call"{Du} |
CALL | CALl | CAlL | CaLL | cALL |
cALl | cAlL | caLL | CaLl | CalL | CAll | cAlL | cALl {lexeme=yytext(); return errorCall;}
.hen | t.en | th.n | the. | "then"{Du} |
tehn | ten |
THEN |
THEn | THeN | ThEN | tHEN |
tHEn | THen |  tHeN | thEN | ThEn | TheN  {lexeme=yytext(); return errorThen;}
.hile | w.ile | wh.le | whi.e  | whil. | "while"{Du} |
WHILE | wile | wihle | wilhe {lexeme=yytext(); return errorWhile;}
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
PROCEDurE | PROCEDuRe | PROCEDUre | "procedure"{Du}   {lexeme=yytext(); return errorProcedure;}
"_"({L}|{D}|"_")+ | {D}+{L}+({L}|"_"|{D})* {lexeme=yytext(); return errorIdentificador;}
{D}+(".")+({D}|".")* {lexeme=yytext(); return errorNumero;}
"/*"({L}|{D}|{espacio})* {lexeme=yytext(); return errorComentario;}
{L}({L}|{D}|"_")* {lexeme=yytext(); return Identificador;}
{D}+ {lexeme=yytext(); return Numero;}

 . {lexeme=yytext(); return ERROR;}