class ComandoAtrib extends Comando {
	char variavel;
	float valor;
	Expressao exp;

	ComandoAtrib(int lin, String var, Expressao raiz){
		linha = lin;
		variavel = var.charAt(0);
		this.exp = raiz;
      this.valor = 0;
	}

	public int executa(){
		// Depois de avaliar vamos atribuir o valor a variável.
      valor = exp.avalia(); // Obtemos o valor da expressão avaliada.
		if(variavel == 'a'){
         	Variaveis.var[0] = valor;
      	}else if(variavel == 'b'){
         	Variaveis.var[1] = valor;
      	}else if(variavel == 'c'){
         	Variaveis.var[2] = valor;
      	}else if(variavel == 'd'){
         	Variaveis.var[3] = valor;
      	}else if(variavel == 'e'){
         	Variaveis.var[4] = valor;
      	}else if(variavel == 'f'){
         	Variaveis.var[5] = valor;
      	}else if(variavel == 'g'){
         	Variaveis.var[6] = valor;
      	}else if(variavel == 'h'){
         	Variaveis.var[7] = valor;
      	}else if(variavel == 'i'){
         	Variaveis.var[8] = valor;
      	}else if(variavel == 'j'){
         	Variaveis.var[9] = valor;
      	}else if(variavel == 'k'){
         	Variaveis.var[10] = valor;
      	}else if(variavel == 'l'){
         	Variaveis.var[11] = valor;
      	}else if(variavel == 'm'){
         	Variaveis.var[12] = valor;
      	}else if(variavel == 'n'){
         	Variaveis.var[13] = valor;
      	}else if(variavel == 'o'){
         	Variaveis.var[14] = valor;
      	}else if(variavel == 'p'){
         	Variaveis.var[15] = valor;
      	}else if(variavel == 'q'){
         	Variaveis.var[16] = valor;
      	}else if(variavel == 'r'){
         	Variaveis.var[17] = valor;
      	}else if(variavel == 's'){
         	Variaveis.var[18] = valor;
      	}else if(variavel == 't'){
         	Variaveis.var[19] = valor;
      	}else if(variavel == 'u'){
         	Variaveis.var[20] = valor;
      	}else if(variavel == 'v'){
         	Variaveis.var[21] = valor;
      	}else if(variavel == 'w'){
         	Variaveis.var[22] = valor;
      	}else if(variavel == 'x'){
         	Variaveis.var[23] = valor;
      	}else if(variavel == 'y'){
         	Variaveis.var[24] = valor;
      	}else if(variavel == 'z'){
         	Variaveis.var[25] = valor;
      	}

      return linha+1;
	}
}