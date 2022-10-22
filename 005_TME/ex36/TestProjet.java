/**
 * @author Baptiste Audugé
 */

public class TestProjet {

  public static void main(String[] args) {
    System.out.println("Nombre de personnes : " + Personne.getNbrPersonnes());
    Personne pers1 = new Personne();
    Personne pers2 = new Personne();
    
    System.out.println(pers1);
    System.out.println(pers2);
    System.out.println("Nombre de personnes : " + Personne.getNbrPersonnes());
    
    Projet project1 = new Projet("P3X-774");
    Projet project2 = new Projet("P3R-233");

    System.out.println(project1);
    System.out.println(project2);
    System.out.println("Nombre de personnes : " + Personne.getNbrPersonnes());
    System.out.println("Nombre de trio : " + Trio.getNbrTrio());
    System.out.println("Nombre de projets : " + Projet.getNbrProjets());

  }
}
