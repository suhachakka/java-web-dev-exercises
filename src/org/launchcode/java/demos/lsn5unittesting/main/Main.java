package org.launchcode.java.demos.lsn5unittesting.main;

public class Main {

    public static void main(String[] args) {
        org.launchcode.java.demos.lsn5unittesting.main.Car car = new org.launchcode.java.demos.lsn5unittesting.main.Car("Toyota", "Prius", 10, 50);
        System.out.println(car.getMake() + " - " + car.getModel());
    }
}
