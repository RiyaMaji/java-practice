package com.kodewala.oops.polymorphism3.test;

class Person {
	String name;

	public Person(String name) {
		super();
		this.name = name;

	}
	@Override
	public boolean equals(Object obj) // Object obj = new Person("Riya");
	{
		Person person = (Person)obj;
		return person.name.equals(this.name);
		
	}
}

public class Driver {

	public static void main(String[] args) {
		Person person1 = new Person("Riya");
		Person person2 = new Person("Riya");
		System.out.println(person1.equals(person2));
	}

}
