package lp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.Reader;

























































class Yylex
{
  private final int YY_BUFFER_SIZE = 512;
  private final int YY_F = -1;
  private final int YY_NO_STATE = -1;
  private final int YY_NOT_ACCEPT = 0;
  private final int YY_START = 1;
  private final int YY_END = 2;
  private final int YY_NO_ANCHOR = 4;
  private final int YY_BOL = 128;
  private final int YY_EOF = 129;
  
  private int comment_count = 0;
  private BufferedReader yy_reader;
  private int yy_buffer_index;
  private int yy_buffer_read;
  private int yy_buffer_start;
  private int yy_buffer_end;
  private char[] yy_buffer;
  private int yychar;
  private int yyline;
  private boolean yy_at_bol;
  private int yy_lexical_state;
  
  Yylex(Reader paramReader) {
    this();
    if (null == paramReader) {
      throw new Error("Error: Bad input stream initializer.");
    }
    yy_reader = new BufferedReader(paramReader);
  }
  
  Yylex(InputStream paramInputStream) {
    this();
    if (null == paramInputStream) {
      throw new Error("Error: Bad input stream initializer.");
    }
    yy_reader = new BufferedReader(new InputStreamReader(paramInputStream));
  }
  
  private Yylex() {
    yy_buffer = new char['Ȁ'];
    yy_buffer_read = 0;
    yy_buffer_index = 0;
    yy_buffer_start = 0;
    yy_buffer_end = 0;
    yychar = 0;
    yyline = 0;
    yy_at_bol = true;
    yy_lexical_state = 0;
  }
  
  private boolean yy_eof_done = false;
  private final int YYINITIAL = 0;
  private final int COMMENT = 1;
  private final int[] yy_state_dtrans = { 0, 34 };
  

  private void yybegin(int paramInt)
  {
    yy_lexical_state = paramInt;
  }
  


  private int yy_advance()
    throws IOException
  {
    if (yy_buffer_index < yy_buffer_read) {
      return yy_buffer[(yy_buffer_index++)];
    }
    int i;
    if (0 != yy_buffer_start) {
      int j = yy_buffer_start;
      int k = 0;
      while (j < yy_buffer_read) {
        yy_buffer[k] = yy_buffer[j];
        j++;
        k++;
      }
      yy_buffer_end -= yy_buffer_start;
      yy_buffer_start = 0;
      yy_buffer_read = k;
      yy_buffer_index = k;
      i = yy_reader.read(yy_buffer, yy_buffer_read, yy_buffer.length - yy_buffer_read);
      

      if (-1 == i) {
        return 129;
      }
      yy_buffer_read += i;
    }
    
    while (yy_buffer_index >= yy_buffer_read) {
      if (yy_buffer_index >= yy_buffer.length) {
        yy_buffer = yy_double(yy_buffer);
      }
      i = yy_reader.read(yy_buffer, yy_buffer_read, yy_buffer.length - yy_buffer_read);
      

      if (-1 == i) {
        return 129;
      }
      yy_buffer_read += i;
    }
    return yy_buffer[(yy_buffer_index++)];
  }
  
  private void yy_move_end() { if ((yy_buffer_end > yy_buffer_start) && ('\n' == yy_buffer[(yy_buffer_end - 1)]))
    {
      yy_buffer_end -= 1; }
    if ((yy_buffer_end > yy_buffer_start) && ('\r' == yy_buffer[(yy_buffer_end - 1)]))
    {
      yy_buffer_end -= 1; } }
  
  private boolean yy_last_was_cr = false;
  
  private void yy_mark_start() {
    for (int i = yy_buffer_start; i < yy_buffer_index; i++) {
      if (('\n' == yy_buffer[i]) && (!yy_last_was_cr)) {
        yyline += 1;
      }
      if ('\r' == yy_buffer[i]) {
        yyline += 1;
        yy_last_was_cr = true;
      } else { yy_last_was_cr = false;
      } }
    yychar = (yychar + yy_buffer_index - yy_buffer_start);
    
    yy_buffer_start = yy_buffer_index;
  }
  
  private void yy_mark_end() { yy_buffer_end = yy_buffer_index; }
  
  private void yy_to_mark() {
    yy_buffer_index = yy_buffer_end;
    yy_at_bol = ((yy_buffer_end > yy_buffer_start) && (('\r' == yy_buffer[(yy_buffer_end - 1)]) || ('\n' == yy_buffer[(yy_buffer_end - 1)]) || ('߬' == yy_buffer[(yy_buffer_end - 1)]) || ('߭' == yy_buffer[(yy_buffer_end - 1)])));
  }
  


