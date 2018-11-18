package domain;

public class RepeatedTest extends TestDecorator {

  private int fTimesRepeat;

  public RepeatedTest(Test test, int repeat) {
    super(test);
    if (repeat < 0) {
      throw new IllegalArgumentException("Repetition count must be >= 0");
    }
    fTimesRepeat = repeat;
  }

  @Override
  public int countTestCases() {
    return super.countTestCases() * fTimesRepeat;
  }

  @Override
  public void run(TestResult result) {
    for (int i = 0; i < fTimesRepeat; i++) {
      super.run(result);
    }
  }
}
