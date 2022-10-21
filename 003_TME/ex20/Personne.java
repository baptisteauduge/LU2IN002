/**
 * @author Baptiste Audugé
 */

import java.lang.Math;

public class Personne {

  private String nom;
  private Personne conjoint;

  public Personne() {
    this("pers");
    nom = nom + tirageLettre() + tirageLettre() + tirageLettre();
  }

  public Personne(String nom) {
    this.nom = nom;
  }

  public String toString() {
    return nom + (conjoint != null ? " marié(e)" : " célibataire");
  }

  public void epouser(Personne p) {
    if (conjoint != null || p.conjoint != null) {
      System.out.println("Ce mariage est impossible");
      return;
    }
    conjoint = p;
    p.conjoint = this;
  }

  public void divorcer() {
    if (conjoint != null) {
      conjoint.conjoint = null;
      conjoint = null;
    }
  }
  
  private char tirageLettre() {
    return (char) (Math.random()*26 + 'A');
  }

}
