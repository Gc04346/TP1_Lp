
class ComandoIf extends Comando{

    ComandoIf(int lin, Expressao exp){
        linha = lin;
    }

    public int executa(){
        if(exp.avalia()){

        }else{

        }
    }
}