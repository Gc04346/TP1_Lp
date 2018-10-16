package Expressao;

import Variavel.*;

public class ExpVariavel extends Expressao{
   
   	char variavel;
   	
   	public ExpVariavel(char nomevar) {
      variavel= nomevar;
   	}
   
   	public double avalia( Memoria local, Memoria global ) {
   		int varPosicao = variavel - 97;

   		if( (local.var[varPosicao] == -1) && (global.var[varPosicao] == -1) ){
   			System.out.println("Variavel nao iniciada.");
   		}

   		if(local.var[varPosicao] != -1){
   			return local.var[varPosicao];
   		}else{
   			return global.var[varPosicao];
   		}
   	}
      
}