package before;

import domain.Car;

public class Main {
  public static void main(String[] args) {
    Car car = new Car();
    if (System.currentTimeMillis() % 2 == 0) {
      car.setChassis("BMW chassis");
      car.setEngine("BMW engine");
      car.setGearBox("BMW gear box");
      car.setColor("blue");

    } else {
      car.setChassis("Audi chassis");
      car.setEngine("Audi engine");
      car.setGearBox("Audi gear box");
      car.setColor("black");
    }

    System.out.println(car);
  }
}