  private String yytext()
  {
    return new String(yy_buffer, yy_buffer_start, yy_buffer_end - yy_buffer_start);
  }
  
  private int yylength()
  {
    return yy_buffer_end - yy_buffer_start;
  }
  
  private char[] yy_double(char[] paramArrayOfChar)
  {
    char[] arrayOfChar = new char[2 * paramArrayOfChar.length];
    for (int i = 0; i < paramArrayOfChar.length; i++) {
      arrayOfChar[i] = paramArrayOfChar[i];
    }
    return arrayOfChar; }
  
  private final int YY_E_INTERNAL = 0;
  private final int YY_E_MATCH = 1;
  private String[] yy_error_string = { "Error: Internal error.\n", "Error: Unmatched input.\n" };
  

  private void yy_error(int paramInt, boolean paramBoolean)
  {
    System.out.print(yy_error_string[paramInt]);
    System.out.flush();
    if (paramBoolean)
      throw new Error("Fatal Error.\n");
  }
  
  private int[][] unpackFromString(int paramInt1, int paramInt2, String paramString) {
    int i = -1;
    
    int j = 0;
    int k = 0;
    



    int[][] arrayOfInt = new int[paramInt1][paramInt2];
    for (int n = 0; n < paramInt1; n++)
      for (int i1 = 0; i1 < paramInt2; i1++)
        if (j != 0) {
          arrayOfInt[n][i1] = k;
          j--;
        }
        else {
          int m = paramString.indexOf(',');
          String str2 = m == -1 ? paramString : paramString.substring(0, m);
          
          paramString = paramString.substring(m + 1);
          i = str2.indexOf(':');
          if (i == -1) {
            arrayOfInt[n][i1] = Integer.parseInt(str2);
          }
          else {
            String str1 = str2.substring(i + 1);
            
            j = Integer.parseInt(str1);
            str2 = str2.substring(0, i);
            k = Integer.parseInt(str2);
            arrayOfInt[n][i1] = k;
            j--;
          }
        }
    return arrayOfInt; }
  
  private int[] yy_acpt = { 0, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 0, 4, 4, 4, 0, 4, 0, 0 };
  



































  private int[] yy_cmap = unpackFromString(1, 130, "20:8,15:2,17,20:2,16,20:18,15,20,18,20:5,3,4,9,7,1,8,22,10,21:10,14,2,12,11,13,20:2,23:26,5,19,6,20,24,20,23:26,20:5,0:2")[0];
  


  private int[] yy_rmap = unpackFromString(1, 35, "0,1:12,2,3,4,5,6,7,8,1:6,9,10,1,11,6,9,12,13,14")[0];
  

  private int[][] yy_nxt = unpackFromString(15, 25, "1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,27,16,17,28:2,18,28,19,28,-1:36,20,-1,21,-1:22,22,-1:24,23,-1:28,16,-1,16,-1:8,17:16,-1,25,29,17:5,-1:21,18,31,-1:23,19,-1,19:2,-1:21,26,-1:20,24,-1:8,17:14,32,17,33,30,29,17:5,-1,17:14,32,17,33,25,29,17:5,-1:15,33,-1,33,-1,17,-1:5,1,-1:24");
  




