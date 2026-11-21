package com.kodewala.inf.p9;

public class Driver {

	public static void main(String[] args) {
		IEmployeeFilter employeefilter = employee -> {
			if(employee.geteSalary() > 50000 || employee.geteDept().equalsIgnoreCase("IT") || employee.geteYOE() > 3)
				return true;
			else
				return false;
		};
		Employee emp = new Employee("Jatin",60000 ,"it",2);
		if(employeefilter.filter(emp))
				System.out.println(emp.geteName());
	}

}
