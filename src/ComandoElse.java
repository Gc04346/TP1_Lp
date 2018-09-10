package Comando;
	
import Variavel.*;
	 
public class ComandoElse extends Comando implements Condicao {
   
   int linhaEnd;
  
   public ComandoElse(int lin) {
       linha = lin;
   }
   
   public void setLinhaEnd(int lin){
        linhaEnd=lin;    
    }
	
   public int executa() {			
        
   }
}

