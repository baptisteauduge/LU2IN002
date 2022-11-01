/**
 * @author Baptiste Audugé
 */

public class Voiture extends VehiculeAMoteur {

  public Voiture(String marque, int capaciteReservoir) {
    super(marque, capaciteReservoir);
  }

  public String toString() {
    return "Voiture " + super.toString();
  }

  public void transporter(int nbrPers, int km) {
    if (!super.enPanne()) {
      System.out.println("La voiture " + super.id + " transporte " 
      + nbrPers + " personnes sur " + km + " km");
    } else {
      System.out.println("La voiture " + super.id + " n'a plus d'essence !");
    }
  }
}