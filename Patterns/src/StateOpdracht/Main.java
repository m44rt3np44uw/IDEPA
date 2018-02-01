package StateOpdracht;

public class Main {

	public static void main(String[] args) {
		
		// Maak een nieuwe order.
		Order order = new Order(new ExpressOrder());
		
		// Lever de order.
		order.deliverOrder();
	}
}