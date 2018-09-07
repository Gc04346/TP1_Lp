
class ComandoIf extends Comando{
    Expressao exp;
    int linha;

    ComandoIf(int lin, Expressao exp){
        linha = lin;
        this.exp=exp;
    }

    public int executa(){
        if(exp.avalia() > 0){
            
        }else{
            
        }
        return 0;
    }
}