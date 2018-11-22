package after;

public class WorkVisitor implements CompanyVisitor {

  @Override
  public void visit(Person person) {

    System.out.println(person.getName() + " is busily working!");
  }

  @Override
  public void visit(Department department) {
    System.out.println(department.getDepName() + " work!!!");
    for (Person person : department.getEmployees()) {
      visit(person);
    }
  }

  @Override
  public void visit(Company company) {
    System.out.println(company.getPresident().getName() + " doesn't work. He is the president.");
    for (Department dept : company.getDepartmentList()) {
      visit(dept);
    }
  }
}
