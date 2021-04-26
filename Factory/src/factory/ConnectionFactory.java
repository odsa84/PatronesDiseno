/**
 * 
 */
package factory;

import factory.implementacion.ConnectionEmpty;
import factory.implementacion.ConnectionMySql;
import factory.implementacion.ConnectionOracle;
import factory.implementacion.ConnectionSql;
import factory.interfaces.iConnection;

/**
 * @author Osvaldo
 *
 */
public class ConnectionFactory {
	
	public iConnection getConnection(String engine) {
		
		if(engine.equalsIgnoreCase("MYSQL")) {
			return new ConnectionMySql();
		} else if(engine.equalsIgnoreCase("Oracle")) {
			return new ConnectionOracle();
		} else if(engine.equalsIgnoreCase("SQL")) {
			return new ConnectionSql();
		} else {
			return new ConnectionEmpty();
		}
	}
}
