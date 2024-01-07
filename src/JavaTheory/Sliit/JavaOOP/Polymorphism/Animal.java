package JavaTheory.Sliit.JavaOOP.Polymorphism;

// Polymorphism allows objects to be treated as instances of their parent class, even if they are actually instances of a derived class.
// It includes method overloading (multiple methods with the same name but different parameters) and method overriding (a method in the subclass with the same signature as a method in the superclass).

// Real-world analogy: Consider the concept of polymorphism in animals.
// The method makeSound can behave differently for different animals.
// A dog can bark, a cat can meow, and a bird can chirp.

public class Animal {
    public void makeSound() {
        System.out.println("Some generic sound");
    }
}



