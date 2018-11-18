package before;

public abstract class AbstractPrinter {
  protected abstract void open();

  protected abstract void close();

  protected abstract void print();

  public void display() {
    open();
    print();
    close();
  }
}
