import java.io.*;  
import java.util.*;

import lp.*; 

class ComandoRead extends Comando {
   
   BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
   char variavel;
   	
   ComandoRead(int lin, String txt) {
      linha= lin;
      variavel= txt.charAt(0);
   }
   
   public int executa() {
      String valor; // Irá armazenar o valor de entrada do usuário.
      float valorFloat=0; // Irá armazenar o valor real. Começa com um valor default.

      try { // Devemos tentar ler o valor do teclado e armazenar na variavel mandada como parâmetro.
         valor = teclado.readLine();
         valor.trim(); // Limpando espaços vazios.
         valorFloat = Float.parseFloat(valor); // Convertendo a string em double.
      }
      catch( Exception e) {
         System.out.println("ERRO: "+e);
      }

      // Se tudo der certo vamos armazenar o valor da string na posição seguindo [a...z] mapeados [0...25].
      // Sendo a variável "a" a posição 0 e assim por diante.
      if(variavel == 'a'){
         Variaveis.var[0] = valorFloat;
      }else if(variavel == 'b'){
         Variaveis.var[1] = valorFloat;
      }else if(variavel == 'c'){
         Variaveis.var[2] = valorFloat;
      }else if(variavel == 'd'){
         Variaveis.var[3] = valorFloat;
      }else if(variavel == 'e'){
         Variaveis.var[4] = valorFloat;
      }else if(variavel == 'f'){
         Variaveis.var[5] = valorFloat;
      }else if(variavel == 'g'){
         Variaveis.var[6] = valorFloat;
      }else if(variavel == 'h'){
         Variaveis.var[7] = valorFloat;
      }else if(variavel == 'i'){
         Variaveis.var[8] = valorFloat;
      }else if(variavel == 'j'){
         Variaveis.var[9] = valorFloat;
      }else if(variavel == 'k'){
         Variaveis.var[10] = valorFloat;
      }else if(variavel == 'l'){
         Variaveis.var[11] = valorFloat;
      }else if(variavel == 'm'){
         Variaveis.var[12] = valorFloat;
      }else if(variavel == 'n'){
         Variaveis.var[13] = valorFloat;
      }else if(variavel == 'o'){
         Variaveis.var[14] = valorFloat;
      }else if(variavel == 'p'){
         Variaveis.var[15] = valorFloat;
      }else if(variavel == 'q'){
         Variaveis.var[16] = valorFloat;
      }else if(variavel == 'r'){
         Variaveis.var[17] = valorFloat;
      }else if(variavel == 's'){
         Variaveis.var[18] = valorFloat;
      }else if(variavel == 't'){
         Variaveis.var[19] = valorFloat;
      }else if(variavel == 'u'){
         Variaveis.var[20] = valorFloat;
      }else if(variavel == 'v'){
         Variaveis.var[21] = valorFloat;
      }else if(variavel == 'w'){
         Variaveis.var[22] = valorFloat;
      }else if(variavel == 'x'){
         Variaveis.var[23] = valorFloat;
      }else if(variavel == 'y'){
         Variaveis.var[24] = valorFloat;
      }else if(variavel == 'z'){
         Variaveis.var[25] = valorFloat;
      }
      
      return linha+1;
   }
}