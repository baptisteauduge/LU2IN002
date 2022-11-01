/**
 * @author Baptiste Audugé
 */

public class Piano extends Instrument {

  private int nbrTouches;

  public Piano(int nbrTouches, int poids, int prix) {
    super(poids, prix);
    this.nbrTouches = nbrTouches;
  }

  public String toString() {
    return "Piano " + nbrTouches + " touches, " + super.toString();
  }

  public void jouer() {
    System.out.println("Le piano " + nbrTouches + " touches joue");
  }
}
