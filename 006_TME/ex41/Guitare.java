/**
 * @author Baptiste Audugé
 */

public class Guitare extends Instrument {

  private String type;

  public Guitare(String type, int poids, int prix) {
    super(poids, prix);
    this.type = type;
  }

  public String toString() {
    return "Guitare " + type + ", " + super.toString();
  }

  public void jouer() {
    System.out.println("La guitare " + type + " joue");
  }
}
