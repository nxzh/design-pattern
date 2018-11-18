package after.impl;

import after.AbstractMultipleTimesPrinter;
import after.AbstractPrinterImpl;

public class TwicePrinter extends AbstractMultipleTimesPrinter {

  public TwicePrinter(AbstractPrinterImpl impl) {
    super(impl);
  }

  public int getTimes() {
    return 2;
  }
}
