package before;

import java.util.ArrayList;
import java.util.List;

public class Department {
  private String depName;
  private List<Person> employees = new ArrayList<>();

  public Department(String depName) {
    this.depName = depName;
  }

  public String getDepName() {
    return depName;
  }

  public void setDepName(String depName) {
    this.depName = depName;
  }

  public List<Person> getEmployees() {
    return employees;
  }

  private void setEmployees(List<Person> employees) {
    this.employees = employees;
  }

  public void addEmployee(Person person) {
    this.employees.add(person);
  }
}
