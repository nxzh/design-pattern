package domain;

public class FoodProcessor extends AbstractProcessor {

  void before() {
    System.out.println("Before: Blend and mixing the food");
  }

  void processInternal() {
    System.out.println("Processing: Fried the food");
  }

  void post() {
    System.out.println("Post: Put the food in plates");
  }
}
