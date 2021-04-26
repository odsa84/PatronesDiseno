/**
 * 
 */
package observer;

/**
 * @author Osvaldo
 *
 */
public class PesoARGObserver extends Observer {
	
	private double changeValue = 29.86;
	
	public PesoARGObserver(Subject subject) {
		this.subject = subject;
		this.subject.addObserver(this);
	}
	
	@Override
	public void actualizar() {
		
		System.out.println("ARG: " + (subject.getState() * changeValue));
	}

}
