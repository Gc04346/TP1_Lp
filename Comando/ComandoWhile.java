package Comando;
	
import Variavel.*;
import Expressao.*;
	 
public class ComandoWhile extends Comando{
   
   int linhaEnd;
   int lin;
   Expressao exp;
 
   public ComandoWhile(int lin, Expressao raizArvoreExpressao) {
      this.lin=lin;
      this.exp=raizArvoreExpressao;
   }
   
   public void setLinhaEnd(int lin){
   	linhaEnd=lin;
   }
	
   public int executa( Memoria local, Memoria global) {
      if(exp.avalia(local, global) == 0){
         return linhaEnd+1;
      }
      return lin+1;
   }
}

