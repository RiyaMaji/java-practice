package com.kodewala.strings1;

public class Driver {

	public static void main(String[] args) {
		//Create a string Object
		//String firstName = "Kodewala" ; //Object created in SCP -->address --> hft224
		//String lastName = "Kodewala Academy" ;  // Object with content "Kodewala" already created
									// and lastName will refer to existing object.
									// last name is also pointing to hft224
		//System.out.println(firstName == lastName); // == will compare the address of an object

		//String city = new String("Bangalore");
		
		
		String s3 = new String("Hello"); //(scp+heap) 

		String s4 = s3.concat("World"); // heap(HelloWorld) + scp(world)  
		//s4.intern();
		String s5 = "HelloWorld";
		System.out.println(s5);
		
	}

}
