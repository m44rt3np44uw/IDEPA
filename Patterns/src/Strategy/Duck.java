package Strategy;

public abstract class Duck {
	
	public FlyBehavior flyBehavior;
	public QuackBehavior quackBehavior;
	
	public Duck() {
		
	}
	
	abstract public void display();
	
	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}
	
	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
	
	public void performFly() {
		this.flyBehavior.fly();
	}
	
	public void performQuack() {
		this.quackBehavior.quack();
	}
}