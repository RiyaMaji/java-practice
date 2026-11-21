package com.kodewala.array9;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		AstrologerService service = new AstrologerService();
		Scanner sc = new Scanner(System.in);
		Astrologer consultations[] = new Astrologer[3];
		for (int i = 0; i < consultations.length; i++) {
			consultations[i] = new Astrologer(sc.next(),sc.nextInt(),sc.nextInt());
		}
		for (int i = 0; i < consultations.length; i++) {
			service.bookAppointment(consultations[i]);
		}
		sc.close();
	}

}
