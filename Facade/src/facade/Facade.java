/**
 * 
 */
package facade;

import facade.api.FlightApi;
import facade.api.HotelApi;

/**
 * @author Osvaldo
 *
 */
public class Facade {
	
	private FlightApi flightApi;
	private HotelApi hotelApi;
	
	public Facade() {
		flightApi = new FlightApi();
		hotelApi = new HotelApi();
	}
	
	public void buscar(String dateIn, String dateOut, String origin, String destiny) {
		flightApi.findflights(dateIn, dateOut, origin, destiny);
		hotelApi.findHotels(dateIn, dateOut, origin, destiny);
	}

}
