/**
 * @author Baptiste Audugé
 */

public class Velo extends VehiculeSansMoteur {

  private int nbVitesses;

  public Velo(String marque, int nbVitesses) {
    super(marque);
    this.nbVitesses = nbVitesses;
  }

  public String toString() {
    return "Vélo " + super.toString() + " a " + nbVitesses + " vitesses";
  }

  public void transporter(String depart, String arrivee) {
    System.out.println("Vélo " + super.id + " se déplace de " + depart + " à " + arrivee);
  }  
}
