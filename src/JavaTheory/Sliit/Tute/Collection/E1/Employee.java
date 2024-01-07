package JavaTheory.Sliit.Tute.Collection.E1;

public class Employee {
    public int id;
    private String name,department;
    private double salary;

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }
    public String getdep() {
        return department;
    }
    public double getSalary() {
        return salary;
    }
}
