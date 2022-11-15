package org.example;

public class Bike extends Vehicle {
    Bike() {
        super(2);
    }

    @Override
    public boolean drive() {
        System.out.println("Drive on my bike");
        return true;
    }

    public void rideOnBackWheel() {
        System.out.println("rideOnBackWheel");

    }
}
