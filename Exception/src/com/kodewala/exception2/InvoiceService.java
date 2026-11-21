package com.kodewala.exception2;

public class InvoiceService {
	public void generateInvoice() {
		// Get customers and order details from database
		// [Connect with database -- > create db connection] +
		// [get details from db]
		try {
			connectDatabase();
			String name = "Riya";
			name.lastIndexOf("a");
			System.out.println("Generating an invoice .... ");
			//closeDBConnection();
			System.exit(0);   //killing the JVM
		} catch (NullPointerException e) {
			e.printStackTrace();
		} finally {
			// mandatory executable block (Exception OR No Exception)
			System.out.println("I am inside finally block ... ");
			closeDBConnection();
		}
	}

	private void connectDatabase() {
		System.out.println("Connect to database");
	}

	private void closeDBConnection() {
		System.out.println("Closing DBConnection..");
	}
}
