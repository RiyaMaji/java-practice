package com.whatsapp.message;

import java.io.IOException;

public class Driver {

	public static void main(String[] args) throws IOException {
		
		
		MessageSerialization messageSerialization = new MessageSerialization();
		Message message = new Message("M123", "Hello", "UId1");
		messageSerialization.serializeMsg(message);
		System.out.println("Object Serialized!!");
	}

}
