package bancoPerguntas;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import classes.*;

public class bancopMain {
   public static void main(String[] args) {
      loadBancoPerguntas("");
   }
   
   public static HashMap<String, Question> loadBancoPerguntas(String filePath) {
      HashMap<String, Question> perguntasBanco = new HashMap<>();
      
      try {
         // create a CharStream that reads from standard input:
         CharStream input = CharStreams.fromFileName(filePath);
         // create a lexer that feeds off of input CharStream:
         bancopLexer lexer = new bancopLexer(input);
         // create a buffer of tokens pulled from the lexer:
         CommonTokenStream tokens = new CommonTokenStream(lexer);
         // create a parser that feeds off the tokens buffer:
         bancopParser parser = new bancopParser(tokens);
         // replace error listener:
         //parser.removeErrorListeners(); // remove ConsoleErrorListener
         //parser.addErrorListener(new ErrorHandlingListener());
         // begin parsing at program rule:
         ParseTree tree = parser.program();
         if (parser.getNumberOfSyntaxErrors() == 0) {
            // print LISP-style tree:
            // System.out.println(tree.toStringTree(parser));
            System.out.println("vou visitar");
            BancoPerguntasVisitor visitor0 = new BancoPerguntasVisitor();
            Boolean ret = visitor0.visit(tree);
            
            if (!ret) {
               return null;
            }
            Gerador g1 = new Gerador();
            
            perguntasBanco =g1.visit(tree);
            
            return perguntasBanco;
            // chamar o visitor de geração de perguntas
         }


      }
      catch(IOException e) {
         e.printStackTrace();
         return null;
      }
      catch(RecognitionException e) {
         e.printStackTrace();
         return null;
      }
      return null;
   }
}
