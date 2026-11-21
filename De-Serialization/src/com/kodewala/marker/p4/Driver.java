package com.kodewala.marker.p4;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Driver {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("Payment.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Payment clonedPayment = (Payment)ois.readObject();
		ois.close();
		System.out.println(clonedPayment.paymentDetails.getPaymentMode());

	}

}
