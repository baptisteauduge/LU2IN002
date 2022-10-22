/**
 * @author Baptiste Audugé
 */

import java.lang.Math;

public class Vecteur {
  private double x, y, z;

  public Vecteur(double x, double y, double z) {
    this.x = x;
    this.y = y;
    this.z = z;
  }

  public Vecteur() {
    this(Math.random() * 10, Math.random() * 10, Math.random() * 10);
  }

  public String toString() {
    return "(" + x + ", " + y + ", " + z + ")";
  }

  public Vecteur somme(Vecteur v1) {
    Vecteur resVect = new Vecteur(0, 0, 0);
    resVect.x = v1.x + x;
    resVect.y = v1.y + y;
    resVect.z = v1.z + z;

    return resVect;
  }

  public static Vecteur sommeStatic(Vecteur v1, Vecteur v2) {
    Vecteur resVect = new Vecteur(0, 0, 0);
    resVect.x = v1.x + v2.x;
    resVect.y = v1.y + v2.y;
    resVect.z = v1.z + v2.z;

    return resVect;
  }
}
