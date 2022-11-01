/**
 * @author Baptiste Audugé
 */

public class Instrument {
  protected int poids;
  protected int prix;

  /**
   * 
   * @param poids en kg
   * @param prix en euros
   */
  public Instrument(int poids, int prix) {
    this.poids = poids;
    this.prix = prix;
  }

  public String toString() {
    return "poids : " + poids +" kg, prix : " + prix + " euros";
  }

  public void jouer() {
    System.out.println("L'instrument joue");
  }
}