  public Yytoken yylex()
    throws IOException
  {
    int j = 4;
    int k = yy_state_dtrans[yy_lexical_state];
    int m = -1;
    int n = -1;
    int i1 = 1;
    

    yy_mark_start();
    int i2 = yy_acpt[k];
    if (0 != i2) {
      n = k;
      yy_mark_end();
    }
    for (;;) { int i;
      if ((i1 != 0) && (yy_at_bol)) i = 128; else
        i = yy_advance();
      m = -1;
      m = yy_nxt[yy_rmap[k]][yy_cmap[i]];
      if ((129 == i) && (1 == i1)) {
        return null;
      }
      if (-1 != m) {
        k = m;
        i1 = 0;
        i2 = yy_acpt[k];
        if (0 != i2) {
          n = k;
          yy_mark_end();
        }
      }
      else {
        if (-1 == n) {
          throw new Error("Lexical Error: Unmatched Input.");
        }
        
        j = yy_acpt[n];
        if (0 != (0x2 & j)) {
          yy_move_end();
        }
        yy_to_mark();
        String str; switch (n)
        {
        case -2: 
        case 1: 
          break;
        case 2: 
          return new Yytoken(0, yytext(), yyline, yychar, yychar + 1);
        case -3: 
          break;
        case 3: 
          return new Yytoken(1, yytext(), yyline, yychar, yychar + 1);
        case -4: 
          break;
        case 4: 
          return new Yytoken(2, yytext(), yyline, yychar, yychar + 1);
        case -5: 
          break;
        case 5: 
          return new Yytoken(3, yytext(), yyline, yychar, yychar + 1);
        case -6: 
          break;
        case 6: 
          return new Yytoken(4, yytext(), yyline, yychar, yychar + 1);
        case -7: 
          break;
        case 7: 
          return new Yytoken(5, yytext(), yyline, yychar, yychar + 1);
        case -8: 
          break;
        case 8: 
          return new Yytoken(6, yytext(), yyline, yychar, yychar + 1);
        case -9: 
          break;
        case 9: 
          return new Yytoken(7, yytext(), yyline, yychar, yychar + 1);
        case -10: 
          break;
        case 10: 
          return new Yytoken(8, yytext(), yyline, yychar, yychar + 1);
        case -11: 
          break;
        case 11: 
          return new Yytoken(9, yytext(), yyline, yychar, yychar + 1);
        case -12: 
          break;
        case 12: 
          return new Yytoken(10, yytext(), yyline, yychar, yychar + 1);
        case -13: 
          break;
        case 13: 
          return new Yytoken(12, yytext(), yyline, yychar, yychar + 1);
        case -14: 
          break;
        case 14: 
          return new Yytoken(14, yytext(), yyline, yychar, yychar + 1);
        case -15: 
          break;
        
        case 15: 
          System.out.println("Illegal character: <" + yytext() + ">");
          Utility.error(3);
        
        case -16: 
          break;
        
        case -17: 
        case 16: 
          break;
        
        case 17: 
          str = yytext().substring(1, yytext().length());
          Utility.error(2);
          Utility.jdMethod_assert(str.length() == yytext().length() - 1);
          return new Yytoken(41, str, yyline, yychar, yychar + str.length());
        
        case -18: 
          break;
        
        case 18: 
          return new Yytoken(18, yytext(), yyline, yychar, yychar + yytext().length());
        
        case -19: 
          break;
        
        case 19: 
          return new Yytoken(19, yytext(), yyline, yychar, yychar + yytext().length());
        case -20: 
          break;
        
        case 20: 
          return new Yytoken(13, yytext(), yyline, yychar, yychar + 2);
        case -21: 
          break;
        case 21: 
          return new Yytoken(11, yytext(), yyline, yychar, yychar + 2);
        case -22: 
          break;
        case 22: 
          return new Yytoken(15, yytext(), yyline, yychar, yychar + 2);
        case -23: 
          break;
        case 23: 
          return new Yytoken(16, yytext(), yyline, yychar, yychar + 2);
        case -24: 
          break;
        
        case -25: 
        case 24: 
          break;
        
        case 25: 
          str = yytext().substring(1, yytext().length() - 1);
          Utility.jdMethod_assert(str.length() == yytext().length() - 2);
          return new Yytoken(17, str, yyline, yychar, yychar + str.length());
        
        case -26: 
          break;
        
        case 26: 
          return new Yytoken(18, yytext(), yyline, yychar, yychar + yytext().length());
        
        case -27: 
          break;
        
        case 28: 
          System.out.println("Illegal character: <" + yytext() + ">");
          Utility.error(3);
        
        case -28: 
          break;
        
        case 29: 
          str = yytext().substring(1, yytext().length());
          Utility.error(2);
          Utility.jdMethod_assert(str.length() == yytext().length() - 1);
          return new Yytoken(41, str, yyline, yychar, yychar + str.length());
        
        case -29: 
          break;
        
        case 30: 
          str = yytext().substring(1, yytext().length() - 1);
          Utility.jdMethod_assert(str.length() == yytext().length() - 2);
          return new Yytoken(17, str, yyline, yychar, yychar + str.length());
        
        case -30: 
          break;
        
        case 32: 
          str = yytext().substring(1, yytext().length());
          Utility.error(2);
          Utility.jdMethod_assert(str.length() == yytext().length() - 1);
          return new Yytoken(41, str, yyline, yychar, yychar + str.length());
        case -31: 
          break;
        case 0: case 27: 
        case 31: default: 
          yy_error(0, false);
        }
        
        i1 = 1;
        k = yy_state_dtrans[yy_lexical_state];
        m = -1;
        n = -1;
        yy_mark_start();
        i2 = yy_acpt[k];
        if (0 != i2) {
          n = k;
          yy_mark_end();
        }
      }
    }
  }
}
