package domain;

import java.util.ArrayList;

public class TestResult {
  private ArrayList<String> results = new ArrayList<String>();

  protected void run(final TestCase test) {
    try {
      test.runBare();
    } catch (Throwable e) {
      results.add(test.getfName());
    }
  }

  public ArrayList<String> getResults() {
    return results;
  }
}
