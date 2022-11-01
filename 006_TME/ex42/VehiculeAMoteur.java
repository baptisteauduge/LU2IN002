/**
 * @author Baptiste Audugé
 */

public class VehiculeAMoteur extends Vehicule {

  private int capaciteReservoir;
  private int niveauEssence;

  public VehiculeAMoteur(String marque, int capaciteReservoir) {
    super(marque);
    this.capaciteReservoir = capaciteReservoir;
    this.niveauEssence = 0;
  }

  public String toString() {
    return super.toString() + " et a " + niveauEssence + 
    " litres d'essence dans son reservoir de " + capaciteReservoir + " litres";
  }

  public void approvisionner(int litres) {
    if (litres > capaciteReservoir - niveauEssence) {
      niveauEssence = capaciteReservoir;
    } else {
      niveauEssence += litres;
    }
  }

  public boolean enPanne() {
    return niveauEssence == 0;
  }
}
