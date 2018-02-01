package State;

public class Main {

	public static void main(String[] args) throws StateException {
		Lift lift = new Lift();
		
		lift.omhoog();
		System.out.println("De huidige status is: " + lift.getHuidigeState());
		lift.stopSensor();
		System.out.println("De huidige status is: " + lift.getHuidigeState());
		lift.omlaag();
		System.out.println("De huidige status is: " + lift.getHuidigeState());
		lift.stopSensor();
		System.out.println("De huidige status is: " + lift.getHuidigeState());
		lift.onderhoud();
		System.out.println("De huidige status is: " + lift.getHuidigeState());
		lift.stopSensor();
		System.out.println("De huidige status is: " + lift.getHuidigeState());
	}
}