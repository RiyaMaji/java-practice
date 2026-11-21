package com.kodewala.exception;

public class SalaryProcessing {

	public static void main(String[] args) {
		int monthlySalary = 50000;
		int workingDays = 0;
		String employeeName = "Rahul";
		try {
			System.out.println("Length og=f emp name : " + employeeName.length());
			int dailySalary = monthlySalary/workingDays;
			System.out.println(dailySalary);
		}catch(NullPointerException e) {
			System.err.println("Employee name is null");
			e.printStackTrace();
		}catch(ArithmeticException e) {
			System.err.println("Working days cannot be zero");
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Salary Processing Completed..");
	}

}
