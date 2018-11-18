package after;

public class Printer {

  private AbstractPrinterImpl impl;

  protected Printer(AbstractPrinterImpl impl) {
    this.impl = impl;
  }

  protected void open() {
    impl.rawOpen();
  }

  protected void close() {
    impl.rawClose();
  }

  protected void print() {
    impl.rawPrint();
  }

  public void display() {
    open();
    print();
    close();
  }
}
