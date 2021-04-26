/**
 * 
 */
package facade;

/**
 * @author Osvaldo
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Facade apiClient = new Facade();
		apiClient.buscar("25/04/2021", "30/04/2021", "Quito", "La Habana");
		
		Facade apiClient1 = new Facade();
		apiClient1.buscar("25/04/2021", "30/04/2021", "Quito", "La Habana");

	}

}
