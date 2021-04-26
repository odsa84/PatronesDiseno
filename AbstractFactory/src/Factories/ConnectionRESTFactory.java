/**
 * 
 */
package Factories;

import Factories.implementacion.ConnectionRestCompra;
import Factories.implementacion.ConnectionRestNoArea;
import Factories.implementacion.ConnectionRestVenta;
import Factories.interfaces.AbstractFactory;
import Factories.interfaces.iConnectionDB;
import Factories.interfaces.iConnectionREST;

/**
 * @author Osvaldo
 *
 */
public class ConnectionRESTFactory implements AbstractFactory {

	@Override
	public iConnectionDB getConnectionDB(String engine) {

		return null;
	}

	@Override
	public iConnectionREST getConnectionREST(String area) {

		if(area.equalsIgnoreCase("COMPRA")) {
			return new ConnectionRestCompra();
		} else if(area.equalsIgnoreCase("VENTA")) {
			return new ConnectionRestVenta();
		} else {
			return new ConnectionRestNoArea();
		}
	}

}
