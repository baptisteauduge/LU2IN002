/**
 * @author Baptiste Audugé
 */

public class Tracteur {
  private Roue roue1;
  private Roue roue2;
  private Roue roue3;
  private Roue roue4;
  private Cabine cabine;

  /**
   * Constructeur de la classe Tracteur
   * @param r1 La roue 1 du tracteur
   * @param r2 La roue 2 du tracteur
   * @param r3 La roue 3 du tracteur
   * @param r4 La roue 4 du tracteur
   * @param c La cabine du tracteur
   */
  public Tracteur(Roue r1, Roue r2, Roue r3, Roue r4, Cabine c){
    this.roue1 = r1;
    this.roue2 = r2;
    this.roue3 = r3;
    this.roue4 = r4;
    this.cabine = c;
  }

  /**
   * @return A string of the tractor
   */
  public String toString() {
    return "Tracteur avec " + roue1 + ", " + roue2 + ", " + roue3 + ", " + roue4 + " et " + cabine;
  }

  /**
   * Set a new color to the cabine of the tractor
   * @param couleur La couleur de la cabine
   */
  public void peindre(String couleur) {
    cabine.setCouleur(couleur);
  }

  public Tracteur clone() {
    return new Tracteur(roue1.clone(), roue2.clone(), roue3.clone(), roue4.clone(), cabine.clone());
  }

}
