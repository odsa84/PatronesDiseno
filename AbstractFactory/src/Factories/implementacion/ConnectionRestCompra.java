/**
 * 
 */
package Factories.implementacion;

import Factories.interfaces.iConnectionREST;

/**
 * @author Osvaldo
 *
 */
public class ConnectionRestCompra implements iConnectionREST {

	@Override
	public void readUrl(String url) {

		System.out.println("Connecting Compras url... " + url);
		
	}

}
