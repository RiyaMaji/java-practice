package com.kodewala.marker.p2;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Driver {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("EmployeeDetails.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Employee desEmp = (Employee)ois.readObject();
		ois.close();
		System.out.println(desEmp.getEmployeeId());
		System.out.println(desEmp.getEmployeeName());
	}

}
