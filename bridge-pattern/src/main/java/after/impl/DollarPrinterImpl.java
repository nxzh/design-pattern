package after.impl;

import after.AbstractPrinterImpl;

public class DollarPrinterImpl extends AbstractPrinterImpl {

  public void rawClose() {
    System.out.println("$ $ $ Close $ $ $");
  }

  public void rawOpen() {
    System.out.println("$ $ $ Open $ $ $");
  }

  public void rawPrint() {
    System.out.println("$ $ $ Print $ $ $");
  }
}
