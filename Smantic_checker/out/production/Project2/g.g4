grammar g;
program: 'class Program''{' field_decl* method_decl*'}'EOF;
field_decl:type (ID|ID'['Int_literal']')(','(ID|ID'['Int_literal']'))*';';
method_decl:(type|'void')ID'('((type ID)(','type ID)*)?')'block;
block:'{'var_decl*statement*'}';
var_decl:type(ID(','ID)*)';';
type:'int'|'boolean';
statement:location assign_op expr';'
        |method_call';'
        |'if''('expr')'block('else'block)?
        |'for' ID '=' expr','expr block
        |'return' expr?';'
        |'break'';'
        |'continue'';'
        |block;
assign_op: '='|'+='|'-=';
method_call:(method_name '(' (expr(','expr)* )? ')')|('callout''('String_literal(','callout_arg(',' callout_arg)*)?')');
method_name:ID;
location: ID|ID'['expr']';
expr:   location
        |method_call
        |literal
        |expr bin_op expr
        |'-'expr
        |'!'expr';'
        |'('expr')';
callout_arg: expr|String_literal;
bin_op: arith_op|rel_op|eq_op|cond_op;
arith_op: '+'|'-'|'*'|'/'|'%';
rel_op: '<'|'>'|'<='|'>=';
eq_op: '=='|'!=';
cond_op: '&&'|'||';
literal: Int_literal|Char_literal|Bool_literal|String_literal;

Int_literal: Decimal_literal|Hex_literal;
Decimal_literal: DIGIT+;
Bool_literal: 'true'|'false';
ID: ALPHA (ALPHA|DIGIT)*;
fragment ALPHA: [a-zA-Z]|'_';
Hex_literal: '0x'[0-9a-fA-F]+;
DIGIT: [0-9];
Char_literal: '\''CHAR'\'';
String_literal: '"'CHAR*'"';
fragment CHAR: (ALPHA|DIGIT|' '| '!' | '\\"' | '#' | '$' | '%' | '&'  | '(' | ')' | '*' | '+' | ',' | '-' | '.'| '\\\''
                | '/' | ':' | ';' | '<' | '=' | '>' | '?' | '@' | '['  | ']' | '^' | '_' | '`'| '{' | '|' | '}' | '~'
                |'\\n'|'\\t'|'\\\\');
COMMENT1: ('//' .*? (('\n')|EOF))->skip;
WHITESPACE: [ \t\n] -> skip;

