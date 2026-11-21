package com.kodewala.exception;

public class Student {

	public static void main(String[] args) {
		System.out.println("Student.main()..Start");
		try {
			String name = args[0];
			double marks =Double.parseDouble(args[1]) ;
			System.out.println("Student Name : " + name);
			System.out.println("Student Marks : " + marks);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Please provide student name and marks");
			e.printStackTrace();
		}catch (NumberFormatException e) {
			System.err.println("Marks should be numeric value");
			e.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Student.main()..END");
	}

}
