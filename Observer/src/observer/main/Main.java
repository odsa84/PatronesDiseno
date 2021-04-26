/**
 * 
 */
package observer.main;

import observer.PesoARGObserver;
import observer.PesoMXObserver;
import observer.SolObserver;
import observer.Subject;

/**
 * @author Osvaldo
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Subject subject = new Subject();
		
		new SolObserver(subject);
		new PesoMXObserver(subject);
		new PesoARGObserver(subject);
		
		System.out.println("If you want to change 10 dolars, you get: ");
		subject.setState(10);
		System.out.println("---------------------");
		System.out.println("If you want to change 100 dolars, you get: ");
		subject.setState(100);
	}

}
