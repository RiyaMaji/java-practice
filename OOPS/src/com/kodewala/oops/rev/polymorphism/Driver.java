package com.kodewala.oops.rev.polymorphism;

class Delivery {
	public void doDeliver() {

		System.out.println("Delivery.doDeliver() ..... Delivery");
	}
}

class ExpressBee extends Delivery {
	@Override
	public void doDeliver() {
		System.out.println("ExpressBee.doDeliver() ..... ExpressBee ");
	}
}

class EKart extends Delivery {
	@Override
	public void doDeliver() {
		System.out.println("EKart.doDeliver() ..... EKart");
	}
}

public class Driver {
	public static void main(String[] args) {
		Delivery delivery = new Delivery(); // int amount = 100;

		// Compile time -- > it will check the method in Delivery class
		// Runtime -- > it will call the method of Delivery class
		delivery.doDeliver(); // Compile time -- >

		// Parent class can refer child class object
		Delivery delivery1 = new ExpressBee();
		// Compile -- > it will check the method in Delivery class
		// runtime -- > it will call the method of ExpressBee class
		delivery1.doDeliver();
		
		ExpressBee expressBee = (ExpressBee) delivery1;
		expressBee.doDeliver();
		
		//Delivery del = new ExpressBee();
		//ExpressBee expressBee = (ExpressBee) del;
		//expressBee.doDeliver();
	}

}
