// Comando Endp faz a finalização do programa.
class ComandoEndp extends Comando {
   
   ComandoEndp(int lin) {
      linha= lin;
   }
   
   // Aparentemente só retorna um valor.
   public int executa() {
      return -1;
   }
}