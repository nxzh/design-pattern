package domain;

import domain.framework.Product;
import domain.framework.ProductManager;

public class Main {
  public static void main(String[] args) {
    ProductManager manager = new ProductManager();
    manager.register("food", new Food());
    manager.register("ruler", new Ruler());

    Product f1 = manager.create("food");
    Product f2 = manager.create("food");
    System.out.println("is f1 == f2?" + (f1 == f2));

    Product r1 = manager.create("ruler");
    Product r2 = manager.create("ruler");
    System.out.println("is r1 == r2?" + (r1 == r2));
  }
}
