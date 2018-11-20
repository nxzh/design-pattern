package after2;

public class Apple implements Fruit {

  @Override
  public void taste() {
    System.out.println("Apple taste good!");
  }

  @Override
  public void accept(FruitVisitor fruitVisitor) {
    fruitVisitor.visit(this);
  }
}
