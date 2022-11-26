/**
 * @author Baptiste Audugé, (Groupe Double Majeur Mathématiques et Informatique)
 */
package ex53;
import java.util.ArrayList;
public class Trousse {

  private ArrayList<Stylo> stylos;

  public Trousse() {
    stylos = new ArrayList<Stylo>();
  }

  public boolean addStylo(Stylo s) {
    return stylos.add(s);
  }

  public int getNbrStylos() {
    return stylos.size();
  }

  @Override
  public String toString() {
    String res = "Trousse contenant : ";

    for (Stylo stylo : stylos) {
     res += stylo + " "; 
    }
    return res;
  }

  public int compter(String couleur) {
    int res = 0;

    for (int i = 0; i < stylos.size(); ++i) {
      if (stylos.get(i).getCouleur() == couleur)
        ++res;
    }
    return res;
  }

  public boolean removeFirstStylo() {
    if (stylos.size() == 0)
      return false;
    return stylos.remove(stylos.get(0));
  }
}
