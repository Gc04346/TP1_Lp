   import java.io.*;  
   import java.util.*;
   import lp.*;

    @SuppressWarnings("unused")
	public class tiny {
   
       public static void main(String[] args) {
      
         Interpretador inter= new Interpretador("/home/daniel/Projetos/LP/TP1_Lp/Testes/proc1.tiny");
         //if (args.length == 1) {
            inter.leArquivo();
            inter.executa();
         //}
        // else if ((args.length == 2) && (args[1].equals("-l")))
        //    inter.listaArquivo();
      }
   }