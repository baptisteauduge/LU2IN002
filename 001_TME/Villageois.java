/**
 * @author Baptiste Audugé
 */
import java.lang.Math;

 public class Villageois {

  private String nom;
  private double poids;
  private boolean malade;

  private static final int MIN_POIDS = 50;
  private static final int MAX_POIDS = 150;
  private static final double PERCENT_SICK = 0.8;

  public Villageois(String nomVillageois) {
    nom = nomVillageois;
    poids = Math.random() * (MAX_POIDS - MIN_POIDS) + MIN_POIDS;
    malade = Math.random() > PERCENT_SICK;
  }

  public String toString() {
    return "Villageois: " + nom + ", poids: " + 
    String.format("%.0f", poids) + ", malade: " + (malade ? "oui" : "non") +
    ", peut soulever " + String.format("%.2f", poidsSouleve());
  }

  public String getNom() {
    return nom;
  }

  public double getPoids() {
    return poids;
  }

  public boolean getMalade() {
    return malade;
  }

  public double poidsSouleve() {
    if (malade)
      return poids / 4;
    return poids / 3;
  }
 }
 