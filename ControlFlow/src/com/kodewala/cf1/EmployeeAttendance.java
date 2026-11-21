package com.kodewala.cf1;

import java.util.Scanner;

public class EmployeeAttendance {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int invalidCount = 0;
		int totalAttendance = 0;

		for (int i = 1; i <= 10; i++) {
			System.out.println("Enter attendance for employee" + i + " : ");
			int attendance = sc.nextInt();
			if (attendance < 0 || attendance > 31) {
				System.err.println("Invalid attendance");
				invalidCount++;
				continue;
			}
			totalAttendance++;
		}
		System.out.println("Total Attendance: " + totalAttendance);
		System.out.println("Invalid Entries: " + invalidCount);
		sc.close();
	}
}
