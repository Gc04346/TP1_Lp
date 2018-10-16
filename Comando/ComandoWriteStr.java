package Comando;
 
import Variavel.*;
 
public class ComandoWriteStr extends Comando {
   
	String texto;
   	
   	public ComandoWriteStr(int lin, String txt) {
   		linha=lin;
   		texto=txt;
   	}
   
   	public int executa( Memoria local, Memoria global) {
   		System.out.print(this.texto);
   		return linha+1;
   	}
}
