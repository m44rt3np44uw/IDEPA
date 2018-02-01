package Observer;

import java.util.ArrayList;

public class ULightDimmerColorProfileApp implements Subject {
	
	/**
	 * Lijst met alle observers.
	 */
	private ArrayList<Observer> observers = new ArrayList<Observer>();
	
	/**
	 * De kleur die alle verschillende lampen moet branden.
	 */
	private String color;
	
	/**
	 * Verkrijg de kleur.
	 * 
	 * @return color
	 */
	public String getColor() {
		return color;
	}
	
	/**
	 * Zet de kleur.
	 * De observer worden op de hoogte gebracht via colorChanged().
	 * 
	 * @param color
	 */
	public void setColor(String color) {
		this.color = color;
		this.colorChanged();
	}

	/**
	 * Voeg een observer aan de observer lijst toe.
	 */
	@Override
	public void registerObserver(Observer observer) {
		this.observers.add(observer);
	}

	/**
	 * Verwijder een observer uit de observer lijst.
	 */
	@Override
	public void removeObserver(Observer observer) {
		this.observers.remove(observer);
	}

	/**
	 * Breng alle observers op de hoogte.
	 */
	@Override
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(this.color);
		}
	}
	
	/**
	 * Geef door dat de kleur van de lamp aangepast moet worden.
	 */
	public void colorChanged() {
		this.notifyObservers();
	}
}