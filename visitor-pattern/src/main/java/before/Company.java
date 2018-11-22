package before;

import java.util.ArrayList;
import java.util.List;

public class Company {

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

  public void everyOneSayHi() {
    System.out.println(president.getName() + " begin to say Hi!");
    for (Department dept : departmentList) {
      System.out.println("===" + dept.getDepName() + " department begin to say Hi!");
      for (Person person : dept.getEmployees()) {
        System.out.println(person.getName() + " say Hi!");
      }
    }
  }

  public void everyOneWorkExceptPresident() {
    System.out.println(president.getName() + " doesn't work. He is the president.");
    for (Department dept : departmentList) {
      System.out.println(dept.getDepName() + " work!!!");
      for (Person person : dept.getEmployees()) {
        System.out.println(person.getName() + " is busily working!");
      }
    }
  }
}
