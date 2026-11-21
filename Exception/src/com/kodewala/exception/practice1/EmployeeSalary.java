package com.kodewala.exception.practice1;

public class EmployeeSalary {

	public static void main(String[] args) {
		
		Employee emp = new Employee("Riya M",100000,31);
		try {
			double dailyWage = emp.getMonthlySalary() / emp.getNumberOfWorkingDays();
			System.out.println("Name length : " + emp.getEmployeename().length());
			System.out.println("Daily wage of " + emp.getEmployeename() + " is " + dailyWage);
		} catch (NullPointerException e) {
			System.err.println("Name cannot be null..");
			e.printStackTrace();
		}catch (ArithmeticException e) {
			System.err.println("Invalid number of working days.. ");
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Employee Salary Processing Completed...");
	}

}
