/**
 * @author Baptiste Audugé
 */

import java.lang.Math;

public class Point {
  private int posx;
  private int posy;

  /**
   * Constructor
   * @param posx the x coordinate
   * @param posy the y coordinate
   */
  public Point(int posx, int posy) {
    this.posx = posx;
    this.posy = posy;
  }

  /**
   * Constructor
   */
  public Point() {
    posx = (int) (Math.random() * 200 - 100);
    posy = (int) (Math.random() * 200 - 100);
  }

  /**
   * @return a string representation of the point
   */
  public String toString() {
    return "(" + posx + "," + posy + ")";
  }

  /**
   * Permet de modifier les coordonnées du point
   * @param newX
   * @param newY
   */
  public void deplaceToi(int newX, int newY) {
    posx = newX;
    posy = newY;
  }

  /**
   * Returns the distance between the point P and this point
   * @param p the second point to calculate the distance
   */
  public double distance(Point p) {
    return Math.sqrt(Math.pow(posx - p.posx, 2) + Math.pow(posy - p.posy, 2));
  }

  /**
   * @param p the point to compare
   * @return if p1 is equal to p2
   */
  public boolean equals(Point p) {
    return posx == p.posx && posy == p.posy;
  }

  /**
   * @return the x coordinate
   */
  public int getPosx() {
    return posx;
  }

  /**
   * @return the y coordinate
   */
  public int getPosy() {
    return posy;
  }

  /**
   * @param posx the x coordinate to set
   */
  public void setPosx(int posx) {
    this.posx = posx;
  }

  /**
   * @param posy the y coordinate to set
   */
  public void setPosy(int posy) {
    this.posy = posy;
  }
}
