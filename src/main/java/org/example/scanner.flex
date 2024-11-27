import java_cup.runtime.*;

%%

%class Lexer
%cup

%x STRING

%%

"print"                        { return new Symbol(sym.PRINT_T); }
"scope"                        { return new Symbol(sym.SCOPE_T); }
"{"                            { return new Symbol(sym.OBRACKET_T); }
"}"                            { return new Symbol(sym.CBRACKET_T); }
"="                            { return new Symbol(sym.ASSIGN); }
[a-zA-Z_][a-zA-Z0-9_]*         { return new Symbol(sym.ID, yytext()); }
[1-9][0-9]*                    { return new Symbol(sym.NUMBER, Integer.parseInt(yytext())); }
[0]                            { return new Symbol(sym.NUMBER, Integer.parseInt(yytext())); }
[ \t\n]+                       { /* Ignore whitespace */ }
.                              { throw new Error("Unexpected character: " + yytext()); } // Optional: Throw error
