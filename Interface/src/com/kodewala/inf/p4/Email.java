package com.kodewala.inf.p4;

public class Email implements INotification {

	@Override
	public void sendNotification() {
		System.out.println("Email.sendNotification()");
	}

}
