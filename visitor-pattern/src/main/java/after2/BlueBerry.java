package after2;

public class BlueBerry implements Fruit {

  @Override
  public void taste() {
    System.out.println("Blue Berry taste better!");
  }

  @Override
  public void accept(FruitVisitor fruitVisitor) {
    fruitVisitor.visit(this);
  }
}
