package domain;

public class IDCard extends Product {

  private String owner;

  public IDCard(String owner) {
    this.owner = owner;
  }

  public void use() {
    System.out.println("Using " + owner + "'s card");
  }

  public String getOwner() {
    return owner;
  }
}
