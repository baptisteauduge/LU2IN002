/**
 * @author Baptiste Audugé, (Groupe Double Majeur Mathématiques et Informatique)
 */
package ex52;
public class ChampignonToxique extends Champignon implements Toxique {

  public ChampignonToxique(String nom) {
    super(nom);
  }

  @Override
  public String toString() {
    return super.toString() + ", toxique";
  }
}