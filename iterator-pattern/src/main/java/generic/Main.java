package generic;

public class Main {

  public static void main(String[] args) {
    Container<Item> items = new Container<Item>(5);
    items.append(new Item("soap"));
    items.append(new Item("shampoo"));
    items.append(new Item("water"));

    Iterator<Item> it = items.iterator();
    while (it.hasNext()) {
      System.out.println(it.next().getName());
    }
  }
}
