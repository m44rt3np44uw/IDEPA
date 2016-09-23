package Decorator;

public class Main {

	public static void main(String[] args) {
		Pizza zowie   = new PizzaKip(new PizzaKip(new PizzaKaas(new NewYorkPizza())));
		Pizza sem     = new PizzaTomaat(new PizzaKip(new PizzaKaas(new PizzaKip(new PizzaKaas(new ItalianPizza()))))); 
		Pizza maarten = new PizzaKip(new PizzaKip(new PizzaKip(new PizzaKaas(new PizzaTomaat(new ItalianPizza())))));
		
		System.out.println("De kosten van de pizza van Zowie is: " + zowie.getPrice());
		System.out.println("De kosten van de pizza van Sem is: " + sem.getPrice());
		System.out.println("De kosten van de pizza van Maarten is: " + maarten.getPrice());
	}

}
