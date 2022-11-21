public class Carre extends Rectangle {
  
    public Carre(double cote) {
      super(cote, cote);
    }

    public String toString() {
      return super.toString() + ", carré de côté " + this.largeur;
    }
}