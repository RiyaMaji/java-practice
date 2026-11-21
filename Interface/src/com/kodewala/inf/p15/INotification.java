package com.kodewala.inf.p15;

public interface INotification {
	void sendNotification();
	default void notificationStatus() {
		logNotification();
		System.out.println("Notification.notificationStatus()");
	}
	static void validateRecipient() {
		logNotification();
		System.out.println("Notification.validateRecipient()");
	}
	private static void logNotification() {
		System.out.println("Notification.logNotification()");
	}
}
