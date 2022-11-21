public class Rectangle extends Figure2D {

  protected double longueur;
  protected double largeur;

  public Rectangle(double longueur, double largeur) {
    super();
    this.longueur = longueur;
    this.largeur = largeur;
  }

  public String toString() {
    return super.toString() + ", rectangle de longueur " +
    this.longueur + " et de largeur " + this.largeur;
  }

  public double surface() {
    return this.longueur * this.largeur;
  }

  public double perimetre() {
    return 2 * (this.longueur + this.largeur);
  }
}