package com.kodewala.oops.inheritance.ml.cw1;

public class Mobile extends Device{
	private String model;

	public Mobile(String _brand, String _model) {
		super(_brand);
		this.model = _model;
	}
	public void displayModel() {
		displayDevice();
		System.out.println(model);
	}
	

}
