public class ComandoFor extends Comando implements Condicao{
    int linEndf, varValor;
    int lin;
    Expressao exp;
    String tipoFor;
    char var;
    boolean inicio = true;

    public ComandoFor(int lin, String var, String vValor, String tipo, Expressao raizArvoreExpressao){
        this.lin=lin;
        this.exp=raizArvoreExpressao;
        this.tipoFor=tipo;
        this.var=var.charAt(0);
        varValor = Integer.parseInt(vValor);
    }

    public void setValorVar(float valor){
        int varPosicao = this.var - 97;
        Variaveis.var[varPosicao] = valor;
    }

    public int executa(){
        int varPosicao = var - 97;
        int limite = (int) exp.avalia();
        int linhaR = lin+1;

        if(inicio){
            Variaveis.var[varPosicao] = varValor;
            inicio = false;
        }

        if(tipoFor.equals("to")){
            if(Variaveis.var[varPosicao] > limite){
                linhaR = linEndf+1;
                inicio = true;
            }
        }else if(tipoFor.equals("downto")){
            if(Variaveis.var[varPosicao] < limite){
                linhaR = linEndf+1;
                inicio = true;
            }
        }
        return linhaR;
    }

    public void setLinhaEnd(int lin){
       linEndf=lin;
    }

    public char getVar(){
      return this.var;
    }

    public String getTipoFor(){
      return this.tipoFor;
    }

}