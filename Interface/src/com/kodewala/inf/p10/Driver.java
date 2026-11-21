package com.kodewala.inf.p10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Driver {

	public static void main(String[] args) throws Exception, IOException {
		Employee emp = new Employee(1, "Riya", 60000);
		
		
		//Serialization
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("employee.txt"));
		out.writeObject(emp);
		out.close();
		System.out.println("Object Serialized");
		
		 // De-serialization

        ObjectInputStream in = new ObjectInputStream(new FileInputStream("employee.txt"));
        Employee empRetrieval = (Employee) in.readObject();
		in.close();
		System.out.println(empRetrieval.geteName());
	}

}
