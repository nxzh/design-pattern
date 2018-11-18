package domain;

import java.util.Vector;

public class TestSuite implements Test {

  private Vector<Test> fTests = new Vector<Test>(10);

  public int countTestCases() {
    int count = 0;
    for (Test each : fTests) {
      count += each.countTestCases();
    }
    return count;
  }

  public void run(TestResult result) {
    for (Test each : fTests) {
      each.run(result);
    }
  }

  public void addTest(Test test) {
    this.fTests.add(test);
  }
}
