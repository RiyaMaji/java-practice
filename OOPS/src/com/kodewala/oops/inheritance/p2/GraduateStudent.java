package com.kodewala.oops.inheritance.p2;

public class GraduateStudent extends Student {
	private String reasearchTopic;

	public GraduateStudent(String name, int rollNumber, String reasearchTopic) {
		super(name, rollNumber);
		this.reasearchTopic = reasearchTopic;
	}

	public void displayGraduationDetails() {
		studentDetails();
		System.out.println("Research Topic :" + reasearchTopic);
	}

}
