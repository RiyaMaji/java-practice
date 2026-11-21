package com.kodewala.inf2;
/**
 * in 2010 - MMT 
 */
public interface  IBooking
{
	// what to do.?
   public abstract Booking book();
   public abstract void cancelBooking();
   public abstract Booking checkStatus();
   SearchResult search();
   
   // optional -- 2020
   public default void autoUpgrade() // to some of the classes
   {
	   System.out.println("IBooking.autoUpgrade()..............");
	   connectToDB();
   }
   public static void print() {
	   System.out.println("IBooking.print()");
	   //connectToDB(); we cannot call nonstatic method inside static method
   }
   private void connectToDB() {
	   System.out.println("IBooking.connectToDB()");
   }
}