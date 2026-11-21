package com.kodewala.oops.ecom;

public class ElectronicProduct extends Product {
	private boolean isWarranty;
	private int warrantyInYears;

	/*public ElectronicProduct(String productName, String description, int quantity, String status) {
		this(productName, description, quantity, status, false, 0);
	}
	*/
	public ElectronicProduct(String productName, String description, int quantity, String status, boolean isWarranty,
			int warrantyInYears) {
		super(productName, description, quantity, status);
		this.isWarranty = isWarranty;
		this.warrantyInYears = warrantyInYears;
	}

	public boolean isWarranty() {
		return isWarranty;
	}

	public void setWarranty(boolean isWarranty) {
		this.isWarranty = isWarranty;
	}

	public int getWarrantyInYears() {
		return warrantyInYears;
	}

	public void setWarrantyInYears(int warrantyInYears) {
		this.warrantyInYears = warrantyInYears;
	}

	public void viewElectronicProductDetails() {

		System.out.println("Electronic Product Details : ");
		viewProductDetails();
		System.out.println("Warranty Check : " + isWarranty);
		System.out.println("Warranty for " + warrantyInYears + " years");

	}
}
