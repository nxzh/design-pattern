package before;

import before.impl.ADollarPrinter;
import before.impl.ProblemThreeTimesStarPrinter;
import before.impl.ProblemTwiceDollarPrinter;

public class Main {

  private static long parseResult() {
    return System.currentTimeMillis() % 3;
  }

  public static void main(String[] args) {
    long parseRs = parseResult();
    AbstractPrinter printer;
    if (parseRs == 0) {
      System.out.println("Using ADollarPrinter ... ");
      printer = new ADollarPrinter();
    } else if (parseRs == 1) {
      System.out.println("Using ProblemThreeTimesStarPrinter ... ");
      printer = new ProblemThreeTimesStarPrinter();
    } else {
      System.out.println("Using ProblemTwiceDollarPrinter ... ");
      printer = new ProblemTwiceDollarPrinter();
    }

    printer.display();
  }
}
