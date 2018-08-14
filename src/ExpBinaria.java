public class ExpBinaria extends Expressao{
    private String operador;
    private String exp1, exp2;

    public ExpBinaria(String operador, String exp1, String exp2){
        this.operador = operador;
        this.exp1 = exp1;
        this.exp2 = exp2;
    }

    public float avalia(){
        float v = null;
        switch (operador){
            case ">":
            case "<":
            case "<=":
            case ">=":
            case "==":
        }
        return v;
    }

}