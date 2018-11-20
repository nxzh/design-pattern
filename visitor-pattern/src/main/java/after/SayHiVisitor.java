package after;

public class SayHiVisitor implements CompanyVisitor {

  @Override
  public void visit(Person person) {
    System.out.println(person.getName() + " say Hi!");
  }

  @Override
  public void visit(Department department) {
    System.out.println("===" + department.getDepName() + " department begin to say Hi!");
    for (Person person : department.getEmployees()) {
      visit(person);
    }
  }

  @Override
  public void visit(Company company) {
    System.out.println(company.getPresident().getName() + " begin to say Hi!");
    for (Department department : company.getDepartmentList()) {
      visit(department);
    }
  }
}
