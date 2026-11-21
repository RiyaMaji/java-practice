package com.kodewala.inf.p4;

public class SMS implements INotification {

	@Override
	public void sendNotification() {
		System.out.println("SMS.sendNotification()");
	}

}
