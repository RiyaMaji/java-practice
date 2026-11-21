package com.kodewala.control.flow.practice2;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		BonusCalculator bonusCalc = new BonusCalculator();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter the YOE : ");
		int yoe = sc.nextInt();
		
		System.out.println("Please enter current Salary :: ");
		double salary = sc.nextDouble();
		
		double bonus = bonusCalc.calculateBonus(salary,yoe);
		System.out.println("Updated Salary :: " + (salary+bonus));
	}

}
