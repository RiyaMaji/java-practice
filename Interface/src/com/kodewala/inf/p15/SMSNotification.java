package com.kodewala.inf.p15;

public class SMSNotification implements INotification {

	@Override
	public void sendNotification() {
		INotificationValidator notificationValidator = message -> 
		{
			if(message == null)
				return false;
			return true;
		};
		System.out.println(notificationValidator.validate("Hello"));
		System.out.println("SMSNotification.sendNotification()");

	}

}
