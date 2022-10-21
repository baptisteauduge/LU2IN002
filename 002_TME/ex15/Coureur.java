/**
 * @author Baptiste Audugé
 */

import java.lang.Math;

public class Coureur {

  private int numDossard;
  private double tempsAu100;
  private boolean possedeTemoin;

  public Coureur(int numDossard) {
    this.numDossard = numDossard;
    this.tempsAu100 = Math.random() * (16 - 12) + 12;
    this.possedeTemoin = false;
  }

  public Coureur() {
    this((int) Math.random()*(1000) + 1);
  }

  public int getNumDossard() { 
    return numDossard;
  }

  public double getTempsAu100() { 
    return tempsAu100;
  }

  public boolean getPossedeTemoin() {
    return possedeTemoin;
  }

  public void setPossedeTemoin(boolean possedeTemoin) {
    this.possedeTemoin = possedeTemoin;
  }

  public String toString() {
    return "Coureur " + numDossard + " tempsAu100: " + String.format("%.2f", tempsAu100) 
    + "s au 100m, possedeTemoin : " + (possedeTemoin ? "oui" : "non");
  }
  
  public void passeTemoin(Coureur c) {
    if (!possedeTemoin || c.possedeTemoin)
      return;
    
    possedeTemoin = false;
    c.possedeTemoin = true ;
    System.out.println("Moi, coureur " + numDossard + " passe le témoin au coureur " + c.numDossard);
  }

  public void courir() {
    System.out.println("Je suis le coureur " + numDossard + " et je cours");
  }
}
