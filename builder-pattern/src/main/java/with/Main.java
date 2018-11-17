package with;

import domain.Car;

public class Main {

  public static void main(String[] args) {
    CarBuilder builder;

    if (System.currentTimeMillis() % 2 == 0) {
      builder = new BMWBuilder();
    } else {
      builder = new AudiBuilder();
    }

    CarDirector director = new CarDirector(builder);
    Car car = director.construct();
    System.out.println(car);
  }
}
