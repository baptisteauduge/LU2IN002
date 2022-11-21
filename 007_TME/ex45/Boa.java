public class Boa extends AnimalSansPattes {

  public Boa(String nom, int age) {
    super(nom, age);
  }

  public Boa(String nom) {
    super(nom);
  }

  public String toString() {
    return "Boa, " + super.toString();
  }

  public void crier() {
    System.out.println("**bruit d'un boa**");
  }
}
