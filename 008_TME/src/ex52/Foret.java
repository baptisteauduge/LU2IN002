package ex52;

import java.lang.Math;
import java.util.ArrayList;

public class Foret {

  private Object[][] terrain;
  private final int tailleTerrain;

  public Foret(int taille) {
    terrain = new Object[taille][taille];
    tailleTerrain = taille;
  }

  public boolean placer(Object obj) {
    int randX = (int) (Math.random() * tailleTerrain);
    int randY = (int) (Math.random() * tailleTerrain);

    if (terrain[randX][randY] != null)
      return false;
    terrain[randX][randY] = obj;
    return true;
  }

  @Override
  public String toString() {
    String res = "";

    for (int i = 0; i < tailleTerrain; ++i) {
      res += "|";
      for (int j = 0; j < tailleTerrain; ++j) {
        if (terrain[i][j] != null) {
          res += terrain[i][j].toString().charAt(0);
        } else {
          res += " ";
        }
      }
      res += "|\n";
    }
    return res;
  }

  public ArrayList<Champignon> ramasserChampignons() {
    ArrayList<Champignon> res = new ArrayList<Champignon>();

    for (int i = 0; i < tailleTerrain; ++i) {
      for (int j = 0; j < tailleTerrain; j++) {
        if (terrain[i][j] != null && terrain[i][j] instanceof Champignon) {
          res.add((Champignon) terrain[i][j]);
          terrain[i][j] = null;
        }
      }
    }
    return res;
  }

  public ArrayList<Ramassable> ramasserTout() {
    ArrayList<Ramassable> res = new ArrayList<Ramassable>();

    for (int i = 0; i < tailleTerrain; ++i) {
      for (int j = 0; j < tailleTerrain; j++) {
        if (terrain[i][j] != null && terrain[i][j] instanceof Ramassable) {
          res.add((Ramassable) terrain[i][j]);
          terrain[i][j] = null;
        }
      }
    }
    return res;
  }

  public void ramasser(Panier p) {
    for (int i = 0; i < tailleTerrain; ++i) {
      for (int j = 0; j < tailleTerrain; ++j) {
        if (terrain[i][j] != null && terrain[i][j] instanceof Ramassable) {
          if (p.add((Ramassable) terrain[i][j])) {
            terrain[i][j] = null;
          }
        }
      }
    }
  }
}
