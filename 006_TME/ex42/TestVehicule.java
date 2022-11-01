/**
 * @author Baptiste Audugé
 */

public class TestVehicule {

  public static void main(String[] args) {
    Vehicule[] vehicules = new Vehicule[3];
    vehicules[0] = new Voiture("Renault", 50);
    vehicules[1] = new Velo("Peugeot", 17);
    vehicules[2] = new Camion("Mercedes", 100); 

    for (Vehicule v : vehicules) {
      v.rouler(10);
    }
  }
}
