package com.kodewala.inf.p6;

public interface IMessageService {
	default void sendEmail() {
		System.out.println("IMessageService.sendEmail()");
		validateMessage();
	}
	default void sendSMS() {
		validateMessage();
		System.out.println("IMessageService.sendSMS()");
	}
	private void validateMessage() {
		System.out.println("IMessageService.validateMessage()");
	}
}
