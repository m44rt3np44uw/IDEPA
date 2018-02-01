package Observer;

public class Netflix {

	public static void main(String[] args) {

		/**
		 * De applicatie wordt aangemaakt.
		 */
		ULightDimmerColorProfileApp app = new ULightDimmerColorProfileApp();
		
		/**
		 * Er worden 10 lampen aangemaakt.
		 */
		for (int i = 0; i < 5; i++) {
			app.registerObserver(new PhilipsHue());
			app.registerObserver(new MiLight());
		}
		
		/**
		 * Er wordt 3 keer een kleur verandering nagebootst. 
		 */
		app.setColor("Rood");
		app.setColor("Groen");
		app.setColor("Blauw");		
	}
}