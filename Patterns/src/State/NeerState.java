package State;

public class NeerState implements LiftState {

	Lift lift;
	
	public NeerState(Lift lift) {
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
		System.out.println("De lift gaat nu in de status vrij.");
		this.lift.setHuidigeState(this.lift.getVrijState());
	}

	@Override
	public void onderhoud() throws StateException {
		throw new StateException("De lift kan niet vanuit deze state (" + this.toString() + ") de methode onderhoud uitvoeren.");
	}
	
	public String toString() {
		return "Neer";
	}

}
