package com.labExam;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display information
    void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Question1 {
    public static void main(String[] args) {
        Person person1 = new Person("Alice", 25);
        Person person2 = new Person("Bob", 30);

        person1.displayInfo();
        person2.displayInfo();
    }
}


