package JavaTheory.Sliit.JavaOOP.ClassAndObject;


// Class:  A class is a blueprint or template for creating objects.
//         It defines the properties (attributes) and behaviors (methods) that objects created from the class will have.
// Object: An object is an instance of a class.It represents a real-world entity and is created from a class.
//         Objects have both state (attributes) and behavior (methods).

// Real-world analogy: Think of a class as a blueprint for a car, specifying its properties (color, model, year) and behaviors (start, drive).
// An object is an actual instance of a car, such as your specific red 2022 Toyota Camry.


public class Car {
    String color;
    String model;
    int year;

    void start() {
        System.out.println("Start");
    }

    void drive() {
        System.out.println("Drive");
    }
}
