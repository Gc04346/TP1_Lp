public class ComandoWhile extends Comando implements Condicao{
    int linEndW;
    int lin;
    Expressao exp;

    public ComandoWhile(int lin, Expressao exp){
        this.lin=lin;
        this.exp=exp;
    }

    public int executa(){
        if(exp.avalia() == 0) //se a condicao do while nao for satisfeita, pula para a linha abaixo do endw
            return linEndW+1; //retorna a linha do endw para o program count
        return lin+1; //retorna a linha logo abaixo do while para executar o corpo do laco
    }

    public void setLinhaEnd(int lin){
        linEndW = lin;
    }

}