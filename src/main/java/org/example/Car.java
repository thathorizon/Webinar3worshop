package org.example;

public class Car extends Vehicle {
    Car() {
        super(4);
    }

    @Override
    public boolean drive() {
        System.out.println("Sleeping in my car");
        return true;
    }
}
