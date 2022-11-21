public class Cercle extends Ellipse {
  
    public Cercle(double rayon) {
      super(rayon, rayon);
    }
  
    public String toString() {
      return super.toString() + ", cercle de rayon " + this.demiGrandAxe;
    }

    public double perimetre() {
      return 2 * Math.PI * this.demiGrandAxe;
    }
}