package com.kodewala.oops.inheritance.ml.cw1;

public class Device {
	private String brand;
	public Device(String _brand) {
		this.brand =_brand;
	}
	public void displayDevice() {
		System.out.println(brand);
	}
}
