grammar bancop;

@header {
    package bancoPerguntas;
}

program :
    stat* EOF       // Zero or more repetitions of stat
    ;

stat:
    expr* NEWLINE   // Optative expr followed by an end-of-line
    ;

expr:
    multichoice                         
    | matching                             
    | shortQ                            
    | numeric                           
    | essay                             
                        
    ;

multichoice:
    'multi-choice' 'id' '=' id 'text' '=' title '{' NEWLINE
        multichoiceoption+               
    '}'                                 
    ; 

matching:
    'matching' 'id' '=' id 'text' '=' title '{' NEWLINE
        matchingoption+                  
    '}'                                 
    ;   
    
shortQ: //answer opcional
    'short' 'id' '=' id 'text' '=' title ('answer' '=' answer)? 
    ;   

numeric: //answer opcional
    'numeric' 'id' '=' id 'text' '=' title ('answer' '=' tipo = (NUMBER | FLOAT) )?      
    ;   

essay:
    'essay' 'id' '=' id 'text' '=' title
    ;

multichoiceoption:
    'option' 'id' '=' id 'text' '=' title NEWLINE
    ;
    

matchingoption:
    'option' 'id' '=' id 'text' '=' title 'side' '=' CORRECT 'match' '=' match NEWLINE                                 
    ;

match:
    id;

answer:
    STRING
    ;

title: 
    STRING
    ;

id:                      
    LETTERNUMBER
    ;

CORRECT: '"0"' | '"1"';

STRING:  '"' .*? '"';  // aceita aspas dentro de aspas

DIFFERENTIATOR: 'O'|'P';

FLOAT: [0-9]+('.'[0-9]+)?;     

NUMBER: [0-9]+;  

LETTERNUMBER: [A-Za-z0-9]+;

LETTERS: [A-Za-z]+;

COMMENT: '#' .*? '\n' -> skip;

NEWLINE: '\r'? '\n';

MULTICOMM: '##' .*? '##' '\n' -> skip;

WS: [ \t]+ -> skip;