import java.io.*;  
import java.util.*;

import lp.*; 

class Interpretador {
   private ArquivoFonte arq; // Arquivos fontes.
   private Vector comandos; // Conjunto de comandos.
   private String palavraAtual; // Provavelmente o comando que está sendo lido.
   		
   public Interpretador(String nome) {
      arq= new ArquivoFonte(nome);
      comandos= new Vector();
   }
   
   public void listaArquivo() {
      String palavra;
      
      do {
         palavra= arq.proximaPalavra();
         System.out.println ("Palavra: " + palavra);
      } while (!palavra.equals("EOF"));
   }
   
   // Lendo o arquivo fonte.
   public void leArquivo() {
      String comandoAtual;
      int linha= 0;
      do {
         comandoAtual= arq.proximaPalavra();
            
         if(comandoAtual.equals("endp")){
            trataComandoEndp(linha);
            linha++;
         }
         else if(comandoAtual.equals("writeln")){
            trataComandoWriteln(linha);
            linha++;
         }else if(comandoAtual.equals("writeStr")){
             trataComandoWriteStr(linha);
             linha++;
         }
                           		  
      } while (!comandoAtual.equals("endp"));
   }
   
   // Tratamento dos comandos.
   private void trataComandoEndp(int lin) {
      ComandoEndp c= new ComandoEndp(lin);
      comandos.addElement(c);
   }
   	   	
   private void trataComandoWriteln(int lin) {
      ComandoWriteln c= new ComandoWriteln(lin);
      comandos.addElement(c);
   }
   
   private void trataComandoWriteStr(int lin){
        // Lendo os tokens esperados.
        String primParen = arq.proximaPalavra();
        String string = arq.proximaPalavra();
        String segParen = arq.proximaPalavra();

        // Verificando os tokens.
        if(!primParen.equals("(")){
            System.out.println("Erro de Sintaxe !!");
        }else if(!segParen.equals(")")){
            System.out.println("Erro de Sintaxe !!");
        }

       ComandoWriteStr c = new ComandoWriteStr(lin, string);
       comandos.addElement(c);
   }
      
   
   public void executa() {
      
      Comando cmd;
      int pc= 0;
      do {
         cmd= (Comando) comandos.elementAt(pc);
         pc= cmd.executa();
      } while (pc != -1);
   }   
}
