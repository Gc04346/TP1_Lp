public class ExpBinaria extends Expressao{
    private String operador;
    private float exp1, exp2;

    public ExpBinaria(String operador, String exp1, String exp2){
        this.operador = operador;
        this.exp1 = Float.parseFloat(exp1);
        this.exp2 = Float.parseFloat(exp2);
    }

    public float avalia(){
        switch (operador){
            case "+": return exp2 + exp1;
            case "-": return exp2 - exp1;
            case "*": return exp2 * exp1;
            case "/": return exp2 / exp1;
        }
        return null;
    }
}
