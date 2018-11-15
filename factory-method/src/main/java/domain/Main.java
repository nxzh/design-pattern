package domain;

public class Main {

  public static void main(String[] args) {
    Factory factory = new IDCardFactory();
    Product card1 = factory.create("Mike");
    Product card2 = factory.create("Sid");
    Product card3 = factory.create("Bob");

    card1.use();
    card2.use();
    card3.use();
  }
}
