package com.kodewala.inf5;

public class DataCleaner {
	public void clean(Object obj) //implicit up-casting
	{
		if (obj instanceof Cleanable)
			System.out.println("Allowed to perform data cleaning!!!");
		else
			System.err.println("Not Allowed to perform Data Cleaning!! ");
	}
}
