public class ComandoEndf extends Comando{
    int lin;
    int linhaFor;
    char var;
    String tipoFor;
    int valorVar;

    public ComandoEndf(int lin, int linF, char var, String tipoFor){
        this.lin=lin;
        linhaFor=linF;
        this.var=var;
        this.tipoFor=tipoFor;
    }

    public int executa(){
        int varPosicao = this.var - 97;
        if(tipoFor.equals("downto")){
            Variaveis.var[varPosicao] = Variaveis.var[varPosicao] - 1;
            // Aparentemente decrementa apenas uma vez.
        }
        else if(tipoFor.equals("to")){
            Variaveis.var[varPosicao] = Variaveis.var[varPosicao] + 1;   
        }
        return linhaFor;
    }
}