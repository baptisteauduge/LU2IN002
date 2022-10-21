/**
 * @author Baptiste Audugé
 */
public class TestTracteur {
  public static void main(String[] args) {
    Roue r1 = new Roue(120);
    Roue r2 = new Roue(120);
    Roue r3 = new Roue();
    Roue r4 = new Roue();

    Cabine c1 = new Cabine(3, "bleue");
    
    Tracteur t1 = new Tracteur(r1, r2, r3, r4, c1);
    System.out.println(t1);

    Tracteur t2 = t1.clone();
    t2.peindre("rouge");

    System.out.println("Tracteur 1 :" + t1);
    System.out.println("Tracteur 2 :" + t2);

  }
}
