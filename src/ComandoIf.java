import Comando.Condicao;
	
import Variavel.*;
import Expressao.*;

class ComandoIf extends Comando implements Condicao{
    Expressao exp;
    int linhaEnd;
    int lin;

    ComandoIf(int lin, Expressao exp){
        this.lin = lin;
        this.exp=exp;
    }

    public int executa(){
        if(exp.avalia() == 0) //se a condicao do if nao for satisfeita, pula para a linha do else ou do end
            return linhaEnd; //retorna a linha do else/end para o program count
        return lin+1; //retorna a linha logo abaixo do if para continuar a execucao do programa normalmente
    }

    public void setLinhaEnd(int lin){
        linhaEnd=lin;
    }
}