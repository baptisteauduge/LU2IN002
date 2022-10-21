/**
 * @author Baptiste Audugé
 */

public class TestVectN {

  public static void main(String[] args) {
    VectN v1 = new VectN();
    VectN v2 = new VectN(10, 50);
    VectN v3 = new VectN(10, 50, -10);
    int[] v3Array = v3.getTab();
    v3Array[2] = 100;

    System.out.println("Sum of v3: " + v3.somme());
    System.out.println(v1);
    System.out.println(v2);
    System.out.println(v3);
  }
}
