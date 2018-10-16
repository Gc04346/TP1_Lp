package Comando;
	
import Variavel.*;
import Expressao.*;
	 
public class ComandoIf extends Comando implements Condicao{
   
   int linhaEnd;
   int lin;
   Expressao exp;
 
   public ComandoIf(int lin, Expressao raizArvoreExpressao) {
      this.lin = lin;
      this.exp = raizArvoreExpressao;
   }
   
   public void setLinhaEnd(int lin){
      linhaEnd=lin;
   }
	
   public int executa( Memoria local, Memoria global) {
      if(exp.avalia(local, global) == 0){
         return linhaEnd;
      }
      return lin+1;
   }
}

