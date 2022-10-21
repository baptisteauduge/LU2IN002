/**
 * @author Baptiste Audugé
 */
public class Roue {

  private int diametre;
  
  /**
   * Constructeur de la classe Roue
   * @param diametre en cm
   */
  public Roue(int diametre) {
    this.diametre = diametre;
  }

  /**
   * Constructeur de la classe Roue
   */
  public Roue(){
    this(60);
  }

  /**
   * @return the diametre
   */
  public String toString() {
    return "Roue de diametre " + diametre + " cm";
  }

  /**
   * Create a clone of this instance
   * @return a new instance of this class with the same paramters than this instance
   */
  public Roue clone() {
    return new Roue(diametre);
  }
}
