package com.kodewala.marker.p6;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Driver {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("Emp.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Employee serializedEmp= (Employee)ois.readObject();
		ois.close();
		System.out.println(serializedEmp.getEmployeeId());
		System.out.println(serializedEmp.getEmployeeName());
		System.out.println(serializedEmp.getSalary());

	}

}
