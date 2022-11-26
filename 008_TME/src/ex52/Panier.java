package ex52;

import java.util.ArrayList;

public class Panier extends ArrayList<Ramassable> {

  private int poidsMax;

  public Panier(int poidsMax) {
    this.poidsMax = poidsMax;
  }

  public double getPoids() {
    double poids = 0;

    for (int i = 0; i < this.size(); ++i) {
      poids += this.get(i).getPoids();
    }
    return poids;
  }
  
  @Override
  public boolean add(Ramassable elem) {

    if (elem.getPoids() + this.getPoids() <= poidsMax) {
      super.add(elem);
      System.out.println(elem + " est ajouté au panier");
      return true;
    }
    System.out.println(elem + " n'est pas ajouté au panier");
    return false;
  }

  public int compterToxiques() {
    int nbrToxiques = 0;

    for (int i = 0; i < this.size(); ++i) {
      if (this.get(i) instanceof Toxique) {
        ++nbrToxiques;
      }
    }
    return nbrToxiques;
  }

  @Override
  public String toString() {
    return "Panier contenant " + this.size() + " objets, dont " +
    this.compterToxiques() + " toxiques (" + this.getPoids() + 
    "kg sur " + this.poidsMax + "kg)";
  }
}