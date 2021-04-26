/**
 * 
 */
package Factories.implementacion;

import Factories.interfaces.iConnectionREST;

/**
 * @author Osvaldo
 *
 */
public class ConnectionRestNoArea implements iConnectionREST {
	
	@Override
	public void readUrl(String url) {

		System.out.println("No area identified...");
		
	}

}
