package com.kodewala.control.flow.practice13;

public class Driver {

	public static void main(String[] args) {
		MovieTicket pricing = new MovieTicket();
		int age = Integer.parseInt(args[0]); 
		int day = Integer.parseInt(args[1]);
		pricing.calculateTicketPrice(age, day) ;

	}

}
