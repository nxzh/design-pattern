package domain;

public class Car {

  private String color;
  private String engine;
  private String gearBox;
  private String chassis;

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    if (getChassis() == null || getEngine() == null || getGearBox() == null) {
      throw new IllegalStateException(
          "Engine, gear box and chassis are not setup yet. Can't color!");
    }
    this.color = color;
  }

  public String getEngine() {
    return engine;
  }

  public void setEngine(String engine) {
    if (getChassis() == null) {
      throw new IllegalStateException("Chassis is not setup yet. Can't setup engine!");
    }
    this.engine = engine;
  }

  public String getGearBox() {
    return gearBox;
  }

  public void setGearBox(String gearBox) {
    if (getChassis() == null) {
      throw new IllegalStateException("Chassis is not setup yet. Can't setup gear box!");
    }
    this.gearBox = gearBox;
  }

  public String getChassis() {
    return chassis;
  }

  public void setChassis(String chassis) {
    this.chassis = chassis;
  }

  @Override
  public String toString() {
    return "Car{"
        + "color='"
        + color
        + '\''
        + ", engine='"
        + engine
        + '\''
        + ", gearBox='"
        + gearBox
        + '\''
        + ", chassis='"
        + chassis
        + '\''
        + '}';
  }
}
