package com.kodewala.inf2;

public class Driver {
	public static void main(String[] args) 
	{
       IBooking booking = new TrainBooking();	
      
       booking.autoUpgrade();
    
       IBooking.print();
 
       TrainBooking.print();
  
     //  IBooking booking1 = new BusBooking();
      
       IBooking.print();
     
       BusBooking.print();
	}
}
