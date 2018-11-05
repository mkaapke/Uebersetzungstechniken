grammar Aufgabe2;

prog: stat+;

stat: expr;

expr: term ((('+' | '-') term)+)?;

term: fact ((('*' | '/') fact)+)?;

fact: ('+' fact) | ('-' fact) | '(' expr ')' | INT;

INT: [0-9]+;
WS: [ \t\r\n]+ -> skip;