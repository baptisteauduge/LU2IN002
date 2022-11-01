/**
 * @author Baptiste Audugé
 */

public class TestVelo {

  public static void main(String[] args) {
    Velo v = new Velo("MyVTT", 17);
    System.out.println(v);
    v.transporter("Paris", "Lyon");
    v.rouler(10);
  }
}