grammar Aufgabe1;


expr: term | expr '+' term | expr '-' term;

term: fact | term '*' fact | term '/' fact;

fact: INT | '(' expr ')';

INT: [0-9]+;
WS: [ \t\r\n]+ -> skip;