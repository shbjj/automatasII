
/*--------------- 1ra Area: Codigo de Usuario----------------*/
//------------> Paquetes, importaciones
package codigo;
import java_cup.runtime.Symbol;

%%
%class LexerCup
%type java_cup.runtime.Symbol
%cup
%full
%char
%column
%line
%unicode

//------------>Expreciones regulares
L=[a-zA-Z]+
D=[0-9]+
Du=[0-9]
espacio=[ \t\r\n]+

//------------>Estados
%{
    private Symbol symbol(int type, Object value)
    {
        return new Symbol(type, yyline, yycolumn, value);
    }
    private Symbol symbol(int type)
    {
        return new Symbol(type, yyline, yycolumn);
    }
    
%}
%%

/*--------------- 3ra Area: Reglas Lexicas----------------*/

//------------> Simbolos
const       {return new Symbol(sym.Const , yychar, yyline, yytext());}
var         {return new Symbol(sym.Var , yychar, yyline, yytext());}
procedure   {return new Symbol(sym.Procedure , yychar, yyline, yytext());}
call        {return new Symbol(sym.Call , yychar, yyline, yytext());}
if          {return new Symbol(sym.If , yychar, yyline, yytext());}
then        {return new Symbol(sym.Then , yychar, yyline, yytext());}
while       {return new Symbol(sym.While , yychar, yyline, yytext());}
do          {return new Symbol(sym.Do , yychar, yyline, yytext());}
odd         {return new Symbol(sym.Odd , yychar, yyline, yytext());}
end         {return new Symbol(sym.End , yychar, yyline, yytext());}
begin         {return new Symbol(sym.Begin , yychar, yyline, yytext());}


{espacio} {/*Ignore*/}
"//".* {/*Ignore*/}
(\/\*([^*]|[\r\n]|(\*+([^*/]|[\r\n])))*\*+\/)|(\/\/.*) {/*Ignore*/}
">="    {return new Symbol(sym.MayorIgual , yychar, yyline, yytext());}
"("    {return new Symbol(sym.Parentesis_a , yychar, yyline, yytext());}
")"    {return new Symbol(sym.Parentesis_c , yychar, yyline, yytext());}
"<="    {return new Symbol(sym.MenorIgual , yychar, yyline, yytext());}
"="     {return new Symbol(sym.Igual , yychar, yyline, yytext());}
">"     {return new Symbol(sym.Mayor , yychar, yyline, yytext());}
"<"     {return new Symbol(sym.Menor , yychar, yyline, yytext());}
"\,"    {return new Symbol(sym.Coma , yychar, yyline, yytext());}
";"     {return new Symbol(sym.PuntoComa , yychar, yyline, yytext());}
"."     {return new Symbol(sym.Punto , yychar, yyline, yytext());}
"*"     {return new Symbol(sym.Asterisco , yychar, yyline, yytext());}
"/"     {return new Symbol(sym.Diagonal , yychar, yyline, yytext());}
"+"     {return new Symbol(sym.Mas , yychar, yyline, yytext());}
"-"     {return new Symbol(sym.Menos , yychar, yyline, yytext());}
"#"     {return new Symbol(sym.Diferente , yychar, yyline, yytext());}
":="    {return new Symbol(sym.Asignacion , yychar, yyline, yytext());}


{L}({L}|{D}|"_")*   {return new Symbol(sym.Identificador , yychar, yyline, yytext());}
{D}+                {return new Symbol(sym.Numero , yychar, yyline, yytext());}
 .                  {return new Symbol(sym.ERROR , yychar, yyline, yytext());}