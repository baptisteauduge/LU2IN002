package ex52.tests;

import ex52.*;
import java.lang.Math;
import java.util.ArrayList;

public class TestForet {

  private static final double PROBA_CEPES = 0.7;

  public static void main(String[] args) {
    Foret foret1 = new Foret(10);
    Foret foret2 = new Foret(10);
    Foret foret3 = new Foret(10);
    ArrayList<Ramassable> ramasses;
    Panier panier = new Panier(8);

    for (int i = 0; i < 10; i++) {
      if (Math.random() < PROBA_CEPES) {
        foret1.placer(new Champignon("Cèpes"));
        foret2.placer(new Champignon("Cèpes"));
        foret3.placer(new Champignon("Cèpes"));
      } else {
        foret1.placer(new Arbre("Pins"));
        foret2.placer(new Arbre("Pins"));
        foret3.placer(new Arbre("Pins"));
      }
    }

    for (int i = 0; i < 3; ++i) {
      foret1.placer(new ChampignonToxique("Amanites"));
      foret2.placer(new ChampignonToxique("Amanites"));
      foret3.placer(new ChampignonToxique("Amanites"));
    }

    System.out.println("------Forêt 1-------");
    System.out.println(foret1);

    System.out.println("\nRamassage champigons sur la forêt 1\n");
    foret1.ramasserChampignons();

    System.out.println("------Forêt 1-------");
    System.out.println(foret1);

    System.out.println("------Forêt 2-------");
    System.out.println(foret2);

    System.out.println("\nRamassage de tous les ramassables sur la forêt 2\n");
    ramasses = foret2.ramasserTout();

    System.out.println("------Forêt 2-------");
    System.out.println(foret2);

    System.out.println("\nObjets ramassés sur la forêt 2: \n");
    System.out.println(ramasses);

    System.out.println("------Forêt 3-------");
    System.out.println(foret3);

    System.out.println("\nRamassage dans panier sur la forêt 3\n");
    foret3.ramasser(panier);

    System.out.println("------Forêt 3-------");
    System.out.println(foret3);

    System.out.println("\nContenu du panier après ramassage sur la forêt 3 :\n");
    System.out.println(panier);
  }
}