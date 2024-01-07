package JavaTheory.Sliit.DesignPattern.decorator;

public abstract class Employee {
	
	public String description;
	
	public Employee() {
		description = "General employee details";
	}
	
	abstract public double getSalary();

}
