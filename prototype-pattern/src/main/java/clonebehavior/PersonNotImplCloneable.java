package clonebehavior;

public class PersonNotImplCloneable {
  private String name;

  public PersonNotImplCloneable(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public static void main(String[] args) throws CloneNotSupportedException {
    PersonNotImplCloneable mike = new PersonNotImplCloneable("mike");
    PersonNotImplCloneable mikeCopy = (PersonNotImplCloneable) mike.clone();
    System.out.println("Is the same? " + (mike == mikeCopy));
  }
}
