package JavaTheory.Sliit.JavaOOP.Abstraction;

public class Circle extends Shape {
    double radius;

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}
