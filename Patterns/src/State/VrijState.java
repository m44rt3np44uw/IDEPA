package State;

public class VrijState implements LiftState {

	private Lift lift;
	
	public VrijState(Lift lift) {
		this.lift = lift;
	}

	@Override
	public void omhoog() {
		System.out.println("De lift gaat nu omhoog.");
		this.lift.setHuidigeState(this.lift.getOpState());
	}

	@Override
	public void omlaag() {
		System.out.println("De lift gaat nu omlaag.");
		this.lift.setHuidigeState(this.lift.getNeerState());
	}

	@Override
	public void stopSensor() throws StateException {
		throw new StateException("De lift kan niet vanuit deze state (" + this.toString() + ") de methode stopSensor uitvoeren.");
	}

	@Override
	public void onderhoud() {
		System.out.println("De lift gaat nu in onderhoud.");
		this.lift.setHuidigeState(this.lift.getResetState());
	}
	
	public String toString() {
		return "Vrij";
	}

}
