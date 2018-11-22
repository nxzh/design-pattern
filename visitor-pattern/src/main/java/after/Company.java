package after;

import java.util.ArrayList;
import java.util.List;

public class Company implements CompanyUnit {

  private Person president;
  private List<Department> departmentList = new ArrayList<>();

  public Company(Person president) {
    this.president = president;
  }

  public Person getPresident() {
    return president;
  }

  public void setPresident(Person president) {
    this.president = president;
  }

  public List<Department> getDepartmentList() {
    return departmentList;
  }

  private void setDepartmentList(List<Department> departmentList) {
    this.departmentList = departmentList;
  }

  public void addDepartment(Department department) {
    this.departmentList.add(department);
  }

  @Override
  public void accept(CompanyVisitor visitor) {
    visitor.visit(this);
  }
}
