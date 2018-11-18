package after.impl;

import after.AbstractMultipleTimesPrinter;
import after.AbstractPrinterImpl;

public class ThreeTimesPrinter extends AbstractMultipleTimesPrinter {

  public ThreeTimesPrinter(AbstractPrinterImpl impl) {
    super(impl);
  }

  public int getTimes() {
    return 3;
  }
}
