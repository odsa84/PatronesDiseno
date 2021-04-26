/**
 * 
 */
package memento;

import java.util.ArrayList;

/**
 * @author Osvaldo
 *
 */
public class Caretaker {
	
	private ArrayList<Memento> mementos = new ArrayList<>();
	
	public void addMemento(Memento m) {
		mementos.add(m);
	}
	
	public Memento getMemento(int i) {
		return mementos.get(i);
	}

}
