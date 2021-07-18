grammar quiz;

@header {
    package Quiz;
}

program :
    stat* EOF       // Zero or more repetitions of stat
    ;

stat:
    expr* NEWLINE    // Optative expr followed by an end-of-line
    ;

expr:
    quiz                |
    add                 |
    multichoice         |
    matching            |
    evaluation          |
    remove              |
    defineAnswer        |
    showGroup           |
    import_expr         |
    showOpt             |
    load                |
    shortQuestion       | 
    numeric             |
    essay               |
    createReport        |  
    option              |
    finishQuiz          
    ;

quiz:// quiz <nome do quiz> correção é opcional
    'create quiz' 'title' '=' STRING                                #CreateQuiz |
    'create quiz' 'title' '=' STRING 'auto-corrective' NUMBER       #CreateQuizCorrection
    ;
createReport:
    'create' 'report'
    ;

add: //add group Desporto  opcao1  || add o5 to P1, P2 || ADD NUMBER 'to' all || add P1,P2 to G1,G2
    'add group' NAME  NEWLINE                                       #CreateGroup |
    'add group' NAME(','NAME)*  NEWLINE                             #CreateMultiGroup |
    'add' NAME 'to' sub_question  NEWLINE                           #AddOption |
    'add' NAME 'to' 'all'        NEWLINE                            #AddAll|
    'add' sub_question 'to' 'group' sub_groups  NEWLINE             #AddQuestion2Group
    ;

sub_question:
        NAME(','NAME)*
    ;

sub_groups:
        NAME(','NAME)*
    ;

load : //load "PATH" as b1
    'load' STRING 'as' NAME                                         #LoadBanco
    ;

remove://remove o2 from P2
    'remove' NAME 'from' NAME                                       #Eliminar
    ;

defineAnswer:
    'define-answer' NAME 'to' sub_question                          #DefinirResposta
    ;

defineMark:
    'define-mark' mark 'to' NAME NEWLINE                                    #DefinirCotacaoSemDesconto|
    'define-mark' mark 'to' NAME 'if' 'wrong' 'show' NAME  NEWLINE          #DefinirCotacaoMudaPergunta  |
    'define-mark' mark 'to' NAME  'if' 'wrong' 'repeat' NUMBER 'times' 'discount' '='  mark      NEWLINE         #DefinirCotacaoDescontar
    ;
mark:
    FLOAT | NUMBER
    ;
showGroup:
        'show' 'group' NAME '{'(NEWLINE)? showOpt* (NEWLINE)?'}' 
        ;

showOpt:
    show                |
    shuffle             |
    getAnswer           |
    getChoice           |
    getAnswerToChoice   
    ;

evaluation:
    'evaluation' 'group' NAME '{' NEWLINE   defineMark*  '}'                     #Avaliar 
    ;

multichoice:
    'multi-choice' 'id' '=' NAME 'text' '=' title '{' NEWLINE
        multichoiceoption+               
    '}'                                 
    ; 
multichoiceoption: 
       'option' 'id' '='NAME 'text' '='STRING NEWLINE
    ;


matching:
    'matching' 'id' '=' NAME 'text' '=' title '{' NEWLINE 
        matchingoption+                  
    '}'                                 
    ; 

matchingoption:
    'option' 'id' '='  NAME 'text' '=' title 'side' '=' CORRECT ('match' '=' match)? NEWLINE                       
    ;

match:
    NAME;

import_expr: //  'from' banco_dados 'import' ID 'as' ID;
    'from' NAME 'import' plist; // ter a opção de adicionar uma lista de perguntas

plist:
    p (',' p)*;
    
p:
    NAME
    | NAME 'as' NAME;


show://show P1|show P1 with o1, o3, o4|show P3 with o2, o3, o4, o6 and P2
    'show' NAME      NEWLINE                                  #ShowQuestionBasic
    |'show' NAME ques_opt    NEWLINE                          #ShowQuestionMultiOpt
    |'show' question ('and' question)*  NEWLINE               #ShowQuestionMultiOptandQuestion
    ;

question:
    NAME ques_opt?
    ;

ques_opt:
    ('with' NAME(',' NAME)*)
    ;

shuffle: //shuffle P2
    'shuffle' NAME  NEWLINE                                 #ShuffleQuestion
    ;

getAnswer://get answer to P1
    'get' 'answer' 'to' NAME NEWLINE                               #GetAnswerNum
    ;

getChoice://get choice vai buscar qual das perguntas quer responder
    'get' 'choice' question 'and' question
    ;

getAnswerToChoice://get answer to choice  
    'get' 'answer' 'to' 'choice'                 
    ;

shortQuestion:
    'short-question' 'id' '=' NAME 'text' '=' STRING ('answer' '=' STRING (',' 'answer' '=' STRING)*)? NEWLINE         #respostaCurta
    //pode ter mais do que uma resposta aceitável
    ;   

numeric:
    'numeric-question' 'id' '=' NAME 'text' '=' title ('answer' '=' mark)?     #NumericQuestion 
    ;   

essay:
    'essay-question' 'id' '='  NAME 'text' '=' STRING         #EssayQuestion
    ;
option:
    optionMult
    ;
optionMult:
    'option-multi' 'id' '=' NAME 'text' '=' STRING  NEWLINE
    ;
finishQuiz:
    'finish quiz'
    ;
//
title: 
    STRING
    ;

CORRECT: '"0"' | '"1"';

NUMBER:
    [0-9]+ ;

FLOAT:
    [0-9]+('.'[0-9]+)?;

NAME:
    [A-Za-z0-9_-]+; 

STRING:
    '"' .*? '"';
COMMENT: '#' .*? '#' -> skip;
NEWLINE: '\r'? '\n';
MULTICOMM: '##' .*? '##' '\n'* -> skip;
WS: [ \t]+ -> skip;