package Decorator;

public abstract class PizzaDecorator implements Pizza {

	protected Pizza pizza;
	
	public PizzaDecorator(Pizza pizza) {
		this.pizza = pizza;
	}
	
	public abstract int getPrice();
}