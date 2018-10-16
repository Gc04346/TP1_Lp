package lp;

import java.io.FileReader;

public class ArquivoFonte
{
   private FileReader arq;
   private java.io.BufferedReader dados;
   private Yylex yy;
   
   public ArquivoFonte(String paramString)
   {
      try {
         arq = new FileReader(paramString);
         dados = new java.io.BufferedReader(arq);
         yy = new Yylex(dados);
      }
      catch (Exception localException) {
         System.out.println(localException);
      }
   }
   
   public String proximaPalavra()
   {
      try {
         Yytoken localYytoken = yy.yylex();
         if (localYytoken == null)
            return "EOF";
         return m_text;
      }
      catch (java.io.IOException localIOException) {
         System.out.println(localIOException);
      }
      return "";
   }
}
