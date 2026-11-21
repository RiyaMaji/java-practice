package com.kodewala.exception.practice6;

public class DeliveryAreaNotInServiceException extends OrderException {

	private static final long serialVersionUID = 1L;

	public DeliveryAreaNotInServiceException(String msg, String errorCode) {
		super(msg, errorCode);
	}
}
