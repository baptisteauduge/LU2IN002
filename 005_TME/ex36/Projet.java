/**
 * @author Baptiste Audugé
 */

public class Projet {
  private String nom;
  private Trio trio;
  private static int nbrProjets = 0;

  public Projet(String nom) {
    ++nbrProjets;
    this.nom = nom;
    trio = new Trio();
  }

  public String toString() {
    return "Projet " + nom + " " + trio;
  }

  public static int getNbrProjets() {
    return nbrProjets;
  }
}
