package domain;

import domain.kfc.KFC;
import domain.mcdonalds.McDonalds;

public class Main {

  public static void testFactory(HamburgerShop hamburgerShop) {
    Cola cola = hamburgerShop.getCola();
    Hamburger hamburger = hamburgerShop.getHamburger();
    cola.drink();
    hamburger.eat();
  }

  public static void main(String[] args) {
    testFactory(new KFC());
    testFactory(new McDonalds());
  }
}
