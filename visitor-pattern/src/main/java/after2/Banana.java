package after2;

public class Banana implements Fruit {

  @Override
  public void taste() {
    System.out.println("Banana tastes very delicious!");
  }

  @Override
  public void accept(FruitVisitor fruitVisitor) {
    fruitVisitor.visit(this);
  }
}
