package domain.kfc;

import domain.Cola;
import domain.HamburgerShop;
import domain.Hamburger;

public class KFC implements HamburgerShop {

  public Hamburger getHamburger() {
    return new KFCHamburger();
  }

  public Cola getCola() {
    return new PepsiCola();
  }
}
