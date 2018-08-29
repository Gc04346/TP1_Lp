import java.io.*;  
import java.util.*;
import java.util.Stack;

import lp.*;

class Interpretador {
    private ArquivoFonte arq; // Arquivos fontes.
    private Vector comandos; // Conjunto de comandos.
    private String palavraAtual; // Provavelmente o comando que está sendo lido.
    private Stack pilha;
    private String alfabeto;
    private Expressao raizArvoreExpressao;

    public Interpretador(String nome) {
      arq= new ArquivoFonte(nome);
      comandos= new Vector();
      alfabeto = "a b c d e f g h i j k l m n o p q r s t u v w x y z"; // Utilizado para verificar a existência de uma variável.
    }
   
    public void listaArquivo() {
      String palavra;
      
      do {
         palavra= arq.proximaPalavra();
         System.out.println ("Palavra: " + palavra);
      } while (!palavra.equals("EOF"));
    }
   
    // Lendo o arquivo fonte e captando os coamndos para tratamento.
    public void leArquivo() {
      String comandoAtual;
      int linha= 0;
      do {
         comandoAtual= arq.proximaPalavra();
            
         if(comandoAtual.equals("endp")){
            trataComandoEndp(linha);
            linha++;
         }
         else if(comandoAtual.equals("writeln")){
            trataComandoWriteln(linha);
            linha++;
         }else if(comandoAtual.equals("writeStr")){
             trataComandoWriteStr(linha);
             linha++;
         }else if(comandoAtual.equals("read")){
            trataComandoRead(linha);
            linha++;
         }else if(comandoAtual.equals("writeVar")){
            trataComandoWriteVar(linha);
            linha++;
         }else if(alfabeto.contains(comandoAtual)){ // Verificação única. Caso a linha inicie com uma verificação é uma atribuição.
            trataComandoAtrib(linha, comandoAtual);
            linha++;            
         }
                           		  
      } while (!comandoAtual.equals("endp"));
    }

    // Tratamento dos comandos.
    // Tratamento dos comandos endp e writeln já foram feitos.
    private void trataComandoEndp(int lin) {
      ComandoEndp c= new ComandoEndp(lin);
      comandos.addElement(c);
    }
    	   	
    private void trataComandoWriteln(int lin) {
      ComandoWriteln c= new ComandoWriteln(lin);
      comandos.addElement(c);
    }

    // Tratamento com divisão e obtenção da string que será impressa no terminal.
    private void trataComandoWriteStr(int lin){
        // Lendo os tokens esperados.
        String primParen = arq.proximaPalavra();
        String string = arq.proximaPalavra();
        String segParen = arq.proximaPalavra();

        // Verificando os tokens.
        if(!primParen.equals("(")){
            System.out.println("Erro !!");
        }else if(!segParen.equals(")")){
            System.out.println("Erro !!");
        }

       ComandoWriteStr c = new ComandoWriteStr(lin, string);
       comandos.addElement(c);
    }

    private void trataComandoRead(int lin){
        // Lendo os tokens esperados.
        String primParen = arq.proximaPalavra();
        String variavel = arq.proximaPalavra();
        String segParen = arq.proximaPalavra();

        // Verificando o melhor caso apenas.
        if(!primParen.equals("(")){
            System.out.println("Erro !!");
        }else if(!segParen.equals(")")){
            System.out.println("Erro !!");
        }

        ComandoRead c = new ComandoRead(lin, variavel);
        comandos.addElement(c);
    }

    private void trataComandoWriteVar(int lin){
        // Lendo os tokens esperados.
        String primParen = arq.proximaPalavra();
        String variavel = arq.proximaPalavra();
        String segParen = arq.proximaPalavra();

        // Verificando o melhor caso.
        if(!primParen.equals("(")){
            System.out.println("Erro !!");
        }else if(!segParen.equals(")")){
            System.out.println("Erro !!");
        }

        ComandoWriteVar c = new ComandoWriteVar(lin, variavel);
        comandos.addElement(c);
    }

    private void trataComandoAtrib(int lin, String var){
        // comandoAtual guarda nesse ponto o nome da variável.
        String proxPalavra = arq.proximaPalavra();
        float valor=0; 

        // Vrificação do melhor caso.
        if(proxPalavra.equals(":=")){ // Caso seja realmente uma atribuição chamamos o trataExpressao.
          trataExpressao(); // Tratamos a expressão e ela será salva na raiz.
        }else{
          System.out.println("Erro: variavel nao pode ser acessada pois nao foi inicializada");
        }

        // Criar um objeto comando e colocar na lista de execeução.
        ComandoAtrib c = new ComandoAtrib(lin, var, raizArvoreExpressao);
        comandos.addElement(c);
    }

    // trataExpressao deve cuidar dos casos onde surge alguma função de cálculo específica.
    private void trataExpressao() {
        palavraAtual= arq.proximaPalavra();
        pilha= new Stack();
        expressao();
        raizArvoreExpressao = (Expressao) pilha.pop();
    }  

    private void expressao() {
        termo();
        while ((palavraAtual.equals("+")) || (palavraAtual.equals("-"))){
          String op= palavraAtual;
          palavraAtual= arq.proximaPalavra();
          termo();
          Expressao exp1= (Expressao) pilha.pop();
          Expressao exp2= (Expressao) pilha.pop();
          pilha.push(new ExpBinaria(op,exp1,exp2));
        }  
    }

    private void termo() {
        fator();
        while ((palavraAtual.equals("*")) || (palavraAtual.equals("/"))){
          String op = palavraAtual;
          palavraAtual= arq.proximaPalavra();
          fator();
          Expressao exp1= (Expressao) pilha.pop();
          Expressao exp2= (Expressao) pilha.pop();
          pilha.push(new ExpBinaria(op,exp1,exp2));
        }  
    }

    private void fator() {
        Expressao sqrt;
        // alfabeto eh uma string com todas as letras do alfabeto
        if (alfabeto.contains(palavraAtual)) {
            // tem que mandar pra pilha o valor da variavel enviada em new ExpVariavel(palavraAtual)
            pilha.push(new ExpVariavel(palavraAtual));
            palavraAtual= arq.proximaPalavra();
        } else if (palavraAtual.equals("(")){
            palavraAtual= arq.proximaPalavra();
            expressao();
        } else if (palavraAtual.equals(")")){
            palavraAtual= arq.proximaPalavra();
        } else if (palavraAtual.equals("sqrt")) { // Nesse ponto vamos para a proxima palavra para analisar a expressão.
            palavraAtual = arq.proximaPalavra();
            expressao(); // Vai avaliar a expressão da raiz e deixar na última posição da pilha.
            sqrt = (Expressao) pilha.pop(); // Retiro a expressao analizada.
            pilha.push(new ExpSqrt(sqrt)); // Empilho a raiz com a expressão.
            palavraAtual = arq.proximaPalavra();
        } else {
            pilha.push(new ExpConstante(palavraAtual));
            palavraAtual= arq.proximaPalavra();
        }   
    }
    
    public void executa() {
      Comando cmd;
      int pc= 0;
      do {
         cmd= (Comando) comandos.elementAt(pc);
         pc= cmd.executa();
      } while (pc != -1);
    }   
}
