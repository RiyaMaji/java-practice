package com.kodewala.control.flow;
/**
 * This class is responsible for accepting booking from the user.
 */
public class Booking {
	//More than 6 pax per PNR is not allowed.
	public String doBooking(String from, String to, int noOfPax) {
		String pnr = null;
		if(noOfPax > 6) // if true then only below code will be executed
		{
			System.err.println("As per IRCTC policy , only 6 pax are allowed per pnr ...");
		}
		// ...
		// ...
		else {
			pnr = "5469632";
			System.out.println("Booking successfull");
			System.out.println("Status : Confirmed");
			System.out.println("Seat :23");
		}

		return pnr;
	}
}
