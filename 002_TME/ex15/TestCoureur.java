/**
 * @author Baptiste Audugé
 */

public class TestCoureur {

  public static void main(String[] args) {
    Coureur c1 = new Coureur(10);
    Coureur c2 = new Coureur();
    Coureur c3 = new Coureur(653);
    Coureur c4 = new Coureur();
    double tempsTotal400 = 0;

    System.out.println(
      "Numéro de dossard " + c1.getNumDossard() + ", temps au 100m : "
      + c1.getTempsAu100() + ", possede témoin : " + (c1.getPossedeTemoin() ? "oui" : "non")
    );

    c1.setPossedeTemoin(true);
    c1.courir();
    tempsTotal400 += c1.getTempsAu100();
    c1.passeTemoin(c2);
    c2.courir();
    tempsTotal400 += c2.getTempsAu100();
    c2.passeTemoin(c3);
    c3.courir();
    tempsTotal400 += c3.getTempsAu100();
    c3.passeTemoin(c4);
    c4.courir();
    tempsTotal400 += c4.getTempsAu100();
    System.out.println(c4.toString());
    System.out.println("\n Temps total au 400m : " + String.format("%.2f", tempsTotal400));
    

  }

}