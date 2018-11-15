package simple;

import simple.Item;
import simple.Container;
import simple.Iterator;

public class Main {

  public static void main(String[] args) {
    Container shelf = new Container(5);
    shelf.append(new Item("童年"));
    shelf.append(new Item("在人间"));
    shelf.append(new Item("我的大学"));
    shelf.append(new Item("雷雨"));

    Iterator it = shelf.iterator();
    while (it.hasNext()) {
      Item item = (Item) it.next();
      System.out.println(item.getName());
    }

  }
}
