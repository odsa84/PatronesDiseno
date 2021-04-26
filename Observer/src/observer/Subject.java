/**
 * 
 */
package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Osvaldo
 *
 */
public class Subject {
	
	private List<Observer> observers = new ArrayList<Observer>();
	private int state;
	
	public int getState() {
		return state;
	}
	
	public void setState(int state) {
		this.state = state;
		notifyObservers();
	}
	
	public void addObserver(Observer obs) {
		observers.add(obs);
	}
	
	public void notifyObservers() {

		observers.forEach(x -> x.actualizar());
	}

}
