package com.kodewala.control.flow.practice13;

public class MovieTicket {

	public void calculateTicketPrice(int age, int day) {

		switch(day) {
		case 1:
			System.out.println("Final Price :  " + this.ticketPrice(age));
			break;
		case 2:
			System.out.println("Final Price :  " + this.ticketPrice(age));
			break;
		case 3:
			System.out.println("Final Price :  " + this.ticketPrice(age));
			break;
		case 4:
			System.out.println("Final Price :  " + this.ticketPrice(age));
			break;
		case 5:
			System.out.println("Final Price :  " + this.ticketPrice(age));
			break;
		case 6:
			System.out.println("Final Price :  " + (this.ticketPrice(age)+50));
			break;
		case 7:
			System.out.println("Final Price :  " + (this.ticketPrice(age)+50));
			break;
		default:
			System.out.println("Wrong Input !!! Please provide a number betwn [1-7]...");
			break;
		}		
	}
	private double ticketPrice(int age) {
		double price = 0.0f;
		if(age< 12) {
			price = 150;
			return price;  
		}	
		else if(age>=12 && age<=60) {
			price = 250; 
			return price; 
		}
		else {
			price = 180;
			return price;  
		}
	}

}
