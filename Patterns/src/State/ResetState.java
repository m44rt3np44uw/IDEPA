package State;

public class ResetState implements LiftState {

	Lift lift;
	
	public ResetState(Lift lift) {
		this.lift = lift;
	}

	@Override
	public void omhoog() throws StateException {
		throw new StateException("De lift kan niet vanuit deze state (" + this.toString() + ") de methode omhoog uitvoeren.");
	}

	@Override
	public void omlaag() throws StateException {
		throw new StateException("De lift kan niet vanuit deze state (" + this.toString() + ") de methode omlaag uitvoeren.");
	}

	@Override
	public void stopSensor() {
		System.out.println("De lift gaat nu in de status start.");
		this.lift.setHuidigeState(this.lift.getStartState());
	}

	@Override
	public void onderhoud() throws StateException {
		throw new StateException("De lift kan niet vanuit deze state (" + this.toString() + ") de methode onderhoud uitvoeren.");
	}
	
	public String toString() {
		return "Reset";
	}
}