package after;

import domain.Car;

public class BMWBuilder implements CarBuilder {

  private Car car = new Car();

  public CarBuilder buildEngine() {
    car.setEngine("BMW engine");
    return this;
  }

  public CarBuilder color() {
    car.setColor("black");
    return this;
  }

  public CarBuilder buildGearBox() {
    car.setGearBox("BMW gear box");
    return this;
  }

  public CarBuilder buildChassis() {
    car.setChassis("BMW chassis");
    return this;
  }

  public Car build() {
    return car;
  }
}
