package com.kodewala.marker.p4;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Driver {

	public static void main(String[] args) throws Exception {
		PaymentDetails paymentDetails = new PaymentDetails("UPI", "Bandhan Bank");
		Payment payment = new Payment(45123785, 452, paymentDetails );
		FileOutputStream fos = new FileOutputStream("Payment.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(payment);
		oos.close();
		System.out.println("Payment Serialised!!!");

	}

}
