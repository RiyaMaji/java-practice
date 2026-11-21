package com.kodewala.array4;

public class TicketBookingService {
	double bookingAmount = 0;

	public void bookTicket(TrainBooking trainBooking) {
		if (trainBooking.getNumberOfPassengers() >= 1 && trainBooking.getNumberOfPassengers() <= 6
				&& trainBooking.getTicketPricePerPassenger() >= 0) {
			bookingAmount = calculateBookingAmount(trainBooking);
			System.out.println("Booking Total : " + bookingAmount);
		} else if (trainBooking.getTicketPricePerPassenger() < 0)
			System.err.println("Ticket price must be positive.");
		else
			System.err.println("Booking Rejected!! Number of passengers should be between 1 to 6...");
	}

	private double calculateBookingAmount(TrainBooking trainBooking) {
		return trainBooking.getTicketPricePerPassenger() * trainBooking.getNumberOfPassengers();
	}
}
