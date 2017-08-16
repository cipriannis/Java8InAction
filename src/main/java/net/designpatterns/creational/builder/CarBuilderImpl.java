package net.designpatterns.creational.builder;

/**
 * Created by Ciprian on 2/9/2017.
 */
public class CarBuilderImpl implements CarBuilder {

    private Car car;

    public CarBuilderImpl() {
        car = new Car();
    }

    @Override
    public CarBuilder withDoors(int doors) {
        car.setDoors(doors);
        return this;
    }

    @Override
    public CarBuilder withColor(String color) {
        car.setColor(color);
        return this;
    }

    @Override
    public CarBuilder withCapacity(double capacity) {
        car.setCapacity(capacity);
        return this;
    }

    @Override
    public Car build() {
        return car;
    }
}
