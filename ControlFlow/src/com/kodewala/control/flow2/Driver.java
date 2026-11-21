package com.kodewala.control.flow2;

public class Driver {

	public static void main(String[] args) {
		Driver driver = new Driver();
		
		int day = Integer.parseInt(args[0]);//command line input and parsing it
		
		driver.identifyDay(day);
		
	}
	
	// Identify the day based on the number supplied
	public void identifyDay(int number) {
		switch(number) {
		case 1:
			System.out.println("It's MONDAY!!");
			break;
		case 2:
			System.out.println("It's Tuesday!!");
			break;
		case 3:
			System.out.println("It's Wednesday!!");
			break;
		case 4:
			System.out.println("It's Thursday");
			break;
		case 5:
			System.out.println("It's Friday");
			break;
		case 6:
			System.out.println("It's Saturday");
			break;
		case 7:
			System.out.println("Sunday!!!!!!!!!!!!!!!");
			break;
		default:
			System.out.println("Wrong Input !!! Please provide a number betwn [1-7]...");
			break;
		}
	}
}
