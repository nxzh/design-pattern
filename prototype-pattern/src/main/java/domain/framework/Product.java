package domain.framework;

public interface Product extends Cloneable {
  void use();

  Product copy();
}
