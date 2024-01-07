package JavaTheory.Sliit.JavaSOLIDPrinciple.OpenClosedPrinciple.After;

class Circle implements Shape {
    public double calculateArea() {
        // calculate area logic for circle
        double radius = 4.0;
        return Math.PI * Math.pow(radius, 2);
    }
}