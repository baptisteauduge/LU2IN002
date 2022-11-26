/**
 * @author Baptiste Audugé, (Groupe Double Majeur Mathématiques et Informatique)
 */
package ex52;
import java.lang.Math;

public class Champignon implements Ramassable {
  private String nom;
  private double poids;

  public Champignon(String nom) {
    this.nom = nom;
    this.poids = ((double) ((int) (Math.random() * 300))) / 100;
  }

  public double getPoids() {
    return poids;
  }

  @Override
  public String toString() {
    return nom +  " " + poids + "kg";
  }
}