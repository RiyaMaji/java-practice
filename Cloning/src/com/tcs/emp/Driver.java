package com.tcs.emp;

public class Driver {
	Address address;
	Employee emp1;
	Employee clonedEmployee;

	public void doSomething() throws Exception {
		address = new Address("16th", "27th", "Bangalore");
		emp1 = new Employee("Riya", "KI123", address);

		clonedEmployee = (Employee) emp1.clone(); // this will give shallow copy

		System.out.println(clonedEmployee.name);
		System.out.println(clonedEmployee.empCode);

		emp1.address.city = "Hyd";

		System.out.println(emp1.address.city);
		System.out.println(clonedEmployee.address.city);

		System.out.println(clonedEmployee.equals(emp1));
		
		emp1 = null ; //can be removed by gc
		address = null;
		
		// more 500 lines but emp,address we are not using there 
		
		
	}

	public static void main(String[] args) throws Exception {
		Driver d = new Driver();
		d.doSomething();
	}

}
