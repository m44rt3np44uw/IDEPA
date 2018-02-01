package Strategy;

public class Mallard extends Duck {

	
	public Mallard() {
		this.flyBehavior = new NoWay();
		this.quackBehavior = new Squek();
	}
	
	@Override
	public void display() {
		System.out.println("I'm a mallard.");
	}
}