/**
 * @author Baptiste Audugé
 */

import java.lang.Math;

public class Complexe {

  private double reelle;
  private double imag;

  public Complexe(double reelle, double imag) {
    this.reelle = reelle;
    this.imag = imag;
  }

  public Complexe() {
    this(Math.random() * 4 - 2, Math.random() * 4 - 2);
  }

  public String toString() {
    return "(" + String.format("%.3f", reelle) + " + " 
    + String.format("%.3f", imag) + "i)";
  }

  public boolean estReel() {
    return imag == 0;
  }

  public Complexe addition(Complexe c) {
    return new Complexe(c.reelle + this.reelle, c.imag + this.imag);
  }

  public Complexe multiplication (Complexe c) {
    return new Complexe(
      c.reelle * this.reelle - c.imag * this.imag,
      this.reelle * c.imag + this.imag * c.reelle
    );
  }
} 
