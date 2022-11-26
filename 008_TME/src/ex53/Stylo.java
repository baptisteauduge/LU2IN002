/**
 * @author Baptiste Audugé, (Groupe Double Majeur Mathématiques et Informatique)
 */
package ex53;
public class Stylo {

  private String couleur;

  public Stylo(String couleur) {
    this.couleur = couleur;
  }

  public String getCouleur() {
    return couleur;
  }

  @Override
  public String toString() {
    return "Stylo " + couleur;
  }
}
