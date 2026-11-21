package com.kodewala.oops.abstraction.p13;

public class Driver {

	public static void main(String[] args) {
		RailwayService service = new RailwayService();
		service.bookTicket();
		service.bookTicket();
		service.bookTicket();
		service.bookTicket();
	}

}
