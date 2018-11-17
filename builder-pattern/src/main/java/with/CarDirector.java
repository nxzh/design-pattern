package with;

import domain.Car;

public class CarDirector {
  private CarBuilder builder;

  public CarDirector(CarBuilder builder) {
    this.builder = builder;
  }

  public Car construct() {
    return builder.buildChassis().buildEngine().buildGearBox().color().build();
  }
}
