package com.kodewala.control.flow.practice17;

public class MarksProcessor {
	public void marksProcessing(Student students[]) {
		double sum = 0 ;
		for(Student student:students)
		{
			if(student.getMarks() > 100 || student.getMarks() < 0)
				continue;
			else
				sum = sum + student.getMarks();
		}
		System.out.println(sum / 3 );
	}
}
