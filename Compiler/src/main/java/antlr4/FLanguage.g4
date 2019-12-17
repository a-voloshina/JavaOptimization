grammar FLanguage;

WS : [ \t\r\n]+ -> skip ;
INT : [0-9]+;
BOOL : 'true' | 'false';
STRING : '"'.*?'"';
TYPE : 'int' | 'bool' | 'string';
ID : [a-zA-Z][0-9_a-zA-Z]* | '_'[a-zA-Z0-9][0-9_a-zA-Z]*;

prog : statement*;
statement : (expression | print | varDeclaration | varAssign | varInit)';' | ifCondition | whileLoop | block;
print : 'print' '(' (var = printVariable | expr = expression) ')';
expression : arithm | logic | string;
arithm : arithm ('*' | '/') arithm      # MultDiv
    | arithm ('+' | '-') arithm         # AddSub
    | '-' arithm                        # UnaryMinus
    | variable                          # IntVariable
    | INT                               # IntLiteral
    | '(' arithm ')'                    # Subexpr
    ;
logic: cmp                              # Compare
    | strEqual                          # StrEquals
    | logic ('==' | '!=') logic         # LogEqual
    | logic '&&' logic                  # And
    | logic '||' logic                  # Or
    | variable                          # BoolVariable
    | BOOL                              # BoolLiteral
    ;
cmp : arithm sign=('<' | '>' | '<=' | '>=' | '==' | '!=') arithm;
strEqual : string ('==' | '!=') string;
string : variable                       # StringVariable
    | STRING                            # StringLiteral
    ;

block : '{' statement* '}' ;
ifCondition : 'if' '(' condition = logic ')' thenBlock = block ( 'else' elseBlock = block )?;
whileLoop : 'while' '(' condition = logic ')' body = block;

printVariable: var = variable;

varDeclaration : type = TYPE name = ID;
varAssign : name = ID '=' expression;
varInit : type = TYPE name = ID '=' expression;
variable : name = ID;