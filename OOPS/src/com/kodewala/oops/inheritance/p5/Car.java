package com.kodewala.oops.inheritance.p5;

public class Car {
	Engine engine;

	public void startCar() {
		
		System.out.println("Car.startCar()");
		engine = new Engine();
		engine.start();
	}
}
