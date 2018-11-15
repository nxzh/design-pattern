package domain;

public class Main {

  public static void main(String[] args) {
    AbstractProcessor foodProcessor = new FoodProcessor();
    foodProcessor.process();
    AbstractProcessor drinkProcessor = new DrinkProcessor();
    drinkProcessor.process();
  }
}
