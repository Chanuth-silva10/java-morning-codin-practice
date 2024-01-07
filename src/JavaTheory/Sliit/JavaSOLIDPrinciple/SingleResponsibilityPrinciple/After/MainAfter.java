package JavaTheory.Sliit.JavaSOLIDPrinciple.SingleResponsibilityPrinciple.After;

public class MainAfter {
    public static void main(String[] args) {
        // After applying SRP
        Employee employee = new Employee("John Doe", 50000.0);
        employee.calculateSalary();

        EmployeeDatabase employeeDatabase = new EmployeeDatabase();
        employeeDatabase.saveToDatabase(employee);
    }
}
