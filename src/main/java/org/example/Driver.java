package org.example;

public class Driver {
    public void drive(Vehicle vehicle) {
        System.out.println("I'm gonna:");

        if (vehicle instanceof NeedForSpeedCar) {
            NeedForSpeedCar car = (NeedForSpeedCar) vehicle;
            car.ra_ta_ta_ta();

        } else if (vehicle instanceof Bike bike) {
            bike.rideOnBackWheel();

        } else {
            vehicle.drive();
        }
    }

}
