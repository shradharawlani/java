package com.psl.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

//Override all the methods of the DataManager Interface
public class StudentDataManager implements DataManager {

	List<Student> populateData(String fileName)
	{
		List<Student> student=new ArrayList<Student>();
		List<Address> adds=new ArrayList<Address>()
		try(BufferedReader br=new BufferedReader(new FileReader(fileName)))
		{
			
			String row;
			while((row=br.readLine())!=null)
			{
				String s[]=row.split(",");
				private int rollno=Integer.parseInt(s[0]);
				private String studentName=s[1];
				private int age==Integer.parseInt(s[2]);
				
				private String streetName=s[3];
				private String city=s[4];
				private String zipCode=s[5];	
				
				student.add(new Student(roolno,studentName,age));
				adds.add(streetName,city,zipCode);
				
				
			}
	
			
			
		}
	}

	  //Validate the Student data :Remove invalid/insufficient Student data from the list and throw InsufficientDataException   
	  void validateData(List<Student> studentList) throws InsufficientDataException;
	  
	  //Sort the valid list of Student data using Comparable 
	  void sortData(List<Student> studentList);
	  
}
