package domain;

public class TestDecorator implements Test {
  protected Test fTest;

  public TestDecorator(Test test) {
    fTest = test;
  }

  public int countTestCases() {
    return fTest.countTestCases();
  }

  public void run(TestResult result) {
    fTest.run(result);
  }
}
