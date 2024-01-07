package JavaTheory.Sliit.LabSheet.Lab_05.Ex_1;

public class Main {
    public static void main(String[] args) {

        // Related Person Calculation
        Person ob1 = new Person("Chanuth", 40, 10, 5);
        ob1.calculate();
        ob1.display();
        System.out.println(" ");

        // Related Person Calculation
        ICompute ob3 = new Person("Chanuth", 40, 10, 5);
        ob3.calculate();
        ob3.display();
        System.out.println(" ");

        // Related Box Volume Calculation
        ICompute ob2 = new Box(10,20, 5);
        ob2.calculate();
        ob2.display();
        System.out.println(" ");

    }
}
