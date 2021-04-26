/**
 * 
 */
package factory;

import factory.interfaces.iConnection;

/**
 * @author Osvaldo
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ConnectionFactory factory = new ConnectionFactory();
		
		iConnection iconn = factory.getConnection("MySql");
		iconn.connect();
		iconn.disconnect();
		
		iConnection iconn1 = factory.getConnection("Oracle");
		iconn1.connect();
		iconn1.disconnect();
		
		iConnection iconn2 = factory.getConnection("Sql");
		iconn2.connect();
		iconn2.disconnect();
		
		iConnection iconn3 = factory.getConnection("MongoDB");
		iconn3.connect();
		iconn3.disconnect();
		
	}

}
