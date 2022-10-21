/**
 * @author Baptiste Audugé
 */

public class Lettre {

  private char carac;

  public Lettre (char c) {
    carac = c;
  }

  public char getCarac() { 
    return carac; 
  }

  public int getAscii() { 
    return (int) carac; 
  }
}
