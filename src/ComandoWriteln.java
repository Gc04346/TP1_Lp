import java.io.*;  
import java.util.*;

class ComandoWriteln extends Comando {
   	
   ComandoWriteln(int lin) {
        linha= lin;
   }
   
   public int executa() {
        // Aqui devemos fazer a lógica do comando writeln.
        System.out.println(""); // Linha vazia.
        return linha+1;
   }
}