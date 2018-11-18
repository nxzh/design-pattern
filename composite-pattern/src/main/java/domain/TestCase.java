package domain;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class TestCase implements Test {

  private String fName;

  public TestCase(String fName) {
    this.fName = fName;
  }

  public String getfName() {
    return fName;
  }

  public void setUp() {}

  public void tearDown() {}

  public int countTestCases() {
    return 1;
  }

  public void run(TestResult result) {

    System.out.println("-------------------------------");
    System.out.println(String.format("Running: %s::%s", getClass().getCanonicalName(), fName));
    result.run(this);
  }

  protected void runTest() throws Throwable {
    Method runMethod = null;
    try {
      // use getMethod to get all public inherited
      // methods. getDeclaredMethods returns all
      // methods of this class but excludes the
      // inherited ones.
      runMethod = getClass().getMethod(fName, (Class[]) null);
    } catch (NoSuchMethodException e) {
      throw new NoSuchMethodException("Method \"" + fName + "\" not found");
    }
    if (!Modifier.isPublic(runMethod.getModifiers())) {
      throw new IllegalAccessException("Method \"" + fName + "\" should be public");
    }

    try {
      runMethod.invoke(this);
    } catch (InvocationTargetException e) {
      e.fillInStackTrace();
      throw e.getTargetException();
    } catch (IllegalAccessException e) {
      e.fillInStackTrace();
      throw e;
    }
  }

  public void runBare() throws Throwable {
    Throwable exception = null;
    setUp();
    try {
      runTest();
    } catch (Throwable running) {
      exception = running;
    } finally {
      try {
        tearDown();
      } catch (Throwable tearingDown) {
        if (exception == null) exception = tearingDown;
      }
    }
    if (exception != null) throw exception;
  }
}
