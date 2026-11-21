package com.kodewala.oops.inheritance4;

public class Customer {

	private PaymentService paymentService;
	private InvoiceService invoiceService;

	void makePayment() {
		if (paymentService == null) {
			paymentService = new PaymentService();
		}

		paymentService.pay();
	}

	void generateInvoice() {
		if (invoiceService == null) {
			invoiceService = new InvoiceService();
		}

		invoiceService.generateInvoice();
	}
}
