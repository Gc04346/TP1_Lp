public class ComandoFor extends Comando implements Condicao{
    int linEndf;
    int lin;
    Expressao exp;
    String tipoFor;
    String var;

    public ComandoFor(int lin, Expressao exp, String tipoFor, String var){
        this.lin=lin;
        this.exp=exp;
        this.tipoFor=tipoFor;
        this.var=var;
    }

    public int pegaValorVar(String var){
        char variavel = var.charAt(0);
        float valor = 0;
        if(variavel == 'a'){
           valor =  Variaveis.var[0];
         }else if(variavel == 'b'){
           valor =  Variaveis.var[1];
         }else if(variavel == 'c'){
           valor =  Variaveis.var[2];
         }else if(variavel == 'd'){
           valor =  Variaveis.var[3];
         }else if(variavel == 'e'){
           valor =  Variaveis.var[4];
         }else if(variavel == 'f'){
           valor =  Variaveis.var[5];
         }else if(variavel == 'g'){
           valor =  Variaveis.var[6];
         }else if(variavel == 'h'){
           valor =  Variaveis.var[7];
         }else if(variavel == 'i'){
           valor =  Variaveis.var[8];
         }else if(variavel == 'j'){
           valor =  Variaveis.var[9];
         }else if(variavel == 'k'){
            valor =  Variaveis.var[10];
         }else if(variavel == 'l'){
            valor =  Variaveis.var[11];
         }else if(variavel == 'm'){
            valor =  Variaveis.var[12];
         }else if(variavel == 'n'){
            valor =  Variaveis.var[13];
         }else if(variavel == 'o'){
            valor =  Variaveis.var[14];
         }else if(variavel == 'p'){
            valor =  Variaveis.var[15];
         }else if(variavel == 'q'){
            valor =  Variaveis.var[16];
         }else if(variavel == 'r'){
            valor =  Variaveis.var[17];
         }else if(variavel == 's'){
            valor =  Variaveis.var[18];
         }else if(variavel == 't'){
            valor =  Variaveis.var[19];
         }else if(variavel == 'u'){
            valor =  Variaveis.var[20];
         }else if(variavel == 'v'){
            valor =  Variaveis.var[21];
         }else if(variavel == 'w'){
            valor =  Variaveis.var[22];
         }else if(variavel == 'x'){
            valor =  Variaveis.var[23];
         }else if(variavel == 'y'){
            valor =  Variaveis.var[24];
         }else if(variavel == 'z'){
            valor =  Variaveis.var[25];
         }
         return (int) valor;
    }

    public int executa(){
        if(tipoFor.equals("downto")){
            if(pegaValorVar(var) >= exp.avalia()){
              // System.out.println(lin+1);
                return lin+2;
            }else 
                return linEndf+2;
        }else{
            if(pegaValorVar(var) <= exp.avalia()){
              // System.out.println(lin+1);
                return lin+1;
            }else 
                return linEndf+2;
        }
    }

    public void setLinhaEnd(int lin){
       linEndf=lin;
    }

    public String getVar(){
      return this.var;
    }

    public String getTipoFor(){
      return this.tipoFor;
    }

}