/**
 * @author Baptiste Audugé
 */

public class TestCone {
  public static void main(String[] args) {
    System.out.println("Nombre de cônes créés " + Cone.getNbCones());

    Cone c1 = new Cone(2, 12);
    System.out.println("1: " + c1);
    Cone c2 = new Cone();
    System.out.println("2: " + c2);
    
    System.out.println("Nombre de cônes créés " + Cone.getNbCones());
  }
}
