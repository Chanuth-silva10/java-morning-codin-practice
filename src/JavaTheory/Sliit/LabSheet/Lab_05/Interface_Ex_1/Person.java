package JavaTheory.Sliit.LabSheet.Lab_05.Ex_1;

public class Person implements ICompute{
    private String name;
    private double basicSal;
    private double otRate;
    private double otHrs;
    private double netSal;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Person(String name, double basicSal, double otRate, double otHrs, double netSal) {
        this.name = name;
        this.basicSal = basicSal;
        this.otRate = otRate;
        this.otHrs = otHrs;
        this.netSal = netSal;
    }
    public Person(String name, double basicSal, double otRate, double otHrs) {
        this.name = name;
        this.basicSal = basicSal;
        this.otRate = otRate;
        this.otHrs = otHrs;
    }

    // Person Net Salary Calculation
    @Override
    public int calculate() {
        netSal = basicSal + (otHrs * otRate);
        System.out.println("Person Net Salary :"+netSal);
        return 0;
    }

    // Person
    @Override
    public void display() {
        System.out.println("Display Person Name :"+name);
    }
}
