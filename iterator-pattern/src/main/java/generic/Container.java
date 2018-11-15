package generic;

public class Container<T> implements Aggregate<T> {

  private T[] items;
  private int length;

  public Container(int capacity) {
    items = (T[])new Object[capacity];
  }

  public void append(T t) {
    items[length++] = t;
  }

  public int length() {
    return length;
  }

  public Iterator<T> iterator() {
    return new ContainerIterator();
  }

  private class ContainerIterator implements Iterator<T> {

    int cursor = 0;

    public boolean hasNext() {
      return cursor < length;
    }

    public T next() {
      return items[cursor++];
    }
  }
}
