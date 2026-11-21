package com.kodewala.inf.p7;

public class Driver {

	public static void main(String[] args) {
		IBonusCalculator manager = salary -> salary * 0.20;
		IBonusCalculator developer = salary -> salary * 0.15;
		IBonusCalculator tester = salary -> salary * 0.10;
		
		System.out.println(manager.calculateBonus(100000));
		System.out.println(developer.calculateBonus(80000));
		System.out.println(tester.calculateBonus(60000));
	}

}
