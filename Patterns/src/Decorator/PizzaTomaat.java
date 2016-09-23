package Decorator;

public class PizzaTomaat extends PizzaDecorator {

	public PizzaTomaat(Pizza pizza) {
		super(pizza);
	}

	@Override
	public int getPrice() {
		return 1 + this.pizza.getPrice();
	}

}
