package Decorator;

public class PizzaKip extends PizzaDecorator {

	public PizzaKip(Pizza pizza) {
		super(pizza);
	}

	@Override
	public int getPrice() {
		return 4 + this.pizza.getPrice();
	}
}