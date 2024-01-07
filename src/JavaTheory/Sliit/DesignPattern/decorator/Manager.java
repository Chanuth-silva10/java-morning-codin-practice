package JavaTheory.Sliit.DesignPattern.decorator;

public class Manager extends Employee {
	
	public Manager() {
		description = "Manager";
	}

	@Override
	public double getSalary() {
		return 80000;
	}

}
