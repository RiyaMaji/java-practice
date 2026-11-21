package com.kodewala.marker.p1;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Driver {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("AccountDetails.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		BankAccount account = (BankAccount)ois.readObject();
		ois.close();
		System.out.println(account.getAccountNumber());
		System.out.println(account.getAccountHolderName());
		System.out.println(account.getBalance());
		

	}

}
