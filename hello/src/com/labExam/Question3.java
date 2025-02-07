package com.labExam;

class Vehicle {
    void start() {
        System.out.println("Vehicle  starting.");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car driving.");
    }
}

public class Question3 {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.start();
        myCar.drive();
    }
}
