/**
 * @author Baptiste Audugé
 */

public class TestVecteur {

  public static void main(String[] args) {
    Vecteur v1 = new Vecteur(10, 1, 7);
    Vecteur v2 = new Vecteur();

    System.out.println("v1 : " + v1);
    System.out.println("v2 : " + v2);

    System.out.println("Somme via instance : " + v1.somme(v2));
    System.out.println("Somme via classe : " + Vecteur.sommeStatic(v1, v2));


  }
}
