package JavaTheory.Sliit.JavaSOLIDPrinciple.OpenClosedPrinciple.Before;

// Software entities (classes, modules, functions, etc.) should be open for extension but closed for modification.
// This principle encourages the use of abstraction and interfaces to allow for adding new functionality without altering existing code.
// This promotes a more stable and extensible system.

class Circle {
    public double calculateArea() {
        // calculate area logic for circle
        double radius = 4.0;
        return Math.PI * Math.pow(radius, 2);
    }
}
