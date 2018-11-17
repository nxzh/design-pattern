package with;

import domain.Car;

public interface CarBuilder {

  CarBuilder buildEngine();

  CarBuilder color();

  CarBuilder buildGearBox();

  CarBuilder buildChassis();

  Car build();
}
