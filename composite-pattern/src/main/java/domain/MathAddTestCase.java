package domain;

public class MathAddTestCase extends TestCase {

  private int a = 1;
  private int b = 1;

  public MathAddTestCase(String fName) {
    super(fName);
  }

  @Override
  public void setUp() {
    a = 1;
    b = 1;

    System.out.println(String.format("set up %s", getfName()));
  }

  public void testAdd() {
    int result = a + b;
    throw new RuntimeException("Some error happened!");
  }

  public void testAdd2() {
    int result = a + b;
  }
}
