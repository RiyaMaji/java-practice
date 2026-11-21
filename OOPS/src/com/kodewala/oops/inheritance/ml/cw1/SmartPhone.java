package com.kodewala.oops.inheritance.ml.cw1;

public class SmartPhone extends Mobile{
	private String OS;

	public SmartPhone(String _brand, String _model, String _oS) {
		super(_brand, _model);
		this.OS = _oS;
	}
	public void display() {
		displayModel();
		System.out.println(OS);
	}
}
