public class TestMenagerie {

  public static void main(String[] args) {
    Menagerie m = new Menagerie();
    m.Ajouter(new Boa("Boa1"));
    m.Ajouter(new Vache("Vache1"));
    m.Ajouter(new Boa("Boa2", 10));
    m.Ajouter(new Vache("Vache2", 10));

    System.out.println(m);
    m.midi();
    m.vieillirTous();
    System.out.println(m);
  }

}