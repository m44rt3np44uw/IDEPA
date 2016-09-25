package State;

public interface LiftState {
	public void omhoog() throws StateException;
	public void omlaag() throws StateException;
	public void stopSensor() throws StateException;
	public void onderhoud() throws StateException;
}