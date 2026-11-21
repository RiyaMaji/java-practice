package com.kodewala.oops.inheritance.p6;

public class Employee {
	ReportService reportService;
	public void generateReport() {
		System.out.println("Employee.generateReport() Start");
		reportService = new ReportService();
		System.out.println("Employee.generateReport()..End");
	}
}
