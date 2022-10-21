/**
 * @author Baptiste Audugé
 */

import java.lang.Math;

public class Machin {
  private String myString;
  private int myInt;

  public Machin() {
    this("machin" + (int) (Math.random() * 50), (int) (Math.random() * 50));
  }

  public Machin(String myString, int myInt) {
    this.myString = myString;
    this.myInt = myInt;
  }

  public String toString() {
    return myString + myInt;
  }
}
