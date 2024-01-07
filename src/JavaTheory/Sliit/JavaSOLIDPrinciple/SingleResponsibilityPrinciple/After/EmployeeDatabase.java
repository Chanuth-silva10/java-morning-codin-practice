package JavaTheory.Sliit.JavaSOLIDPrinciple.SingleResponsibilityPrinciple.After;

class EmployeeDatabase {
    public void saveToDatabase(Employee employee) {
        // Save employee data to the database
        System.out.println("Saved employee data to the database: " + employee.getName());
    }
}
