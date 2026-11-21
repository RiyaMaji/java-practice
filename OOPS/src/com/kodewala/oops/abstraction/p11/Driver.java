package com.kodewala.oops.abstraction.p11;

public class Driver {

	public static void main(String[] args) {
		AppointmentService service = new AppointmentService();
		service.bookAppointment("Riya");
		service.bookAppointment("Rohit");
	}

}
