package Strategy;

public class WithWings implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("With wings.");
	}
}