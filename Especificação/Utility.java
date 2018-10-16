package lp;

import java.io.PrintStream;

class Utility
{
   Utility() {}
   
   public static void jdMethod_assert(boolean paramBoolean)
   {
      if (false == paramBoolean)
         throw new Error("Error: Assertion failed.");
   }
   
   private static final String[] errorMsg = { "Error: Unmatched end-of-comment punctuation.", "Error: Unmatched start-of-comment punctuation.", "Error: Unclosed string.", "Error: Illegal character." };
   

   public static final int E_ENDCOMMENT = 0;  

   public static final int E_STARTCOMMENT = 1;
   
   public static final int E_UNCLOSEDSTR = 2;
   
   public static final int E_UNMATCHED = 3;
   

   public static void error(int paramInt)
   {
      System.out.println(errorMsg[paramInt]);
   }
}
