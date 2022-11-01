/**
 * @author Baptiste Audugé
 */

public class TestVoiture {

  public static void main(String[] args) {
    Voiture v1 = new Voiture("Renault", 50);
    Voiture v2 = new Voiture("Peugeot", 60);
    System.out.println(v1);
    System.out.println(v2);

    v1.approvisionner(20);
    v1.transporter(5, 50);
    v2.transporter(2, 200);
  }
}
