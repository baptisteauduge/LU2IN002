/**
 * @author Baptiste Audugé
 */

public class VehiculeSansMoteur extends Vehicule{

  public VehiculeSansMoteur(String marque) {
    super(marque);
  }

  public String toString() {
    return super.toString() + " sans moteur";
  }
}
