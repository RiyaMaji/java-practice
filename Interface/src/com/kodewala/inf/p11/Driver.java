package com.kodewala.inf.p11;

public class Driver {

	public static void main(String[] args) throws CloneNotSupportedException {
		Employee emp = new Employee(1,"Diya");
		Employee clonedEmployee = (Employee)emp.clone();
		System.out.println(emp);
		System.out.println(clonedEmployee);
		System.out.println(clonedEmployee.getName());
	}

}
