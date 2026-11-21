package com.whatsapp.message;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Driver {

	public static void main(String[] args) throws Exception 
	{
		
		FileInputStream fis = new FileInputStream("C:\\Users\\riyam\\OneDrive\\Docs\\Kodewala Academy\\AugBatch\\Workspace\\Serialization\\message.ser\\");
		
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Message message = (Message) ois.readObject();
		
		//System.out.println(message.getMessage());
		System.out.println( "De Ser : "+ message.getMessage() +" and user id "+ message.getUserId());
		ois.close();
	}

}
