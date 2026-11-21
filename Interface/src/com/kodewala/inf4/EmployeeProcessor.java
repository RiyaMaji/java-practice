package com.kodewala.inf4;

public class EmployeeProcessor implements IEmployee,IPerson{

	@Override
	public void display() {
		System.out.println("EmployeeProcessor.display()");
		
	}

	@Override
	public void doSomething() {
		// TODO Auto-generated method stub
		IEmployee.super.doSomething();
	}
}
