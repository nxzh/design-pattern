package eager;

public class Singleton {
  private static final Singleton INSTANCE = new Singleton();

  private int value;

  private Singleton() {}

  public static Singleton getInstance() {
    return INSTANCE;
  }

  public int getValue() {
    return value;
  }

  public void setValue(int value) {
    this.value = value;
  }
}
