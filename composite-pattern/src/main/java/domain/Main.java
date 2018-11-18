package domain;

public class Main {
  public static Test composeTest() {
    TestSuite mathAddSuite = new TestSuite();
    mathAddSuite.addTest(new MathAddTestCase("testAdd"));
    mathAddSuite.addTest(new MathAddTestCase("testAdd2"));

    TestSuite allSuite = new TestSuite();
    allSuite.addTest(new MathDivideTestCase("tesDivide"));
    allSuite.addTest(mathAddSuite);
    return allSuite;
  }

  public static void main(String[] args) {
    Test tests = composeTest();
    TestResult result = new TestResult();
    tests.run(result);
    int total = tests.countTestCases();
    int failed = result.getResults().size();
    int passed = total - failed;

    System.out.println("=============================================");
    System.out.println(String.format("Result: Total %d, Failed: %d, Passed: %d", total, failed, passed));
  }
}
