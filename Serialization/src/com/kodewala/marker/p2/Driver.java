package com.kodewala.marker.p2;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Driver {

	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("EmployeeDetails.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		Employee emp = new Employee(12, "Jiya", 45000, "sa12df");
		oos.writeObject(emp);
		oos.close();
		System.out.println("Object Serialized!!");
	}

}
