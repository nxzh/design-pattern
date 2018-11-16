package domain.mcdonalds;

import domain.Cola;
import domain.HamburgerShop;
import domain.Hamburger;

public class McDonalds implements HamburgerShop {

  public Hamburger getHamburger() {
    return new McDonaldsHamburger();
  }

  public Cola getCola() {
    return new CocaCola();
  }
}
