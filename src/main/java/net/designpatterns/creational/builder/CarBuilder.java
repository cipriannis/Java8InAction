package net.designpatterns.creational.builder;

/**
 * Created by Ciprian on 2/9/2017.
 */

interface CarBuilder {

    CarBuilder withDoors(final int doors);

    CarBuilder withColor(final String color);

    CarBuilder withCapacity(final double capacity);

    Car build();
}
