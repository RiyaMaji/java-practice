package com.kodewala.marker.p1;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Driver {

	public static void main(String[] args) throws Exception {
		BankAccount account = new BankAccount("HDFC10098786723", "Riya", 200000);
		FileOutputStream fos = new FileOutputStream("AccountDetails.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(account);
		oos.close();
		System.out.println("Object Serialized!!");
	}

}
