package clonebehavior;

import java.util.Date;

public class PersonImplShallowCopy implements Cloneable {
  private String name;
  private Date birthday;

  public PersonImplShallowCopy(String name, Date birthday) {
    this.name = name;
    this.birthday = birthday;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Date getBirthday() {
    return birthday;
  }

  public void setBirthday(Date birthday) {
    this.birthday = birthday;
  }

  @Override
  public PersonImplShallowCopy clone() throws CloneNotSupportedException {
    return (PersonImplShallowCopy) super.clone();
  }
}
