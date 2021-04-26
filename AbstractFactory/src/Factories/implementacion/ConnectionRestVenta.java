/**
 * 
 */
package Factories.implementacion;

import Factories.interfaces.iConnectionREST;

/**
 * @author Osvaldo
 *
 */
public class ConnectionRestVenta implements iConnectionREST {
	
	@Override
	public void readUrl(String url) {

		System.out.println("Connecting Ventas url... " + url);
		
	}

}
