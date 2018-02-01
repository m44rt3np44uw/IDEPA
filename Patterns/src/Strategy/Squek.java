package Strategy;

public class Squek implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("Squek.");
	}
}