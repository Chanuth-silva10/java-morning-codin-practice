package JavaTheory.Sliit.JavaSOLIDPrinciple.SingleResponsibilityPrinciple.Before;

// Before applying SRP
class Employee {
    private String name;
    private double baseSalary;
    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public void calculateSalary() {
        // calculate salary logic (before applying SRP)
        double calculatedSalary = baseSalary * 1.1; // Example logic, you should replace it with your actual calculation
        System.out.println("Calculated salary for " + name + ": " + calculatedSalary);
    }

    public void saveToDatabase() {
        // save to database logic (before applying SRP)
        System.out.println("Saved employee data to the database: " + name);
    }
}

public class MainBefore {
    public static void main(String[] args) {
        // Before applying SRP
        Employee employee = new Employee("John Doe", 50000.0);
        employee.calculateSalary();
        employee.saveToDatabase();
    }
}

