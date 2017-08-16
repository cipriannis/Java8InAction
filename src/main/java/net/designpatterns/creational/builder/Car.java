package net.designpatterns.creational.builder;

/**
 * Created by Ciprian on 2/9/2017.
 */

public class Car {
    private int doors;
    private String color;
    private double capacity;

    public Car() {
    }

    @Override
    public String toString(){
        return "Car [doors = " + doors + ", color = " + color + ", engine = " + capacity + "]";
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }
}
