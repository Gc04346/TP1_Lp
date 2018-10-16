package Comando;
	
import Variavel.*;
	 
public class ComandoWriteVar extends Comando {
   
   	char variavel;
   	
   	public ComandoWriteVar(int lin, String txt) {
    	linha=lin;
    	variavel=txt.charAt(0);
   	}
   
   	public int executa( Memoria local, Memoria global) {
   		int varPosicao = variavel - 97;

   		if((local.var[varPosicao] == -1) && (global.var[varPosicao] == -1)){
   			System.out.println("Erro: variavel nao inicialiada");
   		}

   		if(local.var[varPosicao] != -1){
   			System.out.println(local.var[varPosicao]);
   		}else{
   			System.out.println(global.var[varPosicao]);
   		}
   		return linha+1;
   	}
}

