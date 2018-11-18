package domain;

import java.util.LinkedHashMap;

public class TestResult {
  private LinkedHashMap<String, Boolean> results = new LinkedHashMap<String, Boolean>();

  protected void run(final TestCase test) {
    try {
      test.runBare();
    } catch (Throwable e) {
      results.put(test.getfName(), Boolean.FALSE);
    }
  }

  public LinkedHashMap<String, Boolean> getResults() {
    return results;
  }
}
