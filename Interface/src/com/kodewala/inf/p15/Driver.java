package com.kodewala.inf.p15;

public class Driver {

	public static void main(String[] args) {
		
		INotification notification = new EmailNotification();
		notification.sendNotification();
		notification.notificationStatus();
		INotification.validateRecipient();
		System.out.println("-----------");
		notification = new SMSNotification();
		notification.sendNotification();
		notification.notificationStatus();
		INotification.validateRecipient();
		System.out.println("-----------");
		notification = new WhatsAppNotification();
		notification.sendNotification();
		notification.notificationStatus();
		INotification.validateRecipient();

	}

}
