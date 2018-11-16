package domain;

import domain.framework.Product;

public class Ruler implements Product {

  private int length = 20;

  public int getLength() {
    return length;
  }

  public void setLength(int length) {
    this.length = length;
  }

  public void use() {
    System.out.println("I'm using a ruler.");
  }

  public Ruler copy() {
    Ruler copy = null;
    try {
      copy = (Ruler) this.clone();
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }
    return copy;
  }
}
