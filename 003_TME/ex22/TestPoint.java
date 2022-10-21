/**
 * @author Baptiste Audugé
 */

class TestPoint {
    public static void main(String[] args) {
        Point p1 = new Point(1, 2);
        Point p2 = new Point(3, 4);
        System.out.println("x1 = " + p1.getPosx() + " y1 = " + p1.getPosy());
        p1.setPosx(10);
        p1.setPosy(20);
        p2.deplaceToi(10, 4);
        System.out.println("P1: " + p1);
        System.out.println("P2: " + p2);
        System.out.println(p1.distance(p2));
    }
}
