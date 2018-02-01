package Strategy;

public class NoWay implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("No way.");
	}
}