package Quiz;

import java.io.IOException;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.*;
import org.stringtemplate.v4.*;

public class quizMain {
   public static void main(String[] args) {
      if (args.length != 1) {
         System.err.println("Erro! Número de argumentos inválido.");
         System.out.println("java Quiz.quizMain <caminho para o ficheiro com o código a compilar>");
         System.exit(1);
      }

      // no futuro podemos ter um segundo argumento com o nome do ficheiro de output

      try {
         System.out.println("Entrei");
         // create a CharStream that reads from standard input:
         CharStream input = CharStreams.fromFileName(args[0]);
         // create a lexer that feeds off of input CharStream:
         quizLexer lexer = new quizLexer(input);
         // create a buffer of tokens pulled from the lexer:
         CommonTokenStream tokens = new CommonTokenStream(lexer);
         // create a parser that feeds off the tokens buffer:
         quizParser parser = new quizParser(tokens);
         // replace error listener:
         //parser.removeErrorListeners(); // remove ConsoleErrorListener
         //parser.addErrorListener(new ErrorHandlingListener());
         // begin parsing at program rule:
         ParseTree tree = parser.program();
         if (parser.getNumberOfSyntaxErrors() == 0) {
            // print LISP-style tree:
            // System.out.println(tree.toStringTree(parser));
            System.out.println("Vai começar a semantica");
            QuizSemantic visitor0 = new QuizSemantic();
            Boolean ret = visitor0.visit(tree);
            System.out.println(ret);
            if (!ret){
               System.err.println("ERRO NÃO PASSA NA SEMANTICA");
               System.exit(1);
            }
            System.out.println("Passou, vou compilar");
            Compiler visitor2 = new Compiler();
            //aqui o prof faz o (visitor da semantica). 
            //nos fazemos antes é igual corre agora okok ele n cria porque ainda da erro, mas 
            
            String outputLang = "java";
            if (!visitor2.validTarget(outputLang)) {
               System.out.println("errroooo");
               System.exit(1);
            }
            visitor2.setTarget(outputLang);
            ST code = visitor2.visit(tree);

            String outputFileName = "output";

            String outputFileExtension =  "." + outputLang;

            String outputFile = outputFileName + outputFileExtension;
            //vou ver uma cena
            //Deve ser no stg do daniel gomes ele tem algo que nos nao
            //ja percebi, eu acho que o module inicial tem que ter o parametro name, vou exerpimentar 
            try {
               code.add("name", outputFileName);
               PrintWriter pw = new PrintWriter(new File(outputFile));
               pw.print(code.render());
               pw.close();

            } catch (FileNotFoundException e) {
               System.err.println("Could not write code to the file");
               System.exit(1);
            }
            //se houver erros o programa morre antes, o vosso visitor não retorna boolean
            //frosty isso nao é so no quizSemantic que há essa validação | acho que sim yh
         }
      }
      catch(IOException e) {
         e.printStackTrace();
         System.exit(1);
      }
      catch(RecognitionException e) {
         e.printStackTrace();
         System.exit(1);
      }
   }
}