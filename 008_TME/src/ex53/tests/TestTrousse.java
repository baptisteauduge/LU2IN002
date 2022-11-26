/**
 * @author Baptiste Audugé, (Groupe Double Majeur Mathématiques et Informatique)
 */
package ex53.tests;
import ex53.*;
public class TestTrousse {

  public static void main(String[] args) {

    Stylo s1 = new Stylo("rouge");
    Stylo s2 = new Stylo("vert");
    Trousse t = new Trousse();

    t.addStylo(s1);
    t.addStylo(s2);
    assert t.getNbrStylos() == 2;

    System.out.println(t);
    System.out.println("Suppression du premier stylo ...");
    t.removeFirstStylo();
    System.out.println(t);
    System.out.println("Suppression du premier stylo ...");
    t.removeFirstStylo();
    System.out.println(t);
    System.out.println("Suppression du premier stylo ...");
    t.removeFirstStylo();
    System.out.println(t);
  }
}