package after2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<Fruit> fruitList = new ArrayList<>();
    fruitList.add(new Apple());
    fruitList.add(new BlueBerry());
    fruitList.add(new Banana());

    FruitVisitor visitor = new DefaultFruitVisitor();
    Iterator<Fruit> iterator = fruitList.iterator();
    while (iterator.hasNext()) {
      iterator.next().accept(visitor);
    }
  }
}
