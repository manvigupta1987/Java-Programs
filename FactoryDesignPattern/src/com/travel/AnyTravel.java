package com.travel;

public abstract class AnyTravel {
	
	protected static Travel getObject(String str) {
		if(str.equals("Bus")) {
			return (Travel) new BusTicket();
		}else if(str.equals("Train")) {
			return (Travel) new TrainTicket();
		}else {
			return (Travel) new FlightTicket();
		}
	}
}
