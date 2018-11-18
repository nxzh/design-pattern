package before.impl;

import before.AbstractMultipleTimesPrinter;

public class ProblemTwiceDollarPrinter extends AbstractMultipleTimesPrinter {

  // 怎么写呢? 用代理? 还是将同样的逻辑写一遍
  // private Printer printer;

  protected void open() {
    System.out.println("$ $ $ Open $ $ $");
  }

  protected void close() {
    System.out.println("$ $ $ Close $ $ $");
  }

  protected void print() {
    System.out.println("$ $ $ Print $ $ $");
  }

  public int getTimes() {
    return 2;
  }
}
