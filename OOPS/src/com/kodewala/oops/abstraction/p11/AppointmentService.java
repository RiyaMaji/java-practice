package com.kodewala.oops.abstraction.p11;

public class AppointmentService {
	private boolean slotAvailable = true;
	public void bookAppointment(String patientName) {
		if(verifyPatient(patientName) && checkAvailability()) {
			reserveSlot();
			System.out.println("Appontment Booked!!");
		}else
			System.out.println("Booking Failed!!");
		
	}
	private boolean verifyPatient(String patientName) {
		return patientName != null && !patientName.equals("");
	}
	private boolean checkAvailability() {
		return slotAvailable;
	}
	private void reserveSlot() {
		slotAvailable = false ;
	}

}
