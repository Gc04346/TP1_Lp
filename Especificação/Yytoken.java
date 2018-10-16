package lp;

class Yytoken
{
  public int m_index;
  public String m_text;
  public int m_line;
  public int m_charBegin;
  public int m_charEnd;

  Yytoken(int paramInt1, String paramString, int paramInt2, int paramInt3, int paramInt4)
  {
    m_index = paramInt1;
    m_text = new String(paramString);
    m_line = paramInt2;
    m_charBegin = paramInt3;
    m_charEnd = paramInt4;
  }
  public String toString()
  {
    return "Token #" + m_index + ": " + m_text + " (line " + m_line + ")";
  }
}
