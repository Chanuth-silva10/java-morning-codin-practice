package JavaTheory.Sliit.JavaOOP.Abstraction;

// Abstraction involves simplifying complex systems by modeling classes based on the essential properties and behaviors relevant to the program. It hides the implementation details, allowing the programmer to focus on the essential features.

// Real-world analogy: Think of a geometric shape abstraction.
// The abstract class "Shape" defines a method "area" that must be implemented by its concrete subclasses like "Circle."

public class main {
    public static void main(String[] args) {
        Circle myCircle = new Circle();
        myCircle.radius = 5.0;
        double circleArea = myCircle.area();
    }
}
