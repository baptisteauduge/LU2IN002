/**
 * @author Baptiste Audugé
 */

public class Personne {

  private String nom;
  private static int nbrPersonnes = 0;
  private static char lettre = 'A';

  public Personne() {
    ++nbrPersonnes;
    nom = "Individu" + (char) lettre++;
  }

  public String toString() {
    return nom;
  }

  public static int getNbrPersonnes() {
    return nbrPersonnes;
  }
}
