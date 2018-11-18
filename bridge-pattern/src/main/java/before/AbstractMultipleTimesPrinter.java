package before;

public abstract class AbstractMultipleTimesPrinter extends AbstractPrinter {

  public void display() {
    open();
    for (int i = 0; i < getTimes(); ++i) {
      print();
    }
    close();
  }

  // 增加了新功能, 却没有影响到其他的功能抽象
  public abstract int getTimes();
}
