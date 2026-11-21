package com.tcs.emp;

public class Employee implements Cloneable{ //Level 1
	String name; // copy
	String empCode; // copy
	Address address; // HAS-A // copy only reference not object.

	public Employee(String name, String empCode, Address address) {
		super();
		this.name = name;
		this.empCode = empCode;
		this.address = address;
	}
/*	Shallow Copy
 * @Override
 *	public Object clone() throws CloneNotSupportedException {
 *		return super.clone();
 *	}
*/
	//Deep copy
	@Override
	public Object clone() throws CloneNotSupportedException {
		Employee e =(Employee) super.clone();
		e.address = (Address) address.clone(); //we set the address explicitly
      return e; 
	}
	
//	@Override
//	public boolean equals(Object obj) {
//		if(this == obj)
//			return true;
//		if(obj == null || obj.getClass() != getClass())
//			return false;
//		Employee emp = (Employee)obj;
//		return this.empCode == emp.empCode;
//	}
}
