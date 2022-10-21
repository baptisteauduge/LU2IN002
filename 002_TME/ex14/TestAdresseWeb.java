/**
 * @author Baptiste Audugé
 */

public class TestAdresseWeb {

  public static void main(String[] args) {
    AdresseWeb site1 = new AdresseWeb("https", "auduge.com", "/cv/");
    AdresseWeb site2 = new AdresseWeb("jean.com", "/hey/");
    AdresseWeb site3 = new AdresseWeb("auduge.com");

    System.out.println(site1.toString());
    System.out.println(site2.toString());
    System.out.println(site3.toString());    
  }
}
