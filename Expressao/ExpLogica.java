package Expressao;

import Variavel.*;

public class ExpLogica extends Expressao{
   
   String op;
   Object exp1, exp2;
   Expressao cmd1, cmd2;
   static final double TRUE  = 1;
   static final double FALSE = 0;
		
   public ExpLogica(String op, Object exp1, Object exp2) {
      this.op= op;
      this.exp1= exp1;
      this.exp2= exp2;
   }
   
   public double avalia( Memoria local, Memoria global ) {
      double avalia1, avalia2;
      cmd1 = (Expressao) exp1;
      cmd2 = (Expressao) exp2;
      avalia1 = exp1.avalia(local, global);
      avalia2 = exp2.avalia(local, global);    
   	
      switch(op){
         case "and":
            if(avalia2 > 0 && avalia1 > 0){
               return TRUE;
            }return FALSE;
         case "or":
            if(avalia2 > 0 || avalia1 > 0){
               return TRUE;
            }return FALSE;
         case "not":
            if(avalia1 != 0)
               return FALSE
            return TRUE;
      }
      return FALSE;
   }
}	
