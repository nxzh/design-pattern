package after2;

public class DefaultFruitVisitor implements FruitVisitor {

  @Override
  public void visit(Apple apple) {
    System.out.println("This is an apple!");
    apple.taste();
  }

  @Override
  public void visit(Banana banana) {
    System.out.println("Haha, this is not a apple. it's a banana!");
    banana.taste();
  }

  @Override
  public void visit(BlueBerry blueBerry) {
    System.out.println("That is must be a blue berries.");
    blueBerry.taste();
  }
}
