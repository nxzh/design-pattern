package before2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<Fruit> fruitList = new ArrayList<>();
    fruitList.add(new Apple());
    fruitList.add(new BlueBerry());
    fruitList.add(new Banana());

    Iterator<Fruit> iterator = fruitList.iterator();
    while (iterator.hasNext()) {
      Fruit fruit = iterator.next();
      if (fruit instanceof Apple) {
        System.out.println("This is an apple!");
      } else if (fruit instanceof Banana) {
        System.out.println("Haha, this is not a apple. it's a banana!");
      } else {
        System.out.println("That is must be a blue berries.");
      }
      fruit.taste();
    }
  }
}
