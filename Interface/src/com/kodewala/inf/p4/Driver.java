package com.kodewala.inf.p4;

public class Driver {

	public static void main(String[] args) {
		INotification notification = new Email();
		notification.sendNotification();
		notification.notificationStatus();
		
		notification = new WhatsApp();
		notification.sendNotification();
		notification.notificationStatus();
	}

}
