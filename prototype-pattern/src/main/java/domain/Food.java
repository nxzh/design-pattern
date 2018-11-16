package domain;

import domain.framework.Product;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class Food implements Product {

  private LocalDate madeAt = LocalDate.now();
  private Date expireAt =
      Date.from(madeAt.plusDays(5).atStartOfDay(ZoneId.systemDefault()).toInstant());

  public void use() {
    System.out.println("I am using food");
  }

  public Product copy() {
    Food copy = null;
    try {
      copy = (Food) super.clone();
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }
    copy.setExpireAt((Date) expireAt.clone());
    return copy;
  }

  public Date getExpireAt() {
    return expireAt;
  }

  public void setExpireAt(Date expireAt) {
    this.expireAt = expireAt;
  }

  public LocalDate getMadeAt() {
    return madeAt;
  }

  public void setMadeAt(LocalDate madeAt) {
    this.madeAt = madeAt;
  }
}
