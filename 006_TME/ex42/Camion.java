/**
 * @author Baptiste Audugé
 */

public class Camion extends VehiculeAMoteur {

  public Camion(String marque, int capaciteReservoir) {
    super(marque, capaciteReservoir);
  }

  public String toString() {
    return "Camion " + super.toString();
  }

  public void transporter(int materiau, int km) {
    if (!super.enPanne()) {
      System.out.println("Le camion " + super.id + " a transporté " 
      + materiau + " sur " + km + " km");
    } else {
      System.out.println("Le camion " + super.id + " n'a plus d'essence !");
    }
  }
}