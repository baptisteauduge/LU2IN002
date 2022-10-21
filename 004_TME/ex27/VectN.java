/**
 * @author Baptiste Audugé
 */

public class VectN {
  private int[] tab;

  public VectN() {
    this(5, 9);
  }

  private VectN(int n) {
    tab = new int[n];
  }

  public VectN(int n, int valMax) {
    this(n);
    for (int i = 0; i < n; i++) {
      tab[i] = (int) (Math.random() * valMax);
    }
  }

  public VectN(int a, int b, int c) {
    this(3);
    tab[0] = a;
    tab[1] = b;
    tab[2] = c;
  }

  public String toString() {
    String s = "[";
    for (int elem : tab) {
      s += elem + ", ";
    }
    return s.substring(0, s.length() - 2) + "]";
  }

  /**
   * @return the the sum of all the elements of the vector
   */
  public int somme() {
    int sum = 0;
    for (int elem : tab)
      sum += elem;
    return sum;
  }

  public int[] getTab() {
    return tab.clone();
  }
  
}
