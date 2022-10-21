/**
 * @author Baptiste Audugé
 */

public class TestComplexe {

  public static void main(String[] args) {
    Complexe c1 = new Complexe();
    Complexe c2 = new Complexe(2, 0);
    Complexe c3 = new Complexe(-1, 9);

    System.out.println("C1 = " + c1.toString());
    System.out.println("C2 = " + c2.toString());
    System.out.println("C3 = " + c3.toString());

    System.out.println("");

    System.out.println("C1 est réel ? " + (c1.estReel() ? "Oui" : "Non"));
    System.out.println("C2 est réel ? " + (c2.estReel() ? "Oui" : "Non"));
    System.out.println("C3 est réel ? " + (c3.estReel() ? "Oui" : "Non"));

    System.out.println("");


    System.out.println("C1 + C2 = " + c1.addition(c2).toString());
    System.out.println("C1 + C3 = " + c1.addition(c3).toString());
    System.out.println("C2 + C3 = " + c2.addition(c2).toString());

    System.out.println("");

    System.out.println("C1 * C2 = " + c1.multiplication(c2).toString());
    System.out.println("C1 * C3 = " + c1.multiplication(c3).toString());
    System.out.println("C2 * C3 = " + c2.multiplication(c3).toString());
    
  }
}
