/**
 * @author Baptiste Audugé
 */

public class TestVillageois {

  public static void main(String[] args) {

    double totalPoidsSouleve = 0;

    Villageois villageois1 = new Villageois("Baptiste");
    Villageois villageois2 = new Villageois("Jean");
    Villageois villageois3 = new Villageois("Michel");
    Villageois villageois4 = new Villageois("Paul");
    
    totalPoidsSouleve += villageois1.poidsSouleve();
    totalPoidsSouleve += villageois2.poidsSouleve();
    totalPoidsSouleve += villageois3.poidsSouleve();
    totalPoidsSouleve += villageois4.poidsSouleve();

    System.out.println(villageois1.toString());
    System.out.println(
      "Villageois 1, nom: " + villageois1.getNom() +
      ", poids: " + villageois1.getPoids() +
      ", malade: " + (villageois1.getMalade() ? "oui" : "non")
    );
    System.out.println(villageois2.toString());
    System.out.println(villageois3.toString());
    System.out.println(villageois4.toString());

    if (totalPoidsSouleve > 100) {
      System.out.println("Les villageois peuvent soulever le rocher");
    } else {
      System.out.println("Les villageois ne peuvent PAS soulever le rocher");
    }
  }
}
