package Comando;
	
import Variavel.*;
import java.io.*;
	 
public class ComandoRead extends Comando {
   
   BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
   char variavel;
   	
   public ComandoRead(int lin, String txt) {
      linha=lin; // Linha é extendida de comando.
      variavel=txt.charAt(0);
   }
   
   public int executa( Memoria local, Memoria global) {	
   	String valor;
      double valorDouble=0;

      try{
         valor = teclado.readLine();
         valor.trim();
         valorDouble = Double.parseDouble(valor);
      }catch(Exception e){
         System.out.println("Erro: "+e);
      }

      int varPosicao = variavel - 97;	
      
      if((local.var[varPosicao] == -1) && (global.var[varPosicao] == -1)){
         System.out.println("Erro, variaveis nao inicializadas.");
      }

      if(local.var[varPosicao] != -1){
         local.var[varPosicao] = valorDouble;
      }else{
         global.var[varPosicao] = valorDouble;
      }
      return linha+1;
   }
}

