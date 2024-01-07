package JavaTheory.Sliit.JavaSOLIDPrinciple.SingleResponsibilityPrinciple.After;

// Single Responsibility Principle (SRP):

//A class should have only one reason to change, meaning that a class should have only one responsibility or job.
//This principle encourages a separation of concerns and helps in creating smaller, more focused classes, making the code easier to understand, maintain, and extend.


// After applying SRP
class Employee {

    private String name;
    private double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void calculateSalary() {
        // Calculate salary logic based on the employee's base salary and any other factors
        double calculatedSalary = baseSalary * 1.1; // Example logic, you should replace it with your actual calculation
        System.out.println("Calculated salary for " + name + ": " + calculatedSalary);
    }
}
