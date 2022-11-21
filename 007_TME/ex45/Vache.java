import java.lang.Math;

public class Vache extends AnimalAPattes {

  private int quantiteLait;

  public Vache(String nom, int age){
    super(nom, age, 4);
    quantiteLait =  5 + (int) (Math.random() * 25);
  }

  public Vache(String nom){
    super(nom, 4);
    quantiteLait =  5 + (int) (Math.random() * 25);
  }

  public String toString() {
    return "Vache, " + super.toString() + " produit " + quantiteLait + "L de lait/jours";
  }

  public void crier() {
    System.out.println("Meuuuuuh");
  }
}