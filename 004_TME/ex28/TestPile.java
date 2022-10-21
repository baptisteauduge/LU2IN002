/**
 * @author Baptiste Audugé
 */

public class TestPile {

  public static void main(String[] args) {
    Pile p1 = new Pile(3);
    p1.empiler(new Machin());
    p1.empiler(new Machin());
    p1.empiler(new Machin());

    System.out.println("P1 APRES 3 EMPILER : ");
    System.out.println(p1);

    System.out.println("On dépile");
    System.out.println(p1.depiler());

    System.out.println("P1 APRES 1 DEPILER : " + p1);

    p1.empiler(new Machin());
    p1.empiler(new Machin());

    System.out.println("P1 APRES 2 EMPILER : " + p1);

    System.out.println("On dépile");

    System.out.println(p1.depiler());
    System.out.println(p1.depiler());
    System.out.println(p1.depiler());
    System.out.println(p1.depiler());

    System.out.println("P1 APRES 4 DEPILER: " + p1);
  }
}
