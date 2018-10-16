package Proc;
	
import Variavel.*;
import Comando.*;
import java.util.*;
	
	
public class Procedimento {
   String nome;     										// nome do procedimento  
   Vector comandos;    									// vetor de comandos 
   String [] parametros;									// parametros formais 
   String [] variaveisLocal;								// variaveis local
   static Memoria global = new Memoria();			// variaveis globais
		 
		 
    public Procedimento( String n, String [] p ){
        nome= n;
        parametros= p; 
    }
		
    public String getNome(){
        return nome;
    }
		 
   // Atribuir valor as variaveis globais.
    public static void setVariaveisGlobal( String [] vG ){	
        char var;
   		for(int i=0; vG[i]!=null; i++){
            var = vG[i].charAt(0);
            global.var[var - 97] = 0;
        }
    }
		
    public void setVariaveisLocal( String [] vL ){
        this.variaveisLocal = vL;	
    }
		
    public void setListaComandos( Vector c ){
        this.comandos = c;
    }
		
    public void executa(double [] argumentos) {
        Memoria local = new Memoria(); 				// variaveis local
        char var;
   	  
   	    // adiciona variaveis locais na memoria local
        if( variaveisLocal != null ){	
      	     char variavel;
             for(int i=0; variaveisLocal[i]!=null; i++){
                variavel = variaveisLocal[i].charAt(0); // Recebendo a variavel.
                local.var[variavel - 97] = 0; // Atribuindo variavel.
             }	
        }
        
        // associa argumentos a seus respectivos parametros formais
        for(int i=0; parametros[i]!=null; i++){
            var = parametros[i].charAt(0); // Atribuimos a var a variavel local criada.
            local.var[var - 97] = argumentos[i]; // Atribuimos a variavel o ser valor passado como argumento.
        }										
            		
        int pc= 0;
        do {
            pc=  ((Comando) comandos.elementAt(pc)).executa(local, global);
        } while (pc < comandos.size() );
   }
}
