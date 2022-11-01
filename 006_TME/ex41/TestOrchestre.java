/**
 * @author Baptiste Audugé
 */

public class TestOrchestre {

  public static void main(String[] args) {
    Guitare g1 = new Guitare("Electrique", 3, 1000);
    Piano p1 = new Piano(88, 200, 20000);
    Orchestre o1 = new Orchestre();
    o1.ajouterInstrument(g1);
    o1.ajouterInstrument(p1);

    System.out.println(g1);
    System.out.println(p1);
    o1.jouer();
  }
}
