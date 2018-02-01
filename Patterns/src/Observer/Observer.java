package Observer;

public interface Observer {
	
	/**
	 * Elke observer "lamp" moet de methode update() bevatten.
	 * 
	 * @param color
	 */
	public void update(String color);
}