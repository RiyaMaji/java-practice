package com.kodewala.fileTransfer;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Driver {

	public static void main(String[] args) throws Exception {

		FileInputStream fis = new FileInputStream("Perm.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		AdminFile publicFile = (AdminFile)ois.readObject();
		ois.close();
		System.out.println(publicFile.getFileName());
	}

}
