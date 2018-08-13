// Classe abstrata. Utilizada para definir um modelo. 
// Provavelmente as outras serão extensões dessa.
// Não podemos instanciar a classe. 
abstract class Comando { 
   protected int linha;
   public abstract int executa(); // Quem herdar assume o pepino de implementar o método.
}