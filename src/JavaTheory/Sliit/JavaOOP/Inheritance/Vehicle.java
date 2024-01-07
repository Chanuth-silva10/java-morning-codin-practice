package JavaTheory.Sliit.JavaOOP.Inheritance;

// Inheritance is a mechanism that allows a class (subclass/derived class) to inherit the properties and behaviors of another class (superclass/base class).
// It promotes code reuse and establishes a relationship between classes.

// Real-world analogy: Think of a general class "Vehicle" that has common properties like speed.
// The specific classes like "Car" and "Bicycle" can inherit from the "Vehicle" class and add their unique properties.

public class Vehicle {
    int speed;

    void accelerate() {
        speed += 5;
    }
}

