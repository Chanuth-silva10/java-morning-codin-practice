package JavaTheory.Sliit.DesignPattern.builder;

public abstract class PizzaBuilder {
	
	public abstract void buildPizzaBase();
	
	public abstract void buildPizzaTopping();
	
	public abstract Pizza getPizza();

}
