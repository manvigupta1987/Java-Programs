import com.travel.*;


/** In travel site, we can book train ticket as well bus tickets and flight ticket.
 *  In this case user can give his travel type as ‘bus’, ‘train’ or ‘flight’.
 *  Here we have an abstract class ‘AnyTravel’ with a static member function 
 *  ‘GetObject’ which depending on user’s travel type, will create & return object
 *   of ‘BusTravel’ or ‘ TrainTravel’. ‘BusTravel’ or ‘ TrainTravel’
 */

/** With the help of Factory Design Pattern, Only the abstract class AnyTravel is visible 
 * to the client. Object creation of the different classes are not visible to the client. 
 */


public class FactoryMain extends AnyTravel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Travel obj = getObject("Flight");
	    obj.bookTicket();
	}
}
