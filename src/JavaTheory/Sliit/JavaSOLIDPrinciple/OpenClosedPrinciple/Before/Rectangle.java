package JavaTheory.Sliit.JavaSOLIDPrinciple.OpenClosedPrinciple.Before;

// Before applying OCP
class Rectangle {
    public double calculateArea() {
        // calculate area logic for rectangle
        double length = 5.0;
        double width = 3.0;
        return length * width;
    }
}
