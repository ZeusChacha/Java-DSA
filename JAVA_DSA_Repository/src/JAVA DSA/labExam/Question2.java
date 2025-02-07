package com.labExam;

class Animal {

    void sound() {
        System.out.println("Animals make different sounds.");
    }
}

class Dog extends Animal {
    // Overriding the sound method
    @Override
    void sound() {
        System.out.println("Dog says: Woof Woof!");
    }
}

public class Question2 {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.sound();
    }
}

