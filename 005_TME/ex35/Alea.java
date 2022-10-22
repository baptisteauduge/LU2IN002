/**
 * @author Baptiste Audugé
 */

import java.lang.Math;

public class Alea {

  private static final int SIZE_CHAINE = 10;

  private Alea() {}

  public static char lettre() {
    return (char) ((int) (Math.random() * 26) + 'a');
  }

  public static String chaine() {
    String res = "";
    for (int i = 0; i < SIZE_CHAINE; ++i) {
      res += lettre();
    }
    return res;
  }

  public static void main(String args[]) {
    System.out.println("Alea : chaine = " + chaine());
  }
}
