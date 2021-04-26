/**
 * 
 */
package factory.implementacion;

import factory.interfaces.iConnection;

/**
 * @author Osvaldo
 *
 */
public class ConnectionEmpty implements iConnection {
	
	@Override
	public void connect() {
		
		System.out.println("Empty Connection");
	}
	
	@Override
	public void disconnect() {
		
		System.out.println("Empty Connection");
	}

}
