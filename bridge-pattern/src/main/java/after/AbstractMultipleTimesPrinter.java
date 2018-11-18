package after;

public abstract class AbstractMultipleTimesPrinter extends Printer {

  public AbstractMultipleTimesPrinter(AbstractPrinterImpl impl) {
    super(impl);
  }

  public abstract int getTimes();

  public void display() {
    open();
    for (int i = 0; i < getTimes(); ++i) {
      print();
    }
    close();
  }
}
