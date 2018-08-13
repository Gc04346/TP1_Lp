import java.io.*;  
import java.util.*;

import lp.*; 

class ComandoWriteVar extends Comando {
   
   char variavel;
   	
   ComandoWriteVar(int lin, String txt) {
      linha= lin;
      variavel= txt.charAt(0);
   }
   
   public int executa() {
      // Aqui devemos imprimir o valor de uma variável.
      // Lembrando que pela requisição todas devem ser do tipo double.
      return linha+1;
   }
}