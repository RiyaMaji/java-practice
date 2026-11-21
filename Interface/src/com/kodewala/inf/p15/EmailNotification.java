package com.kodewala.inf.p15;

public class EmailNotification implements INotification {

	@Override
	public void sendNotification() {
		System.out.println("EmailNotification.sendNotification()");
	}

}
