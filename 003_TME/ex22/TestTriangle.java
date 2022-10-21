/**
 * @author Baptiste Audugé
 */

public class TestTriangle {
  public static void main(String[] args) {
    Point p1 = new Point(1, 1);
    Point p2 = new Point(2, 2);
    Point p3 = new Point(3, 3);
    Triangle t1 = new Triangle(p1, p2, p3);
    Triangle t2 = new Triangle(p1, p2, p3);


    System.out.println(p1);
    System.out.println(p2);
    System.out.println(p3);
    System.out.println("P1 - P2" + p1.distance(p2));
    System.out.println("P2 - P3" + p2.distance(p3));
    System.out.println("P3 - P1" + p3.distance(p1));
    System.out.println(t1.getPerimeter());
    System.out.println("p1 == p2 ? " + p1.equals(p2));
    System.out.println("t1 == t2 ? " + t1.equals(t2));
    System.out.println(t1);
  }
}
