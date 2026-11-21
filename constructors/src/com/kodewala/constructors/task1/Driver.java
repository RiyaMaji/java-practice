package com.kodewala.constructors.task1;

public class Driver {

	public static void main(String[] args) 
	{
		Product p1 = new Product();
		
		Product p2 = new Product("Ice-Cream", "Vanilla");
		
		Product p3 = new Product("Chai",10,"Ginger Tea",4);
		
		System.out.println(p1.productName + " " + p1.price + " "+ p1.productDescription + " "+ p1.quantity);
		
		System.out.println(p2.productName + " " + p2.price + " "+ p2.productDescription + " "+ p2.quantity);
		
		System.out.println(p3.productName + " " + p3.price + " "+ p3.productDescription + " "+ p3.quantity);
	}

}
