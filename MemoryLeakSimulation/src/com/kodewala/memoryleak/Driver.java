package com.kodewala.memoryleak;

import java.util.ArrayList;

class Employee{
	private int id;

	public Employee(int id) {
		super();
		this.id = id;
	}

	public int getId() {
		return id;
	}
}
public class Driver {
	static ArrayList<Employee> employeeList = new ArrayList<>();
	public static void main(String[] args) {
		for (int i = 1; i <= 100000; i++) {
			Employee e = new Employee(i);
			employeeList.add(e);
		}
		System.out.println(employeeList.size());
		employeeList.clear();
		//list always retains references to Employee objects.
	}

}
