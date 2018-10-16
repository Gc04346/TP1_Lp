package Proc;
	
import Variavel.*;
import Comando.*;
import java.util.*;
	
	
public class Procedimento {
   String nome;     										// nome do procedimento  
   Vector comandos;    									// vetor de comandos 
   String [] parametros;									// parametros formais 
   String [] variaveisLocal;								// variáveis local
   static Memoria global = new Memoria();			// variaveis globais
		 
		 
   public Procedimento( String n, String [] p ){
      nome= n;
      parametros= p; 
   }
		
   public String getNome(){
      return nome;
   }
		
   public static void setVariaveisGlobal( String [] vG ){	
      char var;
   		
   }
		
   public void setVariaveisLocal( String [] vL ){	
   }
		
   public void setListaComandos( Vector c ){
      
   }
		
   public void executa(double [] argumentos) {
      Memoria local = new Memoria(); 				// variaveis local
      char var;
   	  
   	  // adiciona variáveis locais na memória local
      if( variaveisLocal != null ){	
      										
      }
        
        // associa argumentos a seus respectivos parâmetros formais
        
        
        
        										
            		
      int pc= 0;
      do {
         pc=  ((Comando) comandos.elementAt(pc)).executa(local, global);
      } while (pc < comandos.size() );
   }
}
