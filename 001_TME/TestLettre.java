/**
 * @author Baptiste Audugé
 */

class TestLettre {

  public static void main(String[] args) {

    Lettre myLettre = null;

    for (char i = 'a'; i <= 'z'; i++) {
      myLettre = new Lettre(i);
      System.out.print(myLettre.getCarac() + "  ");

      if ((i - 'a' + 1) % 5 == 0){
        System.out.print("\n");
      }
    }
  }
}
