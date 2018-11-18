package after;

import after.impl.DollarPrinterImpl;
import after.impl.StarPrinterImpl;
import after.impl.ThreeTimesPrinter;
import after.impl.TwicePrinter;

public class Main {
  private static long parseResult() {
    return System.currentTimeMillis() % 3;
  }

  public static void main(String[] args) {
    long parseRs = parseResult();
    Printer printer;
    if (parseRs == 0) {
      System.out.println("Using ADollarPrinter ... ");
      printer = new Printer(new DollarPrinterImpl());
    } else if (parseRs == 1) {
      System.out.println("Using ThreeTimesPrinter feature with StarPrinterImpl... ");
      printer = new ThreeTimesPrinter(new StarPrinterImpl()) {};
    } else {
      System.out.println("Using TwicePrinter feature with DollarPrinterImpl ... ");
      printer = new TwicePrinter(new DollarPrinterImpl());
    }

    printer.display();
  }
}
