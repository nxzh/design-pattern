package domain.framework;

import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

public class ProductManager {
  private ConcurrentHashMap<String, Product> map = new ConcurrentHashMap<>();

  public void register(String name, Product prototype) {
    map.put(name, prototype);
  }

  public Product create(String name) {
    return Optional.of(map.get(name)).map(Product::copy
    ).orElseThrow(() -> new IllegalStateException("Can't find product register domain name" + name));
  }
}
