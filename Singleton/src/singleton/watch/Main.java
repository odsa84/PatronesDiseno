/**
 * 
 */
package singleton.watch;

/**
 * @author Osvaldo
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// 3 relojes usando el patr�n singleton    
        Watch w1 = Watch.getInstance();
        Watch w2 = Watch.getInstance();
        Watch w3 = Watch.getInstance();
        
//      // 3 relojes sin usar el patr�n singleton      
//      Watch w1 = new Watch();
//      Watch w2 = new Watch();
//      Watch w3 = new Watch();

	}

}
