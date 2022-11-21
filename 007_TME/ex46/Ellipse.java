public class Ellipse extends Figure2D {

  protected double demiGrandAxe;
  protected double demiPetitAxe;

  public Ellipse(double demiGrandAxe, double demiPetitAxe) {
    super();
    this.demiGrandAxe = demiGrandAxe;
    this.demiPetitAxe = demiPetitAxe;
  }

  public String toString() {
    return super.toString() + ", ellipse de demi grand axe " +
    this.demiGrandAxe + " et de demi petit axe " + this.demiPetitAxe;
  }

  public double surface() {
    return Math.PI * this.demiGrandAxe * this.demiPetitAxe;
  }

  public double perimetre() {
    return 2 * Math.PI * Math.sqrt(
      (this.demiGrandAxe * this.demiGrandAxe +
      this.demiPetitAxe * this.demiPetitAxe) / 2
    );
  }

}