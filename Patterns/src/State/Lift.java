package State;

public class Lift implements LiftState {

	private LiftState startState;
	private LiftState opState;
	private LiftState vrijState;
	private LiftState neerState;
	private LiftState resetState;
	private LiftState huidigeState;
	
	public Lift() {
		this.startState = new StartState(this);
		this.opState = new OpState(this);
		this.vrijState = new VrijState(this);
		this.neerState = new NeerState(this);
		this.resetState = new ResetState(this);
		
		this.huidigeState = this.startState;
	}
	
	public LiftState getHuidigeState() {
		return huidigeState;
	}

	public void setHuidigeState(LiftState huidigeState) {
		this.huidigeState = huidigeState;
	}

	public LiftState getStartState() {
		return this.startState;
	}

	public LiftState getOpState() {
		return this.opState;
	}

	public LiftState getVrijState() {
		return this.vrijState;
	}

	public LiftState getNeerState() {
		return this.neerState;
	}

	public LiftState getResetState() {
		return this.resetState;
	}

	@Override
	public void omhoog() throws StateException {
		this.huidigeState.omhoog();
	}

	@Override
	public void omlaag() throws StateException {
		this.huidigeState.omlaag();
	}

	@Override
	public void stopSensor() throws StateException {
		this.huidigeState.stopSensor();
	}

	@Override
	public void onderhoud() throws StateException {
		this.huidigeState.onderhoud();
	}

}
