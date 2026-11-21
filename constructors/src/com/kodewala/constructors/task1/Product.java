package com.kodewala.constructors.task1;

public class Product 
{
	String productName;
	double price;
	String productDescription;
	int quantity;
	Product()
	{
		System.err.println("No attributes ");
	}
	Product(String _productName ,String _productDescription){
		this.productName = _productName;
		this.productDescription = _productDescription;
	}
	Product(String _productName ,double _price,String _productDescription,int _quantity){
		this.productName = _productName;
		this.price = _price;
		this.productDescription = _productDescription;
		this.quantity = _quantity;
	}
}
