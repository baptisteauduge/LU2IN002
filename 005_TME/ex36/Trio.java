/**
 * @author Baptiste Audugé
 */

public class Trio {
  
  private Personne[] personnes = new Personne[3];
  private int numero = 0;
  private static int numeroCount = 0;

  public Trio() {
    personnes[0] = new Personne();
    personnes[1] = new Personne();
    personnes[2] = new Personne();
    numero = ++numeroCount;
  }

  public String toString() {
    return "Trio " + numero + " : " + personnes[0] 
    + " " + personnes[1] + " " + personnes[2];
  }

  public static int getNbrTrio() {
    return numeroCount;
  }
}
