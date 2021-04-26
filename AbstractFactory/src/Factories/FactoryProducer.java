/**
 * 
 */
package Factories;

import Factories.interfaces.AbstractFactory;

/**
 * @author Osvaldo
 *
 */
public class FactoryProducer {
	
	public static AbstractFactory getFactory(String kindFactory) {
		
		if(kindFactory.equalsIgnoreCase("DB")) {
			return new ConnectionDBFactory();
		} else if(kindFactory.equalsIgnoreCase("REST")) {
			return new ConnectionRESTFactory();
		} else {
			return null;
		}
	}

}
