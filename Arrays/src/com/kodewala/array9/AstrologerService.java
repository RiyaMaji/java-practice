package com.kodewala.array9;

public class AstrologerService {
	private double calculateCharge(Astrologer astrologer) {
		double chargePerMinutes;
		if (astrologer.getExperienceYears() > 0 && astrologer.getExperienceYears() < 3)
			chargePerMinutes = 10 * astrologer.getConsultationMinutes();
		else if (astrologer.getExperienceYears() >= 3 && astrologer.getExperienceYears() <= 7)
			chargePerMinutes = 20 * astrologer.getConsultationMinutes();
		else
			chargePerMinutes = 30 * astrologer.getConsultationMinutes();
		return chargePerMinutes;
	}

	public void bookAppointment(Astrologer astrologer) {
		if (astrologer.getExperienceYears() < 0 || astrologer.getConsultationMinutes() <= 0)
			System.out.println("Booking Rejected!!");
		else {
			if(astrologer.getConsultationMinutes() > 30)
				System.out.println("Final consultation charge : " + (calculateCharge(astrologer)-calculateCharge(astrologer)*0.1));
			else
				System.out.println("Final consultation charge : " + calculateCharge(astrologer));
		}
	}
}
