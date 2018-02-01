package Observer;

public class MiLight implements Lamp, Observer {

	/**
	 * De standaard kleur van een Mi Light is wit.
	 */
	private String color = "Wit";
	
	/**
	 * In de console wordt getoond welke kleur de lamp op het moment moet branden.
	 */
	@Override
	public void color() {
		System.out.println("Ik ben een Mi Light en ik ben nu de kleur " + this.color);
	}

	/**
	 * Wijzig de kleur.
	 */
	@Override
	public void update(String color) {
		this.color = color;
		this.color();
	}
}