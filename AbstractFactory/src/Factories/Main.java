/**
 * 
 */
package Factories;

import Factories.interfaces.AbstractFactory;
import Factories.interfaces.iConnectionDB;
import Factories.interfaces.iConnectionREST;

/**
 * @author Osvaldo
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		AbstractFactory afDB = FactoryProducer.getFactory("DB");
		
		iConnectionDB iConndb = afDB.getConnectionDB("MYSQL");
		iConndb.connect();
		
		AbstractFactory afRest = FactoryProducer.getFactory("REST");
		
		iConnectionREST iconnrest = afRest.getConnectionREST("VENTA");
		iconnrest.readUrl("https://www.youtube.com/watch?v=QmE-o5R7ZF4&list=PLvimn1Ins-41Uiugt1WbpyFo1XT1WOquL&index=4");

	}

}
