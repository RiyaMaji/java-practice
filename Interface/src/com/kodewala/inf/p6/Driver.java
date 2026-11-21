package com.kodewala.inf.p6;

public class Driver {

	public static void main(String[] args) {
		CustomerNotification notification = new CustomerNotification();
		notification.sendEmail();
		notification.sendSMS();
	}

}
