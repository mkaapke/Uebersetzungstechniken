grammar Aufgabe3;

expr: INT | '(' expr ')' | expr '*' expr | expr '/' expr | expr '+' expr | expr '-' expr ;




INT: [0-9]+;
WS: [ \t\r\n]+ -> skip;