package com.kodewala.constructors6;

public class Driver {

	public static void main(String[] args) {
		ElectronicProduct electronicProduct = new ElectronicProduct("Iphone", 180000, "PC001", 3);

		System.out.println(electronicProduct.name);
		System.out.println(electronicProduct.price);
		System.out.println(electronicProduct.productId);
		System.out.println(electronicProduct.warranty);
		
		ElectronicProduct electronicProduct1 = new ElectronicProduct();

		System.out.println(electronicProduct1.name);
		System.out.println(electronicProduct1.price);
		System.out.println(electronicProduct1.productId);
		System.out.println(electronicProduct1.warranty);

	}

}
