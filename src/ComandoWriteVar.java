import java.io.*;  
import java.util.*;

class ComandoWriteVar extends Comando {
   
   char variavel;
   	
   ComandoWriteVar(int lin, String txt) {
      linha= lin;
      variavel= txt.charAt(0);
   }
   
   public int executa() {
      // Aqui devemos imprimir o valor de uma variável.
      // Lembrando que pela requisição todas devem ser do tipo double.
      if(variavel == 'a'){
         System.out.println(Variaveis.var[0]);
      }else if(variavel == 'b'){
         System.out.println(Variaveis.var[1]);
      }else if(variavel == 'c'){
         System.out.println(Variaveis.var[2]);
      }else if(variavel == 'd'){
         System.out.println(Variaveis.var[3]);
      }else if(variavel == 'e'){
         System.out.println(Variaveis.var[4]);
      }else if(variavel == 'f'){
         System.out.println(Variaveis.var[5]);
      }else if(variavel == 'g'){
         System.out.println(Variaveis.var[6]);
      }else if(variavel == 'h'){
         System.out.println(Variaveis.var[7]);
      }else if(variavel == 'i'){
         System.out.println(Variaveis.var[8]);
      }else if(variavel == 'j'){
         System.out.println(Variaveis.var[9]);
      }else if(variavel == 'k'){
         System.out.println(Variaveis.var[10]);
      }else if(variavel == 'l'){
         System.out.println(Variaveis.var[11]);
      }else if(variavel == 'm'){
         System.out.println(Variaveis.var[12]);
      }else if(variavel == 'n'){
         System.out.println(Variaveis.var[13]);
      }else if(variavel == 'o'){
         System.out.println(Variaveis.var[14]);
      }else if(variavel == 'p'){
         System.out.println(Variaveis.var[15]);
      }else if(variavel == 'q'){
         System.out.println(Variaveis.var[16]);
      }else if(variavel == 'r'){
         System.out.println(Variaveis.var[17]);
      }else if(variavel == 's'){
         System.out.println(Variaveis.var[18]);
      }else if(variavel == 't'){
         System.out.println(Variaveis.var[19]);
      }else if(variavel == 'u'){
         System.out.println(Variaveis.var[20]);
      }else if(variavel == 'v'){
         System.out.println(Variaveis.var[21]);
      }else if(variavel == 'w'){
         System.out.println(Variaveis.var[22]);
      }else if(variavel == 'x'){
         System.out.println(Variaveis.var[23]);
      }else if(variavel == 'y'){
         System.out.println(Variaveis.var[24]);
      }else if(variavel == 'z'){
         System.out.println(Variaveis.var[25]);
      }

      return linha+1;
   }
}