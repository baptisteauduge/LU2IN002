/**
 * @author Baptiste Audugé
 */

public class Pile {

  private Machin[] pile;
  private int nbrElements;

  public Pile(int sizeMax) {
    pile = new Machin[sizeMax];
    nbrElements = 0;
  }
  
  /**
   * @return if the pile is empty
   */
  public boolean estVide() {
    return nbrElements == 0;
  }

  /**
   * @return if the pile is full
   */
  public boolean estPlein() {
    return nbrElements == pile.length;
  }

  /**
   * @param n The "machin" you want to add to the pile
   */
  public void empiler(Machin n){
    if (!estPlein())
      pile[nbrElements++] = n;
  }

  /**
   * Return an element on the top of the pile and delete it from the pile
   */
  public Machin depiler(){
    if (!estVide()){
      return pile[--nbrElements];
    }
    return null;
  }

  public String toString() {
    if (nbrElements == 0) return "";
    String result = "";

    for (int i = nbrElements - 1; i > 0; --i) {
      result += pile[i] + "\n";
    }
    
    return result + pile[0];
  }

}
