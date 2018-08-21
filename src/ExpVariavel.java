import lp.*;
/*eh responsabilidade desta classe identificar operadores, +,-,/,*,<,>,<=,>=,==,!=.
  caso encontre algum operador matemático (+,-,*,/) deve ser interrompida instantaneamente, para que este
  operador seja encontrado em arq.palavraAtual, e a classe Interpretador trabalhe sobre este fato, já
  que isto eh trabalho dela. caso contrario, caso encontre um operador logico(<,>,<=,>=,==,!=), deve lancar
  uma expBinaria?
*/
public class ExpVariavel extends Expressao{
    private char nomevar;
    private float valorVar;
    private String operador;

    public ExpVariavel(String palavraAtual){
        nomevar = palavraAtual.charAt(0);
        avalia(); //nao sei se isto eh suficiente para retornar o valor da variavel passada como parametro por Interpretador...
    }

    private float getValor(){
        if(nomevar == 'a'){
            v = Variaveis.var[0];
         }else if(nomevar == 'b'){
            v =Variaveis.var[1];
         }else if(nomevar == 'c'){
            v =Variaveis.var[2];
         }else if(nomevar == 'd'){
            v =Variaveis.var[3];
         }else if(nomevar == 'e'){
            v =Variaveis.var[4];
         }else if(nomevar == 'f'){
            v =Variaveis.var[5];
         }else if(nomevar == 'g'){
            v =Variaveis.var[6];
         }else if(nomevar == 'h'){
            v =Variaveis.var[7];
         }else if(nomevar == 'i'){
            v =Variaveis.var[8];
         }else if(nomevar == 'j'){
            v =Variaveis.var[9];
         }else if(nomevar == 'k'){
            v =Variaveis.var[10];
         }else if(nomevar == 'l'){
            v =Variaveis.var[11];
         }else if(nomevar == 'm'){
            v =Variaveis.var[12];
         }else if(nomevar == 'n'){
            v =Variaveis.var[13];
         }else if(nomevar == 'o'){
            v =Variaveis.var[14];
         }else if(nomevar == 'p'){
            v =Variaveis.var[15];
         }else if(nomevar == 'q'){
            v =Variaveis.var[16];
         }else if(nomevar == 'r'){
            v =Variaveis.var[17];
         }else if(nomevar == 's'){
            v =Variaveis.var[18];
         }else if(nomevar == 't'){
            v =Variaveis.var[19];
         }else if(nomevar == 'u'){
            v =Variaveis.var[20];
         }else if(nomevar == 'v'){
            v =Variaveis.var[21];
         }else if(nomevar == 'w'){
            v =Variaveis.var[22];
         }else if(nomevar == 'x'){
            v =Variaveis.var[23];
         }else if(nomevar == 'y'){
            v =Variaveis.var[24];
         }else if(nomevar == 'z'){
            v =Variaveis.var[25];
         }
        return v;
    }

    public float avalia(){
        valorVar = getValor();
        // operador = arq.proximaPalavra(); //com este comando, esta variavel contem um operador matematico (nada deve ser feito aqui) ou um operador logico(que deve ser tratado)
        // if(arq.proximaPalavra().equals("=")) //se for um operador logico composto, isto deve ser concatenado na variavel operador
        //     operador.concat(arq.palavraAtual());
        return valorVar;
    }
}
