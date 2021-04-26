/**
 * 
 */
package observer;

/**
 * @author Osvaldo
 *
 */
public class PesoMXObserver extends Observer {
	
	private double changeValue = 19.07;
	
	public PesoMXObserver(Subject subject) {
		this.subject = subject;
		this.subject.addObserver(this);
	}
	
	@Override
	public void actualizar() {
		
		System.out.println("MX: " + (subject.getState() * changeValue));
	}

}
