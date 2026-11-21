package com.kodewala.sb.query;

public class Driver {

	public static void main(String[] args) {
		QueryGenerator generator = new QueryGenerator();
		StringBuilder result = generator.generateQuery(120000, null);
		System.out.println(result);
		StringBuilder result1 = generator.generateQuery(0,"KW789");
		System.out.println(result1);
		StringBuilder result2 = generator.generateQuery(0, null);
		System.out.println(result2);
	}

}
