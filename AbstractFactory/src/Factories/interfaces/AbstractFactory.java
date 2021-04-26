/**
 * 
 */
package Factories.interfaces;

/**
 * @author Osvaldo
 *
 */
public interface AbstractFactory {
	
	iConnectionDB getConnectionDB(String engine);
	iConnectionREST getConnectionREST(String area);

}
