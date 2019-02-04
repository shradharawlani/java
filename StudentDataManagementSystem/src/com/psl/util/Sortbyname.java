package com.psl.util;

import java.util.Comparator;

import com.psl.beans.Student;

public class Sortbyname implements Comparator<Student> {
   
	@Override
	public int compare(Student o1, Student o2) {
	
		if(o1.getStudentName().compareTo(o2.getStudentName()) == 0)
		{
			if(o1.getAge() == o2.getAge())
			{
				return (o1.getRollno() - o2.getRollno());
			}
			else return (o1.getAge() - o2.getAge());
		}
		else
			return o1.getStudentName().compareTo(o2.getStudentName());
	}

}
