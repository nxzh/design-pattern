package clonebehavior;

public class PersonImplCloneable implements Cloneable {
  private String name;

  public PersonImplCloneable(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public static void main(String[] args) throws CloneNotSupportedException {

    PersonImplCloneable mike = new PersonImplCloneable("mike");
    PersonImplCloneable mikeCopy = (PersonImplCloneable) mike.clone();
    System.out.println("Is the same? " + (mike == mikeCopy));
    System.out.println("Is the same? " + (mike.getName() == mikeCopy.getName()));
  }
}
