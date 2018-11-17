package with;

import domain.Car;

public class AudiBuilder implements CarBuilder {
  private Car car = new Car();

  public CarBuilder buildEngine() {
    car.setEngine("Audi engine");
    return this;
  }

  public CarBuilder color() {
    car.setColor("black");
    return this;
  }

  public CarBuilder buildGearBox() {
    car.setGearBox("Audi gear box");
    return this;
  }

  public CarBuilder buildChassis() {
    car.setChassis("Audi chassis");
    return this;
  }

  public Car build() {
    return car;
  }
}
