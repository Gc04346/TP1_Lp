public class ExpConstante extends Expressao{
    private float valor;

    public ExpConstante(String valor){
      this.valor = Float.parseFloat(valor);
      avalia();
    }

    public float avalia(){
        return valor;
    }
}
