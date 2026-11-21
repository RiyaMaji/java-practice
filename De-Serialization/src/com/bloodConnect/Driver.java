package com.bloodConnect;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Driver {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("Employeed.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Employee clonedEmployee = (Employee)ois.readObject();
		ois.close();
		clonedEmployee.display();
	}

}
