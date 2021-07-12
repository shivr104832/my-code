package com.training;

public class StudentService {
	
	public String assignGrade(double marks)
	{
		String grade=null;
		if(marks<60)
		{
			grade="A";
		}
		else if(marks>=60 && marks<=85)
		{
			grade="O";
		}
		else
		{
			grade="A+";
		}
		return grade;
	}

}
