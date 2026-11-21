package com.kodewala.constructors1;

public class Driver {

	public static void main(String[] args) {
		//type refName = new Class();
		Account acc = new Account(); // calling non parameterized constructor
		System.out.println(acc.amount +" " + acc.name);
		
		Account acc1 = new Account(1200,"Kodewala"); // calling parameterized constructor
		System.out.println(acc1.amount + " "+acc1.name);
	}

}
