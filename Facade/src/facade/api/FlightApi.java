/**
 * 
 */
package facade.api;

/**
 * @author Osvaldo
 *
 */
public class FlightApi {

	public void findflights(String departureDate, String returnDate, String origin, String destiny) {
		System.out.println("===================================");
		System.out.println("Flights found to: " + destiny + ", from: " + origin);
		System.out.println("Departure date: " + departureDate + ", Return date: " + returnDate);
		System.out.println("===================================");
	}
}
