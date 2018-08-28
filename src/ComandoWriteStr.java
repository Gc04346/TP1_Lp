import java.io.*;  
import java.util.*;

class ComandoWriteStr extends Comando {
   
   String texto;
   	
   ComandoWriteStr(int lin, String txt) {
      linha= lin;
      texto= txt;
   }
   
   public int executa() {
      // Printar um texto. Nesse caso devemos imprimir a string recebida como parâmetro.
      System.out.print(this.texto);
      return linha+1;
   }
}