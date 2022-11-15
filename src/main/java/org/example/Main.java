package org.example;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");

        Car car = new Car();
        Bike bike = new Bike();
        NeedForSpeedCar car2 = new NeedForSpeedCar();

        Driver driver = new Driver();
        driver.drive(car2);
        driver.drive(bike);


    }
}