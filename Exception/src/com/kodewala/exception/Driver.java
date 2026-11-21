package com.kodewala.exception;

class Account {
}

public class Driver {
	public static void main(String[] args) 
	{
		
		System.out.println("Driver.main() .. START");
		String name = args[0];
		int marks = Integer.parseInt(args[1]);
		System.out.println(name);
		System.out.println(marks);
			
	/*	int amount = 100;
		int part = 0;
		int total = amount / part;
		System.out.println(total);
		
	    String address = args[1];
		System.out.println(address);
		
		String name = null; //this may be null
		System.out.println(name.length());  //8
		Account account = null;		 
		System.out.println(account.hashCode());
	*/
		System.out.println("Driver.main().. END");
	}
}
