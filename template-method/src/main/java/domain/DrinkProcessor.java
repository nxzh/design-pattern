package domain;

public class DrinkProcessor extends AbstractProcessor {

  void before() {
    System.out.println("Before: Mix up the fruit and wine");
  }

  void processInternal() {
    System.out.println("Processing: Blending...");
  }

  void post() {
    System.out.println("Post: Pour them out");
  }
}
