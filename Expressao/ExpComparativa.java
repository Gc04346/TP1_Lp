package Expressao;

import Variavel.*;

public class ExpComparativa extends Expressao{
   
   String op;
   Object exp1, exp2;
   Expressao cmd1, cmd2;
   static final double TRUE  = 1;
   static final double FALSE = 0;
		
   public ExpComparativa(String op, Object exp1, Object exp2) {
      this.op= op;
      this.exp1= exp1;
      this.exp2= exp2;
   }
   
   public double avalia( Memoria local, Memoria global ) {
         
         
   		      
   }
}	
