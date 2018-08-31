public class ExpBinaria extends Expressao{
    private String operador;
    private Expressao exp1, exp2;

    public ExpBinaria(String operador, Expressao exp1, Expressao exp2){
        this.operador = operador;
        this.exp1 = exp1;
        this.exp2 = exp2;
    }

    public float avalia(){
        float avalia1 = 0, avalia2 = 0;
        avalia1 = this.exp1.avalia(); // Valor da avaliação da primeira expressão.
        avalia2 = this.exp2.avalia(); // Valor da avaliação da segunda expressão.
        switch (operador){
            case "+": return avalia2 + avalia1;
            case "-": return avalia2 - avalia1;
            case "*": return avalia2 * avalia1;
            case "/": return avalia2 / avalia1;
            case ">": if(avalia2>avalia1) 
                            return 1;
                        else return 0;
            case "<": if(avalia2<avalia1) 
                            return 1;
                        else return 0;
            case ">=": if(avalia2>=avalia1) 
                            return 1;
                        else return 0;
            case "<=": if(avalia2<=avalia1) 
                            return 1;
                        else return 0;
            case "==": if(avalia2 == avalia1) 
                            return 1;
                        else return 0;
            case "<>": if(avalia2 != avalia1) 
                            return 1;
                        else return 0;
        }
        return 0;
    }
}
