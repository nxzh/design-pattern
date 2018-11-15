package simple;

public class Container implements Aggregate {

  private Item[] items;
  private int length = 0;

  public Container(int capacity) {
    items = new Item[capacity];
  }

  public void append(Item item) {
    this.items[length] = item;
    length += 1;
  }

  public int length() {
    return length;
  }

  public Iterator iterator() {
    return new ContainerIterator();
  }

  private class ContainerIterator implements Iterator {

    private int i = 0;

    public Object next() {
      return items[i++];
    }

    public boolean hasNext() {
      return i < length;
    }
  }
}
