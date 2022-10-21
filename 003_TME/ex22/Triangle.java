/**
 * @author Baptiste Audugé
 */

public class Triangle {
  private Point p1;
  private Point p2;
  private Point p3;

  /**
   * Constructor
   * @param p1 the first point
   * @param p2 the second point
   * @param p3 the third point
   */
  public Triangle(Point p1, Point p2, Point p3) {
    this.p1 = p1;
    this.p2 = p2;
    this.p3 = p3;
  }

  /**
   * Constructor
   */
  public Triangle() {
    this(new Point(), new Point(), new Point());
  }

  /**
   * @return the perimeter of the triangle
   */
  public double getPerimeter() {
    return p1.distance(p2) + p2.distance(p3) + p3.distance(p1);
  }

  /**
   * @return A string representation of the triangle with points and perimeter
   */
  public String toString() {
    return "Triangle: " + p1 + ", " + p2 + ", " + p3 + " de perimètre " + getPerimeter();
  }

  /**
   * 
   * @param t the triangle to compare
   * @return if the triangle is equal to t (same points)
   */
  public boolean equals(Triangle t) {
    return (
      p1.equals(t.p1) && p2.equals(t.p2) && p3.equals(t.p3)
      );
  }

}
