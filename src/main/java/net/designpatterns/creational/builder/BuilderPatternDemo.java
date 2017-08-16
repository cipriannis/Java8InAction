package net.designpatterns.creational.builder;

/**
 * Created by Ciprian Dumitrel on 2/9/2017.
 * Builder pattern builds a complex object using simple objects and using a step by step approach.
 */

public class BuilderPatternDemo {

    private CarBuilder carBuilder;

    public BuilderPatternDemo(final CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    public static void main(String[] args) {
        CarBuilder carBuilder = new CarBuilderImpl();
        BuilderPatternDemo builderPatternDemo = new BuilderPatternDemo(carBuilder);
        System.out.println(builderPatternDemo.construct());
    }

    private Car construct() {
        return carBuilder.withCapacity(2.0).withColor("Red").withDoors(5).build();
    }
}
