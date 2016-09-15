package Observer;

public interface Subject {
	
	/**
	 * Registreer een observer.
	 * 
	 * @param observer
	 */
	public void registerObserver(Observer observer);
	
	/**
	 * Verwijder een observer.
	 * 
	 * @param observer
	 */
	public void removeObserver(Observer observer);
	
	/**
	 * Stuur een push of pull melding naar de observers.
	 */
	public void notifyObservers();
}