package after;

public class Main {
  public static void main(String[] args) {
    Department develop = new Department("Develop");
    Department sales = new Department("Sales");

    Company company = new Company(new Person("Mr. Jobs"));
    company.addDepartment(develop);
    develop.addEmployee(new Person("Mr. DevA"));
    develop.addEmployee(new Person("Mrs. DevB"));
    company.addDepartment(sales);
    sales.addEmployee(new Person("Mr. SalesA"));
    sales.addEmployee(new Person("Mrs. SalesB"));

    company.accept(new SayHiVisitor());
    System.out.println("=======================================");
    company.accept(new WorkVisitor());
  }
}
