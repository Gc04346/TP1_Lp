import java.lang.Math;

public class ExpSqrt extends Expressao{
	private float valor;
	private float raiz;
	private char nomevar;

	public ExpSqrt(String var){
		this.nomevar = var.charAt(0);
	}

	private float getValor(){
        float v=0;
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
		this.valor = getValor(); // Obtendo o valor da variável.
		this.raiz = (float) Math.sqrt((double) this.valor);
		return this.raiz;
	}
}