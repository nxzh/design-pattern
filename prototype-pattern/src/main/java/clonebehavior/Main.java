package clonebehavior;

import java.util.Date;

public class Main {

  public static void testPersonImplShallowCopy() throws CloneNotSupportedException {
    PersonImplShallowCopy mike = new PersonImplShallowCopy("mike", new Date());
    PersonImplShallowCopy mikeCopy = mike.clone();
    System.out.println("Is the same? " + (mike == mikeCopy));

    System.out.println("Is the same name? " + (mike.getName() == mikeCopy.getName()));

    System.out.println("Is the same name? " + (mike.getBirthday() == mikeCopy.getBirthday()));
  }

  public static void testPersonImplDeepCopy() throws CloneNotSupportedException {
    PersonImplDeepCopy mike = new PersonImplDeepCopy("mike", new Date());
    PersonImplDeepCopy mikeCopy = mike.clone();
    System.out.println("Is the same? " + (mike == mikeCopy));

    System.out.println("Is the same name? " + (mike.getName() == mikeCopy.getName()));

    System.out.println("Is the same name? " + (mike.getBirthday() == mikeCopy.getBirthday()));
  }

  public static void main(String[] args) throws CloneNotSupportedException {
    testPersonImplShallowCopy();
    testPersonImplDeepCopy();
  }
}
