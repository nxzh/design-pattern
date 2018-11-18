package before.impl;

import before.AbstractPrinter;

public class AStarPrinter extends AbstractPrinter {

  protected void close() {
    System.out.println("* * * Close * * *");
  }

  protected void open() {
    System.out.println("* * * Open * * *");
  }

  protected void print() {
    System.out.println("* * * Print * * *");
  }
}
