package com.kodewala.constructors.practice;
/**
 * Create E-com Product with price : Laptop 75000
 */
class Product{
	Product(){
		this("Unknown Product",0);
	}
	Product(String productName){
		this(productName,0);
	}
	Product(String productName,double productPrice){
		System.out.println("Product Name : " + productName + " and Product Price : "+ productPrice);
	}
}
public class Driver6 {

	public static void main(String[] args) {
		Product p1 = new Product("Laptop",75000);
	}

}
