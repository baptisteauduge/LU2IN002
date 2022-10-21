/**
 * @author Baptiste Audugé
 */

public class TestPersonne {

  public static void main(String[] args) {
    Personne p1 = new Personne();
    Personne p2 = new Personne("Baptiste");
    Personne p3 = new Personne("Jean");

    System.out.println("Les personnes :");
    System.out.println(p1);
    System.out.println(p2);
    System.out.println(p3);

    System.out.println("Mariage de " + p1 + " et " + p2);
    p1.epouser(p2);
    System.out.println("Mariage de " + p1 + " et " + p3);
    p1.epouser(p3);
    System.out.println("Divorce de " + p2 + " et " + p1);
    p2.divorcer();
    System.out.println("Mariage de " + p2 + " et " + p3);
    p2.epouser(p3);

    System.out.println(p1);
    System.out.println(p2);
    System.out.println(p3);

  }

}
