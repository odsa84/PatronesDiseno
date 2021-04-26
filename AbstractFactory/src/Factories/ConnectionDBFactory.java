/**
 * 
 */
package Factories;

import Factories.interfaces.AbstractFactory;
import Factories.interfaces.iConnectionDB;
import Factories.interfaces.iConnectionREST;
import Factories.implementacion.ConnectionEmpty;
import Factories.implementacion.ConnectionMySql;
import Factories.implementacion.ConnectionOracle;
import Factories.implementacion.ConnectionSql;

/**
 * @author Osvaldo
 *
 */
public class ConnectionDBFactory implements AbstractFactory {
	

	@Override
	public iConnectionDB getConnectionDB(String engine) {
		
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

	@Override
	public iConnectionREST getConnectionREST(String area) {

		return null;
	}

}
