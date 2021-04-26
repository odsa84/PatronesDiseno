/**
 * 
 */
package observer;

/**
 * @author Osvaldo
 *
 */
public class SolObserver extends Observer {

	private double changeValue = 3.25;
	
	public SolObserver(Subject subject) {
		this.subject = subject;
		this.subject.addObserver(this);
	}
	
	@Override
	public void actualizar() {
		
		System.out.println("PER: " + (subject.getState() * changeValue));
	}

}
