package domain;

public abstract class AbstractProcessor {
  abstract void before();

  abstract void processInternal();

  abstract void post();

  void process() {
    before();
    processInternal();
    post();
  }
}
