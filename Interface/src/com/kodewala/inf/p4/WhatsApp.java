package com.kodewala.inf.p4;

public class WhatsApp implements INotification {

	@Override
	public void sendNotification() {
		System.out.println("WhatsApp.sendNotification()");
	}
	@Override
	public void notificationStatus()  {
		System.out.println("WhatsApp.notificationStatus()");
	}

}
