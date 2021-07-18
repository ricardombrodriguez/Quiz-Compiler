## Group members
&nbsp;

| NMec | Name | email | Contribution (%) | Detailed contribution [1]
|:-:|:--|:--|:-:|:--|
| 97505 | Alexandre Serras   | alexandreserras@ua.pt | 20% | <br><br>)|
| 98430 | Paulo Pereira      | paulogspereira@ua.pt  | 20% | <br><br>)|
| 98474 | João Reis          | joaoreis16@ua.pt  | 20% | <br><br>)|
| 98388 | Ricardo Rodriguez  | ricardorodriguez@ua.pt | 20% | <br><br>)|
| 98008 | Gonçalo Leal       | goncalolealsilva@ua.pt | 20% | <br><br>)|

[1] Topics:<br>
   primary-grammar (%)<br>primary-semantic-analysis (%)<br>code-generation (%)<br>secondary-grammar (%)<br>secondary-semantic-analysis (%)<br>secondary-interpretation/secondary-code-generation (%)<br>examples (%)<br>testing (%)<br>other (%) (Classes like Quiz,Option,Question and its derivates)

- Beware that within the group the sum for each topic must be 100% (obviously).

## Material to be evaluated

- Todo o material que se encontra no master branch é suposto ser considerado para avaliação.
- Na pasta *examples*, estão apenas os ficheiros de exemplo da nossa linguagem.
- Na pasta *src*, encontram-se 3 grupos: um para as classes em java que utilizamos como suporte à geração (*classes*), um para a gramática principal (*Quiz*) e outro para a gramática secundária (*bancoPerguntas*), bem como um ficheiro *java.stg*.
- O ficheiro de geração de código *output.java* encontra-se na pasta *src*, tal como o relatório do Quiz realizado no ficheiro *ret.txt*.

## Compilation & Run

- Para compilar e correr o nosso código, tem de estar dentro do diretório *src*.
- Primeiro, deve-se introduzir o comando *antlr4-build*, seguido de *javac Quiz.quizMain ../examples/nome_do_exemplo.quiz*.
- Por fim, para testar o código gerado, introduz-se *javac output.java* e de seguida *java output* para correr o Quiz.
- Em alternativa, pode utilizar o script BASH disponibilizado que recebe como argumento o nome do exemplo que pretende testar.

## Working examples (at least two)

Use examples to show the language functionalities.

1. ./examples/exemplo1.quiz

    Exemplo1,exemplo1.quiz, é criado um quiz, sem correção automática e onde não é utilizado o banco de perguntas
    Para correr:
         

2. ./examples/exemplo2.quiz
     Exemplo2,exemplo2.quiz, é criado um quiz, com correção automática logo precisa de indicar-se qual a cotação
     e onde  é utilizado a banco de perguntas para ir buscar algumas das perguntas utilizadas neste quiz
       Para correr:
...

## Semantic error examples

1. ./examples/erro.quiz

    - Não existir perguntas com o mesmo id
    - Não existir opções com o mesmo id dentro da mesma pergunta
    - É obrigatório que a primeira linha de código seja a criação do quiz
    - A última linha de código tem que ser para finalizar o quiz
    - Só pode haver uma vez a linha para criar um quiz
    - Perguntas sem cotação não podem estar em quiz auto-corrective
    - Perguntas essay não podem ser utilizadas em quiz auto-corrective
    - Nas perguntas de match é necessário verificar que as opções tem todas um correspondente do outro lado
    - Quando se quer adicionar opções temos que verificar se a pergunta a que se pretende atribuir aquela opção pode receber opções
    - Não pode haver grupos repetidos
    - Verificar se a pergunta indicada  existe
    - Verificar se a opção indicada existe
    - Não pode haver perguntas repetidas no mesmo grupo
    - No load de bancos de dados é necessário ver se o banco existe
    - Quando se faz get answer de uma pergunta é necessário já haver uma resposta
    - A opção tem de ser do mesmo tipo da pergunta
    - Quando se vai escolher perguntas de uma banco de dados, temos de ver se primeiro já foi importado
    
*Alguns dos exemplos indicados acima podem ser vistos correndo o ficheiro erro.quiz*

