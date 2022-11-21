public abstract class Animal {
  protected String nom;
  protected int age;

  public Animal(String nom, int age) {
    this.nom = nom;
    this.age = age;
  }

  public Animal(String nom) {
    this(nom, 1);
  }

  public String toString() {
    return "Animal " + nom + " de " + age + " ans";
  }

  public void vieillir() {
    ++age;
  }

  public abstract void crier();

}