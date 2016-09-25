package State;

public class StartState implements LiftState {

	Lift lift;
	
	public StartState(Lift lift) {
		this.lift = lift;
	}

	@Override
	public void omhoog() {
		System.out.println("De lift gaat nu omhoog.");
		this.lift.setHuidigeState(this.lift.getOpState());
	}

	@Override
	public void omlaag() throws StateException {
		throw new StateException("De lift kan niet vanuit deze state (" + this.toString() + ") de methode omlaag uitvoeren.");
	}

	@Override
	public void stopSensor() throws StateException {
		throw new StateException("De lift kan niet vanuit deze state (" + this.toString() + ") de methode stopSensor uitvoeren.");
	}

	@Override
	public void onderhoud() throws StateException {
		throw new StateException("De lift kan niet vanuit deze state (" + this.toString() + ") de methode onderhoud uitvoeren.");
	}
	
	public String toString() {
		return "Start";
	}
}