package org.example;

public abstract class Vehicle {
    private int wheelsCount;
    private String numberPlate;
    private float speed;

    Vehicle(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }

    public abstract boolean drive();

    public void setNumberPlate(String numberPlate) {
        System.out.println("Set number plate from String " + numberPlate);
        this.numberPlate = numberPlate;
    }

    public void setNumberPlate(int i) {
        System.out.println("Set number plate from String " + i);
        this.numberPlate = String.valueOf(i);
    }

    public void setNumberPlate(float numberPlate) {
        System.out.println("Set number plate from String " + numberPlate);
        this.numberPlate = String.valueOf(numberPlate);
    }
}
