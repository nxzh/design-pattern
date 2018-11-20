package after;

public class Person implements CompanyUnit {
  private String name;
  private String age;

  public Person(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAge() {
    return age;
  }

  public void setAge(String age) {
    this.age = age;
  }

  @Override
  public void accept(CompanyVisitor visitor) {
    visitor.visit(this);
  }
}
