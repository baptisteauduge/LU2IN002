public class Menagerie {
  public final static int MAX_ANIMAUX = 10;
  private Animal[] animaux;
  private int nbAnimaux;

  public Menagerie() {
    animaux = new Animal[MAX_ANIMAUX];
    nbAnimaux = 0;
  }

  public void Ajouter(Animal a) {
    if (nbAnimaux < MAX_ANIMAUX) {
      animaux[nbAnimaux++] = a;
    }
  }

  public String toString() {
    String s = "Menagerie de " + nbAnimaux + " animaux:\n";
    for (int i = 0; i < nbAnimaux; ++i) {
      s += "[" + i + "] " + animaux[i] + "\n";
    }

    return s;
  }

  public void midi() {
    for (int i = 0; i < nbAnimaux; ++i) {
      animaux[i].crier();
    }
  }

  public void vieillirTous() {
    for (int i = 0; i < nbAnimaux; ++i) {
      animaux[i].vieillir();
    }
  }
}