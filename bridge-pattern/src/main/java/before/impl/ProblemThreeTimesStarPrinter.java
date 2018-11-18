package before.impl;

import before.AbstractMultipleTimesPrinter;

public class ProblemThreeTimesStarPrinter extends AbstractMultipleTimesPrinter {

  public int getTimes() {
    return 3;
  }

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
