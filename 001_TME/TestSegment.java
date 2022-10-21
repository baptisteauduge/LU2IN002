/**
 * @author Baptiste Audugé
 */

public class TestSegment {

  public static void main(String[] args) {
    Segment seg1 = new Segment(6, 8);
    Segment seg2 = new Segment(12, 5);

    if (seg1.longueur() > seg2.longueur()) {
      System.out.println("Segment 1 est plus long");
    } else {
      System.out.println("Segment 2 est plus long");
    }
  }
}
