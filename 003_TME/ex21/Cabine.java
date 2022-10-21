/**
 * @author Baptiste Audugé
 */
public class Cabine {
  private int volume; // en m3
  private String couleur;
  
  /**
   * Constructeur de la classe Cabine
   * @param volume Le volume de la cabine en m3
   * @param couleur La couleur de la cabine
   */
  public Cabine(int volume, String couleur) {
    this.volume = volume;
    this.couleur = couleur;
  }

  /**
   * Return a String representation of this Cabine.
   * @return le volume en m3 et la couleur de la cabine
   */
  public String toString() {
    return "Cabine de volume " + volume + " m3 et de couleur " + couleur;
  }

  /**
   * Set the color of the cabine
   * @param couleur La couleur de la cabine
   */
  public void setCouleur(String couleur) {
    this.couleur = couleur;
  }

  /**
   * Create a clone of this instance
   * @return a new instance of this class with the same paramters than this instance
   */
  public Cabine clone() {
    return new Cabine(volume, couleur);
  }

}
