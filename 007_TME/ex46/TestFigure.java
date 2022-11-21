public class TestFigure {

  public static void main(String[] args) {
    Figure2D[] figures = new Figure2D[4];
    figures[0] = new Rectangle(2, 3);
    figures[1] = new Carre(2);
    figures[2] = new Ellipse(2, 3);
    figures[3] = new Cercle(3);

    for (Figure2D f : figures) {
      System.out.println(f);
      System.out.println("Surface: " + f.surface());
      System.out.println("Périmètre: " + f.perimetre());
    }
  }
}