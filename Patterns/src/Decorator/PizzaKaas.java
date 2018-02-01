package Decorator;

public class PizzaKaas extends PizzaDecorator {

	public PizzaKaas(Pizza pizza) {
		super(pizza);
	}

	@Override
	public int getPrice() {
		return 2 + this.pizza.getPrice();
	}
}