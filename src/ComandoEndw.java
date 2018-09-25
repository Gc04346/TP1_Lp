public class ComandoEndw extends Comando{
    int lin;
    int linhaWhile;

    public ComandoEndw(int lin, int linW){
        this.lin=lin;
        linhaWhile=linW;
    }

    public int executa(){
        return linhaWhile;
    }
}