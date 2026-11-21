package com.kodewala.control.flow.practice17;

public class Driver {

	public static void main(String[] args) {
		
		Student st1 = new Student(20);
		Student st2 = new Student(0);
		Student st3 = new Student(-5);
		
		Student studentArray[] = {st1,st2,st3};
		MarksProcessor marks = new MarksProcessor();
		marks.marksProcessing(studentArray);
	}

}
