/**
 * 
 */
package Factories.implementacion;

import Factories.interfaces.iConnectionDB;

/**
 * @author Osvaldo
 *
 */
public class ConnectionEmpty implements iConnectionDB{
	
	@Override
	public void connect() {
		
		System.out.println("Empty Connection");
	}
	
	@Override
	public void disconnect() {
		
		System.out.println("Empty Connection");
	}

}
