package com.psl.util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

import com.psl.beans.Address;
import com.psl.beans.Student;
import com.psl.exceptions.InsufficientDataException;

//Override all the methods of the DataManager Interface
public class StudentDataManager implements DataManager {

	@Override
	public List<Student> populateData(String fileName) {
		// TODO Auto-generated method stub
		List<Student> student=new ArrayList<Student>();
		List<Address> adds=new ArrayList<Address>();
		try(BufferedReader br=new BufferedReader(new FileReader(fileName)))
		{
			
			String row;
			while((row=br.readLine())!=null)
			{
				int rollno,age;
				String studentName,streetName,city,zipCode;
				String s[]=row.split(",");
				if(s[0].equals(""))
					 rollno=0;
				else
				  rollno=Integer.parseInt(s[0]);
				if(s[1].equals(""))
					studentName=null;
				else
					studentName=s[1];
				if(s[2].equals(""))
					age=0;
				else
					age=Integer.parseInt(s[2]);
				if(s[3].equals(""))
					streetName=null;
				else
					streetName=s[3];
				if(s[4].equals(""))
					city=null;
				else
					city=s[4];
				if(s[5].equals(""))
					zipCode=null;
				else
					zipCode=s[5];
				
				Address a=new Address(streetName,city,zipCode);
				student.add(new Student(rollno,studentName,age,a ));
				
				
				
				
			}

		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		return student;
	}
	@Override
	public void validateData(List<Student> studentList)
			throws InsufficientDataException {
		for(Student s:studentList)
		{
			if(s.getRollno()==0||s.getStudentName().equals("")||s.getAge()==0||s.getAddress().equals(""))
			{
				throw new InsufficientDataException("data is missing");
			}
		}
		
	}

	@Override
	public void sortData(List<Student> studentList) {
		
		Student s=new Student();
		/*SortedSet<Student> d=new TreeSet<Student>(new Sortbyname());
			for(Student st:d)
			{
			System.out.println(st)
			}*/
			Sortbyname sr = new Sortbyname();
			Collections.sort(studentList,sr);

			
		
		
		
	}

	
}
