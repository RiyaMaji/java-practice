package com.kodewala.inf.p4;

public interface INotification {
	void sendNotification();
	default void notificationStatus() {
		System.out.println("INotification.notificationStatus()");
	}
}
