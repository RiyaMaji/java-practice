package com.kodewala.marker.p6;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Driver {

	public static void main(String[] args) throws Exception {
		Employee emp = new Employee(45,"Simran",45000);
		FileOutputStream fos = new FileOutputStream("Emp.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(emp);
		System.out.println("Emp serialized!!");
		oos.close();
	}

}
