package com.kodewala.constructors2;

public class NotificationService {
	public void sendNotification(String _type) {
		System.out.println("NotificationService.sendNotification()");
		if(_type.equalsIgnoreCase("sms")) {
			sendSMS();
		}
		else if(_type.equalsIgnoreCase("email")) {
			sendEmail();
		}
		else {
			sendWhatsApp();
		}
	}
	
	private void sendSMS() {
		System.out.println("NotificationService.sendSMS() Start");
		//biz logic
		System.out.println("NotificationService.sendSMS() End");
	}
	
	private void sendEmail() {
		System.out.println("NotificationService.sendEmail() Start");
		//Biz logic
		System.out.println("NotificationService.sendEmail() End");
	}
	
	private void sendWhatsApp() {
		System.out.println("NotificationService.sendWhatsApp() Start");
		//Biz logic
		System.out.println("NotificationService.sendWhatsApp() End");
	}
}
