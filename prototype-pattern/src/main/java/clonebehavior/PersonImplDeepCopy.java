package clonebehavior;

import java.util.Date;

public class PersonImplDeepCopy implements Cloneable {
  private String name;
  private Date birthday;

  public PersonImplDeepCopy(String name, Date birthday) {
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
  public PersonImplDeepCopy clone() throws CloneNotSupportedException {
    PersonImplDeepCopy copy = (PersonImplDeepCopy) super.clone();
    copy.setBirthday((Date) this.birthday.clone());
    return copy;
  }
}
