package domain;

public class MathDivideTestCase extends TestCase {

  private int a;
  private int b;

  public MathDivideTestCase(String fName) {
    super(fName);
  }

  @Override
  public void setUp() {
    a = b = 0;
    System.out.println(String.format("set up %s", getfName()));
  }

  @Override
  public void tearDown() {
    System.out.println(String.format("tear down %s", getfName()));
  }

  public void tesDivide() {
    int result = a / b;
  }
}
