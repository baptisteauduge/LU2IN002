/**
 * @author Baptiste Audugé
 */

import java.lang.Math;

public class Cone{
  private double r;
  private double h;
  private final static double PI = 3.14159;
  private static int nbCones = 0;

  public Cone(double r, double h) {
    this.r = r;
    this.h = h;
    ++nbCones;
  }

  public Cone() {
    this(Math.random() % 10, Math.random() % 10);
  }

  public double getVolume() {
    return (PI * r * r * h) / 3;
  }
  
  public String toString() {
    return "Cone r=" + r + " h=" + h + " V=" + getVolume();
  }

  public static int getNbCones() {
    return nbCones;
  }
}
