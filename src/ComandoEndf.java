public class ComandoEndf extends Comando{
    int lin;
    int linhaFor;
    String var;
    String tipoFor;
    int valorVar;

    public ComandoEndf(int lin, int linF, String var, String tipoFor){
        this.lin=lin;
        linhaFor=linF;
        this.var=var;
        this.tipoFor=tipoFor;
    }

    public void incrementaValorVar(String var){
        char variavel = var.charAt(0);
        if(variavel == 'a'){
            Variaveis.var[0] +=1;
         }else if(variavel == 'b'){
            Variaveis.var[1] +=1;
         }else if(variavel == 'c'){
            Variaveis.var[2] +=1;
         }else if(variavel == 'd'){
            Variaveis.var[3] +=1;
         }else if(variavel == 'e'){
            Variaveis.var[4] +=1;
         }else if(variavel == 'f'){
            Variaveis.var[5] +=1;
         }else if(variavel == 'g'){
            Variaveis.var[6] +=1;
         }else if(variavel == 'h'){
            Variaveis.var[7] +=1;
         }else if(variavel == 'i'){
            System.out.println(Variaveis.var[8]);
            Variaveis.var[8] +=1;
         }else if(variavel == 'j'){
            Variaveis.var[9] +=1;
         }else if(variavel == 'k'){
            Variaveis.var[10] +=1;
         }else if(variavel == 'l'){
            Variaveis.var[11] +=1;
         }else if(variavel == 'm'){
            Variaveis.var[12] +=1;
         }else if(variavel == 'n'){
            Variaveis.var[13] +=1;
         }else if(variavel == 'o'){
            Variaveis.var[14] +=1;
         }else if(variavel == 'p'){
            Variaveis.var[15] +=1;
         }else if(variavel == 'q'){
            Variaveis.var[16] +=1;
         }else if(variavel == 'r'){
            Variaveis.var[17] +=1;
         }else if(variavel == 's'){
            Variaveis.var[18] +=1;
         }else if(variavel == 't'){
            Variaveis.var[19] +=1;
         }else if(variavel == 'u'){
            Variaveis.var[20] +=1;
         }else if(variavel == 'v'){
            Variaveis.var[21] +=1;
         }else if(variavel == 'w'){
            Variaveis.var[22] +=1;
         }else if(variavel == 'x'){
            Variaveis.var[23] +=1;
         }else if(variavel == 'y'){
            Variaveis.var[24] +=1;
         }else if(variavel == 'z'){
            Variaveis.var[25] +=1;
         }
    }

    public void decrementaValorVar(String var){
        char variavel = var.charAt(0);
        if(variavel == 'a'){
            Variaveis.var[0] -=1;
         }else if(variavel == 'b'){
            Variaveis.var[1] -=1;
         }else if(variavel == 'c'){
            Variaveis.var[2] -=1;
         }else if(variavel == 'd'){
            Variaveis.var[3] -=1;
         }else if(variavel == 'e'){
            Variaveis.var[4] -=1;
         }else if(variavel == 'f'){
            Variaveis.var[5] -=1;
         }else if(variavel == 'g'){
            Variaveis.var[6] -=1;
         }else if(variavel == 'h'){
            Variaveis.var[7] -=1;
         }else if(variavel == 'i'){
             System.out.println(Variaveis.var[8]);
            Variaveis.var[8] -=1;
         }else if(variavel == 'j'){
            Variaveis.var[9] -=1;
         }else if(variavel == 'k'){
            Variaveis.var[10] -=1;
         }else if(variavel == 'l'){
            Variaveis.var[11] -=1;
         }else if(variavel == 'm'){
            Variaveis.var[12] -=1;
         }else if(variavel == 'n'){
            Variaveis.var[13] -=1;
         }else if(variavel == 'o'){
            Variaveis.var[14] -=1;
         }else if(variavel == 'p'){
            Variaveis.var[15] -=1;
         }else if(variavel == 'q'){
            Variaveis.var[16] -=1;
         }else if(variavel == 'r'){
            Variaveis.var[17] -=1;
         }else if(variavel == 's'){
            Variaveis.var[18] -=1;
         }else if(variavel == 't'){
            Variaveis.var[19] -=1;
         }else if(variavel == 'u'){
            Variaveis.var[20] -=1;
         }else if(variavel == 'v'){
            Variaveis.var[21] -=1;
         }else if(variavel == 'w'){
            Variaveis.var[22] -=1;
         }else if(variavel == 'x'){
            Variaveis.var[23] -=1;
         }else if(variavel == 'y'){
            Variaveis.var[24] -=1;
         }else if(variavel == 'z'){
            Variaveis.var[25] -=1;
         }
    }

    public int executa(){
        if(tipoFor.equals("downto")){
            // System.out.println(var);
            decrementaValorVar(var);
            // System.out.println(var);
        }
        else if(tipoFor.equals("upto")){
            // System.out.println(var);
            incrementaValorVar(var);
        }
        // System.out.println(var);
        return linhaFor;
    }
}