/**
 * @author Baptiste Audugé
 */

public class Vehicule {
  private static int counter = 0;
  protected int id;
  private String marque;
  private double distanceParcourue;

  public Vehicule(String marque) {
    this.marque = marque;
    this.distanceParcourue = 0;
    this.id = ++counter;
  }

  public String toString() {
    return  id + " de marque " + marque;
  }

  public void rouler(double distance) {
    distanceParcourue += distance;
    System.out.println(toString() + " a roulé " + distanceParcourue + " km");
  }
}
