package com.kodewala.constructors.practice;
class Person{
	Person(String eName){
		System.out.println("Person : " + eName);
	}
}
class Employees extends Person{
	Employees(){
		this(" Unknown Person ");
		System.out.println("Default Employee");
	}
	Employees(String eName){
		super(eName);
		System.out.println("Employee : " + eName);
	}
}
public class Driver7 {

	public static void main(String[] args) {
		Employees e1 = new Employees();
		Employees e2 = new Employees("Riya");

	}

}
