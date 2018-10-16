package Comando;
   
import Variavel.*;
import Expressao.*;
    
public class ComandoAtrib extends Comando {
   
   char variavel;
   Expressao exp;
      
   public ComandoAtrib(int lin, char var, Expressao raizArvoreExpressao) {
      linha = lin;
      this.variavel = var.charAt(0);
      this.exp = raizArvoreExpressao;
   }
   
   public int executa( Memoria local, Memoria global) {
      int varPosicao = variavel - 97; // Inteiro que representa a variável na tabela ascii.

      if( (local.var[varPosicao] == -1) && (global.var[varPosicao] == -1)){
         System.out.println("Variavel nao declarada.");
      }  

      if( local.var[varPosicao] != -1 ){
         local.var[varPosicao] = exp.avalia(local, global);
      }else{
         global.var[varPosicao] = exp.avalia(local, global);
      }

      return linha+1; // Retornamos a próxima linha para o prosseguimento da execução.
   }
}